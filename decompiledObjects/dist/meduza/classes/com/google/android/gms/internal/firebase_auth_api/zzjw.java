package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.security.GeneralSecurityException;

public final class zzjw
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzzn zza;
  private static final com.google.android.gms.internal.firebase-auth-api.zzzn zzb;
  private static final zzou<zzju, zzpm> zzc;
  private static final zzoq<zzpm> zzd;
  private static final zznh<zzkf, zzpn> zze;
  private static final zznd<zzpn> zzf;
  private static final zznh<zzjx, zzpn> zzg;
  private static final zznd<zzpn> zzh;
  private static final zzmv<zzxd, zzju.zzf> zzi;
  private static final zzmv<zzvm, zzju.zzd> zzj = zzmv.zza().zza(zzvm.zzb, zzju.zzd.zza).zza(zzvm.zzc, zzju.zzd.zzb).zza(zzvm.zzd, zzju.zzd.zzc).zza(zzvm.zza, zzju.zzd.zzd).zza();
  private static final zzmv<zzvn, zzju.zze> zzk = zzmv.zza().zza(zzvn.zza, zzju.zze.zza).zza(zzvn.zzb, zzju.zze.zzb).zza(zzvn.zzc, zzju.zze.zzc).zza();
  private static final zzmv<zzvk, zzju.zza> zzl = zzmv.zza().zza(zzvk.zza, zzju.zza.zza).zza(zzvk.zzb, zzju.zza.zzb).zza(zzvk.zzc, zzju.zza.zzc).zza();
  
  static
  {
    Object localObject1 = zzpy.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
    zza = (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1;
    Object localObject2 = zzpy.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
    zzb = (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject2;
    zzc = zzou.zza(new zzjz(), com.google.android.gms.internal.firebase-auth-api.zzju.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zzoq.zza(new zzjy(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zze = zznh.zza(new zzkb(), com.google.android.gms.internal.firebase-auth-api.zzkf.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzf = zznd.zza(new zzka(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject2, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzg = zznh.zza(new zzkd(), com.google.android.gms.internal.firebase-auth-api.zzjx.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zzh = zznd.zza(new zzkc(), (com.google.android.gms.internal.firebase-auth-api.zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    com.google.android.gms.internal.firebase-auth-api.zzmu localzzmu = zzmv.zza().zza(zzxd.zzd, zzju.zzf.zzc).zza(zzxd.zzb, zzju.zzf.zza);
    localObject1 = zzxd.zzc;
    localObject2 = zzju.zzf.zzb;
    zzi = localzzmu.zza((Enum)localObject1, localObject2).zza(zzxd.zze, localObject2).zza();
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzju zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, com.google.android.gms.internal.firebase-auth-api.zzvs paramzzvs)
  {
    return zzju.zzc().zza((zzju.zzf)zzi.zza(paramzzxd)).zza((zzju.zzd)zzj.zza(paramzzvs.zzc())).zza((zzju.zze)zzk.zza(paramzzvs.zzb())).zza((zzju.zza)zzl.zza(paramzzvs.zza())).zza();
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzvy zza(com.google.android.gms.internal.firebase-auth-api.zzkf paramzzkf)
  {
    return (zzvy)zzvy.zzc().zza(0).zza(zzb(paramzzkf.zzb())).zza(zzaiw.zza(paramzzkf.zzd().zzb())).zze();
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzzn zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd, byte[] paramArrayOfByte)
  {
    return zzzn.zza(zzmo.zza(zzmo.zza(paramArrayOfByte), zzlu.zzb(paramzzd)));
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzju zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzvp localzzvp = zzvp.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zza(paramzzpm.zza().zzd(), localzzvp.zzc());
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing HpkeParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to HpkeProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzvs zzb(com.google.android.gms.internal.firebase-auth-api.zzju paramzzju)
  {
    return (zzvs)zzvs.zzd().zza((zzvm)zzj.zza(paramzzju.zze())).zza((zzvn)zzk.zza(paramzzju.zzd())).zza((zzvk)zzl.zza(paramzzju.zzb())).zze();
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzjx zzc(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzvv localzzvv = zzvv.zza(paramzzpn.zzd(), zzajv.zza());
        int i = localzzvv.zza();
        if (i == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzvy localzzvy = localzzvv.zzd();
          if (localzzvy.zza() == 0)
          {
            Object localObject = zza(paramzzpn.zzc(), localzzvy.zzb());
            paramzzpn = zzkf.zza((com.google.android.gms.internal.firebase-auth-api.zzju)localObject, zza(((zzju)localObject).zze(), localzzvy.zzf().zzd()), paramzzpn.zze());
            localObject = ((zzju)localObject).zze();
            return zzjx.zza(paramzzpn, zzzo.zza(zzmo.zza(zzmo.zza(localzzvv.zze().zzd()), zzlu.zza((com.google.android.gms.internal.firebase-auth-api.zzju.zzd)localObject)), zzcm.zza(paramzzcm)));
          }
          paramzzpn = new java/security/GeneralSecurityException;
          paramzzpn.<init>("Only version 0 keys are accepted");
          throw paramzzpn;
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", paramzzpn.zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzkf zzd(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
      try
      {
        paramzzcm = zzvy.zza(paramzzpn.zzd(), zzajv.zza());
        if (paramzzcm.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzju localzzju = zza(paramzzpn.zzc(), paramzzcm.zzb());
          return zzkf.zza(localzzju, zza(localzzju.zze(), paramzzcm.zzf().zzd()), paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing HpkePublicKey failed");
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: ", paramzzpn.zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */