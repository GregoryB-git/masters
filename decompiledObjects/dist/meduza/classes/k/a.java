package k;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import y.a.a;

public final class a
  implements z.b
{
  public CharSequence a;
  public CharSequence b;
  public Intent c;
  public char d;
  public int e = 4096;
  public char f;
  public int g = 4096;
  public Drawable h;
  public Context i;
  public CharSequence j;
  public CharSequence k;
  public ColorStateList l = null;
  public PorterDuff.Mode m = null;
  public boolean n = false;
  public boolean o = false;
  public int p = 16;
  
  public a(Context paramContext, CharSequence paramCharSequence)
  {
    i = paramContext;
    a = paramCharSequence;
  }
  
  public final z.b a(e0.b paramb)
  {
    throw new UnsupportedOperationException();
  }
  
  public final e0.b b()
  {
    return null;
  }
  
  public final void c()
  {
    Drawable localDrawable = h;
    if ((localDrawable != null) && ((n) || (o)))
    {
      h = localDrawable;
      localDrawable = localDrawable.mutate();
      h = localDrawable;
      if (n) {
        a.a.h(localDrawable, l);
      }
      if (o) {
        a.a.i(h, m);
      }
    }
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final int getAlphabeticModifiers()
  {
    return g;
  }
  
  public final char getAlphabeticShortcut()
  {
    return f;
  }
  
  public final CharSequence getContentDescription()
  {
    return j;
  }
  
  public final int getGroupId()
  {
    return 0;
  }
  
  public final Drawable getIcon()
  {
    return h;
  }
  
  public final ColorStateList getIconTintList()
  {
    return l;
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return m;
  }
  
  public final Intent getIntent()
  {
    return c;
  }
  
  public final int getItemId()
  {
    return 16908332;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final int getNumericModifiers()
  {
    return e;
  }
  
  public final char getNumericShortcut()
  {
    return d;
  }
  
  public final int getOrder()
  {
    return 0;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return a;
  }
  
  public final CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = b;
    if (localCharSequence == null) {
      localCharSequence = a;
    }
    return localCharSequence;
  }
  
  public final CharSequence getTooltipText()
  {
    return k;
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    int i1 = p;
    boolean bool = true;
    if ((i1 & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isChecked()
  {
    boolean bool;
    if ((p & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isEnabled()
  {
    boolean bool;
    if ((p & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isVisible()
  {
    boolean bool;
    if ((p & 0x8) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setActionView(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setActionView(View paramView)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    f = Character.toLowerCase(paramChar);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    f = Character.toLowerCase(paramChar);
    g = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    p = (paramBoolean | p & 0xFFFFFFFE);
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = p;
    int i2;
    if (paramBoolean) {
      i2 = 2;
    } else {
      i2 = 0;
    }
    p = (i2 | i1 & 0xFFFFFFFD);
    return this;
  }
  
  public final MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    j = paramCharSequence;
    return this;
  }
  
  public final z.b setContentDescription(CharSequence paramCharSequence)
  {
    j = paramCharSequence;
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i1 = p;
    int i2;
    if (paramBoolean) {
      i2 = 16;
    } else {
      i2 = 0;
    }
    p = (i2 | i1 & 0xFFFFFFEF);
    return this;
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    h = v.a.getDrawable(i, paramInt);
    c();
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    h = paramDrawable;
    c();
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    l = paramColorStateList;
    n = true;
    c();
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    m = paramMode;
    o = true;
    c();
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    c = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    d = ((char)paramChar);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    d = ((char)paramChar);
    e = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    d = ((char)paramChar1);
    f = Character.toLowerCase(paramChar2);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    d = ((char)paramChar1);
    e = KeyEvent.normalizeMetaState(paramInt1);
    f = Character.toLowerCase(paramChar2);
    g = KeyEvent.normalizeMetaState(paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final MenuItem setShowAsActionFlags(int paramInt)
  {
    return this;
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    a = i.getResources().getString(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    a = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    b = paramCharSequence;
    return this;
  }
  
  public final MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    k = paramCharSequence;
    return this;
  }
  
  public final z.b setTooltipText(CharSequence paramCharSequence)
  {
    k = paramCharSequence;
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i1 = p;
    int i2 = 8;
    if (paramBoolean) {
      i2 = 0;
    }
    p = (i1 & 0x8 | i2);
    return this;
  }
}

/* Location:
 * Qualified Name:     k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */