package com.facebook.imagepipeline.nativecode;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@DoNotStrip
public class JpegTranscoder
{
  public static final int MAX_QUALITY = 100;
  public static final int MAX_SCALE_NUMERATOR = 16;
  public static final int MIN_QUALITY = 0;
  public static final int MIN_SCALE_NUMERATOR = 1;
  public static final int SCALE_DENOMINATOR = 8;
  
  static {}
  
  public static boolean isExifOrientationAllowed(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean isRotationAngleAllowed(int paramInt)
  {
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= 270) && (paramInt % 90 == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @DoNotStrip
  private static native void nativeTranscodeJpeg(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3)
    throws IOException;
  
  @DoNotStrip
  private static native void nativeTranscodeJpegWithExifOrientation(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3)
    throws IOException;
  
  public static void transcodeJpeg(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3)
    throws IOException
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramInt2 >= 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 <= 16) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 <= 100) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    Preconditions.checkArgument(isRotationAngleAllowed(paramInt1));
    if (paramInt2 == 8)
    {
      bool2 = bool1;
      if (paramInt1 == 0) {}
    }
    else
    {
      bool2 = true;
    }
    Preconditions.checkArgument(bool2, "no transformation requested");
    nativeTranscodeJpeg((InputStream)Preconditions.checkNotNull(paramInputStream), (OutputStream)Preconditions.checkNotNull(paramOutputStream), paramInt1, paramInt2, paramInt3);
  }
  
  public static void transcodeJpegWithExifOrientation(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt1, int paramInt2, int paramInt3)
    throws IOException
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramInt2 >= 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 <= 16) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 <= 100) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    Preconditions.checkArgument(isExifOrientationAllowed(paramInt1));
    if (paramInt2 == 8)
    {
      bool2 = bool1;
      if (paramInt1 == 1) {}
    }
    else
    {
      bool2 = true;
    }
    Preconditions.checkArgument(bool2, "no transformation requested");
    nativeTranscodeJpegWithExifOrientation((InputStream)Preconditions.checkNotNull(paramInputStream), (OutputStream)Preconditions.checkNotNull(paramOutputStream), paramInt1, paramInt2, paramInt3);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.nativecode.JpegTranscoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */