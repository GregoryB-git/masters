package com.google.android.gms.internal.auth;

final class zzgk
{
  private static final Class zzb;
  private static final zzgz zzc;
  private static final zzgz zzd;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 16
    //   4: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   7: astore_1
    //   8: goto +6 -> 14
    //   11: astore_1
    //   12: aconst_null
    //   13: astore_1
    //   14: aload_1
    //   15: putstatic 24	com/google/android/gms/internal/auth/zzgk:zzb	Ljava/lang/Class;
    //   18: ldc 26
    //   20: invokestatic 22	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   23: astore_1
    //   24: goto +6 -> 30
    //   27: astore_1
    //   28: aconst_null
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull +8 -> 39
    //   34: aload_0
    //   35: astore_1
    //   36: goto +22 -> 58
    //   39: aload_1
    //   40: iconst_0
    //   41: anewarray 18	java/lang/Class
    //   44: invokevirtual 30	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   47: iconst_0
    //   48: anewarray 4	java/lang/Object
    //   51: invokevirtual 36	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   54: checkcast 38	com/google/android/gms/internal/auth/zzgz
    //   57: astore_1
    //   58: aload_1
    //   59: putstatic 40	com/google/android/gms/internal/auth/zzgk:zzc	Lcom/google/android/gms/internal/auth/zzgz;
    //   62: new 42	com/google/android/gms/internal/auth/zzhb
    //   65: dup
    //   66: invokespecial 45	com/google/android/gms/internal/auth/zzhb:<init>	()V
    //   69: putstatic 47	com/google/android/gms/internal/auth/zzgk:zzd	Lcom/google/android/gms/internal/auth/zzgz;
    //   72: return
    //   73: astore_1
    //   74: aload_0
    //   75: astore_1
    //   76: goto -18 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	74	0	localObject1	Object
    //   7	1	1	localClass1	Class
    //   11	1	1	localObject2	Object
    //   13	11	1	localClass2	Class
    //   27	1	1	localObject3	Object
    //   29	30	1	localObject4	Object
    //   73	1	1	localObject5	Object
    //   75	1	1	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	8	11	finally
    //   18	24	27	finally
    //   39	58	73	finally
  }
  
  public static zzgz zza()
  {
    return zzc;
  }
  
  public static zzgz zzb()
  {
    return zzd;
  }
  
  public static Object zzc(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, zzgz paramzzgz)
  {
    Object localObject = paramObject2;
    if (paramObject2 == null) {
      localObject = paramzzgz.zza(paramObject1);
    }
    paramzzgz.zzd(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  public static void zzd(zzgz paramzzgz, Object paramObject1, Object paramObject2)
  {
    paramzzgz.zzf(paramObject1, paramzzgz.zzc(paramzzgz.zzb(paramObject1), paramzzgz.zzb(paramObject2)));
  }
  
  public static void zze(Class paramClass)
  {
    if (!zzev.class.isAssignableFrom(paramClass))
    {
      Class localClass = zzb;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      }
    }
  }
  
  public static boolean zzf(Object paramObject1, Object paramObject2)
  {
    boolean bool = false;
    if (paramObject1 != paramObject2)
    {
      if (paramObject1 == null) {
        return bool;
      }
      if (!paramObject1.equals(paramObject2)) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */