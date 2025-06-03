package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzpq;
import com.google.android.gms.internal.firebase-auth-api.zzzn;

public final class zzpm
  implements zzpq
{
  private final zzzn zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzwf zzb;
  
  private zzpm(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf, zzzn paramzzzn)
  {
    zzb = paramzzwf;
    zza = paramzzzn;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzpm zza(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf)
  {
    return new zzpm(paramzzwf, zzpy.zza(paramzzwf.zzf()));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzpm zzb(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf)
  {
    return new zzpm(paramzzwf, zzpy.zzb(paramzzwf.zzf()));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwf zza()
  {
    return zzb;
  }
  
  public final zzzn zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */