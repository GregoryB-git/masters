package com.google.android.gms.internal.firebase_auth_api;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class zzana$zzc
{
  public Unsafe zza;
  
  public zzana$zzc(Unsafe paramUnsafe)
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
      zzana.zza(localThrowable);
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
      localObject = zzana.zza();
      return localObject != null;
    }
    finally
    {
      zzana.zza(localThrowable);
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzana.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */