package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import u2;

@RequiresApi(26)
class MenuItemCompat$Api26Impl
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

/* Location:
 * Qualified Name:     androidx.core.view.MenuItemCompat.Api26Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */