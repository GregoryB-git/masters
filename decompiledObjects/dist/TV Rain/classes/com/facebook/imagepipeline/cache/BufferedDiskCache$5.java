package com.facebook.imagepipeline.cache;

import com.facebook.cache.disk.FileCache;
import java.util.concurrent.Callable;

class BufferedDiskCache$5
  implements Callable<Void>
{
  public BufferedDiskCache$5(BufferedDiskCache paramBufferedDiskCache) {}
  
  public Void call()
    throws Exception
  {
    BufferedDiskCache.access$100(this$0).clearAll();
    BufferedDiskCache.access$600(this$0).clearAll();
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */