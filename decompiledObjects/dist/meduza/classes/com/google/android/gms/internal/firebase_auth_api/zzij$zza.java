package com.google.android.gms.internal.firebase_auth_api;

public enum zzij$zza
{
  static
  {
    zzil localzzil = new zzil("ALGORITHM_NOT_FIPS", 0, null);
    zza = localzzil;
    zzin localzzin = new zzin("ALGORITHM_REQUIRES_BORINGCRYPTO", 1, null);
    zzb = localzzin;
    zzc = new zza[] { localzzil, localzzin };
  }
  
  private zzij$zza() {}
  
  public static com.google.android.gms.internal.firebase-auth-api.zzij.zza[] values()
  {
    return (zza[])zzc.clone();
  }
  
  public abstract boolean zza();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzij.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */