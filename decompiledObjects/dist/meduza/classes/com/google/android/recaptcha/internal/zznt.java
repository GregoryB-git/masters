package com.google.android.recaptcha.internal;

public class zznt
{
  public volatile zzoi zza;
  private volatile zzle zzb;
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof zznt)) {
      return false;
    }
    paramObject = (zznt)paramObject;
    zzoi localzzoi1 = zza;
    zzoi localzzoi2 = zza;
    if ((localzzoi1 == null) && (localzzoi2 == null)) {
      return zzb().equals(((zznt)paramObject).zzb());
    }
    if ((localzzoi1 != null) && (localzzoi2 != null)) {
      return localzzoi1.equals(localzzoi2);
    }
    if (localzzoi1 != null)
    {
      ((zznt)paramObject).zzd(localzzoi1.zzm());
      return localzzoi1.equals(zza);
    }
    zzd(localzzoi2.zzm());
    return zza.equals(localzzoi2);
  }
  
  public int hashCode()
  {
    return 1;
  }
  
  public final int zza()
  {
    if (zzb != null) {
      return zzb).zza.length;
    }
    if (zza != null) {
      return zza.zzo();
    }
    return 0;
  }
  
  public final zzle zzb()
  {
    if (zzb != null) {
      return zzb;
    }
    try
    {
      if (zzb != null)
      {
        localzzle = zzb;
        return localzzle;
      }
      if (zza == null) {}
      for (zzle localzzle = zzle.zzb;; localzzle = zza.zzb())
      {
        zzb = localzzle;
        break;
      }
      localzzle = zzb;
      return localzzle;
    }
    finally {}
  }
  
  public final zzoi zzc(zzoi paramzzoi)
  {
    zzoi localzzoi = zza;
    zzb = null;
    zza = paramzzoi;
    return localzzoi;
  }
  
  public final void zzd(zzoi paramzzoi)
  {
    if (zza != null) {
      return;
    }
    try
    {
      if (zza != null) {
        return;
      }
      try
      {
        zza = paramzzoi;
        zzb = zzle.zzb;
      }
      catch (zznn localzznn)
      {
        zza = paramzzoi;
        zzb = zzle.zzb;
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */