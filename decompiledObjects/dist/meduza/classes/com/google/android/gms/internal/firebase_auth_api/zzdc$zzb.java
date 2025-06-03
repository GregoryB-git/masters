package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzdc$zzb
{
  private Integer zza = null;
  private Integer zzb = null;
  private Integer zzc = null;
  private Integer zzd = null;
  private com.google.android.gms.internal.firebase-auth-api.zzdc.zza zze = null;
  private com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zzf = zzdc.zzc.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdc.zza paramzza)
  {
    zze = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdc.zzc paramzzc)
  {
    zzf = paramzzc;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc zza()
  {
    if (zza != null)
    {
      if (zzb != null)
      {
        if (zzc != null)
        {
          Object localObject = zzd;
          if (localObject != null)
          {
            if (zze != null)
            {
              if (zzf != null)
              {
                int i = ((Integer)localObject).intValue();
                localObject = zze;
                if (localObject == zzdc.zza.zza)
                {
                  if (i > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzdc.zza.zzb)
                {
                  if (i > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzdc.zza.zzc)
                {
                  if (i > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzdc.zza.zzd)
                {
                  if (i > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else
                {
                  if (localObject != zzdc.zza.zze) {
                    break label296;
                  }
                  if (i > 64) {
                    break label272;
                  }
                }
                return new zzdc(zza.intValue(), zzb.intValue(), zzc.intValue(), zzd.intValue(), zzf, zze, null);
                label272:
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
                label296:
                throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
              }
              throw new GeneralSecurityException("variant is not set");
            }
            throw new GeneralSecurityException("hash type is not set");
          }
          throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("iv size is not set");
      }
      throw new GeneralSecurityException("HMAC key size is not set");
    }
    throw new GeneralSecurityException("AES key size is not set");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzb(int paramInt)
  {
    if (paramInt >= 16)
    {
      zzb = Integer.valueOf(paramInt);
      return this;
    }
    throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzc(int paramInt)
  {
    if ((paramInt >= 12) && (paramInt <= 16))
    {
      zzc = Integer.valueOf(paramInt);
      return this;
    }
    throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzd(int paramInt)
  {
    if (paramInt >= 10)
    {
      zzd = Integer.valueOf(paramInt);
      return this;
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(paramInt) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdc.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */