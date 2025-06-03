package com.google.android.gms.internal.auth;

import java.lang.reflect.Field;
import java.nio.Buffer;
import sun.misc.Unsafe;

final class zzhj
{
  public static final boolean zza;
  private static final Unsafe zzb;
  private static final Class zzc;
  private static final boolean zzd;
  private static final zzhi zze;
  private static final boolean zzf;
  private static final boolean zzg;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: invokestatic 20	com/google/android/gms/internal/auth/zzhj:zzg	()Lsun/misc/Unsafe;
    //   3: astore_0
    //   4: aload_0
    //   5: putstatic 22	com/google/android/gms/internal/auth/zzhj:zzb	Lsun/misc/Unsafe;
    //   8: getstatic 27	com/google/android/gms/internal/auth/zzds:zza	I
    //   11: istore_1
    //   12: ldc 29
    //   14: putstatic 31	com/google/android/gms/internal/auth/zzhj:zzc	Ljava/lang/Class;
    //   17: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   20: astore_2
    //   21: aload_2
    //   22: invokestatic 40	com/google/android/gms/internal/auth/zzhj:zzs	(Ljava/lang/Class;)Z
    //   25: istore_3
    //   26: iload_3
    //   27: putstatic 42	com/google/android/gms/internal/auth/zzhj:zzd	Z
    //   30: getstatic 45	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   33: invokestatic 40	com/google/android/gms/internal/auth/zzhj:zzs	(Ljava/lang/Class;)Z
    //   36: istore 4
    //   38: aconst_null
    //   39: astore 5
    //   41: aload_0
    //   42: ifnonnull +6 -> 48
    //   45: goto +35 -> 80
    //   48: iload_3
    //   49: ifeq +16 -> 65
    //   52: new 47	com/google/android/gms/internal/auth/zzhh
    //   55: dup
    //   56: aload_0
    //   57: invokespecial 51	com/google/android/gms/internal/auth/zzhh:<init>	(Lsun/misc/Unsafe;)V
    //   60: astore 5
    //   62: goto +18 -> 80
    //   65: iload 4
    //   67: ifeq +13 -> 80
    //   70: new 53	com/google/android/gms/internal/auth/zzhg
    //   73: dup
    //   74: aload_0
    //   75: invokespecial 54	com/google/android/gms/internal/auth/zzhg:<init>	(Lsun/misc/Unsafe;)V
    //   78: astore 5
    //   80: aload 5
    //   82: putstatic 56	com/google/android/gms/internal/auth/zzhj:zze	Lcom/google/android/gms/internal/auth/zzhi;
    //   85: iconst_1
    //   86: istore 4
    //   88: aload 5
    //   90: ifnonnull +8 -> 98
    //   93: iconst_0
    //   94: istore_3
    //   95: goto +83 -> 178
    //   98: aload 5
    //   100: getfield 60	com/google/android/gms/internal/auth/zzhi:zza	Lsun/misc/Unsafe;
    //   103: astore 5
    //   105: aload 5
    //   107: invokevirtual 64	java/lang/Object:getClass	()Ljava/lang/Class;
    //   110: astore 5
    //   112: aload 5
    //   114: ldc 66
    //   116: iconst_1
    //   117: anewarray 68	java/lang/Class
    //   120: dup
    //   121: iconst_0
    //   122: ldc 70
    //   124: aastore
    //   125: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   128: pop
    //   129: aload 5
    //   131: ldc 76
    //   133: iconst_2
    //   134: anewarray 68	java/lang/Class
    //   137: dup
    //   138: iconst_0
    //   139: ldc 4
    //   141: aastore
    //   142: dup
    //   143: iconst_1
    //   144: aload_2
    //   145: aastore
    //   146: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   149: pop
    //   150: invokestatic 80	com/google/android/gms/internal/auth/zzhj:zzy	()Ljava/lang/reflect/Field;
    //   153: astore 5
    //   155: aload 5
    //   157: ifnonnull +6 -> 163
    //   160: goto -67 -> 93
    //   163: iconst_1
    //   164: istore_3
    //   165: goto +13 -> 178
    //   168: astore 5
    //   170: aload 5
    //   172: invokestatic 84	com/google/android/gms/internal/auth/zzhj:zzh	(Ljava/lang/Throwable;)V
    //   175: goto -82 -> 93
    //   178: iload_3
    //   179: putstatic 86	com/google/android/gms/internal/auth/zzhj:zzf	Z
    //   182: getstatic 56	com/google/android/gms/internal/auth/zzhj:zze	Lcom/google/android/gms/internal/auth/zzhi;
    //   185: astore 5
    //   187: aload 5
    //   189: ifnonnull +8 -> 197
    //   192: iconst_0
    //   193: istore_3
    //   194: goto +228 -> 422
    //   197: aload 5
    //   199: getfield 60	com/google/android/gms/internal/auth/zzhi:zza	Lsun/misc/Unsafe;
    //   202: astore 5
    //   204: aload 5
    //   206: invokevirtual 64	java/lang/Object:getClass	()Ljava/lang/Class;
    //   209: astore 5
    //   211: aload 5
    //   213: ldc 66
    //   215: iconst_1
    //   216: anewarray 68	java/lang/Class
    //   219: dup
    //   220: iconst_0
    //   221: ldc 70
    //   223: aastore
    //   224: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   227: pop
    //   228: aload 5
    //   230: ldc 88
    //   232: iconst_1
    //   233: anewarray 68	java/lang/Class
    //   236: dup
    //   237: iconst_0
    //   238: ldc 68
    //   240: aastore
    //   241: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   244: pop
    //   245: aload 5
    //   247: ldc 90
    //   249: iconst_1
    //   250: anewarray 68	java/lang/Class
    //   253: dup
    //   254: iconst_0
    //   255: ldc 68
    //   257: aastore
    //   258: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   261: pop
    //   262: getstatic 36	java/lang/Long:TYPE	Ljava/lang/Class;
    //   265: astore_2
    //   266: aload 5
    //   268: ldc 92
    //   270: iconst_2
    //   271: anewarray 68	java/lang/Class
    //   274: dup
    //   275: iconst_0
    //   276: ldc 4
    //   278: aastore
    //   279: dup
    //   280: iconst_1
    //   281: aload_2
    //   282: aastore
    //   283: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   286: pop
    //   287: aload 5
    //   289: ldc 94
    //   291: iconst_3
    //   292: anewarray 68	java/lang/Class
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
    //   306: getstatic 45	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   309: aastore
    //   310: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   313: pop
    //   314: aload 5
    //   316: ldc 76
    //   318: iconst_2
    //   319: anewarray 68	java/lang/Class
    //   322: dup
    //   323: iconst_0
    //   324: ldc 4
    //   326: aastore
    //   327: dup
    //   328: iconst_1
    //   329: aload_2
    //   330: aastore
    //   331: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   334: pop
    //   335: aload 5
    //   337: ldc 96
    //   339: iconst_3
    //   340: anewarray 68	java/lang/Class
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
    //   356: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   359: pop
    //   360: aload 5
    //   362: ldc 98
    //   364: iconst_2
    //   365: anewarray 68	java/lang/Class
    //   368: dup
    //   369: iconst_0
    //   370: ldc 4
    //   372: aastore
    //   373: dup
    //   374: iconst_1
    //   375: aload_2
    //   376: aastore
    //   377: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   380: pop
    //   381: aload 5
    //   383: ldc 100
    //   385: iconst_3
    //   386: anewarray 68	java/lang/Class
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
    //   403: invokevirtual 74	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   406: pop
    //   407: iconst_1
    //   408: istore_3
    //   409: goto +13 -> 422
    //   412: astore 5
    //   414: aload 5
    //   416: invokestatic 84	com/google/android/gms/internal/auth/zzhj:zzh	(Ljava/lang/Throwable;)V
    //   419: goto -227 -> 192
    //   422: iload_3
    //   423: putstatic 102	com/google/android/gms/internal/auth/zzhj:zzg	Z
    //   426: ldc 104
    //   428: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   431: pop
    //   432: ldc 110
    //   434: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   437: pop
    //   438: ldc 110
    //   440: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   443: pop
    //   444: ldc 115
    //   446: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   449: pop
    //   450: ldc 115
    //   452: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   455: pop
    //   456: ldc 117
    //   458: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   461: pop
    //   462: ldc 117
    //   464: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   467: pop
    //   468: ldc 119
    //   470: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   473: pop
    //   474: ldc 119
    //   476: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   479: pop
    //   480: ldc 121
    //   482: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   485: pop
    //   486: ldc 121
    //   488: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   491: pop
    //   492: ldc 123
    //   494: invokestatic 108	com/google/android/gms/internal/auth/zzhj:zzw	(Ljava/lang/Class;)I
    //   497: pop
    //   498: ldc 123
    //   500: invokestatic 113	com/google/android/gms/internal/auth/zzhj:zzx	(Ljava/lang/Class;)I
    //   503: pop
    //   504: invokestatic 80	com/google/android/gms/internal/auth/zzhj:zzy	()Ljava/lang/reflect/Field;
    //   507: astore 5
    //   509: aload 5
    //   511: ifnull +21 -> 532
    //   514: getstatic 56	com/google/android/gms/internal/auth/zzhj:zze	Lcom/google/android/gms/internal/auth/zzhi;
    //   517: astore_2
    //   518: aload_2
    //   519: ifnull +13 -> 532
    //   522: aload_2
    //   523: getfield 60	com/google/android/gms/internal/auth/zzhi:zza	Lsun/misc/Unsafe;
    //   526: aload 5
    //   528: invokevirtual 128	sun/misc/Unsafe:objectFieldOffset	(Ljava/lang/reflect/Field;)J
    //   531: pop2
    //   532: invokestatic 134	java/nio/ByteOrder:nativeOrder	()Ljava/nio/ByteOrder;
    //   535: getstatic 138	java/nio/ByteOrder:BIG_ENDIAN	Ljava/nio/ByteOrder;
    //   538: if_acmpne +9 -> 547
    //   541: iload 4
    //   543: istore_3
    //   544: goto +5 -> 549
    //   547: iconst_0
    //   548: istore_3
    //   549: iload_3
    //   550: putstatic 140	com/google/android/gms/internal/auth/zzhj:zza	Z
    //   553: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   3	72	0	localUnsafe	Unsafe
    //   11	1	1	i	int
    //   20	503	2	localObject1	Object
    //   25	525	3	bool1	boolean
    //   36	506	4	bool2	boolean
    //   39	117	5	localObject2	Object
    //   168	3	5	localThrowable1	Throwable
    //   185	197	5	localObject3	Object
    //   412	3	5	localThrowable2	Throwable
    //   507	20	5	localField	Field
    // Exception table:
    //   from	to	target	type
    //   105	155	168	finally
    //   204	407	412	finally
  }
  
  public static double zza(Object paramObject, long paramLong)
  {
    return zze.zza(paramObject, paramLong);
  }
  
  public static float zzb(Object paramObject, long paramLong)
  {
    return zze.zzb(paramObject, paramLong);
  }
  
  public static int zzc(Object paramObject, long paramLong)
  {
    return zzezza.getInt(paramObject, paramLong);
  }
  
  public static long zzd(Object paramObject, long paramLong)
  {
    return zzezza.getLong(paramObject, paramLong);
  }
  
  public static Object zze(Class paramClass)
  {
    try
    {
      paramClass = zzb.allocateInstance(paramClass);
      return paramClass;
    }
    catch (InstantiationException paramClass)
    {
      throw new IllegalStateException(paramClass);
    }
  }
  
  public static Object zzf(Object paramObject, long paramLong)
  {
    return zzezza.getObject(paramObject, paramLong);
  }
  
  /* Error */
  public static Unsafe zzg()
  {
    // Byte code:
    //   0: new 170	com/google/android/gms/internal/auth/zzhf
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 171	com/google/android/gms/internal/auth/zzhf:<init>	()V
    //   8: aload_0
    //   9: invokestatic 177	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 125	sun/misc/Unsafe
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
  
  public static void zzk(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zze.zzc(paramObject, paramLong, paramBoolean);
  }
  
  public static void zzl(Object paramObject, long paramLong, double paramDouble)
  {
    zze.zzd(paramObject, paramLong, paramDouble);
  }
  
  public static void zzm(Object paramObject, long paramLong, float paramFloat)
  {
    zze.zze(paramObject, paramLong, paramFloat);
  }
  
  public static void zzn(Object paramObject, long paramLong, int paramInt)
  {
    zzezza.putInt(paramObject, paramLong, paramInt);
  }
  
  public static void zzo(Object paramObject, long paramLong1, long paramLong2)
  {
    zzezza.putLong(paramObject, paramLong1, paramLong2);
  }
  
  public static void zzp(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzezza.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public static boolean zzs(Class paramClass)
  {
    int i = zzds.zza;
    try
    {
      Class localClass1 = zzc;
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
  
  public static boolean zzt(Object paramObject, long paramLong)
  {
    return zze.zzf(paramObject, paramLong);
  }
  
  public static boolean zzu()
  {
    return zzg;
  }
  
  public static boolean zzv()
  {
    return zzf;
  }
  
  private static int zzw(Class paramClass)
  {
    if (zzg) {
      return zzezza.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  private static int zzx(Class paramClass)
  {
    if (zzg) {
      return zzezza.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  private static Field zzy()
  {
    int i = zzds.zza;
    Field localField1 = zzz(Buffer.class, "effectiveDirectAddress");
    Field localField2 = localField1;
    if (localField1 == null)
    {
      localField2 = zzz(Buffer.class, "address");
      if ((localField2 != null) && (localField2.getType() == Long.TYPE)) {
        return localField2;
      }
      localField2 = null;
    }
    return localField2;
  }
  
  /* Error */
  private static Field zzz(Class paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 294	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */