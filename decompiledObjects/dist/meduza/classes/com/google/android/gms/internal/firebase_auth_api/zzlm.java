package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbm;
import com.google.android.gms.internal.firebase-auth-api.zzll;
import com.google.android.gms.internal.firebase-auth-api.zzlo;
import com.google.android.gms.internal.firebase-auth-api.zzlp;
import java.security.GeneralSecurityException;

public final class zzlm
  implements zzbm
{
  private zzlm(com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn1, zzlo paramzzlo, zzlp paramzzlp, zzll paramzzll, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn2)
  {
    paramzzzn1.zzb();
    paramzzzn2.zzb();
  }
  
  public static zzbm zza(com.google.android.gms.internal.firebase-auth-api.zzkf paramzzkf)
  {
    com.google.android.gms.internal.firebase-auth-api.zzju localzzju = paramzzkf.zzb();
    return new zzlm(paramzzkf.zzd(), zza(localzzju.zze()), zza(localzzju.zzd()), zza(localzzju.zzb()), paramzzkf.zzc());
  }
  
  public static zzll zza(com.google.android.gms.internal.firebase-auth-api.zzju.zza paramzza)
  {
    if (paramzza.equals(zzju.zza.zza)) {
      return new zzku(16);
    }
    if (paramzza.equals(zzju.zza.zzb)) {
      return new zzku(32);
    }
    if (paramzza.equals(zzju.zza.zzc)) {
      return new zzkx();
    }
    throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
  }
  
  public static zzlo zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd)
  {
    if (paramzzd.equals(zzju.zzd.zzd)) {
      return new zzme(new zzli("HmacSha256"));
    }
    if (paramzzd.equals(zzju.zzd.zza)) {
      return zzmb.zza(zzyl.zza);
    }
    if (paramzzd.equals(zzju.zzd.zzb)) {
      return zzmb.zza(zzyl.zzb);
    }
    if (paramzzd.equals(zzju.zzd.zzc)) {
      return zzmb.zza(zzyl.zzc);
    }
    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
  }
  
  public static zzlp zza(com.google.android.gms.internal.firebase-auth-api.zzju.zze paramzze)
  {
    if (paramzze.equals(zzju.zze.zza)) {
      return new zzli("HmacSha256");
    }
    if (paramzze.equals(zzju.zze.zzb)) {
      return new zzli("HmacSha384");
    }
    if (paramzze.equals(zzju.zze.zzc)) {
      return new zzli("HmacSha512");
    }
    throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */