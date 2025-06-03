package d5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import q7.a;
import v3.i0;

public final class k$c
  extends k.a
{
  public final m j;
  public final m k;
  public final long l;
  
  public k$c(i parami, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, List<k.d> paramList, long paramLong6, m paramm1, m paramm2, long paramLong7, long paramLong8)
  {
    super(parami, paramLong1, paramLong2, paramLong3, paramLong5, paramList, paramLong6, paramLong7, paramLong8);
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

/* Location:
 * Qualified Name:     d5.k.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */