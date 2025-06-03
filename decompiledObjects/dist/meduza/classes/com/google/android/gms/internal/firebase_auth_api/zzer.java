package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzcm;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

final class zzer
{
  private static final zzzn zza;
  private static final zzou<zzep, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzen, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzeq(), com.google.android.gms.internal.firebase-auth-api.zzep.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzet(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzes(), com.google.android.gms.internal.firebase-auth-api.zzen.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzev(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzep.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzeu.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        return zzep.zza.zzb;
      }
      throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
    }
    return zzep.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzep.zza paramzza)
  {
    if (zzep.zza.zza.equals(paramzza)) {
      return zzxd.zzb;
    }
    if (zzep.zza.zzb.equals(paramzza)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzen zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
      try
      {
        paramzzcm = zzwr.zza(paramzzpn.zzd(), zzajv.zza());
        if (paramzzcm.zza() == 0) {
          return zzen.zza(zzep.zza(paramzzcm.zzd().zzd(), zza(paramzzpn.zzc())), paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzcm = String.valueOf(paramzzcm);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("KmsAeadKey are only accepted with version 0, got ");
        localStringBuilder.append(paramzzcm);
        paramzzpn.<init>(localStringBuilder.toString());
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", paramzzpn);
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzep zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzwu localzzwu = zzwu.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zzep.zza(localzzwu.zzd(), zza(paramzzpm.zza().zzd()));
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */