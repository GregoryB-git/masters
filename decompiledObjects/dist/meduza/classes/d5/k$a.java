package d5;

import java.util.List;
import v5.e0;

public abstract class k$a
  extends k
{
  public final long d;
  public final long e;
  public final List<k.d> f;
  public final long g;
  public final long h;
  public final long i;
  
  public k$a(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<k.d> paramList, long paramLong5, long paramLong6, long paramLong7)
  {
    super(parami, paramLong1, paramLong2);
    d = paramLong3;
    e = paramLong4;
    f = paramList;
    i = paramLong5;
    g = paramLong6;
    h = paramLong7;
  }
  
  public final long b(long paramLong1, long paramLong2)
  {
    long l = d(paramLong1);
    if (l != -1L) {
      return l;
    }
    return (int)(f(paramLong2 - h + i, paramLong1) - c(paramLong1, paramLong2));
  }
  
  public final long c(long paramLong1, long paramLong2)
  {
    if (d(paramLong1) == -1L)
    {
      long l = g;
      if (l != -9223372036854775807L)
      {
        paramLong1 = f(paramLong2 - h - l, paramLong1);
        return Math.max(d, paramLong1);
      }
    }
    return d;
  }
  
  public abstract long d(long paramLong);
  
  public final long e(long paramLong1, long paramLong2)
  {
    List localList = f;
    if (localList != null) {
      return getd))).b * 1000000L / b;
    }
    long l = d(paramLong2);
    if ((l != -1L) && (paramLong1 == d + l - 1L)) {
      paramLong1 = paramLong2 - g(paramLong1);
    } else {
      paramLong1 = e * 1000000L / b;
    }
    return paramLong1;
  }
  
  public final long f(long paramLong1, long paramLong2)
  {
    long l1 = d;
    paramLong2 = d(paramLong2);
    if (paramLong2 == 0L) {
      return l1;
    }
    long l2;
    if (f == null)
    {
      l2 = e * 1000000L / b;
      l3 = d;
      paramLong1 = paramLong1 / l2 + l3;
      if (paramLong1 < l1) {
        paramLong1 = l1;
      } else if (paramLong2 != -1L) {
        paramLong1 = Math.min(paramLong1, l1 + paramLong2 - 1L);
      }
      return paramLong1;
    }
    long l3 = paramLong2 + l1 - 1L;
    paramLong2 = l1;
    while (paramLong2 <= l3)
    {
      l2 = (l3 - paramLong2) / 2L + paramLong2;
      boolean bool = g(l2) < paramLong1;
      if (bool) {
        paramLong2 = l2 + 1L;
      } else if (bool) {
        l3 = l2 - 1L;
      } else {
        return l2;
      }
    }
    if (paramLong2 == l1) {
      l3 = paramLong2;
    }
    return l3;
  }
  
  public final long g(long paramLong)
  {
    List localList = f;
    if (localList != null) {
      paramLong = getd))).a - c;
    } else {
      paramLong = (paramLong - d) * e;
    }
    return e0.O(paramLong, 1000000L, b);
  }
  
  public abstract i h(long paramLong, j paramj);
  
  public boolean i()
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
 * Qualified Name:     d5.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */