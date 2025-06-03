package s0;

import sun.misc.Unsafe;

public final class l1$d
  extends l1.e
{
  public l1$d(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final boolean c(Object paramObject, long paramLong)
  {
    return a.getBoolean(paramObject, paramLong);
  }
  
  public final byte d(Object paramObject, long paramLong)
  {
    return a.getByte(paramObject, paramLong);
  }
  
  public final double e(Object paramObject, long paramLong)
  {
    return a.getDouble(paramObject, paramLong);
  }
  
  public final float f(Object paramObject, long paramLong)
  {
    return a.getFloat(paramObject, paramLong);
  }
  
  public final void k(Object paramObject, long paramLong, boolean paramBoolean)
  {
    a.putBoolean(paramObject, paramLong, paramBoolean);
  }
  
  public final void l(Object paramObject, long paramLong, byte paramByte)
  {
    a.putByte(paramObject, paramLong, paramByte);
  }
  
  public final void m(Object paramObject, long paramLong, double paramDouble)
  {
    a.putDouble(paramObject, paramLong, paramDouble);
  }
  
  public final void n(Object paramObject, long paramLong, float paramFloat)
  {
    a.putFloat(paramObject, paramLong, paramFloat);
  }
}

/* Location:
 * Qualified Name:     s0.l1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */