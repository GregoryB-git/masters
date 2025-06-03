package I;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

public class s$k$a
  implements View.OnApplyWindowInsetsListener
{
  public x a = null;
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = x.t(paramWindowInsets, paramView);
    if (Build.VERSION.SDK_INT < 30)
    {
      s.k.a(paramWindowInsets, b);
      if (paramView.equals(a)) {
        throw null;
      }
    }
    a = paramView;
    throw null;
  }
}

/* Location:
 * Qualified Name:     I.s.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */