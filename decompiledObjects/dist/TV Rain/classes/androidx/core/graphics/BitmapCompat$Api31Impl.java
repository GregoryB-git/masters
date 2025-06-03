package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.hardware.HardwareBuffer;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import g;

@RequiresApi(31)
class BitmapCompat$Api31Impl
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

/* Location:
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api31Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */