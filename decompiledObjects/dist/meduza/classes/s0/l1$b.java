package s0;

import sun.misc.Unsafe;

public final class l1$b
  extends l1.e
{
  public l1$b(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    boolean bool1 = l1.h;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (l1.h(paramObject, paramLong) == 0) {
        bool3 = false;
      }
      return bool3;
    }
    if (l1.i(paramObject, paramLong) != 0) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public final byte d(Object paramObject, long paramLong)
  {
    if (l1.h) {
      return l1.h(paramObject, paramLong);
    }
    return l1.i(paramObject, paramLong);
  }
  
  public final double e(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(h(paramObject, paramLong));
  }
  
  public final float f(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(g(paramObject, paramLong));
  }
  
  public final void k(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (l1.h) {
      l1.q(paramObject, paramLong, (byte)paramBoolean);
    } else {
      l1.r(paramObject, paramLong, (byte)paramBoolean);
    }
  }
  
  public final void l(Object paramObject, long paramLong, byte paramByte)
  {
    if (l1.h) {
      l1.q(paramObject, paramLong, paramByte);
    } else {
      l1.r(paramObject, paramLong, paramByte);
    }
  }
  
  public final void m(Object paramObject, long paramLong, double paramDouble)
  {
    p(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void n(Object paramObject, long paramLong, float paramFloat)
  {
    o(paramObject, Float.floatToIntBits(paramFloat), paramLong);
  }
}

/* Location:
 * Qualified Name:     s0.l1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */