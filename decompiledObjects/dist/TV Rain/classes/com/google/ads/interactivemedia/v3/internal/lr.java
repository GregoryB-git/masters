package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

class lr
  extends cr
{
  private final int b;
  private final ob c;
  private final boolean d;
  private final int e;
  private final int f;
  private final int[] g;
  private final int[] h;
  private final cr[] i;
  private final Object[] j;
  private final HashMap<Object, Integer> k;
  
  public lr(Collection<mf> paramCollection, ob paramob, boolean paramBoolean)
  {
    this(paramBoolean, paramob);
    int m = paramCollection.size();
    g = new int[m];
    h = new int[m];
    i = new cr[m];
    j = new Object[m];
    k = new HashMap();
    paramob = paramCollection.iterator();
    int n = 0;
    m = 0;
    for (int i1 = m; paramob.hasNext(); i1++)
    {
      Object localObject = (mf)paramob.next();
      i[i1] = a.f();
      h[i1] = n;
      g[i1] = m;
      n += i[i1].b();
      m += i[i1].c();
      paramCollection = j;
      localObject = b;
      paramCollection[i1] = localObject;
      k.put(localObject, Integer.valueOf(i1));
    }
    e = n;
    f = m;
  }
  
  public lr(boolean paramBoolean, ob paramob)
  {
    d = paramBoolean;
    c = paramob;
    b = paramob.a();
  }
  
  private final int a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      return c.a(paramInt);
    }
    if (paramInt < b - 1) {
      return paramInt + 1;
    }
    return -1;
  }
  
  public static Object a(Object paramObject1, Object paramObject2)
  {
    return Pair.create(paramObject1, paramObject2);
  }
  
  public static Object b(Object paramObject)
  {
    return first;
  }
  
  public static Object c(Object paramObject)
  {
    return second;
  }
  
  public final int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = d;
    int m = 0;
    int n = paramInt2;
    if (bool)
    {
      n = paramInt2;
      if (paramInt2 == 1) {
        n = 2;
      }
      paramBoolean = false;
    }
    int i1 = c(paramInt1);
    int i2 = f(i1);
    cr localcr = d(i1);
    if (n == 2) {
      paramInt2 = m;
    } else {
      paramInt2 = n;
    }
    paramInt1 = localcr.a(paramInt1 - i2, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return i2 + paramInt1;
    }
    for (paramInt1 = a(i1, paramBoolean); (paramInt1 != -1) && (d(paramInt1).a()); paramInt1 = a(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1)
    {
      paramInt2 = f(paramInt1);
      return d(paramInt1).b(paramBoolean) + paramInt2;
    }
    if (n == 2) {
      return b(paramBoolean);
    }
    return -1;
  }
  
  public final int a(Object paramObject)
  {
    if (!(paramObject instanceof Pair)) {
      return -1;
    }
    Object localObject = (Pair)paramObject;
    paramObject = first;
    localObject = second;
    int m = d(paramObject);
    if (m == -1) {
      return -1;
    }
    int n = d(m).a(localObject);
    if (n == -1) {
      return -1;
    }
    return e(m) + n;
  }
  
  public final int a(boolean paramBoolean)
  {
    int m = b;
    if (m == 0) {
      return -1;
    }
    if (d) {
      paramBoolean = false;
    }
    int n;
    if (paramBoolean) {
      n = c.b();
    } else {
      n = m - 1;
    }
    while (d(n).a())
    {
      if (paramBoolean) {
        m = c.b(n);
      } else if (n > 0) {
        m = n - 1;
      } else {
        m = -1;
      }
      n = m;
      if (m == -1) {
        return -1;
      }
    }
    m = f(n);
    return d(n).a(paramBoolean) + m;
  }
  
  public final ct a(int paramInt, ct paramct, boolean paramBoolean)
  {
    int m = b(paramInt);
    int n = f(m);
    int i1 = e(m);
    d(m).a(paramInt - i1, paramct, paramBoolean);
    b += n;
    if (paramBoolean) {
      a = Pair.create(g(m), rp.a(a));
    }
    return paramct;
  }
  
  public final ct a(Object paramObject, ct paramct)
  {
    Object localObject1 = (Pair)paramObject;
    Object localObject2 = first;
    localObject1 = second;
    int m = d(localObject2);
    int n = f(m);
    d(m).a(localObject1, paramct);
    b += n;
    a = paramObject;
    return paramct;
  }
  
  public final cw a(int paramInt, cw paramcw, long paramLong)
  {
    int m = c(paramInt);
    int n = f(m);
    int i1 = e(m);
    d(m).a(paramInt - n, paramcw, paramLong);
    Object localObject = g(m);
    if (!cw.a.equals(b)) {
      localObject = Pair.create(localObject, b);
    }
    b = localObject;
    e += i1;
    f += i1;
    return paramcw;
  }
  
  public final Object a(int paramInt)
  {
    int m = b(paramInt);
    int n = e(m);
    Object localObject = d(m).a(paramInt - n);
    return Pair.create(g(m), localObject);
  }
  
  public int b()
  {
    return e;
  }
  
  public int b(int paramInt)
  {
    return wl.a(g, paramInt + 1, false, false);
  }
  
  public final int b(boolean paramBoolean)
  {
    if (b == 0) {
      return -1;
    }
    boolean bool = d;
    int m = 0;
    if (bool) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      m = c.c();
    }
    while (d(m).a())
    {
      n = a(m, paramBoolean);
      m = n;
      if (n == -1) {
        return -1;
      }
    }
    int n = f(m);
    return d(m).b(paramBoolean) + n;
  }
  
  public int c()
  {
    return f;
  }
  
  public int c(int paramInt)
  {
    return wl.a(h, paramInt + 1, false, false);
  }
  
  public int d(Object paramObject)
  {
    paramObject = (Integer)k.get(paramObject);
    if (paramObject == null) {
      return -1;
    }
    return ((Integer)paramObject).intValue();
  }
  
  public cr d(int paramInt)
  {
    return i[paramInt];
  }
  
  public int e(int paramInt)
  {
    return g[paramInt];
  }
  
  public int f(int paramInt)
  {
    return h[paramInt];
  }
  
  public Object g(int paramInt)
  {
    return j[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */