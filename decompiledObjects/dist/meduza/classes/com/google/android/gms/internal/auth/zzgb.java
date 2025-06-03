package com.google.android.gms.internal.auth;

final class zzgb
  implements zzgi
{
  private final zzfx zza;
  private final zzgz zzb;
  private final zzem zzc;
  
  private zzgb(zzgz paramzzgz, zzem paramzzem, zzfx paramzzfx)
  {
    zzb = paramzzgz;
    zzc = paramzzem;
    zza = paramzzfx;
  }
  
  public static zzgb zzb(zzgz paramzzgz, zzem paramzzem, zzfx paramzzfx)
  {
    return new zzgb(paramzzgz, paramzzem, paramzzfx);
  }
  
  public final int zza(Object paramObject)
  {
    return zzb.zzb(paramObject).hashCode();
  }
  
  public final Object zzd()
  {
    Object localObject = zza;
    boolean bool = localObject instanceof zzev;
    localObject = (zzev)localObject;
    if (bool) {
      return ((zzev)localObject).zzc();
    }
    return ((zzet)((zzev)localObject).zzn(5, null, null)).zzd();
  }
  
  public final void zze(Object paramObject)
  {
    zzb.zze(paramObject);
    zzc.zzb(paramObject);
  }
  
  public final void zzf(Object paramObject1, Object paramObject2)
  {
    zzgk.zzd(zzb, paramObject1, paramObject2);
  }
  
  public final void zzg(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzdt paramzzdt)
  {
    paramArrayOfByte = (zzev)paramObject;
    if (zzc == zzha.zza()) {
      zzc = zzha.zzd();
    }
    paramObject = (zzeu)paramObject;
    throw null;
  }
  
  public final boolean zzh(Object paramObject1, Object paramObject2)
  {
    return zzb.zzb(paramObject1).equals(zzb.zzb(paramObject2));
  }
  
  public final boolean zzi(Object paramObject)
  {
    zzc.zza(paramObject);
    throw null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */