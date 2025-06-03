package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaga;
import m6.j;
import org.json.JSONObject;

public final class zzage
  implements zzaga
{
  private String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  
  private zzage(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    j.e(paramString1);
    j.e(paramString2);
    zza = paramString2;
    zzc = paramString3;
    zzd = paramString4;
    zzb = paramString5;
    zze = paramString6;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzage zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    j.e(paramString3);
    j.e(paramString2);
    return new zzage("phone", paramString1, paramString2, paramString3, paramString4, paramString5);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("idToken", zza);
    localJSONObject.put("mfaProvider", 1);
    Object localObject = zzb;
    if (localObject != null) {
      localJSONObject.put("displayName", localObject);
    }
    localObject = new JSONObject();
    String str = zzc;
    if (str != null) {
      ((JSONObject)localObject).put("sessionInfo", str);
    }
    str = zzd;
    if (str != null) {
      ((JSONObject)localObject).put("code", str);
    }
    localJSONObject.put("phoneVerificationInfo", localObject);
    localObject = zze;
    if (localObject != null) {
      localJSONObject.put("tenantId", localObject);
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */