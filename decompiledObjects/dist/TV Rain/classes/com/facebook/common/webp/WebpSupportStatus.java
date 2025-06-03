package com.facebook.common.webp;

import java.io.UnsupportedEncodingException;
import javax.annotation.Nullable;

public class WebpSupportStatus
{
  private static final int EXTENDED_WEBP_HEADER_LENGTH = 21;
  private static final int SIMPLE_WEBP_HEADER_LENGTH = 20;
  private static final String VP8X_WEBP_BASE64 = "UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==";
  private static final byte[] WEBP_NAME_BYTES;
  private static final byte[] WEBP_RIFF_BYTES;
  private static final byte[] WEBP_VP8L_BYTES = asciiBytes("VP8L");
  private static final byte[] WEBP_VP8X_BYTES = asciiBytes("VP8X");
  private static final byte[] WEBP_VP8_BYTES;
  public static final boolean sIsExtendedWebpSupported;
  public static final boolean sIsSimpleWebpSupported;
  public static final boolean sIsWebpSupportRequired = false;
  @Nullable
  public static WebpBitmapFactory sWebpBitmapFactory;
  private static boolean sWebpLibraryChecked;
  
  static
  {
    sIsSimpleWebpSupported = true;
    sIsExtendedWebpSupported = isExtendedWebpSupported();
    sWebpBitmapFactory = null;
    sWebpLibraryChecked = false;
    WEBP_RIFF_BYTES = asciiBytes("RIFF");
    WEBP_NAME_BYTES = asciiBytes("WEBP");
    WEBP_VP8_BYTES = asciiBytes("VP8 ");
  }
  
  private static byte[] asciiBytes(String paramString)
  {
    try
    {
      paramString = paramString.getBytes("ASCII");
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new RuntimeException("ASCII not found!", paramString);
    }
  }
  
  public static boolean isAnimatedWebpHeader(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = matchBytePattern(paramArrayOfByte, paramInt + 12, WEBP_VP8X_BYTES);
    paramInt = paramArrayOfByte[(paramInt + 20)];
    boolean bool2 = true;
    if ((paramInt & 0x2) == 2) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((!bool1) || (paramInt == 0)) {
      bool2 = false;
    }
    return bool2;
  }
  
  public static boolean isExtendedWebpHeader(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 >= 21) && (matchBytePattern(paramArrayOfByte, paramInt1 + 12, WEBP_VP8X_BYTES))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isExtendedWebpHeaderWithAlpha(byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool1 = matchBytePattern(paramArrayOfByte, paramInt + 12, WEBP_VP8X_BYTES);
    paramInt = paramArrayOfByte[(paramInt + 20)];
    boolean bool2 = true;
    if ((paramInt & 0x10) == 16) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((!bool1) || (paramInt == 0)) {
      bool2 = false;
    }
    return bool2;
  }
  
  private static boolean isExtendedWebpSupported()
  {
    return true;
  }
  
  public static boolean isLosslessWebpHeader(byte[] paramArrayOfByte, int paramInt)
  {
    return matchBytePattern(paramArrayOfByte, paramInt + 12, WEBP_VP8L_BYTES);
  }
  
  public static boolean isSimpleWebpHeader(byte[] paramArrayOfByte, int paramInt)
  {
    return matchBytePattern(paramArrayOfByte, paramInt + 12, WEBP_VP8_BYTES);
  }
  
  public static boolean isWebpHeader(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 >= 20) && (matchBytePattern(paramArrayOfByte, paramInt1, WEBP_RIFF_BYTES)) && (matchBytePattern(paramArrayOfByte, paramInt1 + 8, WEBP_NAME_BYTES))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isWebpSupportedByPlatform(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (isSimpleWebpHeader(paramArrayOfByte, paramInt1)) {
      return sIsSimpleWebpSupported;
    }
    if (isLosslessWebpHeader(paramArrayOfByte, paramInt1)) {
      return sIsExtendedWebpSupported;
    }
    if (isExtendedWebpHeader(paramArrayOfByte, paramInt1, paramInt2))
    {
      if (isAnimatedWebpHeader(paramArrayOfByte, paramInt1)) {
        return false;
      }
      return sIsExtendedWebpSupported;
    }
    return false;
  }
  
  @Nullable
  public static WebpBitmapFactory loadWebpBitmapFactoryIfExists()
  {
    if (sWebpLibraryChecked) {
      return sWebpBitmapFactory;
    }
    Object localObject1 = null;
    try
    {
      WebpBitmapFactory localWebpBitmapFactory = (WebpBitmapFactory)Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
      localObject1 = localWebpBitmapFactory;
    }
    finally
    {
      for (;;) {}
    }
    sWebpLibraryChecked = true;
    return (WebpBitmapFactory)localObject1;
  }
  
  private static boolean matchBytePattern(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    if ((paramArrayOfByte2 != null) && (paramArrayOfByte1 != null))
    {
      if (paramArrayOfByte2.length + paramInt > paramArrayOfByte1.length) {
        return false;
      }
      for (int i = 0; i < paramArrayOfByte2.length; i++) {
        if (paramArrayOfByte1[(i + paramInt)] != paramArrayOfByte2[i]) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.webp.WebpSupportStatus
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */