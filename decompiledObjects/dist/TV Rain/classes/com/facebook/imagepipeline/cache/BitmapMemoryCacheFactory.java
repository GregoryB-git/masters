package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.CloseableImage;

public class BitmapMemoryCacheFactory
{
  public static MemoryCache<CacheKey, CloseableImage> get(CountingMemoryCache<CacheKey, CloseableImage> paramCountingMemoryCache, ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    paramImageCacheStatsTracker.registerBitmapMemoryCache(paramCountingMemoryCache);
    new InstrumentedMemoryCache(paramCountingMemoryCache, new MemoryCacheTracker()
    {
      public void onCacheHit(CacheKey paramAnonymousCacheKey)
      {
        val$imageCacheStatsTracker.onBitmapCacheHit(paramAnonymousCacheKey);
      }
      
      public void onCacheMiss()
      {
        val$imageCacheStatsTracker.onBitmapCacheMiss();
      }
      
      public void onCachePut()
      {
        val$imageCacheStatsTracker.onBitmapCachePut();
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */