package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

class BufferedDiskCache$2
  implements Callable<EncodedImage>
{
  public BufferedDiskCache$2(BufferedDiskCache paramBufferedDiskCache, AtomicBoolean paramAtomicBoolean, CacheKey paramCacheKey) {}
  
  public EncodedImage call()
    throws Exception
  {
    if (!val$isCancelled.get())
    {
      EncodedImage localEncodedImage = BufferedDiskCache.access$100(this$0).get(val$key);
      if (localEncodedImage != null)
      {
        FLog.v(BufferedDiskCache.access$200(), "Found image for %s in staging area", val$key.getUriString());
        BufferedDiskCache.access$300(this$0).onStagingAreaHit(val$key);
      }
      else
      {
        FLog.v(BufferedDiskCache.access$200(), "Did not find image for %s in staging area", val$key.getUriString());
        BufferedDiskCache.access$300(this$0).onStagingAreaMiss();
      }
      try
      {
        CloseableReference localCloseableReference = CloseableReference.of(BufferedDiskCache.access$400(this$0, val$key));
        try
        {
          localEncodedImage = new com/facebook/imagepipeline/image/EncodedImage;
          localEncodedImage.<init>(localCloseableReference);
          CloseableReference.closeSafely(localCloseableReference);
          if (!Thread.interrupted()) {
            return localEncodedImage;
          }
          FLog.v(BufferedDiskCache.access$200(), "Host thread was interrupted, decreasing reference count");
          localEncodedImage.close();
          throw new InterruptedException();
        }
        finally
        {
          CloseableReference.closeSafely(localCloseableReference);
        }
        throw new CancellationException();
      }
      catch (Exception localException)
      {
        return null;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */