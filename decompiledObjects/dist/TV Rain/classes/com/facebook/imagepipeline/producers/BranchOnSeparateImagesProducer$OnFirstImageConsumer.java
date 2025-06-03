package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

class BranchOnSeparateImagesProducer$OnFirstImageConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private ProducerContext mProducerContext;
  
  private BranchOnSeparateImagesProducer$OnFirstImageConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    super(paramProducerContext);
    ProducerContext localProducerContext;
    mProducerContext = localProducerContext;
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    BranchOnSeparateImagesProducer.access$100(this$0).produceResults(getConsumer(), mProducerContext);
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
      BranchOnSeparateImagesProducer.access$100(this$0).produceResults(getConsumer(), mProducerContext);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BranchOnSeparateImagesProducer.OnFirstImageConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */