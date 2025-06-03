package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import e0.b.a;
import java.util.ArrayList;
import y.a.a;

public final class h
  implements z.b
{
  public e0.b A;
  public MenuItem.OnActionExpandListener B;
  public boolean C = false;
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  public CharSequence e;
  public CharSequence f;
  public Intent g;
  public char h;
  public int i = 4096;
  public char j;
  public int k = 4096;
  public Drawable l;
  public int m = 0;
  public f n;
  public m o;
  public MenuItem.OnMenuItemClickListener p;
  public CharSequence q;
  public CharSequence r;
  public ColorStateList s = null;
  public PorterDuff.Mode t = null;
  public boolean u = false;
  public boolean v = false;
  public boolean w = false;
  public int x = 16;
  public int y;
  public View z;
  
  public h(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    n = paramf;
    a = paramInt2;
    b = paramInt1;
    c = paramInt3;
    d = paramInt4;
    e = paramCharSequence;
    y = paramInt5;
  }
  
  public static void c(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 & paramInt2) == paramInt2) {
      paramStringBuilder.append(paramString);
    }
  }
  
  public final z.b a(e0.b paramb)
  {
    e0.b localb = A;
    if (localb != null) {
      a = null;
    }
    z = null;
    A = paramb;
    n.p(true);
    paramb = A;
    if (paramb != null) {
      paramb.h(new a());
    }
    return this;
  }
  
  public final e0.b b()
  {
    return A;
  }
  
  public final boolean collapseActionView()
  {
    if ((y & 0x8) == 0) {
      return false;
    }
    if (z == null) {
      return true;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = B;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionCollapse(this))) {
      return false;
    }
    return n.d(this);
  }
  
  public final Drawable d(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      localDrawable = paramDrawable;
      if (w) {
        if (!u)
        {
          localDrawable = paramDrawable;
          if (!v) {}
        }
        else
        {
          localDrawable = paramDrawable.mutate();
          if (u) {
            a.a.h(localDrawable, s);
          }
          if (v) {
            a.a.i(localDrawable, t);
          }
          w = false;
        }
      }
    }
    return localDrawable;
  }
  
  public final boolean e()
  {
    int i1 = y;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((i1 & 0x8) != 0)
    {
      if (z == null)
      {
        e0.b localb = A;
        if (localb != null) {
          z = localb.d(this);
        }
      }
      bool2 = bool1;
      if (z != null) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final boolean expandActionView()
  {
    if (!e()) {
      return false;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = B;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionExpand(this))) {
      return false;
    }
    return n.f(this);
  }
  
  public final void f(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = x | 0x20;
    } else {
      i1 = x & 0xFFFFFFDF;
    }
    x = i1;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    Object localObject = z;
    if (localObject != null) {
      return (View)localObject;
    }
    localObject = A;
    if (localObject != null)
    {
      localObject = ((e0.b)localObject).d(this);
      z = ((View)localObject);
      return (View)localObject;
    }
    return null;
  }
  
  public final int getAlphabeticModifiers()
  {
    return k;
  }
  
  public final char getAlphabeticShortcut()
  {
    return j;
  }
  
  public final CharSequence getContentDescription()
  {
    return q;
  }
  
  public final int getGroupId()
  {
    return b;
  }
  
  public final Drawable getIcon()
  {
    Drawable localDrawable = l;
    if (localDrawable != null) {
      return d(localDrawable);
    }
    int i1 = m;
    if (i1 != 0)
    {
      localDrawable = x6.b.X(n.a, i1);
      m = 0;
      l = localDrawable;
      return d(localDrawable);
    }
    return null;
  }
  
  public final ColorStateList getIconTintList()
  {
    return s;
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return t;
  }
  
  public final Intent getIntent()
  {
    return g;
  }
  
  @ViewDebug.CapturedViewProperty
  public final int getItemId()
  {
    return a;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final int getNumericModifiers()
  {
    return i;
  }
  
  public final char getNumericShortcut()
  {
    return h;
  }
  
  public final int getOrder()
  {
    return c;
  }
  
  public final SubMenu getSubMenu()
  {
    return o;
  }
  
  @ViewDebug.CapturedViewProperty
  public final CharSequence getTitle()
  {
    return e;
  }
  
  public final CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = f;
    if (localCharSequence == null) {
      localCharSequence = e;
    }
    return localCharSequence;
  }
  
  public final CharSequence getTooltipText()
  {
    return r;
  }
  
  public final boolean hasSubMenu()
  {
    boolean bool;
    if (o != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isActionViewExpanded()
  {
    return C;
  }
  
  public final boolean isCheckable()
  {
    int i1 = x;
    boolean bool = true;
    if ((i1 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isChecked()
  {
    boolean bool;
    if ((x & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isEnabled()
  {
    boolean bool;
    if ((x & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isVisible()
  {
    e0.b localb = A;
    boolean bool1 = true;
    boolean bool2 = true;
    if ((localb != null) && (localb.g()))
    {
      if (((x & 0x8) != 0) || (!A.b())) {
        bool2 = false;
      }
      return bool2;
    }
    if ((x & 0x8) == 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final MenuItem setActionView(int paramInt)
  {
    Object localObject = n.a;
    localObject = LayoutInflater.from((Context)localObject).inflate(paramInt, new LinearLayout((Context)localObject), false);
    z = ((View)localObject);
    A = null;
    if ((localObject != null) && (((View)localObject).getId() == -1))
    {
      paramInt = a;
      if (paramInt > 0) {
        ((View)localObject).setId(paramInt);
      }
    }
    localObject = n;
    k = true;
    ((f)localObject).p(true);
    return this;
  }
  
  public final MenuItem setActionView(View paramView)
  {
    z = paramView;
    A = null;
    if ((paramView != null) && (paramView.getId() == -1))
    {
      int i1 = a;
      if (i1 > 0) {
        paramView.setId(i1);
      }
    }
    paramView = n;
    k = true;
    paramView.p(true);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (j == paramChar) {
      return this;
    }
    j = Character.toLowerCase(paramChar);
    n.p(false);
    return this;
  }
  
  public final MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    if ((j == paramChar) && (k == paramInt)) {
      return this;
    }
    j = Character.toLowerCase(paramChar);
    k = KeyEvent.normalizeMetaState(paramInt);
    n.p(false);
    return this;
  }
  
  public final MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = x;
    int i2 = paramBoolean | i1 & 0xFFFFFFFE;
    x = i2;
    if (i1 != i2) {
      n.p(false);
    }
    return this;
  }
  
  public final MenuItem setChecked(boolean paramBoolean)
  {
    int i1 = x;
    int i2 = 2;
    if ((i1 & 0x4) != 0)
    {
      f localf = n;
      localf.getClass();
      int i3 = b;
      int i4 = f.size();
      localf.w();
      for (i2 = 0; i2 < i4; i2++)
      {
        h localh = (h)f.get(i2);
        if (b == i3)
        {
          i1 = x;
          int i5 = 1;
          if ((i1 & 0x4) != 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if ((i1 != 0) && (localh.isCheckable()))
          {
            if (localh == this) {
              i1 = i5;
            } else {
              i1 = 0;
            }
            i5 = x;
            if (i1 != 0) {
              i1 = 2;
            } else {
              i1 = 0;
            }
            i1 |= i5 & 0xFFFFFFFD;
            x = i1;
            if (i5 != i1) {
              n.p(false);
            }
          }
        }
      }
      localf.v();
    }
    else
    {
      if (!paramBoolean) {
        i2 = 0;
      }
      i2 |= i1 & 0xFFFFFFFD;
      x = i2;
      if (i1 != i2) {
        n.p(false);
      }
    }
    return this;
  }
  
  public final z.b setContentDescription(CharSequence paramCharSequence)
  {
    q = paramCharSequence;
    n.p(false);
    return this;
  }
  
  public final MenuItem setEnabled(boolean paramBoolean)
  {
    int i1;
    if (paramBoolean) {
      i1 = x | 0x10;
    } else {
      i1 = x & 0xFFFFFFEF;
    }
    x = i1;
    n.p(false);
    return this;
  }
  
  public final MenuItem setIcon(int paramInt)
  {
    l = null;
    m = paramInt;
    w = true;
    n.p(false);
    return this;
  }
  
  public final MenuItem setIcon(Drawable paramDrawable)
  {
    m = 0;
    l = paramDrawable;
    w = true;
    n.p(false);
    return this;
  }
  
  public final MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    s = paramColorStateList;
    u = true;
    w = true;
    n.p(false);
    return this;
  }
  
  public final MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    t = paramMode;
    v = true;
    w = true;
    n.p(false);
    return this;
  }
  
  public final MenuItem setIntent(Intent paramIntent)
  {
    g = paramIntent;
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar)
  {
    if (h == paramChar) {
      return this;
    }
    h = ((char)paramChar);
    n.p(false);
    return this;
  }
  
  public final MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    if ((h == paramChar) && (i == paramInt)) {
      return this;
    }
    h = ((char)paramChar);
    i = KeyEvent.normalizeMetaState(paramInt);
    n.p(false);
    return this;
  }
  
  public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    B = paramOnActionExpandListener;
    return this;
  }
  
  public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    p = paramOnMenuItemClickListener;
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    h = ((char)paramChar1);
    j = Character.toLowerCase(paramChar2);
    n.p(false);
    return this;
  }
  
  public final MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    h = ((char)paramChar1);
    i = KeyEvent.normalizeMetaState(paramInt1);
    j = Character.toLowerCase(paramChar2);
    k = KeyEvent.normalizeMetaState(paramInt2);
    n.p(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    int i1 = paramInt & 0x3;
    if ((i1 != 0) && (i1 != 1) && (i1 != 2)) {
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    y = paramInt;
    f localf = n;
    k = true;
    localf.p(true);
  }
  
  public final MenuItem setShowAsActionFlags(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public final MenuItem setTitle(int paramInt)
  {
    setTitle(n.a.getString(paramInt));
    return this;
  }
  
  public final MenuItem setTitle(CharSequence paramCharSequence)
  {
    e = paramCharSequence;
    n.p(false);
    m localm = o;
    if (localm != null) {
      localm.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    f = paramCharSequence;
    n.p(false);
    return this;
  }
  
  public final z.b setTooltipText(CharSequence paramCharSequence)
  {
    r = paramCharSequence;
    n.p(false);
    return this;
  }
  
  public final MenuItem setVisible(boolean paramBoolean)
  {
    int i1 = x;
    int i2 = 0;
    if (paramBoolean) {
      i3 = 0;
    } else {
      i3 = 8;
    }
    int i4 = i3 | i1 & 0xFFFFFFF7;
    x = i4;
    int i3 = i2;
    if (i1 != i4) {
      i3 = 1;
    }
    if (i3 != 0)
    {
      f localf = n;
      h = true;
      localf.p(true);
    }
    return this;
  }
  
  public final String toString()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public final class a
    implements b.a
  {
    public a() {}
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */