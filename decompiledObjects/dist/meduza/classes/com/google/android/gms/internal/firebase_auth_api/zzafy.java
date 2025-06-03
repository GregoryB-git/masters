package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import b8.h;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public class zzafy
  implements zzaeb
{
  private static final String zza = "zzafy";
  private final String zzb;
  private final String zzc;
  private final h zzd;
  private final String zze;
  private final String zzf;
  
  static
  {
    int i = 0;
    String[] arrayOfString = new String[0];
    int j = arrayOfString.length;
    if (j != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('[');
      while (i < j)
      {
        String str = arrayOfString[i];
        if (localStringBuilder.length() > 1) {
          localStringBuilder.append(",");
        }
        localStringBuilder.append(str);
        i++;
      }
      localStringBuilder.append("] ");
    }
    new m6.d("zzafy", null);
    for (i = 2; (i <= 7) && (!Log.isLoggable("zzafy", i)); i++) {}
  }
  
  public zzafy(h paramh, String paramString1, String paramString2)
  {
    j.i(paramh);
    zzd = paramh;
    String str = a;
    j.e(str);
    zzb = str;
    paramh = c;
    j.e(paramh);
    zzc = paramh;
    zze = paramString1;
    zzf = paramString2;
  }
  
  public final String zza()
  {
    String str1 = zzc;
    Object localObject = b8.d.d;
    j.e(str1);
    String str3 = null;
    try
    {
      localObject = new b8/d;
      ((b8.d)localObject).<init>(str1);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localObject = null;
    }
    if (localObject != null) {
      str2 = a;
    } else {
      str2 = null;
    }
    if (localObject != null) {
      str3 = c;
    }
    localObject = new JSONObject();
    ((JSONObject)localObject).put("email", zzb);
    if (str2 != null) {
      ((JSONObject)localObject).put("oobCode", str2);
    }
    if (str3 != null) {
      ((JSONObject)localObject).put("tenantId", str3);
    }
    String str2 = zze;
    if (str2 != null) {
      ((JSONObject)localObject).put("idToken", str2);
    }
    str2 = zzf;
    if (str2 != null) {
      zzail.zza((JSONObject)localObject, "captchaResp", str2);
    } else {
      zzail.zza((JSONObject)localObject);
    }
    return ((JSONObject)localObject).toString();
  }
  
  public final h zzb()
  {
    return zzd;
  }
  
  public final String zzc()
  {
    return zzf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */