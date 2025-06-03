package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

public final class zzip
{
  private static final zzoy<zzio, zzbk> zza = zzoy.zza(new zzis(), com.google.android.gms.internal.firebase-auth-api.zzio.class, com.google.android.gms.internal.firebase-auth-api.zzbk.class);
  private static final zzbn<zzbk> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.AesSivKey", com.google.android.gms.internal.firebase-auth-api.zzbk.class, zzwb.zza.zzb, zztt.zze());
  private static final zzog<zzit> zzc = new zzir();
  private static final zzoe<zzit> zzd = new zziu();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzio zza(com.google.android.gms.internal.firebase-auth-api.zzit paramzzit, Integer paramInteger)
  {
    zza(paramzzit);
    return zzio.zzb().zza(paramzzit).zza(paramInteger).zza(zzzo.zza(paramzzit.zzb())).zza();
  }
  
  private static void zza(com.google.android.gms.internal.firebase-auth-api.zzit paramzzit)
  {
    if (paramzzit.zzb() == 64) {
      return;
    }
    int i = paramzzit.zzb();
    paramzzit = new StringBuilder("invalid key size: ");
    paramzzit.append(i);
    paramzzit.append(". Valid keys must have 64 bytes.");
    throw new InvalidAlgorithmParameterException(paramzzit.toString());
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzjd.zza();
      zzon.zza().zza(zza);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("AES256_SIV", zzjb.zza);
      localHashMap.put("AES256_SIV_RAW", zzit.zzc().zza(64).zza(zzit.zza.zzc).zza());
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoh.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzit.class);
      zzoc.zza().zza(zzd, com.google.android.gms.internal.firebase-auth-api.zzit.class);
      zzna.zza().zza(zzb, true);
      return;
    }
    throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */