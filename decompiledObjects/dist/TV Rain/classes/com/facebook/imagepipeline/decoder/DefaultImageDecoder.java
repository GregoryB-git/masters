package com.facebook.imagepipeline.decoder;

import com.facebook.common.references.CloseableReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import java.util.Map;
import javax.annotation.Nullable;

public class DefaultImageDecoder
  implements ImageDecoder
{
  private final ImageDecoder mAnimatedGifDecoder;
  private final ImageDecoder mAnimatedWebPDecoder;
  @Nullable
  private final Map<ImageFormat, ImageDecoder> mCustomDecoders;
  private final ImageDecoder mDefaultDecoder = new ImageDecoder()
  {
    public CloseableImage decode(EncodedImage paramAnonymousEncodedImage, int paramAnonymousInt, QualityInfo paramAnonymousQualityInfo, ImageDecodeOptions paramAnonymousImageDecodeOptions)
    {
      ImageFormat localImageFormat = paramAnonymousEncodedImage.getImageFormat();
      if (localImageFormat == DefaultImageFormats.JPEG) {
        return decodeJpeg(paramAnonymousEncodedImage, paramAnonymousInt, paramAnonymousQualityInfo, paramAnonymousImageDecodeOptions);
      }
      if (localImageFormat == DefaultImageFormats.GIF) {
        return decodeGif(paramAnonymousEncodedImage, paramAnonymousInt, paramAnonymousQualityInfo, paramAnonymousImageDecodeOptions);
      }
      if (localImageFormat == DefaultImageFormats.WEBP_ANIMATED) {
        return decodeAnimatedWebp(paramAnonymousEncodedImage, paramAnonymousInt, paramAnonymousQualityInfo, paramAnonymousImageDecodeOptions);
      }
      if (localImageFormat != ImageFormat.UNKNOWN) {
        return decodeStaticImage(paramAnonymousEncodedImage, paramAnonymousImageDecodeOptions);
      }
      throw new DecodeException("unknown image format", paramAnonymousEncodedImage);
    }
  };
  private final PlatformDecoder mPlatformDecoder;
  
  public DefaultImageDecoder(ImageDecoder paramImageDecoder1, ImageDecoder paramImageDecoder2, PlatformDecoder paramPlatformDecoder)
  {
    this(paramImageDecoder1, paramImageDecoder2, paramPlatformDecoder, null);
  }
  
  public DefaultImageDecoder(ImageDecoder paramImageDecoder1, ImageDecoder paramImageDecoder2, PlatformDecoder paramPlatformDecoder, @Nullable Map<ImageFormat, ImageDecoder> paramMap)
  {
    mAnimatedGifDecoder = paramImageDecoder1;
    mAnimatedWebPDecoder = paramImageDecoder2;
    mPlatformDecoder = paramPlatformDecoder;
    mCustomDecoders = paramMap;
  }
  
  public CloseableImage decode(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions)
  {
    Object localObject1 = customImageDecoder;
    if (localObject1 != null) {
      return ((ImageDecoder)localObject1).decode(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
    }
    Object localObject2 = paramEncodedImage.getImageFormat();
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (localObject2 != ImageFormat.UNKNOWN) {}
    }
    else
    {
      localObject1 = ImageFormatChecker.getImageFormat_WrapIOException(paramEncodedImage.getInputStream());
      paramEncodedImage.setImageFormat((ImageFormat)localObject1);
    }
    localObject2 = mCustomDecoders;
    if (localObject2 != null)
    {
      localObject1 = (ImageDecoder)((Map)localObject2).get(localObject1);
      if (localObject1 != null) {
        return ((ImageDecoder)localObject1).decode(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
      }
    }
    return mDefaultDecoder.decode(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
  }
  
  public CloseableImage decodeAnimatedWebp(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions)
  {
    return mAnimatedWebPDecoder.decode(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
  }
  
  public CloseableImage decodeGif(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions)
  {
    if (!forceStaticImage)
    {
      ImageDecoder localImageDecoder = mAnimatedGifDecoder;
      if (localImageDecoder != null) {
        return localImageDecoder.decode(paramEncodedImage, paramInt, paramQualityInfo, paramImageDecodeOptions);
      }
    }
    return decodeStaticImage(paramEncodedImage, paramImageDecodeOptions);
  }
  
  public CloseableStaticBitmap decodeJpeg(EncodedImage paramEncodedImage, int paramInt, QualityInfo paramQualityInfo, ImageDecodeOptions paramImageDecodeOptions)
  {
    paramImageDecodeOptions = mPlatformDecoder.decodeJPEGFromEncodedImage(paramEncodedImage, bitmapConfig, null, paramInt);
    try
    {
      paramEncodedImage = new CloseableStaticBitmap(paramImageDecodeOptions, paramQualityInfo, paramEncodedImage.getRotationAngle(), paramEncodedImage.getExifOrientation());
      return paramEncodedImage;
    }
    finally
    {
      paramImageDecodeOptions.close();
    }
  }
  
  public CloseableStaticBitmap decodeStaticImage(EncodedImage paramEncodedImage, ImageDecodeOptions paramImageDecodeOptions)
  {
    paramImageDecodeOptions = mPlatformDecoder.decodeFromEncodedImage(paramEncodedImage, bitmapConfig, null);
    try
    {
      paramEncodedImage = new CloseableStaticBitmap(paramImageDecodeOptions, ImmutableQualityInfo.FULL_QUALITY, paramEncodedImage.getRotationAngle(), paramEncodedImage.getExifOrientation());
      return paramEncodedImage;
    }
    finally
    {
      paramImageDecodeOptions.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.DefaultImageDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */