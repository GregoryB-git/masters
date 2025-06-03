package d0;

import g0.M;

public final class I$b
{
  public static final String h = M.w0(0);
  public static final String i = M.w0(1);
  public static final String j = M.w0(2);
  public static final String k = M.w0(3);
  public static final String l = M.w0(4);
  public Object a;
  public Object b;
  public int c;
  public long d;
  public long e;
  public boolean f;
  public a g = a.g;
  
  public int a(int paramInt)
  {
    return g.a(paramInt).b;
  }
  
  public long b(int paramInt1, int paramInt2)
  {
    a.a locala = g.a(paramInt1);
    long l1;
    if (b != -1) {
      l1 = g[paramInt2];
    } else {
      l1 = -9223372036854775807L;
    }
    return l1;
  }
  
  public int c()
  {
    return g.b;
  }
  
  public int d(long paramLong)
  {
    return g.b(paramLong, d);
  }
  
  public int e(long paramLong)
  {
    return g.c(paramLong, d);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (b.class.equals(paramObject.getClass())))
    {
      paramObject = (b)paramObject;
      if ((!M.c(a, a)) || (!M.c(b, b)) || (c != c) || (d != d) || (e != e) || (f != f) || (!M.c(g, g))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long f(int paramInt)
  {
    return g.a(paramInt).a;
  }
  
  public long g()
  {
    return g.c;
  }
  
  public int h(int paramInt1, int paramInt2)
  {
    a.a locala = g.a(paramInt1);
    if (b != -1) {
      paramInt1 = f[paramInt2];
    } else {
      paramInt1 = 0;
    }
    return paramInt1;
  }
  
  public int hashCode()
  {
    Object localObject = a;
    int m = 0;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      m = localObject.hashCode();
    }
    int i1 = c;
    long l1 = d;
    int i2 = (int)(l1 ^ l1 >>> 32);
    l1 = e;
    return ((((((217 + n) * 31 + m) * 31 + i1) * 31 + i2) * 31 + (int)(l1 ^ l1 >>> 32)) * 31 + f) * 31 + g.hashCode();
  }
  
  public long i(int paramInt)
  {
    return g.a(paramInt).h;
  }
  
  public long j()
  {
    return d;
  }
  
  public int k(int paramInt)
  {
    return g.a(paramInt).d();
  }
  
  public int l(int paramInt1, int paramInt2)
  {
    return g.a(paramInt1).e(paramInt2);
  }
  
  public long m()
  {
    return M.i1(e);
  }
  
  public long n()
  {
    return e;
  }
  
  public int o()
  {
    return g.e;
  }
  
  public boolean p(int paramInt)
  {
    return g.a(paramInt).f() ^ true;
  }
  
  public boolean q(int paramInt)
  {
    int m = c();
    boolean bool = true;
    if ((paramInt != m - 1) || (!g.d(paramInt))) {
      bool = false;
    }
    return bool;
  }
  
  public boolean r(int paramInt)
  {
    return g.a(paramInt).i;
  }
  
  public b s(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2)
  {
    return t(paramObject1, paramObject2, paramInt, paramLong1, paramLong2, a.g, false);
  }
  
  public b t(Object paramObject1, Object paramObject2, int paramInt, long paramLong1, long paramLong2, a parama, boolean paramBoolean)
  {
    a = paramObject1;
    b = paramObject2;
    c = paramInt;
    d = paramLong1;
    e = paramLong2;
    g = parama;
    f = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     d0.I.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */