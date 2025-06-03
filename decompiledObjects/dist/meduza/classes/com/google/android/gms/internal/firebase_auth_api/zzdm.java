package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzdm
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzdr zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final zzzn zzc;
  private final Integer zzd;
  
  private zzdm(com.google.android.gms.internal.firebase-auth-api.zzdr paramzzdr, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzdr;
    zzb = paramzzzo;
    zzc = paramzzzn;
    zzd = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzdm.zza zzb()
  {
    return new zza(null);
  }
  
  public final Integer zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr zzc()
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
    private com.google.android.gms.internal.firebase-auth-api.zzdr zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
    private Integer zzc = null;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdm.zza zza(com.google.android.gms.internal.firebase-auth-api.zzdr paramzzdr)
    {
      zza = paramzzdr;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdm.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
    {
      zzb = paramzzzo;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdm.zza zza(Integer paramInteger)
    {
      zzc = paramInteger;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdm zza()
    {
      Object localObject = zza;
      if ((localObject != null) && (zzb != null))
      {
        if (((zzdr)localObject).zzc() == zzb.zza())
        {
          if ((zza.zza()) && (zzc == null)) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
          }
          if ((!zza.zza()) && (zzc != null)) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
          }
          if (zza.zzf() == zzdr.zza.zzc) {
            localObject = zzor.zza;
          }
          for (;;)
          {
            break;
            if (zza.zzf() == zzdr.zza.zzb)
            {
              localObject = zzor.zza(zzc.intValue());
            }
            else
            {
              if (zza.zzf() != zzdr.zza.zza) {
                break label186;
              }
              localObject = zzor.zzb(zzc.intValue());
            }
          }
          return new zzdm(zza, zzb, (zzzn)localObject, zzc, null);
          label186:
          throw new IllegalStateException(f.j("Unknown AesGcmParameters.Variant: ", String.valueOf(zza.zzf())));
        }
        throw new GeneralSecurityException("Key size mismatch");
      }
      throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */