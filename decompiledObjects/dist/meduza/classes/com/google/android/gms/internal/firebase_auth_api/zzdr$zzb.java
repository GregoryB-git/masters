package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzdr$zzb
{
  private Integer zza = null;
  private Integer zzb = null;
  private Integer zzc = null;
  private com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzd = zzdr.zza.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zza(int paramInt)
  {
    zzb = Integer.valueOf(12);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdr.zza paramzza)
  {
    zzd = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr zza()
  {
    Integer localInteger = zza;
    if (localInteger != null)
    {
      if (zzd != null)
      {
        if (zzb != null)
        {
          if (zzc != null) {
            return new zzdr(localInteger.intValue(), zzb.intValue(), zzc.intValue(), zzd, null);
          }
          throw new GeneralSecurityException("Tag size is not set");
        }
        throw new GeneralSecurityException("IV size is not set");
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zzb(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zzc(int paramInt)
  {
    zzc = Integer.valueOf(16);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdr.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */