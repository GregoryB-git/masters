package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

public class ThumbnailBranchProducer
  implements Producer<EncodedImage>
{
  private final ThumbnailProducer<EncodedImage>[] mThumbnailProducers;
  
  public ThumbnailBranchProducer(ThumbnailProducer<EncodedImage>... paramVarArgs)
  {
    paramVarArgs = (ThumbnailProducer[])Preconditions.checkNotNull(paramVarArgs);
    mThumbnailProducers = paramVarArgs;
    Preconditions.checkElementIndex(0, paramVarArgs.length);
  }
  
  private int findFirstProducerForSize(int paramInt, ResizeOptions paramResizeOptions)
  {
    for (;;)
    {
      ThumbnailProducer[] arrayOfThumbnailProducer = mThumbnailProducers;
      if (paramInt >= arrayOfThumbnailProducer.length) {
        break;
      }
      if (arrayOfThumbnailProducer[paramInt].canProvideImageForSize(paramResizeOptions)) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  private boolean produceResultsFromThumbnailProducer(int paramInt, Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    paramInt = findFirstProducerForSize(paramInt, paramProducerContext.getImageRequest().getResizeOptions());
    if (paramInt == -1) {
      return false;
    }
    mThumbnailProducers[paramInt].produceResults(new ThumbnailConsumer(paramConsumer, paramProducerContext, paramInt), paramProducerContext);
    return true;
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    if (paramProducerContext.getImageRequest().getResizeOptions() == null) {
      paramConsumer.onNewResult(null, 1);
    } else if (!produceResultsFromThumbnailProducer(0, paramConsumer, paramProducerContext)) {
      paramConsumer.onNewResult(null, 1);
    }
  }
  
  public class ThumbnailConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private final ProducerContext mProducerContext;
    private final int mProducerIndex;
    private final ResizeOptions mResizeOptions;
    
    public ThumbnailConsumer(ProducerContext paramProducerContext, int paramInt)
    {
      super();
      mProducerContext = paramInt;
      int i;
      mProducerIndex = i;
      mResizeOptions = paramInt.getImageRequest().getResizeOptions();
    }
    
    public void onFailureImpl(Throwable paramThrowable)
    {
      if (!ThumbnailBranchProducer.access$000(ThumbnailBranchProducer.this, mProducerIndex + 1, getConsumer(), mProducerContext)) {
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
        if (!ThumbnailBranchProducer.access$000(ThumbnailBranchProducer.this, mProducerIndex + 1, getConsumer(), mProducerContext)) {
          getConsumer().onNewResult(null, 1);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThumbnailBranchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */