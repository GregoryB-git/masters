package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

public class BitmapMemoryCacheKeyMultiplexProducer
  extends MultiplexProducer<Pair<CacheKey, ImageRequest.RequestLevel>, CloseableReference<CloseableImage>>
{
  private final CacheKeyFactory mCacheKeyFactory;
  
  public BitmapMemoryCacheKeyMultiplexProducer(CacheKeyFactory paramCacheKeyFactory, Producer paramProducer)
  {
    super(paramProducer);
    mCacheKeyFactory = paramCacheKeyFactory;
  }
  
  public CloseableReference<CloseableImage> cloneOrNull(CloseableReference<CloseableImage> paramCloseableReference)
  {
    return CloseableReference.cloneOrNull(paramCloseableReference);
  }
  
  public Pair<CacheKey, ImageRequest.RequestLevel> getKey(ProducerContext paramProducerContext)
  {
    return Pair.create(mCacheKeyFactory.getBitmapCacheKey(paramProducerContext.getImageRequest(), paramProducerContext.getCallerContext()), paramProducerContext.getLowestPermittedRequestLevel());
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapMemoryCacheKeyMultiplexProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */