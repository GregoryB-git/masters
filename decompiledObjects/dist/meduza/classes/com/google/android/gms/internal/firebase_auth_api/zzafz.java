package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;

public class zzafz
  implements zzaea<zzafz>
{
  private static final String zza = "zzafz";
  private String zzb;
  private String zzc;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzafz zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = localJSONObject.optString("idToken", null);
      zzc = localJSONObject.optString("refreshToken", null);
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final String zza()
  {
    return zzb;
  }
  
  public final String zzb()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */