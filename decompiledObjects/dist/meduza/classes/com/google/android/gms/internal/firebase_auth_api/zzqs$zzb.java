package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzqs$zzb
{
  private Integer zza = null;
  private Integer zzb = null;
  private com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzc = null;
  private com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzd = zzqs.zzc.zzd;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(int paramInt)
  {
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqs.zza paramzza)
  {
    zzc = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqs.zzc paramzzc)
  {
    zzd = paramzzc;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs zza()
  {
    Object localObject = zza;
    if (localObject != null)
    {
      if (zzb != null)
      {
        if (zzc != null)
        {
          if (zzd != null)
          {
            if (((Integer)localObject).intValue() >= 16)
            {
              int i = zzb.intValue();
              localObject = zzc;
              if (i >= 10)
              {
                if (localObject == zzqs.zza.zza)
                {
                  if (i > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzqs.zza.zzb)
                {
                  if (i > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzqs.zza.zzc)
                {
                  if (i > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else if (localObject == zzqs.zza.zzd)
                {
                  if (i > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                  }
                }
                else
                {
                  if (localObject != zzqs.zza.zze) {
                    break label286;
                  }
                  if (i > 64) {
                    break label262;
                  }
                }
                return new zzqs(zza.intValue(), zzb.intValue(), zzd, zzc, null);
                label262:
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
                label286:
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
              }
              throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(i) }));
            }
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[] { zza }));
          }
          throw new GeneralSecurityException("variant is not set");
        }
        throw new GeneralSecurityException("hash type is not set");
      }
      throw new GeneralSecurityException("tag size is not set");
    }
    throw new GeneralSecurityException("key size is not set");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zzb(int paramInt)
  {
    zzb = Integer.valueOf(paramInt);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqs.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */