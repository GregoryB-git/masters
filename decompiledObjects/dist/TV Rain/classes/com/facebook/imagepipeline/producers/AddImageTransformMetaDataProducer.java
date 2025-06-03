package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

public class AddImageTransformMetaDataProducer
  implements Producer<EncodedImage>
{
  private final Producer<EncodedImage> mInputProducer;
  
  public AddImageTransformMetaDataProducer(Producer<EncodedImage> paramProducer)
  {
    mInputProducer = paramProducer;
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    mInputProducer.produceResults(new AddImageTransformMetaDataConsumer(paramConsumer, null), paramProducerContext);
  }
  
  public static class AddImageTransformMetaDataConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private AddImageTransformMetaDataConsumer(Consumer<EncodedImage> paramConsumer)
    {
      super();
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
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.AddImageTransformMetaDataProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */