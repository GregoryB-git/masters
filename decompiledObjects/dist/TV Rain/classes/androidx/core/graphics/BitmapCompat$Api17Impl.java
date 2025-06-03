package androidx.core.graphics;

import android.graphics.Bitmap;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
class BitmapCompat$Api17Impl
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

/* Location:
 * Qualified Name:     androidx.core.graphics.BitmapCompat.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */