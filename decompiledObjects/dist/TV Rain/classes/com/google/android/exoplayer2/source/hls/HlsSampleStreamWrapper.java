package com.google.android.exoplayer2.source.hls;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist.HlsUrl;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class HlsSampleStreamWrapper
  implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener
{
  public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_FATAL = -2;
  public static final int SAMPLE_QUEUE_INDEX_NO_MAPPING_NON_FATAL = -3;
  public static final int SAMPLE_QUEUE_INDEX_PENDING = -1;
  private static final String TAG = "HlsSampleStreamWrapper";
  private final Allocator allocator;
  private int audioSampleQueueIndex;
  private boolean audioSampleQueueMappingDone;
  private final Callback callback;
  private final HlsChunkSource chunkSource;
  private int chunkUid;
  private Format downstreamTrackFormat;
  private int enabledTrackGroupCount;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private final Handler handler;
  private boolean haveAudioVideoSampleQueues;
  private final ArrayList<HlsSampleStream> hlsSampleStreams;
  private long lastSeekPositionUs;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private final Loader loader;
  private boolean loadingFinished;
  private final Runnable maybeFinishPrepareRunnable;
  private final ArrayList<HlsMediaChunk> mediaChunks;
  private final Format muxedAudioFormat;
  private final HlsChunkSource.HlsChunkHolder nextChunkHolder;
  private final Runnable onTracksEndedRunnable;
  private TrackGroupArray optionalTrackGroups;
  private long pendingResetPositionUs;
  private boolean pendingResetUpstreamFormats;
  private boolean prepared;
  private int primarySampleQueueIndex;
  private int primarySampleQueueType;
  private int primaryTrackGroupIndex;
  private final List<HlsMediaChunk> readOnlyMediaChunks;
  private boolean released;
  private long sampleOffsetUs;
  private boolean[] sampleQueueIsAudioVideoFlags;
  private int[] sampleQueueTrackIds;
  private SampleQueue[] sampleQueues;
  private boolean sampleQueuesBuilt;
  private boolean[] sampleQueuesEnabledStates;
  private boolean seenFirstTrackSelection;
  private int[] trackGroupToSampleQueueIndex;
  private TrackGroupArray trackGroups;
  private final int trackType;
  private boolean tracksEnded;
  private Format upstreamTrackFormat;
  private int videoSampleQueueIndex;
  private boolean videoSampleQueueMappingDone;
  
  public HlsSampleStreamWrapper(int paramInt, Callback paramCallback, HlsChunkSource paramHlsChunkSource, Allocator paramAllocator, long paramLong, Format paramFormat, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher)
  {
    trackType = paramInt;
    callback = paramCallback;
    chunkSource = paramHlsChunkSource;
    allocator = paramAllocator;
    muxedAudioFormat = paramFormat;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    eventDispatcher = paramEventDispatcher;
    loader = new Loader("Loader:HlsSampleStreamWrapper");
    nextChunkHolder = new HlsChunkSource.HlsChunkHolder();
    sampleQueueTrackIds = new int[0];
    audioSampleQueueIndex = -1;
    videoSampleQueueIndex = -1;
    sampleQueues = new SampleQueue[0];
    sampleQueueIsAudioVideoFlags = new boolean[0];
    sampleQueuesEnabledStates = new boolean[0];
    paramCallback = new ArrayList();
    mediaChunks = paramCallback;
    readOnlyMediaChunks = Collections.unmodifiableList(paramCallback);
    hlsSampleStreams = new ArrayList();
    maybeFinishPrepareRunnable = new a(this, 0);
    onTracksEndedRunnable = new a(this, 1);
    handler = new Handler();
    lastSeekPositionUs = paramLong;
    pendingResetPositionUs = paramLong;
  }
  
  private void buildTracksFromSampleStreams()
  {
    int i = sampleQueues.length;
    boolean bool = false;
    int j = 6;
    int k = -1;
    int m = 0;
    Object localObject;
    for (;;)
    {
      n = 2;
      if (m >= i) {
        break;
      }
      localObject = sampleQueues[m].getUpstreamFormat().sampleMimeType;
      if (!MimeTypes.isVideo((String)localObject)) {
        if (MimeTypes.isAudio((String)localObject)) {
          n = 1;
        } else if (MimeTypes.isText((String)localObject)) {
          n = 3;
        } else {
          n = 6;
        }
      }
      int i2;
      if (getTrackTypeScore(n) > getTrackTypeScore(j))
      {
        i1 = m;
        i2 = n;
      }
      else
      {
        i2 = j;
        i1 = k;
        if (n == j)
        {
          i2 = j;
          i1 = k;
          if (k != -1)
          {
            i1 = -1;
            i2 = j;
          }
        }
      }
      m++;
      j = i2;
      k = i1;
    }
    TrackGroup localTrackGroup = chunkSource.getTrackGroup();
    int i1 = length;
    primaryTrackGroupIndex = -1;
    trackGroupToSampleQueueIndex = new int[i];
    for (int n = 0; n < i; n++) {
      trackGroupToSampleQueueIndex[n] = n;
    }
    TrackGroup[] arrayOfTrackGroup = new TrackGroup[i];
    for (n = 0; n < i; n++)
    {
      Format localFormat = sampleQueues[n].getUpstreamFormat();
      if (n == k)
      {
        localObject = new Format[i1];
        if (i1 == 1) {
          localObject[0] = localFormat.copyWithManifestFormatInfo(localTrackGroup.getFormat(0));
        } else {
          for (m = 0; m < i1; m++) {
            localObject[m] = deriveFormat(localTrackGroup.getFormat(m), localFormat, true);
          }
        }
        arrayOfTrackGroup[n] = new TrackGroup((Format[])localObject);
        primaryTrackGroupIndex = n;
      }
      else
      {
        if ((j == 2) && (MimeTypes.isAudio(sampleMimeType))) {
          localObject = muxedAudioFormat;
        } else {
          localObject = null;
        }
        arrayOfTrackGroup[n] = new TrackGroup(new Format[] { deriveFormat((Format)localObject, localFormat, false) });
      }
    }
    trackGroups = new TrackGroupArray(arrayOfTrackGroup);
    if (optionalTrackGroups == null) {
      bool = true;
    }
    Assertions.checkState(bool);
    optionalTrackGroups = TrackGroupArray.EMPTY;
  }
  
  private static DummyTrackOutput createDummyTrackOutput(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Unmapped track with id ");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(" of type ");
    localStringBuilder.append(paramInt2);
    Log.w("HlsSampleStreamWrapper", localStringBuilder.toString());
    return new DummyTrackOutput();
  }
  
  private static Format deriveFormat(Format paramFormat1, Format paramFormat2, boolean paramBoolean)
  {
    if (paramFormat1 == null) {
      return paramFormat2;
    }
    int i;
    if (paramBoolean) {
      i = bitrate;
    } else {
      i = -1;
    }
    int j = MimeTypes.getTrackType(sampleMimeType);
    String str1 = Util.getCodecsOfType(codecs, j);
    String str2 = MimeTypes.getMediaMimeType(str1);
    String str3 = str2;
    if (str2 == null) {
      str3 = sampleMimeType;
    }
    return paramFormat2.copyWithContainerInfo(id, label, str3, str1, i, width, height, selectionFlags, language);
  }
  
  private boolean finishedReadingChunk(HlsMediaChunk paramHlsMediaChunk)
  {
    int i = uid;
    int j = sampleQueues.length;
    for (int k = 0; k < j; k++) {
      if ((sampleQueuesEnabledStates[k] != 0) && (sampleQueues[k].peekSourceId() == i)) {
        return false;
      }
    }
    return true;
  }
  
  private static boolean formatsMatch(Format paramFormat1, Format paramFormat2)
  {
    String str1 = sampleMimeType;
    String str2 = sampleMimeType;
    int i = MimeTypes.getTrackType(str1);
    boolean bool1 = true;
    boolean bool2 = true;
    if (i != 3)
    {
      if (i != MimeTypes.getTrackType(str2)) {
        bool2 = false;
      }
      return bool2;
    }
    if (!Util.areEqual(str1, str2)) {
      return false;
    }
    if ((!"application/cea-608".equals(str1)) && (!"application/cea-708".equals(str1))) {
      return true;
    }
    if (accessibilityChannel == accessibilityChannel) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  private HlsMediaChunk getLastMediaChunk()
  {
    ArrayList localArrayList = mediaChunks;
    return (HlsMediaChunk)localArrayList.get(localArrayList.size() - 1);
  }
  
  private static int getTrackTypeScore(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3) {
          return 0;
        }
        return 1;
      }
      return 3;
    }
    return 2;
  }
  
  private static boolean isMediaChunk(Chunk paramChunk)
  {
    return paramChunk instanceof HlsMediaChunk;
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
  
  private void mapSampleQueuesToMatchTrackGroups()
  {
    int i = trackGroups.length;
    Object localObject = new int[i];
    trackGroupToSampleQueueIndex = ((int[])localObject);
    Arrays.fill((int[])localObject, -1);
    for (int j = 0; j < i; j++) {
      for (int k = 0;; k++)
      {
        localObject = sampleQueues;
        if (k >= localObject.length) {
          break;
        }
        if (formatsMatch(localObject[k].getUpstreamFormat(), trackGroups.get(j).getFormat(0)))
        {
          trackGroupToSampleQueueIndex[j] = k;
          break;
        }
      }
    }
    localObject = hlsSampleStreams.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((HlsSampleStream)((Iterator)localObject).next()).bindSampleQueue();
    }
  }
  
  private void maybeFinishPrepare()
  {
    if ((!released) && (trackGroupToSampleQueueIndex == null) && (sampleQueuesBuilt))
    {
      SampleQueue[] arrayOfSampleQueue = sampleQueues;
      int i = arrayOfSampleQueue.length;
      for (int j = 0; j < i; j++) {
        if (arrayOfSampleQueue[j].getUpstreamFormat() == null) {
          return;
        }
      }
      if (trackGroups != null)
      {
        mapSampleQueuesToMatchTrackGroups();
      }
      else
      {
        buildTracksFromSampleStreams();
        prepared = true;
        callback.onPrepared();
      }
    }
  }
  
  private void onTracksEnded()
  {
    sampleQueuesBuilt = true;
    maybeFinishPrepare();
  }
  
  private void resetSampleQueues()
  {
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int i = arrayOfSampleQueue.length;
    for (int j = 0; j < i; j++) {
      arrayOfSampleQueue[j].reset(pendingResetUpstreamFormats);
    }
    pendingResetUpstreamFormats = false;
  }
  
  private boolean seekInsideBufferUs(long paramLong)
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
      if ((k == 0) && ((sampleQueueIsAudioVideoFlags[j] != 0) || (!haveAudioVideoSampleQueues))) {
        return false;
      }
    }
    return true;
  }
  
  private void updateSampleStreams(SampleStream[] paramArrayOfSampleStream)
  {
    hlsSampleStreams.clear();
    int i = paramArrayOfSampleStream.length;
    for (int j = 0; j < i; j++)
    {
      SampleStream localSampleStream = paramArrayOfSampleStream[j];
      if (localSampleStream != null) {
        hlsSampleStreams.add((HlsSampleStream)localSampleStream);
      }
    }
  }
  
  public int bindSampleQueueToSampleStream(int paramInt)
  {
    int i = trackGroupToSampleQueueIndex[paramInt];
    int j = -2;
    if (i == -1)
    {
      if (optionalTrackGroups.indexOf(trackGroups.get(paramInt)) == -1) {
        paramInt = j;
      } else {
        paramInt = -3;
      }
      return paramInt;
    }
    boolean[] arrayOfBoolean = sampleQueuesEnabledStates;
    if (arrayOfBoolean[i] != 0) {
      return -2;
    }
    arrayOfBoolean[i] = true;
    return i;
  }
  
  public boolean continueLoading(long paramLong)
  {
    if ((!loadingFinished) && (!loader.isLoading()))
    {
      long l;
      if (isPendingReset())
      {
        localObject1 = Collections.emptyList();
        l = pendingResetPositionUs;
      }
      for (;;)
      {
        break;
        localObject1 = readOnlyMediaChunks;
        localObject2 = getLastMediaChunk();
        if (((HlsMediaChunk)localObject2).isLoadCompleted()) {
          l = endTimeUs;
        } else {
          l = Math.max(lastSeekPositionUs, startTimeUs);
        }
      }
      chunkSource.getNextChunk(paramLong, l, (List)localObject1, nextChunkHolder);
      HlsChunkSource.HlsChunkHolder localHlsChunkHolder = nextChunkHolder;
      boolean bool = endOfStream;
      Object localObject1 = chunk;
      Object localObject2 = playlist;
      localHlsChunkHolder.clear();
      if (bool)
      {
        pendingResetPositionUs = -9223372036854775807L;
        loadingFinished = true;
        return true;
      }
      if (localObject1 == null)
      {
        if (localObject2 != null) {
          callback.onPlaylistRefreshRequired((HlsMasterPlaylist.HlsUrl)localObject2);
        }
        return false;
      }
      if (isMediaChunk((Chunk)localObject1))
      {
        pendingResetPositionUs = -9223372036854775807L;
        localObject2 = (HlsMediaChunk)localObject1;
        ((HlsMediaChunk)localObject2).init(this);
        mediaChunks.add(localObject2);
        upstreamTrackFormat = trackFormat;
      }
      paramLong = loader.startLoading((Loader.Loadable)localObject1, this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(type));
      eventDispatcher.loadStarted(dataSpec, type, trackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong);
      return true;
    }
    return false;
  }
  
  public void continuePreparing()
  {
    if (!prepared) {
      continueLoading(lastSeekPositionUs);
    }
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    if ((sampleQueuesBuilt) && (!isPendingReset()))
    {
      int i = sampleQueues.length;
      for (int j = 0; j < i; j++) {
        sampleQueues[j].discardTo(paramLong, paramBoolean, sampleQueuesEnabledStates[j]);
      }
    }
  }
  
  public void endTracks()
  {
    tracksEnded = true;
    handler.post(onTracksEndedRunnable);
  }
  
  public long getBufferedPositionUs()
  {
    if (loadingFinished) {
      return Long.MIN_VALUE;
    }
    if (isPendingReset()) {
      return pendingResetPositionUs;
    }
    long l1 = lastSeekPositionUs;
    Object localObject = getLastMediaChunk();
    if (!((HlsMediaChunk)localObject).isLoadCompleted()) {
      if (mediaChunks.size() > 1)
      {
        localObject = mediaChunks;
        localObject = (HlsMediaChunk)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
      }
      else
      {
        localObject = null;
      }
    }
    long l2 = l1;
    if (localObject != null) {
      l2 = Math.max(l1, endTimeUs);
    }
    l1 = l2;
    if (sampleQueuesBuilt)
    {
      localObject = sampleQueues;
      int i = localObject.length;
      for (int j = 0;; j++)
      {
        l1 = l2;
        if (j >= i) {
          break;
        }
        l2 = Math.max(l2, localObject[j].getLargestQueuedTimestampUs());
      }
    }
    return l1;
  }
  
  public long getNextLoadPositionUs()
  {
    if (isPendingReset()) {
      return pendingResetPositionUs;
    }
    long l;
    if (loadingFinished) {
      l = Long.MIN_VALUE;
    } else {
      l = getLastMediaChunkendTimeUs;
    }
    return l;
  }
  
  public TrackGroupArray getTrackGroups()
  {
    return trackGroups;
  }
  
  public void init(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    if (!paramBoolean2)
    {
      audioSampleQueueMappingDone = false;
      videoSampleQueueMappingDone = false;
    }
    chunkUid = paramInt;
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int j = arrayOfSampleQueue.length;
    for (int k = 0; k < j; k++) {
      arrayOfSampleQueue[k].sourceId(paramInt);
    }
    if (paramBoolean1)
    {
      arrayOfSampleQueue = sampleQueues;
      k = arrayOfSampleQueue.length;
      for (paramInt = i; paramInt < k; paramInt++) {
        arrayOfSampleQueue[paramInt].splice();
      }
    }
  }
  
  public boolean isReady(int paramInt)
  {
    boolean bool;
    if ((!loadingFinished) && ((isPendingReset()) || (!sampleQueues[paramInt].hasNextSample()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void maybeThrowError()
    throws IOException
  {
    loader.maybeThrowError();
    chunkSource.maybeThrowError();
  }
  
  public void maybeThrowPrepareError()
    throws IOException
  {
    maybeThrowError();
  }
  
  public void onLoadCanceled(Chunk paramChunk, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    eventDispatcher.loadCanceled(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, trackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, paramChunk.bytesLoaded());
    if (!paramBoolean)
    {
      resetSampleQueues();
      if (enabledTrackGroupCount > 0) {
        callback.onContinueLoadingRequested(this);
      }
    }
  }
  
  public void onLoadCompleted(Chunk paramChunk, long paramLong1, long paramLong2)
  {
    chunkSource.onChunkLoadCompleted(paramChunk);
    eventDispatcher.loadCompleted(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, trackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, paramChunk.bytesLoaded());
    if (!prepared) {
      continueLoading(lastSeekPositionUs);
    } else {
      callback.onContinueLoadingRequested(this);
    }
  }
  
  public Loader.LoadErrorAction onLoadError(Chunk paramChunk, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l1 = paramChunk.bytesLoaded();
    boolean bool1 = isMediaChunk(paramChunk);
    long l2 = loadErrorHandlingPolicy.getBlacklistDurationMsFor(type, paramLong2, paramIOException, paramInt);
    boolean bool2 = false;
    boolean bool3;
    if (l2 != -9223372036854775807L) {
      bool3 = chunkSource.maybeBlacklistTrack(paramChunk, l2);
    } else {
      bool3 = false;
    }
    Object localObject;
    if (bool3)
    {
      if ((bool1) && (l1 == 0L))
      {
        localObject = mediaChunks;
        if ((HlsMediaChunk)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1) == paramChunk) {
          bool2 = true;
        }
        Assertions.checkState(bool2);
        if (mediaChunks.isEmpty()) {
          pendingResetPositionUs = lastSeekPositionUs;
        }
      }
      localObject = Loader.DONT_RETRY;
    }
    for (;;)
    {
      break;
      l2 = loadErrorHandlingPolicy.getRetryDelayMsFor(type, paramLong2, paramIOException, paramInt);
      if (l2 != -9223372036854775807L) {
        localObject = Loader.createRetryAction(false, l2);
      } else {
        localObject = Loader.DONT_RETRY_FATAL;
      }
    }
    eventDispatcher.loadError(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, trackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, l1, paramIOException, ((Loader.LoadErrorAction)localObject).isRetry() ^ true);
    if (bool3) {
      if (!prepared) {
        continueLoading(lastSeekPositionUs);
      } else {
        callback.onContinueLoadingRequested(this);
      }
    }
    return (Loader.LoadErrorAction)localObject;
  }
  
  public void onLoaderReleased()
  {
    resetSampleQueues();
  }
  
  public boolean onPlaylistError(HlsMasterPlaylist.HlsUrl paramHlsUrl, long paramLong)
  {
    return chunkSource.onPlaylistError(paramHlsUrl, paramLong);
  }
  
  public void onUpstreamFormatChanged(Format paramFormat)
  {
    handler.post(maybeFinishPrepareRunnable);
  }
  
  public void prepareWithMasterPlaylistInfo(TrackGroupArray paramTrackGroupArray1, int paramInt, TrackGroupArray paramTrackGroupArray2)
  {
    prepared = true;
    trackGroups = paramTrackGroupArray1;
    optionalTrackGroups = paramTrackGroupArray2;
    primaryTrackGroupIndex = paramInt;
    callback.onPrepared();
  }
  
  public int readData(int paramInt, FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    if (isPendingReset()) {
      return -3;
    }
    boolean bool = mediaChunks.isEmpty();
    int i = 0;
    if (!bool)
    {
      for (j = 0; (j < mediaChunks.size() - 1) && (finishedReadingChunk((HlsMediaChunk)mediaChunks.get(j))); j++) {}
      Util.removeRange(mediaChunks, 0, j);
      HlsMediaChunk localHlsMediaChunk = (HlsMediaChunk)mediaChunks.get(0);
      Format localFormat = trackFormat;
      if (!localFormat.equals(downstreamTrackFormat)) {
        eventDispatcher.downstreamFormatChanged(trackType, localFormat, trackSelectionReason, trackSelectionData, startTimeUs);
      }
      downstreamTrackFormat = localFormat;
    }
    int j = sampleQueues[paramInt].read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean, loadingFinished, lastSeekPositionUs);
    if ((j == -5) && (paramInt == primarySampleQueueIndex))
    {
      int k = sampleQueues[paramInt].peekSourceId();
      for (paramInt = i; (paramInt < mediaChunks.size()) && (mediaChunks.get(paramInt)).uid != k); paramInt++) {}
      if (paramInt < mediaChunks.size()) {
        paramDecoderInputBuffer = mediaChunks.get(paramInt)).trackFormat;
      } else {
        paramDecoderInputBuffer = upstreamTrackFormat;
      }
      format = format.copyWithManifestFormatInfo(paramDecoderInputBuffer);
    }
    return j;
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
    released = true;
    hlsSampleStreams.clear();
  }
  
  public void seekMap(SeekMap paramSeekMap) {}
  
  public boolean seekToUs(long paramLong, boolean paramBoolean)
  {
    lastSeekPositionUs = paramLong;
    if (isPendingReset())
    {
      pendingResetPositionUs = paramLong;
      return true;
    }
    if ((sampleQueuesBuilt) && (!paramBoolean) && (seekInsideBufferUs(paramLong))) {
      return false;
    }
    pendingResetPositionUs = paramLong;
    loadingFinished = false;
    mediaChunks.clear();
    if (loader.isLoading()) {
      loader.cancelLoading();
    } else {
      resetSampleQueues();
    }
    return true;
  }
  
  public boolean selectTracks(TrackSelection[] paramArrayOfTrackSelection, boolean[] paramArrayOfBoolean1, SampleStream[] paramArrayOfSampleStream, boolean[] paramArrayOfBoolean2, long paramLong, boolean paramBoolean)
  {
    Assertions.checkState(prepared);
    int i = enabledTrackGroupCount;
    int j = 0;
    int k = 0;
    Object localObject;
    for (int m = 0; m < paramArrayOfTrackSelection.length; m++)
    {
      localObject = paramArrayOfSampleStream[m];
      if ((localObject != null) && ((paramArrayOfTrackSelection[m] == null) || (paramArrayOfBoolean1[m] == 0)))
      {
        enabledTrackGroupCount -= 1;
        ((HlsSampleStream)localObject).unbindSampleQueue();
        paramArrayOfSampleStream[m] = null;
      }
    }
    boolean bool1;
    if ((!paramBoolean) && (seenFirstTrackSelection ? i != 0 : paramLong == lastSeekPositionUs)) {
      bool1 = false;
    } else {
      bool1 = true;
    }
    TrackSelection localTrackSelection1 = chunkSource.getTrackSelection();
    paramArrayOfBoolean1 = localTrackSelection1;
    m = 0;
    boolean bool2;
    while (m < paramArrayOfTrackSelection.length)
    {
      localObject = paramArrayOfBoolean1;
      bool2 = bool1;
      if (paramArrayOfSampleStream[m] == null)
      {
        TrackSelection localTrackSelection2 = paramArrayOfTrackSelection[m];
        localObject = paramArrayOfBoolean1;
        bool2 = bool1;
        if (localTrackSelection2 != null)
        {
          enabledTrackGroupCount += 1;
          i = trackGroups.indexOf(localTrackSelection2.getTrackGroup());
          if (i == primaryTrackGroupIndex)
          {
            chunkSource.selectTracks(localTrackSelection2);
            paramArrayOfBoolean1 = localTrackSelection2;
          }
          localObject = new HlsSampleStream(this, i);
          paramArrayOfSampleStream[m] = localObject;
          paramArrayOfBoolean2[m] = true;
          if (trackGroupToSampleQueueIndex != null) {
            ((HlsSampleStream)localObject).bindSampleQueue();
          }
          localObject = paramArrayOfBoolean1;
          bool2 = bool1;
          if (sampleQueuesBuilt)
          {
            localObject = paramArrayOfBoolean1;
            bool2 = bool1;
            if (!bool1)
            {
              localObject = sampleQueues[trackGroupToSampleQueueIndex[i]];
              ((SampleQueue)localObject).rewind();
              if ((((SampleQueue)localObject).advanceTo(paramLong, true, true) == -1) && (((SampleQueue)localObject).getReadIndex() != 0)) {
                bool1 = true;
              } else {
                bool1 = false;
              }
              bool2 = bool1;
              localObject = paramArrayOfBoolean1;
            }
          }
        }
      }
      m++;
      paramArrayOfBoolean1 = (boolean[])localObject;
      bool1 = bool2;
    }
    if (enabledTrackGroupCount == 0)
    {
      chunkSource.reset();
      downstreamTrackFormat = null;
      mediaChunks.clear();
      if (loader.isLoading())
      {
        if (sampleQueuesBuilt)
        {
          paramArrayOfTrackSelection = sampleQueues;
          j = paramArrayOfTrackSelection.length;
          for (m = k; m < j; m++) {
            paramArrayOfTrackSelection[m].discardToEnd();
          }
        }
        loader.cancelLoading();
        bool2 = bool1;
      }
      else
      {
        resetSampleQueues();
        bool2 = bool1;
      }
    }
    else
    {
      if ((!mediaChunks.isEmpty()) && (!Util.areEqual(paramArrayOfBoolean1, localTrackSelection1)))
      {
        if (!seenFirstTrackSelection)
        {
          long l = 0L;
          if (paramLong < 0L) {
            l = -paramLong;
          }
          paramArrayOfTrackSelection = getLastMediaChunk();
          localObject = chunkSource.createMediaChunkIterators(paramArrayOfTrackSelection, paramLong);
          paramArrayOfBoolean1.updateSelectedTrack(paramLong, l, -9223372036854775807L, readOnlyMediaChunks, (MediaChunkIterator[])localObject);
          m = chunkSource.getTrackGroup().indexOf(trackFormat);
          if (paramArrayOfBoolean1.getSelectedIndexInTrackGroup() == m)
          {
            m = 0;
            break label574;
          }
        }
        m = 1;
        label574:
        if (m != 0)
        {
          pendingResetUpstreamFormats = true;
          paramBoolean = true;
          bool1 = paramBoolean;
        }
      }
      bool2 = bool1;
      if (bool1)
      {
        seekToUs(paramLong, paramBoolean);
        for (m = j;; m++)
        {
          bool2 = bool1;
          if (m >= paramArrayOfSampleStream.length) {
            break;
          }
          if (paramArrayOfSampleStream[m] != null) {
            paramArrayOfBoolean2[m] = true;
          }
        }
      }
    }
    updateSampleStreams(paramArrayOfSampleStream);
    seenFirstTrackSelection = true;
    return bool2;
  }
  
  public void setIsTimestampMaster(boolean paramBoolean)
  {
    chunkSource.setIsTimestampMaster(paramBoolean);
  }
  
  public void setSampleOffsetUs(long paramLong)
  {
    sampleOffsetUs = paramLong;
    SampleQueue[] arrayOfSampleQueue = sampleQueues;
    int i = arrayOfSampleQueue.length;
    for (int j = 0; j < i; j++) {
      arrayOfSampleQueue[j].setSampleOffsetUs(paramLong);
    }
  }
  
  public int skipData(int paramInt, long paramLong)
  {
    boolean bool = isPendingReset();
    int i = 0;
    if (bool) {
      return 0;
    }
    SampleQueue localSampleQueue = sampleQueues[paramInt];
    if ((loadingFinished) && (paramLong > localSampleQueue.getLargestQueuedTimestampUs())) {
      return localSampleQueue.advanceToEnd();
    }
    paramInt = localSampleQueue.advanceTo(paramLong, true, true);
    if (paramInt == -1) {
      paramInt = i;
    }
    return paramInt;
  }
  
  public TrackOutput track(int paramInt1, int paramInt2)
  {
    Object localObject1 = sampleQueues;
    int i = localObject1.length;
    int j = 0;
    if (paramInt2 == 1)
    {
      k = audioSampleQueueIndex;
      if (k != -1)
      {
        if (audioSampleQueueMappingDone)
        {
          if (sampleQueueTrackIds[k] == paramInt1) {
            localObject1 = localObject1[k];
          } else {
            localObject1 = createDummyTrackOutput(paramInt1, paramInt2);
          }
          return (TrackOutput)localObject1;
        }
        audioSampleQueueMappingDone = true;
        sampleQueueTrackIds[k] = paramInt1;
        return localObject1[k];
      }
      if (tracksEnded) {
        return createDummyTrackOutput(paramInt1, paramInt2);
      }
    }
    else if (paramInt2 == 2)
    {
      k = videoSampleQueueIndex;
      if (k != -1)
      {
        if (videoSampleQueueMappingDone)
        {
          if (sampleQueueTrackIds[k] == paramInt1) {
            localObject1 = localObject1[k];
          } else {
            localObject1 = createDummyTrackOutput(paramInt1, paramInt2);
          }
          return (TrackOutput)localObject1;
        }
        videoSampleQueueMappingDone = true;
        sampleQueueTrackIds[k] = paramInt1;
        return localObject1[k];
      }
      if (tracksEnded) {
        return createDummyTrackOutput(paramInt1, paramInt2);
      }
    }
    else
    {
      for (k = 0; k < i; k++) {
        if (sampleQueueTrackIds[k] == paramInt1) {
          return sampleQueues[k];
        }
      }
      if (tracksEnded) {
        return createDummyTrackOutput(paramInt1, paramInt2);
      }
    }
    localObject1 = new SampleQueue(allocator);
    ((SampleQueue)localObject1).setSampleOffsetUs(sampleOffsetUs);
    ((SampleQueue)localObject1).sourceId(chunkUid);
    ((SampleQueue)localObject1).setUpstreamFormatChangeListener(this);
    Object localObject2 = sampleQueueTrackIds;
    int k = i + 1;
    localObject2 = Arrays.copyOf((int[])localObject2, k);
    sampleQueueTrackIds = ((int[])localObject2);
    localObject2[i] = paramInt1;
    localObject2 = (SampleQueue[])Arrays.copyOf(sampleQueues, k);
    sampleQueues = ((SampleQueue[])localObject2);
    localObject2[i] = localObject1;
    localObject2 = Arrays.copyOf(sampleQueueIsAudioVideoFlags, k);
    sampleQueueIsAudioVideoFlags = ((boolean[])localObject2);
    if ((paramInt2 == 1) || (paramInt2 == 2)) {
      j = 1;
    }
    localObject2[i] = j;
    haveAudioVideoSampleQueues |= j;
    if (paramInt2 == 1)
    {
      audioSampleQueueMappingDone = true;
      audioSampleQueueIndex = i;
    }
    else if (paramInt2 == 2)
    {
      videoSampleQueueMappingDone = true;
      videoSampleQueueIndex = i;
    }
    if (getTrackTypeScore(paramInt2) > getTrackTypeScore(primarySampleQueueType))
    {
      primarySampleQueueIndex = i;
      primarySampleQueueType = paramInt2;
    }
    sampleQueuesEnabledStates = Arrays.copyOf(sampleQueuesEnabledStates, k);
    return (TrackOutput)localObject1;
  }
  
  public void unbindSampleQueue(int paramInt)
  {
    paramInt = trackGroupToSampleQueueIndex[paramInt];
    Assertions.checkState(sampleQueuesEnabledStates[paramInt]);
    sampleQueuesEnabledStates[paramInt] = false;
  }
  
  public static abstract interface Callback
    extends SequenceableLoader.Callback<HlsSampleStreamWrapper>
  {
    public abstract void onPlaylistRefreshRequired(HlsMasterPlaylist.HlsUrl paramHlsUrl);
    
    public abstract void onPrepared();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */