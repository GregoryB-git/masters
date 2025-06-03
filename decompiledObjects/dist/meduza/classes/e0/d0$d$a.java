package e0;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import g.h;

public final class d0$d$a
  implements View.OnApplyWindowInsetsListener
{
  public s0 a = null;
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    s0 locals0 = s0.c(paramWindowInsets, paramView);
    int i = Build.VERSION.SDK_INT;
    if (i < 30)
    {
      d0.d.a(paramWindowInsets, b);
      if (locals0.equals(a)) {
        return ((h)c).a(paramView, locals0).b();
      }
    }
    a = locals0;
    paramWindowInsets = ((h)c).a(paramView, locals0);
    if (i >= 30) {
      return paramWindowInsets.b();
    }
    d0.c.c(paramView);
    return paramWindowInsets.b();
  }
}

/* Location:
 * Qualified Name:     e0.d0.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */