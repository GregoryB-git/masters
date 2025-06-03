package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public final class CachedRegionTracker
  implements Cache.Listener
{
  public static final int CACHED_TO_END = -2;
  public static final int NOT_CACHED = -1;
  private static final String TAG = "CachedRegionTracker";
  private final Cache cache;
  private final String cacheKey;
  private final ChunkIndex chunkIndex;
  private final Region lookupRegion;
  private final TreeSet<Region> regions;
  
  public CachedRegionTracker(Cache paramCache, String paramString, ChunkIndex paramChunkIndex)
  {
    cache = paramCache;
    cacheKey = paramString;
    chunkIndex = paramChunkIndex;
    regions = new TreeSet();
    lookupRegion = new Region(0L, 0L);
    try
    {
      paramCache = paramCache.addListener(paramString, this).descendingIterator();
      while (paramCache.hasNext()) {
        mergeSpan((CacheSpan)paramCache.next());
      }
      return;
    }
    finally {}
  }
  
  private void mergeSpan(CacheSpan paramCacheSpan)
  {
    long l = position;
    Region localRegion = new Region(l, length + l);
    paramCacheSpan = (Region)regions.floor(localRegion);
    Object localObject = (Region)regions.ceiling(localRegion);
    boolean bool = regionsConnect(paramCacheSpan, localRegion);
    if (regionsConnect(localRegion, (Region)localObject))
    {
      if (bool)
      {
        endOffset = endOffset;
        endOffsetIndex = endOffsetIndex;
      }
      else
      {
        endOffset = endOffset;
        endOffsetIndex = endOffsetIndex;
        regions.add(localRegion);
      }
      regions.remove(localObject);
    }
    else
    {
      int i;
      int j;
      if (bool)
      {
        endOffset = endOffset;
        for (i = endOffsetIndex;; i = j)
        {
          localObject = chunkIndex;
          if (i >= length - 1) {
            break;
          }
          localObject = offsets;
          j = i + 1;
          if (localObject[j] > endOffset) {
            break;
          }
        }
        endOffsetIndex = i;
      }
      else
      {
        j = Arrays.binarySearch(chunkIndex.offsets, endOffset);
        i = j;
        if (j < 0) {
          i = -j - 2;
        }
        endOffsetIndex = i;
        regions.add(localRegion);
      }
    }
  }
  
  private boolean regionsConnect(Region paramRegion1, Region paramRegion2)
  {
    boolean bool;
    if ((paramRegion1 != null) && (paramRegion2 != null) && (endOffset == startOffset)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getRegionEndTimeMs(long paramLong)
  {
    try
    {
      Object localObject1 = lookupRegion;
      startOffset = paramLong;
      localObject1 = (Region)regions.floor(localObject1);
      if (localObject1 != null)
      {
        long l = endOffset;
        if (paramLong <= l)
        {
          int i = endOffsetIndex;
          if (i != -1)
          {
            localObject1 = chunkIndex;
            if (i == length - 1)
            {
              paramLong = offsets[i];
              int j = sizes[i];
              if (l == paramLong + j) {
                return -2;
              }
            }
            paramLong = durationsUs[i] * (l - offsets[i]) / sizes[i];
            paramLong = (timesUs[i] + paramLong) / 1000L;
            i = (int)paramLong;
            return i;
          }
        }
      }
      return -1;
    }
    finally {}
  }
  
  public void onSpanAdded(Cache paramCache, CacheSpan paramCacheSpan)
  {
    try
    {
      mergeSpan(paramCacheSpan);
      return;
    }
    finally
    {
      paramCache = finally;
      throw paramCache;
    }
  }
  
  public void onSpanRemoved(Cache paramCache, CacheSpan paramCacheSpan)
  {
    try
    {
      paramCache = new com/google/android/exoplayer2/upstream/cache/CachedRegionTracker$Region;
      long l1 = position;
      paramCache.<init>(l1, length + l1);
      paramCacheSpan = (Region)regions.floor(paramCache);
      if (paramCacheSpan == null)
      {
        Log.e("CachedRegionTracker", "Removed a span we were not aware of");
        return;
      }
      regions.remove(paramCacheSpan);
      long l2 = startOffset;
      l1 = startOffset;
      if (l2 < l1)
      {
        Region localRegion = new com/google/android/exoplayer2/upstream/cache/CachedRegionTracker$Region;
        localRegion.<init>(l2, l1);
        int i = Arrays.binarySearch(chunkIndex.offsets, endOffset);
        int j = i;
        if (i < 0) {
          j = -i - 2;
        }
        endOffsetIndex = j;
        regions.add(localRegion);
      }
      l1 = endOffset;
      l2 = endOffset;
      if (l1 > l2)
      {
        paramCache = new com/google/android/exoplayer2/upstream/cache/CachedRegionTracker$Region;
        paramCache.<init>(l2 + 1L, l1);
        endOffsetIndex = endOffsetIndex;
        regions.add(paramCache);
      }
      return;
    }
    finally {}
  }
  
  public void onSpanTouched(Cache paramCache, CacheSpan paramCacheSpan1, CacheSpan paramCacheSpan2) {}
  
  public void release()
  {
    cache.removeListener(cacheKey, this);
  }
  
  public static class Region
    implements Comparable<Region>
  {
    public long endOffset;
    public int endOffsetIndex;
    public long startOffset;
    
    public Region(long paramLong1, long paramLong2)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CachedRegionTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */