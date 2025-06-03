package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import f0;

@RequiresApi(26)
class IconCompat$Api26Impl
{
  @DoNotInline
  public static Drawable createAdaptiveIconDrawable(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    return new AdaptiveIconDrawable(paramDrawable1, paramDrawable2);
  }
  
  @DoNotInline
  public static Icon createWithAdaptiveBitmap(Bitmap paramBitmap)
  {
    return f0.o(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.IconCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */