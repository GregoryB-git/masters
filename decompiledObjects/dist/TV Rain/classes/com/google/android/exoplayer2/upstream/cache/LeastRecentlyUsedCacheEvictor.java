package com.google.android.exoplayer2.upstream.cache;

import java.util.Comparator;
import java.util.TreeSet;

public final class LeastRecentlyUsedCacheEvictor
  implements CacheEvictor, Comparator<CacheSpan>
{
  private long currentSize;
  private final TreeSet<CacheSpan> leastRecentlyUsed;
  private final long maxBytes;
  
  public LeastRecentlyUsedCacheEvictor(long paramLong)
  {
    maxBytes = paramLong;
    leastRecentlyUsed = new TreeSet(this);
  }
  
  private void evictCache(Cache paramCache, long paramLong)
  {
    for (;;)
    {
      if ((currentSize + paramLong > maxBytes) && (!leastRecentlyUsed.isEmpty())) {}
      try
      {
        paramCache.removeSpan((CacheSpan)leastRecentlyUsed.first());
      }
      catch (Cache.CacheException localCacheException) {}
      return;
    }
  }
  
  public int compare(CacheSpan paramCacheSpan1, CacheSpan paramCacheSpan2)
  {
    long l1 = lastAccessTimestamp;
    long l2 = lastAccessTimestamp;
    if (l1 - l2 == 0L) {
      return paramCacheSpan1.compareTo(paramCacheSpan2);
    }
    int i;
    if (l1 < l2) {
      i = -1;
    } else {
      i = 1;
    }
    return i;
  }
  
  public void onCacheInitialized() {}
  
  public void onSpanAdded(Cache paramCache, CacheSpan paramCacheSpan)
  {
    leastRecentlyUsed.add(paramCacheSpan);
    currentSize += length;
    evictCache(paramCache, 0L);
  }
  
  public void onSpanRemoved(Cache paramCache, CacheSpan paramCacheSpan)
  {
    leastRecentlyUsed.remove(paramCacheSpan);
    currentSize -= length;
  }
  
  public void onSpanTouched(Cache paramCache, CacheSpan paramCacheSpan1, CacheSpan paramCacheSpan2)
  {
    onSpanRemoved(paramCache, paramCacheSpan1);
    onSpanAdded(paramCache, paramCacheSpan2);
  }
  
  public void onStartFile(Cache paramCache, String paramString, long paramLong1, long paramLong2)
  {
    evictCache(paramCache, paramLong2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */