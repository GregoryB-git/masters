package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;

public final class zzem
{
  private static final zzbn<zzbe> zza = zznl.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", com.google.android.gms.internal.firebase-auth-api.zzbe.class, zzwb.zza.zzb, zzwx.zze());
  private static final zzoe<zzew> zzb = new zzel();
  private static final zzoy<zzex, zzbe> zzc = zzoy.zza(new zzeo(), com.google.android.gms.internal.firebase-auth-api.zzex.class, com.google.android.gms.internal.firebase-auth-api.zzbe.class);
  
  public static void zza(boolean paramBoolean)
  {
    if (zzij.zza.zza.zza())
    {
      zzfa.zza();
      zzoc.zza().zza(zzb, com.google.android.gms.internal.firebase-auth-api.zzew.class);
      zzon.zza().zza(zzc);
      zzna.zza().zza(zza, true);
      return;
    }
    throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */