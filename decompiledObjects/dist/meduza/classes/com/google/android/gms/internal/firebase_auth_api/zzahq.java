package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzahq
  implements zzaea<zzahq>
{
  private static final String zza = "zzahq";
  private String zzb;
  private String zzc;
  private long zzd;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahq zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("idToken", null));
      g.a(localJSONObject.optString("displayName", null));
      g.a(localJSONObject.optString("email", null));
      zzc = g.a(localJSONObject.optString("refreshToken", null));
      zzd = localJSONObject.optLong("expiresIn", 0L);
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */