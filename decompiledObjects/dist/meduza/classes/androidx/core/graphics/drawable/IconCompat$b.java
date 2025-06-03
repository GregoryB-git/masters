package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import c0.b;

public final class IconCompat$b
{
  public static Drawable a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
  }
  
  public static Icon b(Bitmap paramBitmap)
  {
    return b.g(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */