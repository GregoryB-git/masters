package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzags
  implements zzaea<zzags>
{
  private static final String zza = "zzags";
  private String zzb;
  
  public zzags() {}
  
  public zzags(String paramString)
  {
    zzb = paramString;
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzags zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("producerProjectNumber"));
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzags
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */