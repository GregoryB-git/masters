package com.google.ads.interactivemedia.v3.internal;

public final class sr
  implements Comparable<sr>
{
  public final boolean a;
  private final String b;
  private final su c;
  private final boolean d;
  private final int e;
  private final int f;
  private final int g;
  private final boolean h;
  private final int i;
  private final int j;
  private final int k;
  
  public sr(bw parambw, su paramsu, int paramInt)
  {
    c = paramsu;
    b = sp.a(y);
    int m = 0;
    d = sp.a(paramInt, false);
    e = sp.a(parambw, w, false);
    paramInt = c;
    boolean bool1 = true;
    if ((paramInt & 0x1) != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    h = bool2;
    paramInt = t;
    i = paramInt;
    j = u;
    int n = e;
    k = n;
    if ((n == -1) || (n <= m))
    {
      bool2 = bool1;
      if (paramInt == -1) {
        break label146;
      }
      if (paramInt <= l)
      {
        bool2 = bool1;
        break label146;
      }
    }
    boolean bool2 = false;
    label146:
    a = bool2;
    paramsu = wl.b();
    int i1 = Integer.MAX_VALUE;
    int i2;
    for (paramInt = 0;; paramInt++)
    {
      n = m;
      i2 = i1;
      if (paramInt >= paramsu.length) {
        break;
      }
      n = sp.a(parambw, paramsu[paramInt], false);
      if (n > 0)
      {
        i2 = paramInt;
        break;
      }
    }
    f = i2;
    g = n;
  }
  
  public final int a(sr paramsr)
  {
    boolean bool1 = d;
    boolean bool2 = d;
    int m = 1;
    if (bool1 != bool2)
    {
      if (bool1) {
        return 1;
      }
      return -1;
    }
    int n = e;
    int i1 = e;
    if (n != i1) {
      return sp.a(n, i1);
    }
    bool2 = a;
    if (bool2 != a)
    {
      if (bool2) {
        return 1;
      }
      return -1;
    }
    if (c.r)
    {
      n = sp.b(k, k);
      if (n != 0)
      {
        if (n > 0) {
          return -1;
        }
        return 1;
      }
    }
    bool2 = h;
    if (bool2 != h)
    {
      if (bool2) {
        return 1;
      }
      return -1;
    }
    i1 = f;
    n = f;
    if (i1 != n) {
      return -sp.a(i1, n);
    }
    n = g;
    i1 = g;
    if (n != i1) {
      return sp.a(n, i1);
    }
    if ((!a) || (!d)) {
      m = -1;
    }
    n = i;
    i1 = i;
    if (n != i1) {
      return sp.a(n, i1) * m;
    }
    n = j;
    i1 = j;
    if (n != i1) {
      return sp.a(n, i1) * m;
    }
    if (wl.a(b, b)) {
      return sp.a(k, k) * m;
    }
    return 0;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */