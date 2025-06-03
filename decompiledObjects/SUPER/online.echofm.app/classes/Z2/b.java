package Z2;

import java.math.RoundingMode;

public abstract class b
{
  public static final double a = Math.log(2.0D);
  public static final double[] b = { 1.0D, 2.0922789888E13D, 2.631308369336935E35D, 1.2413915592536073E61D, 1.2688693218588417E89D, 7.156945704626381E118D, 9.916779348709496E149D, 1.974506857221074E182D, 3.856204823625804E215D, 5.5502938327393044E249D, 4.7147236359920616E284D };
  
  public static boolean a(double paramDouble)
  {
    boolean bool;
    if ((c.b(paramDouble)) && ((paramDouble == 0.0D) || (52 - Long.numberOfTrailingZeros(c.a(paramDouble)) <= Math.getExponent(paramDouble)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static double b(double paramDouble, RoundingMode paramRoundingMode)
  {
    if (c.b(paramDouble))
    {
      double d = paramDouble;
      switch (a.a[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 8: 
        d = Math.rint(paramDouble);
        if (Math.abs(paramDouble - d) == 0.5D) {
          return paramDouble;
        }
        return d;
      case 7: 
        d = Math.rint(paramDouble);
        if (Math.abs(paramDouble - d) == 0.5D) {
          return paramDouble + Math.copySign(0.5D, paramDouble);
        }
        return d;
      case 6: 
        return Math.rint(paramDouble);
      case 5: 
        if (a(paramDouble)) {
          return paramDouble;
        }
        long l = paramDouble;
        int i;
        if (paramDouble > 0.0D) {
          i = 1;
        } else {
          i = -1;
        }
        d = l + i;
      case 4: 
        return d;
      case 3: 
        d = paramDouble;
        if (paramDouble > 0.0D) {
          if (a(paramDouble)) {
            d = paramDouble;
          } else {
            d = paramDouble + 1L;
          }
        }
        return d;
      case 2: 
        d = paramDouble;
        if (paramDouble < 0.0D) {
          if (a(paramDouble)) {
            d = paramDouble;
          } else {
            d = paramDouble - 1L;
          }
        }
        return d;
      }
      f.e(a(paramDouble));
      return paramDouble;
    }
    throw new ArithmeticException("input is infinite or NaN");
  }
  
  public static long c(double paramDouble, RoundingMode paramRoundingMode)
  {
    double d = b(paramDouble, paramRoundingMode);
    int i = 0;
    int j;
    if (-9.223372036854776E18D - d < 1.0D) {
      j = 1;
    } else {
      j = 0;
    }
    if (d < 9.223372036854776E18D) {
      i = 1;
    }
    f.a(j & i, paramDouble, paramRoundingMode);
    return d;
  }
}

/* Location:
 * Qualified Name:     Z2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */