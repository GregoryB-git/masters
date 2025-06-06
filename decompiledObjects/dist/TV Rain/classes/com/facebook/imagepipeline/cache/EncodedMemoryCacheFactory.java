package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.PooledByteBuffer;

public class EncodedMemoryCacheFactory
{
  public static MemoryCache<CacheKey, PooledByteBuffer> get(CountingMemoryCache<CacheKey, PooledByteBuffer> paramCountingMemoryCache, ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    paramImageCacheStatsTracker.registerEncodedMemoryCache(paramCountingMemoryCache);
    new InstrumentedMemoryCache(paramCountingMemoryCache, new MemoryCacheTracker()
    {
      public void onCacheHit(CacheKey paramAnonymousCacheKey)
      {
        val$imageCacheStatsTracker.onMemoryCacheHit(paramAnonymousCacheKey);
      }
      
      public void onCacheMiss()
      {
        val$imageCacheStatsTracker.onMemoryCacheMiss();
      }
      
      public void onCachePut()
      {
        val$imageCacheStatsTracker.onMemoryCachePut();
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */