package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzib
{
  private static final zzzn zza;
  private static final zzou<zzfy, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzfv, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    zza = localzzzn;
    zzb = zzou.zza(new zzie(), com.google.android.gms.internal.firebase-auth-api.zzfy.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzid(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzig(), com.google.android.gms.internal.firebase-auth-api.zzfv.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzif(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzfy.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzii.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzfy.zza.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzfy.zza.zzb;
    }
    return zzfy.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzfy.zza paramzza)
  {
    if (zzfy.zza.zza.equals(paramzza)) {
      return zzxd.zzb;
    }
    if (zzfy.zza.zzb.equals(paramzza)) {
      return zzxd.zze;
    }
    if (zzfy.zza.zzc.equals(paramzza)) {
      return zzxd.zzd;
    }
    throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(paramzza)));
  }
  
  public static void zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzom localzzom = zzom.zza();
    localzzom.zza(zzb);
    localzzom.zza(zzc);
    localzzom.zza(zzd);
    localzzom.zza(zze);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzfv zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzxo localzzxo = zzxo.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzxo.zza() == 0) {
          return zzfv.zza(zza(paramzzpn.zzc()), zzzo.zza(localzzxo.zzd().zzd(), zzcm.zza(paramzzcm)), paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzfy zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzxr localzzxr = zzxr.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzzxr.zza() == 0) {
          return zzfy.zza(zza(paramzzpm.zza().zzd()));
        }
        throw new GeneralSecurityException("Only version 0 parameters are accepted");
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */