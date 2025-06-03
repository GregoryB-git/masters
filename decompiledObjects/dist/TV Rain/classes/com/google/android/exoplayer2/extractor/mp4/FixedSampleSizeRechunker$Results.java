package com.google.android.exoplayer2.extractor.mp4;

public final class FixedSampleSizeRechunker$Results
{
  public final long duration;
  public final int[] flags;
  public final int maximumSize;
  public final long[] offsets;
  public final int[] sizes;
  public final long[] timestamps;
  
  private FixedSampleSizeRechunker$Results(long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
  {
    offsets = paramArrayOfLong1;
    sizes = paramArrayOfInt1;
    maximumSize = paramInt;
    timestamps = paramArrayOfLong2;
    flags = paramArrayOfInt2;
    duration = paramLong;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker.Results
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */