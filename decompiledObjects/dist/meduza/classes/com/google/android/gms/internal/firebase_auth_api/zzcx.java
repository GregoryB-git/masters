package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzcx
  extends zzcp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzdc zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzzo zzc;
  private final zzzn zzd;
  private final Integer zze;
  
  private zzcx(com.google.android.gms.internal.firebase-auth-api.zzdc paramzzdc, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo1, com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo2, zzzn paramzzzn, Integer paramInteger)
  {
    zza = paramzzdc;
    zzb = paramzzzo1;
    zzc = paramzzzo2;
    zzd = paramzzzn;
    zze = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzcx.zza zzb()
  {
    return new zza(null);
  }
  
  public final Integer zza()
  {
    return zze;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc zzc()
  {
    return zza;
  }
  
  public final zzzn zzd()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zze()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzo zzf()
  {
    return zzc;
  }
  
  public static final class zza
  {
    private com.google.android.gms.internal.firebase-auth-api.zzdc zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzzo zzb = null;
    private com.google.android.gms.internal.firebase-auth-api.zzzo zzc = null;
    private Integer zzd = null;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzcx.zza zza(com.google.android.gms.internal.firebase-auth-api.zzdc paramzzdc)
    {
      zza = paramzzdc;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzcx.zza zza(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
    {
      zzb = paramzzzo;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzcx.zza zza(Integer paramInteger)
    {
      zzd = paramInteger;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzcx zza()
    {
      Object localObject = zza;
      if (localObject != null)
      {
        if ((zzb != null) && (zzc != null))
        {
          if (((zzdc)localObject).zzb() == zzb.zza())
          {
            if (zza.zzc() == zzc.zza())
            {
              if ((zza.zza()) && (zzd == null)) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
              }
              if ((!zza.zza()) && (zzd != null)) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
              }
              if (zza.zzh() == zzdc.zzc.zzc) {
                localObject = zzor.zza;
              }
              for (;;)
              {
                break;
                if (zza.zzh() == zzdc.zzc.zzb)
                {
                  localObject = zzor.zza(zzd.intValue());
                }
                else
                {
                  if (zza.zzh() != zzdc.zzc.zza) {
                    break label214;
                  }
                  localObject = zzor.zzb(zzd.intValue());
                }
              }
              return new zzcx(zza, zzb, zzc, (zzzn)localObject, zzd, null);
              label214:
              throw new IllegalStateException(f.j("Unknown AesCtrHmacAeadParameters.Variant: ", String.valueOf(zza.zzh())));
            }
            throw new GeneralSecurityException("HMAC key size mismatch");
          }
          throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without key material");
      }
      throw new GeneralSecurityException("Cannot build without parameters");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzcx.zza zzb(com.google.android.gms.internal.firebase-auth-api.zzzo paramzzzo)
    {
      zzc = paramzzzo;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */