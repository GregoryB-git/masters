package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.Util;

final class FixedSampleSizeRechunker
{
  private static final int MAX_SAMPLE_SIZE = 8192;
  
  public static Results rechunk(int paramInt, long[] paramArrayOfLong, int[] paramArrayOfInt, long paramLong)
  {
    int i = 8192 / paramInt;
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    int n = m;
    while (m < j)
    {
      n += Util.ceilDivide(paramArrayOfInt[m], i);
      m++;
    }
    long[] arrayOfLong1 = new long[n];
    int[] arrayOfInt1 = new int[n];
    long[] arrayOfLong2 = new long[n];
    int[] arrayOfInt2 = new int[n];
    j = 0;
    n = j;
    int i1 = n;
    m = n;
    for (n = k; n < paramArrayOfInt.length; n++)
    {
      k = paramArrayOfInt[n];
      long l = paramArrayOfLong[n];
      while (k > 0)
      {
        int i2 = Math.min(i, k);
        arrayOfLong1[m] = l;
        int i3 = paramInt * i2;
        arrayOfInt1[m] = i3;
        i1 = Math.max(i1, i3);
        arrayOfLong2[m] = (j * paramLong);
        arrayOfInt2[m] = 1;
        l += arrayOfInt1[m];
        j += i2;
        k -= i2;
        m++;
      }
    }
    return new Results(arrayOfLong1, arrayOfInt1, i1, arrayOfLong2, arrayOfInt2, paramLong * j, null);
  }
  
  public static final class Results
  {
    public final long duration;
    public final int[] flags;
    public final int maximumSize;
    public final long[] offsets;
    public final int[] sizes;
    public final long[] timestamps;
    
    private Results(long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
    {
      offsets = paramArrayOfLong1;
      sizes = paramArrayOfInt1;
      maximumSize = paramInt;
      timestamps = paramArrayOfLong2;
      flags = paramArrayOfInt2;
      duration = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.FixedSampleSizeRechunker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */