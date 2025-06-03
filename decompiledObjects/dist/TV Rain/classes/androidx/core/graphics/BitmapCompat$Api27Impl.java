package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import android.graphics.ColorSpace.Named;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(27)
class BitmapCompat$Api27Impl
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

/* Location:
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api27Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */