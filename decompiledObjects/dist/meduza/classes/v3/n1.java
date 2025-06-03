package v3;

import v5.e0;
import x6.b;

public final class n1
{
  public static final n1 c;
  public final long a;
  public final long b;
  
  static
  {
    n1 localn1 = new n1(0L, 0L);
    new n1(Long.MAX_VALUE, Long.MAX_VALUE);
    new n1(Long.MAX_VALUE, 0L);
    new n1(0L, Long.MAX_VALUE);
    c = localn1;
  }
  
  public n1(long paramLong1, long paramLong2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramLong1 >= 0L) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramLong2 >= 0L) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    a = paramLong1;
    b = paramLong2;
  }
  
  public final long a(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = a;
    if ((l1 == 0L) && (b == 0L)) {
      return paramLong1;
    }
    long l2 = Long.MIN_VALUE;
    int i = e0.a;
    long l3 = paramLong1 - l1;
    if (((l1 ^ paramLong1) & (paramLong1 ^ l3)) < 0L) {
      l3 = l2;
    }
    long l4 = b;
    l1 = paramLong1 + l4;
    l2 = l1;
    if (((l4 ^ l1) & (paramLong1 ^ l1)) < 0L) {
      l2 = Long.MAX_VALUE;
    }
    int j = 1;
    if ((l3 <= paramLong2) && (paramLong2 <= l2)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((l3 > paramLong3) || (paramLong3 > l2)) {
      j = 0;
    }
    if ((i != 0) && (j != 0))
    {
      if (Math.abs(paramLong2 - paramLong1) <= Math.abs(paramLong3 - paramLong1)) {
        return paramLong2;
      }
      return paramLong3;
    }
    if (i != 0) {
      return paramLong2;
    }
    if (j != 0) {
      return paramLong3;
    }
    return l3;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (n1.class == paramObject.getClass()))
    {
      paramObject = (n1)paramObject;
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

/* Location:
 * Qualified Name:     v3.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */