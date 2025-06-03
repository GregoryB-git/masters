package androidx.appcompat.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;

class SupportMenuInflater$MenuState
{
  private static final int defaultGroupId = 0;
  private static final int defaultItemCategory = 0;
  private static final int defaultItemCheckable = 0;
  private static final boolean defaultItemChecked = false;
  private static final boolean defaultItemEnabled = true;
  private static final int defaultItemId = 0;
  private static final int defaultItemOrder = 0;
  private static final boolean defaultItemVisible = true;
  private int groupCategory;
  private int groupCheckable;
  private boolean groupEnabled;
  private int groupId;
  private int groupOrder;
  private boolean groupVisible;
  public ActionProvider itemActionProvider;
  private String itemActionProviderClassName;
  private String itemActionViewClassName;
  private int itemActionViewLayout;
  private boolean itemAdded;
  private int itemAlphabeticModifiers;
  private char itemAlphabeticShortcut;
  private int itemCategoryOrder;
  private int itemCheckable;
  private boolean itemChecked;
  private CharSequence itemContentDescription;
  private boolean itemEnabled;
  private int itemIconResId;
  private ColorStateList itemIconTintList = null;
  private PorterDuff.Mode itemIconTintMode = null;
  private int itemId;
  private String itemListenerMethodName;
  private int itemNumericModifiers;
  private char itemNumericShortcut;
  private int itemShowAsAction;
  private CharSequence itemTitle;
  private CharSequence itemTitleCondensed;
  private CharSequence itemTooltipText;
  private boolean itemVisible;
  private Menu menu;
  
  public SupportMenuInflater$MenuState(SupportMenuInflater paramSupportMenuInflater, Menu paramMenu)
  {
    menu = paramMenu;
    resetGroup();
  }
  
  private char getShortcut(String paramString)
  {
    if (paramString == null) {
      return '\000';
    }
    return paramString.charAt(0);
  }
  
  private <T> T newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = Class.forName(paramString, false, this$0.mContext.getClassLoader()).getConstructor(paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
      return paramArrayOfClass;
    }
    catch (Exception paramArrayOfObject)
    {
      paramArrayOfClass = new StringBuilder();
      paramArrayOfClass.append("Cannot instantiate class: ");
      paramArrayOfClass.append(paramString);
      Log.w("SupportMenuInflater", paramArrayOfClass.toString(), paramArrayOfObject);
    }
    return null;
  }
  
  private void setItem(MenuItem paramMenuItem)
  {
    Object localObject = paramMenuItem.setChecked(itemChecked).setVisible(itemVisible).setEnabled(itemEnabled);
    int i = itemCheckable;
    int j = 0;
    boolean bool;
    if (i >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(itemTitleCondensed).setIcon(itemIconResId);
    i = itemShowAsAction;
    if (i >= 0) {
      paramMenuItem.setShowAsAction(i);
    }
    if (itemListenerMethodName != null) {
      if (!this$0.mContext.isRestricted()) {
        paramMenuItem.setOnMenuItemClickListener(new SupportMenuInflater.InflatedOnMenuItemClickListener(this$0.getRealOwner(), itemListenerMethodName));
      } else {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
    }
    if (itemCheckable >= 2) {
      if ((paramMenuItem instanceof MenuItemImpl)) {
        ((MenuItemImpl)paramMenuItem).setExclusiveCheckable(true);
      } else if ((paramMenuItem instanceof MenuItemWrapperICS)) {
        ((MenuItemWrapperICS)paramMenuItem).setExclusiveCheckable(true);
      }
    }
    localObject = itemActionViewClassName;
    if (localObject != null)
    {
      paramMenuItem.setActionView((View)newInstance((String)localObject, SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE, this$0.mActionViewConstructorArguments));
      j = 1;
    }
    i = itemActionViewLayout;
    if (i > 0) {
      if (j == 0) {
        paramMenuItem.setActionView(i);
      } else {
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
    }
    localObject = itemActionProvider;
    if (localObject != null) {
      MenuItemCompat.setActionProvider(paramMenuItem, (ActionProvider)localObject);
    }
    MenuItemCompat.setContentDescription(paramMenuItem, itemContentDescription);
    MenuItemCompat.setTooltipText(paramMenuItem, itemTooltipText);
    MenuItemCompat.setAlphabeticShortcut(paramMenuItem, itemAlphabeticShortcut, itemAlphabeticModifiers);
    MenuItemCompat.setNumericShortcut(paramMenuItem, itemNumericShortcut, itemNumericModifiers);
    localObject = itemIconTintMode;
    if (localObject != null) {
      MenuItemCompat.setIconTintMode(paramMenuItem, (PorterDuff.Mode)localObject);
    }
    localObject = itemIconTintList;
    if (localObject != null) {
      MenuItemCompat.setIconTintList(paramMenuItem, (ColorStateList)localObject);
    }
  }
  
  public void addItem()
  {
    itemAdded = true;
    setItem(menu.add(groupId, itemId, itemCategoryOrder, itemTitle));
  }
  
  public SubMenu addSubMenuItem()
  {
    itemAdded = true;
    SubMenu localSubMenu = menu.addSubMenu(groupId, itemId, itemCategoryOrder, itemTitle);
    setItem(localSubMenu.getItem());
    return localSubMenu;
  }
  
  public boolean hasAddedItem()
  {
    return itemAdded;
  }
  
  public void readGroup(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = this$0.mContext.obtainStyledAttributes(paramAttributeSet, R.styleable.MenuGroup);
    groupId = paramAttributeSet.getResourceId(R.styleable.MenuGroup_android_id, 0);
    groupCategory = paramAttributeSet.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
    groupOrder = paramAttributeSet.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
    groupCheckable = paramAttributeSet.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
    groupVisible = paramAttributeSet.getBoolean(R.styleable.MenuGroup_android_visible, true);
    groupEnabled = paramAttributeSet.getBoolean(R.styleable.MenuGroup_android_enabled, true);
    paramAttributeSet.recycle();
  }
  
  public void readItem(AttributeSet paramAttributeSet)
  {
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(this$0.mContext, paramAttributeSet, R.styleable.MenuItem);
    itemId = localTintTypedArray.getResourceId(R.styleable.MenuItem_android_id, 0);
    itemCategoryOrder = (localTintTypedArray.getInt(R.styleable.MenuItem_android_menuCategory, groupCategory) & 0xFFFF0000 | localTintTypedArray.getInt(R.styleable.MenuItem_android_orderInCategory, groupOrder) & 0xFFFF);
    itemTitle = localTintTypedArray.getText(R.styleable.MenuItem_android_title);
    itemTitleCondensed = localTintTypedArray.getText(R.styleable.MenuItem_android_titleCondensed);
    itemIconResId = localTintTypedArray.getResourceId(R.styleable.MenuItem_android_icon, 0);
    itemAlphabeticShortcut = getShortcut(localTintTypedArray.getString(R.styleable.MenuItem_android_alphabeticShortcut));
    itemAlphabeticModifiers = localTintTypedArray.getInt(R.styleable.MenuItem_alphabeticModifiers, 4096);
    itemNumericShortcut = getShortcut(localTintTypedArray.getString(R.styleable.MenuItem_android_numericShortcut));
    itemNumericModifiers = localTintTypedArray.getInt(R.styleable.MenuItem_numericModifiers, 4096);
    int i = R.styleable.MenuItem_android_checkable;
    if (localTintTypedArray.hasValue(i)) {
      itemCheckable = localTintTypedArray.getBoolean(i, false);
    } else {
      itemCheckable = groupCheckable;
    }
    itemChecked = localTintTypedArray.getBoolean(R.styleable.MenuItem_android_checked, false);
    itemVisible = localTintTypedArray.getBoolean(R.styleable.MenuItem_android_visible, groupVisible);
    itemEnabled = localTintTypedArray.getBoolean(R.styleable.MenuItem_android_enabled, groupEnabled);
    itemShowAsAction = localTintTypedArray.getInt(R.styleable.MenuItem_showAsAction, -1);
    itemListenerMethodName = localTintTypedArray.getString(R.styleable.MenuItem_android_onClick);
    itemActionViewLayout = localTintTypedArray.getResourceId(R.styleable.MenuItem_actionLayout, 0);
    itemActionViewClassName = localTintTypedArray.getString(R.styleable.MenuItem_actionViewClass);
    paramAttributeSet = localTintTypedArray.getString(R.styleable.MenuItem_actionProviderClass);
    itemActionProviderClassName = paramAttributeSet;
    if (paramAttributeSet != null) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (itemActionViewLayout == 0) && (itemActionViewClassName == null))
    {
      itemActionProvider = ((ActionProvider)newInstance(paramAttributeSet, SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, this$0.mActionProviderConstructorArguments));
    }
    else
    {
      if (i != 0) {
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
      }
      itemActionProvider = null;
    }
    itemContentDescription = localTintTypedArray.getText(R.styleable.MenuItem_contentDescription);
    itemTooltipText = localTintTypedArray.getText(R.styleable.MenuItem_tooltipText);
    i = R.styleable.MenuItem_iconTintMode;
    if (localTintTypedArray.hasValue(i)) {
      itemIconTintMode = DrawableUtils.parseTintMode(localTintTypedArray.getInt(i, -1), itemIconTintMode);
    } else {
      itemIconTintMode = null;
    }
    i = R.styleable.MenuItem_iconTint;
    if (localTintTypedArray.hasValue(i)) {
      itemIconTintList = localTintTypedArray.getColorStateList(i);
    } else {
      itemIconTintList = null;
    }
    localTintTypedArray.recycle();
    itemAdded = false;
  }
  
  public void resetGroup()
  {
    groupId = 0;
    groupCategory = 0;
    groupOrder = 0;
    groupCheckable = 0;
    groupVisible = true;
    groupEnabled = true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.SupportMenuInflater.MenuState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */