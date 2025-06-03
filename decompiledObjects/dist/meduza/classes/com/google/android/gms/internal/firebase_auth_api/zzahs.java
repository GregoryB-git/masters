package com.google.android.gms.internal.firebase_auth_api;

import org.json.JSONException;
import org.json.JSONObject;

public class zzahs
  implements zzaea<zzahs>
{
  private static final String zza = "zzahs";
  
  public String zza()
  {
    return null;
  }
  
  public com.google.android.gms.internal.firebase-auth-api.zzahs zzb(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      if (((JSONObject)localObject).optJSONObject("phoneSessionInfo") != null)
      {
        localObject = new com/google/android/gms/internal/firebase_auth_api/zzahw;
        ((zzahw)localObject).<init>();
        return (zzahw)((zzahw)localObject).zza(paramString);
      }
      if (((JSONObject)localObject).optJSONObject("totpSessionInfo") != null)
      {
        localObject = new com/google/android/gms/internal/firebase_auth_api/zzahy;
        ((zzahy)localObject).<init>();
        return (zzahy)((zzahy)localObject).zza(paramString);
      }
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Missing phoneSessionInfo or totpSessionInfo.");
      throw ((Throwable)localObject);
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */