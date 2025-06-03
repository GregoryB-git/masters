package com.google.android.exoplayer2.upstream.cache;

public class CacheUtil$CachingCounters
{
  public volatile long alreadyCachedBytes;
  public volatile long contentLength = -1L;
  public volatile long newlyCachedBytes;
  
  public long totalCachedBytes()
  {
    return alreadyCachedBytes + newlyCachedBytes;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheUtil.CachingCounters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */