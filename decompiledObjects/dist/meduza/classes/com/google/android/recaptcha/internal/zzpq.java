package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

final class zzpq
  extends zzpr
{
  public zzpq(Unsafe paramUnsafe)
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
    if (zzps.zzb)
    {
      zzps.zzi(paramObject, paramLong, paramBoolean);
      return;
    }
    zzps.zzj(paramObject, paramLong, paramBoolean);
  }
  
  public final void zzd(Object paramObject, long paramLong, byte paramByte)
  {
    if (zzps.zzb)
    {
      zzps.zzk(paramObject, paramLong, paramByte);
      return;
    }
    zzps.zzl(paramObject, paramLong, paramByte);
  }
  
  public final void zze(Object paramObject, long paramLong, double paramDouble)
  {
    long l = Double.doubleToLongBits(paramDouble);
    zza.putLong(paramObject, paramLong, l);
  }
  
  public final void zzf(Object paramObject, long paramLong, float paramFloat)
  {
    int i = Float.floatToIntBits(paramFloat);
    zza.putInt(paramObject, paramLong, i);
  }
  
  public final boolean zzg(Object paramObject, long paramLong)
  {
    if (zzps.zzb) {
      return zzps.zzt(paramObject, paramLong);
    }
    return zzps.zzu(paramObject, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */