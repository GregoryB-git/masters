package com.facebook.imagepipeline.cache;

public class MemoryCacheParams
{
  public final int maxCacheEntries;
  public final int maxCacheEntrySize;
  public final int maxCacheSize;
  public final int maxEvictionQueueEntries;
  public final int maxEvictionQueueSize;
  
  public MemoryCacheParams(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    maxCacheSize = paramInt1;
    maxCacheEntries = paramInt2;
    maxEvictionQueueSize = paramInt3;
    maxEvictionQueueEntries = paramInt4;
    maxCacheEntrySize = paramInt5;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MemoryCacheParams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */