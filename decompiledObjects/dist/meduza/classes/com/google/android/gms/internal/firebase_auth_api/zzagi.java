package com.google.android.gms.internal.firebase_auth_api;

public enum zzagi
{
  private final String zzd;
  
  static
  {
    zzagi localzzagi1 = new zzagi("REFRESH_TOKEN", 0, "refresh_token");
    zza = localzzagi1;
    zzagi localzzagi2 = new zzagi("AUTHORIZATION_CODE", 1, "authorization_code");
    zzb = localzzagi2;
    zzc = new zzagi[] { localzzagi1, localzzagi2 };
  }
  
  private zzagi(String paramString)
  {
    zzd = paramString;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagi[] values()
  {
    return (zzagi[])zzc.clone();
  }
  
  public final String toString()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */