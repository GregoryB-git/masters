package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import org.json.JSONObject;

public final class zzagu
  implements zzaeb
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  
  private zzagu(String paramString1, String paramString2)
  {
    zza = paramString1;
    zzb = "CLIENT_TYPE_ANDROID";
    zzc = paramString2;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagu zza(String paramString1, String paramString2)
  {
    return new zzagu(paramString1, paramString2);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    if (!TextUtils.isEmpty(zza)) {
      localJSONObject.put("tenantId", zza);
    }
    if (!TextUtils.isEmpty(zzb)) {
      localJSONObject.put("clientType", zzb);
    }
    if (!TextUtils.isEmpty(zzc)) {
      localJSONObject.put("recaptchaVersion", zzc);
    }
    return localJSONObject.toString();
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzc;
  }
  
  public final String zzd()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */