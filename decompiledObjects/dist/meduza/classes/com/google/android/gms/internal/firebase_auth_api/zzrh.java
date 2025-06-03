package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzrh
{
  private static final zzzn zza;
  private static final zzou<zzqf, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzqa, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzrk(), com.google.android.gms.internal.firebase-auth-api.zzqf.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzrj(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzrm(), com.google.android.gms.internal.firebase-auth-api.zzqa.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzrl(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzqf.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzro.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return zzqf.zza.zzd;
          }
          throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
        }
        return zzqf.zza.zzc;
      }
      return zzqf.zza.zzb;
    }
    return zzqf.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzqf.zza paramzza)
  {
    if (zzqf.zza.zza.equals(paramzza)) {
      return zzxd.zzb;
    }
    if (zzqf.zza.zzb.equals(paramzza)) {
      return zzxd.zze;
    }
    if (zzqf.zza.zzd.equals(paramzza)) {
      return zzxd.zzd;
    }
    if (zzqf.zza.zzc.equals(paramzza)) {
      return zzxd.zzc;
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzqa zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzsa localzzsa = zzsa.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzsa.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzqf localzzqf = zzqf.zzd().zza(localzzsa.zze().zzb()).zzb(localzzsa.zzd().zza()).zza(zza(paramzzpn.zzc())).zza();
          return zzqa.zzb().zza(localzzqf).zza(zzzo.zza(localzzsa.zze().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm|IllegalArgumentException paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesCmacKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzqf zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzsd localzzsd = zzsd.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zzqf.zzd().zza(localzzsd.zza()).zzb(localzzsd.zzd().zza()).zza(zza(paramzzpm.zza().zzd())).zza();
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzsg zzb(com.google.android.gms.internal.firebase-auth-api.zzqf paramzzqf)
  {
    return (zzsg)zzsg.zzb().zza(paramzzqf.zzb()).zze();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzrh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */