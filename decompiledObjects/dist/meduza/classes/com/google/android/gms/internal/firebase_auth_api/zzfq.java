package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzfq
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzft zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzfq(com.google.android.gms.internal.firebase-auth-api.zzft paramzzft, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzft;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzfq zza(com.google.android.gms.internal.firebase-auth-api.zzft paramzzft, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, Integer paramInteger)
  {
    com.google.android.gms.internal.firebase-auth-api.zzft.zza localzza = paramzzft.zzc();
    Object localObject = zzft.zza.zzb;
    if ((localzza != localObject) && (paramInteger == null)) {
      throw new GeneralSecurityException(j.j("For given Variant ", String.valueOf(paramzzft.zzc()), " the value of idRequirement must be non-null"));
    }
    if ((paramzzft.zzc() == localObject) && (paramInteger != null)) {
      throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
    }
    if (paramzzzo.zza() == 32)
    {
      if (paramzzft.zzc() == localObject)
      {
        localObject = zzor.zza;
      }
      else
      {
        if (paramzzft.zzc() != zzft.zza.zza) {
          break label129;
        }
        localObject = zzor.zzb(paramInteger.intValue());
      }
      return new zzfq(paramzzft, paramzzzo, (zzzn)localObject, paramInteger);
      label129:
      throw new IllegalStateException(f.j("Unknown Variant: ", String.valueOf(paramzzft.zzc())));
    }
    throw new GeneralSecurityException(j.g("XAesGcmKey key must be constructed with key of length 32 bytes, not ", paramzzzo.zza()));
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzft zzb()
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */