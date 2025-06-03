package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzdg
{
  private static final zzoy<zzdf, zzbe> zza = zzoy.zza(new zzdj(), com.google.android.gms.internal.firebase-auth-api.zzdf.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zzsy.zzf());
  private static final zzoe<zzdk> zzc = new zzdi();
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.AesEaxKey";
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzgf.zza();
      zzon.zza().zza(zza);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("AES128_EAX", zzfg.zzc);
      com.google.android.gms.internal.firebase-auth-api.zzdk.zza localzza = zzdk.zze().zza(16).zzb(16).zzc(16);
      com.google.android.gms.internal.firebase-auth-api.zzdk.zzb localzzb = zzdk.zzb.zzc;
      localHashMap.put("AES128_EAX_RAW", localzza.zza(localzzb).zza());
      localHashMap.put("AES256_EAX", zzfg.zzd);
      localHashMap.put("AES256_EAX_RAW", zzdk.zze().zza(16).zzb(32).zzc(16).zza(localzzb).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoc.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzdk.class);
      zzna.zza().zza(zzb, true);
      return;
    }
    throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */