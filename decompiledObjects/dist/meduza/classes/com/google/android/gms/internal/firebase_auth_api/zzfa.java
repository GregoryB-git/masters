package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzcg;
import com.google.android.gms.internal.firebase-auth-api.zzcm;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import f;
import java.security.GeneralSecurityException;

public final class zzfa
{
  private static final zzzn zza;
  private static final zzou<zzew, zzpm> zzb;
  private static final zzoq<zzpm> zzc;
  private static final zznh<zzex, zzpn> zzd;
  private static final zznd<zzpn> zze;
  
  static
  {
    zzzn localzzzn = zzpy.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    zza = localzzzn;
    zzb = zzou.zza(new zzez(), com.google.android.gms.internal.firebase-auth-api.zzew.class, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzc = zzoq.zza(new zzfc(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpm.class);
    zzd = zznh.zza(new zzfb(), com.google.android.gms.internal.firebase-auth-api.zzex.class, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
    zze = zznd.zza(new zzfe(), localzzzn, com.google.android.gms.internal.firebase-auth-api.zzpn.class);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzew zza(com.google.android.gms.internal.firebase-auth-api.zzxa paramzzxa, com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd)
  {
    zzcg localzzcg = zzco.zza(((zzwf)zzwf.zza().zza(paramzzxa.zza().zzf()).zza(paramzzxa.zza().zze()).zza(zzxd.zzd).zze()).zzk());
    com.google.android.gms.internal.firebase-auth-api.zzew.zza localzza;
    if ((localzzcg instanceof zzdr))
    {
      localzza = zzew.zza.zza;
    }
    else if ((localzzcg instanceof zzeg))
    {
      localzza = zzew.zza.zzc;
    }
    else if ((localzzcg instanceof zzfy))
    {
      localzza = zzew.zza.zzb;
    }
    else if ((localzzcg instanceof zzdc))
    {
      localzza = zzew.zza.zzd;
    }
    else if ((localzzcg instanceof zzdk))
    {
      localzza = zzew.zza.zze;
    }
    else
    {
      if (!(localzzcg instanceof zzea)) {
        break label214;
      }
      localzza = zzew.zza.zzf;
    }
    zzew.zzb localzzb = new zzew.zzb(null);
    int i = zzfd.zza[paramzzxd.ordinal()];
    if (i != 1)
    {
      if (i == 2) {
        paramzzxd = zzew.zzc.zzb;
      } else {
        throw new GeneralSecurityException(j.g("Unable to parse OutputPrefixType: ", paramzzxd.zza()));
      }
    }
    else {
      paramzzxd = zzew.zzc.zza;
    }
    return localzzb.zza(paramzzxd).zza(paramzzxa.zze()).zza((zzcr)localzzcg).zza(localzza).zza();
    label214:
    throw new GeneralSecurityException(f.j("Unsupported DEK parameters when parsing ", String.valueOf(localzzcg)));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxd zza(com.google.android.gms.internal.firebase-auth-api.zzew.zzc paramzzc)
  {
    if (zzew.zzc.zza.equals(paramzzc)) {
      return zzxd.zzb;
    }
    if (zzew.zzc.zzb.equals(paramzzc)) {
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
  
  private static com.google.android.gms.internal.firebase-auth-api.zzew zzb(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    if (paramzzpm.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
      try
      {
        com.google.android.gms.internal.firebase-auth-api.zzxa localzzxa = zzxa.zza(paramzzpm.zza().zze(), zzajv.zza());
        return zza(localzzxa, paramzzpm.zza().zzd());
      }
      catch (zzakm paramzzpm)
      {
        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", paramzzpm);
      }
    }
    throw new IllegalArgumentException(f.j("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", paramzzpm.zza().zzf()));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzex zzb(com.google.android.gms.internal.firebase-auth-api.zzpn paramzzpn, zzcm paramzzcm)
  {
    if (paramzzpn.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
      try
      {
        paramzzcm = zzwx.zza(paramzzpn.zzd(), zzajv.zza());
        if (paramzzcm.zza() == 0) {
          return zzex.zza(zza(paramzzcm.zzd(), paramzzpn.zzc()), paramzzpn.zze());
        }
        paramzzpn = new java/security/GeneralSecurityException;
        String str = String.valueOf(paramzzcm);
        paramzzcm = new java/lang/StringBuilder;
        paramzzcm.<init>("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
        paramzzcm.append(str);
        paramzzpn.<init>(paramzzcm.toString());
        throw paramzzpn;
      }
      catch (zzakm paramzzpn)
      {
        throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", paramzzpn);
      }
    }
    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzxa zzb(com.google.android.gms.internal.firebase-auth-api.zzew paramzzew)
  {
    Object localObject = zzco.zza(paramzzew.zzb());
    try
    {
      localObject = zzwf.zza((byte[])localObject, zzajv.zza());
      paramzzew = (zzxa)zzxa.zzb().zza(paramzzew.zzd()).zza((com.google.android.gms.internal.firebase-auth-api.zzwf)localObject).zze();
      return paramzzew;
    }
    catch (zzakm paramzzew)
    {
      throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", paramzzew);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */