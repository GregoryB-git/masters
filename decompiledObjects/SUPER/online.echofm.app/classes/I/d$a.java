package I;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

public abstract class d$a
{
  public static DisplayCutout a(Rect paramRect, List<Rect> paramList)
  {
    return new DisplayCutout(paramRect, paramList);
  }
  
  public static List<Rect> b(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getBoundingRects();
  }
  
  public static int c(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetBottom();
  }
  
  public static int d(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetLeft();
  }
  
  public static int e(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetRight();
  }
  
  public static int f(DisplayCutout paramDisplayCutout)
  {
    return paramDisplayCutout.getSafeInsetTop();
  }
}

/* Location:
 * Qualified Name:     I.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */