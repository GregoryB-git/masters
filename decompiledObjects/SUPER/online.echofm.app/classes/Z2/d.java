package Z2;

import W2.m;
import java.math.RoundingMode;

public abstract class d
{
  public static final byte[] a = { 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0 };
  public static final int[] b = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
  public static final int[] c = { 3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE };
  public static final int[] d = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600 };
  public static int[] e = { Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33 };
  
  public static int a(int paramInt1, int paramInt2)
  {
    long l = paramInt1 + paramInt2;
    int i = (int)l;
    boolean bool;
    if (l == i) {
      bool = true;
    } else {
      bool = false;
    }
    f.b(bool, "checkedAdd", paramInt1, paramInt2);
    return i;
  }
  
  public static int b(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    m.j(paramRoundingMode);
    if (paramInt2 != 0)
    {
      int i = paramInt1 / paramInt2;
      int j = paramInt1 - paramInt2 * i;
      if (j == 0) {
        return i;
      }
      boolean bool = true;
      int k = 1;
      int m = (paramInt1 ^ paramInt2) >> 31 | 0x1;
      paramInt1 = i;
      switch (a.a[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        paramInt1 = Math.abs(j);
        paramInt2 = paramInt1 - (Math.abs(paramInt2) - paramInt1);
        if (paramInt2 == 0)
        {
          if (paramRoundingMode != RoundingMode.HALF_UP)
          {
            if (paramRoundingMode == RoundingMode.HALF_EVEN) {
              paramInt2 = 1;
            } else {
              paramInt2 = 0;
            }
            if ((i & 0x1) == 0) {
              k = 0;
            }
            paramInt1 = i;
            if ((paramInt2 & k) == 0) {
              break label224;
            }
          }
        }
        else
        {
          paramInt1 = i;
          if (paramInt2 <= 0) {
            break label224;
          }
        }
        break;
      case 5: 
        paramInt1 = i;
        if (m <= 0) {}
        break;
      case 3: 
        paramInt1 = i;
        if (m >= 0) {}
        break;
      case 4: 
        paramInt1 = i + m;
        break;
      case 1: 
        if (j != 0) {
          bool = false;
        }
        f.e(bool);
        paramInt1 = i;
      }
      label224:
      return paramInt1;
    }
    throw new ArithmeticException("/ by zero");
  }
  
  public static int c(int paramInt1, int paramInt2)
  {
    return a3.f.m(paramInt1 * paramInt2);
  }
}

/* Location:
 * Qualified Name:     Z2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */