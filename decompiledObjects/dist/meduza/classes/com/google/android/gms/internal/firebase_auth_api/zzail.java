package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzail
{
  public static com.google.android.gms.internal.firebase-auth-api.zzabr zza(Exception paramException, String paramString1, String paramString2)
  {
    String str = paramException.getMessage();
    StringBuilder localStringBuilder = new StringBuilder("Failed to parse ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" for string [");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("] with exception: ");
    localStringBuilder.append(str);
    Log.e(paramString1, localStringBuilder.toString());
    localStringBuilder = new StringBuilder("Failed to parse ");
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" for string [");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("]");
    return new zzabr(localStringBuilder.toString(), paramException);
  }
  
  public static List<String> zza(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramJSONArray != null) && (paramJSONArray.length() != 0)) {
      for (int i = 0; i < paramJSONArray.length(); i++) {
        localArrayList.add(paramJSONArray.getString(i));
      }
    }
    return localArrayList;
  }
  
  public static void zza(JSONObject paramJSONObject)
  {
    paramJSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
  }
  
  public static void zza(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    paramJSONObject.put(paramString1, paramString2);
    paramJSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
    paramJSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzail
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */