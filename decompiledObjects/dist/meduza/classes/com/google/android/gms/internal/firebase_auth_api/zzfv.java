package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzfv
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzfy zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzfv(com.google.android.gms.internal.firebase-auth-api.zzfy paramzzfy, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzfy;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzfv zza(com.google.android.gms.internal.firebase-auth-api.zzfy.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, Integer paramInteger)
  {
    com.google.android.gms.internal.firebase-auth-api.zzfy.zza localzza = zzfy.zza.zzc;
    if ((paramzza != localzza) && (paramInteger == null)) {
      throw new GeneralSecurityException(j.j("For given Variant ", String.valueOf(paramzza), " the value of idRequirement must be non-null"));
    }
    if ((paramzza == localzza) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramzzzo.zza() == 32)
    {
      com.google.android.gms.internal.firebase-auth-api.zzfy localzzfy = zzfy.zza(paramzza);
      if (localzzfy.zzb() == localzza)
      {
        paramzza = zzor.zza;
      }
      else if (localzzfy.zzb() == zzfy.zza.zzb)
      {
        paramzza = zzor.zza(paramInteger.intValue());
      }
      else
      {
        if (localzzfy.zzb() != zzfy.zza.zza) {
          break label142;
        }
        paramzza = zzor.zzb(paramInteger.intValue());
      }
      return new zzfv(localzzfy, paramzzzo, paramzza, paramInteger);
      label142:
      throw new IllegalStateException(f.j("Unknown Variant: ", String.valueOf(localzzfy.zzb())));
    }
    throw new GeneralSecurityException(j.g("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", paramzzzo.zza()));
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzfy zzb()
  {
    return zza;
  }
  
  public final zzzn zzc()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */