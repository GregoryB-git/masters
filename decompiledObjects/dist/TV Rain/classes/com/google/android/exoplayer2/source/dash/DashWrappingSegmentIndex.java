package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;

public final class DashWrappingSegmentIndex
  implements DashSegmentIndex
{
  private final ChunkIndex chunkIndex;
  private final long timeOffsetUs;
  
  public DashWrappingSegmentIndex(ChunkIndex paramChunkIndex, long paramLong)
  {
    chunkIndex = paramChunkIndex;
    timeOffsetUs = paramLong;
  }
  
  public long getDurationUs(long paramLong1, long paramLong2)
  {
    return chunkIndex.durationsUs[((int)paramLong1)];
  }
  
  public long getFirstSegmentNum()
  {
    return 0L;
  }
  
  public int getSegmentCount(long paramLong)
  {
    return chunkIndex.length;
  }
  
  public long getSegmentNum(long paramLong1, long paramLong2)
  {
    return chunkIndex.getChunkIndex(paramLong1 + timeOffsetUs);
  }
  
  public RangedUri getSegmentUrl(long paramLong)
  {
    ChunkIndex localChunkIndex = chunkIndex;
    long[] arrayOfLong = offsets;
    int i = (int)paramLong;
    return new RangedUri(null, arrayOfLong[i], sizes[i]);
  }
  
  public long getTimeUs(long paramLong)
  {
    return chunkIndex.timesUs[((int)paramLong)] - timeOffsetUs;
  }
  
  public boolean isExplicit()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */