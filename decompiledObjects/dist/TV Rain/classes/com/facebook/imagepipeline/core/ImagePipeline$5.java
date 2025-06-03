package com.facebook.imagepipeline.core;

import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.BufferedDiskCache;

class ImagePipeline$5
  implements Continuation<Boolean, Task<Boolean>>
{
  public ImagePipeline$5(ImagePipeline paramImagePipeline, CacheKey paramCacheKey) {}
  
  public Task<Boolean> then(Task<Boolean> paramTask)
    throws Exception
  {
    if ((!paramTask.isCancelled()) && (!paramTask.isFaulted()) && (((Boolean)paramTask.getResult()).booleanValue())) {
      return Task.forResult(Boolean.TRUE);
    }
    return ImagePipeline.access$000(this$0).contains(val$cacheKey);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.core.ImagePipeline.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */