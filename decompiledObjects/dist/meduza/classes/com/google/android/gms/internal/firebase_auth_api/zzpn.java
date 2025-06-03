package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaiw;
import com.google.android.gms.internal.firebase-auth-api.zzpq;
import com.google.android.gms.internal.firebase-auth-api.zzwb.zza;
import com.google.android.gms.internal.firebase-auth-api.zzzn;
import java.security.GeneralSecurityException;

public final class zzpn
  implements zzpq
{
  private final String zza;
  private final zzzn zzb;
  private final zzaiw zzc;
  private final zzwb.zza zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzxd zze;
  private final Integer zzf;
  
  private zzpn(String paramString, zzzn paramzzzn, zzaiw paramzzaiw, zzwb.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, Integer paramInteger)
  {
    zza = paramString;
    zzb = paramzzzn;
    zzc = paramzzaiw;
    zzd = paramzza;
    zze = paramzzxd;
    zzf = paramInteger;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzpn zza(String paramString, zzaiw paramzzaiw, zzwb.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzxd paramzzxd, Integer paramInteger)
  {
    if (paramzzxd == zzxd.zzd)
    {
      if (paramInteger != null) {
        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
      }
    }
    else {
      if (paramInteger == null) {
        break label48;
      }
    }
    return new zzpn(paramString, zzpy.zza(paramString), paramzzaiw, paramzza, paramzzxd, paramInteger);
    label48:
    throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
  }
  
  public final zzwb.zza zza()
  {
    return zzd;
  }
  
  public final zzzn zzb()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzxd zzc()
  {
    return zze;
  }
  
  public final zzaiw zzd()
  {
    return zzc;
  }
  
  public final Integer zze()
  {
    return zzf;
  }
  
  public final String zzf()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */