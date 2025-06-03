package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

public final class pr
{
  public final on a;
  public final qc b;
  public final pp c;
  private final long d;
  private final long e;
  
  public pr(long paramLong, int paramInt, qc paramqc, boolean paramBoolean, List<bw> paramList, gi paramgi)
  {
    this(paramLong, paramqc, paramList, 0L, paramqc.e());
  }
  
  private pr(long paramLong1, qc paramqc, on paramon, long paramLong2, pp parampp)
  {
    d = paramLong1;
    b = paramqc;
    e = paramLong2;
    a = paramon;
    c = parampp;
  }
  
  public final long a()
  {
    return c.a() + e;
  }
  
  public final long a(long paramLong)
  {
    return c.a(paramLong - e);
  }
  
  public final long a(aaa paramaaa, int paramInt, long paramLong)
  {
    if ((b() == -1) && (f != -9223372036854775807L))
    {
      long l1 = av.b(a);
      long l2 = av.b(ab);
      long l3 = av.b(f);
      return Math.max(a(), c(paramLong - l1 - l2 - l3));
    }
    return a();
  }
  
  public final pr a(long paramLong, qc paramqc)
    throws lq
  {
    pp localpp1 = b.e();
    pp localpp2 = paramqc.e();
    if (localpp1 == null) {
      return new pr(paramLong, paramqc, a, e, localpp1);
    }
    if (!localpp1.b()) {
      return new pr(paramLong, paramqc, a, e, localpp2);
    }
    int i = localpp1.c(paramLong);
    if (i == 0) {
      return new pr(paramLong, paramqc, a, e, localpp2);
    }
    long l1 = localpp1.a() + i - 1L;
    long l2 = localpp1.a(l1);
    long l3 = localpp1.b(l1, paramLong);
    long l4 = localpp2.a();
    long l5 = localpp2.a(l4);
    long l6 = e;
    boolean bool = l3 + l2 < l5;
    if (!bool) {}
    for (l5 = l1 + 1L;; l5 = localpp1.a(l5, paramLong))
    {
      break;
      if (bool) {
        break label237;
      }
    }
    return new pr(paramLong, paramqc, a, l5 - l4 + l6, localpp2);
    label237:
    throw new lq();
  }
  
  public final pr a(pp parampp)
  {
    return new pr(d, b, a, e, parampp);
  }
  
  public final int b()
  {
    return c.c(d);
  }
  
  public final long b(long paramLong)
  {
    long l = a(paramLong);
    return c.b(paramLong - e, d) + l;
  }
  
  public final long b(aaa paramaaa, int paramInt, long paramLong)
  {
    int i = b();
    if (i == -1) {}
    for (paramLong = c(paramLong - av.b(a) - av.b(ab));; paramLong = a() + i) {
      return paramLong - 1L;
    }
  }
  
  public final long c(long paramLong)
  {
    return c.a(paramLong, d) + e;
  }
  
  public final qd d(long paramLong)
  {
    return c.b(paramLong - e);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.pr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */