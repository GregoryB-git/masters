package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzjm
{
  private static final zzoy<zzjt, zzbj> zza = zzoy.zza(new zzjl(), com.google.android.gms.internal.firebase-auth-api.zzjt.class, com.google.android.gms.internal.firebase-auth-api.zzbj.class);
  private static final zzoy<zzjs, zzbm> zzb = zzoy.zza(new zzjo(), com.google.android.gms.internal.firebase-auth-api.zzjs.class, com.google.android.gms.internal.firebase-auth-api.zzbm.class);
  private static final zzci<zzbj> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", com.google.android.gms.internal.firebase-auth-api.zzbj.class, zzun.zzf());
  private static final zzbn<zzbm> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", com.google.android.gms.internal.firebase-auth-api.zzbm.class, zzwb.zza.zzd, zzuq.zzh());
  private static final zzoe<zzjq> zze = new zzjn();
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzld.zza();
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      Object localObject1 = zzjq.zzc();
      com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza = zzjq.zza.zza;
      Object localObject2 = ((zzjq.zzb)localObject1).zza(localzza);
      localObject1 = zzjq.zzd.zzc;
      Object localObject3 = ((zzjq.zzb)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1);
      localObject2 = zzjq.zzc.zzb;
      Object localObject4 = ((zzjq.zzb)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject2);
      localObject3 = zzjq.zze.zza;
      localObject4 = ((zzjq.zzb)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject3);
      Object localObject5 = zzdr.zze().zza(12).zzb(16).zzc(16);
      Object localObject6 = zzdr.zza.zzc;
      localHashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", ((zzjq.zzb)localObject4).zza(((zzdr.zzb)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzdr.zza)localObject6).zza()).zza());
      localObject5 = zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject2);
      localObject4 = zzjq.zze.zzc;
      localHashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", ((zzjq.zzb)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject4).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdr.zza)localObject6).zza()).zza());
      Object localObject7 = zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1);
      localObject5 = zzjq.zzc.zza;
      localHashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", ((zzjq.zzb)localObject7).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject3).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdr.zza)localObject6).zza()).zza());
      localHashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject4).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdr.zza)localObject6).zza()).zza());
      localHashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject4).zza(zzdr.zze().zza(12).zzb(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdr.zza)localObject6).zza()).zza());
      localObject6 = zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject3);
      Object localObject8 = zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16);
      localObject7 = zzdc.zza.zzc;
      com.google.android.gms.internal.firebase-auth-api.zzdc.zzb localzzb = ((zzdc.zzb)localObject8).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zza)localObject7);
      localObject8 = zzdc.zzc.zzc;
      localHashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", ((zzjq.zzb)localObject6).zza(localzzb.zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject8).zza()).zza());
      localHashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject4).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zza)localObject7).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject8).zza()).zza());
      localHashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject3).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zza)localObject7).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject8).zza()).zza());
      localHashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjq.zzc().zza(localzza).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzd)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zzc)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzjq.zze)localObject4).zza(zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zza)localObject7).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject8).zza()).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzon.zza().zza(zza);
      zzon.zza().zza(zzb);
      zzoc.zza().zza(zze, com.google.android.gms.internal.firebase-auth-api.zzjq.class);
      zzna.zza().zza(zzc, true);
      zzna.zza().zza(zzd, false);
      return;
    }
    throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */