package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

final class zzps
{
  public static final long zza;
  public static final boolean zzb;
  private static final Unsafe zzc;
  private static final Class zzd;
  private static final boolean zze;
  private static final zzpr zzf;
  private static final boolean zzg;
  private static final boolean zzh;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 22	com/google/android/recaptcha/internal/zzps:zzg	()Lsun/misc/Unsafe;
    //   3: astore_0
    //   4: aload_0
    //   5: putstatic 24	com/google/android/recaptcha/internal/zzps:zzc	Lsun/misc/Unsafe;
    //   8: getstatic 29	com/google/android/recaptcha/internal/zzks:zza	I
    //   11: istore_1
    //   12: ldc 31
    //   14: putstatic 33	com/google/android/recaptcha/internal/zzps:zzd	Ljava/lang/Class;
    //   17: getstatic 38	java/lang/Long:TYPE	Ljava/lang/Class;
    //   20: astore_2
    //   21: aload_2
    //   22: invokestatic 42	com/google/android/recaptcha/internal/zzps:zzv	(Ljava/lang/Class;)Z
    //   25: istore_3
    //   26: iload_3
    //   27: putstatic 44	com/google/android/recaptcha/internal/zzps:zze	Z
    //   30: getstatic 47	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   33: invokestatic 42	com/google/android/recaptcha/internal/zzps:zzv	(Ljava/lang/Class;)Z
    //   36: istore 4
    //   38: aconst_null
    //   39: astore 5
    //   41: aload_0
    //   42: ifnonnull +6 -> 48
    //   45: goto +35 -> 80
    //   48: iload_3
    //   49: ifeq +16 -> 65
    //   52: new 49	com/google/android/recaptcha/internal/zzpq
    //   55: dup
    //   56: aload_0
    //   57: invokespecial 53	com/google/android/recaptcha/internal/zzpq:<init>	(Lsun/misc/Unsafe;)V
    //   60: astore 5
    //   62: goto +18 -> 80
    //   65: iload 4
    //   67: ifeq +13 -> 80
    //   70: new 55	com/google/android/recaptcha/internal/zzpp
    //   73: dup
    //   74: aload_0
    //   75: invokespecial 56	com/google/android/recaptcha/internal/zzpp:<init>	(Lsun/misc/Unsafe;)V
    //   78: astore 5
    //   80: aload 5
    //   82: putstatic 58	com/google/android/recaptcha/internal/zzps:zzf	Lcom/google/android/recaptcha/internal/zzpr;
    //   85: iconst_1
    //   86: istore 4
    //   88: aload 5
    //   90: ifnonnull +8 -> 98
    //   93: iconst_0
    //   94: istore_3
    //   95: goto +83 -> 178
    //   98: aload 5
    //   100: getfield 62	com/google/android/recaptcha/internal/zzpr:zza	Lsun/misc/Unsafe;
    //   103: astore 5
    //   105: aload 5
    //   107: invokevirtual 66	java/lang/Object:getClass	()Ljava/lang/Class;
    //   110: astore 5
    //   112: aload 5
    //   114: ldc 68
    //   116: iconst_1
    //   117: anewarray 70	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc 72
    //   124: aastore
    //   125: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   128: pop
    //   129: aload 5
    //   131: ldc 78
    //   133: iconst_2
    //   134: anewarray 70	java/lang/Class
    //   137: dup
    //   138: iconst_0
    //   139: ldc 4
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: aload_2
    //   145: aastore
    //   146: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   149: pop
    //   150: invokestatic 82	com/google/android/recaptcha/internal/zzps:zzB	()Ljava/lang/reflect/Field;
    //   153: astore 5
    //   155: aload 5
    //   157: ifnonnull +6 -> 163
    //   160: goto -67 -> 93
    //   163: iconst_1
    //   164: istore_3
    //   165: goto +13 -> 178
    //   168: astore 5
    //   170: aload 5
    //   172: invokestatic 85	com/google/android/recaptcha/internal/zzps:zzh	(Ljava/lang/Throwable;)V
    //   175: goto -82 -> 93
    //   178: iload_3
    //   179: putstatic 87	com/google/android/recaptcha/internal/zzps:zzg	Z
    //   182: getstatic 58	com/google/android/recaptcha/internal/zzps:zzf	Lcom/google/android/recaptcha/internal/zzpr;
    //   185: astore 5
    //   187: aload 5
    //   189: ifnonnull +8 -> 197
    //   192: iconst_0
    //   193: istore_3
    //   194: goto +228 -> 422
    //   197: aload 5
    //   199: getfield 62	com/google/android/recaptcha/internal/zzpr:zza	Lsun/misc/Unsafe;
    //   202: astore 5
    //   204: aload 5
    //   206: invokevirtual 66	java/lang/Object:getClass	()Ljava/lang/Class;
    //   209: astore 5
    //   211: aload 5
    //   213: ldc 68
    //   215: iconst_1
    //   216: anewarray 70	java/lang/Class
    //   219: dup
    //   220: iconst_0
    //   221: ldc 72
    //   223: aastore
    //   224: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   227: pop
    //   228: aload 5
    //   230: ldc 89
    //   232: iconst_1
    //   233: anewarray 70	java/lang/Class
    //   236: dup
    //   237: iconst_0
    //   238: ldc 70
    //   240: aastore
    //   241: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   244: pop
    //   245: aload 5
    //   247: ldc 91
    //   249: iconst_1
    //   250: anewarray 70	java/lang/Class
    //   253: dup
    //   254: iconst_0
    //   255: ldc 70
    //   257: aastore
    //   258: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   261: pop
    //   262: getstatic 38	java/lang/Long:TYPE	Ljava/lang/Class;
    //   265: astore_2
    //   266: aload 5
    //   268: ldc 93
    //   270: iconst_2
    //   271: anewarray 70	java/lang/Class
    //   274: dup
    //   275: iconst_0
    //   276: ldc 4
    //   278: aastore
    //   279: dup
    //   280: iconst_1
    //   281: aload_2
    //   282: aastore
    //   283: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   286: pop
    //   287: aload 5
    //   289: ldc 95
    //   291: iconst_3
    //   292: anewarray 70	java/lang/Class
    //   295: dup
    //   296: iconst_0
    //   297: ldc 4
    //   299: aastore
    //   300: dup
    //   301: iconst_1
    //   302: aload_2
    //   303: aastore
    //   304: dup
    //   305: iconst_2
    //   306: getstatic 47	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   309: aastore
    //   310: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   313: pop
    //   314: aload 5
    //   316: ldc 78
    //   318: iconst_2
    //   319: anewarray 70	java/lang/Class
    //   322: dup
    //   323: iconst_0
    //   324: ldc 4
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: aload_2
    //   330: aastore
    //   331: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   334: pop
    //   335: aload 5
    //   337: ldc 97
    //   339: iconst_3
    //   340: anewarray 70	java/lang/Class
    //   343: dup
    //   344: iconst_0
    //   345: ldc 4
    //   347: aastore
    //   348: dup
    //   349: iconst_1
    //   350: aload_2
    //   351: aastore
    //   352: dup
    //   353: iconst_2
    //   354: aload_2
    //   355: aastore
    //   356: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   359: pop
    //   360: aload 5
    //   362: ldc 99
    //   364: iconst_2
    //   365: anewarray 70	java/lang/Class
    //   368: dup
    //   369: iconst_0
    //   370: ldc 4
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: aload_2
    //   376: aastore
    //   377: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   380: pop
    //   381: aload 5
    //   383: ldc 101
    //   385: iconst_3
    //   386: anewarray 70	java/lang/Class
    //   389: dup
    //   390: iconst_0
    //   391: ldc 4
    //   393: aastore
    //   394: dup
    //   395: iconst_1
    //   396: aload_2
    //   397: aastore
    //   398: dup
    //   399: iconst_2
    //   400: ldc 4
    //   402: aastore
    //   403: invokevirtual 76	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   406: pop
    //   407: iconst_1
    //   408: istore_3
    //   409: goto +13 -> 422
    //   412: astore 5
    //   414: aload 5
    //   416: invokestatic 85	com/google/android/recaptcha/internal/zzps:zzh	(Ljava/lang/Throwable;)V
    //   419: goto -227 -> 192
    //   422: iload_3
    //   423: putstatic 103	com/google/android/recaptcha/internal/zzps:zzh	Z
    //   426: ldc 105
    //   428: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   431: i2l
    //   432: putstatic 111	com/google/android/recaptcha/internal/zzps:zza	J
    //   435: ldc 113
    //   437: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   440: pop
    //   441: ldc 113
    //   443: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   446: pop
    //   447: ldc 118
    //   449: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   452: pop
    //   453: ldc 118
    //   455: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   458: pop
    //   459: ldc 120
    //   461: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   464: pop
    //   465: ldc 120
    //   467: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   470: pop
    //   471: ldc 122
    //   473: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   476: pop
    //   477: ldc 122
    //   479: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   482: pop
    //   483: ldc 124
    //   485: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   488: pop
    //   489: ldc 124
    //   491: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   494: pop
    //   495: ldc 126
    //   497: invokestatic 109	com/google/android/recaptcha/internal/zzps:zzz	(Ljava/lang/Class;)I
    //   500: pop
    //   501: ldc 126
    //   503: invokestatic 116	com/google/android/recaptcha/internal/zzps:zzA	(Ljava/lang/Class;)I
    //   506: pop
    //   507: invokestatic 82	com/google/android/recaptcha/internal/zzps:zzB	()Ljava/lang/reflect/Field;
    //   510: astore_2
    //   511: aload_2
    //   512: ifnull +23 -> 535
    //   515: getstatic 58	com/google/android/recaptcha/internal/zzps:zzf	Lcom/google/android/recaptcha/internal/zzpr;
    //   518: astore 5
    //   520: aload 5
    //   522: ifnull +13 -> 535
    //   525: aload 5
    //   527: getfield 62	com/google/android/recaptcha/internal/zzpr:zza	Lsun/misc/Unsafe;
    //   530: aload_2
    //   531: invokevirtual 131	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   534: pop2
    //   535: invokestatic 137	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   538: getstatic 141	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   541: if_acmpne +9 -> 550
    //   544: iload 4
    //   546: istore_3
    //   547: goto +5 -> 552
    //   550: iconst_0
    //   551: istore_3
    //   552: iload_3
    //   553: putstatic 143	com/google/android/recaptcha/internal/zzps:zzb	Z
    //   556: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	72	0	localUnsafe	Unsafe
    //   11	1	1	i	int
    //   20	511	2	localObject1	Object
    //   25	528	3	bool1	boolean
    //   36	509	4	bool2	boolean
    //   39	117	5	localObject2	Object
    //   168	3	5	localThrowable1	Throwable
    //   185	197	5	localObject3	Object
    //   412	3	5	localThrowable2	Throwable
    //   518	8	5	localzzpr	zzpr
    // Exception table:
    //   from	to	target	type
    //   105	155	168	finally
    //   204	407	412	finally
  }
  
  private static int zzA(Class paramClass)
  {
    if (zzh) {
      return zzfzza.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  private static Field zzB()
  {
    int i = zzks.zza;
    Field localField1 = zzC(Buffer.class, "effectiveDirectAddress");
    Field localField2 = localField1;
    if (localField1 == null)
    {
      localField2 = zzC(Buffer.class, "address");
      if ((localField2 != null) && (localField2.getType() == Long.TYPE)) {
        return localField2;
      }
      localField2 = null;
    }
    return localField2;
  }
  
  /* Error */
  private static Field zzC(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 165	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
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
  
  private static void zzD(Object paramObject, long paramLong, byte paramByte)
  {
    zzpr localzzpr = zzf;
    Unsafe localUnsafe = zza;
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = localUnsafe.getInt(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    zza.putInt(paramObject, l, (0xFF & paramByte) << j | i & 255 << j);
  }
  
  private static void zzE(Object paramObject, long paramLong, byte paramByte)
  {
    zzpr localzzpr = zzf;
    Unsafe localUnsafe = zza;
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = localUnsafe.getInt(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    zza.putInt(paramObject, l, (0xFF & paramByte) << j | i & 255 << j);
  }
  
  public static double zza(Object paramObject, long paramLong)
  {
    return zzf.zza(paramObject, paramLong);
  }
  
  public static float zzb(Object paramObject, long paramLong)
  {
    return zzf.zzb(paramObject, paramLong);
  }
  
  public static int zzc(Object paramObject, long paramLong)
  {
    return zzfzza.getInt(paramObject, paramLong);
  }
  
  public static long zzd(Object paramObject, long paramLong)
  {
    return zzfzza.getLong(paramObject, paramLong);
  }
  
  public static Object zze(Class paramClass)
  {
    try
    {
      paramClass = zzc.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  public static Object zzf(Object paramObject, long paramLong)
  {
    return zzfzza.getObject(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe zzg()
  {
    // Byte code:
    //   0: new 200	com/google/android/recaptcha/internal/zzpo
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 201	com/google/android/recaptcha/internal/zzpo:<init>	()V
    //   8: aload_0
    //   9: invokestatic 207	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 128	sun/misc/Unsafe
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
  
  public static void zzm(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzf.zzc(paramObject, paramLong, paramBoolean);
  }
  
  public static void zzn(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    zzf.zzd(paramArrayOfByte, zza + paramLong, paramByte);
  }
  
  public static void zzo(Object paramObject, long paramLong, double paramDouble)
  {
    zzf.zze(paramObject, paramLong, paramDouble);
  }
  
  public static void zzp(Object paramObject, long paramLong, float paramFloat)
  {
    zzf.zzf(paramObject, paramLong, paramFloat);
  }
  
  public static void zzq(Object paramObject, long paramLong, int paramInt)
  {
    zzfzza.putInt(paramObject, paramLong, paramInt);
  }
  
  public static void zzr(Object paramObject, long paramLong1, long paramLong2)
  {
    zzfzza.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public static void zzs(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzfzza.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public static boolean zzv(Class paramClass)
  {
    int i = zzks.zza;
    try
    {
      Class localClass1 = zzd;
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
  
  public static boolean zzw(Object paramObject, long paramLong)
  {
    return zzf.zzg(paramObject, paramLong);
  }
  
  public static boolean zzx()
  {
    return zzh;
  }
  
  public static boolean zzy()
  {
    return zzg;
  }
  
  private static int zzz(Class paramClass)
  {
    if (zzh) {
      return zzfzza.arrayBaseOffset(paramClass);
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */