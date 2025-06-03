package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class mn
  extends lv<Void>
{
  private final mq a;
  private final boolean b;
  private final cw c;
  private final ct d;
  private mp e;
  private mk f;
  private mu g;
  private boolean h;
  private boolean i;
  
  public mn(mq parammq, boolean paramBoolean)
  {
    a = parammq;
    b = paramBoolean;
    c = new cw();
    d = new ct();
    e = mp.b(parammq.e());
  }
  
  private final Object d(Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject.equals(mp.c)) {
      localObject = mp.a(e);
    }
    return localObject;
  }
  
  public final void a()
    throws IOException
  {}
  
  public final void a(mo parammo)
  {
    ((mk)parammo).g();
    if (parammo == f)
    {
      ((mu)rp.a(g)).b();
      g = null;
      f = null;
    }
  }
  
  public final void a(vc paramvc)
  {
    super.a(paramvc);
    if (!b)
    {
      h = true;
      a(null, a);
    }
  }
  
  public final boolean a(mt parammt)
  {
    mk localmk = f;
    return (localmk == null) || (!parammt.equals(a));
  }
  
  public final mk b(mt parammt, tk paramtk, long paramLong)
  {
    paramtk = new mk(a, parammt, paramtk, paramLong);
    if (i)
    {
      paramtk.a(parammt.a(d(a)));
    }
    else
    {
      f = paramtk;
      parammt = a(0, parammt, 0L);
      g = parammt;
      parammt.a();
      if (!h)
      {
        h = true;
        a(null, a);
      }
    }
    return paramtk;
  }
  
  public final void d()
  {
    i = false;
    h = false;
    super.d();
  }
  
  public final Object e()
  {
    return a.e();
  }
  
  public final cr f()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */