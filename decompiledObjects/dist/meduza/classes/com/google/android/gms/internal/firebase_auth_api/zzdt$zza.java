package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzdt$zza
{
  private com.google.android.gms.internal.firebase-auth-api.zzea zza = null;
  private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
  private Integer zzc = null;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdt.zza zza(com.google.android.gms.internal.firebase-auth-api.zzea paramzzea)
  {
    zza = paramzzea;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdt.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    zzb = paramzzzo;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdt.zza zza(Integer paramInteger)
  {
    zzc = paramInteger;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdt zza()
  {
    Object localObject = zza;
    if ((localObject != null) && (zzb != null))
    {
      if (((zzea)localObject).zzb() == zzb.zza())
      {
        if ((zza.zza()) && (zzc == null)) {
          throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if ((!zza.zza()) && (zzc != null)) {
          throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (zza.zzd() == zzea.zzb.zzc) {
          localObject = zzor.zza;
        }
        for (;;)
        {
          break;
          if (zza.zzd() == zzea.zzb.zzb)
          {
            localObject = zzor.zza(zzc.intValue());
          }
          else
          {
            if (zza.zzd() != zzea.zzb.zza) {
              break label186;
            }
            localObject = zzor.zzb(zzc.intValue());
          }
        }
        return new zzdt(zza, zzb, (zzzn)localObject, zzc, null);
        label186:
        throw new IllegalStateException(f.j("Unknown AesGcmSivParameters.Variant: ", String.valueOf(zza.zzd())));
      }
      throw new GeneralSecurityException("Key size mismatch");
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdt.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */