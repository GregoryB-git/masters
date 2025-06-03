package androidx.core.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class ViewCompat$Api21Impl$1
  implements View.OnApplyWindowInsetsListener
{
  public WindowInsetsCompat mLastInsets = null;
  
  public ViewCompat$Api21Impl$1(View paramView, OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    WindowInsetsCompat localWindowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(paramWindowInsets, paramView);
    int i = Build.VERSION.SDK_INT;
    if (i < 30)
    {
      ViewCompat.Api21Impl.callCompatInsetAnimationCallback(paramWindowInsets, val$v);
      if (localWindowInsetsCompat.equals(mLastInsets)) {
        return val$listener.onApplyWindowInsets(paramView, localWindowInsetsCompat).toWindowInsets();
      }
    }
    mLastInsets = localWindowInsetsCompat;
    paramWindowInsets = val$listener.onApplyWindowInsets(paramView, localWindowInsetsCompat);
    if (i >= 30) {
      return paramWindowInsets.toWindowInsets();
    }
    ViewCompat.requestApplyInsets(paramView);
    return paramWindowInsets.toWindowInsets();
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api21Impl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */