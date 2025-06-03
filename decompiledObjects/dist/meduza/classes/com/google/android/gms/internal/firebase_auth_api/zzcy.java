package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzcy
{
  private static final zzoy<zzcx, zzbe> zza = zzoy.zza(new zzdb(), com.google.android.gms.internal.firebase-auth-api.zzcx.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zzsj.zzf());
  private static final zzog<zzdc> zzc = new zzda();
  private static final zzoe<zzdc> zzd = new zzdd();
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zze = zzij.zza.zzb;
  
  public static com.google.android.gms.internal.firebase-auth-api.zzcx zza(com.google.android.gms.internal.firebase-auth-api.zzdc paramzzdc, Integer paramInteger)
  {
    if ((paramzzdc.zzb() != 16) && (paramzzdc.zzb() != 32)) {
      throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
    }
    return zzcx.zzb().zza(paramzzdc).zza(paramInteger).zza(zzzo.zza(paramzzdc.zzb())).zzb(zzzo.zza(paramzzdc.zzc())).zza();
  }
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
  }
  
  public static void zza(boolean paramBoolean)
  {
    com.google.android.gms.internal.firebase-auth-api.zzij.zza localzza = zze;
    if (localzza.zza())
    {
      zzga.zza();
      zzon.zza().zza(zza);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("AES128_CTR_HMAC_SHA256", zzfg.zze);
      Object localObject = zzdc.zzf().zza(16).zzb(32).zzd(16).zzc(16);
      com.google.android.gms.internal.firebase-auth-api.zzdc.zza localzza1 = zzdc.zza.zzc;
      com.google.android.gms.internal.firebase-auth-api.zzdc.zzb localzzb = ((zzdc.zzb)localObject).zza(localzza1);
      localObject = zzdc.zzc.zzc;
      localHashMap.put("AES128_CTR_HMAC_SHA256_RAW", localzzb.zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject).zza());
      localHashMap.put("AES256_CTR_HMAC_SHA256", zzfg.zzf);
      localHashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdc.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(localzza1).zza((com.google.android.gms.internal.firebase-auth-api.zzdc.zzc)localObject).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoh.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzdc.class);
      zzoc.zza().zza(zzd, com.google.android.gms.internal.firebase-auth-api.zzdc.class);
      zzna.zza().zza(zzb, localzza, true);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */