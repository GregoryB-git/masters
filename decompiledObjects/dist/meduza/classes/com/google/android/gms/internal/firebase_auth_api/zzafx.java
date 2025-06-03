package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class zzafx
  implements zzaea<zzafx>
{
  private static final String zza = "zzafx";
  private String zzb;
  private String zzc;
  private boolean zzd;
  private long zze;
  private List<zzagz> zzf;
  private String zzg;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzafx zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      localJSONObject.optString("localId", null);
      localJSONObject.optString("email", null);
      zzb = localJSONObject.optString("idToken", null);
      zzc = localJSONObject.optString("refreshToken", null);
      zzd = localJSONObject.optBoolean("isNewUser", false);
      zze = localJSONObject.optLong("expiresIn", 0L);
      zzf = zzagz.zza(localJSONObject.optJSONArray("mfaInfo"));
      zzg = localJSONObject.optString("mfaPendingCredential", null);
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final long zza()
  {
    return zze;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzg;
  }
  
  public final String zzd()
  {
    return zzc;
  }
  
  public final List<zzagz> zze()
  {
    return zzf;
  }
  
  public final boolean zzf()
  {
    return !TextUtils.isEmpty(zzg);
  }
  
  public final boolean zzg()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */