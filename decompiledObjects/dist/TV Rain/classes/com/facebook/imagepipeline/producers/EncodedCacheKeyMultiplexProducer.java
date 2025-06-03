package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;

public class EncodedCacheKeyMultiplexProducer
  extends MultiplexProducer<Pair<CacheKey, ImageRequest.RequestLevel>, EncodedImage>
{
  private final CacheKeyFactory mCacheKeyFactory;
  
  public EncodedCacheKeyMultiplexProducer(CacheKeyFactory paramCacheKeyFactory, Producer paramProducer)
  {
    super(paramProducer);
    mCacheKeyFactory = paramCacheKeyFactory;
  }
  
  public EncodedImage cloneOrNull(EncodedImage paramEncodedImage)
  {
    return EncodedImage.cloneOrNull(paramEncodedImage);
  }
  
  public Pair<CacheKey, ImageRequest.RequestLevel> getKey(ProducerContext paramProducerContext)
  {
    return Pair.create(mCacheKeyFactory.getEncodedCacheKey(paramProducerContext.getImageRequest(), paramProducerContext.getCallerContext()), paramProducerContext.getLowestPermittedRequestLevel());
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.EncodedCacheKeyMultiplexProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */