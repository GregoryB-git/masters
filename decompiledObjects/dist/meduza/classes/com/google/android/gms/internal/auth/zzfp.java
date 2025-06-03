package com.google.android.gms.internal.auth;

final class zzfp
  implements zzgj
{
  private static final zzfv zza = new zzfn();
  private final zzfv zzb;
  
  public zzfp()
  {
    Object localObject2 = zzfa.zza;
    zzb = ((zzfv)localObject1);
  }
  
  private static boolean zzb(zzfu paramzzfu)
  {
    return paramzzfu.zzc() - 1 != 1;
  }
  
  public final zzgi zza(Class paramClass)
  {
    zzgk.zze(paramClass);
    zzfu localzzfu = zzb.zzb(paramClass);
    Object localObject;
    if (localzzfu.zzb())
    {
      if (zzev.class.isAssignableFrom(paramClass)) {
        localObject = zzgk.zzb();
      }
      for (paramClass = zzeo.zzb();; paramClass = zzeo.zza())
      {
        return zzgb.zzb((zzgz)localObject, paramClass, localzzfu.zza());
        localObject = zzgk.zza();
      }
    }
    boolean bool;
    zzgc localzzgc;
    zzfl localzzfl;
    zzgz localzzgz;
    zzfs localzzfs;
    if (zzev.class.isAssignableFrom(paramClass))
    {
      bool = zzb(localzzfu);
      localzzgc = zzgd.zzb();
      localzzfl = zzfl.zzd();
      localzzgz = zzgk.zzb();
      if (bool) {
        localObject = zzeo.zzb();
      } else {
        localObject = null;
      }
      localzzfs = zzft.zzb();
    }
    else
    {
      bool = zzb(localzzfu);
      localzzgc = zzgd.zza();
      localzzfl = zzfl.zzc();
      localzzgz = zzgk.zza();
      if (bool) {
        localObject = zzeo.zza();
      } else {
        localObject = null;
      }
      localzzfs = zzft.zza();
    }
    return zzga.zzj(paramClass, localzzfu, localzzgc, localzzfl, localzzgz, (zzem)localObject, localzzfs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */