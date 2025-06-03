package io.flutter.plugin.platform;

import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;

public class h$b
  implements View.OnSystemUiVisibilityChangeListener
{
  public h$b(h paramh, View paramView) {}
  
  public void onSystemUiVisibilityChange(int paramInt)
  {
    a.post(new i(this, paramInt));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */