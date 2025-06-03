package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzcg;
import com.google.android.gms.internal.firebase-auth-api.zzjq.zzc;
import com.google.android.gms.internal.firebase-auth-api.zzjq.zzd;
import java.security.GeneralSecurityException;
import java.util.Set;

public final class zzjq$zzb
{
  private com.google.android.gms.internal.firebase-auth-api.zzjq.zza zza = null;
  private zzjq.zzd zzb = null;
  private zzjq.zzc zzc = null;
  private zzcg zzd = null;
  private com.google.android.gms.internal.firebase-auth-api.zzjq.zze zze = zzjq.zze.zzc;
  private com.google.android.gms.internal.firebase-auth-api.zzzn zzf = null;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(zzcg paramzzcg)
  {
    if (zzjq.zzi().contains(paramzzcg))
    {
      zzd = paramzzcg;
      return this;
    }
    throw new GeneralSecurityException(j.j("Invalid DEM parameters ", String.valueOf(paramzzcg), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zza paramzza)
  {
    zza = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(zzjq.zzc paramzzc)
  {
    zzc = paramzzc;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(zzjq.zzd paramzzd)
  {
    zzb = paramzzd;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zze paramzze)
  {
    zze = paramzze;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    if (paramzzzn.zza() == 0)
    {
      zzf = null;
      return this;
    }
    zzf = paramzzzn;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza1 = zza;
    if (localzza1 != null)
    {
      if (zzb != null)
      {
        if (zzd != null)
        {
          if (zze != null)
          {
            com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza2 = zzjq.zza.zzd;
            if ((localzza1 != localzza2) && (zzc == null)) {
              throw new GeneralSecurityException("Point format is not set");
            }
            if ((localzza1 == localzza2) && (zzc != null)) {
              throw new GeneralSecurityException("For Curve25519 point format must not be set");
            }
            return new zzjq(zza, zzb, zzc, zzd, zze, zzf, null);
          }
          throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("DEM parameters are not set");
      }
      throw new GeneralSecurityException("Hash type is not set");
    }
    throw new GeneralSecurityException("Elliptic curve type is not set");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjq.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */