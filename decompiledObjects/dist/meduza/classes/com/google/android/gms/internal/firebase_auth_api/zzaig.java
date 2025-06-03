package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzaig
  implements zzaea<zzaig>
{
  private static final String zza = "zzaig";
  private String zzb;
  private String zzc;
  private long zzd;
  private boolean zze;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaig zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("idToken", null));
      zzc = g.a(localJSONObject.optString("refreshToken", null));
      zzd = localJSONObject.optLong("expiresIn", 0L);
      zze = localJSONObject.optBoolean("isNewUser", false);
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
    return zzc;
  }
  
  public final boolean zzd()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */