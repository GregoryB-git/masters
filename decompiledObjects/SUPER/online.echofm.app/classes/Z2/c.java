package Z2;

import W2.m;

public abstract class c
{
  public static long a(double paramDouble)
  {
    m.e(b(paramDouble), "not a normal value");
    int i = Math.getExponent(paramDouble);
    long l = Double.doubleToRawLongBits(paramDouble) & 0xFFFFFFFFFFFFF;
    if (i == 64513) {
      l <<= 1;
    } else {
      l |= 0x10000000000000;
    }
    return l;
  }
  
  public static boolean b(double paramDouble)
  {
    boolean bool;
    if (Math.getExponent(paramDouble) <= 1023) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     Z2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */