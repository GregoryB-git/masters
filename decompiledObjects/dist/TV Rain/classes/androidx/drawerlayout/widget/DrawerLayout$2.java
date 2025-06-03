package androidx.drawerlayout.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class DrawerLayout$2
  implements View.OnApplyWindowInsetsListener
{
  public DrawerLayout$2(DrawerLayout paramDrawerLayout) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (DrawerLayout)paramView;
    boolean bool;
    if (paramWindowInsets.getSystemWindowInsetTop() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    paramView.setChildInsets(paramWindowInsets, bool);
    return paramWindowInsets.consumeSystemWindowInsets();
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */