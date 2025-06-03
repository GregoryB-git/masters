package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class D5$c
{
  public Unsafe a;
  
  public D5$c(Unsafe paramUnsafe)
  {
    a = paramUnsafe;
  }
  
  public abstract double a(Object paramObject, long paramLong);
  
  public abstract void b(Object paramObject, long paramLong, byte paramByte);
  
  public abstract void c(Object paramObject, long paramLong, double paramDouble);
  
  public abstract void d(Object paramObject, long paramLong, float paramFloat);
  
  public final void e(Object paramObject, long paramLong, int paramInt)
  {
    a.putInt(paramObject, paramLong, paramInt);
  }
  
  public final void f(Object paramObject, long paramLong1, long paramLong2)
  {
    a.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public abstract void g(Object paramObject, long paramLong, boolean paramBoolean);
  
  public final boolean h()
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
      D5.l(localThrowable);
    }
    return false;
  }
  
  public abstract float i(Object paramObject, long paramLong);
  
  public final boolean j()
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
      localObject = D5.c();
      return localObject != null;
    }
    finally
    {
      D5.l(localThrowable);
    }
    return false;
  }
  
  public abstract boolean k(Object paramObject, long paramLong);
  
  public final int l(Object paramObject, long paramLong)
  {
    return a.getInt(paramObject, paramLong);
  }
  
  public final long m(Object paramObject, long paramLong)
  {
    return a.getLong(paramObject, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.D5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */