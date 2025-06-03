package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzagk
  implements zzaeb
{
  private String zza = zzagi.zza.toString();
  private String zzb;
  
  public zzagk(String paramString)
  {
    j.e(paramString);
    zzb = paramString;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("grantType", zza);
    localJSONObject.put("refreshToken", zzb);
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */