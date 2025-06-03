package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzqb
{
  private static final zzoe<zzqf> zza = new zzqe();
  private static final zzoy<zzqa, zzqh> zzb = zzoy.zza(new zzqd(), com.google.android.gms.internal.firebase-auth-api.zzqa.class, com.google.android.gms.internal.firebase-auth-api.zzqh.class);
  private static final zzoy<zzqa, zzcd> zzc = zzoy.zza(new zzqg(), com.google.android.gms.internal.firebase-auth-api.zzqa.class, com.google.android.gms.internal.firebase-auth-api.zzcd.class);
  private static final zzbn<zzcd> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", com.google.android.gms.internal.firebase-auth-api.zzcd.class, zzwb.zza.zzb, zzsa.zzf());
  
  private static void zza(com.google.android.gms.internal.firebase-auth-api.zzqf paramzzqf)
  {
    if (paramzzqf.zzc() == 32) {
      return;
    }
    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzrh.zza();
      zzoc.zza().zza(zza, com.google.android.gms.internal.firebase-auth-api.zzqf.class);
      zzon.zza().zza(zzb);
      zzon.zza().zza(zzc);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      com.google.android.gms.internal.firebase-auth-api.zzqf localzzqf = zzrb.zzc;
      localHashMap.put("AES_CMAC", localzzqf);
      localHashMap.put("AES256_CMAC", localzzqf);
      localHashMap.put("AES256_CMAC_RAW", zzqf.zzd().zza(32).zzb(16).zza(zzqf.zza.zzd).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzna.zza().zza(zzd, true);
      return;
    }
    throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */