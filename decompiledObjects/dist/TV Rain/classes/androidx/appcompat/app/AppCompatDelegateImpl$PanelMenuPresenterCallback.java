package androidx.appcompat.app;

import android.view.Window.Callback;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;

final class AppCompatDelegateImpl$PanelMenuPresenterCallback
  implements MenuPresenter.Callback
{
  public AppCompatDelegateImpl$PanelMenuPresenterCallback(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void onCloseMenu(@NonNull MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    MenuBuilder localMenuBuilder = paramMenuBuilder.getRootMenu();
    int i;
    if (localMenuBuilder != paramMenuBuilder) {
      i = 1;
    } else {
      i = 0;
    }
    AppCompatDelegateImpl localAppCompatDelegateImpl = this$0;
    if (i != 0) {
      paramMenuBuilder = localMenuBuilder;
    }
    paramMenuBuilder = localAppCompatDelegateImpl.findMenuPanel(paramMenuBuilder);
    if (paramMenuBuilder != null) {
      if (i != 0)
      {
        this$0.callOnPanelClosed(featureId, paramMenuBuilder, localMenuBuilder);
        this$0.closePanel(paramMenuBuilder, true);
      }
      else
      {
        this$0.closePanel(paramMenuBuilder, paramBoolean);
      }
    }
  }
  
  public boolean onOpenSubMenu(@NonNull MenuBuilder paramMenuBuilder)
  {
    if (paramMenuBuilder == paramMenuBuilder.getRootMenu())
    {
      Object localObject = this$0;
      if (mHasActionBar)
      {
        localObject = ((AppCompatDelegateImpl)localObject).getWindowCallback();
        if ((localObject != null) && (!this$0.mDestroyed)) {
          ((Window.Callback)localObject).onMenuOpened(108, paramMenuBuilder);
        }
      }
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */