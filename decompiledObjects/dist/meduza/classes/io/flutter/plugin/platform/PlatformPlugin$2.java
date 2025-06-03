package io.flutter.plugin.platform;

import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;

class PlatformPlugin$2
  implements View.OnSystemUiVisibilityChangeListener
{
  public void onSystemUiVisibilityChange(int paramInt)
  {
    val$decorView.post(new a(this, paramInt));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformPlugin.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */