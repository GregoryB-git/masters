package com.google.android.gms.internal.measurement;

public class zzku
{
  private volatile zzlm zza;
  private volatile zziy zzb;
  private volatile boolean zzc;
  
  private final zzlm zzb(zzlm paramzzlm)
  {
    if (zza == null) {
      try
      {
        if (zza != null) {}
        for (;;)
        {
          break;
          try
          {
            zza = paramzzlm;
            zzb = zziy.zza;
          }
          catch (zzkp localzzkp)
          {
            zzc = true;
            zza = paramzzlm;
            zzb = zziy.zza;
          }
        }
        return zza;
      }
      finally {}
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zzku)) {
      return false;
    }
    paramObject = (zzku)paramObject;
    zzlm localzzlm1 = zza;
    zzlm localzzlm2 = zza;
    if ((localzzlm1 == null) && (localzzlm2 == null)) {
      return zzb().equals(((zzku)paramObject).zzb());
    }
    if ((localzzlm1 != null) && (localzzlm2 != null)) {
      return localzzlm1.equals(localzzlm2);
    }
    if (localzzlm1 != null) {
      return localzzlm1.equals(((zzku)paramObject).zzb(localzzlm1.zzal()));
    }
    return zzb(localzzlm2.zzal()).equals(localzzlm2);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final int zza()
  {
    if (zzb != null) {
      return zzb.zzb();
    }
    if (zza != null) {
      return zza.zzcf();
    }
    return 0;
  }
  
  public final zzlm zza(zzlm paramzzlm)
  {
    zzlm localzzlm = zza;
    zzb = null;
    zza = paramzzlm;
    return localzzlm;
  }
  
  public final zziy zzb()
  {
    if (zzb != null) {
      return zzb;
    }
    try
    {
      if (zzb != null)
      {
        localzziy = zzb;
        return localzziy;
      }
      if (zza == null) {}
      for (zziy localzziy = zziy.zza;; localzziy = zza.zzcd())
      {
        zzb = localzziy;
        break;
      }
      localzziy = zzb;
      return localzziy;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzku
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */