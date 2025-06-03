package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import f;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzagx
{
  private Long zza;
  private Long zzb;
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagx zza(String paramString)
  {
    try
    {
      zzagx localzzagx = new com/google/android/gms/internal/firebase_auth_api/zzagx;
      localzzagx.<init>();
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      ((JSONObject)localObject).optString("iss");
      ((JSONObject)localObject).optString("aud");
      ((JSONObject)localObject).optString("sub");
      zza = Long.valueOf(((JSONObject)localObject).optLong("iat"));
      zzb = Long.valueOf(((JSONObject)localObject).optLong("exp"));
      ((JSONObject)localObject).optBoolean("is_anonymous");
      return localzzagx;
    }
    catch (JSONException localJSONException)
    {
      Object localObject;
      if (Log.isLoggable("JwtToken", 3))
      {
        paramString = String.valueOf(localJSONException);
        localObject = new StringBuilder("Failed to read JwtToken from JSONObject. ");
        ((StringBuilder)localObject).append(paramString);
        Log.d("JwtToken", ((StringBuilder)localObject).toString());
      }
      throw new UnsupportedEncodingException(f.j("Failed to read JwtToken from JSONObject. ", String.valueOf(localJSONException)));
    }
  }
  
  public final Long zza()
  {
    return zzb;
  }
  
  public final Long zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */