package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;

public final class zzahw
  extends zzahs
{
  private static final String zza = "zzahw";
  private String zzb;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahw zzc(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      localJSONObject = localJSONObject.optJSONObject("phoneSessionInfo");
      if (localJSONObject != null) {
        zzb = zzae.zza(localJSONObject.optString("sessionInfo"));
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */