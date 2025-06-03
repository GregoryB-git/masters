package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;

class MediaVariationsIndexDatabase$2
  implements Runnable
{
  public MediaVariationsIndexDatabase$2(MediaVariationsIndexDatabase paramMediaVariationsIndexDatabase, String paramString, ImageRequest.CacheChoice paramCacheChoice, CacheKey paramCacheKey, EncodedImage paramEncodedImage) {}
  
  public void run()
  {
    this$0.saveCachedVariantSync(val$mediaId, val$cacheChoice, val$cacheKey, val$encodedImage);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndexDatabase.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */