package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class zzafw
  implements zzaea<zzafw>
{
  private static final String zza = "zzafw";
  private List<String> zzb;
  
  public zzafw()
  {
    zzahx.zza();
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzafw zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      localJSONObject.optString("authUri", null);
      localJSONObject.optBoolean("registered", false);
      localJSONObject.optString("providerId", null);
      localJSONObject.optBoolean("forExistingProvider", false);
      if (!localJSONObject.has("allProviders")) {
        zzahx.zza();
      } else {
        new zzahx(1, zzail.zza(localJSONObject.optJSONArray("allProviders")));
      }
      zzb = zzail.zza(localJSONObject.optJSONArray("signinMethods"));
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final List<String> zza()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */