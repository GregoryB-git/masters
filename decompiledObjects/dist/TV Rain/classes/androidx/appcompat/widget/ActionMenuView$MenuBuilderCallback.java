package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;

class ActionMenuView$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  public ActionMenuView$MenuBuilderCallback(ActionMenuView paramActionMenuView) {}
  
  public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    paramMenuBuilder = this$0.mOnMenuItemClickListener;
    boolean bool;
    if ((paramMenuBuilder != null) && (paramMenuBuilder.onMenuItemClick(paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
  {
    MenuBuilder.Callback localCallback = this$0.mMenuBuilderCallback;
    if (localCallback != null) {
      localCallback.onMenuModeChange(paramMenuBuilder);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView.MenuBuilderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */