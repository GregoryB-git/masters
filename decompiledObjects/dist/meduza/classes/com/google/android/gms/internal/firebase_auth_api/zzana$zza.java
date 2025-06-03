package com.google.android.gms.internal.firebase_auth_api;

import sun.misc.Unsafe;

final class zzana$zza
  extends zzana.zzc
{
  public zzana$zza(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final double zza(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(zze(paramObject, paramLong));
  }
  
  public final void zza(Object paramObject, long paramLong, byte paramByte)
  {
    if (zzana.zza)
    {
      zzana.zza(paramObject, paramLong, paramByte);
      return;
    }
    zzana.zzb(paramObject, paramLong, paramByte);
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
    if (zzana.zza)
    {
      zzana.zza(paramObject, paramLong, paramBoolean);
      return;
    }
    zzana.zzb(paramObject, paramLong, paramBoolean);
  }
  
  public final float zzb(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(zzd(paramObject, paramLong));
  }
  
  public final boolean zzc(Object paramObject, long paramLong)
  {
    if (zzana.zza) {
      return zzana.zzf(paramObject, paramLong);
    }
    return zzana.zzg(paramObject, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzana.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */