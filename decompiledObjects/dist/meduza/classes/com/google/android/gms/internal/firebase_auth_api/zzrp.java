package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzqh;
import com.google.android.gms.internal.firebase-auth-api.zzql;
import java.security.GeneralSecurityException;

public final class zzrp
  implements zzqh
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zzb;
  
  public zzrp(zzql paramzzql)
  {
    if (zza.zza()) {
      return;
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzrp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */