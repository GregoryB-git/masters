package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$a
{
  public static final long d = TimeUnit.DAYS.toMillis(7L);
  public final String a;
  public final String b;
  public final long c;
  
  public a$a(long paramLong, String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  public static String a(long paramLong, String paramString1, String paramString2)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("token", paramString1);
      localJSONObject.put("appVersion", paramString2);
      localJSONObject.put("timestamp", paramLong);
      paramString1 = localJSONObject.toString();
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      paramString2 = String.valueOf(paramString1);
      paramString1 = new StringBuilder(paramString2.length() + 24);
      paramString1.append("Failed to encode token: ");
      paramString1.append(paramString2);
      Log.w("FirebaseInstanceId", paramString1.toString());
    }
    return null;
  }
  
  public static a b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.startsWith("{")) {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = ((JSONObject)localObject).getString("token");
        String str = ((JSONObject)localObject).getString("appVersion");
        paramString = new a(((JSONObject)localObject).getLong("timestamp"), paramString, str);
        return paramString;
      }
      catch (JSONException paramString)
      {
        paramString = String.valueOf(paramString);
        Object localObject = new StringBuilder(paramString.length() + 23);
        ((StringBuilder)localObject).append("Failed to parse token: ");
        ((StringBuilder)localObject).append(paramString);
        Log.w("FirebaseInstanceId", ((StringBuilder)localObject).toString());
        return null;
      }
    }
    return new a(0L, paramString, null);
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */