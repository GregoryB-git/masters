package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;

public final class zzei
{
  private static final zzoy<zzen, zzbe> zza = zzoy.zza(new zzeh(), com.google.android.gms.internal.firebase-auth-api.zzen.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zze, zzwr.zze());
  private static final zzoe<zzep> zzc = new zzek();
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzer.zza();
      zzon.zza().zza(zza);
      zzoc.zza().zza(zzc, com.google.android.gms.internal.firebase-auth-api.zzep.class);
      zzna.zza().zza(zzb, true);
      return;
    }
    throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */