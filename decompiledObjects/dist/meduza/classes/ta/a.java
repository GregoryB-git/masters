package ta;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class a
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
  
  public a(Context paramContext)
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
  
  public final void a()
  {
    a.edit().putBoolean("androidResumeOnClick", b).putString("androidNotificationChannelId", c).putString("androidNotificationChannelName", d).putString("androidNotificationChannelDescription", e).putInt("notificationColor", f).putString("androidNotificationIcon", g).putBoolean("androidShowNotificationBadge", h).putBoolean("androidNotificationClickStartsActivity", i).putBoolean("androidNotificationOngoing", j).putBoolean("androidStopForegroundOnPause", k).putInt("artDownscaleWidth", l).putInt("artDownscaleHeight", m).putString("activityClassName", n).putString("androidBrowsableRootExtras", o).apply();
  }
}

/* Location:
 * Qualified Name:     ta.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */