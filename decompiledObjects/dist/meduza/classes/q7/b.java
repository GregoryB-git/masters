package q7;

import java.math.RoundingMode;

public final class b
{
  public static int a(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    paramRoundingMode.getClass();
    if (paramInt2 != 0)
    {
      int i = paramInt1 / paramInt2;
      int j = paramInt1 - paramInt2 * i;
      if (j == 0) {
        return i;
      }
      int k = 1;
      int m = 1;
      int n = (paramInt1 ^ paramInt2) >> 31 | 0x1;
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
            break label227;
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
            break label227;
          }
        }
        else if (paramInt1 > 0)
        {
          paramInt1 = k;
        }
        break;
      case 5: 
        if (n > 0) {
          paramInt1 = k;
        }
        break;
      case 3: 
        if (n < 0) {
          paramInt1 = k;
        }
        break;
      case 1: 
        if (j == 0) {
          paramInt1 = m;
        } else {
          paramInt1 = 0;
        }
        if (paramInt1 == 0) {
          break label240;
        }
      case 2: 
        paramInt1 = 0;
      }
      label227:
      paramInt2 = i;
      if (paramInt1 != 0) {
        paramInt2 = i + n;
      }
      return paramInt2;
      label240:
      throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
    throw new ArithmeticException("/ by zero");
  }
  
  public static int b(int paramInt, RoundingMode paramRoundingMode)
  {
    if (paramInt > 0)
    {
      int i = a.a[paramRoundingMode.ordinal()];
      int j = 1;
      switch (i)
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        i = Integer.numberOfLeadingZeros(paramInt);
        return 31 - i + ((-1257966797 >>> i) - paramInt >>> 31);
      case 4: 
      case 5: 
        return 32 - Integer.numberOfLeadingZeros(paramInt - 1);
      case 1: 
        if (paramInt > 0) {
          i = 1;
        } else {
          i = 0;
        }
        if ((paramInt - 1 & paramInt) != 0) {
          j = 0;
        }
        if ((i & j) == 0) {
          break;
        }
      case 2: 
      case 3: 
        return 31 - Integer.numberOfLeadingZeros(paramInt);
      }
      throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
    paramRoundingMode = new StringBuilder();
    paramRoundingMode.append("x");
    paramRoundingMode.append(" (");
    paramRoundingMode.append(paramInt);
    paramRoundingMode.append(") must be > 0");
    throw new IllegalArgumentException(paramRoundingMode.toString());
  }
}

/* Location:
 * Qualified Name:     q7.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */