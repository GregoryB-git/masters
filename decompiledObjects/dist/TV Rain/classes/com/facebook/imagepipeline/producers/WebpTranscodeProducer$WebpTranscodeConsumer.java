package com.facebook.imagepipeline.producers;

import com.facebook.common.util.TriState;
import com.facebook.imagepipeline.image.EncodedImage;
import javax.annotation.Nullable;

class WebpTranscodeProducer$WebpTranscodeConsumer
  extends DelegatingConsumer<EncodedImage, EncodedImage>
{
  private final ProducerContext mContext;
  private TriState mShouldTranscodeWhenFinished;
  
  public WebpTranscodeProducer$WebpTranscodeConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    super(paramProducerContext);
    ProducerContext localProducerContext;
    mContext = localProducerContext;
    mShouldTranscodeWhenFinished = TriState.UNSET;
  }
  
  public void onNewResultImpl(@Nullable EncodedImage paramEncodedImage, int paramInt)
  {
    if ((mShouldTranscodeWhenFinished == TriState.UNSET) && (paramEncodedImage != null)) {
      mShouldTranscodeWhenFinished = WebpTranscodeProducer.access$000(paramEncodedImage);
    }
    if (mShouldTranscodeWhenFinished == TriState.NO)
    {
      getConsumer().onNewResult(paramEncodedImage, paramInt);
      return;
    }
    if (BaseConsumer.isLast(paramInt)) {
      if ((mShouldTranscodeWhenFinished == TriState.YES) && (paramEncodedImage != null)) {
        WebpTranscodeProducer.access$100(this$0, paramEncodedImage, getConsumer(), mContext);
      } else {
        getConsumer().onNewResult(paramEncodedImage, paramInt);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.WebpTranscodeProducer.WebpTranscodeConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */