package I;

import android.view.View;
import android.view.WindowInsets;

public abstract class s$j
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
 * Qualified Name:     I.s.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */