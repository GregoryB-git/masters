package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzed
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzeg zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzed(com.google.android.gms.internal.firebase-auth-api.zzeg paramzzeg, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzeg;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzed zza(com.google.android.gms.internal.firebase-auth-api.zzeg.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, Integer paramInteger)
  {
    com.google.android.gms.internal.firebase-auth-api.zzeg.zza localzza = zzeg.zza.zzc;
    if ((paramzza != localzza) && (paramInteger == null)) {
      throw new GeneralSecurityException(j.j("For given Variant ", String.valueOf(paramzza), " the value of idRequirement must be non-null"));
    }
    if ((paramzza == localzza) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramzzzo.zza() == 32)
    {
      com.google.android.gms.internal.firebase-auth-api.zzeg localzzeg = zzeg.zza(paramzza);
      if (localzzeg.zzb() == localzza)
      {
        paramzza = zzor.zza;
      }
      else if (localzzeg.zzb() == zzeg.zza.zzb)
      {
        paramzza = zzor.zza(paramInteger.intValue());
      }
      else
      {
        if (localzzeg.zzb() != zzeg.zza.zza) {
          break label142;
        }
        paramzza = zzor.zzb(paramInteger.intValue());
      }
      return new zzed(localzzeg, paramzzzo, paramzza, paramInteger);
      label142:
      throw new IllegalStateException(f.j("Unknown Variant: ", String.valueOf(localzzeg.zzb())));
    }
    throw new GeneralSecurityException(j.g("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", paramzzzo.zza()));
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzeg zzb()
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */