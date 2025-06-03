package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;
import androidx.appcompat.widget.DecorToolbar;

final class ToolbarActionBar$MenuBuilderCallback
  implements MenuBuilder.Callback
{
  public ToolbarActionBar$MenuBuilderCallback(ToolbarActionBar paramToolbarActionBar) {}
  
  public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder)
  {
    if (this$0.mDecorToolbar.isOverflowMenuShowing()) {
      this$0.mWindowCallback.onPanelClosed(108, paramMenuBuilder);
    } else if (this$0.mWindowCallback.onPreparePanel(0, null, paramMenuBuilder)) {
      this$0.mWindowCallback.onMenuOpened(108, paramMenuBuilder);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.ToolbarActionBar.MenuBuilderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */