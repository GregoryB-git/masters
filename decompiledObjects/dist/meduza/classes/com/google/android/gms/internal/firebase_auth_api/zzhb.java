package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzhb
{
  private static final zzzn zza;
  private static final zzou<zzeg, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzed, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
    zza = localzzzn;
    zzb = zzou.zza(new zzhe(), com.google.android.gms.internal.firebase-auth-api.zzeg.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzhd(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzhg(), com.google.android.gms.internal.firebase-auth-api.zzed.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzhf(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzeg.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzhi.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzeg.zza.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzeg.zza.zzb;
    }
    return zzeg.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzeg.zza paramzza)
  {
    if (zzeg.zza.zza.equals(paramzza)) {
      return zzxd.zzb;
    }
    if (zzeg.zza.zzb.equals(paramzza)) {
      return zzxd.zze;
    }
    if (zzeg.zza.zzc.equals(paramzza)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzed zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztz localzztz = zztz.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzztz.zza() == 0) {
          return zzed.zza(zza(paramzzpn.zzc()), zzzo.zza(localzztz.zzd().zzd(), zzcm.zza(paramzzcm)), paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzeg zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
      try
      {
        zzuc.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zzeg.zza(zza(paramzzpm.zza().zzd()));
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */