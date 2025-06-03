package L;

import android.view.View;
import android.widget.PopupWindow;

public abstract class g
{
  public static void a(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    b.c(paramPopupWindow, paramBoolean);
  }
  
  public static void b(PopupWindow paramPopupWindow, int paramInt)
  {
    b.d(paramPopupWindow, paramInt);
  }
  
  public static void c(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    a.a(paramPopupWindow, paramView, paramInt1, paramInt2, paramInt3);
  }
  
  public static abstract class a
  {
    public static void a(PopupWindow paramPopupWindow, View paramView, int paramInt1, int paramInt2, int paramInt3)
    {
      paramPopupWindow.showAsDropDown(paramView, paramInt1, paramInt2, paramInt3);
    }
  }
  
  public static abstract class b
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
}

/* Location:
 * Qualified Name:     L.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */