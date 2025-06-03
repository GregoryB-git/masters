package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;

@VisibleForTesting
class MediaVariationsFallbackProducer$MediaVariationsConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private final String mMediaId;
  private final ProducerContext mProducerContext;
  
  public MediaVariationsFallbackProducer$MediaVariationsConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, String paramString)
  {
    super(paramProducerContext);
    mProducerContext = paramString;
    String str;
    mMediaId = str;
  }
  
  private void storeResultInDatabase(EncodedImage paramEncodedImage)
  {
    Object localObject = mProducerContext.getImageRequest();
    if ((((ImageRequest)localObject).isDiskCacheEnabled()) && (mMediaId != null))
    {
      ImageRequest.CacheChoice localCacheChoice;
      if (((ImageRequest)localObject).getCacheChoice() == null) {
        localCacheChoice = ImageRequest.CacheChoice.DEFAULT;
      } else {
        localCacheChoice = ((ImageRequest)localObject).getCacheChoice();
      }
      localObject = MediaVariationsFallbackProducer.access$500(this$0).getEncodedCacheKey((ImageRequest)localObject, mProducerContext.getCallerContext());
      MediaVariationsFallbackProducer.access$600(this$0).saveCachedVariant(mMediaId, localCacheChoice, (CacheKey)localObject, paramEncodedImage);
    }
  }
  
  public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
  {
    if ((BaseConsumer.isLast(paramInt)) && (paramEncodedImage != null) && (!BaseConsumer.statusHasFlag(paramInt, 8))) {
      storeResultInDatabase(paramEncodedImage);
    }
    getConsumer().onNewResult(paramEncodedImage, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer.MediaVariationsConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */