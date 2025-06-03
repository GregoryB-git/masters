package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

final class lx
  implements mv
{
  private final Object a;
  private mu b;
  
  public lx(lv paramlv, Object paramObject)
  {
    b = paramlv.b(null);
    a = paramObject;
  }
  
  private final ng a(ng paramng)
  {
    long l1 = f;
    long l2 = g;
    if ((l1 == l1) && (l2 == l2)) {
      return paramng;
    }
    return new ng(a, b, c, d, e, l1, l2);
  }
  
  private final boolean d(int paramInt, mt parammt)
  {
    if (parammt != null)
    {
      localObject = c.a(a, parammt);
      parammt = (mt)localObject;
      if (localObject == null) {
        return false;
      }
    }
    else
    {
      parammt = null;
    }
    paramInt = c.a(a, paramInt);
    Object localObject = b;
    if ((a != paramInt) || (!wl.a(b, parammt))) {
      b = c.a(paramInt, parammt, 0L);
    }
    return true;
  }
  
  public final void a(int paramInt, mt parammt)
  {
    if ((d(paramInt, parammt)) && (c.a((mt)rp.a(b.b)))) {
      b.a();
    }
  }
  
  public final void a(int paramInt, mt parammt, ng paramng)
  {
    if (d(paramInt, parammt)) {
      b.a(a(paramng));
    }
  }
  
  public final void a(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    if (d(paramInt, parammt)) {
      b.a(paramnh, a(paramng));
    }
  }
  
  public final void a(int paramInt, mt parammt, nh paramnh, ng paramng, IOException paramIOException, boolean paramBoolean)
  {
    if (d(paramInt, parammt)) {
      b.a(paramnh, a(paramng), paramIOException, paramBoolean);
    }
  }
  
  public final void b(int paramInt, mt parammt)
  {
    if ((d(paramInt, parammt)) && (c.a((mt)rp.a(b.b)))) {
      b.b();
    }
  }
  
  public final void b(int paramInt, mt parammt, ng paramng)
  {
    if (d(paramInt, parammt)) {
      b.b(a(paramng));
    }
  }
  
  public final void b(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    if (d(paramInt, parammt)) {
      b.b(paramnh, a(paramng));
    }
  }
  
  public final void c(int paramInt, mt parammt)
  {
    if (d(paramInt, parammt)) {
      b.c();
    }
  }
  
  public final void c(int paramInt, mt parammt, nh paramnh, ng paramng)
  {
    if (d(paramInt, parammt)) {
      b.c(paramnh, a(paramng));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */