package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzgf
{
  private static final zzzn zza;
  private static final zzou<zzdk, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzdf, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzgi(), com.google.android.gms.internal.firebase-auth-api.zzdk.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzgh(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzgk(), com.google.android.gms.internal.firebase-auth-api.zzdf.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzgj(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzgm.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzdk.zzb.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzdk.zzb.zzb;
    }
    return zzdk.zzb.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzdk.zzb paramzzb)
  {
    if (zzdk.zzb.zza.equals(paramzzb)) {
      return zzxd.zzb;
    }
    if (zzdk.zzb.zzb.equals(paramzzb)) {
      return zzxd.zze;
    }
    if (zzdk.zzb.zzc.equals(paramzzb)) {
      return zzxd.zzd;
    }
    throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(paramzzb)));
  }
  
  public static void zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzom localzzom = zzom.zza();
    localzzom.zza(zzb);
    localzzom.zza(zzc);
    localzzom.zza(zzd);
    localzzom.zza(zze);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdf zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzsy localzzsy = zzsy.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzsy.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzdk localzzdk = zzdk.zze().zzb(localzzsy.zze().zzb()).zza(localzzsy.zzd().zza()).zzc(16).zza(zza(paramzzpn.zzc())).zza();
          return zzdf.zzb().zza(localzzdk).zza(zzzo.zza(localzzsy.zze().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdk zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztb localzztb = zztb.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zzdk.zze().zzb(localzztb.zza()).zza(localzztb.zzd().zza()).zzc(16).zza(zza(paramzzpm.zza().zzd())).zza();
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzte zzb(com.google.android.gms.internal.firebase-auth-api.zzdk paramzzdk)
  {
    if (paramzzdk.zzd() == 16) {
      return (zzte)zzte.zzb().zza(paramzzdk.zzb()).zze();
    }
    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[] { Integer.valueOf(paramzzdk.zzd()) }));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzgf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */