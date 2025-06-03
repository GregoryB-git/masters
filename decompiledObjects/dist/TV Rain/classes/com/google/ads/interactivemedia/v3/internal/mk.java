package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

public final class mk
  implements mo, mr
{
  public final mt a;
  private final mq b;
  private final tk c;
  private mo d;
  private mr e;
  private long f;
  private long g;
  
  public mk(mq parammq, mt parammt, tk paramtk, long paramLong)
  {
    a = parammt;
    c = paramtk;
    b = parammq;
    f = paramLong;
    g = -9223372036854775807L;
  }
  
  private final long e(long paramLong)
  {
    long l = g;
    if (l != -9223372036854775807L) {
      return l;
    }
    return paramLong;
  }
  
  public final long a(long paramLong, cn paramcn)
  {
    return ((mo)wl.a(d)).a(paramLong, paramcn);
  }
  
  public final long a(sy[] paramArrayOfsy, boolean[] paramArrayOfBoolean1, nw[] paramArrayOfnw, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    long l = g;
    if ((l != -9223372036854775807L) && (paramLong == f))
    {
      g = -9223372036854775807L;
      paramLong = l;
    }
    return ((mo)wl.a(d)).a(paramArrayOfsy, paramArrayOfBoolean1, paramArrayOfnw, paramArrayOfBoolean2, paramLong);
  }
  
  public final void a(long paramLong)
  {
    ((mo)wl.a(d)).a(paramLong);
  }
  
  public final void a(long paramLong, boolean paramBoolean)
  {
    ((mo)wl.a(d)).a(paramLong, paramBoolean);
  }
  
  public final void a(mo parammo)
  {
    ((mr)wl.a(e)).a(this);
  }
  
  public final void a(mr parammr, long paramLong)
  {
    e = parammr;
    parammr = d;
    if (parammr != null) {
      parammr.a(this, e(f));
    }
  }
  
  public final void a(mt parammt)
  {
    long l = e(f);
    parammt = b.a(parammt, c, l);
    d = parammt;
    if (e != null) {
      parammt.a(this, l);
    }
  }
  
  public final void a_()
    throws IOException
  {
    try
    {
      mo localmo = d;
      if (localmo != null)
      {
        localmo.a_();
        return;
      }
      b.a();
      return;
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
  }
  
  public final long b(long paramLong)
  {
    return ((mo)wl.a(d)).b(paramLong);
  }
  
  public final of b()
  {
    return ((mo)wl.a(d)).b();
  }
  
  public final long c()
  {
    return ((mo)wl.a(d)).c();
  }
  
  public final boolean c(long paramLong)
  {
    mo localmo = d;
    return (localmo != null) && (localmo.c(paramLong));
  }
  
  public final long d()
  {
    return ((mo)wl.a(d)).d();
  }
  
  public final void d(long paramLong)
  {
    g = paramLong;
  }
  
  public final long e()
  {
    return ((mo)wl.a(d)).e();
  }
  
  public final long f()
  {
    return f;
  }
  
  public final void g()
  {
    mo localmo = d;
    if (localmo != null) {
      b.a(localmo);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */