package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;

class Toolbar$ExpandedActionViewMenuPresenter
  implements MenuPresenter
{
  public MenuItemImpl mCurrentExpandedItem;
  public MenuBuilder mMenu;
  
  public Toolbar$ExpandedActionViewMenuPresenter(Toolbar paramToolbar) {}
  
  public boolean collapseItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    paramMenuBuilder = this$0.mExpandedActionView;
    if ((paramMenuBuilder instanceof CollapsibleActionView)) {
      ((CollapsibleActionView)paramMenuBuilder).onActionViewCollapsed();
    }
    paramMenuBuilder = this$0;
    paramMenuBuilder.removeView(mExpandedActionView);
    paramMenuBuilder = this$0;
    paramMenuBuilder.removeView(mCollapseButtonView);
    paramMenuBuilder = this$0;
    mExpandedActionView = null;
    paramMenuBuilder.addChildrenForExpandedActionView();
    mCurrentExpandedItem = null;
    this$0.requestLayout();
    paramMenuItemImpl.setActionViewExpanded(false);
    return true;
  }
  
  public boolean expandItemActionView(MenuBuilder paramMenuBuilder, MenuItemImpl paramMenuItemImpl)
  {
    this$0.ensureCollapseButtonView();
    Object localObject = this$0.mCollapseButtonView.getParent();
    paramMenuBuilder = this$0;
    if (localObject != paramMenuBuilder)
    {
      if ((localObject instanceof ViewGroup)) {
        ((ViewGroup)localObject).removeView(mCollapseButtonView);
      }
      paramMenuBuilder = this$0;
      paramMenuBuilder.addView(mCollapseButtonView);
    }
    this$0.mExpandedActionView = paramMenuItemImpl.getActionView();
    mCurrentExpandedItem = paramMenuItemImpl;
    paramMenuBuilder = this$0.mExpandedActionView.getParent();
    localObject = this$0;
    if (paramMenuBuilder != localObject)
    {
      if ((paramMenuBuilder instanceof ViewGroup)) {
        ((ViewGroup)paramMenuBuilder).removeView(mExpandedActionView);
      }
      paramMenuBuilder = this$0.generateDefaultLayoutParams();
      localObject = this$0;
      gravity = (0x800003 | mButtonGravity & 0x70);
      mViewType = 2;
      mExpandedActionView.setLayoutParams(paramMenuBuilder);
      paramMenuBuilder = this$0;
      paramMenuBuilder.addView(mExpandedActionView);
    }
    this$0.removeChildrenForExpandedActionView();
    this$0.requestLayout();
    paramMenuItemImpl.setActionViewExpanded(true);
    paramMenuBuilder = this$0.mExpandedActionView;
    if ((paramMenuBuilder instanceof CollapsibleActionView)) {
      ((CollapsibleActionView)paramMenuBuilder).onActionViewExpanded();
    }
    return true;
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public int getId()
  {
    return 0;
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    return null;
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    MenuBuilder localMenuBuilder = mMenu;
    if (localMenuBuilder != null)
    {
      paramContext = mCurrentExpandedItem;
      if (paramContext != null) {
        localMenuBuilder.collapseItemActionView(paramContext);
      }
    }
    mMenu = paramMenuBuilder;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean) {}
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    return false;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback) {}
  
  public void updateMenuView(boolean paramBoolean)
  {
    if (mCurrentExpandedItem != null)
    {
      MenuBuilder localMenuBuilder = mMenu;
      int i = 0;
      int j = i;
      if (localMenuBuilder != null)
      {
        int k = localMenuBuilder.size();
        for (int m = 0;; m++)
        {
          j = i;
          if (m >= k) {
            break;
          }
          if (mMenu.getItem(m) == mCurrentExpandedItem)
          {
            j = 1;
            break;
          }
        }
      }
      if (j == 0) {
        collapseItemActionView(mMenu, mCurrentExpandedItem);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */