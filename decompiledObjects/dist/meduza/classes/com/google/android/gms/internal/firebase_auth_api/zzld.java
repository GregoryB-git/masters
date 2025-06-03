package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

public final class zzld
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzzn zza;
  private static final com.google.android.gms.internal.firebase-auth-api.zzzn zzb;
  private static final zzou<zzjq, zzpm> zzc;
  private static final zzoq<zzpm> zzd;
  private static final zznh<zzjs, zzpn> zze;
  private static final zznd<zzpn> zzf;
  private static final zznh<zzjt, zzpn> zzg;
  private static final zznd<zzpn> zzh;
  private static final zzmv<zzxd, zzjq.zze> zzi;
  private static final zzmv<zzvc, zzjq.zzd> zzj = zzmv.zza().zza(zzvc.zza, zzjq.zzd.zza).zza(zzvc.zze, zzjq.zzd.zzb).zza(zzvc.zzc, zzjq.zzd.zzc).zza(zzvc.zzb, zzjq.zzd.zzd).zza(zzvc.zzd, zzjq.zzd.zze).zza();
  private static final zzmv<zzuw, zzjq.zza> zzk = zzmv.zza().zza(zzuw.zza, zzjq.zza.zza).zza(zzuw.zzb, zzjq.zza.zzb).zza(zzuw.zzc, zzjq.zza.zzc).zza(zzuw.zzd, zzjq.zza.zzd).zza();
  private static final zzmv<zzuf, zzjq.zzc> zzl = zzmv.zza().zza(zzuf.zza, zzjq.zzc.zzb).zza(zzuf.zzb, zzjq.zzc.zza).zza(zzuf.zzc, zzjq.zzc.zzc).zza();
  
  static
  {
    Object localObject1 = zzpy.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    zza = (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1;
    Object localObject2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    zzb = (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject2;
    zzc = zzou.zza(new zzlc(), com.google.android.gms.internal.firebase-auth-api.zzjq.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zzoq.zza(new zzlf(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zze = zznh.zza(new zzle(), com.google.android.gms.internal.firebase-auth-api.zzjs.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzf = zznd.zza(new zzlh(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject2, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzg = zznh.zza(new zzlg(), com.google.android.gms.internal.firebase-auth-api.zzjt.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzh = zznd.zza(new zzlj(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    localObject2 = zzmv.zza().zza(zzxd.zzd, zzjq.zze.zzc).zza(zzxd.zzb, zzjq.zze.zza);
    com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd = zzxd.zzc;
    localObject1 = zzjq.zze.zzb;
    zzi = ((zzmu)localObject2).zza(localzzxd, localObject1).zza(zzxd.zze, localObject1).zza();
  }
  
  private static int zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zza paramzza)
  {
    if (zzjq.zza.zza.equals(paramzza)) {
      return 33;
    }
    if (zzjq.zza.zzb.equals(paramzza)) {
      return 49;
    }
    if (zzjq.zza.zzc.equals(paramzza)) {
      return 67;
    }
    throw new GeneralSecurityException(f.j("Unable to serialize CurveType ", String.valueOf(paramzza)));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzjq zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, com.google.android.gms.internal.firebase-auth-api.zzuk paramzzuk)
  {
    zzwf localzzwf = (zzwf)zzwf.zza().zza(paramzzuk.zzb().zzd().zzf()).zza(zzxd.zzd).zza(paramzzuk.zzb().zzd().zze()).zze();
    paramzzxd = zzjq.zzc().zza((zzjq.zze)zzi.zza(paramzzxd)).zza((zzjq.zza)zzk.zza(paramzzuk.zzf().zzd())).zza((zzjq.zzd)zzj.zza(paramzzuk.zzf().zze())).zza(zzco.zza(localzzwf.zzk())).zza(zzzn.zza(paramzzuk.zzf().zzf().zzd()));
    if (!paramzzuk.zzf().zzd().equals(zzuw.zzd)) {
      paramzzxd.zza((zzjq.zzc)zzl.zza(paramzzuk.zza()));
    } else {
      if (!paramzzuk.zza().equals(zzuf.zzb)) {
        break label181;
      }
    }
    return paramzzxd.zza();
    label181:
    throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzuq zza(com.google.android.gms.internal.firebase-auth-api.zzjs paramzzjs)
  {
    if (paramzzjs.zzb().zzd().equals(zzjq.zza.zzd)) {
      paramzzjs = zzuq.zzc().zza(0).zza(zzb(paramzzjs.zzb())).zza(zzaiw.zza(paramzzjs.zzd().zzb()));
    }
    int i;
    for (Object localObject = zzaiw.zza;; localObject = zzaiw.zza(zzmo.zza(((ECPoint)localObject).getAffineY(), i)))
    {
      return (zzuq)paramzzjs.zzb((com.google.android.gms.internal.firebase-auth-api.zzaiw)localObject).zze();
      i = zza(paramzzjs.zzb().zzd());
      localObject = paramzzjs.zze();
      if (localObject == null) {
        break;
      }
      paramzzjs = zzuq.zzc().zza(0).zza(zzb(paramzzjs.zzb())).zza(zzaiw.zza(zzmo.zza(((ECPoint)localObject).getAffineX(), i)));
    }
    throw new GeneralSecurityException("NistCurvePoint was null for NIST curve");
  }
  
  public static void zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzom localzzom = zzom.zza();
    localzzom.zza(zzc);
    localzzom.zza(zzd);
    localzzom.zza(zze);
    localzzom.zza(zzf);
    localzzom.zza(zzg);
    localzzom.zza(zzh);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzjq zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzuh localzzuh = zzuh.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zza(paramzzpm.zza().zzd(), localzzuh.zzc());
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing EciesParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzuk zzb(com.google.android.gms.internal.firebase-auth-api.zzjq paramzzjq)
  {
    Object localObject = zzut.zza().zza((zzuw)zzk.zza(paramzzjq.zzd())).zza((zzvc)zzj.zza(paramzzjq.zze()));
    if ((paramzzjq.zzh() != null) && (paramzzjq.zzh().zza() > 0)) {
      ((zzut.zza)localObject).zza(zzaiw.zza(paramzzjq.zzh().zzb()));
    }
    zzut localzzut = (zzut)((zzakg.zzb)localObject).zze();
    try
    {
      localObject = zzwf.zza(zzco.zza(paramzzjq.zzb()), zzajv.zza());
      zzue localzzue = (zzue)zzue.zza().zza((zzwf)zzwf.zza().zza(((zzwf)localObject).zzf()).zza(zzxd.zzb).zza(((zzwf)localObject).zze()).zze()).zze();
      localObject = paramzzjq.zzf();
      paramzzjq = (com.google.android.gms.internal.firebase-auth-api.zzjq)localObject;
      if (localObject == null) {
        paramzzjq = zzjq.zzc.zza;
      }
      return (zzuk)zzuk.zzc().zza(localzzut).zza(localzzue).zza((zzuf)zzl.zza(paramzzjq)).zze();
    }
    catch (zzakm paramzzjq)
    {
      throw new GeneralSecurityException("Parsing EciesParameters failed: ", paramzzjq);
    }
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzjt zzc(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzun localzzun = zzun.zza(paramzzpn.zzd(), zzajv.zza());
        int i = localzzun.zza();
        if (i == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzuq localzzuq = localzzun.zzd();
          if (localzzuq.zza() == 0)
          {
            com.google.android.gms.internal.firebase-auth-api.zzjq localzzjq = zza(paramzzpn.zzc(), localzzuq.zzb());
            if (localzzjq.zzd().equals(zzjq.zza.zzd)) {
              return zzjt.zza(zzjs.zza(localzzjq, zzzn.zza(localzzuq.zzf().zzd()), paramzzpn.zze()), zzzo.zza(localzzun.zze().zzd(), zzcm.zza(paramzzcm)));
            }
            ECPoint localECPoint = new java/security/spec/ECPoint;
            localECPoint.<init>(zzmo.zza(localzzuq.zzf().zzd()), zzmo.zza(localzzuq.zzg().zzd()));
            return zzjt.zza(zzjs.zza(localzzjq, localECPoint, paramzzpn.zze()), zzzm.zza(zzmo.zza(localzzun.zze().zzd()), zzcm.zza(paramzzcm)));
          }
          paramzzpn = new java/security/GeneralSecurityException;
          paramzzpn.<init>("Only version 0 keys are accepted");
          throw paramzzpn;
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm|IllegalArgumentException paramzzpn)
      {
        throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: ", paramzzpn.zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzjs zzd(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzuq localzzuq = zzuq.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzzuq.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzjq localzzjq = zza(paramzzpn.zzc(), localzzuq.zzb());
          if (localzzjq.zzd().equals(zzjq.zza.zzd))
          {
            int i;
            if (localzzuq.zzg().zzb() == 0) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              return zzjs.zza(localzzjq, zzzn.zza(localzzuq.zzf().zzd()), paramzzpn.zze());
            }
            paramzzpn = new java/security/GeneralSecurityException;
            paramzzpn.<init>("Y must be empty for X25519 points");
            throw paramzzpn;
          }
          paramzzcm = new java/security/spec/ECPoint;
          paramzzcm.<init>(zzmo.zza(localzzuq.zzf().zzd()), zzmo.zza(localzzuq.zzg().zzd()));
          return zzjs.zza(localzzjq, paramzzcm, paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm|IllegalArgumentException paramzzpn)
      {
        throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: ", paramzzpn.zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzld
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */