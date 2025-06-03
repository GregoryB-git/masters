package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.DecorToolbar;

final class ToolbarActionBar$ActionMenuPresenterCallback
  implements MenuPresenter.Callback
{
  private boolean mClosingActionMenu;
  
  public ToolbarActionBar$ActionMenuPresenterCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (mClosingActionMenu) {
      return;
    }
    mClosingActionMenu = true;
    this$0.mDecorToolbar.dismissPopupMenus();
    this$0.mWindowCallback.onPanelClosed(108, paramMenuBuilder);
    mClosingActionMenu = false;
  }
  
  public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    this$0.mWindowCallback.onMenuOpened(108, paramMenuBuilder);
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.ActionMenuPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */