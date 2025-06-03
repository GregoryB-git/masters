package Y0;

import F0.M.a;
import F0.N;
import T0.l;
import android.util.Pair;
import g0.M;

public final class c
  implements g
{
  public final long[] a;
  public final long[] b;
  public final long c;
  
  public c(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    if (paramLong == -9223372036854775807L) {
      paramLong = M.J0(paramArrayOfLong2[(paramArrayOfLong2.length - 1)]);
    }
    c = paramLong;
  }
  
  public static c a(long paramLong1, l paraml, long paramLong2)
  {
    int i = s.length;
    int j = i + 1;
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    arrayOfLong1[0] = paramLong1;
    long l1 = 0L;
    arrayOfLong2[0] = 0L;
    j = 1;
    long l2 = paramLong1;
    paramLong1 = l1;
    while (j <= i)
    {
      int k = q;
      int[] arrayOfInt = s;
      int m = j - 1;
      l2 += k + arrayOfInt[m];
      paramLong1 += r + t[m];
      arrayOfLong1[j] = l2;
      arrayOfLong2[j] = paramLong1;
      j++;
    }
    return new c(arrayOfLong1, arrayOfLong2, paramLong2);
  }
  
  public static Pair b(long paramLong, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    int i = M.h(paramArrayOfLong1, paramLong, true, true);
    long l1 = paramArrayOfLong1[i];
    long l2 = paramArrayOfLong2[i];
    i++;
    if (i == paramArrayOfLong1.length) {
      paramArrayOfLong1 = Long.valueOf(l1);
    }
    for (paramArrayOfLong2 = Long.valueOf(l2);; paramArrayOfLong2 = Long.valueOf(l1 + l2))
    {
      return Pair.create(paramArrayOfLong1, paramArrayOfLong2);
      long l3 = paramArrayOfLong1[i];
      long l4 = paramArrayOfLong2[i];
      double d;
      if (l3 == l1) {
        d = 0.0D;
      } else {
        d = (paramLong - l1) / (l3 - l1);
      }
      l1 = (d * (l4 - l2));
      paramArrayOfLong1 = Long.valueOf(paramLong);
    }
  }
  
  public long c(long paramLong)
  {
    return M.J0(((Long)ba, b).second).longValue());
  }
  
  public long f()
  {
    return -1L;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    Pair localPair = b(M.i1(M.q(paramLong, 0L, c)), b, a);
    return new M.a(new N(M.J0(((Long)first).longValue()), ((Long)second).longValue()));
  }
  
  public int k()
  {
    return -2147483647;
  }
  
  public long l()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     Y0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */