package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

public class DiskCacheWriteProducer
  implements Producer<EncodedImage>
{
  @VisibleForTesting
  public static final String PRODUCER_NAME = "DiskCacheProducer";
  private final CacheKeyFactory mCacheKeyFactory;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final Producer<EncodedImage> mInputProducer;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  
  public DiskCacheWriteProducer(BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory, Producer<EncodedImage> paramProducer)
  {
    mDefaultBufferedDiskCache = paramBufferedDiskCache1;
    mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    mCacheKeyFactory = paramCacheKeyFactory;
    mInputProducer = paramProducer;
  }
  
  private void maybeStartInputProducer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    if (paramProducerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue())
    {
      paramConsumer.onNewResult(null, 1);
    }
    else
    {
      Object localObject = paramConsumer;
      if (paramProducerContext.getImageRequest().isDiskCacheEnabled()) {
        localObject = new DiskCacheWriteConsumer(paramConsumer, paramProducerContext, mDefaultBufferedDiskCache, mSmallImageBufferedDiskCache, mCacheKeyFactory, null);
      }
      mInputProducer.produceResults((Consumer)localObject, paramProducerContext);
    }
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    maybeStartInputProducer(paramConsumer, paramProducerContext);
  }
  
  public static class DiskCacheWriteConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private final CacheKeyFactory mCacheKeyFactory;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    private final ProducerContext mProducerContext;
    private final BufferedDiskCache mSmallImageBufferedDiskCache;
    
    private DiskCacheWriteConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory)
    {
      super();
      mProducerContext = paramProducerContext;
      mDefaultBufferedDiskCache = paramBufferedDiskCache1;
      mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
      mCacheKeyFactory = paramCacheKeyFactory;
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      if ((!BaseConsumer.isNotLast(paramInt)) && (paramEncodedImage != null) && (!BaseConsumer.statusHasAnyFlag(paramInt, 10)))
      {
        ImageRequest localImageRequest = mProducerContext.getImageRequest();
        CacheKey localCacheKey = mCacheKeyFactory.getEncodedCacheKey(localImageRequest, mProducerContext.getCallerContext());
        if (localImageRequest.getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
          mSmallImageBufferedDiskCache.put(localCacheKey, paramEncodedImage);
        } else {
          mDefaultBufferedDiskCache.put(localCacheKey, paramEncodedImage);
        }
        getConsumer().onNewResult(paramEncodedImage, paramInt);
        return;
      }
      getConsumer().onNewResult(paramEncodedImage, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DiskCacheWriteProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */