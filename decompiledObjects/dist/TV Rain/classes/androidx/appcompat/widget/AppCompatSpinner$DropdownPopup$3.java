package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.PopupWindow.OnDismissListener;

class AppCompatSpinner$DropdownPopup$3
  implements PopupWindow.OnDismissListener
{
  public AppCompatSpinner$DropdownPopup$3(AppCompatSpinner.DropdownPopup paramDropdownPopup, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener) {}
  
  public void onDismiss()
  {
    ViewTreeObserver localViewTreeObserver = this$1.this$0.getViewTreeObserver();
    if (localViewTreeObserver != null) {
      localViewTreeObserver.removeGlobalOnLayoutListener(val$layoutListener);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */