package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;

public class b0
{
  public final SharedPreferences a;
  
  public b0(Context paramContext)
  {
    a = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    a(paramContext, "com.google.android.gms.appid-no-backup");
  }
  
  public final void a(Context paramContext, String paramString)
  {
    paramContext = new File(a.f(paramContext), paramString);
    if (paramContext.exists()) {
      return;
    }
    try
    {
      if ((paramContext.createNewFile()) && (!f()))
      {
        Log.i("FirebaseMessaging", "App restored, clearing state");
        c();
      }
    }
    catch (IOException paramContext)
    {
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        paramString = new StringBuilder();
        paramString.append("Error creating file in no backup dir: ");
        paramString.append(paramContext.getMessage());
        Log.d("FirebaseMessaging", paramString.toString());
      }
    }
  }
  
  public final String b(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append("*");
    return localStringBuilder.toString();
  }
  
  public void c()
  {
    try
    {
      a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void d(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = b(paramString1, paramString2);
      paramString1 = a.edit();
      paramString1.remove(paramString2);
      paramString1.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public a e(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a.c(a.getString(b(paramString1, paramString2), null));
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public boolean f()
  {
    try
    {
      boolean bool = a.getAll().isEmpty();
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    try
    {
      paramString4 = a.a(paramString3, paramString4, System.currentTimeMillis());
      if (paramString4 == null) {
        return;
      }
      paramString3 = a.edit();
      paramString3.putString(b(paramString1, paramString2), paramString4);
      paramString3.commit();
      return;
    }
    finally {}
  }
  
  public static class a
  {
    public static final long d = TimeUnit.DAYS.toMillis(7L);
    public final String a;
    public final String b;
    public final long c;
    
    public a(String paramString1, String paramString2, long paramLong)
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
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */