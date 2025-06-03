package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ac
{
  private final HashMap<View, String> a = new HashMap();
  private final HashMap<View, ArrayList<String>> b = new HashMap();
  private final HashSet<View> c = new HashSet();
  private final HashSet<String> d = new HashSet();
  private final HashSet<String> e = new HashSet();
  private boolean f;
  
  public final String a(View paramView)
  {
    if (a.size() == 0) {
      return null;
    }
    String str = (String)a.get(paramView);
    if (str != null) {
      a.remove(paramView);
    }
    return str;
  }
  
  public final HashSet<String> a()
  {
    return d;
  }
  
  public final ArrayList<String> b(View paramView)
  {
    if (b.size() == 0) {
      return null;
    }
    ArrayList localArrayList = (ArrayList)b.get(paramView);
    if (localArrayList != null)
    {
      b.remove(paramView);
      Collections.sort(localArrayList);
    }
    return localArrayList;
  }
  
  public final HashSet<String> b()
  {
    return e;
  }
  
  public final al c(View paramView)
  {
    if (c.contains(paramView)) {
      return al.a;
    }
    if (f) {
      return al.b;
    }
    return al.c;
  }
  
  public final void c()
  {
    Object localObject1 = k.a();
    if (localObject1 != null)
    {
      Iterator localIterator1 = ((k)localObject1).c().iterator();
      while (localIterator1.hasNext())
      {
        e locale = (e)localIterator1.next();
        Object localObject2 = locale.g();
        if (locale.h())
        {
          if (localObject2 != null)
          {
            boolean bool = ((View)localObject2).hasWindowFocus();
            int i = 0;
            int j;
            Object localObject3;
            if (!bool)
            {
              j = i;
            }
            else
            {
              localObject3 = new HashSet();
              localObject1 = localObject2;
              while (localObject1 != null)
              {
                j = i;
                if (!h.d((View)localObject1)) {
                  break label149;
                }
                ((HashSet)localObject3).add(localObject1);
                localObject1 = ((View)localObject1).getParent();
                if ((localObject1 instanceof View)) {
                  localObject1 = (View)localObject1;
                } else {
                  localObject1 = null;
                }
              }
              c.addAll((Collection)localObject3);
              j = 1;
            }
            label149:
            if (j != 0)
            {
              d.add(locale.f());
              a.put(localObject2, locale.f());
              Iterator localIterator2 = locale.d().iterator();
              while (localIterator2.hasNext())
              {
                localObject3 = (View)((as)localIterator2.next()).get();
                if (localObject3 != null)
                {
                  localObject2 = (ArrayList)b.get(localObject3);
                  localObject1 = localObject2;
                  if (localObject2 == null)
                  {
                    localObject1 = new ArrayList();
                    b.put(localObject3, localObject1);
                  }
                  ((ArrayList)localObject1).add(locale.f());
                }
              }
              continue;
            }
          }
          e.add(locale.f());
        }
      }
    }
  }
  
  public final void d()
  {
    a.clear();
    b.clear();
    c.clear();
    d.clear();
    e.clear();
    f = false;
  }
  
  public final void e()
  {
    f = true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */