package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class b0$a
{
  public static final long d = TimeUnit.DAYS.toMillis(7L);
  public final String a;
  public final String b;
  public final long c;
  
  public b0$a(String paramString1, String paramString2, long paramLong)
  {
    a = paramString1;
    b = paramString2;
    c = paramLong;
  }
  
  public static String a(String paramString1, String paramString2, long paramLong)
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
    catch (JSONException paramString2)
    {
      paramString1 = new StringBuilder();
      paramString1.append("Failed to encode token: ");
      paramString1.append(paramString2);
      Log.w("FirebaseMessaging", paramString1.toString());
    }
    return null;
  }
  
  public static a c(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.startsWith("{")) {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = new a(localJSONObject.getString("token"), localJSONObject.getString("appVersion"), localJSONObject.getLong("timestamp"));
        return paramString;
      }
      catch (JSONException localJSONException)
      {
        paramString = new StringBuilder();
        paramString.append("Failed to parse token: ");
        paramString.append(localJSONException);
        Log.w("FirebaseMessaging", paramString.toString());
        return null;
      }
    }
    return new a(paramString, null, 0L);
  }
  
  public boolean b(String paramString)
  {
    boolean bool;
    if ((System.currentTimeMillis() <= c + d) && (paramString.equals(b))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.b0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */