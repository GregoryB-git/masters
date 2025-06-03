package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzea$zza
{
  private Integer zza = null;
  private com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzb = zzea.zzb.zzc;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzea.zza zza(int paramInt)
  {
    if ((paramInt != 16) && (paramInt != 32)) {
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
    }
    zza = Integer.valueOf(paramInt);
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzea.zza zza(com.google.android.gms.internal.firebase-auth-api.zzea.zzb paramzzb)
  {
    zzb = paramzzb;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzea zza()
  {
    Integer localInteger = zza;
    if (localInteger != null)
    {
      if (zzb != null) {
        return new zzea(localInteger.intValue(), zzb, null);
      }
      throw new GeneralSecurityException("Variant is not set");
    }
    throw new GeneralSecurityException("Key size is not set");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzea.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */