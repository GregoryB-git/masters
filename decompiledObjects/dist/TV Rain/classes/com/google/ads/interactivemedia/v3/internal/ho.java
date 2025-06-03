package com.google.ads.interactivemedia.v3.internal;

final class ho
{
  public final gi a;
  public final ib b;
  public hz c;
  public hl d;
  public int e;
  public int f;
  public int g;
  public int h;
  private final vy i;
  private final vy j;
  
  public ho(gi paramgi)
  {
    a = paramgi;
    b = new ib();
    i = new vy(1);
    j = new vy();
  }
  
  private final void d()
  {
    hy localhy = e();
    if (localhy == null) {
      return;
    }
    vy localvy = b.p;
    int k = d;
    if (k != 0) {
      localvy.d(k);
    }
    if (b.c(e)) {
      localvy.d(localvy.f() * 6);
    }
  }
  
  private final hy e()
  {
    Object localObject = b;
    int k = a.a;
    localObject = n;
    if (localObject == null) {
      localObject = c.a(k);
    }
    if ((localObject != null) && (a)) {
      return (hy)localObject;
    }
    return null;
  }
  
  public final void a()
  {
    ib localib = b;
    d = 0;
    r = 0L;
    l = false;
    q = false;
    n = null;
    e = 0;
    g = 0;
    f = 0;
    h = 0;
  }
  
  public final void a(hz paramhz, hl paramhl)
  {
    c = ((hz)rp.a(paramhz));
    d = ((hl)rp.a(paramhl));
    a.a(f);
    a();
  }
  
  public final boolean b()
  {
    e += 1;
    int k = f + 1;
    f = k;
    int[] arrayOfInt = b.g;
    int m = g;
    if (k == arrayOfInt[m])
    {
      g = (m + 1);
      f = 0;
      return false;
    }
    return true;
  }
  
  public final int c()
  {
    Object localObject = e();
    if (localObject == null) {
      return 0;
    }
    int k = d;
    if (k != 0)
    {
      localObject = b.p;
    }
    else
    {
      arrayOfByte = e;
      j.a(arrayOfByte, arrayOfByte.length);
      localObject = j;
      k = arrayOfByte.length;
    }
    boolean bool = b.c(e);
    vy localvy = i;
    byte[] arrayOfByte = a;
    if (bool) {
      m = 128;
    } else {
      m = 0;
    }
    arrayOfByte[0] = ((byte)(byte)(m | k));
    localvy.c(0);
    a.a(i, 1);
    a.a((vy)localObject, k);
    if (!bool) {
      return k + 1;
    }
    localObject = b.p;
    int m = ((vy)localObject).f();
    ((vy)localObject).d(-2);
    m = m * 6 + 2;
    a.a((vy)localObject, m);
    return k + 1 + m;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ho
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */