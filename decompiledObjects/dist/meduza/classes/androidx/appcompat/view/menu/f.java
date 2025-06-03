package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
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
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e0.b;
import e0.j0;
import e0.j0.b;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f
  implements z.a
{
  public static final int[] z = { 1, 4, 5, 3, 2, 0 };
  public final Context a;
  public final Resources b;
  public boolean c;
  public boolean d;
  public a e;
  public ArrayList<h> f;
  public ArrayList<h> g;
  public boolean h;
  public ArrayList<h> i;
  public ArrayList<h> j;
  public boolean k;
  public int l;
  public CharSequence m;
  public Drawable n;
  public View o;
  public boolean p;
  public boolean q;
  public boolean r;
  public boolean s;
  public boolean t;
  public ArrayList<h> u;
  public CopyOnWriteArrayList<WeakReference<j>> v;
  public h w;
  public boolean x;
  public boolean y;
  
  public f(Context paramContext)
  {
    boolean bool1 = false;
    l = 0;
    p = false;
    q = false;
    r = false;
    s = false;
    t = false;
    u = new ArrayList();
    v = new CopyOnWriteArrayList();
    x = false;
    a = paramContext;
    Object localObject = paramContext.getResources();
    b = ((Resources)localObject);
    f = new ArrayList();
    g = new ArrayList();
    h = true;
    i = new ArrayList();
    j = new ArrayList();
    k = true;
    boolean bool2 = bool1;
    if (getConfigurationkeyboard != 1)
    {
      ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
      localObject = j0.a;
      boolean bool3;
      if (Build.VERSION.SDK_INT >= 28)
      {
        bool3 = j0.b.b(localViewConfiguration);
      }
      else
      {
        paramContext = paramContext.getResources();
        int i1 = paramContext.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        if ((i1 != 0) && (paramContext.getBoolean(i1))) {
          bool3 = true;
        } else {
          bool3 = false;
        }
      }
      bool2 = bool1;
      if (bool3) {
        bool2 = true;
      }
    }
    d = bool2;
  }
  
  public final h a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    int i1 = (0xFFFF0000 & paramInt3) >> 16;
    if (i1 >= 0)
    {
      Object localObject = z;
      if (i1 < 6)
      {
        i1 = localObject[i1] << 16 | 0xFFFF & paramInt3;
        localObject = new h(this, paramInt1, paramInt2, paramInt3, i1, paramCharSequence, l);
        paramCharSequence = f;
        paramInt1 = paramCharSequence.size();
        do
        {
          paramInt2 = paramInt1 - 1;
          if (paramInt2 < 0) {
            break;
          }
          paramInt1 = paramInt2;
        } while (getd > i1);
        paramInt1 = paramInt2 + 1;
        break label110;
        paramInt1 = 0;
        label110:
        paramCharSequence.add(paramInt1, localObject);
        p(true);
        return (h)localObject;
      }
    }
    throw new IllegalArgumentException("order does not contain a valid category.");
  }
  
  public final MenuItem add(int paramInt)
  {
    return a(0, 0, 0, b.getString(paramInt));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return a(paramInt1, paramInt2, paramInt3, b.getString(paramInt4));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return a(paramInt1, paramInt2, paramInt3, paramCharSequence);
  }
  
  public final MenuItem add(CharSequence paramCharSequence)
  {
    return a(0, 0, 0, paramCharSequence);
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
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
      paramComponentName = new Intent(paramComponentName);
      Object localObject = activityInfo;
      paramComponentName.setComponent(new ComponentName(applicationInfo.packageName, name));
      localObject = a(paramInt1, paramInt2, paramInt3, localResolveInfo.loadLabel(localPackageManager));
      ((h)localObject).setIcon(localResolveInfo.loadIcon(localPackageManager));
      g = paramComponentName;
      if (paramArrayOfMenuItem != null)
      {
        paramInt4 = specificIndex;
        if (paramInt4 >= 0) {
          paramArrayOfMenuItem[paramInt4] = localObject;
        }
      }
    }
    return i2;
  }
  
  public final SubMenu addSubMenu(int paramInt)
  {
    return addSubMenu(0, 0, 0, b.getString(paramInt));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return addSubMenu(paramInt1, paramInt2, paramInt3, b.getString(paramInt4));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    paramCharSequence = a(paramInt1, paramInt2, paramInt3, paramCharSequence);
    m localm = new m(a, this, paramCharSequence);
    o = localm;
    localm.setHeaderTitle(e);
    return localm;
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return addSubMenu(0, 0, 0, paramCharSequence);
  }
  
  public final void b(j paramj, Context paramContext)
  {
    v.add(new WeakReference(paramj));
    paramj.f(paramContext, this);
    k = true;
  }
  
  public final void c(boolean paramBoolean)
  {
    if (t) {
      return;
    }
    t = true;
    Iterator localIterator = v.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      j localj = (j)localWeakReference.get();
      if (localj == null) {
        v.remove(localWeakReference);
      } else {
        localj.b(this, paramBoolean);
      }
    }
    t = false;
  }
  
  public final void clear()
  {
    h localh = w;
    if (localh != null) {
      d(localh);
    }
    f.clear();
    p(true);
  }
  
  public final void clearHeader()
  {
    n = null;
    m = null;
    o = null;
    p(false);
  }
  
  public final void close()
  {
    c(true);
  }
  
  public boolean d(h paramh)
  {
    boolean bool1 = v.isEmpty();
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1) {
      if (w != paramh)
      {
        bool4 = bool2;
      }
      else
      {
        w();
        Iterator localIterator = v.iterator();
        bool4 = bool3;
        do
        {
          j localj;
          for (;;)
          {
            bool3 = bool4;
            if (!localIterator.hasNext()) {
              break label124;
            }
            WeakReference localWeakReference = (WeakReference)localIterator.next();
            localj = (j)localWeakReference.get();
            if (localj != null) {
              break;
            }
            v.remove(localWeakReference);
          }
          bool3 = localj.e(paramh);
          bool4 = bool3;
        } while (!bool3);
        label124:
        v();
        bool4 = bool3;
        if (bool3)
        {
          w = null;
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public boolean e(f paramf, MenuItem paramMenuItem)
  {
    a locala = e;
    boolean bool;
    if ((locala != null) && (locala.a(paramf, paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean f(h paramh)
  {
    boolean bool1 = v.isEmpty();
    boolean bool2 = false;
    if (bool1) {
      return false;
    }
    w();
    Iterator localIterator = v.iterator();
    do
    {
      j localj;
      for (;;)
      {
        bool1 = bool2;
        if (!localIterator.hasNext()) {
          break label96;
        }
        WeakReference localWeakReference = (WeakReference)localIterator.next();
        localj = (j)localWeakReference.get();
        if (localj != null) {
          break;
        }
        v.remove(localWeakReference);
      }
      bool1 = localj.j(paramh);
      bool2 = bool1;
    } while (!bool1);
    label96:
    v();
    if (bool1) {
      w = paramh;
    }
    return bool1;
  }
  
  public final MenuItem findItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      Object localObject = (h)f.get(i2);
      if (a == paramInt) {
        return (MenuItem)localObject;
      }
      if (((h)localObject).hasSubMenu())
      {
        localObject = o.findItem(paramInt);
        if (localObject != null) {
          return (MenuItem)localObject;
        }
      }
    }
    return null;
  }
  
  public final h g(int paramInt, KeyEvent paramKeyEvent)
  {
    ArrayList localArrayList = u;
    localArrayList.clear();
    h(localArrayList, paramInt, paramKeyEvent);
    if (localArrayList.isEmpty()) {
      return null;
    }
    int i1 = paramKeyEvent.getMetaState();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    paramKeyEvent.getKeyData(localKeyData);
    int i2 = localArrayList.size();
    if (i2 == 1) {
      return (h)localArrayList.get(0);
    }
    boolean bool = n();
    for (int i3 = 0; i3 < i2; i3++)
    {
      paramKeyEvent = (h)localArrayList.get(i3);
      int i4;
      if (bool) {
        i4 = j;
      } else {
        i4 = h;
      }
      char[] arrayOfChar = meta;
      if (((i4 == arrayOfChar[0]) && ((i1 & 0x2) == 0)) || ((i4 == arrayOfChar[2]) && ((i1 & 0x2) != 0)) || ((bool) && (i4 == 8) && (paramInt == 67))) {
        return paramKeyEvent;
      }
    }
    return null;
  }
  
  public final MenuItem getItem(int paramInt)
  {
    return (MenuItem)f.get(paramInt);
  }
  
  public final void h(ArrayList paramArrayList, int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = n();
    int i1 = paramKeyEvent.getModifiers();
    KeyCharacterMap.KeyData localKeyData = new KeyCharacterMap.KeyData();
    if ((!paramKeyEvent.getKeyData(localKeyData)) && (paramInt != 67)) {
      return;
    }
    int i2 = f.size();
    for (int i3 = 0; i3 < i2; i3++)
    {
      h localh = (h)f.get(i3);
      if (localh.hasSubMenu()) {
        o.h(paramArrayList, paramInt, paramKeyEvent);
      }
      int i4;
      if (bool) {
        i4 = j;
      } else {
        i4 = h;
      }
      int i5;
      if (bool) {
        i5 = k;
      } else {
        i5 = i;
      }
      if ((i1 & 0x1100F) == (i5 & 0x1100F)) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      if ((i5 != 0) && (i4 != 0))
      {
        char[] arrayOfChar = meta;
        if (((i4 == arrayOfChar[0]) || (i4 == arrayOfChar[2]) || ((bool) && (i4 == 8) && (paramInt == 67))) && (localh.isEnabled())) {
          paramArrayList.add(localh);
        }
      }
    }
  }
  
  public final boolean hasVisibleItems()
  {
    if (y) {
      return true;
    }
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (((h)f.get(i2)).isVisible()) {
        return true;
      }
    }
    return false;
  }
  
  public final void i()
  {
    ArrayList localArrayList = l();
    if (!k) {
      return;
    }
    Object localObject1 = v.iterator();
    int i1 = 0;
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      WeakReference localWeakReference = (WeakReference)((Iterator)localObject1).next();
      localObject2 = (j)localWeakReference.get();
      if (localObject2 == null) {
        v.remove(localWeakReference);
      } else {
        i1 |= ((j)localObject2).c();
      }
    }
    if (i1 != 0)
    {
      i.clear();
      j.clear();
      int i2 = localArrayList.size();
      for (i1 = 0; i1 < i2; i1++)
      {
        localObject2 = (h)localArrayList.get(i1);
        int i3;
        if ((x & 0x20) == 32) {
          i3 = 1;
        } else {
          i3 = 0;
        }
        if (i3 != 0) {
          localObject1 = i;
        } else {
          localObject1 = j;
        }
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    i.clear();
    j.clear();
    j.addAll(l());
    k = false;
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool;
    if (g(paramInt, paramKeyEvent) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String j()
  {
    return "android:menu:actionviewstates";
  }
  
  public f k()
  {
    return this;
  }
  
  public final ArrayList<h> l()
  {
    if (!h) {
      return g;
    }
    g.clear();
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      h localh = (h)f.get(i2);
      if (localh.isVisible()) {
        g.add(localh);
      }
    }
    h = false;
    k = true;
    return g;
  }
  
  public boolean m()
  {
    return x;
  }
  
  public boolean n()
  {
    return c;
  }
  
  public boolean o()
  {
    return d;
  }
  
  public final void p(boolean paramBoolean)
  {
    if (!p)
    {
      if (paramBoolean)
      {
        h = true;
        k = true;
      }
      if (!v.isEmpty())
      {
        w();
        Iterator localIterator = v.iterator();
        while (localIterator.hasNext())
        {
          WeakReference localWeakReference = (WeakReference)localIterator.next();
          j localj = (j)localWeakReference.get();
          if (localj == null) {
            v.remove(localWeakReference);
          } else {
            localj.g();
          }
        }
        v();
      }
    }
    else
    {
      q = true;
      if (paramBoolean) {
        r = true;
      }
    }
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return q(findItem(paramInt1), null, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    paramKeyEvent = g(paramInt1, paramKeyEvent);
    boolean bool;
    if (paramKeyEvent != null) {
      bool = q(paramKeyEvent, null, paramInt2);
    } else {
      bool = false;
    }
    if ((paramInt2 & 0x2) != 0) {
      c(true);
    }
    return bool;
  }
  
  public final boolean q(MenuItem paramMenuItem, j paramj, int paramInt)
  {
    paramMenuItem = (h)paramMenuItem;
    boolean bool1 = false;
    boolean bool2 = false;
    if ((paramMenuItem != null) && (paramMenuItem.isEnabled()))
    {
      Object localObject1 = p;
      if ((localObject1 == null) || (!((MenuItem.OnMenuItemClickListener)localObject1).onMenuItemClick(paramMenuItem)))
      {
        localObject1 = n;
        if (!((f)localObject1).e((f)localObject1, paramMenuItem))
        {
          localObject1 = g;
          if (localObject1 != null)
          {
            try
            {
              n.a.startActivity((Intent)localObject1);
            }
            catch (ActivityNotFoundException localActivityNotFoundException)
            {
              Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", localActivityNotFoundException);
            }
          }
          else
          {
            localObject2 = A;
            if ((localObject2 == null) || (!((b)localObject2).e())) {
              break label135;
            }
          }
        }
      }
      boolean bool3 = true;
      break label138;
      label135:
      bool3 = false;
      label138:
      Object localObject2 = A;
      int i1;
      if ((localObject2 != null) && (((b)localObject2).a())) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if (paramMenuItem.e())
      {
        bool3 |= paramMenuItem.expandActionView();
        bool2 = bool3;
        if (!bool3) {
          break label416;
        }
      }
      else if ((!paramMenuItem.hasSubMenu()) && (i1 == 0))
      {
        bool2 = bool3;
        if ((paramInt & 0x1) != 0) {
          break label416;
        }
      }
      else
      {
        if ((paramInt & 0x4) == 0) {
          c(false);
        }
        Object localObject3;
        if (!paramMenuItem.hasSubMenu())
        {
          localObject3 = new m(a, this, paramMenuItem);
          o = ((m)localObject3);
          ((m)localObject3).setHeaderTitle(e);
        }
        paramMenuItem = o;
        if (i1 != 0) {
          ((b)localObject2).f(paramMenuItem);
        }
        if (!v.isEmpty())
        {
          if (paramj != null) {
            bool2 = paramj.i(paramMenuItem);
          }
          paramj = v.iterator();
          for (;;)
          {
            bool1 = bool2;
            if (!paramj.hasNext()) {
              break;
            }
            localObject3 = (WeakReference)paramj.next();
            localObject2 = (j)((Reference)localObject3).get();
            if (localObject2 == null) {
              v.remove(localObject3);
            } else if (!bool2) {
              bool2 = ((j)localObject2).i(paramMenuItem);
            }
          }
        }
        bool3 |= bool1;
        bool2 = bool3;
        if (bool3) {
          break label416;
        }
      }
      c(true);
      bool2 = bool3;
      label416:
      return bool2;
    }
    return false;
  }
  
  public final void r(j paramj)
  {
    Iterator localIterator = v.iterator();
    while (localIterator.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)localIterator.next();
      j localj = (j)localWeakReference.get();
      if ((localj == null) || (localj == paramj)) {
        v.remove(localWeakReference);
      }
    }
  }
  
  public final void removeGroup(int paramInt)
  {
    int i1 = size();
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++) {
      if (f.get(i3)).b == paramInt) {
        break label47;
      }
    }
    i3 = -1;
    label47:
    if (i3 >= 0)
    {
      i1 = f.size();
      while ((i2 < i1 - i3) && (f.get(i3)).b == paramInt))
      {
        if ((i3 >= 0) && (i3 < f.size())) {
          f.remove(i3);
        }
        i2++;
      }
      p(true);
    }
  }
  
  public final void removeItem(int paramInt)
  {
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++) {
      if (f.get(i2)).a == paramInt) {
        break label41;
      }
    }
    i2 = -1;
    label41:
    if ((i2 >= 0) && (i2 < f.size()))
    {
      f.remove(i2);
      p(true);
    }
  }
  
  public final void s(Bundle paramBundle)
  {
    if (paramBundle == null) {
      return;
    }
    SparseArray localSparseArray = paramBundle.getSparseParcelableArray(j());
    int i1 = size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = localMenuItem.getActionView();
      if ((localView != null) && (localView.getId() != -1)) {
        localView.restoreHierarchyState(localSparseArray);
      }
      if (localMenuItem.hasSubMenu()) {
        ((m)localMenuItem.getSubMenu()).s(paramBundle);
      }
    }
    i2 = paramBundle.getInt("android:menu:expandedactionview");
    if (i2 > 0)
    {
      paramBundle = findItem(i2);
      if (paramBundle != null) {
        paramBundle.expandActionView();
      }
    }
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      h localh = (h)f.get(i2);
      if (b == paramInt)
      {
        int i3 = x;
        int i4;
        if (paramBoolean2) {
          i4 = 4;
        } else {
          i4 = 0;
        }
        x = (i3 & 0xFFFFFFFB | i4);
        localh.setCheckable(paramBoolean1);
      }
    }
  }
  
  public void setGroupDividerEnabled(boolean paramBoolean)
  {
    x = paramBoolean;
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    int i1 = f.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      h localh = (h)f.get(i2);
      if (b == paramInt) {
        localh.setEnabled(paramBoolean);
      }
    }
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    int i1 = f.size();
    int i2 = 0;
    int i4;
    for (int i3 = i2; i2 < i1; i3 = i4)
    {
      h localh = (h)f.get(i2);
      i4 = i3;
      if (b == paramInt)
      {
        int i5 = x;
        if (paramBoolean) {
          i4 = 0;
        } else {
          i4 = 8;
        }
        i4 = i5 & 0xFFFFFFF7 | i4;
        x = i4;
        if (i5 != i4) {
          i5 = 1;
        } else {
          i5 = 0;
        }
        i4 = i3;
        if (i5 != 0) {
          i4 = 1;
        }
      }
      i2++;
    }
    if (i3 != 0) {
      p(true);
    }
  }
  
  public void setQwertyMode(boolean paramBoolean)
  {
    c = paramBoolean;
    p(false);
  }
  
  public final int size()
  {
    return f.size();
  }
  
  public final void t(Bundle paramBundle)
  {
    int i1 = size();
    Object localObject1 = null;
    int i2 = 0;
    while (i2 < i1)
    {
      MenuItem localMenuItem = getItem(i2);
      View localView = localMenuItem.getActionView();
      Object localObject2 = localObject1;
      if (localView != null)
      {
        localObject2 = localObject1;
        if (localView.getId() != -1)
        {
          Object localObject3 = localObject1;
          if (localObject1 == null) {
            localObject3 = new SparseArray();
          }
          localView.saveHierarchyState((SparseArray)localObject3);
          localObject2 = localObject3;
          if (localMenuItem.isActionViewExpanded())
          {
            paramBundle.putInt("android:menu:expandedactionview", localMenuItem.getItemId());
            localObject2 = localObject3;
          }
        }
      }
      if (localMenuItem.hasSubMenu()) {
        ((m)localMenuItem.getSubMenu()).t(paramBundle);
      }
      i2++;
      localObject1 = localObject2;
    }
    if (localObject1 != null) {
      paramBundle.putSparseParcelableArray(j(), (SparseArray)localObject1);
    }
  }
  
  public final void u(int paramInt1, CharSequence paramCharSequence, int paramInt2, Drawable paramDrawable, View paramView)
  {
    Resources localResources = b;
    if (paramView != null)
    {
      o = paramView;
      m = null;
      n = null;
    }
    else
    {
      if (paramInt1 > 0) {
        m = localResources.getText(paramInt1);
      } else if (paramCharSequence != null) {
        m = paramCharSequence;
      }
      if (paramInt2 > 0) {
        n = v.a.getDrawable(a, paramInt2);
      } else if (paramDrawable != null) {
        n = paramDrawable;
      }
      o = null;
    }
    p(false);
  }
  
  public final void v()
  {
    p = false;
    if (q)
    {
      q = false;
      p(r);
    }
  }
  
  public final void w()
  {
    if (!p)
    {
      p = true;
      q = false;
      r = false;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean a(f paramf, MenuItem paramMenuItem);
    
    public abstract void b(f paramf);
  }
  
  public static abstract interface b
  {
    public abstract boolean a(h paramh);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */