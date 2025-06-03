package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzec
{
  private static final zzoy<zzed, zzbe> zza = zzoy.zza(new zzef(), com.google.android.gms.internal.firebase-auth-api.zzed.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzoe<zzeg> zzb = new zzee();
  private static final zzbn<zzbe> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zztz.zze());
  
  public static com.google.android.gms.internal.firebase-auth-api.zzed zza(com.google.android.gms.internal.firebase-auth-api.zzeg paramzzeg, Integer paramInteger)
  {
    return zzed.zza(paramzzeg.zzb(), zzzo.zza(32), paramInteger);
  }
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzhb.zza();
      zzon.zza().zza(zza);
      zzoc.zza().zza(zzb, com.google.android.gms.internal.firebase-auth-api.zzeg.class);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("CHACHA20_POLY1305", zzeg.zza(zzeg.zza.zza));
      localHashMap.put("CHACHA20_POLY1305_RAW", zzeg.zza(zzeg.zza.zzc));
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzna.zza().zza(zzc, true);
      return;
    }
    throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */