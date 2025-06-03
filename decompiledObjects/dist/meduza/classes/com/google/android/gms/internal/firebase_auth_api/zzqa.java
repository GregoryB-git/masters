package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzqa
  extends zzqv
{
  private final com.google.android.gms.internal.firebase-auth-api.zzqf zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzqa(com.google.android.gms.internal.firebase-auth-api.zzqf paramzzqf, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzqf;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzqa.zza zzb()
  {
    return new zza(null);
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqf zzc()
  {
    return zza;
  }
  
  public final zzzn zzd()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zze()
  {
    return zzb;
  }
  
  public static final class zza
  {
    private com.google.android.gms.internal.firebase-auth-api.zzqf zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
    private Integer zzc = null;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqa.zza zza(com.google.android.gms.internal.firebase-auth-api.zzqf paramzzqf)
    {
      zza = paramzzqf;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqa.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
    {
      zzb = paramzzzo;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqa.zza zza(Integer paramInteger)
    {
      zzc = paramInteger;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqa zza()
    {
      Object localObject = zza;
      if ((localObject != null) && (zzb != null))
      {
        if (((zzqf)localObject).zzc() == zzb.zza())
        {
          if ((zza.zza()) && (zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!zza.zza()) && (zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (zza.zze() == zzqf.zza.zzd) {
            localObject = zzor.zza;
          }
          for (;;)
          {
            break;
            if ((zza.zze() != zzqf.zza.zzc) && (zza.zze() != zzqf.zza.zzb))
            {
              if (zza.zze() == zzqf.zza.zza) {
                localObject = zzor.zzb(zzc.intValue());
              } else {
                throw new IllegalStateException(f.j("Unknown AesCmacParametersParameters.Variant: ", String.valueOf(zza.zze())));
              }
            }
            else {
              localObject = zzor.zza(zzc.intValue());
            }
          }
          return new zzqa(zza, zzb, (zzzn)localObject, zzc, null);
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
      throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */