package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

final class cb
{
  private final ct a = new ct();
  private final cw b = new cw();
  private long c;
  private cr d = cr.a;
  private int e;
  private boolean f;
  private bz g;
  private bz h;
  private bz i;
  private int j;
  private Object k;
  private long l;
  
  private final cc a(bz parambz, long paramLong)
  {
    Object localObject1 = f;
    long l1 = parambz.a() + e - paramLong;
    boolean bool = f;
    long l2 = 0L;
    Object localObject2;
    if (bool)
    {
      m = d.a(a.a);
      n = d.a(m, a, b, e, f);
      if (n == -1) {
        return null;
      }
      m = d.a(n, a, true).b;
      localObject2 = a.a;
      paramLong = a.d;
      if (d.a(m, b, 0L).e == n)
      {
        localObject1 = d.a(b, a, m, -9223372036854775807L, Math.max(0L, l1));
        if (localObject1 == null) {
          return null;
        }
        localObject2 = first;
        l1 = ((Long)second).longValue();
        parambz = parambz.f();
        if ((parambz != null) && (b.equals(localObject2)))
        {
          paramLong = f.a.d;
        }
        else
        {
          paramLong = c;
          c = (1L + paramLong);
        }
        l2 = -9223372036854775807L;
        parambz = (bz)localObject2;
      }
      else
      {
        parambz = (bz)localObject2;
        l1 = 0L;
      }
      return a(a(parambz, l1, paramLong), l2, l1);
    }
    parambz = a;
    d.a(a, a);
    if (parambz.a())
    {
      int i1 = b;
      m = a.c(i1);
      if (m == -1) {
        return null;
      }
      n = a.a(i1, c);
      if (n < m)
      {
        if (!a.b(i1, n)) {
          return null;
        }
        return a(a, i1, n, c, d);
      }
      paramLong = c;
      if (paramLong == -9223372036854775807L)
      {
        localObject1 = d;
        cw localcw = b;
        localObject2 = a;
        localObject2 = ((cr)localObject1).a(localcw, (ct)localObject2, b, -9223372036854775807L, Math.max(0L, l1));
        if (localObject2 == null) {
          return null;
        }
        paramLong = ((Long)second).longValue();
      }
      return b(a, paramLong, d);
    }
    int m = a.a(d);
    if (m == -1) {
      return b(a, e, d);
    }
    int n = a.b(m);
    if (!a.b(m, n)) {
      return null;
    }
    return a(a, m, n, e, d);
  }
  
  private final cc a(mt parammt, long paramLong1, long paramLong2)
  {
    d.a(a, a);
    if (parammt.a())
    {
      if (!a.b(b, c)) {
        return null;
      }
      return a(a, b, c, paramLong1, d);
    }
    return b(a, paramLong2, d);
  }
  
  private final cc a(Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    paramObject = new mt(paramObject, paramInt1, paramInt2, paramLong2);
    long l1 = d.a(a, a).c(b, c);
    if (paramInt2 == a.b(paramInt1)) {
      paramLong2 = a.c();
    } else {
      paramLong2 = 0L;
    }
    return new cc((mt)paramObject, paramLong2, paramLong1, -9223372036854775807L, l1, false, false);
  }
  
  private final mt a(Object paramObject, long paramLong1, long paramLong2)
  {
    d.a(paramObject, a);
    int m = a.a(paramLong1);
    if (m == -1) {
      return new mt(paramObject, paramLong2, a.b(paramLong1));
    }
    return new mt(paramObject, m, a.b(m), paramLong2);
  }
  
  private static boolean a(mt parammt)
  {
    return (!parammt.a()) && (e == -1);
  }
  
  private final boolean a(mt parammt, boolean paramBoolean)
  {
    int m = d.a(a);
    int n = d.a(m, a, false).b;
    return (!d.a(n, b, 0L).d) && (d.a(m, a, b, e, f) == -1) && (paramBoolean);
  }
  
  private final cc b(Object paramObject, long paramLong1, long paramLong2)
  {
    int m = a.b(paramLong1);
    paramObject = new mt(paramObject, paramLong2, m);
    boolean bool1 = a((mt)paramObject);
    boolean bool2 = a((mt)paramObject, bool1);
    if (m != -1) {
      paramLong2 = a.a(m);
    } else {
      paramLong2 = -9223372036854775807L;
    }
    long l1;
    if ((paramLong2 != -9223372036854775807L) && (paramLong2 != Long.MIN_VALUE)) {
      l1 = paramLong2;
    } else {
      l1 = a.c;
    }
    return new cc((mt)paramObject, paramLong1, -9223372036854775807L, paramLong2, l1, bool1, bool2);
  }
  
  private final boolean g()
  {
    Object localObject = g;
    if (localObject == null) {
      return true;
    }
    int m = d.a(b);
    for (;;)
    {
      m = d.a(m, a, b, e, f);
      while ((((bz)localObject).f() != null) && (!f.f)) {
        localObject = ((bz)localObject).f();
      }
      bz localbz = ((bz)localObject).f();
      if ((m == -1) || (localbz == null) || (d.a(b) != m)) {
        break;
      }
      localObject = localbz;
    }
    boolean bool = a((bz)localObject);
    f = a(f);
    return !bool;
  }
  
  public final bz a(cm[] paramArrayOfcm, te paramte, tk paramtk, mq parammq, cc paramcc, tg paramtg)
  {
    bz localbz = i;
    long l1;
    if (localbz == null)
    {
      if (a.a())
      {
        l1 = c;
        if (l1 != -9223372036854775807L) {}
      }
      else
      {
        l1 = 0L;
      }
    }
    else {
      l1 = localbz.a() + i.f.e - b;
    }
    paramte = new bz(paramArrayOfcm, l1, paramte, paramtk, parammq, paramcc, paramtg);
    paramArrayOfcm = i;
    if (paramArrayOfcm != null)
    {
      paramArrayOfcm.a(paramte);
    }
    else
    {
      g = paramte;
      h = paramte;
    }
    k = null;
    i = paramte;
    j += 1;
    return paramte;
  }
  
  public final cc a(long paramLong, cd paramcd)
  {
    bz localbz = i;
    if (localbz == null) {
      return a(b, d, c);
    }
    return a(localbz, paramLong);
  }
  
  public final cc a(cc paramcc)
  {
    mt localmt = a;
    boolean bool1 = a(localmt);
    boolean bool2 = a(localmt, bool1);
    d.a(a.a, a);
    long l1;
    if (localmt.a()) {
      l1 = a.c(b, c);
    }
    for (;;)
    {
      break;
      long l2 = d;
      if (l2 != -9223372036854775807L)
      {
        l1 = l2;
        if (l2 != Long.MIN_VALUE) {}
      }
      else
      {
        l1 = a.c;
      }
    }
    return new cc(localmt, b, c, d, l1, bool1, bool2);
  }
  
  public final mt a(Object paramObject, long paramLong)
  {
    int m = d.a(paramObject, a).b;
    Object localObject = k;
    int n;
    long l1;
    if (localObject != null)
    {
      n = d.a(localObject);
      if ((n != -1) && (d.a(n, a, false).b == m)) {
        l1 = l;
      }
    }
    for (;;)
    {
      break;
      for (localObject = g;; localObject = ((bz)localObject).f())
      {
        if (localObject == null) {
          break label125;
        }
        if (b.equals(paramObject))
        {
          l1 = f.a.d;
          break;
        }
      }
      label125:
      for (localObject = g;; localObject = ((bz)localObject).f())
      {
        if (localObject == null) {
          break label204;
        }
        n = d.a(b);
        if ((n != -1) && (d.a(n, a, false).b == m))
        {
          l1 = f.a.d;
          break;
        }
      }
      label204:
      l1 = c;
      c = (1L + l1);
    }
    return a(paramObject, paramLong, l1);
  }
  
  public final void a(long paramLong)
  {
    bz localbz = i;
    if (localbz != null) {
      localbz.d(paramLong);
    }
  }
  
  public final void a(cr paramcr)
  {
    d = paramcr;
  }
  
  public final boolean a()
  {
    bz localbz = i;
    return (localbz == null) || ((!f.g) && (localbz.c()) && (i.f.e != -9223372036854775807L) && (j < 100));
  }
  
  public final boolean a(int paramInt)
  {
    e = paramInt;
    return g();
  }
  
  public final boolean a(long paramLong1, long paramLong2)
  {
    Object localObject1 = g;
    Object localObject2 = null;
    while (localObject1 != null)
    {
      cc localcc = f;
      int m;
      if (localObject2 == null)
      {
        localObject2 = a(localcc);
      }
      else
      {
        localObject3 = a((bz)localObject2, paramLong1);
        if (localObject3 == null) {
          return !a((bz)localObject2);
        }
        if ((b == b) && (a.equals(a))) {
          m = 1;
        } else {
          m = 0;
        }
        if (m == 0) {
          return !a((bz)localObject2);
        }
        localObject2 = localObject3;
      }
      long l1 = c;
      if (l1 == c) {
        localObject3 = localObject2;
      } else {
        localObject3 = new cc(a, b, l1, d, e, f, g);
      }
      f = ((cc)localObject3);
      l1 = e;
      long l2 = e;
      if ((l1 != -9223372036854775807L) && (l1 != l2)) {
        m = 0;
      } else {
        m = 1;
      }
      if (m == 0)
      {
        if (l2 == -9223372036854775807L) {
          paramLong1 = Long.MAX_VALUE;
        } else {
          paramLong1 = ((bz)localObject1).a(l2);
        }
        if ((localObject1 == h) && ((paramLong2 == Long.MIN_VALUE) || (paramLong2 >= paramLong1))) {
          m = 1;
        } else {
          m = 0;
        }
        return (!a((bz)localObject1)) && (m == 0);
      }
      Object localObject3 = ((bz)localObject1).f();
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    return true;
  }
  
  public final boolean a(bz parambz)
  {
    boolean bool1 = false;
    if (parambz != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    rp.c(bool2);
    i = parambz;
    boolean bool2 = bool1;
    while (parambz.f() != null)
    {
      parambz = parambz.f();
      if (parambz == h)
      {
        h = g;
        bool2 = true;
      }
      parambz.e();
      j -= 1;
    }
    i.a(null);
    return bool2;
  }
  
  public final boolean a(mo parammo)
  {
    bz localbz = i;
    return (localbz != null) && (a == parammo);
  }
  
  public final boolean a(boolean paramBoolean)
  {
    f = paramBoolean;
    return g();
  }
  
  public final bz b()
  {
    return i;
  }
  
  public final void b(boolean paramBoolean)
  {
    bz localbz = g;
    if (localbz != null)
    {
      Object localObject;
      if (paramBoolean) {
        localObject = b;
      } else {
        localObject = null;
      }
      k = localObject;
      l = f.a.d;
      a(localbz);
      localbz.e();
    }
    else if (!paramBoolean)
    {
      k = null;
    }
    g = null;
    i = null;
    h = null;
    j = 0;
  }
  
  public final bz c()
  {
    return g;
  }
  
  public final bz d()
  {
    return h;
  }
  
  public final bz e()
  {
    bz localbz = h;
    boolean bool;
    if ((localbz != null) && (localbz.f() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    localbz = h.f();
    h = localbz;
    return localbz;
  }
  
  public final bz f()
  {
    bz localbz = g;
    if (localbz == null) {
      return null;
    }
    if (localbz == h) {
      h = localbz.f();
    }
    g.e();
    int m = j - 1;
    j = m;
    if (m == 0)
    {
      i = null;
      localbz = g;
      k = b;
      l = f.a.d;
    }
    localbz = g.f();
    g = localbz;
    return localbz;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */