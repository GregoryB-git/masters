package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzaft
  implements zzaeb
{
  private String zza;
  private String zzb;
  private final String zzc;
  
  public zzaft(String paramString1, String paramString2)
  {
    j.e(paramString1);
    zza = paramString1;
    zzb = "http://localhost";
    zzc = paramString2;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("identifier", zza);
    localJSONObject.put("continueUri", zzb);
    String str = zzc;
    if (str != null) {
      localJSONObject.put("tenantId", str);
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */