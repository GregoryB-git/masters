package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzaih
  implements zzaeb
{
  private String zza;
  private String zzb;
  private String zzc;
  private String zzd;
  private String zze;
  private boolean zzf;
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaih zza(String paramString1, String paramString2, boolean paramBoolean)
  {
    zzaih localzzaih = new zzaih();
    j.e(paramString1);
    zzb = paramString1;
    j.e(paramString2);
    zzc = paramString2;
    zzf = paramBoolean;
    return localzzaih;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaih zzb(String paramString1, String paramString2, boolean paramBoolean)
  {
    zzaih localzzaih = new zzaih();
    j.e(paramString1);
    zza = paramString1;
    j.e(paramString2);
    zzd = paramString2;
    zzf = paramBoolean;
    return localzzaih;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    String str1;
    if (!TextUtils.isEmpty(zzd))
    {
      localJSONObject.put("phoneNumber", zza);
      str1 = zzd;
      str2 = "temporaryProof";
    }
    else
    {
      localJSONObject.put("sessionInfo", zzb);
      str1 = zzc;
      str2 = "code";
    }
    localJSONObject.put(str2, str1);
    String str2 = zze;
    if (str2 != null) {
      localJSONObject.put("idToken", str2);
    }
    if (!zzf) {
      localJSONObject.put("operation", 2);
    }
    return localJSONObject.toString();
  }
  
  public final void zza(String paramString)
  {
    zze = paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaih
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */