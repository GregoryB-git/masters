package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

class LocalFetchProducer$1
  extends StatefulProducerRunnable<EncodedImage>
{
  public LocalFetchProducer$1(LocalFetchProducer paramLocalFetchProducer, Consumer paramConsumer, ProducerListener paramProducerListener1, String paramString1, String paramString2, ImageRequest paramImageRequest, ProducerListener paramProducerListener2, String paramString3)
  {
    super(paramConsumer, paramProducerListener1, paramString1, paramString2);
  }
  
  public void disposeResult(EncodedImage paramEncodedImage)
  {
    EncodedImage.closeSafely(paramEncodedImage);
  }
  
  public EncodedImage getResult()
    throws Exception
  {
    EncodedImage localEncodedImage = this$0.getEncodedImage(val$imageRequest);
    if (localEncodedImage == null)
    {
      val$listener.onUltimateProducerReached(val$requestId, this$0.getProducerName(), false);
      return null;
    }
    localEncodedImage.parseMetaData();
    val$listener.onUltimateProducerReached(val$requestId, this$0.getProducerName(), true);
    return localEncodedImage;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalFetchProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */