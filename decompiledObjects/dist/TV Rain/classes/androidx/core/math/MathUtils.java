package androidx.core.math;

public class MathUtils
{
  public static int addExact(int paramInt1, int paramInt2)
  {
    int i = paramInt1 + paramInt2;
    if (((paramInt1 ^ i) & (paramInt2 ^ i)) >= 0) {
      return i;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long addExact(long paramLong1, long paramLong2)
  {
    long l = paramLong1 + paramLong2;
    if (((paramLong1 ^ l) & (paramLong2 ^ l)) >= 0L) {
      return l;
    }
    throw new ArithmeticException("long overflow");
  }
  
  public static double clamp(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    if (paramDouble1 < paramDouble2) {
      return paramDouble2;
    }
    if (paramDouble1 > paramDouble3) {
      return paramDouble3;
    }
    return paramDouble1;
  }
  
  public static float clamp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    return paramFloat1;
  }
  
  public static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    return paramInt1;
  }
  
  public static long clamp(long paramLong1, long paramLong2, long paramLong3)
  {
    if (paramLong1 < paramLong2) {
      return paramLong2;
    }
    if (paramLong1 > paramLong3) {
      return paramLong3;
    }
    return paramLong1;
  }
  
  public static int decrementExact(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE) {
      return paramInt - 1;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long decrementExact(long paramLong)
  {
    if (paramLong != Long.MIN_VALUE) {
      return paramLong - 1L;
    }
    throw new ArithmeticException("long overflow");
  }
  
  public static int incrementExact(int paramInt)
  {
    if (paramInt != Integer.MAX_VALUE) {
      return paramInt + 1;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long incrementExact(long paramLong)
  {
    if (paramLong != Long.MAX_VALUE) {
      return paramLong + 1L;
    }
    throw new ArithmeticException("long overflow");
  }
  
  public static int multiplyExact(int paramInt1, int paramInt2)
  {
    long l = paramInt1 * paramInt2;
    paramInt1 = (int)l;
    if (paramInt1 == l) {
      return paramInt1;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long multiplyExact(long paramLong1, long paramLong2)
  {
    long l = paramLong1 * paramLong2;
    if (((Math.abs(paramLong1) | Math.abs(paramLong2)) >>> 31 != 0L) && (((paramLong2 != 0L) && (l / paramLong2 != paramLong1)) || ((paramLong1 == Long.MIN_VALUE) && (paramLong2 == -1L)))) {
      throw new ArithmeticException("long overflow");
    }
    return l;
  }
  
  public static int negateExact(int paramInt)
  {
    if (paramInt != Integer.MIN_VALUE) {
      return -paramInt;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long negateExact(long paramLong)
  {
    if (paramLong != Long.MIN_VALUE) {
      return -paramLong;
    }
    throw new ArithmeticException("long overflow");
  }
  
  public static int subtractExact(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - paramInt2;
    if (((paramInt1 ^ i) & (paramInt2 ^ paramInt1)) >= 0) {
      return i;
    }
    throw new ArithmeticException("integer overflow");
  }
  
  public static long subtractExact(long paramLong1, long paramLong2)
  {
    long l = paramLong1 - paramLong2;
    if (((paramLong1 ^ l) & (paramLong2 ^ paramLong1)) >= 0L) {
      return l;
    }
    throw new ArithmeticException("long overflow");
  }
  
  public static int toIntExact(long paramLong)
  {
    int i = (int)paramLong;
    if (i == paramLong) {
      return i;
    }
    throw new ArithmeticException("integer overflow");
  }
}

/* Location:
 * Qualified Name:     androidx.core.math.MathUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */