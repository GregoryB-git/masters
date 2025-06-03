package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import java.util.concurrent.Callable;

class BufferedDiskCache$1
  implements Callable<Boolean>
{
  public BufferedDiskCache$1(BufferedDiskCache paramBufferedDiskCache, CacheKey paramCacheKey) {}
  
  public Boolean call()
    throws Exception
  {
    return Boolean.valueOf(BufferedDiskCache.access$000(this$0, val$key));
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */