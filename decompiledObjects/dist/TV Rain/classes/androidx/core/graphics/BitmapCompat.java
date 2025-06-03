package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import g;

public final class BitmapCompat
{
  @NonNull
  public static Bitmap createScaledBitmap(@NonNull Bitmap paramBitmap, int paramInt1, int paramInt2, @Nullable Rect paramRect, boolean paramBoolean)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      if ((paramRect != null) && ((paramRect.isEmpty()) || (left < 0) || (right > paramBitmap.getWidth()) || (top < 0) || (bottom > paramBitmap.getHeight()))) {
        throw new IllegalArgumentException("srcRect must be contained by srcBm!");
      }
      int i = Build.VERSION.SDK_INT;
      if (i >= 27) {
        localObject1 = Api27Impl.copyBitmapIfHardware(paramBitmap);
      } else {
        localObject1 = paramBitmap;
      }
      int j;
      if (paramRect != null) {
        j = paramRect.width();
      } else {
        j = paramBitmap.getWidth();
      }
      int k;
      if (paramRect != null) {
        k = paramRect.height();
      } else {
        k = paramBitmap.getHeight();
      }
      float f1 = paramInt1 / j;
      float f2 = paramInt2 / k;
      if (paramRect != null) {
        m = left;
      } else {
        m = 0;
      }
      int n;
      if (paramRect != null) {
        n = top;
      } else {
        n = 0;
      }
      if ((m == 0) && (n == 0) && (paramInt1 == paramBitmap.getWidth()) && (paramInt2 == paramBitmap.getHeight()))
      {
        if ((paramBitmap.isMutable()) && (paramBitmap == localObject1)) {
          return paramBitmap.copy(paramBitmap.getConfig(), true);
        }
        return (Bitmap)localObject1;
      }
      Object localObject2 = new Paint(1);
      ((Paint)localObject2).setFilterBitmap(true);
      if (i >= 29) {
        Api29Impl.setPaintBlendMode((Paint)localObject2);
      } else {
        ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
      }
      if ((j == paramInt1) && (k == paramInt2))
      {
        paramBitmap = Bitmap.createBitmap(paramInt1, paramInt2, ((Bitmap)localObject1).getConfig());
        new Canvas(paramBitmap).drawBitmap((Bitmap)localObject1, -m, -n, (Paint)localObject2);
        return paramBitmap;
      }
      double d1 = Math.log(2.0D);
      double d2;
      if (f1 > 1.0F) {
        d2 = Math.ceil(Math.log(f1) / d1);
      } else {
        d2 = Math.floor(Math.log(f1) / d1);
      }
      int i1 = (int)d2;
      if (f2 > 1.0F) {
        d2 = Math.ceil(Math.log(f2) / d1);
      } else {
        d2 = Math.floor(Math.log(f2) / d1);
      }
      int i2 = (int)d2;
      paramRect = null;
      if ((paramBoolean) && (i >= 27) && (!Api27Impl.isAlreadyF16AndLinear(paramBitmap)))
      {
        if (i1 > 0) {
          i = sizeAtStep(j, paramInt1, 1, i1);
        } else {
          i = j;
        }
        if (i2 > 0) {
          i3 = sizeAtStep(k, paramInt2, 1, i2);
        } else {
          i3 = k;
        }
        localObject3 = Api27Impl.createBitmapWithSourceColorspace(i, i3, paramBitmap, true);
        new Canvas((Bitmap)localObject3).drawBitmap((Bitmap)localObject1, -m, -n, (Paint)localObject2);
        i = 1;
        n = 0;
        m = 0;
        paramRect = (Rect)localObject1;
        localObject1 = localObject3;
      }
      else
      {
        i = 0;
      }
      Rect localRect = new Rect(m, n, j, k);
      Object localObject4 = new Rect();
      int m = i1;
      int i3 = i2;
      Object localObject3 = localObject2;
      localObject2 = localObject1;
      Object localObject1 = localObject4;
      for (;;)
      {
        if ((m == 0) && (i3 == 0))
        {
          if ((paramRect != paramBitmap) && (paramRect != null)) {
            paramRect.recycle();
          }
          return (Bitmap)localObject2;
        }
        if (m < 0)
        {
          n = m + 1;
        }
        else
        {
          n = m;
          if (m > 0) {
            n = m - 1;
          }
        }
        if (i3 < 0)
        {
          m = i3 + 1;
        }
        else
        {
          m = i3;
          if (i3 > 0) {
            m = i3 - 1;
          }
        }
        ((Rect)localObject1).set(0, 0, sizeAtStep(j, paramInt1, n, i1), sizeAtStep(k, paramInt2, m, i2));
        if ((n == 0) && (m == 0)) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if ((paramRect != null) && (paramRect.getWidth() == paramInt1) && (paramRect.getHeight() == paramInt2)) {
          i4 = 1;
        } else {
          i4 = 0;
        }
        if ((paramRect != null) && (paramRect != paramBitmap))
        {
          if ((paramBoolean) && (Build.VERSION.SDK_INT >= 27)) {
            if (!Api27Impl.isAlreadyF16AndLinear(paramRect)) {
              break label804;
            }
          }
          if ((i3 == 0) || ((i4 != 0) && (i == 0))) {
            break label927;
          }
        }
        label804:
        if ((paramRect != paramBitmap) && (paramRect != null)) {
          paramRect.recycle();
        }
        if (n > 0) {
          i4 = i;
        } else {
          i4 = n;
        }
        int i5 = sizeAtStep(j, paramInt1, i4, i1);
        if (m > 0) {
          i4 = i;
        } else {
          i4 = m;
        }
        int i4 = sizeAtStep(k, paramInt2, i4, i2);
        if (Build.VERSION.SDK_INT >= 27)
        {
          boolean bool;
          if ((paramBoolean) && (i3 == 0)) {
            bool = true;
          } else {
            bool = false;
          }
          paramRect = Api27Impl.createBitmapWithSourceColorspace(i5, i4, paramBitmap, bool);
        }
        else
        {
          paramRect = Bitmap.createBitmap(i5, i4, ((Bitmap)localObject2).getConfig());
        }
        label927:
        new Canvas(paramRect).drawBitmap((Bitmap)localObject2, localRect, (Rect)localObject1, (Paint)localObject3);
        localRect.set((Rect)localObject1);
        i3 = m;
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = paramRect;
        paramRect = (Rect)localObject3;
        m = n;
        localObject3 = localObject4;
      }
    }
    throw new IllegalArgumentException("dstW and dstH must be > 0!");
  }
  
  public static int getAllocationByteCount(@NonNull Bitmap paramBitmap)
  {
    return Api19Impl.getAllocationByteCount(paramBitmap);
  }
  
  public static boolean hasMipMap(@NonNull Bitmap paramBitmap)
  {
    return Api17Impl.hasMipMap(paramBitmap);
  }
  
  public static void setHasMipMap(@NonNull Bitmap paramBitmap, boolean paramBoolean)
  {
    Api17Impl.setHasMipMap(paramBitmap, paramBoolean);
  }
  
  @VisibleForTesting
  public static int sizeAtStep(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == 0) {
      return paramInt2;
    }
    if (paramInt3 > 0) {
      return paramInt1 * (1 << paramInt4 - paramInt3);
    }
    return paramInt2 << -paramInt3 - 1;
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static boolean hasMipMap(Bitmap paramBitmap)
    {
      return paramBitmap.hasMipMap();
    }
    
    @DoNotInline
    public static void setHasMipMap(Bitmap paramBitmap, boolean paramBoolean)
    {
      paramBitmap.setHasMipMap(paramBoolean);
    }
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static int getAllocationByteCount(Bitmap paramBitmap)
    {
      return paramBitmap.getAllocationByteCount();
    }
  }
  
  @RequiresApi(27)
  public static class Api27Impl
  {
    @DoNotInline
    public static Bitmap copyBitmapIfHardware(Bitmap paramBitmap)
    {
      Object localObject = paramBitmap;
      if (paramBitmap.getConfig() == Bitmap.Config.HARDWARE)
      {
        localObject = Bitmap.Config.ARGB_8888;
        if (Build.VERSION.SDK_INT >= 31) {
          localObject = BitmapCompat.Api31Impl.getHardwareBitmapConfig(paramBitmap);
        }
        localObject = paramBitmap.copy((Bitmap.Config)localObject, true);
      }
      return (Bitmap)localObject;
    }
    
    @DoNotInline
    public static Bitmap createBitmapWithSourceColorspace(int paramInt1, int paramInt2, Bitmap paramBitmap, boolean paramBoolean)
    {
      Bitmap.Config localConfig = paramBitmap.getConfig();
      ColorSpace localColorSpace1 = paramBitmap.getColorSpace();
      ColorSpace localColorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
      if ((paramBoolean) && (!paramBitmap.getColorSpace().equals(localColorSpace2)))
      {
        localConfig = Bitmap.Config.RGBA_F16;
      }
      else
      {
        localColorSpace2 = localColorSpace1;
        if (paramBitmap.getConfig() == Bitmap.Config.HARDWARE)
        {
          localConfig = Bitmap.Config.ARGB_8888;
          localColorSpace2 = localColorSpace1;
          if (Build.VERSION.SDK_INT >= 31)
          {
            localConfig = BitmapCompat.Api31Impl.getHardwareBitmapConfig(paramBitmap);
            localColorSpace2 = localColorSpace1;
          }
        }
      }
      return Bitmap.createBitmap(paramInt1, paramInt2, localConfig, paramBitmap.hasAlpha(), localColorSpace2);
    }
    
    @DoNotInline
    public static boolean isAlreadyF16AndLinear(Bitmap paramBitmap)
    {
      ColorSpace localColorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
      boolean bool;
      if ((paramBitmap.getConfig() == Bitmap.Config.RGBA_F16) && (paramBitmap.getColorSpace().equals(localColorSpace))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  @RequiresApi(29)
  public static class Api29Impl
  {
    @DoNotInline
    public static void setPaintBlendMode(Paint paramPaint)
    {
      paramPaint.setBlendMode(BlendMode.SRC);
    }
  }
  
  @RequiresApi(31)
  public static class Api31Impl
  {
    @DoNotInline
    public static Bitmap.Config getHardwareBitmapConfig(Bitmap paramBitmap)
    {
      if (g.c(paramBitmap).getFormat() == 22) {
        return Bitmap.Config.RGBA_F16;
      }
      return Bitmap.Config.ARGB_8888;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.BitmapCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */