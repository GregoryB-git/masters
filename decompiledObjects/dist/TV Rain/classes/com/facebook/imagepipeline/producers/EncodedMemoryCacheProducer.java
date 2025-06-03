package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

public class EncodedMemoryCacheProducer
  implements Producer<EncodedImage>
{
  public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
  public static final String PRODUCER_NAME = "EncodedMemoryCacheProducer";
  private final CacheKeyFactory mCacheKeyFactory;
  private final Producer<EncodedImage> mInputProducer;
  private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
  
  public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache, CacheKeyFactory paramCacheKeyFactory, Producer<EncodedImage> paramProducer)
  {
    mMemoryCache = paramMemoryCache;
    mCacheKeyFactory = paramCacheKeyFactory;
    mInputProducer = paramProducer;
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    String str = paramProducerContext.getId();
    ProducerListener localProducerListener = paramProducerContext.getListener();
    localProducerListener.onProducerStart(str, "EncodedMemoryCacheProducer");
    Object localObject = paramProducerContext.getImageRequest();
    CacheKey localCacheKey = mCacheKeyFactory.getEncodedCacheKey((ImageRequest)localObject, paramProducerContext.getCallerContext());
    CloseableReference localCloseableReference = mMemoryCache.get(localCacheKey);
    EncodedImage localEncodedImage = null;
    localObject = null;
    if (localCloseableReference != null) {}
    try
    {
      localEncodedImage = new com/facebook/imagepipeline/image/EncodedImage;
      localEncodedImage.<init>(localCloseableReference);
      paramProducerContext = (ProducerContext)localObject;
      try
      {
        if (localProducerListener.requiresExtraMap(str)) {
          paramProducerContext = ImmutableMap.of("cached_value_found", "true");
        }
        localProducerListener.onProducerFinishWithSuccess(str, "EncodedMemoryCacheProducer", paramProducerContext);
        localProducerListener.onUltimateProducerReached(str, "EncodedMemoryCacheProducer", true);
        paramConsumer.onProgressUpdate(1.0F);
        paramConsumer.onNewResult(localEncodedImage, 1);
        return;
      }
      finally {}
      int i = paramProducerContext.getLowestPermittedRequestLevel().getValue();
      int j = ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.getValue();
      if (i >= j)
      {
        if (localProducerListener.requiresExtraMap(str)) {
          paramProducerContext = ImmutableMap.of("cached_value_found", "false");
        } else {
          paramProducerContext = null;
        }
        localProducerListener.onProducerFinishWithSuccess(str, "EncodedMemoryCacheProducer", paramProducerContext);
        localProducerListener.onUltimateProducerReached(str, "EncodedMemoryCacheProducer", false);
        paramConsumer.onNewResult(null, 1);
        return;
      }
      localObject = new com/facebook/imagepipeline/producers/EncodedMemoryCacheProducer$EncodedMemoryCacheConsumer;
      ((EncodedMemoryCacheConsumer)localObject).<init>(paramConsumer, mMemoryCache, localCacheKey);
      paramConsumer = localEncodedImage;
      if (localProducerListener.requiresExtraMap(str)) {
        paramConsumer = ImmutableMap.of("cached_value_found", "false");
      }
      localProducerListener.onProducerFinishWithSuccess(str, "EncodedMemoryCacheProducer", paramConsumer);
      mInputProducer.produceResults((Consumer)localObject, paramProducerContext);
      return;
    }
    finally
    {
      CloseableReference.closeSafely(localCloseableReference);
    }
  }
  
  public static class EncodedMemoryCacheConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private final MemoryCache<CacheKey, PooledByteBuffer> mMemoryCache;
    private final CacheKey mRequestedCacheKey;
    
    public EncodedMemoryCacheConsumer(Consumer<EncodedImage> paramConsumer, MemoryCache<CacheKey, PooledByteBuffer> paramMemoryCache, CacheKey paramCacheKey)
    {
      super();
      mMemoryCache = paramMemoryCache;
      mRequestedCacheKey = paramCacheKey;
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      if ((!BaseConsumer.isNotLast(paramInt)) && (paramEncodedImage != null) && (!BaseConsumer.statusHasAnyFlag(paramInt, 10)))
      {
        Object localObject = paramEncodedImage.getByteBufferRef();
        if (localObject != null) {
          try
          {
            CloseableReference localCloseableReference = mMemoryCache.cache(mRequestedCacheKey, (CloseableReference)localObject);
            CloseableReference.closeSafely((CloseableReference)localObject);
            if (localCloseableReference != null) {
              try
              {
                localObject = new com/facebook/imagepipeline/image/EncodedImage;
                ((EncodedImage)localObject).<init>(localCloseableReference);
                ((EncodedImage)localObject).copyMetaDataFrom(paramEncodedImage);
                CloseableReference.closeSafely(localCloseableReference);
                try
                {
                  getConsumer().onProgressUpdate(1.0F);
                  getConsumer().onNewResult(localObject, paramInt);
                  return;
                }
                finally
                {
                  EncodedImage.closeSafely((EncodedImage)localObject);
                }
                paramEncodedImage = finally;
              }
              finally
              {
                CloseableReference.closeSafely(localCloseableReference);
              }
            }
            getConsumer().onNewResult(paramEncodedImage, paramInt);
          }
          finally {}
        }
        return;
      }
      getConsumer().onNewResult(paramEncodedImage, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.EncodedMemoryCacheProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */