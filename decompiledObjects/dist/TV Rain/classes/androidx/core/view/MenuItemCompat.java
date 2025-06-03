package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenuItem;
import u2;

public final class MenuItemCompat
{
  @Deprecated
  public static final int SHOW_AS_ACTION_ALWAYS = 2;
  @Deprecated
  public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
  @Deprecated
  public static final int SHOW_AS_ACTION_IF_ROOM = 1;
  @Deprecated
  public static final int SHOW_AS_ACTION_NEVER = 0;
  @Deprecated
  public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
  private static final String TAG = "MenuItemCompat";
  
  @Deprecated
  public static boolean collapseActionView(MenuItem paramMenuItem)
  {
    return paramMenuItem.collapseActionView();
  }
  
  @Deprecated
  public static boolean expandActionView(MenuItem paramMenuItem)
  {
    return paramMenuItem.expandActionView();
  }
  
  @Nullable
  public static ActionProvider getActionProvider(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getSupportActionProvider();
    }
    Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
    return null;
  }
  
  @Deprecated
  public static View getActionView(MenuItem paramMenuItem)
  {
    return paramMenuItem.getActionView();
  }
  
  public static int getAlphabeticModifiers(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getAlphabeticModifiers();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getAlphabeticModifiers(paramMenuItem);
    }
    return 0;
  }
  
  @Nullable
  public static CharSequence getContentDescription(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getContentDescription();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getContentDescription(paramMenuItem);
    }
    return null;
  }
  
  @Nullable
  public static ColorStateList getIconTintList(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getIconTintList();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getIconTintList(paramMenuItem);
    }
    return null;
  }
  
  @Nullable
  public static PorterDuff.Mode getIconTintMode(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getIconTintMode();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getIconTintMode(paramMenuItem);
    }
    return null;
  }
  
  public static int getNumericModifiers(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getNumericModifiers();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getNumericModifiers(paramMenuItem);
    }
    return 0;
  }
  
  @Nullable
  public static CharSequence getTooltipText(@NonNull MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).getTooltipText();
    }
    if (Build.VERSION.SDK_INT >= 26) {
      return Api26Impl.getTooltipText(paramMenuItem);
    }
    return null;
  }
  
  @Deprecated
  public static boolean isActionViewExpanded(MenuItem paramMenuItem)
  {
    return paramMenuItem.isActionViewExpanded();
  }
  
  @Nullable
  public static MenuItem setActionProvider(@NonNull MenuItem paramMenuItem, @Nullable ActionProvider paramActionProvider)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      return ((SupportMenuItem)paramMenuItem).setSupportActionProvider(paramActionProvider);
    }
    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
    return paramMenuItem;
  }
  
  @Deprecated
  public static MenuItem setActionView(MenuItem paramMenuItem, int paramInt)
  {
    return paramMenuItem.setActionView(paramInt);
  }
  
  @Deprecated
  public static MenuItem setActionView(MenuItem paramMenuItem, View paramView)
  {
    return paramMenuItem.setActionView(paramView);
  }
  
  public static void setAlphabeticShortcut(@NonNull MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setAlphabeticShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setAlphabeticShortcut(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void setContentDescription(@NonNull MenuItem paramMenuItem, @Nullable CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setContentDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setContentDescription(paramMenuItem, paramCharSequence);
    }
  }
  
  public static void setIconTintList(@NonNull MenuItem paramMenuItem, @Nullable ColorStateList paramColorStateList)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setIconTintList(paramColorStateList);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setIconTintList(paramMenuItem, paramColorStateList);
    }
  }
  
  public static void setIconTintMode(@NonNull MenuItem paramMenuItem, @Nullable PorterDuff.Mode paramMode)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setIconTintMode(paramMode);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setIconTintMode(paramMenuItem, paramMode);
    }
  }
  
  public static void setNumericShortcut(@NonNull MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setNumericShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setNumericShortcut(paramMenuItem, paramChar, paramInt);
    }
  }
  
  @Deprecated
  public static MenuItem setOnActionExpandListener(MenuItem paramMenuItem, OnActionExpandListener paramOnActionExpandListener)
  {
    paramMenuItem.setOnActionExpandListener(new MenuItem.OnActionExpandListener()
    {
      public boolean onMenuItemActionCollapse(MenuItem paramAnonymousMenuItem)
      {
        return MenuItemCompat.this.onMenuItemActionCollapse(paramAnonymousMenuItem);
      }
      
      public boolean onMenuItemActionExpand(MenuItem paramAnonymousMenuItem)
      {
        return MenuItemCompat.this.onMenuItemActionExpand(paramAnonymousMenuItem);
      }
    });
  }
  
  public static void setShortcut(@NonNull MenuItem paramMenuItem, char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setShortcut(paramMenuItem, paramChar1, paramChar2, paramInt1, paramInt2);
    }
  }
  
  @Deprecated
  public static void setShowAsAction(MenuItem paramMenuItem, int paramInt)
  {
    paramMenuItem.setShowAsAction(paramInt);
  }
  
  public static void setTooltipText(@NonNull MenuItem paramMenuItem, @Nullable CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof SupportMenuItem)) {
      ((SupportMenuItem)paramMenuItem).setTooltipText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setTooltipText(paramMenuItem, paramCharSequence);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static int getAlphabeticModifiers(MenuItem paramMenuItem)
    {
      return u2.x(paramMenuItem);
    }
    
    @DoNotInline
    public static CharSequence getContentDescription(MenuItem paramMenuItem)
    {
      return u2.n(paramMenuItem);
    }
    
    @DoNotInline
    public static ColorStateList getIconTintList(MenuItem paramMenuItem)
    {
      return u2.f(paramMenuItem);
    }
    
    @DoNotInline
    public static PorterDuff.Mode getIconTintMode(MenuItem paramMenuItem)
    {
      return u2.g(paramMenuItem);
    }
    
    @DoNotInline
    public static int getNumericModifiers(MenuItem paramMenuItem)
    {
      return u2.c(paramMenuItem);
    }
    
    @DoNotInline
    public static CharSequence getTooltipText(MenuItem paramMenuItem)
    {
      return u2.A(paramMenuItem);
    }
    
    @DoNotInline
    public static MenuItem setAlphabeticShortcut(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      return u2.y(paramMenuItem, paramChar, paramInt);
    }
    
    @DoNotInline
    public static MenuItem setContentDescription(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      return u2.l(paramMenuItem, paramCharSequence);
    }
    
    @DoNotInline
    public static MenuItem setIconTintList(MenuItem paramMenuItem, ColorStateList paramColorStateList)
    {
      return u2.j(paramMenuItem, paramColorStateList);
    }
    
    @DoNotInline
    public static MenuItem setIconTintMode(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
    {
      return u2.k(paramMenuItem, paramMode);
    }
    
    @DoNotInline
    public static MenuItem setNumericShortcut(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      return u2.i(paramMenuItem, paramChar, paramInt);
    }
    
    @DoNotInline
    public static MenuItem setShortcut(MenuItem paramMenuItem, char paramChar1, char paramChar2, int paramInt1, int paramInt2)
    {
      return u2.h(paramMenuItem, paramChar1, paramChar2, paramInt1, paramInt2);
    }
    
    @DoNotInline
    public static MenuItem setTooltipText(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      return u2.z(paramMenuItem, paramCharSequence);
    }
  }
  
  @Deprecated
  public static abstract interface OnActionExpandListener
  {
    public abstract boolean onMenuItemActionCollapse(MenuItem paramMenuItem);
    
    public abstract boolean onMenuItemActionExpand(MenuItem paramMenuItem);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.MenuItemCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */