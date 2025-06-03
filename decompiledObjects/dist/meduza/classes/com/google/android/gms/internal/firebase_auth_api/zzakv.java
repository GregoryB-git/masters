package com.google.android.gms.internal.firebase_auth_api;

public class zzakv
{
  private volatile com.google.android.gms.internal.firebase-auth-api.zzaln zza;
  private volatile com.google.android.gms.internal.firebase-auth-api.zzaiw zzb;
  private volatile boolean zzc;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaln zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
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
            zza = paramzzaln;
            zzb = zzaiw.zza;
          }
          catch (zzakm localzzakm)
          {
            zzc = true;
            zza = paramzzaln;
            zzb = zzaiw.zza;
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
    if (!(paramObject instanceof zzakv)) {
      return false;
    }
    paramObject = (zzakv)paramObject;
    com.google.android.gms.internal.firebase-auth-api.zzaln localzzaln1 = zza;
    com.google.android.gms.internal.firebase-auth-api.zzaln localzzaln2 = zza;
    if ((localzzaln1 == null) && (localzzaln2 == null)) {
      return zzb().equals(((zzakv)paramObject).zzb());
    }
    if ((localzzaln1 != null) && (localzzaln2 != null)) {
      return localzzaln1.equals(localzzaln2);
    }
    if (localzzaln1 != null) {
      return localzzaln1.equals(((zzakv)paramObject).zzb(localzzaln1.zzs()));
    }
    return zzb(localzzaln2.zzs()).equals(localzzaln2);
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
      return zza.zzl();
    }
    return 0;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaln zza(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    com.google.android.gms.internal.firebase-auth-api.zzaln localzzaln = zza;
    zzb = null;
    zza = paramzzaln;
    return localzzaln;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaiw zzb()
  {
    if (zzb != null) {
      return zzb;
    }
    try
    {
      if (zzb != null)
      {
        localzzaiw = zzb;
        return localzzaiw;
      }
      if (zza == null) {}
      for (com.google.android.gms.internal.firebase-auth-api.zzaiw localzzaiw = zzaiw.zza;; localzzaiw = zza.zzj())
      {
        zzb = localzzaiw;
        break;
      }
      localzzaiw = zzb;
      return localzzaiw;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */