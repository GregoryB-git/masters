package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzql$zza
{
  private com.google.android.gms.internal.firebase-auth-api.zzqs zza = null;
  private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
  private Integer zzc = null;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzql.zza zza(com.google.android.gms.internal.firebase-auth-api.zzqs paramzzqs)
  {
    zza = paramzzqs;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzql.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
  {
    zzb = paramzzzo;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzql.zza zza(Integer paramInteger)
  {
    zzc = paramInteger;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzql zza()
  {
    Object localObject = zza;
    if ((localObject != null) && (zzb != null))
    {
      if (((zzqs)localObject).zzc() == zzb.zza())
      {
        if ((zza.zza()) && (zzc == null)) {
          throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if ((!zza.zza()) && (zzc != null)) {
          throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (zza.zzf() == zzqs.zzc.zzd) {
          localObject = zzor.zza;
        }
        for (;;)
        {
          break;
          if ((zza.zzf() != zzqs.zzc.zzc) && (zza.zzf() != zzqs.zzc.zzb))
          {
            if (zza.zzf() == zzqs.zzc.zza) {
              localObject = zzor.zzb(zzc.intValue());
            } else {
              throw new IllegalStateException(f.j("Unknown HmacParameters.Variant: ", String.valueOf(zza.zzf())));
            }
          }
          else {
            localObject = zzor.zza(zzc.intValue());
          }
        }
        return new zzql(zza, zzb, (zzzn)localObject, zzc, null);
      }
      throw new GeneralSecurityException("Key size mismatch");
    }
    throw new GeneralSecurityException("Cannot build without parameters and/or key material");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzql.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */