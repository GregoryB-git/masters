package h9;

import java.math.RoundingMode;

public final class e
{
  public static int a(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    if (paramInt2 != 0)
    {
      int i = paramInt1 / paramInt2;
      int j = paramInt1 - paramInt2 * i;
      if (j == 0) {
        return i;
      }
      int k = 1;
      int m = (paramInt1 ^ paramInt2) >> 31 | 0x1;
      paramInt1 = k;
      switch (a.a[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        paramInt1 = Math.abs(j);
        paramInt1 -= Math.abs(paramInt2) - paramInt1;
        if (paramInt1 == 0)
        {
          paramInt1 = k;
          if (paramRoundingMode == RoundingMode.HALF_UP) {
            break label202;
          }
          if (paramRoundingMode == RoundingMode.HALF_EVEN) {
            paramInt1 = 1;
          } else {
            paramInt1 = 0;
          }
          if ((i & 0x1) != 0) {
            paramInt2 = 1;
          } else {
            paramInt2 = 0;
          }
          if ((paramInt1 & paramInt2) != 0)
          {
            paramInt1 = k;
            break label202;
          }
        }
        else if (paramInt1 > 0)
        {
          paramInt1 = k;
        }
        break;
      case 5: 
        if (m < 0) {
          paramInt1 = k;
        }
        break;
      case 4: 
        if (m > 0) {
          paramInt1 = k;
        }
        break;
      case 1: 
      case 2: 
        paramInt1 = 0;
      }
      label202:
      paramInt2 = i;
      if (paramInt1 != 0) {
        paramInt2 = i + m;
      }
      return paramInt2;
    }
    throw new ArithmeticException("/ by zero");
  }
}

/* Location:
 * Qualified Name:     h9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */