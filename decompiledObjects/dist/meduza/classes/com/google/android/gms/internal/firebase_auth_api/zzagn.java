package com.google.android.gms.internal.firebase_auth_api;

import b8.c;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzagn
  implements zzaeb
{
  private String zza;
  private String zzb;
  private String zzc;
  private String zzd;
  private c zze;
  private String zzf;
  private String zzg;
  
  public zzagn(int paramInt)
  {
    zza = zza(paramInt);
  }
  
  private zzagn(int paramInt, c paramc, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    zza = zza(7);
    j.i(paramc);
    zze = paramc;
    zzb = null;
    zzc = paramString2;
    zzd = paramString3;
    zzf = null;
    zzg = null;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagn zza(c paramc, String paramString1, String paramString2)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramc);
    return new zzagn(7, paramc, null, paramString2, paramString1, null, null);
  }
  
  private static String zza(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 4)
      {
        if (paramInt != 6)
        {
          if (paramInt != 7) {
            return "REQUEST_TYPE_UNSET_ENUM_VALUE";
          }
          return "VERIFY_AND_CHANGE_EMAIL";
        }
        return "EMAIL_SIGNIN";
      }
      return "VERIFY_EMAIL";
    }
    return "PASSWORD_RESET";
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagn zza(c paramc)
  {
    j.i(paramc);
    zze = paramc;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagn zza(String paramString)
  {
    zzg = paramString;
    return this;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    Object localObject = zza;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = 1;
    int k = -1;
    switch (i)
    {
    default: 
      break;
    case 870738373: 
      if (((String)localObject).equals("EMAIL_SIGNIN")) {
        k = 3;
      }
      break;
    case -1099157829: 
      if (((String)localObject).equals("VERIFY_AND_CHANGE_EMAIL")) {
        k = 2;
      }
      break;
    case -1341836234: 
      if (((String)localObject).equals("VERIFY_EMAIL")) {
        k = 1;
      }
      break;
    case -1452371317: 
      if (((String)localObject).equals("PASSWORD_RESET")) {
        k = 0;
      }
      break;
    }
    switch (k)
    {
    default: 
      j = 0;
      break;
    case 3: 
      j = 6;
      break;
    case 2: 
      j = 7;
      break;
    case 1: 
      j = 4;
    }
    localJSONObject.put("requestType", j);
    localObject = zzb;
    if (localObject != null) {
      localJSONObject.put("email", localObject);
    }
    localObject = zzc;
    if (localObject != null) {
      localJSONObject.put("newEmail", localObject);
    }
    localObject = zzd;
    if (localObject != null) {
      localJSONObject.put("idToken", localObject);
    }
    localObject = zze;
    if (localObject != null)
    {
      localJSONObject.put("androidInstallApp", e);
      localJSONObject.put("canHandleCodeInApp", zze.o);
      localObject = zze.a;
      if (localObject != null) {
        localJSONObject.put("continueUrl", localObject);
      }
      localObject = zze.b;
      if (localObject != null) {
        localJSONObject.put("iosBundleId", localObject);
      }
      localObject = zze.c;
      if (localObject != null) {
        localJSONObject.put("iosAppStoreId", localObject);
      }
      localObject = zze.d;
      if (localObject != null) {
        localJSONObject.put("androidPackageName", localObject);
      }
      localObject = zze.f;
      if (localObject != null) {
        localJSONObject.put("androidMinimumVersion", localObject);
      }
      localObject = zze.r;
      if (localObject != null) {
        localJSONObject.put("dynamicLinkDomain", localObject);
      }
      localObject = zze.s;
      if (localObject != null) {
        localJSONObject.put("linkDomain", localObject);
      }
    }
    localObject = zzf;
    if (localObject != null) {
      localJSONObject.put("tenantId", localObject);
    }
    localObject = zzg;
    if (localObject != null) {
      zzail.zza(localJSONObject, "captchaResp", (String)localObject);
    } else {
      zzail.zza(localJSONObject);
    }
    return localJSONObject.toString();
  }
  
  public final c zzb()
  {
    return zze;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagn zzb(String paramString)
  {
    j.e(paramString);
    zzb = paramString;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagn zzc(String paramString)
  {
    zzf = paramString;
    return this;
  }
  
  public final String zzc()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagn zzd(String paramString)
  {
    j.e(paramString);
    zzd = paramString;
    return this;
  }
  
  public final String zzd()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */