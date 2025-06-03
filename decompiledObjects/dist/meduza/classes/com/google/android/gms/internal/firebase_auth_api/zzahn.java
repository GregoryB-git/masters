package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzahn
  implements zzaeb
{
  private String zza;
  private String zzb;
  private String zzc;
  private String zzd;
  private String zze;
  
  public zzahn(String paramString)
  {
    zzc = paramString;
  }
  
  public zzahn(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString2;
    zzc = paramString4;
    zzd = paramString5;
    zze = paramString6;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    String str = zza;
    if (str != null) {
      localJSONObject.put("email", str);
    }
    str = zzb;
    if (str != null) {
      localJSONObject.put("password", str);
    }
    str = zzc;
    if (str != null) {
      localJSONObject.put("tenantId", str);
    }
    str = zzd;
    if (str != null) {
      zzail.zza(localJSONObject, "captchaResponse", str);
    } else {
      zzail.zza(localJSONObject);
    }
    str = zze;
    if (str != null) {
      localJSONObject.put("idToken", str);
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */