package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

public class BranchOnSeparateImagesProducer
  implements Producer<EncodedImage>
{
  private final Producer<EncodedImage> mInputProducer1;
  private final Producer<EncodedImage> mInputProducer2;
  
  public BranchOnSeparateImagesProducer(Producer<EncodedImage> paramProducer1, Producer<EncodedImage> paramProducer2)
  {
    mInputProducer1 = paramProducer1;
    mInputProducer2 = paramProducer2;
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    paramConsumer = new OnFirstImageConsumer(paramConsumer, paramProducerContext, null);
    mInputProducer1.produceResults(paramConsumer, paramProducerContext);
  }
  
  public class OnFirstImageConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private ProducerContext mProducerContext;
    
    private OnFirstImageConsumer(ProducerContext paramProducerContext)
    {
      super();
      ProducerContext localProducerContext;
      mProducerContext = localProducerContext;
    }
    
    public void onFailureImpl(Throwable paramThrowable)
    {
      BranchOnSeparateImagesProducer.access$100(BranchOnSeparateImagesProducer.this).produceResults(getConsumer(), mProducerContext);
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      ImageRequest localImageRequest = mProducerContext.getImageRequest();
      boolean bool1 = BaseConsumer.isLast(paramInt);
      boolean bool2 = ThumbnailSizeChecker.isImageBigEnough(paramEncodedImage, localImageRequest.getResizeOptions());
      if ((paramEncodedImage != null) && ((bool2) || (localImageRequest.getLocalThumbnailPreviewsEnabled()))) {
        if ((bool1) && (bool2))
        {
          getConsumer().onNewResult(paramEncodedImage, paramInt);
        }
        else
        {
          paramInt = BaseConsumer.turnOffStatusFlag(paramInt, 1);
          getConsumer().onNewResult(paramEncodedImage, paramInt);
        }
      }
      if ((bool1) && (!bool2))
      {
        EncodedImage.closeSafely(paramEncodedImage);
        BranchOnSeparateImagesProducer.access$100(BranchOnSeparateImagesProducer.this).produceResults(getConsumer(), mProducerContext);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */