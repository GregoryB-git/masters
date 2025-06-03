package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

class ActionMenuPresenter$OverflowMenuButton$1
  extends ForwardingListener
{
  public ActionMenuPresenter$OverflowMenuButton$1(ActionMenuPresenter.OverflowMenuButton paramOverflowMenuButton, View paramView, ActionMenuPresenter paramActionMenuPresenter)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    ActionMenuPresenter.OverflowPopup localOverflowPopup = this$1.this$0.mOverflowPopup;
    if (localOverflowPopup == null) {
      return null;
    }
    return localOverflowPopup.getPopup();
  }
  
  public boolean onForwardingStarted()
  {
    this$1.this$0.showOverflowMenu();
    return true;
  }
  
  public boolean onForwardingStopped()
  {
    ActionMenuPresenter localActionMenuPresenter = this$1.this$0;
    if (mPostedOpenRunnable != null) {
      return false;
    }
    localActionMenuPresenter.hideOverflowMenu();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */