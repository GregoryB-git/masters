package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzagj
  implements zzaeb
{
  private String zza;
  
  public zzagj(String paramString)
  {
    j.e(paramString);
    zza = paramString;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("idToken", zza);
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */