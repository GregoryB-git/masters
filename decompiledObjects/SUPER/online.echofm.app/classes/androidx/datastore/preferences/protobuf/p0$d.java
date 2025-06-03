package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class p0$d
  extends p0.e
{
  public p0$d(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public boolean c(Object paramObject, long paramLong)
  {
    return a.getBoolean(paramObject, paramLong);
  }
  
  public byte d(Object paramObject, long paramLong)
  {
    return a.getByte(paramObject, paramLong);
  }
  
  public double e(Object paramObject, long paramLong)
  {
    return a.getDouble(paramObject, paramLong);
  }
  
  public float f(Object paramObject, long paramLong)
  {
    return a.getFloat(paramObject, paramLong);
  }
  
  public void k(Object paramObject, long paramLong, boolean paramBoolean)
  {
    a.putBoolean(paramObject, paramLong, paramBoolean);
  }
  
  public void l(Object paramObject, long paramLong, byte paramByte)
  {
    a.putByte(paramObject, paramLong, paramByte);
  }
  
  public void m(Object paramObject, long paramLong, double paramDouble)
  {
    a.putDouble(paramObject, paramLong, paramDouble);
  }
  
  public void n(Object paramObject, long paramLong, float paramFloat)
  {
    a.putFloat(paramObject, paramLong, paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.p0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */