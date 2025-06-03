package com.google.ads.interactivemedia.v3.internal;

public final class fr
{
  private final long a;
  private final long b;
  private final long c;
  private long d;
  private long e;
  private long f;
  private long g;
  private long h;
  
  public fr(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6, long paramLong7)
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
  
  private final long a()
  {
    return f;
  }
  
  public static long a(long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, long paramLong6)
  {
    if ((paramLong4 + 1L < paramLong5) && (paramLong2 + 1L < paramLong3))
    {
      float f1 = (float)(paramLong5 - paramLong4) / (float)(paramLong3 - paramLong2);
      paramLong1 = ((float)(paramLong1 - paramLong2) * f1);
      return wl.a(paramLong1 + paramLong4 - paramLong6 - paramLong1 / 20L, paramLong4, paramLong5 - 1L);
    }
    return paramLong4;
  }
  
  private final void a(long paramLong1, long paramLong2)
  {
    d = paramLong1;
    f = paramLong2;
    f();
  }
  
  private final long b()
  {
    return g;
  }
  
  private final void b(long paramLong1, long paramLong2)
  {
    e = paramLong1;
    g = paramLong2;
    f();
  }
  
  private final long c()
  {
    return b;
  }
  
  private final long d()
  {
    return a;
  }
  
  private final long e()
  {
    return h;
  }
  
  private final void f()
  {
    h = a(b, d, e, f, g, c);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */