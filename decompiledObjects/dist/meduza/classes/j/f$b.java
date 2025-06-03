package j;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.h;
import e0.n;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;

public final class f$b
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
  public e0.b z;
  
  public f$b(f paramf, Menu paramMenu)
  {
    a = paramMenu;
    b = 0;
    c = 0;
    d = 0;
    e = 0;
    f = true;
    g = true;
  }
  
  public final <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
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
  
  public final void b(MenuItem paramMenuItem)
  {
    Object localObject1 = paramMenuItem.setChecked(s).setVisible(t).setEnabled(u);
    int i1 = r;
    int i2 = 0;
    if (i1 >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    ((MenuItem)localObject1).setCheckable(bool).setTitleCondensed(l).setIcon(m);
    i1 = v;
    if (i1 >= 0) {
      paramMenuItem.setShowAsAction(i1);
    }
    if (y != null) {
      if (!E.c.isRestricted())
      {
        localObject1 = E;
        if (d == null) {
          d = f.a(c);
        }
        paramMenuItem.setOnMenuItemClickListener(new f.a(d, y));
      }
      else
      {
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
    }
    if (r >= 2) {
      if ((paramMenuItem instanceof h))
      {
        localObject1 = (h)paramMenuItem;
        x = (x & 0xFFFFFFFB | 0x4);
      }
      else if ((paramMenuItem instanceof c))
      {
        localObject1 = (c)paramMenuItem;
        try
        {
          if (e == null) {
            e = d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
          }
          e.invoke(d, new Object[] { Boolean.TRUE });
        }
        catch (Exception localException)
        {
          Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
        }
      }
    }
    Object localObject2 = x;
    if (localObject2 != null)
    {
      paramMenuItem.setActionView((View)a((String)localObject2, f.e, E.a));
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
    localObject2 = z;
    if (localObject2 != null) {
      if ((paramMenuItem instanceof z.b)) {
        ((z.b)paramMenuItem).a((e0.b)localObject2);
      } else {
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
      }
    }
    localObject2 = A;
    boolean bool = paramMenuItem instanceof z.b;
    if (bool) {
      ((z.b)paramMenuItem).setContentDescription((CharSequence)localObject2);
    } else if (Build.VERSION.SDK_INT >= 26) {
      n.h(paramMenuItem, (CharSequence)localObject2);
    }
    localObject2 = B;
    if (bool) {
      ((z.b)paramMenuItem).setTooltipText((CharSequence)localObject2);
    } else if (Build.VERSION.SDK_INT >= 26) {
      n.m(paramMenuItem, (CharSequence)localObject2);
    }
    char c1 = n;
    i2 = o;
    if (bool) {
      ((z.b)paramMenuItem).setAlphabeticShortcut(c1, i2);
    } else if (Build.VERSION.SDK_INT >= 26) {
      n.g(paramMenuItem, c1, i2);
    }
    c1 = p;
    i2 = q;
    if (bool) {
      ((z.b)paramMenuItem).setNumericShortcut(c1, i2);
    } else if (Build.VERSION.SDK_INT >= 26) {
      n.k(paramMenuItem, c1, i2);
    }
    localObject2 = D;
    if (localObject2 != null) {
      if (bool) {
        ((z.b)paramMenuItem).setIconTintMode((PorterDuff.Mode)localObject2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.j(paramMenuItem, (PorterDuff.Mode)localObject2);
      }
    }
    localObject2 = C;
    if (localObject2 != null) {
      if (bool) {
        ((z.b)paramMenuItem).setIconTintList((ColorStateList)localObject2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.i(paramMenuItem, (ColorStateList)localObject2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     j.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */