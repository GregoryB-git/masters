package com.facebook.imagepipeline.core;

import android.net.Uri;
import com.android.internal.util.Predicate;
import com.facebook.cache.common.CacheKey;

class ImagePipeline$6
  implements Predicate<CacheKey>
{
  public ImagePipeline$6(ImagePipeline paramImagePipeline, Uri paramUri) {}
  
  public boolean apply(CacheKey paramCacheKey)
  {
    return paramCacheKey.containsUri(val$uri);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */