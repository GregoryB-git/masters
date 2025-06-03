package Z2;

import java.math.RoundingMode;

public abstract class f
{
  public static void a(boolean paramBoolean, double paramDouble, RoundingMode paramRoundingMode)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("rounded value is out of range for input ");
    localStringBuilder.append(paramDouble);
    localStringBuilder.append(" and rounding mode ");
    localStringBuilder.append(paramRoundingMode);
    throw new ArithmeticException(localStringBuilder.toString());
  }
  
  public static void b(boolean paramBoolean, String paramString, int paramInt1, int paramInt2)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("overflow: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(")");
    throw new ArithmeticException(localStringBuilder.toString());
  }
  
  public static void c(boolean paramBoolean, String paramString, long paramLong1, long paramLong2)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("overflow: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(")");
    throw new ArithmeticException(localStringBuilder.toString());
  }
  
  public static long d(String paramString, long paramLong)
  {
    if (paramLong >= 0L) {
      return paramLong;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" (");
    localStringBuilder.append(paramLong);
    localStringBuilder.append(") must be >= 0");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static void e(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
  }
}

/* Location:
 * Qualified Name:     Z2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */