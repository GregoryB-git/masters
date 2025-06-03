package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.DefaultExtractorInput;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

final class ExtractorMediaPeriod
  implements MediaPeriod, ExtractorOutput, Loader.Callback<ExtractingLoadable>, Loader.ReleaseCallback, SampleQueue.UpstreamFormatChangedListener
{
  private static final long DEFAULT_LAST_SAMPLE_DURATION_US = 10000L;
  private final Allocator allocator;
  @Nullable
  private MediaPeriod.Callback callback;
  private final long continueLoadingCheckIntervalBytes;
  @Nullable
  private final String customCacheKey;
  private final DataSource dataSource;
  private int dataType;
  private long durationUs;
  private int enabledTrackCount;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private int extractedSamplesCountAtStartOfLoad;
  private final ExtractorHolder extractorHolder;
  private final Handler handler;
  private boolean haveAudioVideoTracks;
  private long lastSeekPositionUs;
  private long length;
  private final Listener listener;
  private final ConditionVariable loadCondition;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private final Loader loader;
  private boolean loadingFinished;
  private final Runnable maybeFinishPrepareRunnable;
  private boolean notifiedReadingStarted;
  private boolean notifyDiscontinuity;
  private final Runnable onContinueLoadingRequestedRunnable;
  private boolean pendingDeferredRetry;
  private long pendingResetPositionUs;
  private boolean prepared;
  @Nullable
  private PreparedState preparedState;
  private boolean released;
  private int[] sampleQueueTrackIds;
  private SampleQueue[] sampleQueues;
  private boolean sampleQueuesBuilt;
  @Nullable
  private SeekMap seekMap;
  private boolean seenFirstTrackSelection;
  private final Uri uri;
  
  public ExtractorMediaPeriod(Uri paramUri, DataSource paramDataSource, Extractor[] paramArrayOfExtractor, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher, Listener paramListener, Allocator paramAllocator, @Nullable String paramString, int paramInt)
  {
    uri = paramUri;
    dataSource = paramDataSource;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    listener = paramListener;
    allocator = paramAllocator;
    customCacheKey = paramString;
    continueLoadingCheckIntervalBytes = paramInt;
    loader = new Loader("Loader:ExtractorMediaPeriod");
    extractorHolder = new ExtractorHolder(paramArrayOfExtractor);
    loadCondition = new ConditionVariable();
    maybeFinishPrepareRunnable = new a(this, 0);
    onContinueLoadingRequestedRunnable = new a(this, 1);
    handler = new Handler();
    sampleQueueTrackIds = new int[0];
    sampleQueues = new SampleQueue[0];
    pendingResetPositionUs = -9223372036854775807L;
    length = -1L;
    durationUs = -9223372036854775807L;
    dataType = 1;
    paramEventDispatcher.mediaPeriodCreated();
  }
  
  private boolean configureRetry(ExtractingLoadable paramExtractingLoadable, int paramInt)
  {
    if (length == -1L)
    {
      Object localObject = seekMap;
      if ((localObject == null) || (((SeekMap)localObject).getDurationUs() == -9223372036854775807L))
      {
        boolean bool = prepared;
        paramInt = 0;
        if ((bool) && (!suppressRead()))
        {
          pendingDeferredRetry = true;
          return false;
        }
        notifyDiscontinuity = prepared;
        lastSeekPositionUs = 0L;
        extractedSamplesCountAtStartOfLoad = 0;
        localObject = sampleQueues;
        int i = localObject.length;
        while (paramInt < i)
        {
          localObject[paramInt].reset();
          paramInt++;
        }
        ExtractingLoadable.access$500(paramExtractingLoadable, 0L, 0L);
        return true;
      }
    }
    extractedSamplesCountAtStartOfLoad = paramInt;
    return true;
  }
  
  private void copyLengthFromLoader(ExtractingLoadable paramExtractingLoadable)
  {
    if (length == -1L) {
      length = ExtractingLoadable.access$400(paramExtractingLoadable);
    }
  }
  
  private int getExtractedSamplesCount()
  {
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int i = arrayOfSampleQueue.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfSampleQueue[j].getWriteIndex();
      j++;
    }
    return k;
  }
  
  private long getLargestQueuedTimestampUs()
  {
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int i = arrayOfSampleQueue.length;
    long l = Long.MIN_VALUE;
    for (int j = 0; j < i; j++) {
      l = Math.max(l, arrayOfSampleQueue[j].getLargestQueuedTimestampUs());
    }
    return l;
  }
  
  private PreparedState getPreparedState()
  {
    return (PreparedState)Assertions.checkNotNull(preparedState);
  }
  
  private boolean isPendingReset()
  {
    boolean bool;
    if (pendingResetPositionUs != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void maybeFinishPrepare()
  {
    SeekMap localSeekMap = seekMap;
    if ((!released) && (!prepared) && (sampleQueuesBuilt) && (localSeekMap != null))
    {
      Object localObject1 = sampleQueues;
      int i = localObject1.length;
      for (int j = 0; j < i; j++) {
        if (localObject1[j].getUpstreamFormat() == null) {
          return;
        }
      }
      loadCondition.close();
      i = sampleQueues.length;
      TrackGroup[] arrayOfTrackGroup = new TrackGroup[i];
      localObject1 = new boolean[i];
      durationUs = localSeekMap.getDurationUs();
      for (j = 0;; j++)
      {
        int k = 1;
        if (j >= i) {
          break;
        }
        Object localObject2 = sampleQueues[j].getUpstreamFormat();
        arrayOfTrackGroup[j] = new TrackGroup(new Format[] { localObject2 });
        localObject2 = sampleMimeType;
        int m = k;
        if (!MimeTypes.isVideo((String)localObject2)) {
          if (MimeTypes.isAudio((String)localObject2)) {
            m = k;
          } else {
            m = 0;
          }
        }
        localObject1[j] = m;
        haveAudioVideoTracks = (m | haveAudioVideoTracks);
      }
      if ((length == -1L) && (localSeekMap.getDurationUs() == -9223372036854775807L)) {
        j = 7;
      } else {
        j = 1;
      }
      dataType = j;
      preparedState = new PreparedState(localSeekMap, new TrackGroupArray(arrayOfTrackGroup), (boolean[])localObject1);
      prepared = true;
      listener.onSourceInfoRefreshed(durationUs, localSeekMap.isSeekable());
      ((MediaPeriod.Callback)Assertions.checkNotNull(callback)).onPrepared(this);
    }
  }
  
  private void maybeNotifyDownstreamFormat(int paramInt)
  {
    Object localObject = getPreparedState();
    boolean[] arrayOfBoolean = trackNotifiedDownstreamFormats;
    if (arrayOfBoolean[paramInt] == 0)
    {
      localObject = tracks.get(paramInt).getFormat(0);
      eventDispatcher.downstreamFormatChanged(MimeTypes.getTrackType(sampleMimeType), (Format)localObject, 0, null, lastSeekPositionUs);
      arrayOfBoolean[paramInt] = true;
    }
  }
  
  private void maybeStartDeferredRetry(int paramInt)
  {
    Object localObject = getPreparedStatetrackIsAudioVideoFlags;
    if ((pendingDeferredRetry) && (localObject[paramInt] != 0) && (!sampleQueues[paramInt].hasNextSample()))
    {
      pendingResetPositionUs = 0L;
      paramInt = 0;
      pendingDeferredRetry = false;
      notifyDiscontinuity = true;
      lastSeekPositionUs = 0L;
      extractedSamplesCountAtStartOfLoad = 0;
      localObject = sampleQueues;
      int i = localObject.length;
      while (paramInt < i)
      {
        localObject[paramInt].reset();
        paramInt++;
      }
      ((MediaPeriod.Callback)Assertions.checkNotNull(callback)).onContinueLoadingRequested(this);
    }
  }
  
  private boolean seekInsideBufferUs(boolean[] paramArrayOfBoolean, long paramLong)
  {
    int i = sampleQueues.length;
    for (int j = 0;; j++)
    {
      int k = 1;
      if (j >= i) {
        break;
      }
      SampleQueue localSampleQueue = sampleQueues[j];
      localSampleQueue.rewind();
      if (localSampleQueue.advanceTo(paramLong, true, false) == -1) {
        k = 0;
      }
      if ((k == 0) && ((paramArrayOfBoolean[j] != 0) || (!haveAudioVideoTracks))) {
        return false;
      }
    }
    return true;
  }
  
  private void startLoading()
  {
    ExtractingLoadable localExtractingLoadable = new ExtractingLoadable(uri, dataSource, extractorHolder, this, loadCondition);
    if (prepared)
    {
      SeekMap localSeekMap = getPreparedStateseekMap;
      Assertions.checkState(isPendingReset());
      l = durationUs;
      if ((l != -9223372036854775807L) && (pendingResetPositionUs >= l))
      {
        loadingFinished = true;
        pendingResetPositionUs = -9223372036854775807L;
        return;
      }
      ExtractingLoadable.access$500(localExtractingLoadable, getSeekPointspendingResetPositionUs).first.position, pendingResetPositionUs);
      pendingResetPositionUs = -9223372036854775807L;
    }
    extractedSamplesCountAtStartOfLoad = getExtractedSamplesCount();
    long l = loader.startLoading(localExtractingLoadable, this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(dataType));
    eventDispatcher.loadStarted(ExtractingLoadable.access$100(localExtractingLoadable), 1, -1, null, 0, null, ExtractingLoadable.access$300(localExtractingLoadable), durationUs, l);
  }
  
  private boolean suppressRead()
  {
    boolean bool;
    if ((!notifyDiscontinuity) && (!isPendingReset())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean continueLoading(long paramLong)
  {
    if ((!loadingFinished) && (!pendingDeferredRetry) && ((!prepared) || (enabledTrackCount != 0)))
    {
      boolean bool = loadCondition.open();
      if (!loader.isLoading())
      {
        startLoading();
        bool = true;
      }
      return bool;
    }
    return false;
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    if (isPendingReset()) {
      return;
    }
    boolean[] arrayOfBoolean = getPreparedStatetrackEnabledStates;
    int i = sampleQueues.length;
    for (int j = 0; j < i; j++) {
      sampleQueues[j].discardTo(paramLong, paramBoolean, arrayOfBoolean[j]);
    }
  }
  
  public void endTracks()
  {
    sampleQueuesBuilt = true;
    handler.post(maybeFinishPrepareRunnable);
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    Object localObject = getPreparedStateseekMap;
    if (!((SeekMap)localObject).isSeekable()) {
      return 0L;
    }
    localObject = ((SeekMap)localObject).getSeekPoints(paramLong);
    return Util.resolveSeekPositionUs(paramLong, paramSeekParameters, first.timeUs, second.timeUs);
  }
  
  public long getBufferedPositionUs()
  {
    boolean[] arrayOfBoolean = getPreparedStatetrackIsAudioVideoFlags;
    if (loadingFinished) {
      return Long.MIN_VALUE;
    }
    if (isPendingReset()) {
      return pendingResetPositionUs;
    }
    if (haveAudioVideoTracks)
    {
      l1 = Long.MAX_VALUE;
      int i = sampleQueues.length;
      int j = 0;
      for (;;)
      {
        l2 = l1;
        if (j >= i) {
          break;
        }
        l2 = l1;
        if (arrayOfBoolean[j] != 0) {
          l2 = Math.min(l1, sampleQueues[j].getLargestQueuedTimestampUs());
        }
        j++;
        l1 = l2;
      }
    }
    long l2 = getLargestQueuedTimestampUs();
    long l1 = l2;
    if (l2 == Long.MIN_VALUE) {
      l1 = lastSeekPositionUs;
    }
    return l1;
  }
  
  public long getNextLoadPositionUs()
  {
    long l;
    if (enabledTrackCount == 0) {
      l = Long.MIN_VALUE;
    } else {
      l = getBufferedPositionUs();
    }
    return l;
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return getPreparedStatetracks;
  }
  
  public boolean isReady(int paramInt)
  {
    boolean bool;
    if ((!suppressRead()) && ((loadingFinished) || (sampleQueues[paramInt].hasNextSample()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    loader.maybeThrowError(loadErrorHandlingPolicy.getMinimumLoadableRetryCount(dataType));
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    maybeThrowError();
  }
  
  public void onLoadCanceled(ExtractingLoadable paramExtractingLoadable, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    eventDispatcher.loadCanceled(ExtractingLoadable.access$100(paramExtractingLoadable), ExtractingLoadable.access$200(paramExtractingLoadable).getLastOpenedUri(), ExtractingLoadable.access$200(paramExtractingLoadable).getLastResponseHeaders(), 1, -1, null, 0, null, ExtractingLoadable.access$300(paramExtractingLoadable), durationUs, paramLong1, paramLong2, ExtractingLoadable.access$200(paramExtractingLoadable).getBytesRead());
    if (!paramBoolean)
    {
      copyLengthFromLoader(paramExtractingLoadable);
      paramExtractingLoadable = sampleQueues;
      int i = paramExtractingLoadable.length;
      for (int j = 0; j < i; j++) {
        paramExtractingLoadable[j].reset();
      }
      if (enabledTrackCount > 0) {
        ((MediaPeriod.Callback)Assertions.checkNotNull(callback)).onContinueLoadingRequested(this);
      }
    }
  }
  
  public void onLoadCompleted(ExtractingLoadable paramExtractingLoadable, long paramLong1, long paramLong2)
  {
    if (durationUs == -9223372036854775807L)
    {
      SeekMap localSeekMap = (SeekMap)Assertions.checkNotNull(seekMap);
      long l = getLargestQueuedTimestampUs();
      if (l == Long.MIN_VALUE) {
        l = 0L;
      } else {
        l += 10000L;
      }
      durationUs = l;
      listener.onSourceInfoRefreshed(l, localSeekMap.isSeekable());
    }
    eventDispatcher.loadCompleted(ExtractingLoadable.access$100(paramExtractingLoadable), ExtractingLoadable.access$200(paramExtractingLoadable).getLastOpenedUri(), ExtractingLoadable.access$200(paramExtractingLoadable).getLastResponseHeaders(), 1, -1, null, 0, null, ExtractingLoadable.access$300(paramExtractingLoadable), durationUs, paramLong1, paramLong2, ExtractingLoadable.access$200(paramExtractingLoadable).getBytesRead());
    copyLengthFromLoader(paramExtractingLoadable);
    loadingFinished = true;
    ((MediaPeriod.Callback)Assertions.checkNotNull(callback)).onContinueLoadingRequested(this);
  }
  
  public Loader.LoadErrorAction onLoadError(ExtractingLoadable paramExtractingLoadable, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    copyLengthFromLoader(paramExtractingLoadable);
    long l = loadErrorHandlingPolicy.getRetryDelayMsFor(dataType, durationUs, paramIOException, paramInt);
    Loader.LoadErrorAction localLoadErrorAction;
    if (l == -9223372036854775807L)
    {
      localLoadErrorAction = Loader.DONT_RETRY_FATAL;
    }
    else
    {
      paramInt = getExtractedSamplesCount();
      boolean bool;
      if (paramInt > extractedSamplesCountAtStartOfLoad) {
        bool = true;
      } else {
        bool = false;
      }
      if (configureRetry(paramExtractingLoadable, paramInt)) {
        localLoadErrorAction = Loader.createRetryAction(bool, l);
      } else {
        localLoadErrorAction = Loader.DONT_RETRY;
      }
    }
    eventDispatcher.loadError(ExtractingLoadable.access$100(paramExtractingLoadable), ExtractingLoadable.access$200(paramExtractingLoadable).getLastOpenedUri(), ExtractingLoadable.access$200(paramExtractingLoadable).getLastResponseHeaders(), 1, -1, null, 0, null, ExtractingLoadable.access$300(paramExtractingLoadable), durationUs, paramLong1, paramLong2, ExtractingLoadable.access$200(paramExtractingLoadable).getBytesRead(), paramIOException, localLoadErrorAction.isRetry() ^ true);
    return localLoadErrorAction;
  }
  
  public void onLoaderReleased()
  {
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int i = arrayOfSampleQueue.length;
    for (int j = 0; j < i; j++) {
      arrayOfSampleQueue[j].reset();
    }
    extractorHolder.release();
  }
  
  public void onUpstreamFormatChanged(Format paramFormat)
  {
    handler.post(maybeFinishPrepareRunnable);
  }
  
  public void prepare(MediaPeriod.Callback paramCallback, long paramLong)
  {
    callback = paramCallback;
    loadCondition.open();
    startLoading();
  }
  
  public int readData(int paramInt, FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    if (suppressRead()) {
      return -3;
    }
    maybeNotifyDownstreamFormat(paramInt);
    int i = sampleQueues[paramInt].read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean, loadingFinished, lastSeekPositionUs);
    if (i == -3) {
      maybeStartDeferredRetry(paramInt);
    }
    return i;
  }
  
  public long readDiscontinuity()
  {
    if (!notifiedReadingStarted)
    {
      eventDispatcher.readingStarted();
      notifiedReadingStarted = true;
    }
    if ((notifyDiscontinuity) && ((loadingFinished) || (getExtractedSamplesCount() > extractedSamplesCountAtStartOfLoad)))
    {
      notifyDiscontinuity = false;
      return lastSeekPositionUs;
    }
    return -9223372036854775807L;
  }
  
  public void reevaluateBuffer(long paramLong) {}
  
  public void release()
  {
    if (prepared)
    {
      SampleQueue[] arrayOfSampleQueue = sampleQueues;
      int i = arrayOfSampleQueue.length;
      for (int j = 0; j < i; j++) {
        arrayOfSampleQueue[j].discardToEnd();
      }
    }
    loader.release(this);
    handler.removeCallbacksAndMessages(null);
    callback = null;
    released = true;
    eventDispatcher.mediaPeriodReleased();
  }
  
  public void seekMap(SeekMap paramSeekMap)
  {
    seekMap = paramSeekMap;
    handler.post(maybeFinishPrepareRunnable);
  }
  
  public long seekToUs(long paramLong)
  {
    Object localObject1 = getPreparedState();
    Object localObject2 = seekMap;
    localObject1 = trackIsAudioVideoFlags;
    if (!((SeekMap)localObject2).isSeekable()) {
      paramLong = 0L;
    }
    int i = 0;
    notifyDiscontinuity = false;
    lastSeekPositionUs = paramLong;
    if (isPendingReset())
    {
      pendingResetPositionUs = paramLong;
      return paramLong;
    }
    if ((dataType != 7) && (seekInsideBufferUs((boolean[])localObject1, paramLong))) {
      return paramLong;
    }
    pendingDeferredRetry = false;
    pendingResetPositionUs = paramLong;
    loadingFinished = false;
    if (loader.isLoading())
    {
      loader.cancelLoading();
    }
    else
    {
      localObject2 = sampleQueues;
      int j = localObject2.length;
      while (i < j)
      {
        localObject2[i].reset();
        i++;
      }
    }
    return paramLong;
  }
  
  public long selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    Object localObject = getPreparedState();
    TrackGroupArray localTrackGroupArray = tracks;
    localObject = trackEnabledStates;
    int i = enabledTrackCount;
    int j = 0;
    int k = 0;
    int m = 0;
    for (int n = 0; n < paramArrayOfTrackSelection.length; n++)
    {
      SampleStream localSampleStream = paramArrayOfSampleStream[n];
      if ((localSampleStream != null) && ((paramArrayOfTrackSelection[n] == null) || (paramArrayOfBoolean1[n] == 0)))
      {
        i1 = SampleStreamImpl.access$000((SampleStreamImpl)localSampleStream);
        Assertions.checkState(localObject[i1]);
        enabledTrackCount -= 1;
        localObject[i1] = 0;
        paramArrayOfSampleStream[n] = null;
      }
    }
    if (seenFirstTrackSelection ? i == 0 : paramLong != 0L) {
      n = 1;
    } else {
      n = 0;
    }
    i = 0;
    for (int i1 = n; i < paramArrayOfTrackSelection.length; i1 = n)
    {
      n = i1;
      if (paramArrayOfSampleStream[i] == null)
      {
        paramArrayOfBoolean1 = paramArrayOfTrackSelection[i];
        n = i1;
        if (paramArrayOfBoolean1 != null)
        {
          boolean bool;
          if (paramArrayOfBoolean1.length() == 1) {
            bool = true;
          } else {
            bool = false;
          }
          Assertions.checkState(bool);
          if (paramArrayOfBoolean1.getIndexInTrackGroup(0) == 0) {
            bool = true;
          } else {
            bool = false;
          }
          Assertions.checkState(bool);
          int i2 = localTrackGroupArray.indexOf(paramArrayOfBoolean1.getTrackGroup());
          Assertions.checkState(localObject[i2] ^ 0x1);
          enabledTrackCount += 1;
          localObject[i2] = 1;
          paramArrayOfSampleStream[i] = new SampleStreamImpl(i2);
          paramArrayOfBoolean2[i] = true;
          n = i1;
          if (i1 == 0)
          {
            paramArrayOfBoolean1 = sampleQueues[i2];
            paramArrayOfBoolean1.rewind();
            if ((paramArrayOfBoolean1.advanceTo(paramLong, true, true) == -1) && (paramArrayOfBoolean1.getReadIndex() != 0)) {
              n = 1;
            } else {
              n = 0;
            }
          }
        }
      }
      i++;
    }
    long l;
    if (enabledTrackCount == 0)
    {
      pendingDeferredRetry = false;
      notifyDiscontinuity = false;
      if (loader.isLoading())
      {
        paramArrayOfTrackSelection = sampleQueues;
        i = paramArrayOfTrackSelection.length;
        for (n = m; n < i; n++) {
          paramArrayOfTrackSelection[n].discardToEnd();
        }
        loader.cancelLoading();
        l = paramLong;
      }
      else
      {
        paramArrayOfTrackSelection = sampleQueues;
        i = paramArrayOfTrackSelection.length;
        for (n = j;; n++)
        {
          l = paramLong;
          if (n >= i) {
            break;
          }
          paramArrayOfTrackSelection[n].reset();
        }
      }
    }
    else
    {
      l = paramLong;
      if (i1 != 0)
      {
        paramLong = seekToUs(paramLong);
        for (n = k;; n++)
        {
          l = paramLong;
          if (n >= paramArrayOfSampleStream.length) {
            break;
          }
          if (paramArrayOfSampleStream[n] != null) {
            paramArrayOfBoolean2[n] = true;
          }
        }
      }
    }
    seenFirstTrackSelection = true;
    return l;
  }
  
  public int skipData(int paramInt, long paramLong)
  {
    boolean bool = suppressRead();
    int i = 0;
    if (bool) {
      return 0;
    }
    maybeNotifyDownstreamFormat(paramInt);
    SampleQueue localSampleQueue = sampleQueues[paramInt];
    if ((loadingFinished) && (paramLong > localSampleQueue.getLargestQueuedTimestampUs()))
    {
      i = localSampleQueue.advanceToEnd();
    }
    else
    {
      int j = localSampleQueue.advanceTo(paramLong, true, true);
      if (j != -1) {
        i = j;
      }
    }
    if (i == 0) {
      maybeStartDeferredRetry(paramInt);
    }
    return i;
  }
  
  public TrackOutput track(int paramInt1, int paramInt2)
  {
    int i = sampleQueues.length;
    for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
      if (sampleQueueTrackIds[paramInt2] == paramInt1) {
        return sampleQueues[paramInt2];
      }
    }
    SampleQueue localSampleQueue = new SampleQueue(allocator);
    localSampleQueue.setUpstreamFormatChangeListener(this);
    Object localObject = sampleQueueTrackIds;
    paramInt2 = i + 1;
    localObject = Arrays.copyOf((int[])localObject, paramInt2);
    sampleQueueTrackIds = ((int[])localObject);
    localObject[i] = paramInt1;
    localObject = (SampleQueue[])Arrays.copyOf(sampleQueues, paramInt2);
    localObject[i] = localSampleQueue;
    sampleQueues = ((SampleQueue[])Util.castNonNullTypeArray((Object[])localObject));
    return localSampleQueue;
  }
  
  public final class ExtractingLoadable
    implements Loader.Loadable
  {
    private final StatsDataSource dataSource;
    private DataSpec dataSpec;
    private final ExtractorMediaPeriod.ExtractorHolder extractorHolder;
    private final ExtractorOutput extractorOutput;
    private long length;
    private volatile boolean loadCanceled;
    private final ConditionVariable loadCondition;
    private boolean pendingExtractorSeek;
    private final PositionHolder positionHolder;
    private long seekTimeUs;
    private final Uri uri;
    
    public ExtractingLoadable(Uri paramUri, DataSource paramDataSource, ExtractorMediaPeriod.ExtractorHolder paramExtractorHolder, ExtractorOutput paramExtractorOutput, ConditionVariable paramConditionVariable)
    {
      uri = paramUri;
      dataSource = new StatsDataSource(paramDataSource);
      extractorHolder = paramExtractorHolder;
      extractorOutput = paramExtractorOutput;
      loadCondition = paramConditionVariable;
      paramDataSource = new PositionHolder();
      positionHolder = paramDataSource;
      pendingExtractorSeek = true;
      length = -1L;
      dataSpec = new DataSpec(paramUri, position, -1L, ExtractorMediaPeriod.access$600(ExtractorMediaPeriod.this));
    }
    
    private void setLoadPosition(long paramLong1, long paramLong2)
    {
      positionHolder.position = paramLong1;
      seekTimeUs = paramLong2;
      pendingExtractorSeek = true;
    }
    
    public void cancelLoad()
    {
      loadCanceled = true;
    }
    
    public void load()
      throws IOException, InterruptedException
    {
      int i = 0;
      Object localObject5;
      for (;;)
      {
        if ((i != 0) || (loadCanceled)) {
          return;
        }
        Object localObject1 = null;
        try
        {
          long l1 = positionHolder.position;
          Object localObject2 = new com/google/android/exoplayer2/upstream/DataSpec;
          ((DataSpec)localObject2).<init>(uri, l1, -1L, ExtractorMediaPeriod.access$600(ExtractorMediaPeriod.this));
          dataSpec = ((DataSpec)localObject2);
          long l2 = dataSource.open((DataSpec)localObject2);
          length = l2;
          if (l2 != -1L) {
            length = (l2 + l1);
          }
          localObject2 = (Uri)Assertions.checkNotNull(dataSource.getUri());
          localObject5 = new com/google/android/exoplayer2/extractor/DefaultExtractorInput;
          ((DefaultExtractorInput)localObject5).<init>(dataSource, l1, length);
          int j = i;
          try
          {
            localObject2 = extractorHolder.selectExtractor((ExtractorInput)localObject5, extractorOutput, (Uri)localObject2);
            int k = i;
            l2 = l1;
            j = i;
            if (pendingExtractorSeek)
            {
              j = i;
              ((Extractor)localObject2).seek(l1, seekTimeUs);
              j = i;
              pendingExtractorSeek = false;
              l2 = l1;
              k = i;
            }
            while (k == 0)
            {
              j = k;
              if (loadCanceled) {
                break;
              }
              j = k;
              loadCondition.block();
              j = k;
              i = ((Extractor)localObject2).read((ExtractorInput)localObject5, positionHolder);
              k = i;
              j = i;
              if (((ExtractorInput)localObject5).getPosition() > ExtractorMediaPeriod.access$700(ExtractorMediaPeriod.this) + l2)
              {
                j = i;
                l2 = ((ExtractorInput)localObject5).getPosition();
                j = i;
                loadCondition.close();
                j = i;
                ExtractorMediaPeriod.access$900(ExtractorMediaPeriod.this).post(ExtractorMediaPeriod.access$800(ExtractorMediaPeriod.this));
                k = i;
              }
            }
            if (k == 1)
            {
              i = 0;
            }
            else
            {
              positionHolder.position = ((ExtractorInput)localObject5).getPosition();
              i = k;
            }
            Util.closeQuietly(dataSource);
            continue;
          }
          finally
          {
            i = j;
          }
          if (i == 1) {
            break label384;
          }
        }
        finally
        {
          localObject5 = localObject1;
        }
      }
      if (localObject5 != null) {
        positionHolder.position = ((ExtractorInput)localObject5).getPosition();
      }
      label384:
      Util.closeQuietly(dataSource);
      throw ((Throwable)localObject4);
    }
  }
  
  public static final class ExtractorHolder
  {
    @Nullable
    private Extractor extractor;
    private final Extractor[] extractors;
    
    public ExtractorHolder(Extractor[] paramArrayOfExtractor)
    {
      extractors = paramArrayOfExtractor;
    }
    
    public void release()
    {
      Extractor localExtractor = extractor;
      if (localExtractor != null)
      {
        localExtractor.release();
        extractor = null;
      }
    }
    
    /* Error */
    public Extractor selectExtractor(ExtractorInput paramExtractorInput, ExtractorOutput paramExtractorOutput, Uri paramUri)
      throws IOException, InterruptedException
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
      //   4: astore 4
      //   6: aload 4
      //   8: ifnull +6 -> 14
      //   11: aload 4
      //   13: areturn
      //   14: aload_0
      //   15: getfield 19	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractors	[Lcom/google/android/exoplayer2/extractor/Extractor;
      //   18: astore 4
      //   20: aload 4
      //   22: arraylength
      //   23: istore 5
      //   25: iconst_0
      //   26: istore 6
      //   28: iload 6
      //   30: iload 5
      //   32: if_icmpge +57 -> 89
      //   35: aload 4
      //   37: iload 6
      //   39: aaload
      //   40: astore 7
      //   42: aload 7
      //   44: aload_1
      //   45: invokeinterface 39 2 0
      //   50: ifeq +27 -> 77
      //   53: aload_0
      //   54: aload 7
      //   56: putfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
      //   59: aload_1
      //   60: invokeinterface 44 1 0
      //   65: goto +24 -> 89
      //   68: astore_2
      //   69: aload_1
      //   70: invokeinterface 44 1 0
      //   75: aload_2
      //   76: athrow
      //   77: aload_1
      //   78: invokeinterface 44 1 0
      //   83: iinc 6 1
      //   86: goto -58 -> 28
      //   89: aload_0
      //   90: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
      //   93: astore_1
      //   94: aload_1
      //   95: ifnull +15 -> 110
      //   98: aload_1
      //   99: aload_2
      //   100: invokeinterface 48 2 0
      //   105: aload_0
      //   106: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
      //   109: areturn
      //   110: new 50	com/google/android/exoplayer2/source/UnrecognizedInputFormatException
      //   113: dup
      //   114: ldc 52
      //   116: invokestatic 58	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   119: aload_0
      //   120: getfield 19	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractors	[Lcom/google/android/exoplayer2/extractor/Extractor;
      //   123: invokestatic 64	com/google/android/exoplayer2/util/Util:getCommaDelimitedSimpleClassNames	([Ljava/lang/Object;)Ljava/lang/String;
      //   126: ldc 66
      //   128: invokestatic 70	z2:s	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
      //   131: aload_3
      //   132: invokespecial 73	com/google/android/exoplayer2/source/UnrecognizedInputFormatException:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
      //   135: athrow
      //   136: astore 7
      //   138: goto -61 -> 77
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	141	0	this	ExtractorHolder
      //   0	141	1	paramExtractorInput	ExtractorInput
      //   0	141	2	paramExtractorOutput	ExtractorOutput
      //   0	141	3	paramUri	Uri
      //   4	32	4	localObject	Object
      //   23	10	5	i	int
      //   26	58	6	j	int
      //   40	15	7	localExtractor	Extractor
      //   136	1	7	localEOFException	java.io.EOFException
      // Exception table:
      //   from	to	target	type
      //   42	59	68	finally
      //   42	59	136	java/io/EOFException
    }
  }
  
  public static abstract interface Listener
  {
    public abstract void onSourceInfoRefreshed(long paramLong, boolean paramBoolean);
  }
  
  public static final class PreparedState
  {
    public final SeekMap seekMap;
    public final boolean[] trackEnabledStates;
    public final boolean[] trackIsAudioVideoFlags;
    public final boolean[] trackNotifiedDownstreamFormats;
    public final TrackGroupArray tracks;
    
    public PreparedState(SeekMap paramSeekMap, TrackGroupArray paramTrackGroupArray, boolean[] paramArrayOfBoolean)
    {
      seekMap = paramSeekMap;
      tracks = paramTrackGroupArray;
      trackIsAudioVideoFlags = paramArrayOfBoolean;
      int i = length;
      trackEnabledStates = new boolean[i];
      trackNotifiedDownstreamFormats = new boolean[i];
    }
  }
  
  public final class SampleStreamImpl
    implements SampleStream
  {
    private final int track;
    
    public SampleStreamImpl(int paramInt)
    {
      track = paramInt;
    }
    
    public boolean isReady()
    {
      return isReady(track);
    }
    
    public void maybeThrowError()
      throws IOException
    {
      ExtractorMediaPeriod.this.maybeThrowError();
    }
    
    public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
    {
      return readData(track, paramFormatHolder, paramDecoderInputBuffer, paramBoolean);
    }
    
    public int skipData(long paramLong)
    {
      return skipData(track, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaPeriod
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */