package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import l.B;
import l.X;

public class c$b
{
  public CharSequence A;
  public CharSequence B;
  public ColorStateList C = null;
  public PorterDuff.Mode D = null;
  public Menu a;
  public int b;
  public int c;
  public int d;
  public int e;
  public boolean f;
  public boolean g;
  public boolean h;
  public int i;
  public int j;
  public CharSequence k;
  public CharSequence l;
  public int m;
  public char n;
  public int o;
  public char p;
  public int q;
  public int r;
  public boolean s;
  public boolean t;
  public boolean u;
  public int v;
  public int w;
  public String x;
  public String y;
  public String z;
  
  public c$b(c paramc, Menu paramMenu)
  {
    a = paramMenu;
    h();
  }
  
  public void a()
  {
    h = true;
    i(a.add(b, i, j, k));
  }
  
  public SubMenu b()
  {
    h = true;
    SubMenu localSubMenu = a.addSubMenu(b, i, j, k);
    i(localSubMenu.getItem());
    return localSubMenu;
  }
  
  public final char c(String paramString)
  {
    if (paramString == null) {
      return '\000';
    }
    return paramString.charAt(0);
  }
  
  public boolean d()
  {
    return h;
  }
  
  public final Object e(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
  {
    try
    {
      paramArrayOfClass = Class.forName(paramString, false, E.c.getClassLoader()).getConstructor(paramArrayOfClass);
      paramArrayOfClass.setAccessible(true);
      paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
      return paramArrayOfClass;
    }
    catch (Exception paramArrayOfClass)
    {
      paramArrayOfObject = new StringBuilder();
      paramArrayOfObject.append("Cannot instantiate class: ");
      paramArrayOfObject.append(paramString);
      Log.w("SupportMenuInflater", paramArrayOfObject.toString(), paramArrayOfClass);
    }
    return null;
  }
  
  public void f(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = E.c.obtainStyledAttributes(paramAttributeSet, e.i.M0);
    b = paramAttributeSet.getResourceId(e.i.O0, 0);
    c = paramAttributeSet.getInt(e.i.Q0, 0);
    d = paramAttributeSet.getInt(e.i.R0, 0);
    e = paramAttributeSet.getInt(e.i.S0, 0);
    f = paramAttributeSet.getBoolean(e.i.P0, true);
    g = paramAttributeSet.getBoolean(e.i.N0, true);
    paramAttributeSet.recycle();
  }
  
  public void g(AttributeSet paramAttributeSet)
  {
    paramAttributeSet = X.r(E.c, paramAttributeSet, e.i.T0);
    i = paramAttributeSet.l(e.i.W0, 0);
    j = (paramAttributeSet.i(e.i.Z0, c) & 0xFFFF0000 | paramAttributeSet.i(e.i.a1, d) & 0xFFFF);
    k = paramAttributeSet.n(e.i.b1);
    l = paramAttributeSet.n(e.i.c1);
    m = paramAttributeSet.l(e.i.U0, 0);
    n = c(paramAttributeSet.m(e.i.d1));
    o = paramAttributeSet.i(e.i.k1, 4096);
    p = c(paramAttributeSet.m(e.i.e1));
    q = paramAttributeSet.i(e.i.o1, 4096);
    if (paramAttributeSet.p(e.i.f1)) {}
    int i2;
    for (int i1 = paramAttributeSet.a(e.i.f1, false);; i2 = e)
    {
      r = i1;
      break;
    }
    s = paramAttributeSet.a(e.i.X0, false);
    t = paramAttributeSet.a(e.i.Y0, f);
    u = paramAttributeSet.a(e.i.V0, g);
    v = paramAttributeSet.i(e.i.p1, -1);
    z = paramAttributeSet.m(e.i.g1);
    w = paramAttributeSet.l(e.i.h1, 0);
    x = paramAttributeSet.m(e.i.j1);
    String str = paramAttributeSet.m(e.i.i1);
    y = str;
    if (str != null) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    if ((i2 != 0) && (w == 0) && (x == null)) {
      a.a(e(str, c.f, E.b));
    } else if (i2 != 0) {
      Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
    }
    A = paramAttributeSet.n(e.i.l1);
    B = paramAttributeSet.n(e.i.q1);
    if (paramAttributeSet.p(e.i.n1)) {
      D = B.c(paramAttributeSet.i(e.i.n1, -1), D);
    } else {
      D = null;
    }
    if (paramAttributeSet.p(e.i.m1)) {
      C = paramAttributeSet.c(e.i.m1);
    } else {
      C = null;
    }
    paramAttributeSet.t();
    h = false;
  }
  
  public void h()
  {
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = true;
    g = true;
  }
  
  public final void i(MenuItem paramMenuItem)
  {
    Object localObject = paramMenuItem.setChecked(s).setVisible(t).setEnabled(u);
    int i1 = r;
    int i2 = 0;
    boolean bool;
    if (i1 >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(l).setIcon(m);
    i1 = v;
    if (i1 >= 0) {
      paramMenuItem.setShowAsAction(i1);
    }
    if (z != null) {
      if (!E.c.isRestricted()) {
        paramMenuItem.setOnMenuItemClickListener(new c.a(E.b(), z));
      } else {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
    }
    if ((r >= 2) && ((paramMenuItem instanceof e))) {
      ((e)paramMenuItem).s(true);
    }
    localObject = x;
    if (localObject != null)
    {
      paramMenuItem.setActionView((View)e((String)localObject, c.e, E.a));
      i2 = 1;
    }
    i1 = w;
    if (i1 > 0) {
      if (i2 == 0) {
        paramMenuItem.setActionView(i1);
      } else {
        Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
      }
    }
    I.i.b(paramMenuItem, A);
    I.i.f(paramMenuItem, B);
    I.i.a(paramMenuItem, n, o);
    I.i.e(paramMenuItem, p, q);
    localObject = D;
    if (localObject != null) {
      I.i.d(paramMenuItem, (PorterDuff.Mode)localObject);
    }
    localObject = C;
    if (localObject != null) {
      I.i.c(paramMenuItem, (ColorStateList)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     j.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */