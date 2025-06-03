package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class zzjd
{
  private static final zzzn zza;
  private static final zzou<zzit, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzio, zzpn> zzd;
  private static final zznd<zzpn> zze;
  private static final Map<zzit.zza, zzxd> zzf;
  private static final Map<zzxd, zzit.zza> zzg;
  
  static
  {
    Object localObject1 = zzpy.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
    zza = (zzzn)localObject1;
    zzb = zzou.zza(new zzjg(), com.google.android.gms.internal.firebase-auth-api.zzit.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzjf(), (zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzji(), com.google.android.gms.internal.firebase-auth-api.zzio.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzjh(), (zzzn)localObject1, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    Object localObject2 = new HashMap();
    com.google.android.gms.internal.firebase-auth-api.zzit.zza localzza1 = zzit.zza.zzc;
    com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd1 = zzxd.zzd;
    ((HashMap)localObject2).put(localzza1, localzzxd1);
    com.google.android.gms.internal.firebase-auth-api.zzit.zza localzza2 = zzit.zza.zza;
    localObject1 = zzxd.zzb;
    ((HashMap)localObject2).put(localzza2, localObject1);
    com.google.android.gms.internal.firebase-auth-api.zzit.zza localzza3 = zzit.zza.zzb;
    com.google.android.gms.internal.firebase-auth-api.zzxd localzzxd2 = zzxd.zze;
    ((HashMap)localObject2).put(localzza3, localzzxd2);
    zzf = Collections.unmodifiableMap((Map)localObject2);
    localObject2 = new EnumMap(com.google.android.gms.internal.firebase-auth-api.zzxd.class);
    ((EnumMap)localObject2).put(localzzxd1, localzza1);
    ((EnumMap)localObject2).put(localObject1, localzza2);
    ((EnumMap)localObject2).put(localzzxd2, localzza3);
    ((EnumMap)localObject2).put(zzxd.zzc, localzza3);
    zzg = Collections.unmodifiableMap((Map)localObject2);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzit.zza zza(com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    Map localMap = zzg;
    if (localMap.containsKey(paramzzxd)) {
      return (zzit.zza)localMap.get(paramzzxd);
    }
    throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzit.zza paramzza)
  {
    Map localMap = zzf;
    if (localMap.containsKey(paramzza)) {
      return (zzxd)localMap.get(paramzza);
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzio zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, com.google.android.gms.internal.firebase-auth-api.zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztt localzztt = zztt.zza(paramzzpn.zzd(), zzajv.zza());
        if (localzztt.zza() == 0)
        {
          com.google.android.gms.internal.firebase-auth-api.zzit localzzit = zzit.zzc().zza(localzztt.zzd().zzb()).zza(zza(paramzzpn.zzc())).zza();
          return zzio.zzb().zza(localzzit).zza(zzzo.zza(localzztt.zzd().zzd(), zzcm.zza(paramzzcm))).zza(paramzzpn.zze()).zza();
        }
        paramzzpn = new java/security/GeneralSecurityException;
        paramzzpn.<init>("Only version 0 keys are accepted");
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing AesSivKey failed");
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzit zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zztw localzztw = zztw.zza(paramzzpm.zza().zze(), zzajv.zza());
        int i = localzztw.zzb();
        if (i == 0) {
          return zzit.zzc().zza(localzztw.zza()).zza(zza(paramzzpm.zza().zzd())).zza();
        }
        paramzzpm = new java/security/GeneralSecurityException;
        paramzzpm.<init>("Only version 0 keys are accepted");
        throw paramzzpm;
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing AesSivParameters failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to AesSivParameters.parseParameters: ", paramzzpm.zza().zzf()));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */