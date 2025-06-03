package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzgt
{
  private static final zzzn zza;
  private static final zzou<zzea, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzdt, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzgw(), com.google.android.gms.internal.firebase-auth-api.zzea.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzgv(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzgy(), com.google.android.gms.internal.firebase-auth-api.zzdt.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzgx(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzea.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzha.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzea.zzb.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzea.zzb.zzb;
    }
    return zzea.zzb.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzea.zzb paramzzb)
  {
    if (zzea.zzb.zza.equals(paramzzb)) {
      return zzxd.zzb;
    }
    if (zzea.zzb.zzb.equals(paramzzb)) {
      return zzxd.zze;
    }
    if (zzea.zzb.zzc.equals(paramzzb)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdt zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztn localzztn = zztn.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzztn.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzea localzzea = zzea.zzc().zza(localzztn.zzd().zzb()).zza(zza(paramzzpn.zzc())).zza();
          return zzdt.zzb().zza(localzzea).zza(zzzo.zza(localzztn.zzd().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzea zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztq localzztq = zztq.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzztq.zzb() == 0) {
          return zzea.zzc().zza(localzztq.zza()).zza(zza(paramzzpm.zza().zzd())).zza();
        }
        throw new GeneralSecurityException("Only version 0 parameters are accepted");
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzgt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */