package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzaik
  implements zzaea<zzaik>
{
  private static final String zza = "zzaik";
  private String zzb;
  private String zzc;
  private long zzd;
  private boolean zze;
  private String zzf;
  private String zzg;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaik zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("idToken", null));
      zzc = g.a(localJSONObject.optString("refreshToken", null));
      zzd = localJSONObject.optLong("expiresIn", 0L);
      g.a(localJSONObject.optString("localId", null));
      zze = localJSONObject.optBoolean("isNewUser", false);
      zzf = g.a(localJSONObject.optString("temporaryProof", null));
      zzg = g.a(localJSONObject.optString("phoneNumber", null));
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final long zza()
  {
    return zzd;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzg;
  }
  
  public final String zzd()
  {
    return zzc;
  }
  
  public final String zze()
  {
    return zzf;
  }
  
  public final boolean zzf()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaik
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */