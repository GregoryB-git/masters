package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzahr
  implements zzaeb
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  private final String zzh;
  private com.google.android.gms.internal.firebase-auth-api.zzafn zzi;
  
  private zzahr(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString2;
    j.e(paramString3);
    zzc = paramString3;
    zze = paramString4;
    zzd = paramString5;
    zzf = paramString6;
    zzg = paramString7;
    zzh = paramString8;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzahr zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    j.e(paramString3);
    return new zzahr("phone", paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("mfaPendingCredential", zzb);
    localJSONObject1.put("mfaEnrollmentId", zzc);
    zza.getClass();
    localJSONObject1.put("mfaProvider", 1);
    if (zze != null)
    {
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("phoneNumber", zze);
      if (!TextUtils.isEmpty(zzf)) {
        localJSONObject2.put("recaptchaToken", zzf);
      }
      if (!TextUtils.isEmpty(zzg)) {
        localJSONObject2.put("playIntegrityToken", zzg);
      }
      Object localObject = zzh;
      if (localObject != null) {
        zzail.zza(localJSONObject2, "captchaResponse", (String)localObject);
      } else {
        zzail.zza(localJSONObject2);
      }
      localObject = zzi;
      if (localObject != null) {
        localJSONObject2.put("autoRetrievalInfo", ((zzafn)localObject).zza());
      }
      localJSONObject1.put("phoneSignInInfo", localJSONObject2);
    }
    return localJSONObject1.toString();
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzafn paramzzafn)
  {
    zzi = paramzzafn;
  }
  
  public final String zzb()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */