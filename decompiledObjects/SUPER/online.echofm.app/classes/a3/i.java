package a3;

import W2.m;

public abstract class i
{
  public static byte a(long paramLong)
  {
    boolean bool;
    if (paramLong >> 8 == 0L) {
      bool = true;
    } else {
      bool = false;
    }
    m.g(bool, "out of range: %s", paramLong);
    return (byte)(int)paramLong;
  }
  
  public static int b(byte paramByte)
  {
    return paramByte & 0xFF;
  }
}

/* Location:
 * Qualified Name:     a3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */