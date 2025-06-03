package com.google.android.exoplayer2.upstream.cache;

public abstract interface Cache$Listener
{
  public abstract void onSpanAdded(Cache paramCache, CacheSpan paramCacheSpan);
  
  public abstract void onSpanRemoved(Cache paramCache, CacheSpan paramCacheSpan);
  
  public abstract void onSpanTouched(Cache paramCache, CacheSpan paramCacheSpan1, CacheSpan paramCacheSpan2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.Cache.Listener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */