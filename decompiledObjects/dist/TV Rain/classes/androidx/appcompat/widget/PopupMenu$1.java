package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuBuilder.Callback;

class PopupMenu$1
  implements MenuBuilder.Callback
{
  public PopupMenu$1(PopupMenu paramPopupMenu) {}
  
  public boolean onMenuItemSelected(@NonNull MenuBuilder paramMenuBuilder, @NonNull MenuItem paramMenuItem)
  {
    paramMenuBuilder = this$0.mMenuItemClickListener;
    if (paramMenuBuilder != null) {
      return paramMenuBuilder.onMenuItemClick(paramMenuItem);
    }
    return false;
  }
  
  public void onMenuModeChange(@NonNull MenuBuilder paramMenuBuilder) {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.PopupMenu.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */