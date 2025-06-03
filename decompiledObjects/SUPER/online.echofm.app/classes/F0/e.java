package F0;

import g0.a;

public abstract class e
{
  public final a a;
  public final f b;
  public c c;
  public final int d;
  
  public e(d paramd, f paramf, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, int paramInt)
  {
    b = paramf;
    d = paramInt;
    a = new a(paramd, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5, paramLong6);
  }
  
  public c a(long paramLong)
  {
    return new c(paramLong, a.i(paramLong), a.a(a), a.b(a), a.d(a), a.e(a), a.g(a));
  }
  
  public final M b()
  {
    return a;
  }
  
  public int c(s params, L paramL)
  {
    long l3;
    for (;;)
    {
      c localc = (c)a.h(c);
      long l1 = c.b(localc);
      long l2 = c.c(localc);
      l3 = c.d(localc);
      if (l2 - l1 <= d)
      {
        e(false, l1);
        return g(params, l1, paramL);
      }
      if (!i(params, l3)) {
        return g(params, l3, paramL);
      }
      params.h();
      e locale = b.a(params, c.e(localc));
      int i = e.a(locale);
      if (i == -3) {
        break;
      }
      if (i != -2)
      {
        if (i != -1)
        {
          if (i == 0)
          {
            i(params, e.c(locale));
            e(true, e.c(locale));
            return g(params, e.c(locale), paramL);
          }
          throw new IllegalStateException("Invalid case");
        }
        c.f(localc, e.b(locale), e.c(locale));
      }
      else
      {
        c.g(localc, e.b(locale), e.c(locale));
      }
    }
    e(false, l3);
    return g(params, l3, paramL);
  }
  
  public final boolean d()
  {
    boolean bool;
    if (c != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void e(boolean paramBoolean, long paramLong)
  {
    c = null;
    b.b();
    f(paramBoolean, paramLong);
  }
  
  public void f(boolean paramBoolean, long paramLong) {}
  
  public final int g(s params, long paramLong, L paramL)
  {
    if (paramLong == params.p()) {
      return 0;
    }
    a = paramLong;
    return 1;
  }
  
  public final void h(long paramLong)
  {
    c localc = c;
    if ((localc != null) && (c.a(localc) == paramLong)) {
      return;
    }
    c = a(paramLong);
  }
  
  public final boolean i(s params, long paramLong)
  {
    paramLong -= params.p();
    if ((paramLong >= 0L) && (paramLong <= 262144L))
    {
      params.i((int)paramLong);
      return true;
    }
    return false;
  }
  
  public static class a
    implements M
  {
    public final e.d a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    
    public a(e.d paramd, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
    {
      a = paramd;
      b = paramLong1;
      c = paramLong2;
      d = paramLong3;
      e = paramLong4;
      f = paramLong5;
      g = paramLong6;
    }
    
    public boolean h()
    {
      return true;
    }
    
    public long i(long paramLong)
    {
      return a.a(paramLong);
    }
    
    public M.a j(long paramLong)
    {
      return new M.a(new N(paramLong, e.c.h(a.a(paramLong), c, d, e, f, g)));
    }
    
    public long l()
    {
      return b;
    }
  }
  
  public static final class b
    implements e.d
  {
    public long a(long paramLong)
    {
      return paramLong;
    }
  }
  
  public static class c
  {
    public final long a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    
    public c(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
    {
      a = paramLong1;
      b = paramLong2;
      d = paramLong3;
      e = paramLong4;
      f = paramLong5;
      g = paramLong6;
      c = paramLong7;
      h = h(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramLong7);
    }
    
    public static long h(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
    {
      if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
      {
        float f1 = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
        paramLong1 = ((float)(paramLong1 - paramLong2) * f1);
        return g0.M.q(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
      }
      return paramLong4;
    }
    
    public final long i()
    {
      return g;
    }
    
    public final long j()
    {
      return f;
    }
    
    public final long k()
    {
      return h;
    }
    
    public final long l()
    {
      return a;
    }
    
    public final long m()
    {
      return b;
    }
    
    public final void n()
    {
      h = h(b, d, e, f, g, c);
    }
    
    public final void o(long paramLong1, long paramLong2)
    {
      e = paramLong1;
      g = paramLong2;
      n();
    }
    
    public final void p(long paramLong1, long paramLong2)
    {
      d = paramLong1;
      f = paramLong2;
      n();
    }
  }
  
  public static abstract interface d
  {
    public abstract long a(long paramLong);
  }
  
  public static final class e
  {
    public static final e d = new e(-3, -9223372036854775807L, -1L);
    public final int a;
    public final long b;
    public final long c;
    
    public e(int paramInt, long paramLong1, long paramLong2)
    {
      a = paramInt;
      b = paramLong1;
      c = paramLong2;
    }
    
    public static e d(long paramLong1, long paramLong2)
    {
      return new e(-1, paramLong1, paramLong2);
    }
    
    public static e e(long paramLong)
    {
      return new e(0, -9223372036854775807L, paramLong);
    }
    
    public static e f(long paramLong1, long paramLong2)
    {
      return new e(-2, paramLong1, paramLong2);
    }
  }
  
  public static abstract interface f
  {
    public abstract e.e a(s params, long paramLong);
    
    public abstract void b();
  }
}

/* Location:
 * Qualified Name:     F0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */