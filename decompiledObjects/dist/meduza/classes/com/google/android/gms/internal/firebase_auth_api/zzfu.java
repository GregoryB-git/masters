package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

public final class zzfu
{
  private static final zzoy<zzfv, zzbe> zza = zzoy.zza(new zzfx(), com.google.android.gms.internal.firebase-auth-api.zzfv.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zzxo.zze());
  private static final zzog<zzfy> zzc = new zzfw();
  private static final zzoe<zzfy> zzd = new zzfz();
  
  public static com.google.android.gms.internal.firebase-auth-api.zzfv zza(com.google.android.gms.internal.firebase-auth-api.zzfy paramzzfy, Integer paramInteger)
  {
    return zzfv.zza(paramzzfy.zzb(), zzzo.zza(32), paramInteger);
  }
  
  public static String zza()
  {
    return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
  }
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzib.zza();
      zzon.zza().zza(zza);
      com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
      HashMap localHashMap = new HashMap();
      localHashMap.put("XCHACHA20_POLY1305", zzfy.zza(zzfy.zza.zza));
      localHashMap.put("XCHACHA20_POLY1305_RAW", zzfy.zza(zzfy.zza.zzc));
      localzzok.zza(Collections.unmodifiableMap(localHashMap));
      zzoc.zza().zza(zzd, com.google.android.gms.internal.firebase-auth-api.zzfy.class);
      zzoh.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzfy.class);
      zzna.zza().zza(zzb, true);
      return;
    }
    throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */