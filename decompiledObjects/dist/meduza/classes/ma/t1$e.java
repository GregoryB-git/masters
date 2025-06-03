package ma;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class t1$e
{
  public Unsafe a;
  
  public t1$e(Unsafe paramUnsafe)
  {
    a = paramUnsafe;
  }
  
  public final int a(Class<?> paramClass)
  {
    return a.arrayBaseOffset(paramClass);
  }
  
  public final int b(Class<?> paramClass)
  {
    return a.arrayIndexScale(paramClass);
  }
  
  public abstract void c(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3);
  
  public abstract boolean d(Object paramObject, long paramLong);
  
  public abstract byte e(long paramLong);
  
  public abstract byte f(Object paramObject, long paramLong);
  
  public abstract double g(Object paramObject, long paramLong);
  
  public abstract float h(Object paramObject, long paramLong);
  
  public final int i(Object paramObject, long paramLong)
  {
    return a.getInt(paramObject, paramLong);
  }
  
  public final long j(Object paramObject, long paramLong)
  {
    return a.getLong(paramObject, paramLong);
  }
  
  public final Object k(Object paramObject, long paramLong)
  {
    return a.getObject(paramObject, paramLong);
  }
  
  public final long l(Field paramField)
  {
    return a.objectFieldOffset(paramField);
  }
  
  public abstract void m(Object paramObject, long paramLong, boolean paramBoolean);
  
  public abstract void n(Object paramObject, long paramLong, byte paramByte);
  
  public abstract void o(Object paramObject, long paramLong, double paramDouble);
  
  public abstract void p(Object paramObject, long paramLong, float paramFloat);
  
  public final void q(Object paramObject, int paramInt, long paramLong)
  {
    a.putInt(paramObject, paramLong, paramInt);
  }
  
  public final void r(Object paramObject, long paramLong1, long paramLong2)
  {
    a.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public final void s(Object paramObject1, long paramLong, Object paramObject2)
  {
    a.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public boolean t()
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
      t1.a(localThrowable);
    }
    return false;
  }
  
  public abstract boolean u();
}

/* Location:
 * Qualified Name:     ma.t1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */