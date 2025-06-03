package androidx.datastore.preferences.protobuf;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class p0
{
  public static final Logger a = Logger.getLogger(p0.class.getName());
  public static final Unsafe b = B();
  public static final Class c = d.b();
  public static final boolean d = m(Long.TYPE);
  public static final boolean e = m(Integer.TYPE);
  public static final e f = z();
  public static final boolean g = Q();
  public static final boolean h = P();
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
  public static final long v;
  public static final int w;
  public static final boolean x;
  
  static
  {
    long l1 = j(byte[].class);
    i = l1;
    j = j(boolean[].class);
    k = k(boolean[].class);
    l = j(int[].class);
    m = k(int[].class);
    n = j(long[].class);
    o = k(long[].class);
    p = j(float[].class);
    q = k(float[].class);
    r = j(double[].class);
    s = k(double[].class);
    t = j(Object[].class);
    u = k(Object[].class);
    v = o(l());
    w = (int)(l1 & 0x7);
    boolean bool;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool = true;
    } else {
      bool = false;
    }
    x = bool;
  }
  
  public static Object A(Object paramObject, long paramLong)
  {
    return f.i(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe B()
  {
    // Byte code:
    //   0: new 6	androidx/datastore/preferences/protobuf/p0$a
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 183	androidx/datastore/preferences/protobuf/p0$a:<init>	()V
    //   8: aload_0
    //   9: invokestatic 189	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 191	sun/misc/Unsafe
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
  
  public static boolean C()
  {
    return h;
  }
  
  public static boolean D()
  {
    return g;
  }
  
  public static void E(Object paramObject, long paramLong, boolean paramBoolean)
  {
    f.k(paramObject, paramLong, paramBoolean);
  }
  
  public static void F(Object paramObject, long paramLong, boolean paramBoolean)
  {
    I(paramObject, paramLong, (byte)paramBoolean);
  }
  
  public static void G(Object paramObject, long paramLong, boolean paramBoolean)
  {
    J(paramObject, paramLong, (byte)paramBoolean);
  }
  
  public static void H(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    f.l(paramArrayOfByte, i + paramLong, paramByte);
  }
  
  public static void I(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = x(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    M(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static void J(Object paramObject, long paramLong, byte paramByte)
  {
    long l1 = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i1 = x(paramObject, l1);
    int i2 = ((int)paramLong & 0x3) << 3;
    M(paramObject, l1, (0xFF & paramByte) << i2 | i1 & 255 << i2);
  }
  
  public static void K(Object paramObject, long paramLong, double paramDouble)
  {
    f.m(paramObject, paramLong, paramDouble);
  }
  
  public static void L(Object paramObject, long paramLong, float paramFloat)
  {
    f.n(paramObject, paramLong, paramFloat);
  }
  
  public static void M(Object paramObject, long paramLong, int paramInt)
  {
    f.o(paramObject, paramLong, paramInt);
  }
  
  public static void N(Object paramObject, long paramLong1, long paramLong2)
  {
    f.p(paramObject, paramLong1, paramLong2);
  }
  
  public static void O(Object paramObject1, long paramLong, Object paramObject2)
  {
    f.q(paramObject1, paramLong, paramObject2);
  }
  
  public static boolean P()
  {
    Object localObject1 = b;
    if (localObject1 == null) {
      return false;
    }
    try
    {
      localObject3 = localObject1.getClass();
      ((Class)localObject3).getMethod("objectFieldOffset", new Class[] { Field.class });
      ((Class)localObject3).getMethod("arrayBaseOffset", new Class[] { Class.class });
      ((Class)localObject3).getMethod("arrayIndexScale", new Class[] { Class.class });
      localObject1 = Long.TYPE;
      ((Class)localObject3).getMethod("getInt", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putInt", new Class[] { Object.class, localObject1, Integer.TYPE });
      ((Class)localObject3).getMethod("getLong", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putLong", new Class[] { Object.class, localObject1, localObject1 });
      ((Class)localObject3).getMethod("getObject", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putObject", new Class[] { Object.class, localObject1, Object.class });
      if (d.c()) {
        return true;
      }
      ((Class)localObject3).getMethod("getByte", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putByte", new Class[] { Object.class, localObject1, Byte.TYPE });
      ((Class)localObject3).getMethod("getBoolean", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putBoolean", new Class[] { Object.class, localObject1, Boolean.TYPE });
      ((Class)localObject3).getMethod("getFloat", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putFloat", new Class[] { Object.class, localObject1, Float.TYPE });
      ((Class)localObject3).getMethod("getDouble", new Class[] { Object.class, localObject1 });
      ((Class)localObject3).getMethod("putDouble", new Class[] { Object.class, localObject1, Double.TYPE });
      return true;
    }
    finally
    {
      Logger localLogger = a;
      Level localLevel = Level.WARNING;
      Object localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("platform method missing - proto runtime falling back to safer methods: ");
      ((StringBuilder)localObject3).append(localObject2);
      localLogger.log(localLevel, ((StringBuilder)localObject3).toString());
    }
    return false;
  }
  
  public static boolean Q()
  {
    Object localObject1 = b;
    if (localObject1 == null) {
      return false;
    }
    try
    {
      localObject1 = localObject1.getClass();
      ((Class)localObject1).getMethod("objectFieldOffset", new Class[] { Field.class });
      Class localClass = Long.TYPE;
      ((Class)localObject1).getMethod("getLong", new Class[] { Object.class, localClass });
      if (l() == null) {
        return false;
      }
      if (d.c()) {
        return true;
      }
      ((Class)localObject1).getMethod("getByte", new Class[] { localClass });
      ((Class)localObject1).getMethod("putByte", new Class[] { localClass, Byte.TYPE });
      ((Class)localObject1).getMethod("getInt", new Class[] { localClass });
      ((Class)localObject1).getMethod("putInt", new Class[] { localClass, Integer.TYPE });
      ((Class)localObject1).getMethod("getLong", new Class[] { localClass });
      ((Class)localObject1).getMethod("putLong", new Class[] { localClass, localClass });
      ((Class)localObject1).getMethod("copyMemory", new Class[] { localClass, localClass, localClass });
      ((Class)localObject1).getMethod("copyMemory", new Class[] { Object.class, localClass, Object.class, localClass, localClass });
      return true;
    }
    finally
    {
      localObject1 = a;
      Level localLevel = Level.WARNING;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
      localStringBuilder.append(localObject2);
      ((Logger)localObject1).log(localLevel, localStringBuilder.toString());
    }
    return false;
  }
  
  public static Object i(Class paramClass)
  {
    try
    {
      paramClass = b.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  public static int j(Class paramClass)
  {
    int i1;
    if (h) {
      i1 = f.a(paramClass);
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public static int k(Class paramClass)
  {
    int i1;
    if (h) {
      i1 = f.b(paramClass);
    } else {
      i1 = -1;
    }
    return i1;
  }
  
  public static Field l()
  {
    if (d.c())
    {
      localField = n(Buffer.class, "effectiveDirectAddress");
      if (localField != null) {
        return localField;
      }
    }
    Field localField = n(Buffer.class, "address");
    if ((localField == null) || (localField.getType() != Long.TYPE)) {
      localField = null;
    }
    return localField;
  }
  
  public static boolean m(Class paramClass)
  {
    if (!d.c()) {
      return false;
    }
    try
    {
      Class localClass1 = c;
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
  public static Field n(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 380	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
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
  
  public static long o(Field paramField)
  {
    if (paramField != null)
    {
      e locale = f;
      if (locale != null)
      {
        l1 = locale.j(paramField);
        return l1;
      }
    }
    long l1 = -1L;
    return l1;
  }
  
  public static boolean p(Object paramObject, long paramLong)
  {
    return f.c(paramObject, paramLong);
  }
  
  public static boolean q(Object paramObject, long paramLong)
  {
    boolean bool;
    if (t(paramObject, paramLong) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean r(Object paramObject, long paramLong)
  {
    boolean bool;
    if (u(paramObject, paramLong) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static byte s(byte[] paramArrayOfByte, long paramLong)
  {
    return f.d(paramArrayOfByte, i + paramLong);
  }
  
  public static byte t(Object paramObject, long paramLong)
  {
    return (byte)(x(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static byte u(Object paramObject, long paramLong)
  {
    return (byte)(x(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static double v(Object paramObject, long paramLong)
  {
    return f.e(paramObject, paramLong);
  }
  
  public static float w(Object paramObject, long paramLong)
  {
    return f.f(paramObject, paramLong);
  }
  
  public static int x(Object paramObject, long paramLong)
  {
    return f.g(paramObject, paramLong);
  }
  
  public static long y(Object paramObject, long paramLong)
  {
    return f.h(paramObject, paramLong);
  }
  
  public static e z()
  {
    Unsafe localUnsafe = b;
    b localb = null;
    if (localUnsafe == null) {
      return null;
    }
    if (d.c())
    {
      if (d) {
        return new c(localUnsafe);
      }
      if (e) {
        localb = new b(localUnsafe);
      }
      return localb;
    }
    return new d(localUnsafe);
  }
  
  public static final class a
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
    extends p0.e
  {
    public b(Unsafe paramUnsafe)
    {
      super();
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
  
  public static final class c
    extends p0.e
  {
    public c(Unsafe paramUnsafe)
    {
      super();
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
  
  public static final class d
    extends p0.e
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
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */