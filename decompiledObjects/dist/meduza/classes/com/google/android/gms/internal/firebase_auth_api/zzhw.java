package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class zzhw
{
  private static final zzzn zza;
  private static final zzou<zzft, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzfq, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzhv(), com.google.android.gms.internal.firebase-auth-api.zzft.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzhy(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzhx(), com.google.android.gms.internal.firebase-auth-api.zzfq.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzia(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzft.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzhz.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return zzft.zza.zzb;
      }
      throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
    }
    return zzft.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzft.zza paramzza)
  {
    if (Objects.equals(paramzza, zzft.zza.zza)) {
      return zzxd.zzb;
    }
    if (Objects.equals(paramzza, zzft.zza.zzb)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzfq zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzxf localzzxf = zzxf.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzxf.zza() == 0)
        {
          if (localzzxf.zze().zzb() == 32) {
            return zzfq.zza(zzft.zza(zza(paramzzpn.zzc()), localzzxf.zzd().zza()), zzzo.zza(localzzxf.zze().zzd(), zzcm.zza(paramzzcm)), paramzzpn.zze());
          }
          paramzzpn = new java/security/GeneralSecurityException;
          paramzzpn.<init>("Only 32 byte key size is accepted");
          throw paramzzpn;
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing XAesGcmKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzft zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzxi localzzxi = zzxi.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzzxi.zza() == 0) {
          return zzft.zza(zza(paramzzpm.zza().zzd()), localzzxi.zzd().zza());
        }
        throw new GeneralSecurityException("Only version 0 parameters are accepted");
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */