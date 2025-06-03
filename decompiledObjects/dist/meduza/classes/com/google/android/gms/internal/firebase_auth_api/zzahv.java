package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzahp;
import m6.j;
import org.json.JSONObject;

public final class zzahv
  implements zzahp
{
  private final String zza;
  private final String zzb;
  
  private zzahv(String paramString1, String paramString2)
  {
    j.e(paramString1);
    zza = paramString1;
    zzb = paramString2;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzahv zza(String paramString1, String paramString2)
  {
    return new zzahv(paramString1, paramString2);
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("idToken", zza);
    if (!TextUtils.isEmpty(zzb)) {
      localJSONObject.put("tenantId", zzb);
    }
    localJSONObject.put("totpEnrollmentInfo", new JSONObject());
    return localJSONObject.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */