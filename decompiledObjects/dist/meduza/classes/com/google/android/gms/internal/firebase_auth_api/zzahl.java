package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzahl
  implements zzaea<zzahl>
{
  private static final String zza = "zzahl";
  private String zzb;
  private com.google.android.gms.internal.firebase-auth-api.zzahb zzc;
  private String zzd;
  private String zze;
  private long zzf;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahl zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("email", null));
      g.a(localJSONObject.optString("passwordHash", null));
      localJSONObject.optBoolean("emailVerified", false);
      g.a(localJSONObject.optString("displayName", null));
      g.a(localJSONObject.optString("photoUrl", null));
      zzc = zzahb.zza(localJSONObject.optJSONArray("providerUserInfo"));
      zzd = g.a(localJSONObject.optString("idToken", null));
      zze = g.a(localJSONObject.optString("refreshToken", null));
      zzf = localJSONObject.optLong("expiresIn", 0L);
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final long zza()
  {
    return zzf;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzd;
  }
  
  public final String zzd()
  {
    return zze;
  }
  
  public final List<zzahc> zze()
  {
    com.google.android.gms.internal.firebase-auth-api.zzahb localzzahb = zzc;
    if (localzzahb != null) {
      return localzzahb.zza();
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */