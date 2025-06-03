package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;

class PostprocessorProducer$SingleUsePostprocessorConsumer
  extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
{
  private PostprocessorProducer$SingleUsePostprocessorConsumer(PostprocessorProducer paramPostprocessorProducer, PostprocessorProducer.PostprocessorConsumer paramPostprocessorConsumer)
  {
    super(paramPostprocessorConsumer);
  }
  
  public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
  {
    if (BaseConsumer.isNotLast(paramInt)) {
      return;
    }
    getConsumer().onNewResult(paramCloseableReference, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessorProducer.SingleUsePostprocessorConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */