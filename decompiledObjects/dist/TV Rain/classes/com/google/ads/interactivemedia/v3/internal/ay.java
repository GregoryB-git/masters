package com.google.ads.interactivemedia.v3.internal;

final class ay
  implements vt
{
  private final wh a;
  private final ax b;
  private cj c;
  private vt d;
  private boolean e;
  private boolean f;
  
  public ay(ax paramax, vh paramvh)
  {
    b = paramax;
    a = new wh(paramvh);
    e = true;
  }
  
  public final long a(boolean paramBoolean)
  {
    Object localObject = c;
    int i;
    if ((localObject != null) && (!((cj)localObject).o()) && ((c.n()) || ((!paramBoolean) && (!c.i())))) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      e = true;
      if (f) {
        a.a();
      }
    }
    else
    {
      long l = d.c();
      if (e)
      {
        if (l < a.c())
        {
          a.b();
          break label193;
        }
        e = false;
        if (f) {
          a.a();
        }
      }
      a.a(l);
      localObject = d.d();
      if (!((cg)localObject).equals(a.d()))
      {
        a.a((cg)localObject);
        b.a((cg)localObject);
      }
    }
    label193:
    return c();
  }
  
  public final void a()
  {
    f = true;
    a.a();
  }
  
  public final void a(long paramLong)
  {
    a.a(paramLong);
  }
  
  public final void a(cg paramcg)
  {
    vt localvt = d;
    cg localcg = paramcg;
    if (localvt != null)
    {
      localvt.a(paramcg);
      localcg = d.d();
    }
    a.a(localcg);
  }
  
  public final void a(cj paramcj)
    throws ba
  {
    vt localvt1 = paramcj.e();
    if (localvt1 != null)
    {
      vt localvt2 = d;
      if (localvt1 != localvt2) {
        if (localvt2 == null)
        {
          d = localvt1;
          c = paramcj;
          localvt1.a(a.d());
        }
        else
        {
          throw ba.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
      }
    }
  }
  
  public final void b()
  {
    f = false;
    a.b();
  }
  
  public final void b(cj paramcj)
  {
    if (paramcj == c)
    {
      d = null;
      c = null;
      e = true;
    }
  }
  
  public final long c()
  {
    if (e) {
      return a.c();
    }
    return d.c();
  }
  
  public final cg d()
  {
    vt localvt = d;
    if (localvt != null) {
      return localvt.d();
    }
    return a.d();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */