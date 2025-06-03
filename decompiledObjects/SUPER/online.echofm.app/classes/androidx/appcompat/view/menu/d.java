package androidx.appcompat.view.menu;

import I.u;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class d
  implements C.a
{
  public static final int[] A = { 1, 4, 5, 3, 2, 0 };
  public final Context a;
  public final Resources b;
  public boolean c;
  public boolean d;
  public a e;
  public ArrayList f;
  public ArrayList g;
  public boolean h;
  public ArrayList i;
  public ArrayList j;
  public boolean k;
  public int l = 0;
  public ContextMenu.ContextMenuInfo m;
  public CharSequence n;
  public Drawable o;
  public View p;
  public boolean q = false;
  public boolean r = false;
  public boolean s = false;
  public boolean t = false;
  public boolean u = false;
  public ArrayList v = new ArrayList();
  public CopyOnWriteArrayList w = new CopyOnWriteArrayList();
  public e x;
  public boolean y = false;
  public boolean z;
  
  public d(Context paramContext)
  {
    a = paramContext;
    b = paramContext.getResources();
    f = new ArrayList();
    g = new ArrayList();
    h = true;
    i = new ArrayList();
    j = new ArrayList();
    k = true;
    T(true);
  }
  
  public static int m(ArrayList paramArrayList, int paramInt)
  {
    for (int i1 = paramArrayList.size() - 1; i1 >= 0; i1--) {
      if (((e)paramArrayList.get(i1)).d() <= paramInt) {
        return i1 + 1;
      }
    }
    return 0;
  }
  
  public static int x(int paramInt)
  {
    int i1 = (0xFFFF0000 & paramInt) >> 16;
    if (i1 >= 0)
    {
      int[] arrayOfInt = A;
      if (i1 < arrayOfInt.length) {
        return paramInt & 0xFFFF | arrayOfInt[i1] << 16;
      }
    }
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public ArrayList A()
  {
    if (!h) {
      return g;
    }
    g.clear();
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      e locale = (e)f.get(i2);
      if (locale.isVisible()) {
        g.add(locale);
      }
    }
    h = false;
    k = true;
    return g;
  }
  
  public boolean B()
  {
    return y;
  }
  
  public boolean C()
  {
    return c;
  }
  
  public boolean D()
  {
    return d;
  }
  
  public void E(e parame)
  {
    k = true;
    G(true);
  }
  
  public void F(e parame)
  {
    h = true;
    G(true);
  }
  
  public void G(boolean paramBoolean)
  {
    if (!q)
    {
      if (paramBoolean)
      {
        h = true;
        k = true;
      }
      h(paramBoolean);
    }
    else
    {
      r = true;
      if (paramBoolean) {
        s = true;
      }
    }
  }
  
  public boolean H(MenuItem paramMenuItem, int paramInt)
  {
    return I(paramMenuItem, null, paramInt);
  }
  
  public boolean I(MenuItem paramMenuItem, g paramg, int paramInt)
  {
    paramMenuItem = (e)paramMenuItem;
    if ((paramMenuItem != null) && (paramMenuItem.isEnabled()))
    {
      boolean bool1 = paramMenuItem.j();
      paramMenuItem.g();
      boolean bool2;
      if (paramMenuItem.i())
      {
        bool1 |= paramMenuItem.expandActionView();
        bool2 = bool1;
        if (bool1) {
          bool2 = bool1;
        }
      }
      else
      {
        for (;;)
        {
          d(true);
          break;
          if (!paramMenuItem.hasSubMenu())
          {
            bool2 = bool1;
            if ((paramInt & 0x1) != 0) {
              break;
            }
            bool2 = bool1;
          }
          else
          {
            if ((paramInt & 0x4) == 0) {
              d(false);
            }
            if (!paramMenuItem.hasSubMenu()) {
              paramMenuItem.w(new j(s(), this, paramMenuItem));
            }
            bool1 |= i((j)paramMenuItem.getSubMenu(), paramg);
            bool2 = bool1;
            if (bool1) {
              break;
            }
            bool2 = bool1;
          }
        }
      }
      return bool2;
    }
    return false;
  }
  
  public final void J(int paramInt, boolean paramBoolean)
  {
    if ((paramInt >= 0) && (paramInt < f.size()))
    {
      f.remove(paramInt);
      if (paramBoolean) {
        G(true);
      }
    }
  }
  
  public void K(g paramg)
  {
    Iterator localIterator = w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      g localg = (g)localWeakReference.get();
      if ((localg == null) || (localg == paramg)) {
        w.remove(localWeakReference);
      }
    }
  }
  
  public void L(a parama)
  {
    e = parama;
  }
  
  public void M(MenuItem paramMenuItem)
  {
    int i1 = paramMenuItem.getGroupId();
    int i2 = f.size();
    V();
    for (int i3 = 0; i3 < i2; i3++)
    {
      e locale = (e)f.get(i3);
      if ((locale.getGroupId() == i1) && (locale.l()) && (locale.isCheckable()))
      {
        boolean bool;
        if (locale == paramMenuItem) {
          bool = true;
        } else {
          bool = false;
        }
        locale.r(bool);
      }
    }
    U();
  }
  
  public d N(int paramInt)
  {
    P(0, null, paramInt, null, null);
    return this;
  }
  
  public d O(Drawable paramDrawable)
  {
    P(0, null, 0, paramDrawable, null);
    return this;
  }
  
  public final void P(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = y();
    if (paramView != null)
    {
      p = paramView;
      n = null;
      o = null;
    }
    else
    {
      if (paramInt1 > 0) {
        n = localResources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        n = paramCharSequence;
      }
      if (paramInt2 > 0) {
        o = x.a.d(s(), paramInt2);
      } else if (paramDrawable != null) {
        o = paramDrawable;
      }
      p = null;
    }
    G(false);
  }
  
  public d Q(int paramInt)
  {
    P(paramInt, null, 0, null, null);
    return this;
  }
  
  public d R(CharSequence paramCharSequence)
  {
    P(0, paramCharSequence, 0, null, null);
    return this;
  }
  
  public d S(View paramView)
  {
    P(0, null, 0, null, paramView);
    return this;
  }
  
  public final void T(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i1 = b.getConfiguration().keyboard;
      paramBoolean = true;
      if ((i1 != 1) && (u.b(ViewConfiguration.get(a), a))) {}
    }
    else
    {
      paramBoolean = false;
    }
    d = paramBoolean;
  }
  
  public void U()
  {
    q = false;
    if (r)
    {
      r = false;
      G(s);
    }
  }
  
  public void V()
  {
    if (!q)
    {
      q = true;
      r = false;
      s = false;
    }
  }
  
  public MenuItem a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = x(paramInt3);
    paramCharSequence = f(paramInt1, paramInt2, paramInt3, i1, paramCharSequence, l);
    Object localObject = m;
    if (localObject != null) {
      paramCharSequence.u((ContextMenu.ContextMenuInfo)localObject);
    }
    localObject = f;
    ((ArrayList)localObject).add(m((ArrayList)localObject, i1), paramCharSequence);
    G(true);
    return paramCharSequence;
  }
  
  public MenuItem add(int paramInt)
  {
    return a(0, 0, 0, b.getString(paramInt));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, b.getString(paramInt4));
  }
  
  public MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    PackageManager localPackageManager = a.getPackageManager();
    int i1 = 0;
    List localList = localPackageManager.queryIntentActivityOptions(paramComponentName, paramArrayOfIntent, paramIntent, 0);
    int i2;
    if (localList != null) {
      i2 = localList.size();
    } else {
      i2 = 0;
    }
    int i3 = i1;
    if ((paramInt4 & 0x1) == 0) {
      removeGroup(paramInt1);
    }
    for (i3 = i1; i3 < i2; i3++)
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localList.get(i3);
      paramInt4 = specificIndex;
      if (paramInt4 < 0) {
        paramComponentName = paramIntent;
      } else {
        paramComponentName = paramArrayOfIntent[paramInt4];
      }
      Intent localIntent = new Intent(paramComponentName);
      paramComponentName = activityInfo;
      localIntent.setComponent(new ComponentName(applicationInfo.packageName, name));
      paramComponentName = add(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager)).setIcon(localResolveInfo.loadIcon(localPackageManager)).setIntent(localIntent);
      if (paramArrayOfMenuItem != null)
      {
        paramInt4 = specificIndex;
        if (paramInt4 >= 0) {
          paramArrayOfMenuItem[paramInt4] = paramComponentName;
        }
      }
    }
    return i2;
  }
  
  public SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, b.getString(paramInt));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, b.getString(paramInt4));
  }
  
  public SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = (e)a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    j localj = new j(a, this, paramCharSequence);
    paramCharSequence.w(localj);
    return localj;
  }
  
  public SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public void b(g paramg, Context paramContext)
  {
    w.add(new WeakReference(paramg));
    paramg.c(paramContext, this);
    k = true;
  }
  
  public void c()
  {
    a locala = e;
    if (locala != null) {
      locala.b(this);
    }
  }
  
  public void clear()
  {
    e locale = x;
    if (locale != null) {
      e(locale);
    }
    f.clear();
    G(true);
  }
  
  public void clearHeader()
  {
    o = null;
    n = null;
    p = null;
    G(false);
  }
  
  public void close()
  {
    d(true);
  }
  
  public final void d(boolean paramBoolean)
  {
    if (u) {
      return;
    }
    u = true;
    Iterator localIterator = w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      g localg = (g)localWeakReference.get();
      if (localg == null) {
        w.remove(localWeakReference);
      } else {
        localg.b(this, paramBoolean);
      }
    }
    u = false;
  }
  
  public boolean e(e parame)
  {
    boolean bool1 = w.isEmpty();
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1) {
      if (x != parame)
      {
        bool4 = bool2;
      }
      else
      {
        V();
        Iterator localIterator = w.iterator();
        bool4 = bool3;
        do
        {
          g localg;
          for (;;)
          {
            bool3 = bool4;
            if (!localIterator.hasNext()) {
              break label125;
            }
            WeakReference localWeakReference = (WeakReference)localIterator.next();
            localg = (g)localWeakReference.get();
            if (localg != null) {
              break;
            }
            w.remove(localWeakReference);
          }
          bool3 = localg.h(this, parame);
          bool4 = bool3;
        } while (!bool3);
        label125:
        U();
        bool4 = bool3;
        if (bool3)
        {
          x = null;
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public final e f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    return new e(this, paramInt1, paramInt2, paramInt3, paramInt4, paramCharSequence, paramInt5);
  }
  
  public MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (e)f.get(i2);
      if (((e)localObject).getItemId() == paramInt) {
        return (MenuItem)localObject;
      }
      if (((e)localObject).hasSubMenu())
      {
        localObject = ((e)localObject).getSubMenu().findItem(paramInt);
        if (localObject != null) {
          return (MenuItem)localObject;
        }
      }
    }
    return null;
  }
  
  public boolean g(d paramd, MenuItem paramMenuItem)
  {
    a locala = e;
    boolean bool;
    if ((locala != null) && (locala.a(paramd, paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public MenuItem getItem(int paramInt)
  {
    return (MenuItem)f.get(paramInt);
  }
  
  public final void h(boolean paramBoolean)
  {
    if (w.isEmpty()) {
      return;
    }
    V();
    Iterator localIterator = w.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      g localg = (g)localWeakReference.get();
      if (localg == null) {
        w.remove(localWeakReference);
      } else {
        localg.f(paramBoolean);
      }
    }
    U();
  }
  
  public boolean hasVisibleItems()
  {
    if (z) {
      return true;
    }
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((e)f.get(i2)).isVisible()) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean i(j paramj, g paramg)
  {
    boolean bool1 = w.isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    if (paramg != null) {
      bool2 = paramg.e(paramj);
    }
    Iterator localIterator = w.iterator();
    while (localIterator.hasNext())
    {
      paramg = (WeakReference)localIterator.next();
      g localg = (g)paramg.get();
      if (localg == null) {
        w.remove(paramg);
      } else if (!bool2) {
        bool2 = localg.e(paramj);
      }
    }
    return bool2;
  }
  
  public boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (o(paramInt, paramKeyEvent) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j(e parame)
  {
    boolean bool1 = w.isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    V();
    Iterator localIterator = w.iterator();
    do
    {
      g localg;
      for (;;)
      {
        bool1 = bool2;
        if (!localIterator.hasNext()) {
          break label97;
        }
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localg = (g)localWeakReference.get();
        if (localg != null) {
          break;
        }
        w.remove(localWeakReference);
      }
      bool1 = localg.j(this, parame);
      bool2 = bool1;
    } while (!bool1);
    label97:
    U();
    if (bool1) {
      x = parame;
    }
    return bool1;
  }
  
  public int k(int paramInt)
  {
    return l(paramInt, 0);
  }
  
  public int l(int paramInt1, int paramInt2)
  {
    int i1 = size();
    int i2 = paramInt2;
    if (paramInt2 < 0) {}
    for (i2 = 0; i2 < i1; i2++) {
      if (((e)f.get(i2)).getGroupId() == paramInt1) {
        return i2;
      }
    }
    return -1;
  }
  
  public int n(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((e)f.get(i2)).getItemId() == paramInt) {
        return i2;
      }
    }
    return -1;
  }
  
  public e o(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = v;
    localArrayList.clear();
    p(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty()) {
      return null;
    }
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i2 = localArrayList.size();
    if (i2 == 1) {
      return (e)localArrayList.get(0);
    }
    boolean bool = C();
    for (int i3 = 0; i3 < i2; i3++)
    {
      paramKeyEvent = (e)localArrayList.get(i3);
      int i4;
      if (bool) {
        i4 = paramKeyEvent.getAlphabeticShortcut();
      } else {
        i4 = paramKeyEvent.getNumericShortcut();
      }
      char[] arrayOfChar = meta;
      if (((i4 == arrayOfChar[0]) && ((i1 & 0x2) == 0)) || ((i4 == arrayOfChar[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67))) {
        return paramKeyEvent;
      }
    }
    return null;
  }
  
  public void p(List paramList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = C();
    int i1 = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i2 = f.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      e locale = (e)f.get(i3);
      if (locale.hasSubMenu()) {
        ((d)locale.getSubMenu()).p(paramList, paramInt, paramKeyEvent);
      }
      int i4;
      if (bool) {
        i4 = locale.getAlphabeticShortcut();
      } else {
        i4 = locale.getNumericShortcut();
      }
      int i5;
      if (bool) {
        i5 = locale.getAlphabeticModifiers();
      } else {
        i5 = locale.getNumericModifiers();
      }
      if (((i1 & 0x1100F) == (i5 & 0x1100F)) && (i4 != 0))
      {
        char[] arrayOfChar = meta;
        if (((i4 == arrayOfChar[0]) || (i4 == arrayOfChar[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (locale.isEnabled())) {
          paramList.add(locale);
        }
      }
    }
  }
  
  public boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return H(findItem(paramInt1), paramInt2);
  }
  
  public boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = o(paramInt1, paramKeyEvent);
    boolean bool;
    if (paramKeyEvent != null) {
      bool = H(paramKeyEvent, paramInt2);
    } else {
      bool = false;
    }
    if ((paramInt2 & 0x2) != 0) {
      d(true);
    }
    return bool;
  }
  
  public void q()
  {
    ArrayList localArrayList = A();
    if (!k) {
      return;
    }
    Iterator localIterator = w.iterator();
    int i1 = 0;
    Object localObject1;
    Object localObject2;
    while (localIterator.hasNext())
    {
      localObject1 = (WeakReference)localIterator.next();
      localObject2 = (g)((Reference)localObject1).get();
      if (localObject2 == null) {
        w.remove(localObject1);
      } else {
        i1 |= ((g)localObject2).g();
      }
    }
    if (i1 != 0)
    {
      i.clear();
      j.clear();
      int i2 = localArrayList.size();
      for (i1 = 0; i1 < i2; i1++)
      {
        localObject1 = (e)localArrayList.get(i1);
        if (((e)localObject1).k()) {}
        for (localObject2 = i;; localObject2 = j)
        {
          ((ArrayList)localObject2).add(localObject1);
          break;
        }
      }
    }
    i.clear();
    j.clear();
    j.addAll(A());
    k = false;
  }
  
  public ArrayList r()
  {
    q();
    return i;
  }
  
  public void removeGroup(int paramInt)
  {
    int i1 = k(paramInt);
    if (i1 >= 0)
    {
      int i2 = f.size();
      for (int i3 = 0; (i3 < i2 - i1) && (((e)f.get(i1)).getGroupId() == paramInt); i3++) {
        J(i1, false);
      }
      G(true);
    }
  }
  
  public void removeItem(int paramInt)
  {
    J(n(paramInt), true);
  }
  
  public Context s()
  {
    return a;
  }
  
  public void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      e locale = (e)f.get(i2);
      if (locale.getGroupId() == paramInt)
      {
        locale.s(paramBoolean2);
        locale.setCheckable(paramBoolean1);
      }
    }
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    y = paramBoolean;
  }
  
  public void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      e locale = (e)f.get(i2);
      if (locale.getGroupId() == paramInt) {
        locale.setEnabled(paramBoolean);
      }
    }
  }
  
  public void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = f.size();
    int i2 = 0;
    int i4;
    for (int i3 = 0; i2 < i1; i3 = i4)
    {
      e locale = (e)f.get(i2);
      i4 = i3;
      if (locale.getGroupId() == paramInt)
      {
        i4 = i3;
        if (locale.x(paramBoolean)) {
          i4 = 1;
        }
      }
      i2++;
    }
    if (i3 != 0) {
      G(true);
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    c = paramBoolean;
    G(false);
  }
  
  public int size()
  {
    return f.size();
  }
  
  public e t()
  {
    return x;
  }
  
  public CharSequence u()
  {
    return n;
  }
  
  public ArrayList v()
  {
    q();
    return j;
  }
  
  public boolean w()
  {
    return t;
  }
  
  public Resources y()
  {
    return b;
  }
  
  public d z()
  {
    return this;
  }
  
  public static abstract interface a
  {
    public abstract boolean a(d paramd, MenuItem paramMenuItem);
    
    public abstract void b(d paramd);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(e parame);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */