package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class zzmz$zzb
  extends zzmz.zzc
{
  public zzmz$zzb(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmz.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */