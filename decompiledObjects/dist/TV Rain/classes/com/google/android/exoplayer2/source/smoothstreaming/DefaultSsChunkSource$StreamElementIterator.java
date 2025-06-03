package com.google.android.exoplayer2.source.smoothstreaming;

import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifest.StreamElement;
import com.google.android.exoplayer2.upstream.DataSpec;

final class DefaultSsChunkSource$StreamElementIterator
  extends BaseMediaChunkIterator
{
  private final SsManifest.StreamElement streamElement;
  private final int trackIndex;
  
  public DefaultSsChunkSource$StreamElementIterator(SsManifest.StreamElement paramStreamElement, int paramInt1, int paramInt2)
  {
    super(paramInt2, chunkCount - 1);
    streamElement = paramStreamElement;
    trackIndex = paramInt1;
  }
  
  public long getChunkEndTimeUs()
  {
    long l = getChunkStartTimeUs();
    return streamElement.getChunkDurationUs((int)getCurrentIndex()) + l;
  }
  
  public long getChunkStartTimeUs()
  {
    checkInBounds();
    return streamElement.getStartTimeUs((int)getCurrentIndex());
  }
  
  public DataSpec getDataSpec()
  {
    checkInBounds();
    return new DataSpec(streamElement.buildRequestUri(trackIndex, (int)getCurrentIndex()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.smoothstreaming.DefaultSsChunkSource.StreamElementIterator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */