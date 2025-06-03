package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

public final class D5$a
  extends D5.c
{
  public D5$a(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final double a(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(m(paramObject, paramLong));
  }
  
  public final void b(Object paramObject, long paramLong, byte paramByte)
  {
    if (D5.w)
    {
      D5.e(paramObject, paramLong, paramByte);
      return;
    }
    D5.q(paramObject, paramLong, paramByte);
  }
  
  public final void c(Object paramObject, long paramLong, double paramDouble)
  {
    f(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void d(Object paramObject, long paramLong, float paramFloat)
  {
    e(paramObject, paramLong, Float.floatToIntBits(paramFloat));
  }
  
  public final void g(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (D5.w)
    {
      D5.k(paramObject, paramLong, paramBoolean);
      return;
    }
    D5.r(paramObject, paramLong, paramBoolean);
  }
  
  public final float i(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(l(paramObject, paramLong));
  }
  
  public final boolean k(Object paramObject, long paramLong)
  {
    if (D5.w) {
      return D5.D(paramObject, paramLong);
    }
    return D5.E(paramObject, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.D5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */