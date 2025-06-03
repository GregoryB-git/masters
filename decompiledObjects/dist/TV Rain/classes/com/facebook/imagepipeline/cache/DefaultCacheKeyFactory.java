package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import javax.annotation.Nullable;

public class DefaultCacheKeyFactory
  implements CacheKeyFactory
{
  private static DefaultCacheKeyFactory sInstance;
  
  public static DefaultCacheKeyFactory getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localDefaultCacheKeyFactory = new com/facebook/imagepipeline/cache/DefaultCacheKeyFactory;
        localDefaultCacheKeyFactory.<init>();
        sInstance = localDefaultCacheKeyFactory;
      }
      DefaultCacheKeyFactory localDefaultCacheKeyFactory = sInstance;
      return localDefaultCacheKeyFactory;
    }
    finally {}
  }
  
  public CacheKey getBitmapCacheKey(ImageRequest paramImageRequest, Object paramObject)
  {
    return new BitmapMemoryCacheKey(getCacheKeySourceUri(paramImageRequest.getSourceUri()).toString(), paramImageRequest.getResizeOptions(), paramImageRequest.getRotationOptions(), paramImageRequest.getImageDecodeOptions(), null, null, paramObject);
  }
  
  public Uri getCacheKeySourceUri(Uri paramUri)
  {
    return paramUri;
  }
  
  public CacheKey getEncodedCacheKey(ImageRequest paramImageRequest, Uri paramUri, @Nullable Object paramObject)
  {
    return new SimpleCacheKey(getCacheKeySourceUri(paramUri).toString());
  }
  
  public CacheKey getEncodedCacheKey(ImageRequest paramImageRequest, @Nullable Object paramObject)
  {
    return getEncodedCacheKey(paramImageRequest, paramImageRequest.getSourceUri(), paramObject);
  }
  
  public CacheKey getPostprocessedBitmapCacheKey(ImageRequest paramImageRequest, Object paramObject)
  {
    Object localObject = paramImageRequest.getPostprocessor();
    CacheKey localCacheKey;
    if (localObject != null)
    {
      localCacheKey = ((Postprocessor)localObject).getPostprocessorCacheKey();
      localObject = localObject.getClass().getName();
    }
    else
    {
      localCacheKey = null;
      localObject = localCacheKey;
    }
    return new BitmapMemoryCacheKey(getCacheKeySourceUri(paramImageRequest.getSourceUri()).toString(), paramImageRequest.getResizeOptions(), paramImageRequest.getRotationOptions(), paramImageRequest.getImageDecodeOptions(), localCacheKey, (String)localObject, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */