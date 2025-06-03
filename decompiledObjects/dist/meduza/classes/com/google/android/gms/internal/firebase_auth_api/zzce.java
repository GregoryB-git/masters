package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcm;

public final class zzce
{
  public static com.google.android.gms.internal.firebase-auth-api.zzbs zza(com.google.android.gms.internal.firebase-auth-api.zzca paramzzca, zzcm paramzzcm)
  {
    if (paramzzcm != null) {
      return zzbs.zza(paramzzca.zzb());
    }
    throw new NullPointerException("SecretKeyAccess cannot be null");
  }
  
  public static void zza(com.google.android.gms.internal.firebase-auth-api.zzbs paramzzbs, com.google.android.gms.internal.firebase-auth-api.zzbz paramzzbz, zzcm paramzzcm)
  {
    if (paramzzcm != null)
    {
      paramzzbz.zza(paramzzbs.zzb());
      return;
    }
    throw new NullPointerException("SecretKeyAccess cannot be null");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */