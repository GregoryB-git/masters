package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

final class AppCompatDelegateImpl$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  public AppCompatDelegateImpl$ActionMenuPresenterCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    this$0.checkCloseActionMenu(paramMenuBuilder);
  }
  
  public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    Window.Callback localCallback = this$0.getWindowCallback();
    if (localCallback != null) {
      localCallback.onMenuOpened(108, paramMenuBuilder);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */