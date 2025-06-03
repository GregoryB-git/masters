package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;

@DoNotStrip
public class NativeBlurFilter
{
  static {}
  
  public static void iterativeBoxBlur(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    Preconditions.checkNotNull(paramBitmap);
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    nativeIterativeBoxBlur(paramBitmap, paramInt1, paramInt2);
  }
  
  @DoNotStrip
  private static native void nativeIterativeBoxBlur(Bitmap paramBitmap, int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.nativecode.NativeBlurFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */