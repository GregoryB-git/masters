package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class AppCompatSpinner$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public AppCompatSpinner$2(AppCompatSpinner paramAppCompatSpinner) {}
  
  public void onGlobalLayout()
  {
    if (!this$0.getInternalPopup().isShowing()) {
      this$0.showPopup();
    }
    ViewTreeObserver localViewTreeObserver = this$0.getViewTreeObserver();
    if (localViewTreeObserver != null) {
      AppCompatSpinner.Api16Impl.removeOnGlobalLayoutListener(localViewTreeObserver, this);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */