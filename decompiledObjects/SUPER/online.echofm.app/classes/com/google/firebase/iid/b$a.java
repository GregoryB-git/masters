package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class b$a
{
  public static final long d = TimeUnit.DAYS.toMillis(7L);
  public final String a;
  public final String b;
  public final long c;
  
  public b$a(String paramString1, String paramString2, long paramLong)
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
    catch (JSONException paramString1)
    {
      paramString1 = String.valueOf(paramString1);
      paramString2 = new StringBuilder(paramString1.length() + 24);
      paramString2.append("Failed to encode token: ");
      paramString2.append(paramString1);
      Log.w("FirebaseInstanceId", paramString2.toString());
    }
    return null;
  }
  
  public static String b(a parama)
  {
    if (parama == null) {
      return null;
    }
    return a;
  }
  
  public static a d(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    if (paramString.startsWith("{")) {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = new a(((JSONObject)localObject).getString("token"), ((JSONObject)localObject).getString("appVersion"), ((JSONObject)localObject).getLong("timestamp"));
        return paramString;
      }
      catch (JSONException paramString)
      {
        Object localObject = String.valueOf(paramString);
        paramString = new StringBuilder(((String)localObject).length() + 23);
        paramString.append("Failed to parse token: ");
        paramString.append((String)localObject);
        Log.w("FirebaseInstanceId", paramString.toString());
        return null;
      }
    }
    return new a(paramString, null, 0L);
  }
  
  public boolean c(String paramString)
  {
    return (System.currentTimeMillis() > c + d) || (!paramString.equals(b));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */