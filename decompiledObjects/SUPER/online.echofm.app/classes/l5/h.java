package l5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class h
{
  public SharedPreferences a;
  public boolean b;
  public String c;
  public String d;
  public String e;
  public int f;
  public String g;
  public boolean h;
  public boolean i;
  public boolean j;
  public boolean k;
  public int l;
  public int m;
  public String n;
  public String o;
  
  public h(Context paramContext)
  {
    paramContext = paramContext.getSharedPreferences("audio_service_preferences", 0);
    a = paramContext;
    b = paramContext.getBoolean("androidResumeOnClick", true);
    c = a.getString("androidNotificationChannelId", null);
    d = a.getString("androidNotificationChannelName", null);
    e = a.getString("androidNotificationChannelDescription", null);
    f = a.getInt("notificationColor", -1);
    g = a.getString("androidNotificationIcon", "mipmap/ic_launcher");
    h = a.getBoolean("androidShowNotificationBadge", false);
    i = a.getBoolean("androidNotificationClickStartsActivity", true);
    j = a.getBoolean("androidNotificationOngoing", false);
    k = a.getBoolean("androidStopForegroundOnPause", true);
    l = a.getInt("artDownscaleWidth", -1);
    m = a.getInt("artDownscaleHeight", -1);
    n = a.getString("activityClassName", null);
    o = a.getString("androidBrowsableRootExtras", null);
  }
  
  public Bundle a()
  {
    if (o == null) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(o);
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      Iterator localIterator = localJSONObject.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        try
        {
          localBundle.putInt(str, localJSONObject.getInt(str));
        }
        catch (Exception localException2)
        {
          try
          {
            localBundle.putBoolean(str, localJSONObject.getBoolean(str));
          }
          catch (Exception localException3)
          {
            try
            {
              localBundle.putDouble(str, localJSONObject.getDouble(str));
            }
            catch (Exception localException4)
            {
              try
              {
                localBundle.putString(str, localJSONObject.getString(str));
              }
              catch (Exception localException5)
              {
                PrintStream localPrintStream = System.out;
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localStringBuilder.append("Unsupported extras value for key ");
                localStringBuilder.append(str);
                localPrintStream.println(localStringBuilder.toString());
              }
            }
          }
        }
      }
      label172:
      return null;
    }
    catch (Exception localException1)
    {
      break label172;
      return localException1;
      localException1.printStackTrace();
    }
  }
  
  public void b()
  {
    a.edit().putBoolean("androidResumeOnClick", b).putString("androidNotificationChannelId", c).putString("androidNotificationChannelName", d).putString("androidNotificationChannelDescription", e).putInt("notificationColor", f).putString("androidNotificationIcon", g).putBoolean("androidShowNotificationBadge", h).putBoolean("androidNotificationClickStartsActivity", i).putBoolean("androidNotificationOngoing", j).putBoolean("androidStopForegroundOnPause", k).putInt("artDownscaleWidth", l).putInt("artDownscaleHeight", m).putString("activityClassName", n).putString("androidBrowsableRootExtras", o).apply();
  }
  
  public void c(Map paramMap)
  {
    if (paramMap != null) {}
    for (paramMap = new JSONObject(paramMap).toString();; paramMap = null)
    {
      o = paramMap;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     l5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */