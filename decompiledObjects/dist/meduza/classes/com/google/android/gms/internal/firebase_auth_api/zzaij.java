package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzaij
  implements zzaeb
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  
  public zzaij(String paramString1, String paramString2, String paramString3)
  {
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString2;
    zzc = paramString3;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("idToken", zza);
    localJSONObject.put("mfaEnrollmentId", zzb);
    String str = zzc;
    if (str != null) {
      localJSONObject.put("tenantId", str);
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaij
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */