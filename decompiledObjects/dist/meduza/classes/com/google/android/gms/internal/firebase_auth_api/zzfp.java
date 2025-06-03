package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collections;
import java.util.HashMap;

public final class zzfp
{
  private static final zzoe<zzft> zza = new zzfs();
  private static final zzoy<zzfq, zzbe> zzb = zzoy.zza(new zzfr(), com.google.android.gms.internal.firebase-auth-api.zzfq.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  
  public static void zza(boolean paramBoolean)
  {
    zzhw.zza();
    com.google.android.gms.internal.firebase-auth-api.zzok localzzok = zzok.zza();
    HashMap localHashMap = new HashMap();
    localHashMap.put("XAES_256_GCM_192_BIT_NONCE", zzfg.zzg);
    localHashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzfg.zzh);
    localHashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzfg.zzi);
    localHashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzfg.zzj);
    localzzok.zza(Collections.unmodifiableMap(localHashMap));
    zzon.zza().zza(zzb);
    zzoc.zza().zza(zza, com.google.android.gms.internal.firebase-auth-api.zzft.class);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */