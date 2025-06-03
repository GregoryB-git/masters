package D0;

import d0.P;
import g0.D;
import g0.a;

public final class t
{
  public final a a;
  public final q b;
  public final q.a c;
  public final D d;
  public final D e;
  public final g0.q f;
  public P g;
  public P h;
  public long i;
  public long j;
  
  public t(a parama, q paramq)
  {
    a = parama;
    b = paramq;
    c = new q.a();
    d = new D();
    e = new D();
    f = new g0.q();
    h = P.e;
    j = -9223372036854775807L;
  }
  
  public static Object c(D paramD)
  {
    boolean bool;
    if (paramD.k() > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    while (paramD.k() > 1) {
      paramD.h();
    }
    return a.e(paramD.h());
  }
  
  public final void a()
  {
    a.h(Long.valueOf(f.d()));
    a.d();
  }
  
  public void b()
  {
    f.a();
    j = -9223372036854775807L;
    if (e.k() > 0)
    {
      Long localLong = (Long)c(e);
      localLong.longValue();
      e.a(0L, localLong);
    }
    if (g == null)
    {
      if (d.k() > 0) {
        g = ((P)c(d));
      }
    }
    else {
      d.c();
    }
  }
  
  public boolean d(long paramLong)
  {
    long l = j;
    boolean bool;
    if ((l != -9223372036854775807L) && (l >= paramLong)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e()
  {
    return b.d(true);
  }
  
  public final boolean f(long paramLong)
  {
    Long localLong = (Long)e.i(paramLong);
    if ((localLong != null) && (localLong.longValue() != i))
    {
      i = localLong.longValue();
      return true;
    }
    return false;
  }
  
  public final boolean g(long paramLong)
  {
    P localP = (P)d.i(paramLong);
    if (localP == null) {
      return false;
    }
    if ((!localP.equals(P.e)) && (!localP.equals(h)))
    {
      h = localP;
      return true;
    }
    return false;
  }
  
  public void h(long paramLong1, long paramLong2)
  {
    while (!f.c())
    {
      long l = f.b();
      if (f(l)) {
        b.j();
      }
      int k = b.c(l, paramLong1, paramLong2, i, false, c);
      boolean bool = true;
      if ((k != 0) && (k != 1))
      {
        if ((k != 2) && (k != 3) && (k != 4))
        {
          if (k == 5) {
            return;
          }
          throw new IllegalStateException(String.valueOf(k));
        }
        j = l;
        a();
      }
      else
      {
        j = l;
        if (k != 0) {
          bool = false;
        }
        i(bool);
      }
    }
  }
  
  public final void i(boolean paramBoolean)
  {
    long l1 = ((Long)a.h(Long.valueOf(f.d()))).longValue();
    if (g(l1)) {
      a.b(h);
    }
    if (paramBoolean) {}
    for (long l2 = -1L;; l2 = c.g()) {
      break;
    }
    a.c(l2, l1, i, b.i());
  }
  
  public void j(float paramFloat)
  {
    boolean bool;
    if (paramFloat > 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
    b.r(paramFloat);
  }
  
  public static abstract interface a
  {
    public abstract void b(P paramP);
    
    public abstract void c(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean);
    
    public abstract void d();
  }
}

/* Location:
 * Qualified Name:     D0.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */