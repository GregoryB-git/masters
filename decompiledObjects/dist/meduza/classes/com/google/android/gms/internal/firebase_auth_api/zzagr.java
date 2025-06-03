package com.google.android.gms.internal.firebase_auth_api;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzagr
  implements zzaea<zzagr>
{
  private static final String zza = "zzagr";
  private List<String> zzb;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzagr zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      Object localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      zzb = ((List)localObject);
      localObject = localJSONObject.optJSONArray("authorizedDomains");
      if (localObject != null) {
        for (int i = 0; i < ((JSONArray)localObject).length(); i++) {
          zzb.add(((JSONArray)localObject).getString(i));
        }
      }
      return this;
    }
    catch (JSONException localJSONException)
    {
      throw zzail.zza(localJSONException, zza, paramString);
    }
  }
  
  public final List<String> zza()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */