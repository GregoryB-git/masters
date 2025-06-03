package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSpec;

public abstract interface CacheKeyFactory
{
  public abstract String buildCacheKey(DataSpec paramDataSpec);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheKeyFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */