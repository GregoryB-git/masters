package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzgn
{
  private static final zzzn zza;
  private static final zzou<zzdr, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzdm, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzgq(), com.google.android.gms.internal.firebase-auth-api.zzdr.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzgp(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzgs(), com.google.android.gms.internal.firebase-auth-api.zzdm.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzgr(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdr.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzgu.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzdr.zza.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzdr.zza.zzb;
    }
    return zzdr.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzdr.zza paramzza)
  {
    if (zzdr.zza.zza.equals(paramzza)) {
      return zzxd.zzb;
    }
    if (zzdr.zza.zzb.equals(paramzza)) {
      return zzxd.zze;
    }
    if (zzdr.zza.zzc.equals(paramzza)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdm zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzth localzzth = zzth.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzth.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzdr localzzdr = zzdr.zze().zzb(localzzth.zzd().zzb()).zza(12).zzc(16).zza(zza(paramzzpn.zzc())).zza();
          return zzdm.zzb().zza(localzzdr).zza(zzzo.zza(localzzth.zzd().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesGcmKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdr zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztk localzztk = zztk.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzztk.zzb() == 0) {
          return zzdr.zze().zzb(localzztk.zza()).zza(12).zzc(16).zza(zza(paramzzpm.zza().zzd())).zza();
        }
        throw new GeneralSecurityException("Only version 0 parameters are accepted");
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static void zzb(com.google.android.gms.internal.firebase-auth-api.zzdr paramzzdr)
  {
    if (paramzzdr.zzd() == 16)
    {
      if (paramzzdr.zzb() == 12) {
        return;
      }
      throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[] { Integer.valueOf(paramzzdr.zzb()) }));
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[] { Integer.valueOf(paramzzdr.zzd()) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzgn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */