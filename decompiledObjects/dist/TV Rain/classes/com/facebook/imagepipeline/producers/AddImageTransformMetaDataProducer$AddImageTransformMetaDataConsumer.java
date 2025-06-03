package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

class AddImageTransformMetaDataProducer$AddImageTransformMetaDataConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private AddImageTransformMetaDataProducer$AddImageTransformMetaDataConsumer(Consumer<EncodedImage> paramConsumer)
  {
    super(paramConsumer);
  }
  
  public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
  {
    if (paramEncodedImage == null)
    {
      getConsumer().onNewResult(null, paramInt);
      return;
    }
    if (!EncodedImage.isMetaDataAvailable(paramEncodedImage)) {
      paramEncodedImage.parseMetaData();
    }
    getConsumer().onNewResult(paramEncodedImage, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer.AddImageTransformMetaDataConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */