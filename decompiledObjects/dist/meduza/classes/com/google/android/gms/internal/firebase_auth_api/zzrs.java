package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzrs
{
  private static final zzzn zza;
  private static final zzmv<zzxd, zzqs.zzc> zzb;
  private static final zzmv<zzvc, zzqs.zza> zzc;
  private static final zzou<zzqs, zzpm> zzd;
  private static final zzoq<zzpm> zze;
  private static final zznh<zzql, zzpn> zzf;
  private static final zznd<zzpn> zzg;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
    zza = localzzzn;
    zzb = zzmv.zza().zza(zzxd.zzd, zzqs.zzc.zzd).zza(zzxd.zzb, zzqs.zzc.zza).zza(zzxd.zzc, zzqs.zzc.zzc).zza(zzxd.zze, zzqs.zzc.zzb).zza();
    zzc = zzmv.zza().zza(zzvc.zza, zzqs.zza.zza).zza(zzvc.zze, zzqs.zza.zzb).zza(zzvc.zzc, zzqs.zza.zzc).zza(zzvc.zzb, zzqs.zza.zzd).zza(zzvc.zzd, zzqs.zza.zze).zza();
    zzd = zzou.zza(new zzrr(), com.google.android.gms.internal.firebase-auth-api.zzqs.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zze = zzoq.zza(new zzru(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzf = zznh.zza(new zzrt(), com.google.android.gms.internal.firebase-auth-api.zzql.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzg = zznd.zza(new zzrw(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  public static void zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzom localzzom = zzom.zza();
    localzzom.zza(zzd);
    localzzom.zza(zze);
    localzzom.zza(zzf);
    localzzom.zza(zzg);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzql zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzvb localzzvb = zzvb.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzvb.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzqs localzzqs = zzqs.zzd().zza(localzzvb.zzf().zzb()).zzb(localzzvb.zze().zza()).zza((zzqs.zza)zzc.zza(localzzvb.zze().zzb())).zza((zzqs.zzc)zzb.zza(paramzzpn.zzc())).zza();
          return zzql.zzb().zza(localzzqs).zza(zzzo.zza(localzzvb.zzf().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm|IllegalArgumentException paramzzpn)
      {
        throw new GeneralSecurityException("Parsing HmacKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzqs zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzve localzzve = zzve.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzzve.zzb() == 0) {
          return zzqs.zzd().zza(localzzve.zza()).zzb(localzzve.zzf().zza()).zza((zzqs.zza)zzc.zza(localzzve.zzf().zzb())).zza((zzqs.zzc)zzb.zza(paramzzpm.zza().zzd())).zza();
        }
        throw new GeneralSecurityException(j.g("Parsing HmacParameters failed: unknown Version ", localzzve.zzb()));
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing HmacParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzvh zzb(com.google.android.gms.internal.firebase-auth-api.zzqs paramzzqs)
  {
    return (zzvh)zzvh.zzc().zza(paramzzqs.zzb()).zza((zzvc)zzc.zza(paramzzqs.zze())).zze();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzrs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */