package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzahk
  implements zzaeb
{
  private final String zza;
  private final long zzb;
  private final boolean zzc;
  private final String zzd;
  private final String zze;
  private final String zzf;
  private final String zzg;
  private final String zzh;
  private final boolean zzi;
  private com.google.android.gms.internal.firebase-auth-api.zzafn zzj;
  
  public zzahk(String paramString1, long paramLong, boolean paramBoolean1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean2)
  {
    j.e(paramString1);
    zza = paramString1;
    zzb = paramLong;
    zzc = paramBoolean1;
    zzd = paramString2;
    zze = paramString3;
    zzf = paramString4;
    zzg = paramString5;
    zzh = paramString6;
    zzi = paramBoolean2;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("phoneNumber", zza);
    Object localObject = zze;
    if (localObject != null) {
      localJSONObject.put("tenantId", localObject);
    }
    localObject = zzf;
    if (localObject != null) {
      localJSONObject.put("recaptchaToken", localObject);
    }
    localObject = zzj;
    if (localObject != null) {
      localJSONObject.put("autoRetrievalInfo", ((zzafn)localObject).zza());
    }
    localObject = zzg;
    if (localObject != null) {
      localJSONObject.put("playIntegrityToken", localObject);
    }
    localObject = zzh;
    if (localObject != null) {
      zzail.zza(localJSONObject, "captchaResponse", (String)localObject);
    } else {
      zzail.zza(localJSONObject);
    }
    return localJSONObject.toString();
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzafn paramzzafn)
  {
    zzj = paramzzafn;
  }
  
  public final long zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzd;
  }
  
  public final String zzd()
  {
    return zza;
  }
  
  public final boolean zze()
  {
    return zzc;
  }
  
  public final boolean zzf()
  {
    return zzi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */