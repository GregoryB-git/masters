package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.SubMenuBuilder;

class ActionMenuPresenter$PopupPresenterCallback
  implements MenuPresenter.Callback
{
  public ActionMenuPresenter$PopupPresenterCallback(ActionMenuPresenter paramActionMenuPresenter) {}
  
  public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if ((paramMenuBuilder instanceof SubMenuBuilder)) {
      paramMenuBuilder.getRootMenu().close(false);
    }
    MenuPresenter.Callback localCallback = this$0.getCallback();
    if (localCallback != null) {
      localCallback.onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    Object localObject = ActionMenuPresenter.access$300(this$0);
    boolean bool = false;
    if (paramMenuBuilder == localObject) {
      return false;
    }
    this$0.mOpenSubMenuId = ((SubMenuBuilder)paramMenuBuilder).getItem().getItemId();
    localObject = this$0.getCallback();
    if (localObject != null) {
      bool = ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramMenuBuilder);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */