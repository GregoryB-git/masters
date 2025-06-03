package w1;

import E5.m;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w.k;

public final class q
  implements m, E5.o
{
  public b a;
  public Activity b;
  public int c;
  public Map d;
  
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 209) && (paramInt1 != 210) && (paramInt1 != 211) && (paramInt1 != 212) && (paramInt1 != 213) && (paramInt1 != 214)) {
      return false;
    }
    if (paramInt2 == -1) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    if (paramInt1 == 209)
    {
      paramInt1 = 16;
    }
    else if (paramInt1 == 210)
    {
      if (Build.VERSION.SDK_INT >= 30)
      {
        paramInt2 = n.a();
        paramInt1 = 22;
      }
      else
      {
        return false;
      }
    }
    else if (paramInt1 == 211)
    {
      paramInt2 = Settings.canDrawOverlays(b);
      paramInt1 = 23;
    }
    else if (paramInt1 == 212)
    {
      if (Build.VERSION.SDK_INT >= 26)
      {
        paramInt2 = o.a(b.getPackageManager());
        paramInt1 = 24;
      }
      else
      {
        return false;
      }
    }
    else if (paramInt1 == 213)
    {
      paramInt2 = ((NotificationManager)b.getSystemService("notification")).isNotificationPolicyAccessGranted();
      paramInt1 = 27;
    }
    else
    {
      if ((paramInt1 != 214) || (Build.VERSION.SDK_INT < 31)) {
        break label263;
      }
      paramInt2 = p.a((AlarmManager)b.getSystemService("alarm"));
      paramInt1 = 34;
    }
    d.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
    paramInt1 = c - 1;
    c = paramInt1;
    if (paramInt1 == 0) {
      a.a(d);
    }
    return true;
    label263:
    return false;
  }
  
  public boolean b(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    if (paramInt != 24)
    {
      c = 0;
      return false;
    }
    paramInt = i;
    if (d == null) {
      return false;
    }
    while (paramInt < paramArrayOfString.length)
    {
      String str = paramArrayOfString[paramInt];
      int j = u.f(str);
      if (j != 20)
      {
        i = paramArrayOfInt[paramInt];
        Object localObject1;
        if (j == 7)
        {
          if (!d.containsKey(Integer.valueOf(7))) {
            d.put(Integer.valueOf(7), Integer.valueOf(u.h(b, str, i)));
          }
          if (!d.containsKey(Integer.valueOf(14))) {
            localObject1 = d;
          }
        }
        else
        {
          for (Object localObject2 = Integer.valueOf(14);; localObject2 = Integer.valueOf(j))
          {
            ((Map)localObject1).put(localObject2, Integer.valueOf(u.h(b, str, i)));
            break;
            if (j == 4)
            {
              i = u.h(b, str, i);
              if (d.containsKey(Integer.valueOf(4))) {
                break;
              }
              localObject2 = d;
              localObject1 = Integer.valueOf(4);
            }
            else
            {
              if (j != 3) {
                break label349;
              }
              i = u.h(b, str, i);
              if ((Build.VERSION.SDK_INT < 29) && (!d.containsKey(Integer.valueOf(4)))) {
                d.put(Integer.valueOf(4), Integer.valueOf(i));
              }
              if (!d.containsKey(Integer.valueOf(5))) {
                d.put(Integer.valueOf(5), Integer.valueOf(i));
              }
              localObject2 = d;
              localObject1 = Integer.valueOf(j);
            }
            ((Map)localObject2).put(localObject1, Integer.valueOf(i));
            break;
            label349:
            if (d.containsKey(Integer.valueOf(j))) {
              break;
            }
            localObject1 = d;
          }
        }
        u.i(b, j);
      }
      paramInt++;
    }
    paramInt = c - paramArrayOfInt.length;
    c = paramInt;
    if (paramInt == 0) {
      a.a(d);
    }
    return true;
  }
  
  public final int c(Context paramContext)
  {
    paramContext = u.b(paramContext, 21);
    if ((paramContext != null) && (!paramContext.isEmpty())) {
      return 1;
    }
    Log.d("permissions_handler", "Bluetooth permission missing in manifest");
    return 0;
  }
  
  public final int d(Context paramContext)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i < 33)
    {
      if (k.b(paramContext).a()) {
        return 1;
      }
      return 0;
    }
    if (paramContext.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
      j = 1;
    }
    return j;
  }
  
  public void e(int paramInt, Context paramContext, a parama)
  {
    parama.a(f(paramInt, paramContext));
  }
  
  public final int f(int paramInt, Context paramContext)
  {
    if (paramInt == 17) {
      return d(paramContext);
    }
    if (paramInt == 21) {
      return c(paramContext);
    }
    if (((paramInt == 30) || (paramInt == 28) || (paramInt == 29)) && (Build.VERSION.SDK_INT < 31)) {
      return c(paramContext);
    }
    Object localObject = u.b(paramContext, paramInt);
    if (localObject == null)
    {
      paramContext = new StringBuilder();
      paramContext.append("No android specific permissions needed for: ");
      paramContext.append(paramInt);
      Log.d("permissions_handler", paramContext.toString());
      return 1;
    }
    if (((List)localObject).size() == 0)
    {
      paramContext = new StringBuilder();
      paramContext.append("No permissions found in manifest for: ");
      paramContext.append(localObject);
      paramContext.append(paramInt);
      Log.d("permissions_handler", paramContext.toString());
      if ((paramInt == 22) && (Build.VERSION.SDK_INT < 30)) {
        return 2;
      }
      return 0;
    }
    int i;
    if (getApplicationInfotargetSdkVersion >= 23) {
      i = 1;
    } else {
      i = 0;
    }
    Iterator localIterator = ((List)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (String)localIterator.next();
      if (i != 0)
      {
        if (paramInt == 16)
        {
          localObject = paramContext.getPackageName();
          paramContext = (PowerManager)paramContext.getSystemService("power");
          if ((paramContext != null) && (paramContext.isIgnoringBatteryOptimizations((String)localObject))) {
            return 1;
          }
          return 0;
        }
        if (paramInt == 22)
        {
          if (Build.VERSION.SDK_INT < 30) {
            return 2;
          }
          return n.a();
        }
        if (paramInt == 23) {
          return Settings.canDrawOverlays(paramContext);
        }
        if ((paramInt == 24) && (Build.VERSION.SDK_INT >= 26)) {
          return o.a(paramContext.getPackageManager());
        }
        if (paramInt == 27) {
          return ((NotificationManager)paramContext.getSystemService("notification")).isNotificationPolicyAccessGranted();
        }
        if (paramInt == 34)
        {
          if (Build.VERSION.SDK_INT >= 31) {
            return p.a((AlarmManager)paramContext.getSystemService("alarm"));
          }
          return 1;
        }
        if (x.a.a(paramContext, (String)localObject) != 0) {
          return 0;
        }
      }
    }
    return 1;
  }
  
  public final void g(String paramString, int paramInt)
  {
    Intent localIntent = new Intent(paramString);
    if (!paramString.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"))
    {
      String str = b.getPackageName();
      paramString = new StringBuilder();
      paramString.append("package:");
      paramString.append(str);
      localIntent.setData(Uri.parse(paramString.toString()));
    }
    b.startActivityForResult(localIntent, paramInt);
    c += 1;
  }
  
  public void h(List paramList, Activity paramActivity, b paramb, b paramb1)
  {
    if (c > 0) {}
    for (paramList = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";; paramList = "Unable to detect current Android Activity.")
    {
      paramb1.a("PermissionHandler.PermissionManager", paramList);
      return;
      if (paramActivity != null) {
        break;
      }
      Log.d("permissions_handler", "Unable to detect current Activity.");
    }
    a = paramb;
    b = paramActivity;
    d = new HashMap();
    c = 0;
    paramb1 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (f(localInteger.intValue(), paramActivity) == 1)
      {
        if (!d.containsKey(localInteger))
        {
          paramList = d;
          paramb = Integer.valueOf(1);
        }
      }
      else {
        for (;;)
        {
          paramList.put(localInteger, paramb);
          break;
          paramList = u.b(paramActivity, localInteger.intValue());
          if ((paramList != null) && (!paramList.isEmpty()))
          {
            int i = Build.VERSION.SDK_INT;
            if (localInteger.intValue() == 16)
            {
              paramList = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
              i = 209;
            }
            for (;;)
            {
              g(paramList, i);
              break;
              if ((i >= 30) && (localInteger.intValue() == 22))
              {
                paramList = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                i = 210;
              }
              else if (localInteger.intValue() == 23)
              {
                paramList = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                i = 211;
              }
              else if ((i >= 26) && (localInteger.intValue() == 24))
              {
                paramList = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                i = 212;
              }
              else if (localInteger.intValue() == 27)
              {
                paramList = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                i = 213;
              }
              else
              {
                if ((i < 31) || (localInteger.intValue() != 34)) {
                  break label349;
                }
                paramList = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                i = 214;
              }
            }
            label349:
            paramb1.addAll(paramList);
            c += paramList.size();
            break;
          }
          if (d.containsKey(localInteger)) {
            break;
          }
          d.put(localInteger, Integer.valueOf(0));
          if ((localInteger.intValue() == 22) && (Build.VERSION.SDK_INT < 30))
          {
            paramList = d;
            paramb = Integer.valueOf(2);
          }
          else
          {
            paramList = d;
            paramb = Integer.valueOf(0);
          }
        }
      }
    }
    if (paramb1.size() > 0) {
      w.a.l(paramActivity, (String[])paramb1.toArray(new String[0]), 24);
    }
    if (c == 0) {
      a.a(d);
    }
  }
  
  public void i(int paramInt, Activity paramActivity, c paramc, b paramb)
  {
    if (paramActivity == null)
    {
      Log.d("permissions_handler", "Unable to detect current Activity.");
      paramb.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
      return;
    }
    paramb = u.b(paramActivity, paramInt);
    if (paramb == null)
    {
      paramActivity = new StringBuilder();
      paramActivity.append("No android specific permissions needed for: ");
      paramActivity.append(paramInt);
      Log.d("permissions_handler", paramActivity.toString());
      paramc.a(false);
      return;
    }
    if (paramb.isEmpty())
    {
      paramActivity = new StringBuilder();
      paramActivity.append("No permissions found in manifest for: ");
      paramActivity.append(paramInt);
      paramActivity.append(" no need to show request rationale");
      Log.d("permissions_handler", paramActivity.toString());
      paramc.a(false);
      return;
    }
    paramc.a(w.a.m(paramActivity, (String)paramb.get(0)));
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt);
  }
  
  public static abstract interface b
  {
    public abstract void a(Map paramMap);
  }
  
  public static abstract interface c
  {
    public abstract void a(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     w1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */