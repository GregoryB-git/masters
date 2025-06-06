package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.QualityInfo;

public abstract interface ImageDecoder
{
  public abstract CloseableImage decode(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.ImageDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */