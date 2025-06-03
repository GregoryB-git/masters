package com.google.ads.interactivemedia.v3.internal;

final class bz
{
  public final mo a;
  public final Object b;
  public final nw[] c;
  public boolean d;
  public boolean e;
  public cc f;
  private final boolean[] g;
  private final cm[] h;
  private final te i;
  private final mq j;
  private bz k;
  private of l;
  private tg m;
  private long n;
  
  public bz(cm[] paramArrayOfcm, long paramLong, te paramte, tk paramtk, mq parammq, cc paramcc, tg paramtg)
  {
    h = paramArrayOfcm;
    n = paramLong;
    i = paramte;
    j = parammq;
    paramte = a;
    b = a;
    f = paramcc;
    l = of.a;
    m = paramtg;
    c = new nw[paramArrayOfcm.length];
    g = new boolean[paramArrayOfcm.length];
    long l1 = b;
    paramLong = d;
    paramte = parammq.a(paramte, paramtk, l1);
    paramArrayOfcm = paramte;
    if (paramLong != -9223372036854775807L)
    {
      paramArrayOfcm = paramte;
      if (paramLong != Long.MIN_VALUE) {
        paramArrayOfcm = new lt(paramte, true, 0L, paramLong);
      }
    }
    a = paramArrayOfcm;
  }
  
  private final void i()
  {
    if (!k()) {
      return;
    }
    for (int i1 = 0;; i1++)
    {
      Object localObject = m;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((tg)localObject).a(i1);
      localObject = m.c.a(i1);
      if ((bool) && (localObject != null)) {
        ((sy)localObject).d();
      }
    }
  }
  
  private final void j()
  {
    if (!k()) {
      return;
    }
    for (int i1 = 0;; i1++)
    {
      Object localObject = m;
      if (i1 >= a) {
        break;
      }
      boolean bool = ((tg)localObject).a(i1);
      localObject = m.c.a(i1);
      if ((bool) && (localObject != null)) {
        ((sy)localObject).e();
      }
    }
  }
  
  private final boolean k()
  {
    return k == null;
  }
  
  public final long a()
  {
    return n;
  }
  
  public final long a(long paramLong)
  {
    return paramLong + n;
  }
  
  public final long a(tg paramtg, long paramLong, boolean paramBoolean)
  {
    return a(paramtg, paramLong, false, new boolean[h.length]);
  }
  
  public final long a(tg paramtg, long paramLong, boolean paramBoolean, boolean[] paramArrayOfBoolean)
  {
    for (int i1 = 0;; i1++)
    {
      int i2 = a;
      int i3 = 1;
      if (i1 >= i2) {
        break;
      }
      localObject = g;
      if ((paramBoolean) || (!paramtg.a(m, i1))) {
        i3 = 0;
      }
      localObject[i1] = i3;
    }
    Object localObject = c;
    cm[] arrayOfcm;
    for (i1 = 0;; i1++)
    {
      arrayOfcm = h;
      if (i1 >= arrayOfcm.length) {
        break;
      }
      if (arrayOfcm[i1].a() == 6) {
        localObject[i1] = null;
      }
    }
    j();
    m = paramtg;
    i();
    localObject = c;
    paramLong = a.a(((td)localObject).a(), g, c, paramArrayOfBoolean, paramLong);
    paramArrayOfBoolean = c;
    for (i1 = 0;; i1++)
    {
      arrayOfcm = h;
      if (i1 >= arrayOfcm.length) {
        break;
      }
      if ((arrayOfcm[i1].a() == 6) && (m.a(i1))) {
        paramArrayOfBoolean[i1] = new mg();
      }
    }
    e = false;
    for (i1 = 0;; i1++)
    {
      paramArrayOfBoolean = c;
      if (i1 >= paramArrayOfBoolean.length) {
        break;
      }
      if (paramArrayOfBoolean[i1] != null)
      {
        rp.c(paramtg.a(i1));
        if (h[i1].a() != 6) {
          e = true;
        }
      }
      else
      {
        if (((td)localObject).a(i1) == null) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        rp.c(paramBoolean);
      }
    }
    return paramLong;
  }
  
  public final void a(float paramFloat, cr paramcr)
    throws ba
  {
    d = true;
    l = a.b();
    long l1 = a(b(paramFloat, paramcr), f.b, false);
    long l2 = n;
    paramcr = f;
    long l3 = b;
    n = (l3 - l1 + l2);
    if (l1 != l3) {
      paramcr = new cc(a, l1, c, d, e, f, g);
    }
    f = paramcr;
  }
  
  public final void a(bz parambz)
  {
    if (parambz == k) {
      return;
    }
    j();
    k = parambz;
    i();
  }
  
  public final long b()
  {
    return f.b + n;
  }
  
  public final long b(long paramLong)
  {
    return paramLong - n;
  }
  
  public final tg b(float paramFloat, cr paramcr)
    throws ba
  {
    tg localtg = i.a(h, l);
    for (paramcr : c.a()) {
      if (paramcr != null) {
        paramcr.a(paramFloat);
      }
    }
    return localtg;
  }
  
  public final void c(long paramLong)
  {
    n = 0L;
  }
  
  public final boolean c()
  {
    return (d) && ((!e) || (a.d() == Long.MIN_VALUE));
  }
  
  public final long d()
  {
    if (!d) {
      return f.b;
    }
    long l1;
    if (e) {
      l1 = a.d();
    } else {
      l1 = Long.MIN_VALUE;
    }
    if (l1 == Long.MIN_VALUE) {
      return f.e;
    }
    return l1;
  }
  
  public final void d(long paramLong)
  {
    rp.c(k());
    if (d) {
      a.a(b(paramLong));
    }
  }
  
  public final void e()
  {
    j();
    long l1 = f.d;
    mq localmq = j;
    mo localmo = a;
    if ((l1 != -9223372036854775807L) && (l1 != Long.MIN_VALUE)) {}
    try
    {
      localmq.a(a);
    }
    catch (RuntimeException localRuntimeException)
    {
      vr.b("MediaPeriodHolder", "Period release failed.", localRuntimeException);
    }
    localmq.a(localmo);
    return;
  }
  
  public final void e(long paramLong)
  {
    rp.c(k());
    paramLong = b(paramLong);
    a.c(paramLong);
  }
  
  public final bz f()
  {
    return k;
  }
  
  public final of g()
  {
    return l;
  }
  
  public final tg h()
  {
    return m;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.bz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */