package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;

class DecodeProducer$LocalImagesProgressiveDecoder
  extends DecodeProducer.ProgressiveDecoder
{
  public DecodeProducer$LocalImagesProgressiveDecoder(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext, boolean paramBoolean)
  {
    super(paramConsumer, paramProducerContext, paramBoolean, bool);
  }
  
  public int getIntermediateImageEndOffset(EncodedImage paramEncodedImage)
  {
    return paramEncodedImage.getSize();
  }
  
  public QualityInfo getQualityInfo()
  {
    return ImmutableQualityInfo.of(0, false, false);
  }
  
  public boolean updateDecodeJob(EncodedImage paramEncodedImage, int paramInt)
  {
    try
    {
      boolean bool = BaseConsumer.isNotLast(paramInt);
      if (bool) {
        return false;
      }
      bool = super.updateDecodeJob(paramEncodedImage, paramInt);
      return bool;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DecodeProducer.LocalImagesProgressiveDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */