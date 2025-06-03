package L;

import android.widget.PopupWindow;

public abstract class g$b
{
  public static boolean a(PopupWindow paramPopupWindow)
  {
    return paramPopupWindow.getOverlapAnchor();
  }
  
  public static int b(PopupWindow paramPopupWindow)
  {
    return paramPopupWindow.getWindowLayoutType();
  }
  
  public static void c(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    paramPopupWindow.setOverlapAnchor(paramBoolean);
  }
  
  public static void d(PopupWindow paramPopupWindow, int paramInt)
  {
    paramPopupWindow.setWindowLayoutType(paramInt);
  }
}

/* Location:
 * Qualified Name:     L.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */