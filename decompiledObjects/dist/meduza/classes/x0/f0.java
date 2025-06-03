package x0;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import q3.m;
import q3.n;
import qb.a;
import r3.d;

public final class f0
  implements m3.b
{
  public final Object a;
  public final Object b;
  public final Object c;
  public Object d;
  
  public final void a(i parami)
  {
    if (!((ArrayList)a).contains(parami)) {
      synchronized ((ArrayList)a)
      {
        ((ArrayList)a).add(parami);
        mAdded = true;
        return;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("Fragment already added: ");
    ((StringBuilder)???).append(parami);
    throw new IllegalStateException(((StringBuilder)???).toString());
  }
  
  public final void b()
  {
    ((HashMap)b).values().removeAll(Collections.singleton(null));
  }
  
  public final i c(String paramString)
  {
    paramString = (e0)((HashMap)b).get(paramString);
    if (paramString != null) {
      return c;
    }
    return null;
  }
  
  public final i d(String paramString)
  {
    Iterator localIterator = ((HashMap)b).values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (e0)localIterator.next();
      if (localObject != null)
      {
        localObject = c.findFragmentByWho(paramString);
        if (localObject != null) {
          return (i)localObject;
        }
      }
    }
    return null;
  }
  
  public final ArrayList e()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((HashMap)b).values().iterator();
    while (localIterator.hasNext())
    {
      e0 locale0 = (e0)localIterator.next();
      if (locale0 != null) {
        localArrayList.add(locale0);
      }
    }
    return localArrayList;
  }
  
  public final ArrayList f()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((HashMap)b).values().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (e0)localIterator.next();
      if (localObject != null) {
        localObject = c;
      } else {
        localObject = null;
      }
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
  
  public final List g()
  {
    if (((ArrayList)a).isEmpty()) {
      return Collections.emptyList();
    }
    synchronized ((ArrayList)a)
    {
      ArrayList localArrayList2 = new java/util/ArrayList;
      localArrayList2.<init>((ArrayList)a);
      return localArrayList2;
    }
  }
  
  public final Object get()
  {
    return new m((Executor)((a)a).get(), (d)((a)b).get(), (n)((a)c).get(), (s3.b)((a)d).get());
  }
  
  public final void h(e0 parame0)
  {
    i locali = c;
    String str = mWho;
    int i;
    if (((HashMap)b).get(str) != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    ((HashMap)b).put(mWho, parame0);
    if (mRetainInstanceChangedWhileDetached)
    {
      if (mRetainInstance) {
        ((b0)d).c(locali);
      } else {
        ((b0)d).g(locali);
      }
      mRetainInstanceChangedWhileDetached = false;
    }
    if (y.L(2))
    {
      parame0 = new StringBuilder();
      parame0.append("Added fragment to active set ");
      parame0.append(locali);
      Log.v("FragmentManager", parame0.toString());
    }
  }
  
  public final void i(e0 parame0)
  {
    i locali = c;
    if (mRetainInstance) {
      ((b0)d).g(locali);
    }
    if (((HashMap)b).get(mWho) != parame0) {
      return;
    }
    if ((e0)((HashMap)b).put(mWho, null) == null) {
      return;
    }
    if (y.L(2))
    {
      parame0 = new StringBuilder();
      parame0.append("Removed fragment from active set ");
      parame0.append(locali);
      Log.v("FragmentManager", parame0.toString());
    }
  }
  
  public final Bundle j(Bundle paramBundle, String paramString)
  {
    if (paramBundle != null) {}
    for (paramBundle = ((HashMap)c).put(paramString, paramBundle);; paramBundle = ((HashMap)c).remove(paramString)) {
      return (Bundle)paramBundle;
    }
  }
}

/* Location:
 * Qualified Name:     x0.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */