package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcm;

public final class zzzo
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zza;
  
  private zzzo(com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    zza = paramzzzn;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzzo zza(int paramInt)
  {
    return new zzzo(zzzn.zza(zzpp.zza(paramInt)));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzzo zza(byte[] paramArrayOfByte, zzcm paramzzcm)
  {
    if (paramzzcm != null) {
      return new zzzo(zzzn.zza(paramArrayOfByte));
    }
    throw new NullPointerException("SecretKeyAccess required");
  }
  
  public final int zza()
  {
    return zza.zza();
  }
  
  public final byte[] zza(zzcm paramzzcm)
  {
    if (paramzzcm != null) {
      return zza.zzb();
    }
    throw new NullPointerException("SecretKeyAccess required");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */