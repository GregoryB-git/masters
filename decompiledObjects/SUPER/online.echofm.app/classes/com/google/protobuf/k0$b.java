package com.google.protobuf;

import sun.misc.Unsafe;

public final class k0$b
  extends k0.e
{
  public k0$b(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public boolean c(Object paramObject, long paramLong)
  {
    if (k0.w) {
      return k0.g(paramObject, paramLong);
    }
    return k0.h(paramObject, paramLong);
  }
  
  public byte d(Object paramObject, long paramLong)
  {
    if (k0.w) {
      return k0.c(paramObject, paramLong);
    }
    return k0.d(paramObject, paramLong);
  }
  
  public double e(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(h(paramObject, paramLong));
  }
  
  public float f(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(g(paramObject, paramLong));
  }
  
  public void k(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (k0.w) {
      k0.i(paramObject, paramLong, paramBoolean);
    } else {
      k0.j(paramObject, paramLong, paramBoolean);
    }
  }
  
  public void l(Object paramObject, long paramLong, byte paramByte)
  {
    if (k0.w) {
      k0.e(paramObject, paramLong, paramByte);
    } else {
      k0.f(paramObject, paramLong, paramByte);
    }
  }
  
  public void m(Object paramObject, long paramLong, double paramDouble)
  {
    p(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public void n(Object paramObject, long paramLong, float paramFloat)
  {
    o(paramObject, paramLong, Float.floatToIntBits(paramFloat));
  }
  
  public boolean s()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.k0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */