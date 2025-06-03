package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

public final class ChunkSampleStream$EmbeddedSampleStream
  implements SampleStream
{
  private final int index;
  private boolean notifiedDownstreamFormat;
  public final ChunkSampleStream<T> parent;
  private final SampleQueue sampleQueue;
  
  public ChunkSampleStream$EmbeddedSampleStream(ChunkSampleStream<T> paramChunkSampleStream, SampleQueue paramSampleQueue, int paramInt)
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
      ChunkSampleStream.access$400(this$0).downstreamFormatChanged(ChunkSampleStream.access$100(this$0)[index], ChunkSampleStream.access$200(this$0)[index], 0, null, ChunkSampleStream.access$300(this$0));
      notifiedDownstreamFormat = true;
    }
  }
  
  public boolean isReady()
  {
    ChunkSampleStream localChunkSampleStream = this$0;
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
    if (this$0.isPendingReset()) {
      return -3;
    }
    maybeNotifyDownstreamFormat();
    SampleQueue localSampleQueue = sampleQueue;
    ChunkSampleStream localChunkSampleStream = this$0;
    return localSampleQueue.read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean, loadingFinished, decodeOnlyUntilPositionUs);
  }
  
  public void release()
  {
    Assertions.checkState(ChunkSampleStream.access$000(this$0)[index]);
    ChunkSampleStream.access$000(this$0)[index] = 0;
  }
  
  public int skipData(long paramLong)
  {
    boolean bool = this$0.isPendingReset();
    int i = 0;
    if (bool) {
      return 0;
    }
    maybeNotifyDownstreamFormat();
    int j;
    if ((this$0.loadingFinished) && (paramLong > sampleQueue.getLargestQueuedTimestampUs()))
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.chunk.ChunkSampleStream.EmbeddedSampleStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */