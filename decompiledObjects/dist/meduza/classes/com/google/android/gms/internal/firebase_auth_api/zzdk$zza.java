package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzdk$zza
{
  private Integer zza = null;
  private Integer zzb = null;
  private Integer zzc = null;
  private com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzd = zzdk.zzb.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zza(int paramInt)
  {
    if ((paramInt != 12) && (paramInt != 16)) {
      throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    zzb = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zza(com.google.android.gms.internal.firebase-auth-api.zzdk.zzb paramzzb)
  {
    zzd = paramzzb;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk zza()
  {
    Integer localInteger = zza;
    if (localInteger != null)
    {
      if (zzb != null)
      {
        if (zzd != null)
        {
          if (zzc != null) {
            return new zzdk(localInteger.intValue(), zzb.intValue(), zzc.intValue(), zzd, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("IV size is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zzb(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zzc(int paramInt)
  {
    zzc = Integer.valueOf(16);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdk.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */