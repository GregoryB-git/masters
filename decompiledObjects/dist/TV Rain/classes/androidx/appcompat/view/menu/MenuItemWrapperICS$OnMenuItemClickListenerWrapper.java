package androidx.appcompat.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class MenuItemWrapperICS$OnMenuItemClickListenerWrapper
  implements MenuItem.OnMenuItemClickListener
{
  private final MenuItem.OnMenuItemClickListener mObject;
  
  public MenuItemWrapperICS$OnMenuItemClickListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mObject = paramOnMenuItemClickListener;
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return mObject.onMenuItemClick(this$0.getMenuItemWrapper(paramMenuItem));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.OnMenuItemClickListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */