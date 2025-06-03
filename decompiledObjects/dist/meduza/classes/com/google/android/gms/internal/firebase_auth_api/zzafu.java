package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class zzafu
  implements zzaea<zzafu>
{
  private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzafu";
  private String zzb;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzafu zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      str1 = localJSONObject.getString("error");
      localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(str1);
      localJSONObject.getInt("code");
      zzb = localJSONObject.getString("message");
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    String str1 = zza;
    String str2 = localJSONException.getMessage();
    StringBuilder localStringBuilder = new StringBuilder("Failed to parse error for string [");
    localStringBuilder.append(paramString);
    localStringBuilder.append("] with exception: ");
    localStringBuilder.append(str2);
    Log.e(str1, localStringBuilder.toString());
    throw new zzabr(j.j("Failed to parse error for string [", paramString, "]"), localJSONException);
  }
  
  public final String zza()
  {
    return zzb;
  }
  
  public final boolean zzb()
  {
    return !TextUtils.isEmpty(zzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */