package com.facebook.imagepipeline.cache;

import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.MediaVariations;
import com.facebook.imagepipeline.request.MediaVariations.Builder;

public abstract interface MediaVariationsIndex
{
  public abstract Task<MediaVariations> getCachedVariants(String paramString, MediaVariations.Builder paramBuilder);
  
  public abstract void saveCachedVariant(String paramString, ImageRequest.CacheChoice paramCacheChoice, CacheKey paramCacheKey, EncodedImage paramEncodedImage);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MediaVariationsIndex
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */