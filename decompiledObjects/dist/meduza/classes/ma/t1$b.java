package ma;

import sun.misc.Unsafe;

public final class t1$b
  extends t1.e
{
  public t1$b(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final void c(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean d(Object paramObject, long paramLong)
  {
    boolean bool1 = t1.h;
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (t1.j(paramObject, paramLong) == 0) {
        bool3 = false;
      }
      return bool3;
    }
    if (t1.k(paramObject, paramLong) != 0) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public final byte e(long paramLong)
  {
    throw new UnsupportedOperationException();
  }
  
  public final byte f(Object paramObject, long paramLong)
  {
    if (t1.h) {
      return t1.j(paramObject, paramLong);
    }
    return t1.k(paramObject, paramLong);
  }
  
  public final double g(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(j(paramObject, paramLong));
  }
  
  public final float h(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(i(paramObject, paramLong));
  }
  
  public final void m(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (t1.h) {
      t1.t(paramObject, paramLong, (byte)paramBoolean);
    } else {
      t1.u(paramObject, paramLong, (byte)paramBoolean);
    }
  }
  
  public final void n(Object paramObject, long paramLong, byte paramByte)
  {
    if (t1.h) {
      t1.t(paramObject, paramLong, paramByte);
    } else {
      t1.u(paramObject, paramLong, paramByte);
    }
  }
  
  public final void o(Object paramObject, long paramLong, double paramDouble)
  {
    r(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
  }
  
  public final void p(Object paramObject, long paramLong, float paramFloat)
  {
    q(paramObject, Float.floatToIntBits(paramFloat), paramLong);
  }
  
  public final boolean u()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     ma.t1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */