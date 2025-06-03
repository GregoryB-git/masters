package com.google.android.exoplayer2.source.chunk;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.SequenceableLoader.Callback;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.Loader.Callback;
import com.google.android.exoplayer2.upstream.Loader.LoadErrorAction;
import com.google.android.exoplayer2.upstream.Loader.Loadable;
import com.google.android.exoplayer2.upstream.Loader.ReleaseCallback;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChunkSampleStream<T extends ChunkSource>
  implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback
{
  private static final String TAG = "ChunkSampleStream";
  private final SequenceableLoader.Callback<ChunkSampleStream<T>> callback;
  private final T chunkSource;
  public long decodeOnlyUntilPositionUs;
  private final SampleQueue[] embeddedSampleQueues;
  private final Format[] embeddedTrackFormats;
  private final int[] embeddedTrackTypes;
  private final boolean[] embeddedTracksSelected;
  private final MediaSourceEventListener.EventDispatcher eventDispatcher;
  private long lastSeekPositionUs;
  private final LoadErrorHandlingPolicy loadErrorHandlingPolicy;
  private final Loader loader;
  public boolean loadingFinished;
  private final BaseMediaChunkOutput mediaChunkOutput;
  private final ArrayList<BaseMediaChunk> mediaChunks;
  private final ChunkHolder nextChunkHolder;
  private int nextNotifyPrimaryFormatMediaChunkIndex;
  private long pendingResetPositionUs;
  private Format primaryDownstreamTrackFormat;
  private final SampleQueue primarySampleQueue;
  public final int primaryTrackType;
  private final List<BaseMediaChunk> readOnlyMediaChunks;
  @Nullable
  private ReleaseCallback<T> releaseCallback;
  
  @Deprecated
  public ChunkSampleStream(int paramInt1, int[] paramArrayOfInt, Format[] paramArrayOfFormat, T paramT, SequenceableLoader.Callback<ChunkSampleStream<T>> paramCallback, Allocator paramAllocator, long paramLong, int paramInt2, MediaSourceEventListener.EventDispatcher paramEventDispatcher)
  {
    this(paramInt1, paramArrayOfInt, paramArrayOfFormat, paramT, paramCallback, paramAllocator, paramLong, new DefaultLoadErrorHandlingPolicy(paramInt2), paramEventDispatcher);
  }
  
  public ChunkSampleStream(int paramInt, int[] paramArrayOfInt, Format[] paramArrayOfFormat, T paramT, SequenceableLoader.Callback<ChunkSampleStream<T>> paramCallback, Allocator paramAllocator, long paramLong, LoadErrorHandlingPolicy paramLoadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher paramEventDispatcher)
  {
    primaryTrackType = paramInt;
    embeddedTrackTypes = paramArrayOfInt;
    embeddedTrackFormats = paramArrayOfFormat;
    chunkSource = paramT;
    callback = paramCallback;
    eventDispatcher = paramEventDispatcher;
    loadErrorHandlingPolicy = paramLoadErrorHandlingPolicy;
    loader = new Loader("Loader:ChunkSampleStream");
    nextChunkHolder = new ChunkHolder();
    paramArrayOfFormat = new ArrayList();
    mediaChunks = paramArrayOfFormat;
    readOnlyMediaChunks = Collections.unmodifiableList(paramArrayOfFormat);
    int i = 0;
    int j;
    if (paramArrayOfInt == null) {
      j = 0;
    } else {
      j = paramArrayOfInt.length;
    }
    embeddedSampleQueues = new SampleQueue[j];
    embeddedTracksSelected = new boolean[j];
    int k = j + 1;
    paramT = new int[k];
    paramArrayOfFormat = new SampleQueue[k];
    paramCallback = new SampleQueue(paramAllocator);
    primarySampleQueue = paramCallback;
    paramT[0] = paramInt;
    paramArrayOfFormat[0] = paramCallback;
    for (paramInt = i; paramInt < j; paramInt = i)
    {
      paramCallback = new SampleQueue(paramAllocator);
      embeddedSampleQueues[paramInt] = paramCallback;
      i = paramInt + 1;
      paramArrayOfFormat[i] = paramCallback;
      paramT[i] = paramArrayOfInt[paramInt];
    }
    mediaChunkOutput = new BaseMediaChunkOutput(paramT, paramArrayOfFormat);
    pendingResetPositionUs = paramLong;
    lastSeekPositionUs = paramLong;
  }
  
  private void discardDownstreamMediaChunks(int paramInt)
  {
    paramInt = Math.min(primarySampleIndexToMediaChunkIndex(paramInt, 0), nextNotifyPrimaryFormatMediaChunkIndex);
    if (paramInt > 0)
    {
      Util.removeRange(mediaChunks, 0, paramInt);
      nextNotifyPrimaryFormatMediaChunkIndex -= paramInt;
    }
  }
  
  private BaseMediaChunk discardUpstreamMediaChunksFromIndex(int paramInt)
  {
    BaseMediaChunk localBaseMediaChunk = (BaseMediaChunk)mediaChunks.get(paramInt);
    Object localObject = mediaChunks;
    Util.removeRange((List)localObject, paramInt, ((ArrayList)localObject).size());
    nextNotifyPrimaryFormatMediaChunkIndex = Math.max(nextNotifyPrimaryFormatMediaChunkIndex, mediaChunks.size());
    localObject = primarySampleQueue;
    paramInt = 0;
    ((SampleQueue)localObject).discardUpstreamSamples(localBaseMediaChunk.getFirstSampleIndex(0));
    for (;;)
    {
      localObject = embeddedSampleQueues;
      if (paramInt >= localObject.length) {
        break;
      }
      localObject = localObject[paramInt];
      paramInt++;
      ((SampleQueue)localObject).discardUpstreamSamples(localBaseMediaChunk.getFirstSampleIndex(paramInt));
    }
    return localBaseMediaChunk;
  }
  
  private BaseMediaChunk getLastMediaChunk()
  {
    ArrayList localArrayList = mediaChunks;
    return (BaseMediaChunk)localArrayList.get(localArrayList.size() - 1);
  }
  
  private boolean haveReadFromMediaChunk(int paramInt)
  {
    BaseMediaChunk localBaseMediaChunk = (BaseMediaChunk)mediaChunks.get(paramInt);
    if (primarySampleQueue.getReadIndex() > localBaseMediaChunk.getFirstSampleIndex(0)) {
      return true;
    }
    paramInt = 0;
    int i;
    int j;
    do
    {
      SampleQueue[] arrayOfSampleQueue = embeddedSampleQueues;
      if (paramInt >= arrayOfSampleQueue.length) {
        break;
      }
      i = arrayOfSampleQueue[paramInt].getReadIndex();
      j = paramInt + 1;
      paramInt = j;
    } while (i <= localBaseMediaChunk.getFirstSampleIndex(j));
    return true;
    return false;
  }
  
  private boolean isMediaChunk(Chunk paramChunk)
  {
    return paramChunk instanceof BaseMediaChunk;
  }
  
  private void maybeNotifyPrimaryTrackFormatChanged()
  {
    int i = primarySampleIndexToMediaChunkIndex(primarySampleQueue.getReadIndex(), nextNotifyPrimaryFormatMediaChunkIndex - 1);
    for (;;)
    {
      int j = nextNotifyPrimaryFormatMediaChunkIndex;
      if (j > i) {
        break;
      }
      nextNotifyPrimaryFormatMediaChunkIndex = (j + 1);
      maybeNotifyPrimaryTrackFormatChanged(j);
    }
  }
  
  private void maybeNotifyPrimaryTrackFormatChanged(int paramInt)
  {
    BaseMediaChunk localBaseMediaChunk = (BaseMediaChunk)mediaChunks.get(paramInt);
    Format localFormat = trackFormat;
    if (!localFormat.equals(primaryDownstreamTrackFormat)) {
      eventDispatcher.downstreamFormatChanged(primaryTrackType, localFormat, trackSelectionReason, trackSelectionData, startTimeUs);
    }
    primaryDownstreamTrackFormat = localFormat;
  }
  
  private int primarySampleIndexToMediaChunkIndex(int paramInt1, int paramInt2)
  {
    int i;
    do
    {
      i = paramInt2 + 1;
      if (i >= mediaChunks.size()) {
        break;
      }
      paramInt2 = i;
    } while (((BaseMediaChunk)mediaChunks.get(i)).getFirstSampleIndex(0) <= paramInt1);
    return i - 1;
    return mediaChunks.size() - 1;
  }
  
  public boolean continueLoading(long paramLong)
  {
    boolean bool1 = loadingFinished;
    int i = 0;
    if ((!bool1) && (!loader.isLoading()))
    {
      bool1 = isPendingReset();
      long l;
      if (bool1)
      {
        localObject1 = Collections.emptyList();
        l = pendingResetPositionUs;
      }
      else
      {
        localObject1 = readOnlyMediaChunks;
        l = getLastMediaChunkendTimeUs;
      }
      chunkSource.getNextChunk(paramLong, l, (List)localObject1, nextChunkHolder);
      Object localObject2 = nextChunkHolder;
      boolean bool2 = endOfStream;
      Object localObject1 = chunk;
      ((ChunkHolder)localObject2).clear();
      if (bool2)
      {
        pendingResetPositionUs = -9223372036854775807L;
        loadingFinished = true;
        return true;
      }
      if (localObject1 == null) {
        return false;
      }
      if (isMediaChunk((Chunk)localObject1))
      {
        localObject2 = (BaseMediaChunk)localObject1;
        if (bool1)
        {
          l = startTimeUs;
          paramLong = pendingResetPositionUs;
          if (l == paramLong) {
            i = 1;
          }
          if (i != 0) {
            paramLong = 0L;
          }
          decodeOnlyUntilPositionUs = paramLong;
          pendingResetPositionUs = -9223372036854775807L;
        }
        ((BaseMediaChunk)localObject2).init(mediaChunkOutput);
        mediaChunks.add(localObject2);
      }
      paramLong = loader.startLoading((Loader.Loadable)localObject1, this, loadErrorHandlingPolicy.getMinimumLoadableRetryCount(type));
      eventDispatcher.loadStarted(dataSpec, type, primaryTrackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong);
      return true;
    }
    return false;
  }
  
  public void discardBuffer(long paramLong, boolean paramBoolean)
  {
    if (isPendingReset()) {
      return;
    }
    int i = primarySampleQueue.getFirstIndex();
    primarySampleQueue.discardTo(paramLong, paramBoolean, true);
    int j = primarySampleQueue.getFirstIndex();
    if (j > i)
    {
      paramLong = primarySampleQueue.getFirstTimestampUs();
      for (i = 0;; i++)
      {
        SampleQueue[] arrayOfSampleQueue = embeddedSampleQueues;
        if (i >= arrayOfSampleQueue.length) {
          break;
        }
        arrayOfSampleQueue[i].discardTo(paramLong, paramBoolean, embeddedTracksSelected[i]);
      }
    }
    discardDownstreamMediaChunks(j);
  }
  
  public long getAdjustedSeekPositionUs(long paramLong, SeekParameters paramSeekParameters)
  {
    return chunkSource.getAdjustedSeekPositionUs(paramLong, paramSeekParameters);
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
    if (!((MediaChunk)localObject).isLoadCompleted()) {
      if (mediaChunks.size() > 1)
      {
        localObject = mediaChunks;
        localObject = (BaseMediaChunk)((ArrayList)localObject).get(((ArrayList)localObject).size() - 2);
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
    return Math.max(l2, primarySampleQueue.getLargestQueuedTimestampUs());
  }
  
  public T getChunkSource()
  {
    return chunkSource;
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
  
  public boolean isPendingReset()
  {
    boolean bool;
    if (pendingResetPositionUs != -9223372036854775807L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isReady()
  {
    boolean bool;
    if ((!loadingFinished) && ((isPendingReset()) || (!primarySampleQueue.hasNextSample()))) {
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
    if (!loader.isLoading()) {
      chunkSource.maybeThrowError();
    }
  }
  
  public void onLoadCanceled(Chunk paramChunk, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    eventDispatcher.loadCanceled(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, primaryTrackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, paramChunk.bytesLoaded());
    if (!paramBoolean)
    {
      primarySampleQueue.reset();
      paramChunk = embeddedSampleQueues;
      int i = paramChunk.length;
      for (int j = 0; j < i; j++) {
        paramChunk[j].reset();
      }
      callback.onContinueLoadingRequested(this);
    }
  }
  
  public void onLoadCompleted(Chunk paramChunk, long paramLong1, long paramLong2)
  {
    chunkSource.onChunkLoadCompleted(paramChunk);
    eventDispatcher.loadCompleted(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, primaryTrackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, paramChunk.bytesLoaded());
    callback.onContinueLoadingRequested(this);
  }
  
  public Loader.LoadErrorAction onLoadError(Chunk paramChunk, long paramLong1, long paramLong2, IOException paramIOException, int paramInt)
  {
    long l1 = paramChunk.bytesLoaded();
    boolean bool1 = isMediaChunk(paramChunk);
    int i = mediaChunks.size() - 1;
    if ((l1 != 0L) && (bool1) && (haveReadFromMediaChunk(i))) {
      bool2 = false;
    } else {
      bool2 = true;
    }
    long l2;
    if (bool2) {
      l2 = loadErrorHandlingPolicy.getBlacklistDurationMsFor(type, paramLong2, paramIOException, paramInt);
    } else {
      l2 = -9223372036854775807L;
    }
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (chunkSource.onChunkLoadError(paramChunk, bool2, paramIOException, l2)) {
      if (bool2)
      {
        localObject1 = Loader.DONT_RETRY;
        localObject2 = localObject1;
        if (bool1)
        {
          if (discardUpstreamMediaChunksFromIndex(i) == paramChunk) {
            bool2 = true;
          } else {
            bool2 = false;
          }
          Assertions.checkState(bool2);
          localObject2 = localObject1;
          if (mediaChunks.isEmpty())
          {
            pendingResetPositionUs = lastSeekPositionUs;
            localObject2 = localObject1;
          }
        }
      }
      else
      {
        Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        localObject2 = localObject1;
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      l2 = loadErrorHandlingPolicy.getRetryDelayMsFor(type, paramLong2, paramIOException, paramInt);
      if (l2 != -9223372036854775807L) {
        localObject2 = Loader.createRetryAction(false, l2);
      } else {
        localObject2 = Loader.DONT_RETRY_FATAL;
      }
      localObject1 = localObject2;
    }
    boolean bool2 = ((Loader.LoadErrorAction)localObject1).isRetry() ^ true;
    eventDispatcher.loadError(dataSpec, paramChunk.getUri(), paramChunk.getResponseHeaders(), type, primaryTrackType, trackFormat, trackSelectionReason, trackSelectionData, startTimeUs, endTimeUs, paramLong1, paramLong2, l1, paramIOException, bool2);
    if (bool2) {
      callback.onContinueLoadingRequested(this);
    }
    return (Loader.LoadErrorAction)localObject1;
  }
  
  public void onLoaderReleased()
  {
    primarySampleQueue.reset();
    Object localObject = embeddedSampleQueues;
    int i = localObject.length;
    for (int j = 0; j < i; j++) {
      localObject[j].reset();
    }
    localObject = releaseCallback;
    if (localObject != null) {
      ((ReleaseCallback)localObject).onSampleStreamReleased(this);
    }
  }
  
  public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
  {
    if (isPendingReset()) {
      return -3;
    }
    maybeNotifyPrimaryTrackFormatChanged();
    return primarySampleQueue.read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean, loadingFinished, decodeOnlyUntilPositionUs);
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    if ((!loader.isLoading()) && (!isPendingReset()))
    {
      int i = mediaChunks.size();
      int j = chunkSource.getPreferredQueueSize(paramLong, readOnlyMediaChunks);
      int k = j;
      if (i <= j) {
        return;
      }
      while (k < i)
      {
        if (!haveReadFromMediaChunk(k)) {
          break label82;
        }
        k++;
      }
      k = i;
      label82:
      if (k == i) {
        return;
      }
      paramLong = getLastMediaChunkendTimeUs;
      BaseMediaChunk localBaseMediaChunk = discardUpstreamMediaChunksFromIndex(k);
      if (mediaChunks.isEmpty()) {
        pendingResetPositionUs = lastSeekPositionUs;
      }
      loadingFinished = false;
      eventDispatcher.upstreamDiscarded(primaryTrackType, startTimeUs, paramLong);
    }
  }
  
  public void release()
  {
    release(null);
  }
  
  public void release(@Nullable ReleaseCallback<T> paramReleaseCallback)
  {
    releaseCallback = paramReleaseCallback;
    primarySampleQueue.discardToEnd();
    paramReleaseCallback = embeddedSampleQueues;
    int i = paramReleaseCallback.length;
    for (int j = 0; j < i; j++) {
      paramReleaseCallback[j].discardToEnd();
    }
    loader.release(this);
  }
  
  public void seekToUs(long paramLong)
  {
    lastSeekPositionUs = paramLong;
    if (isPendingReset())
    {
      pendingResetPositionUs = paramLong;
      return;
    }
    Object localObject1 = null;
    int i = 0;
    Object localObject2;
    for (int j = 0;; j++)
    {
      localObject2 = localObject1;
      if (j >= mediaChunks.size()) {
        break;
      }
      localObject2 = (BaseMediaChunk)mediaChunks.get(j);
      boolean bool1 = startTimeUs < paramLong;
      if ((!bool1) && (clippedStartTimeUs == -9223372036854775807L)) {
        break;
      }
      if (bool1)
      {
        localObject2 = localObject1;
        break;
      }
    }
    primarySampleQueue.rewind();
    boolean bool2;
    if (localObject2 != null)
    {
      bool2 = primarySampleQueue.setReadPosition(((BaseMediaChunk)localObject2).getFirstSampleIndex(0));
      decodeOnlyUntilPositionUs = 0L;
    }
    else
    {
      localObject2 = primarySampleQueue;
      if (paramLong < getNextLoadPositionUs()) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (((SampleQueue)localObject2).advanceTo(paramLong, true, bool2) != -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      decodeOnlyUntilPositionUs = lastSeekPositionUs;
    }
    if (bool2)
    {
      nextNotifyPrimaryFormatMediaChunkIndex = primarySampleIndexToMediaChunkIndex(primarySampleQueue.getReadIndex(), 0);
      for (localObject1 : embeddedSampleQueues)
      {
        ((SampleQueue)localObject1).rewind();
        ((SampleQueue)localObject1).advanceTo(paramLong, true, false);
      }
    }
    pendingResetPositionUs = paramLong;
    loadingFinished = false;
    mediaChunks.clear();
    nextNotifyPrimaryFormatMediaChunkIndex = 0;
    if (loader.isLoading())
    {
      loader.cancelLoading();
    }
    else
    {
      primarySampleQueue.reset();
      localObject2 = embeddedSampleQueues;
      int k = localObject2.length;
      for (j = i; j < k; j++) {
        localObject2[j].reset();
      }
    }
  }
  
  public ChunkSampleStream<T>.EmbeddedSampleStream selectEmbeddedTrack(long paramLong, int paramInt)
  {
    for (int i = 0; i < embeddedSampleQueues.length; i++) {
      if (embeddedTrackTypes[i] == paramInt)
      {
        Assertions.checkState(embeddedTracksSelected[i] ^ 0x1);
        embeddedTracksSelected[i] = true;
        embeddedSampleQueues[i].rewind();
        embeddedSampleQueues[i].advanceTo(paramLong, true, true);
        return new EmbeddedSampleStream(this, embeddedSampleQueues[i], i);
      }
    }
    throw new IllegalStateException();
  }
  
  public int skipData(long paramLong)
  {
    boolean bool = isPendingReset();
    int i = 0;
    if (bool) {
      return 0;
    }
    int j;
    if ((loadingFinished) && (paramLong > primarySampleQueue.getLargestQueuedTimestampUs()))
    {
      j = primarySampleQueue.advanceToEnd();
    }
    else
    {
      j = primarySampleQueue.advanceTo(paramLong, true, true);
      if (j == -1) {
        j = i;
      }
    }
    maybeNotifyPrimaryTrackFormatChanged();
    return j;
  }
  
  public final class EmbeddedSampleStream
    implements SampleStream
  {
    private final int index;
    private boolean notifiedDownstreamFormat;
    public final ChunkSampleStream<T> parent;
    private final SampleQueue sampleQueue;
    
    public EmbeddedSampleStream(SampleQueue paramSampleQueue, int paramInt)
    {
      parent = paramSampleQueue;
      sampleQueue = paramInt;
      int i;
      index = i;
    }
    
    private void maybeNotifyDownstreamFormat()
    {
      if (!notifiedDownstreamFormat)
      {
        ChunkSampleStream.access$400(ChunkSampleStream.this).downstreamFormatChanged(ChunkSampleStream.access$100(ChunkSampleStream.this)[index], ChunkSampleStream.access$200(ChunkSampleStream.this)[index], 0, null, ChunkSampleStream.access$300(ChunkSampleStream.this));
        notifiedDownstreamFormat = true;
      }
    }
    
    public boolean isReady()
    {
      ChunkSampleStream localChunkSampleStream = ChunkSampleStream.this;
      boolean bool;
      if ((!loadingFinished) && ((localChunkSampleStream.isPendingReset()) || (!sampleQueue.hasNextSample()))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void maybeThrowError()
      throws IOException
    {}
    
    public int readData(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean)
    {
      if (isPendingReset()) {
        return -3;
      }
      maybeNotifyDownstreamFormat();
      SampleQueue localSampleQueue = sampleQueue;
      ChunkSampleStream localChunkSampleStream = ChunkSampleStream.this;
      return localSampleQueue.read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean, loadingFinished, decodeOnlyUntilPositionUs);
    }
    
    public void release()
    {
      Assertions.checkState(ChunkSampleStream.access$000(ChunkSampleStream.this)[index]);
      ChunkSampleStream.access$000(ChunkSampleStream.this)[index] = 0;
    }
    
    public int skipData(long paramLong)
    {
      boolean bool = isPendingReset();
      int i = 0;
      if (bool) {
        return 0;
      }
      maybeNotifyDownstreamFormat();
      int j;
      if ((loadingFinished) && (paramLong > sampleQueue.getLargestQueuedTimestampUs()))
      {
        j = sampleQueue.advanceToEnd();
      }
      else
      {
        j = sampleQueue.advanceTo(paramLong, true, true);
        if (j == -1) {
          j = i;
        }
      }
      return j;
    }
  }
  
  public static abstract interface ReleaseCallback<T extends ChunkSource>
  {
    public abstract void onSampleStreamReleased(ChunkSampleStream<T> paramChunkSampleStream);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ChunkSampleStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */