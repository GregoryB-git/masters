package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

final class zzmz
{
  public static final boolean zza;
  private static final Unsafe zzb;
  private static final Class<?> zzc;
  private static final boolean zzd;
  private static final boolean zze;
  private static final zzc zzf;
  private static final boolean zzg;
  private static final boolean zzh;
  private static final long zzi;
  
  static
  {
    Object localObject = zzb();
    zzb = (Unsafe)localObject;
    zzc = zzir.zza();
    boolean bool1 = zzd(Long.TYPE);
    zzd = bool1;
    boolean bool2 = zzd(Integer.TYPE);
    zze = bool2;
    if (localObject != null)
    {
      if (bool1)
      {
        localObject = new zza((Unsafe)localObject);
        break label74;
      }
      if (bool2)
      {
        localObject = new zzb((Unsafe)localObject);
        break label74;
      }
    }
    localObject = null;
    label74:
    zzf = (zzc)localObject;
    bool1 = false;
    if (localObject == null) {
      bool2 = false;
    } else {
      bool2 = ((zzc)localObject).zzb();
    }
    zzg = bool2;
    if (localObject == null) {
      bool2 = false;
    } else {
      bool2 = ((zzc)localObject).zza();
    }
    zzh = bool2;
    zzi = zzb(byte[].class);
    zzb(boolean[].class);
    zzc(boolean[].class);
    zzb(int[].class);
    zzc(int[].class);
    zzb(long[].class);
    zzc(long[].class);
    zzb(float[].class);
    zzc(float[].class);
    zzb(double[].class);
    zzc(double[].class);
    zzb(Object[].class);
    zzc(Object[].class);
    Field localField = zze();
    if ((localField != null) && (localObject != null)) {
      zza.objectFieldOffset(localField);
    }
    bool2 = bool1;
    if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
      bool2 = true;
    }
    zza = bool2;
  }
  
  public static double zza(Object paramObject, long paramLong)
  {
    return zzf.zza(paramObject, paramLong);
  }
  
  public static <T> T zza(Class<T> paramClass)
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
  
  /* Error */
  private static Field zza(Class<?> paramClass, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 140	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   5: astore_0
    //   6: goto +6 -> 12
    //   9: astore_0
    //   10: aconst_null
    //   11: astore_0
    //   12: aload_0
    //   13: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	14	0	paramClass	Class<?>
    //   0	14	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   0	6	9	finally
  }
  
  public static void zza(Object paramObject, long paramLong, double paramDouble)
  {
    zzf.zza(paramObject, paramLong, paramDouble);
  }
  
  public static void zza(Object paramObject, long paramLong, float paramFloat)
  {
    zzf.zza(paramObject, paramLong, paramFloat);
  }
  
  public static void zza(Object paramObject, long paramLong, int paramInt)
  {
    zzf.zza(paramObject, paramLong, paramInt);
  }
  
  public static void zza(Object paramObject, long paramLong1, long paramLong2)
  {
    zzf.zza(paramObject, paramLong1, paramLong2);
  }
  
  public static void zza(Object paramObject1, long paramLong, Object paramObject2)
  {
    zzfzza.putObject(paramObject1, paramLong, paramObject2);
  }
  
  public static void zza(byte[] paramArrayOfByte, long paramLong, byte paramByte)
  {
    zzf.zza(paramArrayOfByte, zzi + paramLong, paramByte);
  }
  
  public static float zzb(Object paramObject, long paramLong)
  {
    return zzf.zzb(paramObject, paramLong);
  }
  
  private static int zzb(Class<?> paramClass)
  {
    if (zzh) {
      return zzfzza.arrayBaseOffset(paramClass);
    }
    return -1;
  }
  
  /* Error */
  public static Unsafe zzb()
  {
    // Byte code:
    //   0: new 211	com/google/android/gms/internal/measurement/zzmy
    //   3: astore_0
    //   4: aload_0
    //   5: invokespecial 212	com/google/android/gms/internal/measurement/zzmy:<init>	()V
    //   8: aload_0
    //   9: invokestatic 218	java/security/AccessController:doPrivileged	(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;
    //   12: checkcast 98	sun/misc/Unsafe
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
  
  private static int zzc(Class<?> paramClass)
  {
    if (zzh) {
      return zzfzza.arrayIndexScale(paramClass);
    }
    return -1;
  }
  
  public static int zzc(Object paramObject, long paramLong)
  {
    return zzf.zzd(paramObject, paramLong);
  }
  
  private static void zzc(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = zzc(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    zza(paramObject, l, (0xFF & paramByte) << j | i & 255 << j);
  }
  
  public static void zzc(Object paramObject, long paramLong, boolean paramBoolean)
  {
    zzf.zza(paramObject, paramLong, paramBoolean);
  }
  
  public static boolean zzc()
  {
    return zzh;
  }
  
  public static long zzd(Object paramObject, long paramLong)
  {
    return zzf.zze(paramObject, paramLong);
  }
  
  private static void zzd(Object paramObject, long paramLong, byte paramByte)
  {
    long l = 0xFFFFFFFFFFFFFFFC & paramLong;
    int i = zzc(paramObject, l);
    int j = ((int)paramLong & 0x3) << 3;
    zza(paramObject, l, (0xFF & paramByte) << j | i & 255 << j);
  }
  
  public static boolean zzd()
  {
    return zzg;
  }
  
  private static boolean zzd(Class<?> paramClass)
  {
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
  
  public static Object zze(Object paramObject, long paramLong)
  {
    return zzfzza.getObject(paramObject, paramLong);
  }
  
  private static Field zze()
  {
    Field localField = zza(Buffer.class, "effectiveDirectAddress");
    if (localField != null) {
      return localField;
    }
    localField = zza(Buffer.class, "address");
    if ((localField != null) && (localField.getType() == Long.TYPE)) {
      return localField;
    }
    return null;
  }
  
  public static boolean zzh(Object paramObject, long paramLong)
  {
    return zzf.zzc(paramObject, paramLong);
  }
  
  public static final class zza
    extends zzmz.zzc
  {
    public zza(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final double zza(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(zze(paramObject, paramLong));
    }
    
    public final void zza(Object paramObject, long paramLong, byte paramByte)
    {
      if (zzmz.zza)
      {
        zzmz.zza(paramObject, paramLong, paramByte);
        return;
      }
      zzmz.zzb(paramObject, paramLong, paramByte);
    }
    
    public final void zza(Object paramObject, long paramLong, double paramDouble)
    {
      zza(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void zza(Object paramObject, long paramLong, float paramFloat)
    {
      zza(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void zza(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (zzmz.zza)
      {
        zzmz.zza(paramObject, paramLong, paramBoolean);
        return;
      }
      zzmz.zzb(paramObject, paramLong, paramBoolean);
    }
    
    public final float zzb(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(zzd(paramObject, paramLong));
    }
    
    public final boolean zzc(Object paramObject, long paramLong)
    {
      if (zzmz.zza) {
        return zzmz.zzf(paramObject, paramLong);
      }
      return zzmz.zzg(paramObject, paramLong);
    }
  }
  
  public static final class zzb
    extends zzmz.zzc
  {
    public zzb(Unsafe paramUnsafe)
    {
      super();
    }
    
    public final double zza(Object paramObject, long paramLong)
    {
      return Double.longBitsToDouble(zze(paramObject, paramLong));
    }
    
    public final void zza(Object paramObject, long paramLong, byte paramByte)
    {
      if (zzmz.zza)
      {
        zzmz.zza(paramObject, paramLong, paramByte);
        return;
      }
      zzmz.zzb(paramObject, paramLong, paramByte);
    }
    
    public final void zza(Object paramObject, long paramLong, double paramDouble)
    {
      zza(paramObject, paramLong, Double.doubleToLongBits(paramDouble));
    }
    
    public final void zza(Object paramObject, long paramLong, float paramFloat)
    {
      zza(paramObject, paramLong, Float.floatToIntBits(paramFloat));
    }
    
    public final void zza(Object paramObject, long paramLong, boolean paramBoolean)
    {
      if (zzmz.zza)
      {
        zzmz.zza(paramObject, paramLong, paramBoolean);
        return;
      }
      zzmz.zzb(paramObject, paramLong, paramBoolean);
    }
    
    public final float zzb(Object paramObject, long paramLong)
    {
      return Float.intBitsToFloat(zzd(paramObject, paramLong));
    }
    
    public final boolean zzc(Object paramObject, long paramLong)
    {
      if (zzmz.zza) {
        return zzmz.zzf(paramObject, paramLong);
      }
      return zzmz.zzg(paramObject, paramLong);
    }
  }
  
  public static abstract class zzc
  {
    public Unsafe zza;
    
    public zzc(Unsafe paramUnsafe)
    {
      zza = paramUnsafe;
    }
    
    public abstract double zza(Object paramObject, long paramLong);
    
    public abstract void zza(Object paramObject, long paramLong, byte paramByte);
    
    public abstract void zza(Object paramObject, long paramLong, double paramDouble);
    
    public abstract void zza(Object paramObject, long paramLong, float paramFloat);
    
    public final void zza(Object paramObject, long paramLong, int paramInt)
    {
      zza.putInt(paramObject, paramLong, paramInt);
    }
    
    public final void zza(Object paramObject, long paramLong1, long paramLong2)
    {
      zza.putLong(paramObject, paramLong1, paramLong2);
    }
    
    public abstract void zza(Object paramObject, long paramLong, boolean paramBoolean);
    
    public final boolean zza()
    {
      Object localObject = zza;
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
        zzmz.zza(localThrowable);
      }
      return false;
    }
    
    public abstract float zzb(Object paramObject, long paramLong);
    
    public final boolean zzb()
    {
      Object localObject = zza;
      if (localObject == null) {
        return false;
      }
      try
      {
        localObject = localObject.getClass();
        ((Class)localObject).getMethod("objectFieldOffset", new Class[] { Field.class });
        ((Class)localObject).getMethod("getLong", new Class[] { Object.class, Long.TYPE });
        localObject = zzmz.zza();
        return localObject != null;
      }
      finally
      {
        zzmz.zza(localThrowable);
      }
      return false;
    }
    
    public abstract boolean zzc(Object paramObject, long paramLong);
    
    public final int zzd(Object paramObject, long paramLong)
    {
      return zza.getInt(paramObject, paramLong);
    }
    
    public final long zze(Object paramObject, long paramLong)
    {
      return zza.getLong(paramObject, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */