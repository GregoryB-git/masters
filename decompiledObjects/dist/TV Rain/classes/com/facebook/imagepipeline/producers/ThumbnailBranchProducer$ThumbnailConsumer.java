package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

class ThumbnailBranchProducer$ThumbnailConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private final ProducerContext mProducerContext;
  private final int mProducerIndex;
  private final ResizeOptions mResizeOptions;
  
  public ThumbnailBranchProducer$ThumbnailConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, int paramInt)
  {
    super(paramProducerContext);
    mProducerContext = paramInt;
    int i;
    mProducerIndex = i;
    mResizeOptions = paramInt.getImageRequest().getResizeOptions();
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    if (!ThumbnailBranchProducer.access$000(this$0, mProducerIndex + 1, getConsumer(), mProducerContext)) {
      getConsumer().onFailure(paramThrowable);
    }
  }
  
  public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
  {
    if ((paramEncodedImage != null) && ((BaseConsumer.isNotLast(paramInt)) || (ThumbnailSizeChecker.isImageBigEnough(paramEncodedImage, mResizeOptions))))
    {
      getConsumer().onNewResult(paramEncodedImage, paramInt);
    }
    else if (BaseConsumer.isLast(paramInt))
    {
      EncodedImage.closeSafely(paramEncodedImage);
      if (!ThumbnailBranchProducer.access$000(this$0, mProducerIndex + 1, getConsumer(), mProducerContext)) {
        getConsumer().onNewResult(null, 1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThumbnailBranchProducer.ThumbnailConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */