package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class ImageDecodeOptions
{
  private static final ImageDecodeOptions DEFAULTS = newBuilder().build();
  public final Bitmap.Config bitmapConfig;
  @Nullable
  public final ImageDecoder customImageDecoder;
  public final boolean decodeAllFrames;
  public final boolean decodePreviewFrame;
  public final boolean forceStaticImage;
  public final int minDecodeIntervalMs;
  public final boolean useLastFrameForPreview;
  
  public ImageDecodeOptions(ImageDecodeOptionsBuilder paramImageDecodeOptionsBuilder)
  {
    minDecodeIntervalMs = paramImageDecodeOptionsBuilder.getMinDecodeIntervalMs();
    decodePreviewFrame = paramImageDecodeOptionsBuilder.getDecodePreviewFrame();
    useLastFrameForPreview = paramImageDecodeOptionsBuilder.getUseLastFrameForPreview();
    decodeAllFrames = paramImageDecodeOptionsBuilder.getDecodeAllFrames();
    forceStaticImage = paramImageDecodeOptionsBuilder.getForceStaticImage();
    bitmapConfig = paramImageDecodeOptionsBuilder.getBitmapConfig();
    customImageDecoder = paramImageDecodeOptionsBuilder.getCustomImageDecoder();
  }
  
  public static ImageDecodeOptions defaults()
  {
    return DEFAULTS;
  }
  
  public static ImageDecodeOptionsBuilder newBuilder()
  {
    return new ImageDecodeOptionsBuilder();
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (ImageDecodeOptions)paramObject;
      if (decodePreviewFrame != decodePreviewFrame) {
        return false;
      }
      if (useLastFrameForPreview != useLastFrameForPreview) {
        return false;
      }
      if (decodeAllFrames != decodeAllFrames) {
        return false;
      }
      if (forceStaticImage != forceStaticImage) {
        return false;
      }
      if (bitmapConfig != bitmapConfig) {
        return false;
      }
      return customImageDecoder == customImageDecoder;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = minDecodeIntervalMs;
    int j = decodePreviewFrame;
    int k = useLastFrameForPreview;
    int m = decodeAllFrames;
    int n = forceStaticImage;
    int i1 = bitmapConfig.ordinal();
    ImageDecoder localImageDecoder = customImageDecoder;
    int i2;
    if (localImageDecoder != null) {
      i2 = localImageDecoder.hashCode();
    } else {
      i2 = 0;
    }
    return (i1 + ((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31) * 31 + i2;
  }
  
  public String toString()
  {
    return String.format(null, "%d-%b-%b-%b-%b-%s-%s", new Object[] { Integer.valueOf(minDecodeIntervalMs), Boolean.valueOf(decodePreviewFrame), Boolean.valueOf(useLastFrameForPreview), Boolean.valueOf(decodeAllFrames), Boolean.valueOf(forceStaticImage), bitmapConfig.name(), customImageDecoder });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.common.ImageDecodeOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */