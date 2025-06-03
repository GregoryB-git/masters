package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzga
{
  private static final zzzn zza;
  private static final zzou<zzdc, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzcx, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzgc(), com.google.android.gms.internal.firebase-auth-api.zzdc.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzgb(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzge(), com.google.android.gms.internal.firebase-auth-api.zzcx.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzgd(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdc.zza zza(com.google.android.gms.internal.firebase-auth-api.zzvc paramzzvc)
  {
    int i = zzgg.zzb[paramzzvc.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i == 5) {
              return zzdc.zza.zze;
            }
            throw new GeneralSecurityException(j.g("Unable to parse HashType: ", paramzzvc.zza()));
          }
          return zzdc.zza.zzd;
        }
        return zzdc.zza.zzc;
      }
      return zzdc.zza.zzb;
    }
    return zzdc.zza.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    int i = zzgg.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if ((i != 2) && (i != 3))
      {
        if (i == 4) {
          return zzdc.zzc.zzc;
        }
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
      return zzdc.zzc.zzb;
    }
    return zzdc.zzc.zza;
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzdc.zzc paramzzc)
  {
    if (zzdc.zzc.zza.equals(paramzzc)) {
      return zzxd.zzb;
    }
    if (zzdc.zzc.zzb.equals(paramzzc)) {
      return zzxd.zze;
    }
    if (zzdc.zzc.zzc.equals(paramzzc)) {
      return zzxd.zzd;
    }
    throw new GeneralSecurityException(f.j("Unable to serialize variant: ", String.valueOf(paramzzc)));
  }
  
  public static void zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzom localzzom = zzom.zza();
    localzzom.zza(zzb);
    localzzom.zza(zzc);
    localzzom.zza(zzd);
    localzzom.zza(zze);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzcx zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzsj localzzsj = zzsj.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzsj.zza() == 0)
        {
          if (localzzsj.zzd().zza() == 0)
          {
            if (localzzsj.zze().zza() == 0)
            {
              com.google.android.gms.internal.firebase-auth-api.zzdc localzzdc = zzdc.zzf().zza(localzzsj.zzd().zzf().zzb()).zzb(localzzsj.zze().zzf().zzb()).zzc(localzzsj.zzd().zze().zza()).zzd(localzzsj.zze().zze().zza()).zza(zza(localzzsj.zze().zze().zzb())).zza(zza(paramzzpn.zzc())).zza();
              return zzcx.zzb().zza(localzzdc).zza(zzzo.zza(localzzsj.zzd().zzf().zzd(), zzcm.zza(paramzzcm))).zzb(zzzo.zza(localzzsj.zze().zzf().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
            }
            paramzzpn = new java/security/GeneralSecurityException;
            paramzzpn.<init>("Only version 0 keys inner HMAC keys are accepted");
            throw paramzzpn;
          }
          paramzzpn = new java/security/GeneralSecurityException;
          paramzzpn.<init>("Only version 0 keys inner AES CTR keys are accepted");
          throw paramzzpn;
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzdc zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzsm localzzsm = zzsm.zza(paramzzpm.zza().zze(), zzajv.zza());
        if (localzzsm.zzd().zzb() == 0) {
          return zzdc.zzf().zza(localzzsm.zzc().zza()).zzb(localzzsm.zzd().zza()).zzc(localzzsm.zzc().zze().zza()).zzd(localzzsm.zzd().zzf().zza()).zza(zza(localzzsm.zzd().zzf().zzb())).zza(zza(paramzzpm.zza().zzd())).zza();
        }
        throw new GeneralSecurityException("Only version 0 keys are accepted");
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzvh zzb(com.google.android.gms.internal.firebase-auth-api.zzdc paramzzdc)
  {
    com.google.android.gms.internal.firebase-auth-api.zzvh.zza localzza = zzvh.zzc().zza(paramzzdc.zze());
    paramzzdc = paramzzdc.zzg();
    if (zzdc.zza.zza.equals(paramzzdc))
    {
      paramzzdc = zzvc.zza;
    }
    else if (zzdc.zza.zzb.equals(paramzzdc))
    {
      paramzzdc = zzvc.zze;
    }
    else if (zzdc.zza.zzc.equals(paramzzdc))
    {
      paramzzdc = zzvc.zzc;
    }
    else if (zzdc.zza.zzd.equals(paramzzdc))
    {
      paramzzdc = zzvc.zzb;
    }
    else
    {
      if (!zzdc.zza.zze.equals(paramzzdc)) {
        break label113;
      }
      paramzzdc = zzvc.zzd;
    }
    return (zzvh)localzza.zza(paramzzdc).zze();
    label113:
    throw new GeneralSecurityException(f.j("Unable to serialize HashType ", String.valueOf(paramzzdc)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */