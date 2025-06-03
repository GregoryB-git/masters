package com.google.ads.interactivemedia.v3.internal;

public class fu
  implements ge
{
  private final long a;
  private final long b;
  private final int c;
  private final long d;
  private final int e;
  private final long f;
  
  public fu(long paramLong1, long paramLong2, int paramInt1, int paramInt2)
  {
    a = paramLong1;
    b = paramLong2;
    int i = paramInt2;
    if (paramInt2 == -1) {
      i = 1;
    }
    c = i;
    e = paramInt1;
    if (paramLong1 == -1L)
    {
      d = -1L;
      f = -9223372036854775807L;
      return;
    }
    d = (paramLong1 - paramLong2);
    f = a(paramLong1, paramLong2, paramInt1);
  }
  
  private static long a(long paramLong1, long paramLong2, int paramInt)
  {
    return (Math.max(0L, paramLong1 - paramLong2) << 3) * 1000000L / paramInt;
  }
  
  public final gh a(long paramLong)
  {
    long l1 = d;
    if (l1 == -1L) {
      return new gh(new gj(0L, b));
    }
    long l2 = e * paramLong / 8000000L;
    int i = c;
    l2 = wl.a(l2 / i * i, 0L, l1 - i);
    l2 = b + l2;
    l1 = a_(l2);
    gj localgj = new gj(l1, l2);
    if (l1 < paramLong)
    {
      i = c;
      if (i + l2 < a)
      {
        paramLong = l2 + i;
        return new gh(localgj, new gj(a_(paramLong), paramLong));
      }
    }
    return new gh(localgj);
  }
  
  public final boolean a()
  {
    return d != -1L;
  }
  
  public final long a_(long paramLong)
  {
    return a(paramLong, b, e);
  }
  
  public final long b()
  {
    return f;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */