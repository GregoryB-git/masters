package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.HashMap;

final class cx
{
  private final ArrayList<cy> a = new ArrayList();
  private final HashMap<mt, cy> b = new HashMap();
  private final ct c = new ct();
  private cy d;
  private cy e;
  private cy f;
  private cr g = cr.a;
  private boolean h;
  
  private final cy a(cy paramcy, cr paramcr)
  {
    int i = paramcr.a(a.a);
    if (i == -1) {
      return paramcy;
    }
    i = ac, false).b;
    return new cy(a, paramcr, i);
  }
  
  public final cy a()
  {
    if ((!a.isEmpty()) && (!g.a()) && (!h)) {
      return (cy)a.get(0);
    }
    return null;
  }
  
  public final cy a(int paramInt)
  {
    int i = 0;
    Object localObject2;
    for (Object localObject1 = null; i < a.size(); localObject1 = localObject2)
    {
      cy localcy = (cy)a.get(i);
      int j = g.a(a.a);
      localObject2 = localObject1;
      if (j != -1)
      {
        localObject2 = localObject1;
        if (g.a(j, c, false).b == paramInt)
        {
          if (localObject1 != null) {
            return null;
          }
          localObject2 = localcy;
        }
      }
      i++;
    }
    return (cy)localObject1;
  }
  
  public final cy a(mt parammt)
  {
    return (cy)b.get(parammt);
  }
  
  public final void a(int paramInt, mt parammt)
  {
    int i;
    if (g.a(a) != -1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject = g;
    } else {
      localObject = cr.a;
    }
    Object localObject = new cy(parammt, (cr)localObject, paramInt);
    a.add(localObject);
    b.put(parammt, localObject);
    d = ((cy)a.get(0));
    if ((a.size() == 1) && (!g.a())) {
      e = d;
    }
  }
  
  public final void a(cr paramcr)
  {
    for (int i = 0; i < a.size(); i++)
    {
      localcy = a((cy)a.get(i), paramcr);
      a.set(i, localcy);
      b.put(a, localcy);
    }
    cy localcy = f;
    if (localcy != null) {
      f = a(localcy, paramcr);
    }
    g = paramcr;
    e = d;
  }
  
  public final cy b()
  {
    return e;
  }
  
  public final boolean b(mt parammt)
  {
    cy localcy = (cy)b.remove(parammt);
    if (localcy == null) {
      return false;
    }
    a.remove(localcy);
    localcy = f;
    if ((localcy != null) && (parammt.equals(a)))
    {
      if (a.isEmpty()) {
        parammt = null;
      } else {
        parammt = (cy)a.get(0);
      }
      f = parammt;
    }
    if (!a.isEmpty()) {
      d = ((cy)a.get(0));
    }
    return true;
  }
  
  public final cy c()
  {
    return f;
  }
  
  public final void c(mt parammt)
  {
    f = ((cy)b.get(parammt));
  }
  
  public final cy d()
  {
    if (a.isEmpty()) {
      return null;
    }
    ArrayList localArrayList = a;
    return (cy)localArrayList.get(localArrayList.size() - 1);
  }
  
  public final boolean e()
  {
    return h;
  }
  
  public final void f()
  {
    e = d;
  }
  
  public final void g()
  {
    h = true;
  }
  
  public final void h()
  {
    h = false;
    e = d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */