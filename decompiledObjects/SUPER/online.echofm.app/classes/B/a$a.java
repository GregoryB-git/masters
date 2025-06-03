package B;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;

public abstract class a$a
{
  public static int a(Drawable paramDrawable)
  {
    return paramDrawable.getAlpha();
  }
  
  public static Drawable b(DrawableContainer.DrawableContainerState paramDrawableContainerState, int paramInt)
  {
    return paramDrawableContainerState.getChild(paramInt);
  }
  
  public static Drawable c(InsetDrawable paramInsetDrawable)
  {
    return paramInsetDrawable.getDrawable();
  }
  
  public static boolean d(Drawable paramDrawable)
  {
    return paramDrawable.isAutoMirrored();
  }
  
  public static void e(Drawable paramDrawable, boolean paramBoolean)
  {
    paramDrawable.setAutoMirrored(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     B.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */