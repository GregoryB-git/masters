package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.QualityInfo;

class BitmapMemoryCacheProducer$1
  extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
{
  public BitmapMemoryCacheProducer$1(BitmapMemoryCacheProducer paramBitmapMemoryCacheProducer, Consumer paramConsumer, CacheKey paramCacheKey)
  {
    super(paramConsumer);
  }
  
  public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
  {
    boolean bool = BaseConsumer.isLast(paramInt);
    if (paramCloseableReference == null)
    {
      if (bool) {
        getConsumer().onNewResult(null, paramInt);
      }
      return;
    }
    if ((!((CloseableImage)paramCloseableReference.get()).isStateful()) && (!BaseConsumer.statusHasFlag(paramInt, 8)))
    {
      Object localObject;
      if (!bool)
      {
        localCloseableReference = BitmapMemoryCacheProducer.access$000(this$0).get(val$cacheKey);
        if (localCloseableReference != null) {
          try
          {
            localObject = ((CloseableImage)paramCloseableReference.get()).getQualityInfo();
            QualityInfo localQualityInfo = ((CloseableImage)localCloseableReference.get()).getQualityInfo();
            if (!localQualityInfo.isOfFullQuality())
            {
              int i = localQualityInfo.getQuality();
              int j = ((QualityInfo)localObject).getQuality();
              if (i < j)
              {
                CloseableReference.closeSafely(localCloseableReference);
                break label174;
              }
            }
            getConsumer().onNewResult(localCloseableReference, paramInt);
            return;
          }
          finally
          {
            CloseableReference.closeSafely(localCloseableReference);
          }
        }
      }
      label174:
      CloseableReference localCloseableReference = BitmapMemoryCacheProducer.access$000(this$0).cache(val$cacheKey, paramCloseableReference);
      if (bool) {}
      try
      {
        getConsumer().onProgressUpdate(1.0F);
        localObject = getConsumer();
        if (localCloseableReference != null) {
          paramCloseableReference = localCloseableReference;
        }
        ((Consumer)localObject).onNewResult(paramCloseableReference, paramInt);
        return;
      }
      finally
      {
        CloseableReference.closeSafely(localCloseableReference);
      }
    }
    getConsumer().onNewResult(paramCloseableReference, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapMemoryCacheProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */