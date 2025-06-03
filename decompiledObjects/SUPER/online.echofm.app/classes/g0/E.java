package g0;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class E
{
  public long a;
  public long b;
  public long c;
  public final ThreadLocal d = new ThreadLocal();
  
  public E(long paramLong)
  {
    i(paramLong);
  }
  
  public static long h(long paramLong)
  {
    return paramLong * 1000000L / 90000L;
  }
  
  public static long k(long paramLong)
  {
    return paramLong * 90000L / 1000000L;
  }
  
  public static long l(long paramLong)
  {
    return k(paramLong) % 8589934592L;
  }
  
  public long a(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    try
    {
      if (g()) {
        break label80;
      }
      long l1 = a;
      l2 = l1;
      if (l1 == 9223372036854775806L) {
        l2 = ((Long)a.e((Long)d.get())).longValue();
      }
    }
    finally
    {
      break label98;
    }
    b = (l2 - paramLong);
    notifyAll();
    label80:
    c = paramLong;
    long l2 = b;
    return paramLong + l2;
    label98:
    throw ((Throwable)localObject);
  }
  
  public long b(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l2;
    try
    {
      long l1 = c;
      l2 = paramLong;
      if (l1 != -9223372036854775807L)
      {
        long l3 = k(l1);
        l2 = (4294967296L + l3) / 8589934592L;
        l1 = (l2 - 1L) * 8589934592L + paramLong;
        paramLong += l2 * 8589934592L;
        l2 = paramLong;
        if (Math.abs(l1 - l3) < Math.abs(paramLong - l3)) {
          l2 = l1;
        }
      }
    }
    finally
    {
      break label116;
    }
    paramLong = a(h(l2));
    return paramLong;
    label116:
    throw ((Throwable)localObject);
  }
  
  public long c(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    long l2;
    try
    {
      long l1 = c;
      l2 = paramLong;
      if (l1 != -9223372036854775807L)
      {
        long l3 = k(l1);
        l2 = l3 / 8589934592L;
        Long.signum(l2);
        l1 = l2 * 8589934592L + paramLong;
        l2 = paramLong + (l2 + 1L) * 8589934592L;
        if (l1 >= l3) {
          l2 = l1;
        }
      }
    }
    finally
    {
      break label105;
    }
    paramLong = a(h(l2));
    return paramLong;
    label105:
    throw ((Throwable)localObject);
  }
  
  public long d()
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
  
  public long e()
  {
    try
    {
      l = c;
      if (l != -9223372036854775807L) {
        l += b;
      }
    }
    finally
    {
      break label38;
    }
    long l = d();
    return l;
    label38:
    throw ((Throwable)localObject);
  }
  
  public long f()
  {
    try
    {
      long l = b;
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean g()
  {
    try
    {
      long l = b;
      boolean bool;
      if (l != -9223372036854775807L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void i(long paramLong)
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
  
  public void j(boolean paramBoolean, long paramLong1, long paramLong2)
  {
    try
    {
      if (a == 9223372036854775806L) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
      boolean bool = g();
      if (bool) {
        return;
      }
      if (paramBoolean) {
        d.set(Long.valueOf(paramLong1));
      }
    }
    finally
    {
      break label214;
    }
    paramLong1 = 0L;
    long l1 = paramLong2;
    Object localObject2;
    while (!g()) {
      if (paramLong2 == 0L)
      {
        wait();
      }
      else
      {
        if (l1 > 0L) {
          paramBoolean = true;
        } else {
          paramBoolean = false;
        }
        a.f(paramBoolean);
        long l2 = SystemClock.elapsedRealtime();
        wait(l1);
        paramLong1 += SystemClock.elapsedRealtime() - l2;
        if ((paramLong1 >= paramLong2) && (!g()))
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("TimestampAdjuster failed to initialize in ");
          ((StringBuilder)localObject2).append(paramLong2);
          ((StringBuilder)localObject2).append(" milliseconds");
          localObject2 = ((StringBuilder)localObject2).toString();
          TimeoutException localTimeoutException = new java/util/concurrent/TimeoutException;
          localTimeoutException.<init>((String)localObject2);
          throw localTimeoutException;
        }
        l1 = paramLong2 - paramLong1;
      }
    }
    return;
    label214:
    throw ((Throwable)localObject2);
  }
}

/* Location:
 * Qualified Name:     g0.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */