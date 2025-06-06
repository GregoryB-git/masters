package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;
import java.lang.reflect.Method;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MenuItemWrapperICS
  extends BaseMenuWrapper
  implements MenuItem
{
  public static final String LOG_TAG = "MenuItemWrapper";
  private Method mSetExclusiveCheckableMethod;
  private final SupportMenuItem mWrappedObject;
  
  public MenuItemWrapperICS(Context paramContext, SupportMenuItem paramSupportMenuItem)
  {
    super(paramContext);
    if (paramSupportMenuItem != null)
    {
      mWrappedObject = paramSupportMenuItem;
      return;
    }
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public boolean collapseActionView()
  {
    return mWrappedObject.collapseActionView();
  }
  
  public boolean expandActionView()
  {
    return mWrappedObject.expandActionView();
  }
  
  public android.view.ActionProvider getActionProvider()
  {
    androidx.core.view.ActionProvider localActionProvider = mWrappedObject.getSupportActionProvider();
    if ((localActionProvider instanceof ActionProviderWrapper)) {
      return mInner;
    }
    return null;
  }
  
  public View getActionView()
  {
    View localView1 = mWrappedObject.getActionView();
    View localView2 = localView1;
    if ((localView1 instanceof CollapsibleActionViewWrapper)) {
      localView2 = ((CollapsibleActionViewWrapper)localView1).getWrappedView();
    }
    return localView2;
  }
  
  public int getAlphabeticModifiers()
  {
    return mWrappedObject.getAlphabeticModifiers();
  }
  
  public char getAlphabeticShortcut()
  {
    return mWrappedObject.getAlphabeticShortcut();
  }
  
  public CharSequence getContentDescription()
  {
    return mWrappedObject.getContentDescription();
  }
  
  public int getGroupId()
  {
    return mWrappedObject.getGroupId();
  }
  
  public Drawable getIcon()
  {
    return mWrappedObject.getIcon();
  }
  
  public ColorStateList getIconTintList()
  {
    return mWrappedObject.getIconTintList();
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return mWrappedObject.getIconTintMode();
  }
  
  public Intent getIntent()
  {
    return mWrappedObject.getIntent();
  }
  
  public int getItemId()
  {
    return mWrappedObject.getItemId();
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return mWrappedObject.getMenuInfo();
  }
  
  public int getNumericModifiers()
  {
    return mWrappedObject.getNumericModifiers();
  }
  
  public char getNumericShortcut()
  {
    return mWrappedObject.getNumericShortcut();
  }
  
  public int getOrder()
  {
    return mWrappedObject.getOrder();
  }
  
  public SubMenu getSubMenu()
  {
    return getSubMenuWrapper(mWrappedObject.getSubMenu());
  }
  
  public CharSequence getTitle()
  {
    return mWrappedObject.getTitle();
  }
  
  public CharSequence getTitleCondensed()
  {
    return mWrappedObject.getTitleCondensed();
  }
  
  public CharSequence getTooltipText()
  {
    return mWrappedObject.getTooltipText();
  }
  
  public boolean hasSubMenu()
  {
    return mWrappedObject.hasSubMenu();
  }
  
  public boolean isActionViewExpanded()
  {
    return mWrappedObject.isActionViewExpanded();
  }
  
  public boolean isCheckable()
  {
    return mWrappedObject.isCheckable();
  }
  
  public boolean isChecked()
  {
    return mWrappedObject.isChecked();
  }
  
  public boolean isEnabled()
  {
    return mWrappedObject.isEnabled();
  }
  
  public boolean isVisible()
  {
    return mWrappedObject.isVisible();
  }
  
  public MenuItem setActionProvider(android.view.ActionProvider paramActionProvider)
  {
    ActionProviderWrapperJB localActionProviderWrapperJB = new ActionProviderWrapperJB(mContext, paramActionProvider);
    SupportMenuItem localSupportMenuItem = mWrappedObject;
    if (paramActionProvider != null) {
      paramActionProvider = localActionProviderWrapperJB;
    } else {
      paramActionProvider = null;
    }
    localSupportMenuItem.setSupportActionProvider(paramActionProvider);
    return this;
  }
  
  public MenuItem setActionView(int paramInt)
  {
    mWrappedObject.setActionView(paramInt);
    View localView = mWrappedObject.getActionView();
    if ((localView instanceof android.view.CollapsibleActionView)) {
      mWrappedObject.setActionView(new CollapsibleActionViewWrapper(localView));
    }
    return this;
  }
  
  public MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof android.view.CollapsibleActionView)) {
      localObject = new CollapsibleActionViewWrapper(paramView);
    }
    mWrappedObject.setActionView((View)localObject);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    mWrappedObject.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    mWrappedObject.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    mWrappedObject.setCheckable(paramBoolean);
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    mWrappedObject.setChecked(paramBoolean);
    return this;
  }
  
  public MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    mWrappedObject.setContentDescription(paramCharSequence);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    mWrappedObject.setEnabled(paramBoolean);
    return this;
  }
  
  public void setExclusiveCheckable(boolean paramBoolean)
  {
    try
    {
      if (mSetExclusiveCheckableMethod == null) {
        mSetExclusiveCheckableMethod = mWrappedObject.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
      }
      mSetExclusiveCheckableMethod.invoke(mWrappedObject, new Object[] { Boolean.valueOf(paramBoolean) });
    }
    catch (Exception localException)
    {
      Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
    }
  }
  
  public MenuItem setIcon(int paramInt)
  {
    mWrappedObject.setIcon(paramInt);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    mWrappedObject.setIcon(paramDrawable);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    mWrappedObject.setIconTintList(paramColorStateList);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    mWrappedObject.setIconTintMode(paramMode);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    mWrappedObject.setIntent(paramIntent);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    mWrappedObject.setNumericShortcut(paramChar);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    mWrappedObject.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    SupportMenuItem localSupportMenuItem = mWrappedObject;
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new OnActionExpandListenerWrapper(paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    }
    localSupportMenuItem.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    SupportMenuItem localSupportMenuItem = mWrappedObject;
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new OnMenuItemClickListenerWrapper(paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    }
    localSupportMenuItem.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    mWrappedObject.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    mWrappedObject.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    mWrappedObject.setShowAsAction(paramInt);
  }
  
  public MenuItem setShowAsActionFlags(int paramInt)
  {
    mWrappedObject.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public MenuItem setTitle(int paramInt)
  {
    mWrappedObject.setTitle(paramInt);
    return this;
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    mWrappedObject.setTitle(paramCharSequence);
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    mWrappedObject.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    mWrappedObject.setTooltipText(paramCharSequence);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    return mWrappedObject.setVisible(paramBoolean);
  }
  
  public class ActionProviderWrapper
    extends androidx.core.view.ActionProvider
  {
    public final android.view.ActionProvider mInner;
    
    public ActionProviderWrapper(Context paramContext, android.view.ActionProvider paramActionProvider)
    {
      super();
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
      mInner.onPrepareSubMenu(getSubMenuWrapper(paramSubMenu));
    }
  }
  
  @RequiresApi(16)
  public class ActionProviderWrapperJB
    extends MenuItemWrapperICS.ActionProviderWrapper
    implements android.view.ActionProvider.VisibilityListener
  {
    private androidx.core.view.ActionProvider.VisibilityListener mListener;
    
    public ActionProviderWrapperJB(Context paramContext, android.view.ActionProvider paramActionProvider)
    {
      super(paramContext, paramActionProvider);
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
      android.view.ActionProvider localActionProvider = mInner;
      if (paramVisibilityListener != null) {
        paramVisibilityListener = this;
      } else {
        paramVisibilityListener = null;
      }
      localActionProvider.setVisibilityListener(paramVisibilityListener);
    }
  }
  
  public static class CollapsibleActionViewWrapper
    extends FrameLayout
    implements androidx.appcompat.view.CollapsibleActionView
  {
    public final android.view.CollapsibleActionView mWrappedView;
    
    public CollapsibleActionViewWrapper(View paramView)
    {
      super();
      mWrappedView = ((android.view.CollapsibleActionView)paramView);
      addView(paramView);
    }
    
    public View getWrappedView()
    {
      return (View)mWrappedView;
    }
    
    public void onActionViewCollapsed()
    {
      mWrappedView.onActionViewCollapsed();
    }
    
    public void onActionViewExpanded()
    {
      mWrappedView.onActionViewExpanded();
    }
  }
  
  public class OnActionExpandListenerWrapper
    implements MenuItem.OnActionExpandListener
  {
    private final MenuItem.OnActionExpandListener mObject;
    
    public OnActionExpandListenerWrapper(MenuItem.OnActionExpandListener paramOnActionExpandListener)
    {
      mObject = paramOnActionExpandListener;
    }
    
    public boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
    {
      return mObject.onMenuItemActionCollapse(getMenuItemWrapper(paramMenuItem));
    }
    
    public boolean onMenuItemActionExpand(MenuItem paramMenuItem)
    {
      return mObject.onMenuItemActionExpand(getMenuItemWrapper(paramMenuItem));
    }
  }
  
  public class OnMenuItemClickListenerWrapper
    implements MenuItem.OnMenuItemClickListener
  {
    private final MenuItem.OnMenuItemClickListener mObject;
    
    public OnMenuItemClickListenerWrapper(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
    {
      mObject = paramOnMenuItemClickListener;
    }
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      return mObject.onMenuItemClick(getMenuItemWrapper(paramMenuItem));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.MenuItemWrapperICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */