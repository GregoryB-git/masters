package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.image.EncodedImage;

class BufferedDiskCache$3
  implements Runnable
{
  public BufferedDiskCache$3(BufferedDiskCache paramBufferedDiskCache, CacheKey paramCacheKey, EncodedImage paramEncodedImage) {}
  
  public void run()
  {
    try
    {
      BufferedDiskCache.access$500(this$0, val$key, val$finalEncodedImage);
      return;
    }
    finally
    {
      BufferedDiskCache.access$100(this$0).remove(val$key, val$finalEncodedImage);
      EncodedImage.closeSafely(val$finalEncodedImage);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */