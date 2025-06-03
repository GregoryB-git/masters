package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class o0$e
{
  public Unsafe a;
  
  public o0$e(Unsafe paramUnsafe)
  {
    a = paramUnsafe;
  }
  
  public final int a(Class paramClass)
  {
    return a.arrayBaseOffset(paramClass);
  }
  
  public final int b(Class paramClass)
  {
    return a.arrayIndexScale(paramClass);
  }
  
  public abstract boolean c(Object paramObject, long paramLong);
  
  public abstract byte d(Object paramObject, long paramLong);
  
  public abstract double e(Object paramObject, long paramLong);
  
  public abstract float f(Object paramObject, long paramLong);
  
  public final int g(Object paramObject, long paramLong)
  {
    return a.getInt(paramObject, paramLong);
  }
  
  public final long h(Object paramObject, long paramLong)
  {
    return a.getLong(paramObject, paramLong);
  }
  
  public final Object i(Object paramObject, long paramLong)
  {
    return a.getObject(paramObject, paramLong);
  }
  
  public final long j(Field paramField)
  {
    return a.objectFieldOffset(paramField);
  }
  
  public abstract void k(Object paramObject, long paramLong, boolean paramBoolean);
  
  public abstract void l(Object paramObject, long paramLong, byte paramByte);
  
  public abstract void m(Object paramObject, long paramLong, double paramDouble);
  
  public abstract void n(Object paramObject, long paramLong, float paramFloat);
  
  public final void o(Object paramObject, long paramLong, int paramInt)
  {
    a.putInt(paramObject, paramLong, paramInt);
  }
  
  public final void p(Object paramObject, long paramLong1, long paramLong2)
  {
    a.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public final void q(Object paramObject1, long paramLong, Object paramObject2)
  {
    a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public boolean r()
  {
    Object localObject = a;
    if (localObject == null) {
      return false;
    }
    try
    {
      Class localClass = localObject.getClass();
      localClass.getMethod("objectFieldOffset", new Class[] { Field.class });
      localClass.getMethod("arrayBaseOffset", new Class[] { Class.class });
      localClass.getMethod("arrayIndexScale", new Class[] { Class.class });
      localObject = Long.TYPE;
      localClass.getMethod("getInt", new Class[] { Object.class, localObject });
      localClass.getMethod("putInt", new Class[] { Object.class, localObject, Integer.TYPE });
      localClass.getMethod("getLong", new Class[] { Object.class, localObject });
      localClass.getMethod("putLong", new Class[] { Object.class, localObject, localObject });
      localClass.getMethod("getObject", new Class[] { Object.class, localObject });
      localClass.getMethod("putObject", new Class[] { Object.class, localObject, Object.class });
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
    Object localObject = a;
    if (localObject == null) {
      return false;
    }
    try
    {
      localObject = localObject.getClass();
      ((Class)localObject).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
      localObject = o0.b();
      return localObject != null;
    }
    finally
    {
      o0.a(localThrowable);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.o0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */