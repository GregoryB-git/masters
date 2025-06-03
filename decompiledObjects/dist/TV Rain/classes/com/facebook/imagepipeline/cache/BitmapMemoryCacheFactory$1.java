package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;

final class BitmapMemoryCacheFactory$1
  implements MemoryCacheTracker<CacheKey>
{
  public BitmapMemoryCacheFactory$1(ImageCacheStatsTracker paramImageCacheStatsTracker) {}
  
  public void onCacheHit(CacheKey paramCacheKey)
  {
    val$imageCacheStatsTracker.onBitmapCacheHit(paramCacheKey);
  }
  
  public void onCacheMiss()
  {
    val$imageCacheStatsTracker.onBitmapCacheMiss();
  }
  
  public void onCachePut()
  {
    val$imageCacheStatsTracker.onBitmapCachePut();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapMemoryCacheFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */