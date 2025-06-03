package com.google.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class k0$e
{
  public Unsafe a;
  
  public k0$e(Unsafe paramUnsafe)
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
      localObject = localObject.getClass();
      ((Class)localObject).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject).getMethod("arrayBaseOffset", new Class[] { Class.class });
      ((Class)localObject).getMethod("arrayIndexScale", new Class[] { Class.class });
      Class localClass = Long.TYPE;
      ((Class)localObject).getMethod("getInt", new Class[] { Object.class, localClass });
      ((Class)localObject).getMethod("putInt", new Class[] { Object.class, localClass, Integer.TYPE });
      ((Class)localObject).getMethod("getLong", new Class[] { Object.class, localClass });
      ((Class)localObject).getMethod("putLong", new Class[] { Object.class, localClass, localClass });
      ((Class)localObject).getMethod("getObject", new Class[] { Object.class, localClass });
      ((Class)localObject).getMethod("putObject", new Class[] { Object.class, localClass, Object.class });
      return true;
    }
    finally
    {
      k0.a(localThrowable);
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
      localObject = k0.b();
      return localObject != null;
    }
    finally
    {
      k0.a(localThrowable);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.k0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */