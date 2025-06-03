package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzaga;
import m6.j;
import org.json.JSONObject;

public final class zzagg
  implements zzaga
{
  private String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  
  private zzagg(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString2;
    j.e(paramString3);
    zzc = paramString3;
    j.e(paramString4);
    zzd = paramString4;
    zze = paramString5;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagg zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    return new zzagg(paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("idToken", zza);
    if (!TextUtils.isEmpty(zzb)) {
      localJSONObject1.put("displayName", zzb);
    }
    JSONObject localJSONObject2 = new JSONObject();
    if (!TextUtils.isEmpty(zzc)) {
      localJSONObject2.put("sessionInfo", zzc);
    }
    if (!TextUtils.isEmpty(zzd)) {
      localJSONObject2.put("verificationCode", zzd);
    }
    localJSONObject1.put("totpVerificationInfo", localJSONObject2);
    if (!TextUtils.isEmpty(zze)) {
      localJSONObject1.put("tenantId", zze);
    }
    return localJSONObject1.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */