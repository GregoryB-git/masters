package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

public final class zzdx
{
  private static final zzoy<zzdt, zzbe> zza = zzoy.zza(new zzdw(), com.google.android.gms.internal.firebase-auth-api.zzdt.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzoe<zzea> zzb = new zzdz();
  private static final zzog<zzea> zzc = new zzdy();
  private static final zzbn<zzbe> zzd = zznl.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zztn.zze());
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzgt.zza();
      if (zza())
      {
        zzon.zza().zza(zza);
        com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
        HashMap localHashMap = new HashMap();
        com.google.android.gms.internal.firebase-auth-api.zzea.zza localzza = zzea.zzc().zza(16);
        com.google.android.gms.internal.firebase-auth-api.zzea.zzb localzzb1 = zzea.zzb.zza;
        localHashMap.put("AES128_GCM_SIV", localzza.zza(localzzb1).zza());
        localzza = zzea.zzc().zza(16);
        com.google.android.gms.internal.firebase-auth-api.zzea.zzb localzzb2 = zzea.zzb.zzc;
        localHashMap.put("AES128_GCM_SIV_RAW", localzza.zza(localzzb2).zza());
        localHashMap.put("AES256_GCM_SIV", zzea.zzc().zza(32).zza(localzzb1).zza());
        localHashMap.put("AES256_GCM_SIV_RAW", zzea.zzc().zza(32).zza(localzzb2).zza());
        localzzok.zza(Collections.unmodifiableMap(localHashMap));
        zzoh.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzea.class);
        zzoc.zza().zza(zzb, com.google.android.gms.internal.firebase-auth-api.zzea.class);
        zzna.zza().zza(zzd, true);
      }
      return;
    }
    throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
  }
  
  private static boolean zza()
  {
    try
    {
      Cipher.getInstance("AES/GCM-SIV/NoPadding");
      return true;
    }
    catch (NoSuchAlgorithmException|NoSuchPaddingException localNoSuchAlgorithmException) {}
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */