package com.google.android.recaptcha.internal;

final class zzoa
  implements zzox
{
  private static final zzog zza = new zzny();
  private final zzog zzb;
  
  public zzoa()
  {
    localObject2 = zznl.zza;
    zzb = ((zzog)localObject1);
  }
  
  public final zzow zza(Class paramClass)
  {
    int i = zzoy.zza;
    if (!zznd.class.isAssignableFrom(paramClass)) {
      i = zzos.zza;
    }
    zzof localzzof = zzb.zzb(paramClass);
    if (!localzzof.zzb())
    {
      i = zzos.zza;
      zzoo localzzoo = zzop.zza();
      zznv localzznv = zznw.zza();
      zzpl localzzpl = zzoy.zzm();
      zzmp localzzmp;
      if (localzzof.zzc() - 1 != 1) {
        localzzmp = zzmr.zza();
      } else {
        localzzmp = null;
      }
      return zzol.zzm(paramClass, localzzof, localzzoo, localzznv, localzzpl, localzzmp, zzoe.zza());
    }
    i = zzos.zza;
    return zzom.zzc(zzoy.zzm(), zzmr.zza(), localzzof.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzoa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */