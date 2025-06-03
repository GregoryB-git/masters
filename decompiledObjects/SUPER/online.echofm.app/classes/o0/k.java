package o0;

import Z2.a;
import d0.q;
import g0.M;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

public abstract class k
{
  public final i a;
  public final long b;
  public final long c;
  
  public k(i parami, long paramLong1, long paramLong2)
  {
    a = parami;
    b = paramLong1;
    c = paramLong2;
  }
  
  public i a(j paramj)
  {
    return a;
  }
  
  public long b()
  {
    return M.W0(c, 1000000L, b);
  }
  
  public static abstract class a
    extends k
  {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;
    
    public a(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList, long paramLong5, long paramLong6, long paramLong7)
    {
      super(paramLong1, paramLong2);
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
  
  public static final class b
    extends k.a
  {
    public final List j;
    
    public b(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List paramList1, long paramLong5, List paramList2, long paramLong6, long paramLong7)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong4, paramList1, paramLong5, paramLong6, paramLong7);
      j = paramList2;
    }
    
    public long g(long paramLong)
    {
      return j.size();
    }
    
    public i k(j paramj, long paramLong)
    {
      return (i)j.get((int)(paramLong - d));
    }
    
    public boolean l()
    {
      return true;
    }
  }
  
  public static final class c
    extends k.a
  {
    public final n j;
    public final n k;
    public final long l;
    
    public c(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List paramList, long paramLong6, n paramn1, n paramn2, long paramLong7, long paramLong8)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong5, paramList, paramLong6, paramLong7, paramLong8);
      j = paramn1;
      k = paramn2;
      l = paramLong4;
    }
    
    public i a(j paramj)
    {
      n localn = j;
      if (localn != null)
      {
        paramj = b;
        return new i(localn.a(a, 0L, i, 0L), 0L, -1L);
      }
      return super.a(paramj);
    }
    
    public long g(long paramLong)
    {
      List localList = f;
      if (localList != null) {
        return localList.size();
      }
      long l1 = l;
      if (l1 != -1L) {
        return l1 - d + 1L;
      }
      if (paramLong != -9223372036854775807L) {
        return a.a(BigInteger.valueOf(paramLong).multiply(BigInteger.valueOf(b)), BigInteger.valueOf(e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
      }
      return -1L;
    }
    
    public i k(j paramj, long paramLong)
    {
      Object localObject = f;
      if (localObject != null) {}
      for (long l1 = getd))).a;; l1 = (paramLong - d) * e) {
        break;
      }
      localObject = k;
      paramj = b;
      return new i(((n)localObject).a(a, paramLong, i, l1), 0L, -1L);
    }
  }
  
  public static final class d
  {
    public final long a;
    public final long b;
    
    public d(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (d.class == paramObject.getClass()))
      {
        paramObject = (d)paramObject;
        if ((a != a) || (b != b)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      return (int)a * 31 + (int)b;
    }
  }
  
  public static class e
    extends k
  {
    public final long d;
    public final long e;
    
    public e()
    {
      this(null, 1L, 0L, 0L, 0L);
    }
    
    public e(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4)
    {
      super(paramLong1, paramLong2);
      d = paramLong3;
      e = paramLong4;
    }
    
    public i c()
    {
      long l = e;
      i locali;
      if (l <= 0L) {
        locali = null;
      } else {
        locali = new i(null, d, l);
      }
      return locali;
    }
  }
}

/* Location:
 * Qualified Name:     o0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */