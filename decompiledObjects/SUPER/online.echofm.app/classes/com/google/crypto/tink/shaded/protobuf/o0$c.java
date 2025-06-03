package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

public final class o0$c
  extends o0.e
{
  public o0$c(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public boolean c(Object paramObject, long paramLong)
  {
    if (o0.w) {
      return o0.g(paramObject, paramLong);
    }
    return o0.h(paramObject, paramLong);
  }
  
  public byte d(Object paramObject, long paramLong)
  {
    if (o0.w) {
      return o0.c(paramObject, paramLong);
    }
    return o0.d(paramObject, paramLong);
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
    if (o0.w) {
      o0.i(paramObject, paramLong, paramBoolean);
    } else {
      o0.j(paramObject, paramLong, paramBoolean);
    }
  }
  
  public void l(Object paramObject, long paramLong, byte paramByte)
  {
    if (o0.w) {
      o0.e(paramObject, paramLong, paramByte);
    } else {
      o0.f(paramObject, paramLong, paramByte);
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
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.o0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */