package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzlq
{
  private static final zzoy<zzjx, zzbj> zza = zzoy.zza(new zzlt(), com.google.android.gms.internal.firebase-auth-api.zzjx.class, com.google.android.gms.internal.firebase-auth-api.zzbj.class);
  private static final zzoy<zzkf, zzbm> zzb = zzoy.zza(new zzls(), com.google.android.gms.internal.firebase-auth-api.zzkf.class, com.google.android.gms.internal.firebase-auth-api.zzbm.class);
  private static final zzci<zzbj> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", com.google.android.gms.internal.firebase-auth-api.zzbj.class, zzvv.zzf());
  private static final zzbn<zzbm> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", com.google.android.gms.internal.firebase-auth-api.zzbm.class, zzwb.zza.zzd, zzvy.zzg());
  private static final zzoe<zzju> zze = new zzlv();
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzjw.zza();
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      Object localObject1 = zzju.zzc();
      com.google.android.gms.internal.firebase-auth-api.zzju.zzf localzzf = zzju.zzf.zza;
      localObject1 = ((zzju.zzb)localObject1).zza(localzzf);
      Object localObject2 = zzju.zzd.zzd;
      localObject1 = ((zzju.zzb)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2);
      Object localObject3 = zzju.zze.zza;
      Object localObject4 = ((zzju.zzb)localObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3);
      localObject1 = zzju.zza.zza;
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", ((zzju.zzb)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      Object localObject5 = zzju.zzc();
      localObject4 = zzju.zzf.zzc;
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", ((zzju.zzb)localObject5).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      Object localObject6 = zzju.zzc().zza(localzzf).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3);
      localObject5 = zzju.zza.zzb;
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", ((zzju.zzb)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localObject6 = zzju.zzc().zza(localzzf).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3);
      com.google.android.gms.internal.firebase-auth-api.zzju.zza localzza = zzju.zza.zzc;
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", ((zzju.zzb)localObject6).zza(localzza).zza());
      localHashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza(localzza).zza());
      localObject6 = zzju.zzc().zza(localzzf);
      localObject2 = zzju.zzd.zza;
      localHashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", ((zzju.zzb)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzju.zzc().zza(localzzf).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localHashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localObject2 = zzju.zzc().zza(localzzf);
      localObject3 = zzju.zzd.zzb;
      localObject2 = ((zzju.zzb)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3);
      localObject6 = zzju.zze.zzb;
      localHashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", ((zzju.zzb)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzju.zzc().zza(localzzf).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localHashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localObject2 = zzju.zzc().zza(localzzf);
      localObject3 = zzju.zzd.zzc;
      localObject6 = ((zzju.zzb)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3);
      localObject2 = zzju.zze.zzc;
      localHashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", ((zzju.zzb)localObject6).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject1).zza());
      localHashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzju.zzc().zza(localzzf).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localHashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzju.zzc().zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzf)localObject4).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject3).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zze)localObject2).zza((com.google.android.gms.internal.firebase-auth-api.zzju.zza)localObject5).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzon.zza().zza(zza);
      zzon.zza().zza(zzb);
      zzoc.zza().zza(zze, com.google.android.gms.internal.firebase-auth-api.zzju.class);
      zzna.zza().zza(zzc, true);
      zzna.zza().zza(zzd, false);
      return;
    }
    throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */