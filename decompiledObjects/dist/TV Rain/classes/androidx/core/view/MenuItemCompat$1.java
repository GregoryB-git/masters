package androidx.core.view;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class MenuItemCompat$1
  implements MenuItem.OnActionExpandListener
{
  public MenuItemCompat$1(MenuItemCompat.OnActionExpandListener paramOnActionExpandListener) {}
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    return val$listener.onMenuItemActionCollapse(paramMenuItem);
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return val$listener.onMenuItemActionExpand(paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuItemCompat.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */