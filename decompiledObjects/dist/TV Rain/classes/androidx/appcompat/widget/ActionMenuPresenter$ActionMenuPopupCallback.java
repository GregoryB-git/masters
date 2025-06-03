package androidx.appcompat.widget;

import androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

class ActionMenuPresenter$ActionMenuPopupCallback
  extends ActionMenuItemView.PopupCallback
{
  public ActionMenuPresenter$ActionMenuPopupCallback(ActionMenuPresenter paramActionMenuPresenter) {}
  
  public ShowableListMenu getPopup()
  {
    Object localObject = this$0.mActionButtonPopup;
    if (localObject != null) {
      localObject = ((MenuPopupHelper)localObject).getPopup();
    } else {
      localObject = null;
    }
    return (ShowableListMenu)localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */