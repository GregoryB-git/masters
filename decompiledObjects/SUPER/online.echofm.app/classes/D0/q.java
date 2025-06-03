package D0;

import android.content.Context;
import android.view.Surface;
import g0.M;
import g0.c;

public final class q
{
  public final b a;
  public final s b;
  public final long c;
  public boolean d;
  public int e;
  public long f;
  public long g;
  public long h;
  public long i;
  public boolean j;
  public float k;
  public c l;
  
  public q(Context paramContext, b paramb, long paramLong)
  {
    a = paramb;
    c = paramLong;
    b = new s(paramContext);
    e = 0;
    f = -9223372036854775807L;
    h = -9223372036854775807L;
    i = -9223372036854775807L;
    k = 1.0F;
    l = c.a;
  }
  
  public void a()
  {
    if (e == 0) {
      e = 1;
    }
  }
  
  public final long b(long paramLong1, long paramLong2, long paramLong3)
  {
    paramLong3 = ((paramLong3 - paramLong1) / k);
    paramLong1 = paramLong3;
    if (d) {
      paramLong1 = paramLong3 - (M.J0(l.b()) - paramLong2);
    }
    return paramLong1;
  }
  
  public int c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, boolean paramBoolean, a parama)
  {
    a.a(parama);
    if (f == -9223372036854775807L) {
      f = paramLong2;
    }
    if (h != paramLong1)
    {
      b.h(paramLong1);
      h = paramLong1;
    }
    a.c(parama, b(paramLong2, paramLong3, paramLong1));
    boolean bool1 = s(paramLong2, a.b(parama), paramLong4);
    boolean bool2 = false;
    if (bool1) {
      return 0;
    }
    if ((d) && (paramLong2 != f))
    {
      paramLong1 = l.c();
      a.e(parama, b.b(a.b(parama) * 1000L + paramLong1));
      a.c(parama, (a.d(parama) - paramLong1) / 1000L);
      bool1 = bool2;
      if (i != -9223372036854775807L)
      {
        bool1 = bool2;
        if (!j) {
          bool1 = true;
        }
      }
      if (a.n(a.b(parama), paramLong2, paramLong3, paramBoolean, bool1)) {
        return 4;
      }
      if (a.m(a.b(parama), paramLong3, paramBoolean))
      {
        int m;
        if (bool1) {
          m = 3;
        } else {
          m = 2;
        }
        return m;
      }
      if (a.b(parama) > 50000L) {
        return 5;
      }
      return 1;
    }
    return 5;
  }
  
  public boolean d(boolean paramBoolean)
  {
    if ((paramBoolean) && (e == 3))
    {
      i = -9223372036854775807L;
      return true;
    }
    if (i == -9223372036854775807L) {
      return false;
    }
    if (l.b() < i) {
      return true;
    }
    i = -9223372036854775807L;
    return false;
  }
  
  public void e(boolean paramBoolean)
  {
    j = paramBoolean;
    long l1;
    if (c > 0L) {
      l1 = l.b() + c;
    } else {
      l1 = -9223372036854775807L;
    }
    i = l1;
  }
  
  public final void f(int paramInt)
  {
    e = Math.min(e, paramInt);
  }
  
  public void g()
  {
    f(0);
  }
  
  public void h(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public boolean i()
  {
    boolean bool;
    if (e != 3) {
      bool = true;
    } else {
      bool = false;
    }
    e = 3;
    g = M.J0(l.b());
    return bool;
  }
  
  public void j()
  {
    f(2);
  }
  
  public void k()
  {
    d = true;
    g = M.J0(l.b());
    b.k();
  }
  
  public void l()
  {
    d = false;
    i = -9223372036854775807L;
    b.l();
  }
  
  public void m()
  {
    b.j();
    h = -9223372036854775807L;
    f = -9223372036854775807L;
    f(1);
    i = -9223372036854775807L;
  }
  
  public void n(int paramInt)
  {
    b.o(paramInt);
  }
  
  public void o(c paramc)
  {
    l = paramc;
  }
  
  public void p(float paramFloat)
  {
    b.g(paramFloat);
  }
  
  public void q(Surface paramSurface)
  {
    b.m(paramSurface);
    f(1);
  }
  
  public void r(float paramFloat)
  {
    if (paramFloat == k) {
      return;
    }
    k = paramFloat;
    b.i(paramFloat);
  }
  
  public final boolean s(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = i;
    boolean bool1 = false;
    boolean bool2 = false;
    if ((l1 != -9223372036854775807L) && (!j)) {
      return false;
    }
    int m = e;
    if (m != 0)
    {
      if (m != 1)
      {
        if (m != 2)
        {
          if (m == 3)
          {
            paramLong3 = M.J0(l.b());
            paramLong1 = g;
            bool1 = bool2;
            if (d)
            {
              bool1 = bool2;
              if (a.y(paramLong2, paramLong3 - paramLong1)) {
                bool1 = true;
              }
            }
            return bool1;
          }
          throw new IllegalStateException();
        }
        if (paramLong1 >= paramLong3) {
          bool1 = true;
        }
        return bool1;
      }
      return true;
    }
    return d;
  }
  
  public static class a
  {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    
    public long f()
    {
      return a;
    }
    
    public long g()
    {
      return b;
    }
    
    public final void h()
    {
      a = -9223372036854775807L;
      b = -9223372036854775807L;
    }
  }
  
  public static abstract interface b
  {
    public abstract boolean m(long paramLong1, long paramLong2, boolean paramBoolean);
    
    public abstract boolean n(long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2);
    
    public abstract boolean y(long paramLong1, long paramLong2);
  }
}

/* Location:
 * Qualified Name:     D0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */