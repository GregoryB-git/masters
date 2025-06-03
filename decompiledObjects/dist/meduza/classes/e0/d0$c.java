package e0;

import android.view.View;
import android.view.WindowInsets;

public final class d0$c
{
  public static WindowInsets a(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
  
  public static WindowInsets b(View paramView, WindowInsets paramWindowInsets)
  {
    return paramView.onApplyWindowInsets(paramWindowInsets);
  }
  
  public static void c(View paramView)
  {
    paramView.requestApplyInsets();
  }
}

/* Location:
 * Qualified Name:     e0.d0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */