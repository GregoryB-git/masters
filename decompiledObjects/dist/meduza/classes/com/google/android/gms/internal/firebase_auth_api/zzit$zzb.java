package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzit$zzb
{
  private Integer zza = null;
  private com.google.android.gms.internal.firebase-auth-api.zzit.zza zzb = zzit.zza.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzit.zzb zza(int paramInt)
  {
    if ((paramInt != 32) && (paramInt != 48) && (paramInt != 64)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzit.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzit.zza paramzza)
  {
    zzb = paramzza;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzit zza()
  {
    Integer localInteger = zza;
    if (localInteger != null)
    {
      if (zzb != null) {
        return new zzit(localInteger.intValue(), zzb, null);
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzit.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */