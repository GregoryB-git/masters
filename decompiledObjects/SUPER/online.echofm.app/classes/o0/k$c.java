package o0;

import Z2.a;
import d0.q;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

public final class k$c
  extends k.a
{
  public final n j;
  public final n k;
  public final long l;
  
  public k$c(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List paramList, long paramLong6, n paramn1, n paramn2, long paramLong7, long paramLong8)
  {
    super(parami, paramLong1, paramLong2, paramLong3, paramLong5, paramList, paramLong6, paramLong7, paramLong8);
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

/* Location:
 * Qualified Name:     o0.k.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */