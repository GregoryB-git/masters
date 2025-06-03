package com.facebook.imagepipeline.nativecode;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.imageutils.BitmapUtil;
import java.nio.ByteBuffer;

@DoNotStrip
public class Bitmaps
{
  static {}
  
  public static void copyBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    Bitmap.Config localConfig1 = paramBitmap2.getConfig();
    Bitmap.Config localConfig2 = paramBitmap1.getConfig();
    boolean bool1 = true;
    boolean bool2;
    if (localConfig1 == localConfig2) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    Preconditions.checkArgument(paramBitmap1.isMutable());
    if (paramBitmap1.getWidth() == paramBitmap2.getWidth()) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramBitmap1.getHeight() == paramBitmap2.getHeight()) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    nativeCopyBitmap(paramBitmap1, paramBitmap1.getRowBytes(), paramBitmap2, paramBitmap2.getRowBytes(), paramBitmap1.getHeight());
  }
  
  public static ByteBuffer getByteBuffer(Bitmap paramBitmap, long paramLong1, long paramLong2)
  {
    Preconditions.checkNotNull(paramBitmap);
    return nativeGetByteBuffer(paramBitmap, paramLong1, paramLong2);
  }
  
  @DoNotStrip
  private static native void nativeCopyBitmap(Bitmap paramBitmap1, int paramInt1, Bitmap paramBitmap2, int paramInt2, int paramInt3);
  
  @DoNotStrip
  private static native ByteBuffer nativeGetByteBuffer(Bitmap paramBitmap, long paramLong1, long paramLong2);
  
  @DoNotStrip
  private static native void nativePinBitmap(Bitmap paramBitmap);
  
  @DoNotStrip
  private static native void nativeReleaseByteBuffer(Bitmap paramBitmap);
  
  public static void pinBitmap(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    nativePinBitmap(paramBitmap);
  }
  
  @TargetApi(19)
  public static void reconfigureBitmap(Bitmap paramBitmap, int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    boolean bool;
    if (paramBitmap.getAllocationByteCount() >= BitmapUtil.getPixelSizeForBitmapConfig(paramConfig) * (paramInt1 * paramInt2)) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    paramBitmap.reconfigure(paramInt1, paramInt2, paramConfig);
  }
  
  public static void releaseByteBuffer(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    nativeReleaseByteBuffer(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.nativecode.Bitmaps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */