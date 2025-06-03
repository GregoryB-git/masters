package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.view.menu.ShowableListMenu;

class AppCompatSpinner$1
  extends ForwardingListener
{
  public AppCompatSpinner$1(AppCompatSpinner paramAppCompatSpinner, View paramView, AppCompatSpinner.DropdownPopup paramDropdownPopup)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    return val$popup;
  }
  
  @SuppressLint({"SyntheticAccessor"})
  public boolean onForwardingStarted()
  {
    if (!this$0.getInternalPopup().isShowing()) {
      this$0.showPopup();
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */