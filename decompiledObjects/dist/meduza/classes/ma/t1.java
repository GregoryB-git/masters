package ma;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public final class t1
{
  public static final Unsafe a;
  public static final Class<?> b;
  public static final e c;
  public static final boolean d;
  public static final boolean e;
  public static final long f;
  public static final long g;
  public static final boolean h;
  
  static
  {
    Object localObject = q();
    a = (Unsafe)localObject;
    b = d.a;
    boolean bool1 = f(Long.TYPE);
    boolean bool2 = f(Integer.TYPE);
    if (localObject != null)
    {
      if (!d.a()) {
        break label78;
      }
      if (bool1)
      {
        localObject = new c((Unsafe)localObject);
        break label87;
      }
      if (bool2)
      {
        localObject = new b((Unsafe)localObject);
        break label87;
      }
    }
    localObject = null;
    break label87;
    label78:
    localObject = new d((Unsafe)localObject);
    label87:
    c = (e)localObject;
    bool1 = false;
    if (localObject == null) {
      bool2 = false;
    } else {
      bool2 = ((e)localObject).u();
    }
    d = bool2;
    if (localObject == null) {
      bool2 = false;
    } else {
      bool2 = ((e)localObject).t();
    }
    e = bool2;
    f = c(byte[].class);
    c(boolean[].class);
    d(boolean[].class);
    c(int[].class);
    d(int[].class);
    c(long[].class);
    d(long[].class);
    c(float[].class);
    d(float[].class);
    c(double[].class);
    d(double[].class);
    c(Object[].class);
    d(Object[].class);
    Field localField = e();
    long l;
    if ((localField != null) && (localObject != null)) {
      l = ((e)localObject).l(localField);
    } else {
      l = -1L;
    }
    g = l;
    bool2 = bool1;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool2 = true;
    }
    h = bool2;
  }
  
  public static void a(Throwable paramThrowable)
  {
    Logger localLogger = Logger.getLogger(t1.class.getName());
    Level localLevel = Level.WARNING;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
    localStringBuilder.append(paramThrowable);
    localLogger.log(localLevel, localStringBuilder.toString());
  }
  
  public static <T> T b(Class<T> paramClass)
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
  
  public static int c(Class<?> paramClass)
  {
    int i;
    if (e) {
      i = c.a(paramClass);
    } else {
      i = -1;
    }
    return i;
  }
  
  public static void d(Class paramClass)
  {
    if (e) {
      c.b(paramClass);
    }
  }
  
  /* Error */
  public static Field e()
  {
    // Byte code:
    //   0: invokestatic 56	ma/d:a	()Z
    //   3: istore_0
    //   4: aconst_null
    //   5: astore_1
    //   6: iload_0
    //   7: ifeq +23 -> 30
    //   10: ldc -75
    //   12: ldc -73
    //   14: invokevirtual 187	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   17: astore_2
    //   18: goto +6 -> 24
    //   21: astore_2
    //   22: aconst_null
    //   23: astore_2
    //   24: aload_2
    //   25: ifnull +5 -> 30
    //   28: aload_2
    //   29: areturn
    //   30: ldc -75
    //   32: ldc -67
    //   34: invokevirtual 187	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   37: astore_2
    //   38: goto +6 -> 44
    //   41: astore_2
    //   42: aconst_null
    //   43: astore_2
    //   44: aload_1
    //   45: astore_3
    //   46: aload_2
    //   47: ifnull +17 -> 64
    //   50: aload_1
    //   51: astore_3
    //   52: aload_2
    //   53: invokevirtual 195	java/lang/reflect/Field:getType	()Ljava/lang/Class;
    //   56: getstatic 47	java/lang/Long:TYPE	Ljava/lang/Class;
    //   59: if_acmpne +5 -> 64
    //   62: aload_2
    //   63: astore_3
    //   64: aload_3
    //   65: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	4	0	bool	boolean
    //   5	46	1	localObject1	Object
    //   17	1	2	localField1	Field
    //   21	1	2	localObject2	Object
    //   23	15	2	localField2	Field
    //   41	1	2	localObject3	Object
    //   43	20	2	localObject4	Object
    //   45	20	3	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   10	18	21	finally
    //   30	38	41	finally
  }
  
  public static boolean f(Class<?> paramClass)
  {
    if (!d.a()) {
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
  
  public static boolean g(Object paramObject, long paramLong)
  {
    return c.d(paramObject, paramLong);
  }
  
  public static byte h(long paramLong)
  {
    return c.e(paramLong);
  }
  
  public static byte i(byte[] paramArrayOfByte, long paramLong)
  {
    return c.f(paramArrayOfByte, f + paramLong);
  }
  
  public static byte j(Object paramObject, long paramLong)
  {
    return (byte)(n(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static byte k(Object paramObject, long paramLong)
  {
    return (byte)(n(paramObject, 0xFFFFFFFFFFFFFFFC & paramLong) >>> (int)((paramLong & 0x3) << 3) & 0xFF);
  }
  
  public static double l(Object paramObject, long paramLong)
  {
    return c.g(paramObject, paramLong);
  }
  
  public static float m(Object paramObject, long paramLong)
  {
    return c.h(paramObject, paramLong);
  }
  
  public static int n(Object paramObject, long paramLong)
  {
    return c.i(paramObject, paramLong);
  }
  
  public static long o(Object paramObject, long paramLong)
  {
    return c.j(paramObject, paramLong);
  }
  
  public static Object p(Object paramObject, long paramLong)
  {
    return c.k(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe q()
  {
    // Byte code:
    //   0: new 6	ma/t1$a
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 261	ma/t1$a:<init>	()V
    //   8: aload_0
    //   9: invokestatic 267	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 165	sun/misc/Unsafe
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
  
  public static void r(Object paramObject, long paramLong, boolean paramBoolean)
  {
    c.m(paramObject, paramLong, paramBoolean);
  }
  
  public static void s(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    c.n(paramArrayOfByte, f + paramLong, paramByte);
  }
  
  public static void t(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = n(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    x(paramObject, (0xFF & paramByte) << j | i & 255 << j, l);
  }
  
  public static void u(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = n(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    x(paramObject, (0xFF & paramByte) << j | i & 255 << j, l);
  }
  
  public static void v(Object paramObject, long paramLong, double paramDouble)
  {
    c.o(paramObject, paramLong, paramDouble);
  }
  
  public static void w(Object paramObject, long paramLong, float paramFloat)
  {
    c.p(paramObject, paramLong, paramFloat);
  }
  
  public static void x(Object paramObject, int paramInt, long paramLong)
  {
    c.q(paramObject, paramInt, paramLong);
  }
  
  public static void y(Object paramObject, long paramLong1, long paramLong2)
  {
    c.r(paramObject, paramLong1, paramLong2);
  }
  
  public static void z(Object paramObject1, long paramLong, Object paramObject2)
  {
    c.s(paramObject1, paramLong, paramObject2);
  }
  
  public final class a
    implements PrivilegedExceptionAction<Unsafe>
  {
    public static Unsafe a()
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
    extends t1.e
  {
    public b(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void c(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean d(Object paramObject, long paramLong)
    {
      boolean bool1 = t1.h;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (t1.j(paramObject, paramLong) == 0) {
          bool3 = false;
        }
        return bool3;
      }
      if (t1.k(paramObject, paramLong) != 0) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public final byte e(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public final byte f(Object paramObject, long paramLong)
    {
      if (t1.h) {
        return t1.j(paramObject, paramLong);
      }
      return t1.k(paramObject, paramLong);
    }
    
    public final double g(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(j(paramObject, paramLong));
    }
    
    public final float h(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(i(paramObject, paramLong));
    }
    
    public final void m(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (t1.h) {
        t1.t(paramObject, paramLong, (byte)paramBoolean);
      } else {
        t1.u(paramObject, paramLong, (byte)paramBoolean);
      }
    }
    
    public final void n(Object paramObject, long paramLong, byte paramByte)
    {
      if (t1.h) {
        t1.t(paramObject, paramLong, paramByte);
      } else {
        t1.u(paramObject, paramLong, paramByte);
      }
    }
    
    public final void o(Object paramObject, long paramLong, double paramDouble)
    {
      r(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void p(Object paramObject, long paramLong, float paramFloat)
    {
      q(paramObject, Float.floatToIntBits(paramFloat), paramLong);
    }
    
    public final boolean u()
    {
      return false;
    }
  }
  
  public static final class c
    extends t1.e
  {
    public c(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void c(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean d(Object paramObject, long paramLong)
    {
      boolean bool1 = t1.h;
      boolean bool2 = true;
      boolean bool3 = true;
      if (bool1)
      {
        if (t1.j(paramObject, paramLong) == 0) {
          bool3 = false;
        }
        return bool3;
      }
      if (t1.k(paramObject, paramLong) != 0) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    
    public final byte e(long paramLong)
    {
      throw new UnsupportedOperationException();
    }
    
    public final byte f(Object paramObject, long paramLong)
    {
      if (t1.h) {
        return t1.j(paramObject, paramLong);
      }
      return t1.k(paramObject, paramLong);
    }
    
    public final double g(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(j(paramObject, paramLong));
    }
    
    public final float h(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(i(paramObject, paramLong));
    }
    
    public final void m(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (t1.h) {
        t1.t(paramObject, paramLong, (byte)paramBoolean);
      } else {
        t1.u(paramObject, paramLong, (byte)paramBoolean);
      }
    }
    
    public final void n(Object paramObject, long paramLong, byte paramByte)
    {
      if (t1.h) {
        t1.t(paramObject, paramLong, paramByte);
      } else {
        t1.u(paramObject, paramLong, paramByte);
      }
    }
    
    public final void o(Object paramObject, long paramLong, double paramDouble)
    {
      r(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void p(Object paramObject, long paramLong, float paramFloat)
    {
      q(paramObject, Float.floatToIntBits(paramFloat), paramLong);
    }
    
    public final boolean u()
    {
      return false;
    }
  }
  
  public static final class d
    extends t1.e
  {
    public d(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final void c(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3)
    {
      a.copyMemory(null, paramLong1, paramArrayOfByte, t1.f + paramLong2, paramLong3);
    }
    
    public final boolean d(Object paramObject, long paramLong)
    {
      return a.getBoolean(paramObject, paramLong);
    }
    
    public final byte e(long paramLong)
    {
      return a.getByte(paramLong);
    }
    
    public final byte f(Object paramObject, long paramLong)
    {
      return a.getByte(paramObject, paramLong);
    }
    
    public final double g(Object paramObject, long paramLong)
    {
      return a.getDouble(paramObject, paramLong);
    }
    
    public final float h(Object paramObject, long paramLong)
    {
      return a.getFloat(paramObject, paramLong);
    }
    
    public final void m(Object paramObject, long paramLong, boolean paramBoolean)
    {
      a.putBoolean(paramObject, paramLong, paramBoolean);
    }
    
    public final void n(Object paramObject, long paramLong, byte paramByte)
    {
      a.putByte(paramObject, paramLong, paramByte);
    }
    
    public final void o(Object paramObject, long paramLong, double paramDouble)
    {
      a.putDouble(paramObject, paramLong, paramDouble);
    }
    
    public final void p(Object paramObject, long paramLong, float paramFloat)
    {
      a.putFloat(paramObject, paramLong, paramFloat);
    }
    
    public final boolean t()
    {
      if (!super.t()) {
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
        t1.a(localThrowable);
      }
      return false;
    }
    
    /* Error */
    public final boolean u()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 18	ma/t1$e:a	Lsun/misc/Unsafe;
      //   4: astore_1
      //   5: aload_1
      //   6: ifnonnull +8 -> 14
      //   9: iconst_0
      //   10: istore_2
      //   11: goto +70 -> 81
      //   14: aload_1
      //   15: invokevirtual 80	java/lang/Object:getClass	()Ljava/lang/Class;
      //   18: astore_1
      //   19: aload_1
      //   20: ldc 118
      //   22: iconst_1
      //   23: anewarray 89	java/lang/Class
      //   26: dup
      //   27: iconst_0
      //   28: ldc 120
      //   30: aastore
      //   31: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   34: pop
      //   35: aload_1
      //   36: ldc 122
      //   38: iconst_2
      //   39: anewarray 89	java/lang/Class
      //   42: dup
      //   43: iconst_0
      //   44: ldc 76
      //   46: aastore
      //   47: dup
      //   48: iconst_1
      //   49: getstatic 86	java/lang/Long:TYPE	Ljava/lang/Class;
      //   52: aastore
      //   53: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   56: pop
      //   57: invokestatic 125	ma/t1:e	()Ljava/lang/reflect/Field;
      //   60: astore_1
      //   61: aload_1
      //   62: ifnonnull +6 -> 68
      //   65: goto -56 -> 9
      //   68: iconst_1
      //   69: istore_2
      //   70: goto +11 -> 81
      //   73: astore_1
      //   74: aload_1
      //   75: invokestatic 115	ma/t1:a	(Ljava/lang/Throwable;)V
      //   78: goto -69 -> 9
      //   81: iload_2
      //   82: ifne +5 -> 87
      //   85: iconst_0
      //   86: ireturn
      //   87: aload_0
      //   88: getfield 18	ma/t1$e:a	Lsun/misc/Unsafe;
      //   91: invokevirtual 80	java/lang/Object:getClass	()Ljava/lang/Class;
      //   94: astore_3
      //   95: getstatic 86	java/lang/Long:TYPE	Ljava/lang/Class;
      //   98: astore_1
      //   99: aload_3
      //   100: ldc 87
      //   102: iconst_1
      //   103: anewarray 89	java/lang/Class
      //   106: dup
      //   107: iconst_0
      //   108: aload_1
      //   109: aastore
      //   110: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   113: pop
      //   114: aload_3
      //   115: ldc 94
      //   117: iconst_2
      //   118: anewarray 89	java/lang/Class
      //   121: dup
      //   122: iconst_0
      //   123: aload_1
      //   124: aastore
      //   125: dup
      //   126: iconst_1
      //   127: getstatic 97	java/lang/Byte:TYPE	Ljava/lang/Class;
      //   130: aastore
      //   131: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   134: pop
      //   135: aload_3
      //   136: ldc 127
      //   138: iconst_1
      //   139: anewarray 89	java/lang/Class
      //   142: dup
      //   143: iconst_0
      //   144: aload_1
      //   145: aastore
      //   146: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   149: pop
      //   150: aload_3
      //   151: ldc -127
      //   153: iconst_2
      //   154: anewarray 89	java/lang/Class
      //   157: dup
      //   158: iconst_0
      //   159: aload_1
      //   160: aastore
      //   161: dup
      //   162: iconst_1
      //   163: getstatic 132	java/lang/Integer:TYPE	Ljava/lang/Class;
      //   166: aastore
      //   167: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   170: pop
      //   171: aload_3
      //   172: ldc 122
      //   174: iconst_1
      //   175: anewarray 89	java/lang/Class
      //   178: dup
      //   179: iconst_0
      //   180: aload_1
      //   181: aastore
      //   182: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   185: pop
      //   186: aload_3
      //   187: ldc -122
      //   189: iconst_2
      //   190: anewarray 89	java/lang/Class
      //   193: dup
      //   194: iconst_0
      //   195: aload_1
      //   196: aastore
      //   197: dup
      //   198: iconst_1
      //   199: aload_1
      //   200: aastore
      //   201: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   204: pop
      //   205: aload_3
      //   206: ldc -121
      //   208: iconst_3
      //   209: anewarray 89	java/lang/Class
      //   212: dup
      //   213: iconst_0
      //   214: aload_1
      //   215: aastore
      //   216: dup
      //   217: iconst_1
      //   218: aload_1
      //   219: aastore
      //   220: dup
      //   221: iconst_2
      //   222: aload_1
      //   223: aastore
      //   224: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   227: pop
      //   228: aload_3
      //   229: ldc -121
      //   231: iconst_5
      //   232: anewarray 89	java/lang/Class
      //   235: dup
      //   236: iconst_0
      //   237: ldc 76
      //   239: aastore
      //   240: dup
      //   241: iconst_1
      //   242: aload_1
      //   243: aastore
      //   244: dup
      //   245: iconst_2
      //   246: ldc 76
      //   248: aastore
      //   249: dup
      //   250: iconst_3
      //   251: aload_1
      //   252: aastore
      //   253: dup
      //   254: iconst_4
      //   255: aload_1
      //   256: aastore
      //   257: invokevirtual 93	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   260: pop
      //   261: iconst_1
      //   262: ireturn
      //   263: astore_1
      //   264: aload_1
      //   265: invokestatic 115	ma/t1:a	(Ljava/lang/Throwable;)V
      //   268: iconst_0
      //   269: ireturn
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	270	0	this	d
      //   4	58	1	localObject	Object
      //   73	2	1	localThrowable1	Throwable
      //   98	158	1	localClass1	Class
      //   263	2	1	localThrowable2	Throwable
      //   10	72	2	i	int
      //   94	135	3	localClass2	Class
      // Exception table:
      //   from	to	target	type
      //   14	61	73	finally
      //   87	261	263	finally
    }
  }
  
  public static abstract class e
  {
    public Unsafe a;
    
    public e(Unsafe paramUnsafe)
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
}

/* Location:
 * Qualified Name:     ma.t1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */