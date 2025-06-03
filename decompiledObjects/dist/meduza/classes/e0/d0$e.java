package e0;

import android.view.View;
import android.view.WindowInsets;

public final class d0$e
{
  public static s0 a(View paramView)
  {
    Object localObject = paramView.getRootWindowInsets();
    if (localObject == null) {
      return null;
    }
    localObject = s0.c((WindowInsets)localObject, null);
    a.l((s0)localObject);
    paramView = paramView.getRootView();
    a.d(paramView);
    return (s0)localObject;
  }
  
  public static int b(View paramView)
  {
    return paramView.getScrollIndicators();
  }
  
  public static void c(View paramView, int paramInt)
  {
    paramView.setScrollIndicators(paramInt);
  }
  
  public static void d(View paramView, int paramInt1, int paramInt2)
  {
    paramView.setScrollIndicators(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     e0.d0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */