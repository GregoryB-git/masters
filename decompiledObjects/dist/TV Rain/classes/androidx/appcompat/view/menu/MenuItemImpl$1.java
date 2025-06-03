package androidx.appcompat.view.menu;

import androidx.core.view.ActionProvider.VisibilityListener;

class MenuItemImpl$1
  implements ActionProvider.VisibilityListener
{
  public MenuItemImpl$1(MenuItemImpl paramMenuItemImpl) {}
  
  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    MenuItemImpl localMenuItemImpl = this$0;
    mMenu.onItemVisibleChanged(localMenuItemImpl);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemImpl.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */