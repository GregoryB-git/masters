package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

public final class p0$b
  extends p0.e
{
  public p0$b(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public boolean c(Object paramObject, long paramLong)
  {
    if (p0.x) {
      return p0.e(paramObject, paramLong);
    }
    return p0.f(paramObject, paramLong);
  }
  
  public byte d(Object paramObject, long paramLong)
  {
    if (p0.x) {
      return p0.a(paramObject, paramLong);
    }
    return p0.b(paramObject, paramLong);
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
    if (p0.x) {
      p0.g(paramObject, paramLong, paramBoolean);
    } else {
      p0.h(paramObject, paramLong, paramBoolean);
    }
  }
  
  public void l(Object paramObject, long paramLong, byte paramByte)
  {
    if (p0.x) {
      p0.c(paramObject, paramLong, paramByte);
    } else {
      p0.d(paramObject, paramLong, paramByte);
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
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.p0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */