package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzio
  extends zziy
{
  private final com.google.android.gms.internal.firebase-auth-api.zzit zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzio(com.google.android.gms.internal.firebase-auth-api.zzit paramzzit, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzit;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzio.zza zzb()
  {
    return new zza(null);
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzit zzc()
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
    private com.google.android.gms.internal.firebase-auth-api.zzit zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
    private Integer zzc = null;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzio.zza zza(com.google.android.gms.internal.firebase-auth-api.zzit paramzzit)
    {
      zza = paramzzit;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzio.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
    {
      zzb = paramzzzo;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzio.zza zza(Integer paramInteger)
    {
      zzc = paramInteger;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzio zza()
    {
      Object localObject = zza;
      if ((localObject != null) && (zzb != null))
      {
        if (((zzit)localObject).zzb() == zzb.zza())
        {
          if ((zza.zza()) && (zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!zza.zza()) && (zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (zza.zzd() == zzit.zza.zzc) {
            localObject = zzor.zza;
          }
          for (;;)
          {
            break;
            if (zza.zzd() == zzit.zza.zzb)
            {
              localObject = zzor.zza(zzc.intValue());
            }
            else
            {
              if (zza.zzd() != zzit.zza.zza) {
                break label186;
              }
              localObject = zzor.zzb(zzc.intValue());
            }
          }
          return new zzio(zza, zzb, (zzzn)localObject, zzc, null);
          label186:
          throw new IllegalStateException(f.j("Unknown AesSivParameters.Variant: ", String.valueOf(zza.zzd())));
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
      throw new IllegalArgumentException("Cannot build without parameters and/or key material");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzio
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */