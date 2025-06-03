package k0;

import g0.M;
import g0.a;

public final class d1
{
  public static final d1 c;
  public static final d1 d;
  public static final d1 e;
  public static final d1 f;
  public static final d1 g;
  public final long a;
  public final long b;
  
  static
  {
    d1 locald1 = new d1(0L, 0L);
    c = locald1;
    d = new d1(Long.MAX_VALUE, Long.MAX_VALUE);
    e = new d1(Long.MAX_VALUE, 0L);
    f = new d1(0L, Long.MAX_VALUE);
    g = locald1;
  }
  
  public d1(long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    if (paramLong2 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    a.a(bool2);
    a = paramLong1;
    b = paramLong2;
  }
  
  public long a(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = a;
    if ((l1 == 0L) && (b == 0L)) {
      return paramLong1;
    }
    l1 = M.e1(paramLong1, l1, Long.MIN_VALUE);
    long l2 = M.b(paramLong1, b, Long.MAX_VALUE);
    int i = 0;
    int j;
    if ((l1 <= paramLong2) && (paramLong2 <= l2)) {
      j = 1;
    } else {
      j = 0;
    }
    int k = i;
    if (l1 <= paramLong3)
    {
      k = i;
      if (paramLong3 <= l2) {
        k = 1;
      }
    }
    if ((j != 0) && (k != 0))
    {
      if (Math.abs(paramLong2 - paramLong1) <= Math.abs(paramLong3 - paramLong1)) {
        return paramLong2;
      }
      return paramLong3;
    }
    if (j != 0) {
      return paramLong2;
    }
    if (k != 0) {
      return paramLong3;
    }
    return l1;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d1.class == paramObject.getClass()))
    {
      paramObject = (d1)paramObject;
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

/* Location:
 * Qualified Name:     k0.d1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */