package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

public abstract class IconCompat$b
{
  public static Drawable a(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
  }
  
  public static Icon b(Bitmap paramBitmap)
  {
    return Icon.createWithAdaptiveBitmap(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */