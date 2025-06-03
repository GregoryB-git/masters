package com.google.ads.interactivemedia.v3.internal;

public final class wh
  implements vt
{
  private final vh a;
  private boolean b;
  private long c;
  private long d;
  private cg e;
  
  public wh(vh paramvh)
  {
    a = paramvh;
    e = cg.a;
  }
  
  public final void a()
  {
    if (!b)
    {
      d = a.a();
      b = true;
    }
  }
  
  public final void a(long paramLong)
  {
    c = paramLong;
    if (b) {
      d = a.a();
    }
  }
  
  public final void a(cg paramcg)
  {
    if (b) {
      a(c());
    }
    e = paramcg;
  }
  
  public final void b()
  {
    if (b)
    {
      a(c());
      b = false;
    }
  }
  
  public final long c()
  {
    long l1 = c;
    long l2 = l1;
    if (b)
    {
      l2 = a.a() - d;
      cg localcg = e;
      if (b == 1.0F) {
        l2 = av.b(l2);
      } else {
        l2 = localcg.a(l2);
      }
      l2 = l1 + l2;
    }
    return l2;
  }
  
  public final cg d()
  {
    return e;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */