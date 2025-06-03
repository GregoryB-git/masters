package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import java.util.concurrent.Callable;

class BufferedDiskCache$4
  implements Callable<Void>
{
  public BufferedDiskCache$4(BufferedDiskCache paramBufferedDiskCache, CacheKey paramCacheKey) {}
  
  public Void call()
    throws Exception
  {
    BufferedDiskCache.access$100(this$0).remove(val$key);
    BufferedDiskCache.access$600(this$0).remove(val$key);
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */