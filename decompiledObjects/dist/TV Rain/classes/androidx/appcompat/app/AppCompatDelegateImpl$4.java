package androidx.appcompat.app;

import android.graphics.Rect;
import androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;

class AppCompatDelegateImpl$4
  implements FitWindowsViewGroup.OnFitSystemWindowsListener
{
  public AppCompatDelegateImpl$4(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void onFitSystemWindows(Rect paramRect)
  {
    top = this$0.updateStatusGuard(null, paramRect);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */