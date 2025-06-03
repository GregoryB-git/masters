package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

final class zzhg
  extends zzhi
{
  public zzhg(Unsafe paramUnsafe)
  {
    super(paramUnsafe);
  }
  
  public final double zza(Object paramObject, long paramLong)
  {
    return Double.longBitsToDouble(zza.getLong(paramObject, paramLong));
  }
  
  public final float zzb(Object paramObject, long paramLong)
  {
    return Float.intBitsToFloat(zza.getInt(paramObject, paramLong));
  }
  
  public final void zzc(Object paramObject, long paramLong, boolean paramBoolean)
  {
    if (zzhj.zza)
    {
      zzhj.zzi(paramObject, paramLong, paramBoolean);
      return;
    }
    zzhj.zzj(paramObject, paramLong, paramBoolean);
  }
  
  public final void zzd(Object paramObject, long paramLong, double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    zza.putLong(paramObject, paramLong, l);
  }
  
  public final void zze(Object paramObject, long paramLong, float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    zza.putInt(paramObject, paramLong, i);
  }
  
  public final boolean zzf(Object paramObject, long paramLong)
  {
    if (zzhj.zza) {
      return zzhj.zzq(paramObject, paramLong);
    }
    return zzhj.zzr(paramObject, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzhg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */