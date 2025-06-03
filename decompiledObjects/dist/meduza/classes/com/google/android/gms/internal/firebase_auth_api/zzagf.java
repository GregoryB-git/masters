package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzagc;
import m6.j;
import org.json.JSONObject;

public final class zzagf
  implements zzagc
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  
  private zzagf(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    j.e(paramString1);
    j.e(paramString2);
    zza = paramString2;
    zzb = paramString3;
    zzc = paramString4;
    zzd = paramString5;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagf zza(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    j.e(paramString2);
    j.e(paramString4);
    return new zzagf("totp", paramString1, paramString2, paramString3, paramString4);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    Object localObject = new JSONObject();
    String str = zzb;
    if (str != null) {
      ((JSONObject)localObject).put("verificationCode", str);
    }
    localJSONObject.put("totpVerificationInfo", localObject);
    localJSONObject.put("mfaPendingCredential", zza);
    localObject = zzc;
    if (localObject != null) {
      localJSONObject.put("tenantId", localObject);
    }
    localObject = zzd;
    if (localObject != null) {
      localJSONObject.put("mfaEnrollmentId", localObject);
    }
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */