package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Y3
  extends j3
{
  private static Map<Object, Y3> zzc = new ConcurrentHashMap();
  protected v5 zzb = v5.k();
  private int zzd = -1;
  
  public static i4 A()
  {
    return w4.f();
  }
  
  public static h4 B()
  {
    return Y4.g();
  }
  
  private final int k()
  {
    return U4.a().c(this).f(this);
  }
  
  public static Y3 l(Class paramClass)
  {
    Object localObject1 = (Y3)zzc.get(paramClass);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject2 = (Y3)zzc.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = (Y3)((Y3)D5.b(paramClass)).p(c.f, null, null);
      if (localObject1 != null) {
        zzc.put(paramClass, localObject1);
      } else {
        throw new IllegalStateException();
      }
    }
    return (Y3)localObject1;
  }
  
  public static h4 n(h4 paramh4)
  {
    int i = paramh4.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    }
    return paramh4.e(i);
  }
  
  public static i4 o(i4 parami4)
  {
    int i = parami4.size();
    if (i == 0) {
      i = 10;
    } else {
      i <<= 1;
    }
    return parami4.r(i);
  }
  
  public static Object q(I4 paramI4, String paramString, Object[] paramArrayOfObject)
  {
    return new W4(paramI4, paramString, paramArrayOfObject);
  }
  
  public static Object s(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  public static void t(Class paramClass, Y3 paramY3)
  {
    paramY3.D();
    zzc.put(paramClass, paramY3);
  }
  
  public static final boolean u(Y3 paramY3, boolean paramBoolean)
  {
    int i = ((Byte)paramY3.p(c.a, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = U4.a().c(paramY3).c(paramY3);
    if (paramBoolean)
    {
      i = c.b;
      Y3 localY3;
      if (bool) {
        localY3 = paramY3;
      } else {
        localY3 = null;
      }
      paramY3.p(i, localY3, null);
    }
    return bool;
  }
  
  public static f4 z()
  {
    return c4.f();
  }
  
  public final void C()
  {
    U4.a().c(this).e(this);
    D();
  }
  
  public final void D()
  {
    zzd &= 0x7FFFFFFF;
  }
  
  public final boolean E()
  {
    return u(this, true);
  }
  
  public final boolean F()
  {
    return (zzd & 0x80000000) != 0;
  }
  
  public final int a()
  {
    return c(null);
  }
  
  public final int c(Z4 paramZ4)
  {
    if (F())
    {
      i = v(paramZ4);
      if (i >= 0) {
        return i;
      }
      paramZ4 = new StringBuilder("serialized size must be non-negative, was ");
      paramZ4.append(i);
      throw new IllegalStateException(paramZ4.toString());
    }
    if (g() != Integer.MAX_VALUE) {
      return g();
    }
    int i = v(paramZ4);
    j(i);
    return i;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    return U4.a().c(this).h(this, (Y3)paramObject);
  }
  
  public final void f(J3 paramJ3)
  {
    U4.a().c(this).i(this, L3.P(paramJ3));
  }
  
  public final int g()
  {
    return zzd & 0x7FFFFFFF;
  }
  
  public int hashCode()
  {
    if (F()) {
      return k();
    }
    if (zza == 0) {
      zza = k();
    }
    return zza;
  }
  
  public final void j(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzd = (paramInt & 0x7FFFFFFF | zzd & 0x80000000);
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("serialized size must be non-negative, was ");
    localStringBuilder.append(paramInt);
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public abstract Object p(int paramInt, Object paramObject1, Object paramObject2);
  
  public String toString()
  {
    return N4.a(this, super.toString());
  }
  
  public final int v(Z4 paramZ4)
  {
    if (paramZ4 == null) {
      return U4.a().c(this).b(this);
    }
    return paramZ4.b(this);
  }
  
  public final b w()
  {
    return (b)p(c.e, null, null);
  }
  
  public final b x()
  {
    return ((b)p(c.e, null, null)).l(this);
  }
  
  public final Y3 y()
  {
    return (Y3)p(c.d, null, null);
  }
  
  public static final class a
    extends m3
  {
    public final Y3 b;
    
    public a(Y3 paramY3)
    {
      b = paramY3;
    }
  }
  
  public static abstract class b
    extends k3
  {
    public final Y3 o;
    public Y3 p;
    
    public b(Y3 paramY3)
    {
      o = paramY3;
      if (!paramY3.F())
      {
        p = paramY3.y();
        return;
      }
      throw new IllegalArgumentException("Default instance must be immutable.");
    }
    
    public static void n(Object paramObject1, Object paramObject2)
    {
      U4.a().c(paramObject1).d(paramObject1, paramObject2);
    }
    
    public final b l(Y3 paramY3)
    {
      if (o.equals(paramY3)) {
        return this;
      }
      if (!p.F()) {
        t();
      }
      n(p, paramY3);
      return this;
    }
    
    public Y3 o()
    {
      if (!p.F()) {
        return p;
      }
      p.C();
      return p;
    }
    
    public final void s()
    {
      if (!p.F()) {
        t();
      }
    }
    
    public void t()
    {
      Y3 localY3 = o.y();
      n(localY3, p);
      p = localY3;
    }
    
    public final b u(byte[] paramArrayOfByte, int paramInt1, int paramInt2, M3 paramM3)
    {
      if (!p.F()) {
        t();
      }
      try
      {
        try
        {
          Z4 localZ4 = U4.a().c(p);
          Y3 localY3 = p;
          p3 localp3 = new com/google/android/gms/internal/measurement/p3;
          localp3.<init>(paramM3);
          localZ4.g(localY3, paramArrayOfByte, 0, paramInt2, localp3);
          return this;
        }
        catch (IOException paramArrayOfByte) {}catch (k4 paramArrayOfByte) {}
        throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
      }
      catch (IndexOutOfBoundsException paramArrayOfByte)
      {
        throw k4.f();
      }
      throw paramArrayOfByte;
    }
    
    public final Y3 v()
    {
      Y3 localY3 = (Y3)i();
      if (localY3.E()) {
        return localY3;
      }
      throw new t5(localY3);
    }
  }
  
  public static abstract enum c
  {
    public static int[] a()
    {
      return (int[])h.clone();
    }
  }
  
  public static abstract class d
    extends N3
  {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Y3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */