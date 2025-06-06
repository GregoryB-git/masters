package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.CloseableImage;

public class BitmapMemoryCacheGetProducer
  extends BitmapMemoryCacheProducer
{
  public static final String PRODUCER_NAME = "BitmapMemoryCacheGetProducer";
  
  public BitmapMemoryCacheGetProducer(MemoryCache<CacheKey, CloseableImage> paramMemoryCache, CacheKeyFactory paramCacheKeyFactory, Producer<CloseableReference<CloseableImage>> paramProducer)
  {
    super(paramMemoryCache, paramCacheKeyFactory, paramProducer);
  }
  
  public String getProducerName()
  {
    return "BitmapMemoryCacheGetProducer";
  }
  
  public Consumer<CloseableReference<CloseableImage>> wrapConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, CacheKey paramCacheKey)
  {
    return paramConsumer;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapMemoryCacheGetProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */