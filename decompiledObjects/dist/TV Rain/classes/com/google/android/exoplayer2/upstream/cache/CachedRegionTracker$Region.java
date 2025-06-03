package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;

class CachedRegionTracker$Region
  implements Comparable<Region>
{
  public long endOffset;
  public int endOffsetIndex;
  public long startOffset;
  
  public CachedRegionTracker$Region(long paramLong1, long paramLong2)
  {
    startOffset = paramLong1;
    endOffset = paramLong2;
  }
  
  public int compareTo(@NonNull Region paramRegion)
  {
    long l1 = startOffset;
    long l2 = startOffset;
    int i;
    if (l1 < l2) {
      i = -1;
    } else if (l1 == l2) {
      i = 0;
    } else {
      i = 1;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CachedRegionTracker.Region
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */