package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

abstract class BaseMenuWrapper
{
  public final Context mContext;
  private SimpleArrayMap<SupportMenuItem, MenuItem> mMenuItems;
  private SimpleArrayMap<SupportSubMenu, SubMenu> mSubMenus;
  
  public BaseMenuWrapper(Context paramContext)
  {
    mContext = paramContext;
  }
  
  public final MenuItem getMenuItemWrapper(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem))
    {
      SupportMenuItem localSupportMenuItem = (SupportMenuItem)paramMenuItem;
      if (mMenuItems == null) {
        mMenuItems = new SimpleArrayMap();
      }
      MenuItem localMenuItem = (MenuItem)mMenuItems.get(localSupportMenuItem);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = new MenuItemWrapperICS(mContext, localSupportMenuItem);
        mMenuItems.put(localSupportMenuItem, paramMenuItem);
      }
      return paramMenuItem;
    }
    return paramMenuItem;
  }
  
  public final SubMenu getSubMenuWrapper(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof SupportSubMenu))
    {
      SupportSubMenu localSupportSubMenu = (SupportSubMenu)paramSubMenu;
      if (mSubMenus == null) {
        mSubMenus = new SimpleArrayMap();
      }
      SubMenu localSubMenu = (SubMenu)mSubMenus.get(localSupportSubMenu);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = new SubMenuWrapperICS(mContext, localSupportSubMenu);
        mSubMenus.put(localSupportSubMenu, paramSubMenu);
      }
      return paramSubMenu;
    }
    return paramSubMenu;
  }
  
  public final void internalClear()
  {
    SimpleArrayMap localSimpleArrayMap = mMenuItems;
    if (localSimpleArrayMap != null) {
      localSimpleArrayMap.clear();
    }
    localSimpleArrayMap = mSubMenus;
    if (localSimpleArrayMap != null) {
      localSimpleArrayMap.clear();
    }
  }
  
  public final void internalRemoveGroup(int paramInt)
  {
    if (mMenuItems == null) {
      return;
    }
    int j;
    for (int i = 0; i < mMenuItems.size(); i = j + 1)
    {
      j = i;
      if (((SupportMenuItem)mMenuItems.keyAt(i)).getGroupId() == paramInt)
      {
        mMenuItems.removeAt(i);
        j = i - 1;
      }
    }
  }
  
  public final void internalRemoveItem(int paramInt)
  {
    if (mMenuItems == null) {
      return;
    }
    for (int i = 0; i < mMenuItems.size(); i++) {
      if (((SupportMenuItem)mMenuItems.keyAt(i)).getItemId() == paramInt)
      {
        mMenuItems.removeAt(i);
        break;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.BaseMenuWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */