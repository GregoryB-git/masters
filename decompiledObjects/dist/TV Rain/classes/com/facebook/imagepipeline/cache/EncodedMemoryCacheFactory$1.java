package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;

final class EncodedMemoryCacheFactory$1
  implements MemoryCacheTracker<CacheKey>
{
  public EncodedMemoryCacheFactory$1(ImageCacheStatsTracker paramImageCacheStatsTracker) {}
  
  public void onCacheHit(CacheKey paramCacheKey)
  {
    val$imageCacheStatsTracker.onMemoryCacheHit(paramCacheKey);
  }
  
  public void onCacheMiss()
  {
    val$imageCacheStatsTracker.onMemoryCacheMiss();
  }
  
  public void onCachePut()
  {
    val$imageCacheStatsTracker.onMemoryCachePut();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.EncodedMemoryCacheFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */