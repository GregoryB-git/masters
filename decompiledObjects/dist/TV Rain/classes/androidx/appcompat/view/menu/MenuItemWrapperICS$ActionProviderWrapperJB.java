package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi(16)
class MenuItemWrapperICS$ActionProviderWrapperJB
  extends MenuItemWrapperICS.ActionProviderWrapper
  implements android.view.ActionProvider.VisibilityListener
{
  private androidx.core.view.ActionProvider.VisibilityListener mListener;
  
  public MenuItemWrapperICS$ActionProviderWrapperJB(MenuItemWrapperICS paramMenuItemWrapperICS, Context paramContext, ActionProvider paramActionProvider)
  {
    super(paramMenuItemWrapperICS, paramContext, paramActionProvider);
  }
  
  public boolean isVisible()
  {
    return mInner.isVisible();
  }
  
  public void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    androidx.core.view.ActionProvider.VisibilityListener localVisibilityListener = mListener;
    if (localVisibilityListener != null) {
      localVisibilityListener.onActionProviderVisibilityChanged(paramBoolean);
    }
  }
  
  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return mInner.onCreateActionView(paramMenuItem);
  }
  
  public boolean overridesItemVisibility()
  {
    return mInner.overridesItemVisibility();
  }
  
  public void refreshVisibility()
  {
    mInner.refreshVisibility();
  }
  
  public void setVisibilityListener(androidx.core.view.ActionProvider.VisibilityListener paramVisibilityListener)
  {
    mListener = paramVisibilityListener;
    ActionProvider localActionProvider = mInner;
    if (paramVisibilityListener != null) {
      paramVisibilityListener = this;
    } else {
      paramVisibilityListener = null;
    }
    localActionProvider.setVisibilityListener(paramVisibilityListener);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS.ActionProviderWrapperJB
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */