package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import m6.j;
import org.json.JSONObject;

public final class zzahd
  implements zzaeb
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  
  public zzahd(String paramString1, String paramString2, String paramString3)
  {
    j.e(paramString1);
    zza = paramString1;
    zzb = paramString2;
    zzc = paramString3;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("oobCode", zza);
    String str = zzb;
    if (str != null) {
      localJSONObject.put("newPassword", str);
    }
    str = zzc;
    if (str != null) {
      localJSONObject.put("tenantId", str);
    }
    return localJSONObject.toString();
  }
  
  public final String zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */