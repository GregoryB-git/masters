package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class DrawableCompat$Api19Impl
{
  @DoNotInline
  public static int getAlpha(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
  
  @DoNotInline
  public static Drawable getChild(DrawableContainer.DrawableContainerState paramDrawableContainerState, int paramInt)
  {
    return paramDrawableContainerState.getChild(paramInt);
  }
  
  @DoNotInline
  public static Drawable getDrawable(InsetDrawable paramInsetDrawable)
  {
    return paramInsetDrawable.getDrawable();
  }
  
  @DoNotInline
  public static boolean isAutoMirrored(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  @DoNotInline
  public static void setAutoMirrored(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.DrawableCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */