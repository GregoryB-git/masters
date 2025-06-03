package ma;

import sun.misc.Unsafe;

public final class t1$d
  extends t1.e
{
  public t1$d(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
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

/* Location:
 * Qualified Name:     ma.t1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */