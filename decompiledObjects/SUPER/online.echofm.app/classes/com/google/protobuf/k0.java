package com.google.protobuf;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class k0
{
  public static final Unsafe a = ;
  public static final Class b = d.b();
  public static final boolean c = o(Long.TYPE);
  public static final boolean d = o(Integer.TYPE);
  public static final e e = B();
  public static final boolean f = T();
  public static final boolean g = S();
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
    long l1 = l(byte[].class);
    h = l1;
    i = l(boolean[].class);
    j = m(boolean[].class);
    k = l(int[].class);
    l = m(int[].class);
    m = l(long[].class);
    n = m(long[].class);
    o = l(float[].class);
    p = m(float[].class);
    q = l(double[].class);
    r = m(double[].class);
    s = l(Object[].class);
    t = m(Object[].class);
    u = q(n());
    v = (int)(l1 & 0x7);
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    }
    w = bool;
  }
  
  public static long A(Object paramObject, long paramLong)
  {
    return e.h(paramObject, paramLong);
  }
  
  public static e B()
  {
    Unsafe localUnsafe = a;
    b localb = null;
    if (localUnsafe == null) {
      return null;
    }
    if (d.c())
    {
      if (c) {
        return new c(localUnsafe);
      }
      if (d) {
        localb = new b(localUnsafe);
      }
      return localb;
    }
    return new d(localUnsafe);
  }
  
  public static Object C(Object paramObject, long paramLong)
  {
    return e.i(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe D()
  {
    // Byte code:
    //   0: new 6	com/google/protobuf/k0$a
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 178	com/google/protobuf/k0$a:<init>	()V
    //   8: aload_0
    //   9: invokestatic 184	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 186	sun/misc/Unsafe
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
  
  public static boolean E()
  {
    return g;
  }
  
  public static boolean F()
  {
    return f;
  }
  
  public static void G(Throwable paramThrowable)
  {
    Logger localLogger = Logger.getLogger(k0.class.getName());
    Level localLevel = Level.WARNING;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
    localStringBuilder.append(paramThrowable);
    localLogger.log(localLevel, localStringBuilder.toString());
  }
  
  public static void H(Object paramObject, long paramLong, boolean paramBoolean)
  {
    e.k(paramObject, paramLong, paramBoolean);
  }
  
  public static void I(Object paramObject, long paramLong, boolean paramBoolean)
  {
    L(paramObject, paramLong, (byte)paramBoolean);
  }
  
  public static void J(Object paramObject, long paramLong, boolean paramBoolean)
  {
    M(paramObject, paramLong, (byte)paramBoolean);
  }
  
  public static void K(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    e.l(paramArrayOfByte, h + paramLong, paramByte);
  }
  
  public static void L(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = z(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    P(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static void M(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = z(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    P(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static void N(Object paramObject, long paramLong, double paramDouble)
  {
    e.m(paramObject, paramLong, paramDouble);
  }
  
  public static void O(Object paramObject, long paramLong, float paramFloat)
  {
    e.n(paramObject, paramLong, paramFloat);
  }
  
  public static void P(Object paramObject, long paramLong, int paramInt)
  {
    e.o(paramObject, paramLong, paramInt);
  }
  
  public static void Q(Object paramObject, long paramLong1, long paramLong2)
  {
    e.p(paramObject, paramLong1, paramLong2);
  }
  
  public static void R(Object paramObject1, long paramLong, Object paramObject2)
  {
    e.q(paramObject1, paramLong, paramObject2);
  }
  
  public static boolean S()
  {
    e locale = e;
    if (locale == null) {
      return false;
    }
    return locale.r();
  }
  
  public static boolean T()
  {
    e locale = e;
    if (locale == null) {
      return false;
    }
    return locale.s();
  }
  
  public static Object k(Class paramClass)
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
  
  public static int l(Class paramClass)
  {
    int i1;
    if (g) {
      i1 = e.a(paramClass);
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public static int m(Class paramClass)
  {
    int i1;
    if (g) {
      i1 = e.b(paramClass);
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public static Field n()
  {
    if (d.c())
    {
      localField = p(Buffer.class, "effectiveDirectAddress");
      if (localField != null) {
        return localField;
      }
    }
    Field localField = p(Buffer.class, "address");
    if ((localField == null) || (localField.getType() != Long.TYPE)) {
      localField = null;
    }
    return localField;
  }
  
  public static boolean o(Class paramClass)
  {
    if (!d.c()) {
      return false;
    }
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
  
  /* Error */
  public static Field p(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 348	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
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
  
  public static long q(Field paramField)
  {
    if (paramField != null)
    {
      e locale = e;
      if (locale != null)
      {
        l1 = locale.j(paramField);
        return l1;
      }
    }
    long l1 = -1L;
    return l1;
  }
  
  public static boolean r(Object paramObject, long paramLong)
  {
    return e.c(paramObject, paramLong);
  }
  
  public static boolean s(Object paramObject, long paramLong)
  {
    boolean bool;
    if (v(paramObject, paramLong) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean t(Object paramObject, long paramLong)
  {
    boolean bool;
    if (w(paramObject, paramLong) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static byte u(byte[] paramArrayOfByte, long paramLong)
  {
    return e.d(paramArrayOfByte, h + paramLong);
  }
  
  public static byte v(Object paramObject, long paramLong)
  {
    return (byte)(z(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static byte w(Object paramObject, long paramLong)
  {
    return (byte)(z(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static double x(Object paramObject, long paramLong)
  {
    return e.e(paramObject, paramLong);
  }
  
  public static float y(Object paramObject, long paramLong)
  {
    return e.f(paramObject, paramLong);
  }
  
  public static int z(Object paramObject, long paramLong)
  {
    return e.g(paramObject, paramLong);
  }
  
  public class a
    implements PrivilegedExceptionAction
  {
    public Unsafe a()
    {
      for (Object localObject : Unsafe.class.getDeclaredFields())
      {
        ((AccessibleObject)localObject).setAccessible(true);
        localObject = ((Field)localObject).get(null);
        if (Unsafe.class.isInstance(localObject)) {
          return (Unsafe)Unsafe.class.cast(localObject);
        }
      }
      return null;
    }
  }
  
  public static final class b
    extends k0.e
  {
    public b(Unsafe paramUnsafe)
    {
      super();
    }
    
    public boolean c(Object paramObject, long paramLong)
    {
      if (k0.w) {
        return k0.g(paramObject, paramLong);
      }
      return k0.h(paramObject, paramLong);
    }
    
    public byte d(Object paramObject, long paramLong)
    {
      if (k0.w) {
        return k0.c(paramObject, paramLong);
      }
      return k0.d(paramObject, paramLong);
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
      if (k0.w) {
        k0.i(paramObject, paramLong, paramBoolean);
      } else {
        k0.j(paramObject, paramLong, paramBoolean);
      }
    }
    
    public void l(Object paramObject, long paramLong, byte paramByte)
    {
      if (k0.w) {
        k0.e(paramObject, paramLong, paramByte);
      } else {
        k0.f(paramObject, paramLong, paramByte);
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
    
    public boolean s()
    {
      return false;
    }
  }
  
  public static final class c
    extends k0.e
  {
    public c(Unsafe paramUnsafe)
    {
      super();
    }
    
    public boolean c(Object paramObject, long paramLong)
    {
      if (k0.w) {
        return k0.g(paramObject, paramLong);
      }
      return k0.h(paramObject, paramLong);
    }
    
    public byte d(Object paramObject, long paramLong)
    {
      if (k0.w) {
        return k0.c(paramObject, paramLong);
      }
      return k0.d(paramObject, paramLong);
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
      if (k0.w) {
        k0.i(paramObject, paramLong, paramBoolean);
      } else {
        k0.j(paramObject, paramLong, paramBoolean);
      }
    }
    
    public void l(Object paramObject, long paramLong, byte paramByte)
    {
      if (k0.w) {
        k0.e(paramObject, paramLong, paramByte);
      } else {
        k0.f(paramObject, paramLong, paramByte);
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
    
    public boolean s()
    {
      return false;
    }
  }
  
  public static final class d
    extends k0.e
  {
    public d(Unsafe paramUnsafe)
    {
      super();
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
        k0.a(localThrowable);
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
        k0.a(localThrowable);
      }
      return false;
    }
  }
  
  public static abstract class e
  {
    public Unsafe a;
    
    public e(Unsafe paramUnsafe)
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
}

/* Location:
 * Qualified Name:     com.google.protobuf.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */