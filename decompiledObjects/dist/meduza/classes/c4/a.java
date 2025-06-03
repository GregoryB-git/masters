package c4;

import v5.e0;
import x6.b;

public abstract class a
{
  public final a a;
  public final f b;
  public c c;
  public final int d;
  
  public a(d paramd, f paramf, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, int paramInt)
  {
    b = paramf;
    d = paramInt;
    a = new a(paramd, paramLong1, paramLong2, paramLong3, paramLong4, paramLong5);
  }
  
  public static int b(i parami, long paramLong, s params)
  {
    if (paramLong == parami.getPosition()) {
      return 0;
    }
    a = paramLong;
    return 1;
  }
  
  public final int a(i parami, s params)
  {
    long l3;
    for (;;)
    {
      c localc = c;
      b.K(localc);
      long l1 = f;
      long l2 = g;
      l3 = h;
      if (l2 - l1 <= d)
      {
        c = null;
        b.a();
        return b(parami, l1, params);
      }
      l1 = l3 - parami.getPosition();
      if ((l1 >= 0L) && (l1 <= 262144L))
      {
        parami.j((int)l1);
        i = 1;
      }
      else
      {
        i = 0;
      }
      if (i == 0) {
        return b(parami, l3, params);
      }
      parami.i();
      e locale = b.b(parami, b);
      int i = a;
      if (i == -3) {
        break;
      }
      if (i != -2)
      {
        if (i != -1)
        {
          if (i == 0)
          {
            l3 = c - parami.getPosition();
            if ((l3 >= 0L) && (l3 <= 262144L)) {
              parami.j((int)l3);
            }
            c = null;
            b.a();
            return b(parami, c, params);
          }
          throw new IllegalStateException("Invalid case");
        }
        l3 = b;
        l1 = c;
        e = l3;
        g = l1;
        h = c.a(b, d, l3, f, l1, c);
      }
      else
      {
        l3 = b;
        l1 = c;
        d = l3;
        f = l1;
        h = c.a(b, l3, e, l1, g, c);
      }
    }
    c = null;
    b.a();
    return b(parami, l3, params);
  }
  
  public final void c(long paramLong)
  {
    Object localObject = c;
    if ((localObject != null) && (a == paramLong)) {
      return;
    }
    long l = a.a.a(paramLong);
    localObject = a;
    c = new c(paramLong, l, c, d, e, f, g);
  }
  
  public static final class a
    implements t
  {
    public final a.d a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    
    public a(a.d paramd, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
    {
      a = paramd;
      b = paramLong1;
      c = 0L;
      d = paramLong2;
      e = paramLong3;
      f = paramLong4;
      g = paramLong5;
    }
    
    public final boolean e()
    {
      return true;
    }
    
    public final t.a g(long paramLong)
    {
      u localu = new u(paramLong, a.c.a(a.a(paramLong), c, d, e, f, g));
      return new t.a(localu, localu);
    }
    
    public final long h()
    {
      return b;
    }
  }
  
  public static final class b
    implements a.d
  {
    public final long a(long paramLong)
    {
      return paramLong;
    }
  }
  
  public static final class c
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
      h = a(paramLong2, paramLong3, paramLong4, paramLong5, paramLong6, paramLong7);
    }
    
    public static long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
    {
      if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
      {
        float f1 = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
        paramLong1 = ((float)(paramLong1 - paramLong2) * f1);
        return e0.j(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
      }
      return paramLong4;
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
    
    public static e a(long paramLong)
    {
      return new e(0, -9223372036854775807L, paramLong);
    }
  }
  
  public static abstract interface f
  {
    public abstract void a();
    
    public abstract a.e b(i parami, long paramLong);
  }
}

/* Location:
 * Qualified Name:     c4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */