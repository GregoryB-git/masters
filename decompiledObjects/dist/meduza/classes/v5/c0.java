package v5;

public final class c0
{
  public long a;
  public long b;
  public long c;
  public final ThreadLocal<Long> d = new ThreadLocal();
  
  public c0(long paramLong)
  {
    d(paramLong);
  }
  
  public final long a(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    try
    {
      if (b == -9223372036854775807L)
      {
        long l1 = a;
        l2 = l1;
        if (l1 == 9223372036854775806L)
        {
          Long localLong = (Long)d.get();
          localLong.getClass();
          l2 = localLong.longValue();
        }
        b = (l2 - paramLong);
        notifyAll();
      }
      c = paramLong;
      long l2 = b;
      return paramLong + l2;
    }
    finally {}
  }
  
  public final long b(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    try
    {
      long l1 = c;
      long l2 = paramLong;
      if (l1 != -9223372036854775807L)
      {
        long l3 = l1 * 90000L / 1000000L;
        l2 = (4294967296L + l3) / 8589934592L;
        l1 = (l2 - 1L) * 8589934592L + paramLong;
        paramLong += l2 * 8589934592L;
        l2 = paramLong;
        if (Math.abs(l1 - l3) < Math.abs(paramLong - l3)) {
          l2 = l1;
        }
      }
      paramLong = a(l2 * 1000000L / 90000L);
      return paramLong;
    }
    finally {}
  }
  
  public final long c()
  {
    try
    {
      long l1 = a;
      long l2;
      if (l1 != Long.MAX_VALUE)
      {
        l2 = l1;
        if (l1 != 9223372036854775806L) {}
      }
      else
      {
        l2 = -9223372036854775807L;
      }
      return l2;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(long paramLong)
  {
    try
    {
      a = paramLong;
      if (paramLong == Long.MAX_VALUE) {
        paramLong = 0L;
      } else {
        paramLong = -9223372036854775807L;
      }
      b = paramLong;
      c = -9223372036854775807L;
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     v5.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */