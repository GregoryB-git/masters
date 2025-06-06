package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.SubMenu;
import android.view.View;

class MenuItemWrapperICS$ActionProviderWrapper
  extends androidx.core.view.ActionProvider
{
  public final android.view.ActionProvider mInner;
  
  public MenuItemWrapperICS$ActionProviderWrapper(MenuItemWrapperICS paramMenuItemWrapperICS, Context paramContext, android.view.ActionProvider paramActionProvider)
  {
    super(paramContext);
    mInner = paramActionProvider;
  }
  
  public boolean hasSubMenu()
  {
    return mInner.hasSubMenu();
  }
  
  public View onCreateActionView()
  {
    return mInner.onCreateActionView();
  }
  
  public boolean onPerformDefaultAction()
  {
    return mInner.onPerformDefaultAction();
  }
  
  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
    mInner.onPrepareSubMenu(this$0.getSubMenuWrapper(paramSubMenu));
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */