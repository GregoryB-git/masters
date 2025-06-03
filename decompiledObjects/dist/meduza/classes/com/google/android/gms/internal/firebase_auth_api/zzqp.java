package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzqp
{
  private static final zzoy<zzql, zzqh> zza = zzoy.zza(new zzqo(), com.google.android.gms.internal.firebase-auth-api.zzql.class, com.google.android.gms.internal.firebase-auth-api.zzqh.class);
  private static final zzoy<zzql, zzcd> zzb = zzoy.zza(new zzqr(), com.google.android.gms.internal.firebase-auth-api.zzql.class, com.google.android.gms.internal.firebase-auth-api.zzcd.class);
  private static final zzbn<zzcd> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.HmacKey", com.google.android.gms.internal.firebase-auth-api.zzcd.class, zzwb.zza.zzb, zzvb.zzg());
  private static final zzog<zzqs> zzd = new zzqq();
  private static final zzoe<zzqs> zze = new zzqt();
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zzf = zzij.zza.zzb;
  
  public static com.google.android.gms.internal.firebase-auth-api.zzql zza(com.google.android.gms.internal.firebase-auth-api.zzqs paramzzqs, Integer paramInteger)
  {
    return zzql.zzb().zza(paramzzqs).zza(zzzo.zza(paramzzqs.zzc())).zza(paramInteger).zza();
  }
  
  public static void zza(boolean paramBoolean)
  {
    com.google.android.gms.internal.firebase-auth-api.zzij.zza localzza = zzf;
    if (localzza.zza())
    {
      zzrs.zza();
      zzon.zza().zza(zza);
      zzon.zza().zza(zzb);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("HMAC_SHA256_128BITTAG", zzrb.zza);
      Object localObject = zzqs.zzd().zza(32).zzb(16);
      com.google.android.gms.internal.firebase-auth-api.zzqs.zzc localzzc = zzqs.zzc.zzd;
      localObject = ((zzqs.zzb)localObject).zza(localzzc);
      com.google.android.gms.internal.firebase-auth-api.zzqs.zza localzza1 = zzqs.zza.zzc;
      localHashMap.put("HMAC_SHA256_128BITTAG_RAW", ((zzqs.zzb)localObject).zza(localzza1).zza());
      com.google.android.gms.internal.firebase-auth-api.zzqs.zzb localzzb = zzqs.zzd().zza(32).zzb(32);
      localObject = zzqs.zzc.zza;
      localHashMap.put("HMAC_SHA256_256BITTAG", localzzb.zza((com.google.android.gms.internal.firebase-auth-api.zzqs.zzc)localObject).zza(localzza1).zza());
      localHashMap.put("HMAC_SHA256_256BITTAG_RAW", zzqs.zzd().zza(32).zzb(32).zza(localzzc).zza(localzza1).zza());
      localzzb = zzqs.zzd().zza(64).zzb(16).zza((com.google.android.gms.internal.firebase-auth-api.zzqs.zzc)localObject);
      localzza1 = zzqs.zza.zze;
      localHashMap.put("HMAC_SHA512_128BITTAG", localzzb.zza(localzza1).zza());
      localHashMap.put("HMAC_SHA512_128BITTAG_RAW", zzqs.zzd().zza(64).zzb(16).zza(localzzc).zza(localzza1).zza());
      localHashMap.put("HMAC_SHA512_256BITTAG", zzqs.zzd().zza(64).zzb(32).zza((com.google.android.gms.internal.firebase-auth-api.zzqs.zzc)localObject).zza(localzza1).zza());
      localHashMap.put("HMAC_SHA512_256BITTAG_RAW", zzqs.zzd().zza(64).zzb(32).zza(localzzc).zza(localzza1).zza());
      localHashMap.put("HMAC_SHA512_512BITTAG", zzrb.zzb);
      localHashMap.put("HMAC_SHA512_512BITTAG_RAW", zzqs.zzd().zza(64).zzb(64).zza(localzzc).zza(localzza1).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoc.zza().zza(zze, com.google.android.gms.internal.firebase-auth-api.zzqs.class);
      zzoh.zza().zza(zzd, com.google.android.gms.internal.firebase-auth-api.zzqs.class);
      zzna.zza().zza(zzc, localzza, true);
      return;
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */