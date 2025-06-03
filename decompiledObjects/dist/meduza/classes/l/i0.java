package l;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;

public final class i0
{
  public static final int[] a = { 16842912 };
  public static final int[] b = new int[0];
  
  static
  {
    new Rect();
  }
  
  public static void a(Drawable paramDrawable)
  {
    Object localObject = paramDrawable.getClass().getName();
    int i = Build.VERSION.SDK_INT;
    if ((i >= 29) && (i < 31) && ("android.graphics.drawable.ColorStateListDrawable".equals(localObject)))
    {
      localObject = paramDrawable.getState();
      if ((localObject != null) && (localObject.length != 0)) {
        paramDrawable.setState(b);
      } else {
        paramDrawable.setState(a);
      }
      paramDrawable.setState((int[])localObject);
    }
  }
  
  public static PorterDuff.Mode b(int paramInt, PorterDuff.Mode paramMode)
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
 * Qualified Name:     l.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */