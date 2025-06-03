package j4;

import android.util.Pair;
import c4.t.a;
import c4.u;
import v5.e0;

public final class c
  implements e
{
  public final long[] a;
  public final long[] b;
  public final long c;
  
  public c(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    if (paramLong == -9223372036854775807L) {
      paramLong = e0.I(paramArrayOfLong2[(paramArrayOfLong2.length - 1)]);
    }
    c = paramLong;
  }
  
  public static Pair b(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    int i = e0.f(paramArrayOfLong1, paramLong, true);
    long l1 = paramArrayOfLong1[i];
    long l2 = paramArrayOfLong2[i];
    i++;
    if (i == paramArrayOfLong1.length) {
      return Pair.create(Long.valueOf(l1), Long.valueOf(l2));
    }
    long l3 = paramArrayOfLong1[i];
    long l4 = paramArrayOfLong2[i];
    double d;
    if (l3 == l1) {
      d = 0.0D;
    } else {
      d = (paramLong - l1) / (l3 - l1);
    }
    return Pair.create(Long.valueOf(paramLong), Long.valueOf((d * (l4 - l2)) + l2));
  }
  
  public final long a(long paramLong)
  {
    return e0.I(((Long)ba, b, paramLong).second).longValue());
  }
  
  public final long c()
  {
    return -1L;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    paramLong = e0.R(e0.j(paramLong, 0L, c));
    Object localObject = b(b, a, paramLong);
    localObject = new u(e0.I(((Long)first).longValue()), ((Long)second).longValue());
    return new t.a((u)localObject, (u)localObject);
  }
  
  public final long h()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     j4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */