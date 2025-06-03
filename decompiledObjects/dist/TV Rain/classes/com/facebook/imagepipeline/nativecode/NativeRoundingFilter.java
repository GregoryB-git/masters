package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;

@DoNotStrip
public class NativeRoundingFilter
{
  static {}
  
  @DoNotStrip
  private static native void nativeToCircleFilter(Bitmap paramBitmap);
  
  public static void toCircle(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    nativeToCircleFilter(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.nativecode.NativeRoundingFilter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */