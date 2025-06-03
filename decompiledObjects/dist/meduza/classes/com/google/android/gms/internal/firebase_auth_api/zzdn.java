package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzdn
{
  private static final zzoy<zzdm, zzbe> zza = zzoy.zza(new zzdq(), com.google.android.gms.internal.firebase-auth-api.zzdm.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zzth.zze());
  private static final zzog<zzdr> zzc = new zzdp();
  private static final zzoe<zzdr> zzd = new zzds();
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zze = zzij.zza.zzb;
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.AesGcmKey";
  }
  
  public static void zza(boolean paramBoolean)
  {
    com.google.android.gms.internal.firebase-auth-api.zzij.zza localzza = zze;
    if (localzza.zza())
    {
      zzgn.zza();
      zzon.zza().zza(zza);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("AES128_GCM", zzfg.zza);
      com.google.android.gms.internal.firebase-auth-api.zzdr.zzb localzzb = zzdr.zze().zza(12).zzb(16).zzc(16);
      com.google.android.gms.internal.firebase-auth-api.zzdr.zza localzza1 = zzdr.zza.zzc;
      localHashMap.put("AES128_GCM_RAW", localzzb.zza(localzza1).zza());
      localHashMap.put("AES256_GCM", zzfg.zzb);
      localHashMap.put("AES256_GCM_RAW", zzdr.zze().zza(12).zzb(32).zzc(16).zza(localzza1).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoh.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzdr.class);
      zzoc.zza().zza(zzd, com.google.android.gms.internal.firebase-auth-api.zzdr.class);
      zzna.zza().zza(zzb, localzza, true);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */