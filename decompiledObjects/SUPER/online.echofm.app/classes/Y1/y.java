package Y1;

import T1.a;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import y1.F;

public final class y
{
  public static final a d = new a(null);
  public static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
  public final String a;
  public final F b;
  public String c;
  
  public y(Context paramContext, String paramString)
  {
    a = paramString;
    b = new F(paramContext, paramString);
    try
    {
      paramContext = paramContext.getPackageManager();
      if (paramContext != null)
      {
        paramContext = paramContext.getPackageInfo("com.facebook.katana", 0);
        if (paramContext != null) {
          c = versionName;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
  }
  
  public final String a()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      String str = a;
      return str;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map paramMap, String paramString6)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      paramString1 = a.a(d, paramString1);
      if (paramString3 != null) {
        paramString1.putString("2_result", paramString3);
      }
    }
    finally
    {
      break label196;
    }
    if (paramString4 != null) {
      paramString1.putString("5_error_message", paramString4);
    }
    if (paramString5 != null) {
      paramString1.putString("4_error_code", paramString5);
    }
    if ((paramMap != null) && ((paramMap.isEmpty() ^ true)))
    {
      paramString3 = new java/util/LinkedHashMap;
      paramString3.<init>();
      paramString4 = paramMap.entrySet().iterator();
      while (paramString4.hasNext())
      {
        paramString5 = (Map.Entry)paramString4.next();
        if ((String)paramString5.getKey() != null) {
          paramString3.put(paramString5.getKey(), paramString5.getValue());
        }
      }
      paramString4 = new org/json/JSONObject;
      paramString4.<init>(paramString3);
      paramString1.putString("6_extras", paramString4.toString());
    }
    paramString1.putString("3_method", paramString2);
    b.g(paramString6, paramString1);
    return;
    label196:
    a.b(paramString1, this);
  }
  
  public final void c(String paramString1, String paramString2, String paramString3)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      paramString1 = a.a(d, paramString1);
      paramString1.putString("3_method", paramString2);
      b.g(paramString3, paramString1);
      return;
    }
    finally
    {
      a.b(paramString1, this);
    }
  }
  
  public final void d(String paramString1, String paramString2, String paramString3)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      paramString1 = a.a(d, paramString1);
      paramString1.putString("3_method", paramString2);
      b.g(paramString3, paramString1);
      return;
    }
    finally
    {
      a.b(paramString1, this);
    }
  }
  
  public final void e(String paramString1, String paramString2, String paramString3)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Bundle localBundle = a.a(d, "");
      localBundle.putString("2_result", u.f.a.r.e());
      localBundle.putString("5_error_message", paramString2);
      localBundle.putString("3_method", paramString3);
      b.g(paramString1, localBundle);
      return;
    }
    finally
    {
      a.b(paramString1, this);
    }
  }
  
  public static final class a
  {
    public final Bundle b(String paramString)
    {
      Bundle localBundle = new Bundle();
      localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
      localBundle.putString("0_auth_logger_id", paramString);
      localBundle.putString("3_method", "");
      localBundle.putString("2_result", "");
      localBundle.putString("5_error_message", "");
      localBundle.putString("4_error_code", "");
      localBundle.putString("6_extras", "");
      return localBundle;
    }
  }
}

/* Location:
 * Qualified Name:     Y1.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */