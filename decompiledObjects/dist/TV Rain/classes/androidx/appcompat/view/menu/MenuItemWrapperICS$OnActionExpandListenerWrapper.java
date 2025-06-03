package androidx.appcompat.view.menu;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

class MenuItemWrapperICS$OnActionExpandListenerWrapper
  implements MenuItem.OnActionExpandListener
{
  private final MenuItem.OnActionExpandListener mObject;
  
  public MenuItemWrapperICS$OnActionExpandListenerWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    mObject = paramOnActionExpandListener;
  }
  
  public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    return mObject.onMenuItemActionCollapse(this$0.getMenuItemWrapper(paramMenuItem));
  }
  
  public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return mObject.onMenuItemActionExpand(this$0.getMenuItemWrapper(paramMenuItem));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.OnActionExpandListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */