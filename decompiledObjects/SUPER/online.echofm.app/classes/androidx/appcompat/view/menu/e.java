package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import e.g;

public final class e
  implements C.b
{
  public View A;
  public MenuItem.OnActionExpandListener B;
  public boolean C = false;
  public ContextMenu.ContextMenuInfo D;
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
  public d n;
  public j o;
  public Runnable p;
  public MenuItem.OnMenuItemClickListener q;
  public CharSequence r;
  public CharSequence s;
  public ColorStateList t = null;
  public PorterDuff.Mode u = null;
  public boolean v = false;
  public boolean w = false;
  public boolean x = false;
  public int y = 16;
  public int z;
  
  public e(d paramd, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    n = paramd;
    a = paramInt2;
    b = paramInt1;
    c = paramInt3;
    d = paramInt4;
    e = paramCharSequence;
    z = paramInt5;
  }
  
  public static void b(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 & paramInt2) == paramInt2) {
      paramStringBuilder.append(paramString);
    }
  }
  
  public boolean A()
  {
    boolean bool;
    if ((z & 0x4) == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void a()
  {
    n.E(this);
  }
  
  public final Drawable c(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      localDrawable = paramDrawable;
      if (x) {
        if (!v)
        {
          localDrawable = paramDrawable;
          if (!w) {}
        }
        else
        {
          localDrawable = B.a.o(paramDrawable).mutate();
          if (v) {
            B.a.m(localDrawable, t);
          }
          if (w) {
            B.a.n(localDrawable, u);
          }
          x = false;
        }
      }
    }
    return localDrawable;
  }
  
  public boolean collapseActionView()
  {
    if ((z & 0x8) == 0) {
      return false;
    }
    if (A == null) {
      return true;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = B;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionCollapse(this))) {
      return false;
    }
    return n.e(this);
  }
  
  public int d()
  {
    return d;
  }
  
  public char e()
  {
    char c1;
    char c2;
    if (n.C())
    {
      c1 = j;
      c2 = c1;
    }
    else
    {
      c1 = h;
      c2 = c1;
    }
    return c2;
  }
  
  public boolean expandActionView()
  {
    if (!i()) {
      return false;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = B;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionExpand(this))) {
      return false;
    }
    return n.j(this);
  }
  
  public String f()
  {
    char c1 = e();
    if (c1 == 0) {
      return "";
    }
    Resources localResources = n.s().getResources();
    StringBuilder localStringBuilder = new StringBuilder();
    if (ViewConfiguration.get(n.s()).hasPermanentMenuKey()) {
      localStringBuilder.append(localResources.getString(g.k));
    }
    int i1;
    if (n.C()) {
      i1 = k;
    } else {
      i1 = i;
    }
    b(localStringBuilder, i1, 65536, localResources.getString(g.g));
    b(localStringBuilder, i1, 4096, localResources.getString(g.c));
    b(localStringBuilder, i1, 2, localResources.getString(g.b));
    b(localStringBuilder, i1, 1, localResources.getString(g.h));
    b(localStringBuilder, i1, 4, localResources.getString(g.j));
    b(localStringBuilder, i1, 8, localResources.getString(g.f));
    if (c1 != '\b') {
      if (c1 != '\n')
      {
        if (c1 != ' ')
        {
          localStringBuilder.append(c1);
          break label234;
        }
        i1 = g.i;
      }
    }
    for (;;)
    {
      localStringBuilder.append(localResources.getString(i1));
      break;
      i1 = g.e;
      continue;
      i1 = g.d;
    }
    label234:
    return localStringBuilder.toString();
  }
  
  public I.b g()
  {
    return null;
  }
  
  public ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public View getActionView()
  {
    View localView = A;
    if (localView != null) {
      return localView;
    }
    return null;
  }
  
  public int getAlphabeticModifiers()
  {
    return k;
  }
  
  public char getAlphabeticShortcut()
  {
    return j;
  }
  
  public CharSequence getContentDescription()
  {
    return r;
  }
  
  public int getGroupId()
  {
    return b;
  }
  
  public Drawable getIcon()
  {
    Drawable localDrawable = l;
    if (localDrawable != null) {
      return c(localDrawable);
    }
    if (m != 0)
    {
      localDrawable = g.a.b(n.s(), m);
      m = 0;
      l = localDrawable;
      return c(localDrawable);
    }
    return null;
  }
  
  public ColorStateList getIconTintList()
  {
    return t;
  }
  
  public PorterDuff.Mode getIconTintMode()
  {
    return u;
  }
  
  public Intent getIntent()
  {
    return g;
  }
  
  public int getItemId()
  {
    return a;
  }
  
  public ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return D;
  }
  
  public int getNumericModifiers()
  {
    return i;
  }
  
  public char getNumericShortcut()
  {
    return h;
  }
  
  public int getOrder()
  {
    return c;
  }
  
  public SubMenu getSubMenu()
  {
    return o;
  }
  
  public CharSequence getTitle()
  {
    return e;
  }
  
  public CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = f;
    if (localCharSequence == null) {
      localCharSequence = e;
    }
    return localCharSequence;
  }
  
  public CharSequence getTooltipText()
  {
    return s;
  }
  
  public CharSequence h(h.a parama)
  {
    if ((parama != null) && (parama.a())) {
      parama = getTitleCondensed();
    } else {
      parama = getTitle();
    }
    return parama;
  }
  
  public boolean hasSubMenu()
  {
    boolean bool;
    if (o != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean i()
  {
    int i1 = z;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((i1 & 0x8) != 0)
    {
      bool2 = bool1;
      if (A != null) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean isActionViewExpanded()
  {
    return C;
  }
  
  public boolean isCheckable()
  {
    int i1 = y;
    boolean bool = true;
    if ((i1 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isChecked()
  {
    boolean bool;
    if ((y & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isEnabled()
  {
    boolean bool;
    if ((y & 0x10) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isVisible()
  {
    boolean bool;
    if ((y & 0x8) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j()
  {
    Object localObject = q;
    if ((localObject != null) && (((MenuItem.OnMenuItemClickListener)localObject).onMenuItemClick(this))) {
      return true;
    }
    localObject = n;
    if (((d)localObject).g((d)localObject, this)) {
      return true;
    }
    localObject = p;
    if (localObject != null)
    {
      ((Runnable)localObject).run();
      return true;
    }
    if (g != null) {
      try
      {
        n.s().startActivity(g);
        return true;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
      }
    }
    return false;
  }
  
  public boolean k()
  {
    boolean bool;
    if ((y & 0x20) == 32) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean l()
  {
    boolean bool;
    if ((y & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean m()
  {
    int i1 = z;
    boolean bool = true;
    if ((i1 & 0x1) != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean n()
  {
    boolean bool;
    if ((z & 0x2) == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public C.b o(int paramInt)
  {
    Context localContext = n.s();
    p(LayoutInflater.from(localContext).inflate(paramInt, new LinearLayout(localContext), false));
    return this;
  }
  
  public C.b p(View paramView)
  {
    A = paramView;
    if ((paramView != null) && (paramView.getId() == -1))
    {
      int i1 = a;
      if (i1 > 0) {
        paramView.setId(i1);
      }
    }
    n.E(this);
    return this;
  }
  
  public void q(boolean paramBoolean)
  {
    C = paramBoolean;
    n.G(false);
  }
  
  public void r(boolean paramBoolean)
  {
    int i1 = y;
    int i2;
    if (paramBoolean) {
      i2 = 2;
    } else {
      i2 = 0;
    }
    i2 |= i1 & 0xFFFFFFFD;
    y = i2;
    if (i1 != i2) {
      n.G(false);
    }
  }
  
  public void s(boolean paramBoolean)
  {
    int i1 = y;
    int i2;
    if (paramBoolean) {
      i2 = 4;
    } else {
      i2 = 0;
    }
    y = (i2 | i1 & 0xFFFFFFFB);
  }
  
  public MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (j == paramChar) {
      return this;
    }
    j = Character.toLowerCase(paramChar);
    n.G(false);
    return this;
  }
  
  public MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    if ((j == paramChar) && (k == paramInt)) {
      return this;
    }
    j = Character.toLowerCase(paramChar);
    k = KeyEvent.normalizeMetaState(paramInt);
    n.G(false);
    return this;
  }
  
  public MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = y;
    int i2 = paramBoolean | i1 & 0xFFFFFFFE;
    y = i2;
    if (i1 != i2) {
      n.G(false);
    }
    return this;
  }
  
  public MenuItem setChecked(boolean paramBoolean)
  {
    if ((y & 0x4) != 0) {
      n.M(this);
    } else {
      r(paramBoolean);
    }
    return this;
  }
  
  public C.b setContentDescription(CharSequence paramCharSequence)
  {
    r = paramCharSequence;
    n.G(false);
    return this;
  }
  
  public MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = y | 0x10;; i1 = y & 0xFFFFFFEF)
    {
      y = i1;
      break;
    }
    n.G(false);
    return this;
  }
  
  public MenuItem setIcon(int paramInt)
  {
    l = null;
    m = paramInt;
    x = true;
    n.G(false);
    return this;
  }
  
  public MenuItem setIcon(Drawable paramDrawable)
  {
    m = 0;
    l = paramDrawable;
    x = true;
    n.G(false);
    return this;
  }
  
  public MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    t = paramColorStateList;
    v = true;
    x = true;
    n.G(false);
    return this;
  }
  
  public MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    u = paramMode;
    w = true;
    x = true;
    n.G(false);
    return this;
  }
  
  public MenuItem setIntent(Intent paramIntent)
  {
    g = paramIntent;
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar)
  {
    if (h == paramChar) {
      return this;
    }
    h = ((char)paramChar);
    n.G(false);
    return this;
  }
  
  public MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    if ((h == paramChar) && (i == paramInt)) {
      return this;
    }
    h = ((char)paramChar);
    i = KeyEvent.normalizeMetaState(paramInt);
    n.G(false);
    return this;
  }
  
  public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    B = paramOnActionExpandListener;
    return this;
  }
  
  public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    q = paramOnMenuItemClickListener;
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    h = ((char)paramChar1);
    j = Character.toLowerCase(paramChar2);
    n.G(false);
    return this;
  }
  
  public MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    h = ((char)paramChar1);
    i = KeyEvent.normalizeMetaState(paramInt1);
    j = Character.toLowerCase(paramChar2);
    k = KeyEvent.normalizeMetaState(paramInt2);
    n.G(false);
    return this;
  }
  
  public void setShowAsAction(int paramInt)
  {
    int i1 = paramInt & 0x3;
    if ((i1 != 0) && (i1 != 1) && (i1 != 2)) {
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    z = paramInt;
    n.E(this);
  }
  
  public MenuItem setTitle(int paramInt)
  {
    return setTitle(n.s().getString(paramInt));
  }
  
  public MenuItem setTitle(CharSequence paramCharSequence)
  {
    e = paramCharSequence;
    n.G(false);
    j localj = o;
    if (localj != null) {
      localj.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    f = paramCharSequence;
    n.G(false);
    return this;
  }
  
  public C.b setTooltipText(CharSequence paramCharSequence)
  {
    s = paramCharSequence;
    n.G(false);
    return this;
  }
  
  public MenuItem setVisible(boolean paramBoolean)
  {
    if (x(paramBoolean)) {
      n.F(this);
    }
    return this;
  }
  
  public void t(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i1 = y | 0x20;; i1 = y & 0xFFFFFFDF)
    {
      y = i1;
      break;
    }
  }
  
  public String toString()
  {
    Object localObject = e;
    if (localObject != null) {
      localObject = ((CharSequence)localObject).toString();
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public void u(ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    D = paramContextMenuInfo;
  }
  
  public C.b v(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public void w(j paramj)
  {
    o = paramj;
    paramj.setHeaderTitle(getTitle());
  }
  
  public boolean x(boolean paramBoolean)
  {
    int i1 = y;
    boolean bool = false;
    int i2;
    if (paramBoolean) {
      i2 = 0;
    } else {
      i2 = 8;
    }
    i2 |= i1 & 0xFFFFFFF7;
    y = i2;
    paramBoolean = bool;
    if (i1 != i2) {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean y()
  {
    return n.w();
  }
  
  public boolean z()
  {
    boolean bool;
    if ((n.D()) && (e() != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */