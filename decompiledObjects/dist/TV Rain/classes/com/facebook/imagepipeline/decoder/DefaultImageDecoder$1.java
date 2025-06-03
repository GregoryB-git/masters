package com.facebook.imagepipeline.decoder;

import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.QualityInfo;

class DefaultImageDecoder$1
  implements ImageDecoder
{
  public DefaultImageDecoder$1(DefaultImageDecoder paramDefaultImageDecoder) {}
  
  public CloseableImage decode(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions)
  {
    ImageFormat localImageFormat = paramEncodedImage.getImageFormat();
    if (localImageFormat == DefaultImageFormats.JPEG) {
      return this$0.decodeJpeg(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
    }
    if (localImageFormat == DefaultImageFormats.GIF) {
      return this$0.decodeGif(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
    }
    if (localImageFormat == DefaultImageFormats.WEBP_ANIMATED) {
      return this$0.decodeAnimatedWebp(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
    }
    if (localImageFormat != ImageFormat.UNKNOWN) {
      return this$0.decodeStaticImage(paramEncodedImage, paramImageDecodeOptions);
    }
    throw new DecodeException("unknown image format", paramEncodedImage);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.DefaultImageDecoder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */