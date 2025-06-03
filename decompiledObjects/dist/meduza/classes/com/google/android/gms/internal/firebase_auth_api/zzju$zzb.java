package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzju.zza;
import com.google.android.gms.internal.firebase-auth-api.zzju.zzd;
import com.google.android.gms.internal.firebase-auth-api.zzju.zze;
import java.security.GeneralSecurityException;

public final class zzju$zzb
{
  private zzju.zzd zza = null;
  private zzju.zze zzb = null;
  private zzju.zza zzc = null;
  private com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzd = zzju.zzf.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(zzju.zza paramzza)
  {
    zzc = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(zzju.zzd paramzzd)
  {
    zza = paramzzd;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(zzju.zze paramzze)
  {
    zzb = paramzze;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzf paramzzf)
  {
    zzd = paramzzf;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju zza()
  {
    zzju.zzd localzzd = zza;
    if (localzzd != null)
    {
      zzju.zze localzze = zzb;
      if (localzze != null)
      {
        zzju.zza localzza = zzc;
        if (localzza != null)
        {
          com.google.android.gms.internal.firebase-auth-api.zzju.zzf localzzf = zzd;
          if (localzzf != null) {
            return new zzju(localzzd, localzze, localzza, localzzf, null);
          }
          throw new GeneralSecurityException("HPKE variant is not set");
        }
        throw new GeneralSecurityException("HPKE AEAD parameter is not set");
      }
      throw new GeneralSecurityException("HPKE KDF parameter is not set");
    }
    throw new GeneralSecurityException("HPKE KEM parameter is not set");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzju.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */