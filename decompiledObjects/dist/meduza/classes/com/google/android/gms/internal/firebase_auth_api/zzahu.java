package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzahu
  implements zzaea<zzahu>
{
  private static final String zza = "zzahu";
  private String zzb;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahu zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      localJSONObject = localJSONObject.optJSONObject("phoneResponseInfo");
      if (localJSONObject != null) {
        zzb = g.a(localJSONObject.optString("sessionInfo"));
      }
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final String zza()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */