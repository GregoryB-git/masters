package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzagh;
import com.google.android.gms.internal.firebase-auth-api.zzahf;
import f;

final class zzafs
  extends zzahi
{
  private String zza;
  private String zzb;
  private String zzc;
  private zzagh zzd;
  private String zze;
  
  public final zzahf zza()
  {
    Object localObject = zza;
    if (localObject != null)
    {
      String str1 = zzc;
      if (str1 != null)
      {
        zzagh localzzagh = zzd;
        if (localzzagh != null)
        {
          String str2 = zze;
          if (str2 != null) {
            return new zzafp((String)localObject, zzb, str1, localzzagh, str2, null);
          }
        }
      }
    }
    localObject = new StringBuilder();
    if (zza == null) {
      ((StringBuilder)localObject).append(" providerId");
    }
    if (zzc == null) {
      ((StringBuilder)localObject).append(" token");
    }
    if (zzd == null) {
      ((StringBuilder)localObject).append(" tokenType");
    }
    if (zze == null) {
      ((StringBuilder)localObject).append(" idToken");
    }
    throw new IllegalStateException(f.j("Missing required properties:", String.valueOf(localObject)));
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahi zza(zzagh paramzzagh)
  {
    if (paramzzagh != null)
    {
      zzd = paramzzagh;
      return this;
    }
    throw new NullPointerException("Null tokenType");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahi zza(String paramString)
  {
    if (paramString != null)
    {
      zze = paramString;
      return this;
    }
    throw new NullPointerException("Null idToken");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahi zzb(String paramString)
  {
    if (paramString != null)
    {
      zza = paramString;
      return this;
    }
    throw new NullPointerException("Null providerId");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahi zzc(String paramString)
  {
    zzb = paramString;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahi zzd(String paramString)
  {
    if (paramString != null)
    {
      zzc = paramString;
      return this;
    }
    throw new NullPointerException("Null token");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */