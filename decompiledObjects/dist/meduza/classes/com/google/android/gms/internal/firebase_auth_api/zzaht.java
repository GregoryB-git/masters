package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzahp;
import m6.j;
import org.json.JSONObject;

public final class zzaht
  implements zzahp
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzafn zzg;
  private final String zzh;
  
  private zzaht(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString3;
    zzc = paramString4;
    zzd = paramString5;
    zze = paramString6;
    zzf = paramString7;
    zzh = null;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaht zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    j.e(paramString2);
    return new zzaht(paramString1, "phone", paramString2, paramString3, paramString4, paramString5, paramString6, null);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("idToken", zza);
    localJSONObject1.put("mfaProvider", 1);
    if (zzb != null)
    {
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("phoneNumber", zzb);
      if (!TextUtils.isEmpty(zzd)) {
        localJSONObject2.put("recaptchaToken", zzd);
      }
      if (!TextUtils.isEmpty(zze)) {
        localJSONObject2.put("playIntegrityToken", zze);
      }
      Object localObject = zzg;
      if (localObject != null) {
        localJSONObject2.put("autoRetrievalInfo", ((zzafn)localObject).zza());
      }
      localObject = zzf;
      if (localObject != null) {
        zzail.zza(localJSONObject2, "captchaResponse", (String)localObject);
      } else {
        zzail.zza(localJSONObject2);
      }
      localJSONObject1.put("phoneEnrollmentInfo", localJSONObject2);
    }
    if (!TextUtils.isEmpty(null)) {
      localJSONObject1.put("tenantId", null);
    }
    return localJSONObject1.toString();
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzafn paramzzafn)
  {
    zzg = paramzzafn;
  }
  
  public final String zzb()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */