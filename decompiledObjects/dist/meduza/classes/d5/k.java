package d5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import q7.a;
import v3.i0;
import v5.e0;

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
  
  public static abstract class a
    extends k
  {
    public final long d;
    public final long e;
    public final List<k.d> f;
    public final long g;
    public final long h;
    public final long i;
    
    public a(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<k.d> paramList, long paramLong5, long paramLong6, long paramLong7)
    {
      super(paramLong1, paramLong2);
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
  
  public static final class b
    extends k.a
  {
    public final List<i> j;
    
    public b(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, List<k.d> paramList, long paramLong5, List<i> paramList1, long paramLong6, long paramLong7)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong4, paramList, paramLong5, paramLong6, paramLong7);
      j = paramList1;
    }
    
    public final long d(long paramLong)
    {
      return j.size();
    }
    
    public final i h(long paramLong, j paramj)
    {
      return (i)j.get((int)(paramLong - d));
    }
    
    public final boolean i()
    {
      return true;
    }
  }
  
  public static final class c
    extends k.a
  {
    public final m j;
    public final m k;
    public final long l;
    
    public c(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List<k.d> paramList, long paramLong6, m paramm1, m paramm2, long paramLong7, long paramLong8)
    {
      super(paramLong1, paramLong2, paramLong3, paramLong5, paramList, paramLong6, paramLong7, paramLong8);
      j = paramm1;
      k = paramm2;
      l = paramLong4;
    }
    
    public final i a(j paramj)
    {
      m localm = j;
      if (localm != null)
      {
        paramj = a;
        return new i(0L, -1L, localm.a(a, 0L, 0L, p));
      }
      return a;
    }
    
    public final long d(long paramLong)
    {
      Object localObject = f;
      if (localObject != null) {
        return ((List)localObject).size();
      }
      long l1 = l;
      if (l1 != -1L) {
        return l1 - d + 1L;
      }
      if (paramLong != -9223372036854775807L)
      {
        localObject = BigInteger.valueOf(paramLong).multiply(BigInteger.valueOf(b));
        BigInteger localBigInteger = BigInteger.valueOf(e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode localRoundingMode = RoundingMode.CEILING;
        int i = a.a;
        return new BigDecimal((BigInteger)localObject).divide(new BigDecimal(localBigInteger), 0, localRoundingMode).toBigIntegerExact().longValue();
      }
      return -1L;
    }
    
    public final i h(long paramLong, j paramj)
    {
      Object localObject = f;
      long l1;
      if (localObject != null) {
        l1 = getd))).a;
      } else {
        l1 = (paramLong - d) * e;
      }
      localObject = k;
      paramj = a;
      return new i(0L, -1L, ((m)localObject).a(a, paramLong, l1, p));
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
    
    public final boolean equals(Object paramObject)
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
    
    public final int hashCode()
    {
      return (int)a * 31 + (int)b;
    }
  }
  
  public static final class e
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
  }
}

/* Location:
 * Qualified Name:     d5.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */