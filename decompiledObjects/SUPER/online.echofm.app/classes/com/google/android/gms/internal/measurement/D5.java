package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

public abstract class D5
{
  public static final Unsafe a;
  public static final Class b;
  public static final boolean c;
  public static final boolean d;
  public static final c e;
  public static final boolean f;
  public static final boolean g;
  public static final long h;
  public static final long i;
  public static final long j;
  public static final long k;
  public static final long l;
  public static final long m;
  public static final long n;
  public static final long o;
  public static final long p;
  public static final long q;
  public static final long r;
  public static final long s;
  public static final long t;
  public static final long u;
  public static final int v;
  public static final boolean w;
  
  static
  {
    Object localObject = p();
    a = (Unsafe)localObject;
    b = o3.a();
    boolean bool1 = A(Long.TYPE);
    c = bool1;
    boolean bool2 = A(Integer.TYPE);
    d = bool2;
    if (localObject != null)
    {
      if (bool1)
      {
        localObject = new a((Unsafe)localObject);
        break label74;
      }
      if (bool2)
      {
        localObject = new b((Unsafe)localObject);
        break label74;
      }
    }
    localObject = null;
    label74:
    e = (c)localObject;
    bool2 = false;
    if (localObject == null) {
      bool1 = false;
    } else {
      bool1 = ((c)localObject).j();
    }
    f = bool1;
    if (localObject == null) {
      bool1 = false;
    } else {
      bool1 = ((c)localObject).h();
    }
    g = bool1;
    long l1 = o(byte[].class);
    h = l1;
    i = o(boolean[].class);
    j = s(boolean[].class);
    k = o(int[].class);
    l = s(int[].class);
    m = o(long[].class);
    n = s(long[].class);
    o = o(float[].class);
    p = s(float[].class);
    q = o(double[].class);
    r = s(double[].class);
    s = o(Object[].class);
    t = s(Object[].class);
    Field localField = C();
    long l2;
    if ((localField != null) && (localObject != null)) {
      l2 = a.objectFieldOffset(localField);
    } else {
      l2 = -1L;
    }
    u = l2;
    v = (int)(l1 & 0x7);
    bool1 = bool2;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool1 = true;
    }
    w = bool1;
  }
  
  public static boolean A(Class paramClass)
  {
    try
    {
      Class localClass1 = b;
      Class localClass2 = Boolean.TYPE;
      localClass1.getMethod("peekLong", new Class[] { paramClass, localClass2 });
      localClass1.getMethod("pokeLong", new Class[] { paramClass, Long.TYPE, localClass2 });
      Class localClass3 = Integer.TYPE;
      localClass1.getMethod("pokeInt", new Class[] { paramClass, localClass3, localClass2 });
      localClass1.getMethod("peekInt", new Class[] { paramClass, localClass2 });
      localClass1.getMethod("pokeByte", new Class[] { paramClass, Byte.TYPE });
      localClass1.getMethod("peekByte", new Class[] { paramClass });
      localClass1.getMethod("pokeByteArray", new Class[] { paramClass, byte[].class, localClass3, localClass3 });
      localClass1.getMethod("peekByteArray", new Class[] { paramClass, byte[].class, localClass3, localClass3 });
      return true;
    }
    finally {}
    return false;
  }
  
  public static Object B(Object paramObject, long paramLong)
  {
    return ea.getObject(paramObject, paramLong);
  }
  
  public static Field C()
  {
    Field localField = d(Buffer.class, "effectiveDirectAddress");
    if (localField != null) {
      return localField;
    }
    localField = d(Buffer.class, "address");
    if ((localField != null) && (localField.getType() == Long.TYPE)) {
      return localField;
    }
    return null;
  }
  
  public static boolean F(Object paramObject, long paramLong)
  {
    return e.k(paramObject, paramLong);
  }
  
  public static double a(Object paramObject, long paramLong)
  {
    return e.a(paramObject, paramLong);
  }
  
  public static Object b(Class paramClass)
  {
    try
    {
      paramClass = a.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  /* Error */
  public static Field d(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 240	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   5: astore_0
    //   6: goto +6 -> 12
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_0
    //   12: aload_0
    //   13: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	14	0	paramClass	Class
    //   0	14	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   0	6	9	finally
  }
  
  public static void f(Object paramObject, long paramLong, double paramDouble)
  {
    e.c(paramObject, paramLong, paramDouble);
  }
  
  public static void g(Object paramObject, long paramLong, float paramFloat)
  {
    e.d(paramObject, paramLong, paramFloat);
  }
  
  public static void h(Object paramObject, long paramLong, int paramInt)
  {
    e.e(paramObject, paramLong, paramInt);
  }
  
  public static void i(Object paramObject, long paramLong1, long paramLong2)
  {
    e.f(paramObject, paramLong1, paramLong2);
  }
  
  public static void j(Object paramObject1, long paramLong, Object paramObject2)
  {
    ea.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public static void m(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    e.b(paramArrayOfByte, h + paramLong, paramByte);
  }
  
  public static float n(Object paramObject, long paramLong)
  {
    return e.i(paramObject, paramLong);
  }
  
  public static int o(Class paramClass)
  {
    if (g) {
      return ea.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  /* Error */
  public static Unsafe p()
  {
    // Byte code:
    //   0: new 315	com/google/android/gms/internal/measurement/C5
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 317	com/google/android/gms/internal/measurement/C5:<init>	()V
    //   8: aload_0
    //   9: invokestatic 323	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 137	sun/misc/Unsafe
    //   15: astore_0
    //   16: goto +6 -> 22
    //   19: astore_0
    //   20: aconst_null
    //   21: astore_0
    //   22: aload_0
    //   23: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	13	0	localObject1	Object
    //   19	1	0	localObject2	Object
    //   21	2	0	localUnsafe	Unsafe
    // Exception table:
    //   from	to	target	type
    //   0	16	19	finally
  }
  
  public static int s(Class paramClass)
  {
    if (g) {
      return ea.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  public static int t(Object paramObject, long paramLong)
  {
    return e.l(paramObject, paramLong);
  }
  
  public static void u(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = t(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    h(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static void v(Object paramObject, long paramLong, boolean paramBoolean)
  {
    e.g(paramObject, paramLong, paramBoolean);
  }
  
  public static boolean w()
  {
    return g;
  }
  
  public static long x(Object paramObject, long paramLong)
  {
    return e.m(paramObject, paramLong);
  }
  
  public static void y(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = t(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    h(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static boolean z()
  {
    return f;
  }
  
  public static final class a
    extends D5.c
  {
    public a(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final double a(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(m(paramObject, paramLong));
    }
    
    public final void b(Object paramObject, long paramLong, byte paramByte)
    {
      if (D5.w)
      {
        D5.e(paramObject, paramLong, paramByte);
        return;
      }
      D5.q(paramObject, paramLong, paramByte);
    }
    
    public final void c(Object paramObject, long paramLong, double paramDouble)
    {
      f(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void d(Object paramObject, long paramLong, float paramFloat)
    {
      e(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void g(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (D5.w)
      {
        D5.k(paramObject, paramLong, paramBoolean);
        return;
      }
      D5.r(paramObject, paramLong, paramBoolean);
    }
    
    public final float i(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(l(paramObject, paramLong));
    }
    
    public final boolean k(Object paramObject, long paramLong)
    {
      if (D5.w) {
        return D5.D(paramObject, paramLong);
      }
      return D5.E(paramObject, paramLong);
    }
  }
  
  public static final class b
    extends D5.c
  {
    public b(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final double a(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(m(paramObject, paramLong));
    }
    
    public final void b(Object paramObject, long paramLong, byte paramByte)
    {
      if (D5.w)
      {
        D5.e(paramObject, paramLong, paramByte);
        return;
      }
      D5.q(paramObject, paramLong, paramByte);
    }
    
    public final void c(Object paramObject, long paramLong, double paramDouble)
    {
      f(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void d(Object paramObject, long paramLong, float paramFloat)
    {
      e(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void g(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (D5.w)
      {
        D5.k(paramObject, paramLong, paramBoolean);
        return;
      }
      D5.r(paramObject, paramLong, paramBoolean);
    }
    
    public final float i(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(l(paramObject, paramLong));
    }
    
    public final boolean k(Object paramObject, long paramLong)
    {
      if (D5.w) {
        return D5.D(paramObject, paramLong);
      }
      return D5.E(paramObject, paramLong);
    }
  }
  
  public static abstract class c
  {
    public Unsafe a;
    
    public c(Unsafe paramUnsafe)
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.D5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */