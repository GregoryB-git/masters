package com.google.firebase.iid;

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

public class b
{
  public final SharedPreferences a;
  public final Context b;
  public final Map c = new t.a();
  
  public b(Context paramContext)
  {
    b = paramContext;
    a = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    a("com.google.android.gms.appid-no-backup");
  }
  
  public static String b(String paramString1, String paramString2)
  {
    paramString2 = new StringBuilder(String.valueOf(paramString1).length() + 6);
    paramString2.append(paramString1);
    paramString2.append("|S|cre");
    return paramString2.toString();
  }
  
  public final void a(String paramString)
  {
    paramString = new File(x.a.f(b), "com.google.android.gms.appid-no-backup");
    if (paramString.exists()) {
      return;
    }
    try
    {
      if ((paramString.createNewFile()) && (!h()))
      {
        Log.i("FirebaseInstanceId", "App restored, clearing state");
        d();
        return;
      }
    }
    catch (IOException paramString)
    {
      if (Log.isLoggable("FirebaseInstanceId", 3))
      {
        paramString = String.valueOf(paramString.getMessage());
        if (paramString.length() != 0) {
          paramString = "Error creating file in no backup dir: ".concat(paramString);
        } else {
          paramString = new String("Error creating file in no backup dir: ");
        }
        Log.d("FirebaseInstanceId", paramString);
      }
    }
  }
  
  public final String c(String paramString1, String paramString2, String paramString3)
  {
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length());
    localStringBuilder.append(paramString1);
    localStringBuilder.append("|T|");
    localStringBuilder.append(paramString2);
    localStringBuilder.append("|");
    localStringBuilder.append(paramString3);
    return localStringBuilder.toString();
  }
  
  public void d()
  {
    try
    {
      c.clear();
      a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = c(paramString1, paramString2, paramString3);
      paramString2 = a.edit();
      paramString2.remove(paramString1);
      paramString2.commit();
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final long f(String paramString)
  {
    paramString = a.getString(b(paramString, "cre"), null);
    if (paramString != null) {}
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString)
    {
      for (;;) {}
    }
    return 0L;
  }
  
  public a g(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString1 = a.d(a.getString(c(paramString1, paramString2, paramString3), null));
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public boolean h()
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
  
  public void i(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      paramString5 = a.a(paramString4, paramString5, System.currentTimeMillis());
      if (paramString5 == null) {
        return;
      }
      paramString4 = a.edit();
      paramString4.putString(c(paramString1, paramString2, paramString3), paramString5);
      paramString4.commit();
      return;
    }
    finally {}
  }
  
  public long j(String paramString)
  {
    try
    {
      long l = k(paramString);
      c.put(paramString, Long.valueOf(l));
      return l;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final long k(String paramString)
  {
    long l = System.currentTimeMillis();
    Object localObject = b(paramString, "cre");
    if (!a.contains((String)localObject))
    {
      localObject = a.edit();
      ((SharedPreferences.Editor)localObject).putString(b(paramString, "cre"), String.valueOf(l));
      ((SharedPreferences.Editor)localObject).commit();
      return l;
    }
    return f(paramString);
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
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */