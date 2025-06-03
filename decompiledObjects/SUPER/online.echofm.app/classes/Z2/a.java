package Z2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public abstract class a
{
  public static final BigInteger a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);
  public static final double b = Math.log(10.0D);
  public static final double c = Math.log(2.0D);
  
  public static BigInteger a(BigInteger paramBigInteger1, BigInteger paramBigInteger2, RoundingMode paramRoundingMode)
  {
    return new BigDecimal(paramBigInteger1).divide(new BigDecimal(paramBigInteger2), 0, paramRoundingMode).toBigIntegerExact();
  }
}

/* Location:
 * Qualified Name:     Z2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */