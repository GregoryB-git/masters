package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import com.google.android.gms.internal.firebase-auth-api.zzahi;
import org.json.JSONObject;

public abstract class zzahf
  implements zzaeb
{
  public static zzahi zzg()
  {
    return new zzafs();
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("idToken", zzc());
    localJSONObject.put("token", zzf());
    localJSONObject.put("providerId", zzd());
    localJSONObject.put("tokenType", zzb().toString());
    localJSONObject.put("tenantId", zze());
    return localJSONObject.toString();
  }
  
  public abstract com.google.android.gms.internal.firebase-auth-api.zzagh zzb();
  
  public abstract String zzc();
  
  public abstract String zzd();
  
  public abstract String zze();
  
  public abstract String zzf();
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */