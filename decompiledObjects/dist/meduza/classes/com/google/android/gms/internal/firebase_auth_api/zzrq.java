package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzqa;
import com.google.android.gms.internal.firebase-auth-api.zzqh;
import java.security.GeneralSecurityException;

public final class zzrq
  implements zzqh
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  
  public zzrq(zzqa paramzzqa)
  {
    if (zza.zza()) {
      return;
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzrq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */