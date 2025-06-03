package com.google.ads.interactivemedia.v3.internal;

public final class wi
{
  private long a;
  private long b;
  private volatile long c = -9223372036854775807L;
  
  public wi(long paramLong)
  {
    a(paramLong);
  }
  
  public static long d(long paramLong)
  {
    return paramLong * 1000000L / 90000L;
  }
  
  public static long e(long paramLong)
  {
    return paramLong * 90000L / 1000000L;
  }
  
  public final long a()
  {
    return a;
  }
  
  public final void a(long paramLong)
  {
    try
    {
      boolean bool;
      if (c == -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      rp.c(bool);
      a = paramLong;
      return;
    }
    finally {}
  }
  
  public final long b()
  {
    if (c != -9223372036854775807L) {
      return c + b;
    }
    long l = a;
    if (l != Long.MAX_VALUE) {
      return l;
    }
    return -9223372036854775807L;
  }
  
  public final long b(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l1 = paramLong;
    if (c != -9223372036854775807L)
    {
      long l2 = e(c);
      long l3 = (4294967296L + l2) / 8589934592L;
      l1 = (l3 - 1L) * 8589934592L + paramLong;
      paramLong = l3 * 8589934592L + paramLong;
      if (Math.abs(l1 - l2) >= Math.abs(paramLong - l2)) {
        l1 = paramLong;
      }
    }
    return c(d(l1));
  }
  
  public final long c()
  {
    if (a == Long.MAX_VALUE) {
      return 0L;
    }
    if (c == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    return b;
  }
  
  public final long c(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    if (c != -9223372036854775807L)
    {
      c = paramLong;
    }
    else
    {
      long l = a;
      if (l != Long.MAX_VALUE) {
        b = (l - paramLong);
      }
    }
    try
    {
      c = paramLong;
      notifyAll();
      return paramLong + b;
    }
    finally {}
  }
  
  public final void d()
  {
    c = -9223372036854775807L;
  }
  
  public final void e()
    throws InterruptedException
  {
    try
    {
      while (c == -9223372036854775807L) {
        wait();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */