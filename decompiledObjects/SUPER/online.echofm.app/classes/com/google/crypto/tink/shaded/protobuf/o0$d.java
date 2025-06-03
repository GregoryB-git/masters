package com.google.crypto.tink.shaded.protobuf;

import sun.misc.Unsafe;

public final class o0$d
  extends o0.e
{
  public o0$d(Unsafe paramUnsafe)
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
  
  public boolean r()
  {
    if (!super.r()) {
      return false;
    }
    try
    {
      Class localClass1 = a.getClass();
      Class localClass2 = Long.TYPE;
      localClass1.getMethod("getByte", new Class[] { Object.class, localClass2 });
      localClass1.getMethod("putByte", new Class[] { Object.class, localClass2, Byte.TYPE });
      localClass1.getMethod("getBoolean", new Class[] { Object.class, localClass2 });
      localClass1.getMethod("putBoolean", new Class[] { Object.class, localClass2, Boolean.TYPE });
      localClass1.getMethod("getFloat", new Class[] { Object.class, localClass2 });
      localClass1.getMethod("putFloat", new Class[] { Object.class, localClass2, Float.TYPE });
      localClass1.getMethod("getDouble", new Class[] { Object.class, localClass2 });
      localClass1.getMethod("putDouble", new Class[] { Object.class, localClass2, Double.TYPE });
      return true;
    }
    finally
    {
      o0.a(localThrowable);
    }
    return false;
  }
  
  public boolean s()
  {
    if (!super.s()) {
      return false;
    }
    try
    {
      Class localClass1 = a.getClass();
      Class localClass2 = Long.TYPE;
      localClass1.getMethod("getByte", new Class[] { localClass2 });
      localClass1.getMethod("putByte", new Class[] { localClass2, Byte.TYPE });
      localClass1.getMethod("getInt", new Class[] { localClass2 });
      localClass1.getMethod("putInt", new Class[] { localClass2, Integer.TYPE });
      localClass1.getMethod("getLong", new Class[] { localClass2 });
      localClass1.getMethod("putLong", new Class[] { localClass2, localClass2 });
      localClass1.getMethod("copyMemory", new Class[] { localClass2, localClass2, localClass2 });
      localClass1.getMethod("copyMemory", new Class[] { Object.class, localClass2, Object.class, localClass2, localClass2 });
      return true;
    }
    finally
    {
      o0.a(localThrowable);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.o0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */