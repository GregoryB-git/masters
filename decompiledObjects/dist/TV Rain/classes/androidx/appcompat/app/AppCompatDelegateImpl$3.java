package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

class AppCompatDelegateImpl$3
  implements OnApplyWindowInsetsListener
{
  public AppCompatDelegateImpl$3(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public WindowInsetsCompat onApplyWindowInsets(View paramView, WindowInsetsCompat paramWindowInsetsCompat)
  {
    int i = paramWindowInsetsCompat.getSystemWindowInsetTop();
    int j = this$0.updateStatusGuard(paramWindowInsetsCompat, null);
    WindowInsetsCompat localWindowInsetsCompat = paramWindowInsetsCompat;
    if (i != j) {
      localWindowInsetsCompat = paramWindowInsetsCompat.replaceSystemWindowInsets(paramWindowInsetsCompat.getSystemWindowInsetLeft(), j, paramWindowInsetsCompat.getSystemWindowInsetRight(), paramWindowInsetsCompat.getSystemWindowInsetBottom());
    }
    return ViewCompat.onApplyWindowInsets(paramView, localWindowInsetsCompat);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */