package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzaii
  implements zzaea<zzaii>
{
  private static final String zza = "zzaii";
  private String zzb;
  private String zzc;
  private long zzd;
  private List<zzagz> zze;
  private String zzf;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaii zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      g.a(localJSONObject.optString("localId", null));
      g.a(localJSONObject.optString("email", null));
      g.a(localJSONObject.optString("displayName", null));
      zzb = g.a(localJSONObject.optString("idToken", null));
      g.a(localJSONObject.optString("photoUrl", null));
      zzc = g.a(localJSONObject.optString("refreshToken", null));
      zzd = localJSONObject.optLong("expiresIn", 0L);
      zze = zzagz.zza(localJSONObject.optJSONArray("mfaInfo"));
      zzf = localJSONObject.optString("mfaPendingCredential", null);
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final long zza()
  {
    return zzd;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzf;
  }
  
  public final String zzd()
  {
    return zzc;
  }
  
  public final List<zzagz> zze()
  {
    return zze;
  }
  
  public final boolean zzf()
  {
    return !TextUtils.isEmpty(zzf);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaii
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */