package o0;

import g0.M;
import java.util.List;

public abstract class k$a
  extends k
{
  public final long d;
  public final long e;
  public final List f;
  public final long g;
  public final long h;
  public final long i;
  
  public k$a(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList, long paramLong5, long paramLong6, long paramLong7)
  {
    super(parami, paramLong1, paramLong2);
    d = paramLong3;
    e = paramLong4;
    f = paramList;
    i = paramLong5;
    g = paramLong6;
    h = paramLong7;
  }
  
  public long c(long paramLong1, long paramLong2)
  {
    long l = g(paramLong1);
    if (l != -1L) {
      return l;
    }
    return (int)(i(paramLong2 - h + i, paramLong1) - d(paramLong1, paramLong2));
  }
  
  public long d(long paramLong1, long paramLong2)
  {
    if (g(paramLong1) == -1L)
    {
      long l = g;
      if (l != -9223372036854775807L)
      {
        paramLong1 = i(paramLong2 - h - l, paramLong1);
        return Math.max(e(), paramLong1);
      }
    }
    return e();
  }
  
  public long e()
  {
    return d;
  }
  
  public long f(long paramLong1, long paramLong2)
  {
    if (f != null) {
      return -9223372036854775807L;
    }
    paramLong2 = d(paramLong1, paramLong2) + c(paramLong1, paramLong2);
    return j(paramLong2) + h(paramLong2, paramLong1) - i;
  }
  
  public abstract long g(long paramLong);
  
  public final long h(long paramLong1, long paramLong2)
  {
    List localList = f;
    if (localList != null) {
      return getd))).b * 1000000L / b;
    }
    long l = g(paramLong2);
    if ((l != -1L) && (paramLong1 == e() + l - 1L)) {
      paramLong1 = paramLong2 - j(paramLong1);
    } else {
      paramLong1 = e * 1000000L / b;
    }
    return paramLong1;
  }
  
  public long i(long paramLong1, long paramLong2)
  {
    long l1 = e();
    paramLong2 = g(paramLong2);
    if (paramLong2 == 0L) {
      return l1;
    }
    if (f == null)
    {
      l2 = e * 1000000L / b;
      paramLong1 = d + paramLong1 / l2;
      if (paramLong1 < l1) {
        paramLong1 = l1;
      } else if (paramLong2 != -1L) {
        paramLong1 = Math.min(paramLong1, l1 + paramLong2 - 1L);
      }
      return paramLong1;
    }
    paramLong2 = paramLong2 + l1 - 1L;
    long l2 = l1;
    while (l2 <= paramLong2)
    {
      long l3 = (paramLong2 - l2) / 2L + l2;
      boolean bool = j(l3) < paramLong1;
      if (bool) {
        l2 = l3 + 1L;
      } else if (bool) {
        paramLong2 = l3 - 1L;
      } else {
        return l3;
      }
    }
    if (l2 == l1) {
      paramLong2 = l2;
    }
    return paramLong2;
  }
  
  public final long j(long paramLong)
  {
    List localList = f;
    if (localList != null) {}
    for (paramLong = getd))).a - c;; paramLong = (paramLong - d) * e) {
      break;
    }
    return M.W0(paramLong, 1000000L, b);
  }
  
  public abstract i k(j paramj, long paramLong);
  
  public boolean l()
  {
    boolean bool;
    if (f != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     o0.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */