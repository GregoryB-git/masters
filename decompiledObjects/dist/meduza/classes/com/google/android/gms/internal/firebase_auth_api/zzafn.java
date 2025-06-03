package com.google.android.gms.internal.firebase_auth_api;

import m6.j;
import org.json.JSONObject;

public final class zzafn
{
  private final String zza;
  
  public zzafn(String paramString)
  {
    j.e(paramString);
    zza = paramString;
  }
  
  public final JSONObject zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("appSignatureHash", zza);
    return localJSONObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */