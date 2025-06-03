package l;

import B.b;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.ScaleDrawable;
import h.c;

public abstract class B
{
  public static final int[] a = { 16842912 };
  public static final int[] b = new int[0];
  public static final Rect c = new Rect();
  public static Class d;
  
  static
  {
    try
    {
      d = Class.forName("android.graphics.Insets");
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof DrawableContainer))
    {
      paramDrawable = paramDrawable.getConstantState();
      if ((paramDrawable instanceof DrawableContainer.DrawableContainerState))
      {
        paramDrawable = ((DrawableContainer.DrawableContainerState)paramDrawable).getChildren();
        int i = paramDrawable.length;
        for (int j = 0; j < i; j++) {
          if (!a(paramDrawable[j])) {
            return false;
          }
        }
      }
    }
    else
    {
      if ((paramDrawable instanceof b)) {
        paramDrawable = ((b)paramDrawable).a();
      }
      for (;;)
      {
        return a(paramDrawable);
        if ((paramDrawable instanceof c))
        {
          paramDrawable = ((c)paramDrawable).a();
        }
        else
        {
          if (!(paramDrawable instanceof ScaleDrawable)) {
            break;
          }
          paramDrawable = ((ScaleDrawable)paramDrawable).getDrawable();
        }
      }
    }
    return true;
  }
  
  public static void b(Drawable paramDrawable) {}
  
  public static PorterDuff.Mode c(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
}

/* Location:
 * Qualified Name:     l.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */