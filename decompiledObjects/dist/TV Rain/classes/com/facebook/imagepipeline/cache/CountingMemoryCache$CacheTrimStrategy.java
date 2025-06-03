package com.facebook.imagepipeline.cache;

import com.facebook.common.memory.MemoryTrimType;

public abstract interface CountingMemoryCache$CacheTrimStrategy
{
  public abstract double getTrimRatio(MemoryTrimType paramMemoryTrimType);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */