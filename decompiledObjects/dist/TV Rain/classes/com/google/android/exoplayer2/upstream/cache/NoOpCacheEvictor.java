package com.google.android.exoplayer2.upstream.cache;

public final class NoOpCacheEvictor
  implements CacheEvictor
{
  public void onCacheInitialized() {}
  
  public void onSpanAdded(Cache paramCache, CacheSpan paramCacheSpan) {}
  
  public void onSpanRemoved(Cache paramCache, CacheSpan paramCacheSpan) {}
  
  public void onSpanTouched(Cache paramCache, CacheSpan paramCacheSpan1, CacheSpan paramCacheSpan2) {}
  
  public void onStartFile(Cache paramCache, String paramString, long paramLong1, long paramLong2) {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */