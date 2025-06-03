package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;

public class DownsampleUtil
{
  public static final int DEFAULT_SAMPLE_SIZE = 1;
  private static final float INTERVAL_ROUNDING = 0.33333334F;
  
  @VisibleForTesting
  public static float determineDownsampleRatio(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    Preconditions.checkArgument(EncodedImage.isMetaDataAvailable(paramEncodedImage));
    ResizeOptions localResizeOptions = paramImageRequest.getResizeOptions();
    if ((localResizeOptions != null) && (height > 0) && (width > 0) && (paramEncodedImage.getWidth() != 0) && (paramEncodedImage.getHeight() != 0))
    {
      int i = getRotationAngle(paramImageRequest, paramEncodedImage);
      int j;
      if ((i != 90) && (i != 270)) {
        j = 0;
      } else {
        j = 1;
      }
      if (j != 0) {
        i = paramEncodedImage.getHeight();
      } else {
        i = paramEncodedImage.getWidth();
      }
      if (j != 0) {
        j = paramEncodedImage.getWidth();
      } else {
        j = paramEncodedImage.getHeight();
      }
      float f1 = width / i;
      float f2 = height / j;
      float f3 = Math.max(f1, f2);
      FLog.v("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f for %s", new Object[] { Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i), Integer.valueOf(j), Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), paramImageRequest.getSourceUri().toString() });
      return f3;
    }
    return 1.0F;
  }
  
  public static int determineSampleSize(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    if (!EncodedImage.isMetaDataAvailable(paramEncodedImage)) {
      return 1;
    }
    float f = determineDownsampleRatio(paramImageRequest, paramEncodedImage);
    int i;
    if (paramEncodedImage.getImageFormat() == DefaultImageFormats.JPEG) {
      i = ratioToSampleSizeJPEG(f);
    } else {
      i = ratioToSampleSize(f);
    }
    int j = Math.max(paramEncodedImage.getHeight(), paramEncodedImage.getWidth());
    paramImageRequest = paramImageRequest.getResizeOptions();
    if (paramImageRequest != null) {
      f = maxBitmapSize;
    } else {
      f = 2048.0F;
    }
    while (j / i > f) {
      if (paramEncodedImage.getImageFormat() == DefaultImageFormats.JPEG) {
        i *= 2;
      } else {
        i++;
      }
    }
    return i;
  }
  
  private static int getRotationAngle(ImageRequest paramImageRequest, EncodedImage paramEncodedImage)
  {
    boolean bool1 = paramImageRequest.getRotationOptions().useImageMetadata();
    boolean bool2 = false;
    if (!bool1) {
      return 0;
    }
    int i = paramEncodedImage.getRotationAngle();
    if ((i == 0) || (i == 90) || (i == 180) || (i == 270)) {
      bool2 = true;
    }
    Preconditions.checkArgument(bool2);
    return i;
  }
  
  @VisibleForTesting
  public static int ratioToSampleSize(float paramFloat)
  {
    if (paramFloat > 0.6666667F) {
      return 1;
    }
    for (int i = 2;; i++)
    {
      double d = i;
      if (1.0D / (Math.pow(d, 2.0D) - d) * 0.3333333432674408D + 1.0D / d <= paramFloat) {
        return i - 1;
      }
    }
  }
  
  @VisibleForTesting
  public static int ratioToSampleSizeJPEG(float paramFloat)
  {
    if (paramFloat > 0.6666667F) {
      return 1;
    }
    int j;
    for (int i = 2;; i = j)
    {
      j = i * 2;
      double d = 1.0D / j;
      if (0.3333333432674408D * d + d <= paramFloat) {
        return i;
      }
    }
  }
  
  @VisibleForTesting
  public static int roundToPowerOfTwo(int paramInt)
  {
    int i = 1;
    for (;;)
    {
      if (i >= paramInt) {
        return i;
      }
      i *= 2;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DownsampleUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */