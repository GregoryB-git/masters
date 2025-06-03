package com.google.android.gms.internal.firebase_auth_api;

public enum zzagh
{
  private final String zzd;
  
  static
  {
    zzagh localzzagh1 = new zzagh("ACCESS_TOKEN", 0, "ACCESS_TOKEN");
    zza = localzzagh1;
    zzagh localzzagh2 = new zzagh("ID_TOKEN", 1, "idToken");
    zzb = localzzagh2;
    zzc = new zzagh[] { localzzagh1, localzzagh2 };
  }
  
  private zzagh(String paramString)
  {
    zzd = paramString;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagh[] values()
  {
    return (zzagh[])zzc.clone();
  }
  
  public final String toString()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */