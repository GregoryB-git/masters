package com.facebook.imageformat;

import com.facebook.common.internal.Ints;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.webp.WebpSupportStatus;
import javax.annotation.Nullable;

public class DefaultImageFormatChecker
  implements ImageFormat.FormatChecker
{
  private static final byte[] BMP_HEADER;
  private static final int BMP_HEADER_LENGTH;
  private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
  private static final byte[] GIF_HEADER_87A;
  private static final byte[] GIF_HEADER_89A;
  private static final int GIF_HEADER_LENGTH = 6;
  private static final byte[] JPEG_HEADER;
  private static final int JPEG_HEADER_LENGTH;
  private static final byte[] PNG_HEADER;
  private static final int PNG_HEADER_LENGTH;
  private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
  public final int MAX_HEADER_LENGTH = Ints.max(new int[] { 21, 20, JPEG_HEADER_LENGTH, PNG_HEADER_LENGTH, 6, BMP_HEADER_LENGTH });
  
  static
  {
    byte[] arrayOfByte = new byte[3];
    arrayOfByte[0] = -1;
    arrayOfByte[1] = -40;
    arrayOfByte[2] = -1;
    arrayOfByte;
    JPEG_HEADER = arrayOfByte;
    JPEG_HEADER_LENGTH = arrayOfByte.length;
    arrayOfByte = new byte[8];
    arrayOfByte[0] = -119;
    arrayOfByte[1] = 80;
    arrayOfByte[2] = 78;
    arrayOfByte[3] = 71;
    arrayOfByte[4] = 13;
    arrayOfByte[5] = 10;
    arrayOfByte[6] = 26;
    arrayOfByte[7] = 10;
    arrayOfByte;
    PNG_HEADER = arrayOfByte;
    PNG_HEADER_LENGTH = arrayOfByte.length;
    GIF_HEADER_87A = ImageFormatCheckerUtils.asciiBytes("GIF87a");
    GIF_HEADER_89A = ImageFormatCheckerUtils.asciiBytes("GIF89a");
    arrayOfByte = ImageFormatCheckerUtils.asciiBytes("BM");
    BMP_HEADER = arrayOfByte;
    BMP_HEADER_LENGTH = arrayOfByte.length;
  }
  
  private static ImageFormat getWebpFormat(byte[] paramArrayOfByte, int paramInt)
  {
    Preconditions.checkArgument(WebpSupportStatus.isWebpHeader(paramArrayOfByte, 0, paramInt));
    if (WebpSupportStatus.isSimpleWebpHeader(paramArrayOfByte, 0)) {
      return DefaultImageFormats.WEBP_SIMPLE;
    }
    if (WebpSupportStatus.isLosslessWebpHeader(paramArrayOfByte, 0)) {
      return DefaultImageFormats.WEBP_LOSSLESS;
    }
    if (WebpSupportStatus.isExtendedWebpHeader(paramArrayOfByte, 0, paramInt))
    {
      if (WebpSupportStatus.isAnimatedWebpHeader(paramArrayOfByte, 0)) {
        return DefaultImageFormats.WEBP_ANIMATED;
      }
      if (WebpSupportStatus.isExtendedWebpHeaderWithAlpha(paramArrayOfByte, 0)) {
        return DefaultImageFormats.WEBP_EXTENDED_WITH_ALPHA;
      }
      return DefaultImageFormats.WEBP_EXTENDED;
    }
    return ImageFormat.UNKNOWN;
  }
  
  private static boolean isBmpHeader(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = BMP_HEADER;
    if (paramInt < arrayOfByte.length) {
      return false;
    }
    return ImageFormatCheckerUtils.startsWithPattern(paramArrayOfByte, arrayOfByte);
  }
  
  private static boolean isGifHeader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = false;
    if (paramInt < 6) {
      return false;
    }
    if ((ImageFormatCheckerUtils.startsWithPattern(paramArrayOfByte, GIF_HEADER_87A)) || (ImageFormatCheckerUtils.startsWithPattern(paramArrayOfByte, GIF_HEADER_89A))) {
      bool = true;
    }
    return bool;
  }
  
  private static boolean isJpegHeader(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = JPEG_HEADER;
    boolean bool;
    if ((paramInt >= arrayOfByte.length) && (ImageFormatCheckerUtils.startsWithPattern(paramArrayOfByte, arrayOfByte))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean isPngHeader(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = PNG_HEADER;
    boolean bool;
    if ((paramInt >= arrayOfByte.length) && (ImageFormatCheckerUtils.startsWithPattern(paramArrayOfByte, arrayOfByte))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Nullable
  public final ImageFormat determineFormat(byte[] paramArrayOfByte, int paramInt)
  {
    Preconditions.checkNotNull(paramArrayOfByte);
    if (WebpSupportStatus.isWebpHeader(paramArrayOfByte, 0, paramInt)) {
      return getWebpFormat(paramArrayOfByte, paramInt);
    }
    if (isJpegHeader(paramArrayOfByte, paramInt)) {
      return DefaultImageFormats.JPEG;
    }
    if (isPngHeader(paramArrayOfByte, paramInt)) {
      return DefaultImageFormats.PNG;
    }
    if (isGifHeader(paramArrayOfByte, paramInt)) {
      return DefaultImageFormats.GIF;
    }
    if (isBmpHeader(paramArrayOfByte, paramInt)) {
      return DefaultImageFormats.BMP;
    }
    return ImageFormat.UNKNOWN;
  }
  
  public int getHeaderSize()
  {
    return MAX_HEADER_LENGTH;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageformat.DefaultImageFormatChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */