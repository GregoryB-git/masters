package Z2;

import W2.m;
import java.math.RoundingMode;

public abstract class e
{
  public static final byte[] a = { 19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0 };
  public static final long[] b = { 1L, 10L, 100L, 1000L, 10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L };
  public static final long[] c = { 3L, 31L, 316L, 3162L, 31622L, 316227L, 3162277L, 31622776L, 316227766L, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L };
  public static final long[] d = { 1L, 1L, 2L, 6L, 24L, 120L, 720L, 5040L, 40320L, 362880L, 3628800L, 39916800L, 479001600L, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L };
  public static final int[] e = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66 };
  public static final int[] f = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61 };
  public static final long[][] g;
  
  static
  {
    long[] arrayOfLong1 = { 885594168L, 725270293939359937L, 3569819667048198375L };
    long[] arrayOfLong2 = { 47636622961200L, 2L, 2570940L, 211991001L, 3749873356L };
    long[] arrayOfLong3 = { 7999252175582850L, 2L, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L };
    long[] arrayOfLong4 = { 585226005592931976L, 2L, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L };
    g = new long[][] { { 291830L, 126401071349994536L }, arrayOfLong1, { 273919523040L, 15L, 7363882082L, 992620450144556L }, arrayOfLong2, arrayOfLong3, arrayOfLong4, { Long.MAX_VALUE, 2L, 325L, 9375L, 28178L, 450775L, 9780504L, 1795265022L } };
  }
  
  public static long a(long paramLong1, long paramLong2)
  {
    long l = paramLong1 + paramLong2;
    int i = 0;
    int j;
    if ((paramLong1 ^ paramLong2) < 0L) {
      j = 1;
    } else {
      j = 0;
    }
    if ((paramLong1 ^ l) >= 0L) {
      i = 1;
    }
    f.c(j | i, "checkedAdd", paramLong1, paramLong2);
    return l;
  }
  
  public static long b(long paramLong1, long paramLong2, RoundingMode paramRoundingMode)
  {
    m.j(paramRoundingMode);
    long l1 = paramLong1 / paramLong2;
    long l2 = paramLong1 - paramLong2 * l1;
    boolean bool1 = l2 < 0L;
    if (!bool1) {
      return l1;
    }
    int i = (int)((paramLong1 ^ paramLong2) >> 63);
    boolean bool2 = true;
    i |= 0x1;
    paramLong1 = l1;
    switch (a.a[paramRoundingMode.ordinal()])
    {
    default: 
      throw new AssertionError();
    case 6: 
    case 7: 
    case 8: 
      paramLong1 = Math.abs(l2);
      bool1 = paramLong1 - (Math.abs(paramLong2) - paramLong1) < 0L;
      if (!bool1)
      {
        if (paramRoundingMode != RoundingMode.HALF_UP)
        {
          paramLong1 = l1;
          if (paramRoundingMode != RoundingMode.HALF_EVEN) {
            return paramLong1;
          }
          paramLong1 = l1;
          if ((1L & l1) == 0L) {
            return paramLong1;
          }
        }
      }
      else
      {
        paramLong1 = l1;
        if (!bool1) {
          return paramLong1;
        }
      }
      break;
    case 5: 
      paramLong1 = l1;
      if (i <= 0) {}
      break;
    case 3: 
      paramLong1 = l1;
      if (i >= 0) {}
      break;
    case 4: 
      paramLong1 = l1 + i;
      break;
    case 1: 
      if (bool1) {
        bool2 = false;
      }
      f.e(bool2);
      paramLong1 = l1;
    }
    return paramLong1;
  }
  
  public static long c(long paramLong1, long paramLong2)
  {
    f.d("a", paramLong1);
    f.d("b", paramLong2);
    if (paramLong1 == 0L) {
      return paramLong2;
    }
    if (paramLong2 == 0L) {
      return paramLong1;
    }
    int i = Long.numberOfTrailingZeros(paramLong1);
    long l = paramLong1 >> i;
    int j = Long.numberOfTrailingZeros(paramLong2);
    paramLong1 = paramLong2 >> j;
    for (paramLong2 = l; paramLong2 != paramLong1; paramLong2 = l >> Long.numberOfTrailingZeros(l))
    {
      l = paramLong2 - paramLong1;
      paramLong2 = l >> 63 & l;
      l = l - paramLong2 - paramLong2;
      paramLong1 += paramLong2;
    }
    return paramLong2 << Math.min(i, j);
  }
  
  public static long d(long paramLong1, long paramLong2)
  {
    int i = Long.numberOfLeadingZeros(paramLong1) + Long.numberOfLeadingZeros(paramLong1) + Long.numberOfLeadingZeros(paramLong2) + Long.numberOfLeadingZeros(paramLong2);
    if (i > 65) {
      return paramLong1 * paramLong2;
    }
    long l1 = ((paramLong1 ^ paramLong2) >>> 63) + Long.MAX_VALUE;
    int j = 0;
    if (i < 64) {
      i = 1;
    } else {
      i = 0;
    }
    boolean bool = paramLong1 < 0L;
    int k;
    if (bool) {
      k = 1;
    } else {
      k = 0;
    }
    if (paramLong2 == Long.MIN_VALUE) {
      j = 1;
    }
    if ((i | j & k) != 0) {
      return l1;
    }
    long l2 = paramLong1 * paramLong2;
    if ((bool) && (l2 / paramLong1 != paramLong2)) {
      return l1;
    }
    return l2;
  }
}

/* Location:
 * Qualified Name:     Z2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */