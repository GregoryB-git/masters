package I;

import C.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.MenuItem;

public abstract class i
{
  public static void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setAlphabeticShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.g(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void b(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setContentDescription(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.h(paramMenuItem, paramCharSequence);
    }
  }
  
  public static void c(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setIconTintList(paramColorStateList);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.i(paramMenuItem, paramColorStateList);
    }
  }
  
  public static void d(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setIconTintMode(paramMode);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.j(paramMenuItem, paramMode);
    }
  }
  
  public static void e(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setNumericShortcut(paramChar, paramInt);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.k(paramMenuItem, paramChar, paramInt);
    }
  }
  
  public static void f(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    if ((paramMenuItem instanceof b)) {
      ((b)paramMenuItem).setTooltipText(paramCharSequence);
    } else if (Build.VERSION.SDK_INT >= 26) {
      a.m(paramMenuItem, paramCharSequence);
    }
  }
  
  public static abstract class a
  {
    public static int a(MenuItem paramMenuItem)
    {
      return paramMenuItem.getAlphabeticModifiers();
    }
    
    public static CharSequence b(MenuItem paramMenuItem)
    {
      return paramMenuItem.getContentDescription();
    }
    
    public static ColorStateList c(MenuItem paramMenuItem)
    {
      return paramMenuItem.getIconTintList();
    }
    
    public static PorterDuff.Mode d(MenuItem paramMenuItem)
    {
      return paramMenuItem.getIconTintMode();
    }
    
    public static int e(MenuItem paramMenuItem)
    {
      return paramMenuItem.getNumericModifiers();
    }
    
    public static CharSequence f(MenuItem paramMenuItem)
    {
      return paramMenuItem.getTooltipText();
    }
    
    public static MenuItem g(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      return paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
    }
    
    public static MenuItem h(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      return paramMenuItem.setContentDescription(paramCharSequence);
    }
    
    public static MenuItem i(MenuItem paramMenuItem, ColorStateList paramColorStateList)
    {
      return paramMenuItem.setIconTintList(paramColorStateList);
    }
    
    public static MenuItem j(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
    {
      return paramMenuItem.setIconTintMode(paramMode);
    }
    
    public static MenuItem k(MenuItem paramMenuItem, char paramChar, int paramInt)
    {
      return paramMenuItem.setNumericShortcut(paramChar, paramInt);
    }
    
    public static MenuItem l(MenuItem paramMenuItem, char paramChar1, char paramChar2, int paramInt1, int paramInt2)
    {
      return paramMenuItem.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    }
    
    public static MenuItem m(MenuItem paramMenuItem, CharSequence paramCharSequence)
    {
      return paramMenuItem.setTooltipText(paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     I.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */