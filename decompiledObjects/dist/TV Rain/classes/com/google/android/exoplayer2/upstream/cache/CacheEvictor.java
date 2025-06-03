package com.google.android.exoplayer2.upstream.cache;

public abstract interface CacheEvictor
  extends Cache.Listener
{
  public abstract void onCacheInitialized();
  
  public abstract void onStartFile(Cache paramCache, String paramString, long paramLong1, long paramLong2);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheEvictor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */