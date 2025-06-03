package e3;

import a0.j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p2.m0;

public final class d
  implements MethodChannel.MethodCallHandler
{
  public final Context a;
  public final m0 b;
  public final f c;
  public final h d;
  
  public d(Context paramContext, m0 paramm0, f paramf, h paramh)
  {
    a = paramContext;
    b = paramm0;
    c = paramf;
    d = paramh;
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject1 = method;
    localObject1.getClass();
    int i = ((String)localObject1).hashCode();
    Object localObject2 = Integer.valueOf(0);
    Object localObject3 = Boolean.FALSE;
    switch (i)
    {
    default: 
      break;
    case 1669188213: 
      if (((String)localObject1).equals("requestPermissions")) {
        i = 4;
      }
      break;
    case 347240634: 
      if (((String)localObject1).equals("openAppSettings")) {
        i = 3;
      }
      break;
    case -576207927: 
      if (((String)localObject1).equals("checkPermissionStatus")) {
        i = 2;
      }
      break;
    case -1017315255: 
      if (((String)localObject1).equals("shouldShowRequestPermissionRationale")) {
        i = 1;
      }
      break;
    case -1544053025: 
      if (((String)localObject1).equals("checkServiceStatus")) {
        i = 0;
      }
      break;
    }
    i = -1;
    localObject1 = "Unable to detect current Android Activity.";
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              paramResult.notImplemented();
            }
            else
            {
              paramMethodCall = (List)paramMethodCall.arguments();
              localObject3 = c;
              Objects.requireNonNull(paramResult);
              Object localObject4 = new c(paramResult);
              if (d > 0)
              {
                paramMethodCall = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
              }
              else
              {
                if (c != null) {
                  break label291;
                }
                Log.d("permissions_handler", "Unable to detect current Activity.");
                paramMethodCall = (MethodCall)localObject1;
              }
              paramResult.error("PermissionHandler.PermissionManager", paramMethodCall, null);
              return;
              label291:
              b = ((f.a)localObject4);
              e = new HashMap();
              d = 0;
              localObject1 = new ArrayList();
              localObject4 = paramMethodCall.iterator();
              while (((Iterator)localObject4).hasNext())
              {
                Object localObject5 = (Integer)((Iterator)localObject4).next();
                if (((f)localObject3).b(((Integer)localObject5).intValue()) == 1)
                {
                  if (e.containsKey(localObject5)) {
                    continue;
                  }
                  i = 1;
                }
                else
                {
                  paramMethodCall = g.c(c, ((Integer)localObject5).intValue());
                  if ((paramMethodCall != null) && (!paramMethodCall.isEmpty()))
                  {
                    i = Build.VERSION.SDK_INT;
                    if (((Integer)localObject5).intValue() == 16)
                    {
                      i = 209;
                      paramMethodCall = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                    }
                    else if ((i >= 30) && (((Integer)localObject5).intValue() == 22))
                    {
                      i = 210;
                      paramMethodCall = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                    }
                    else if (((Integer)localObject5).intValue() == 23)
                    {
                      i = 211;
                      paramMethodCall = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                    }
                    else if ((i >= 26) && (((Integer)localObject5).intValue() == 24))
                    {
                      i = 212;
                      paramMethodCall = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                    }
                    else if (((Integer)localObject5).intValue() == 27)
                    {
                      i = 213;
                      paramMethodCall = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                    }
                    else
                    {
                      if ((i < 31) || (((Integer)localObject5).intValue() != 34)) {
                        break label663;
                      }
                      i = 214;
                      paramMethodCall = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                    }
                    if (c == null) {
                      continue;
                    }
                    paramResult = new Intent(paramMethodCall);
                    if (!paramMethodCall.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS"))
                    {
                      localObject5 = c.getPackageName();
                      paramMethodCall = new StringBuilder();
                      paramMethodCall.append("package:");
                      paramMethodCall.append((String)localObject5);
                      paramResult.setData(Uri.parse(paramMethodCall.toString()));
                    }
                    c.startActivityForResult(paramResult, i);
                    d += 1;
                    continue;
                    label663:
                    if ((((Integer)localObject5).intValue() != 37) && (((Integer)localObject5).intValue() != 0))
                    {
                      ((ArrayList)localObject1).addAll(paramMethodCall);
                      i = d;
                      d = (paramMethodCall.size() + i);
                      continue;
                    }
                    if (!((f)localObject3).c()) {
                      break label817;
                    }
                    ((ArrayList)localObject1).add("android.permission.WRITE_CALENDAR");
                    ((ArrayList)localObject1).add("android.permission.READ_CALENDAR");
                    d += 2;
                    continue;
                  }
                  i = 2;
                  if (e.containsKey(localObject5)) {
                    continue;
                  }
                  ((Integer)localObject5).intValue();
                  e.put(localObject5, localObject2);
                  if ((((Integer)localObject5).intValue() != 22) || (Build.VERSION.SDK_INT >= 30)) {
                    break label817;
                  }
                }
                paramMethodCall = e;
                paramResult = Integer.valueOf(i);
                break label826;
                label817:
                paramMethodCall = e;
                paramResult = (MethodChannel.Result)localObject2;
                label826:
                paramMethodCall.put(localObject5, paramResult);
              }
              if (((ArrayList)localObject1).size() > 0)
              {
                paramMethodCall = (String[])((ArrayList)localObject1).toArray(new String[0]);
                u.b.a(c, paramMethodCall, 24);
              }
              paramMethodCall = b;
              if ((paramMethodCall != null) && (d == 0))
              {
                paramResult = e;
                a.success(paramResult);
              }
            }
          }
          else
          {
            localObject2 = b;
            paramMethodCall = a;
            Objects.requireNonNull(paramResult);
            localObject2.getClass();
            if (paramMethodCall == null)
            {
              Log.d("permissions_handler", "Context cannot be null.");
              paramResult.error("PermissionHandler.AppSettingsManager", "Android context cannot be null.", null);
            }
            else
            {
              try
              {
                localObject1 = new android/content/Intent;
                ((Intent)localObject1).<init>();
                ((Intent)localObject1).setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                ((Intent)localObject1).addCategory("android.intent.category.DEFAULT");
                localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>();
                ((StringBuilder)localObject2).append("package:");
                ((StringBuilder)localObject2).append(paramMethodCall.getPackageName());
                ((Intent)localObject1).setData(Uri.parse(((StringBuilder)localObject2).toString()));
                ((Intent)localObject1).addFlags(268435456);
                ((Intent)localObject1).addFlags(1073741824);
                ((Intent)localObject1).addFlags(8388608);
                paramMethodCall.startActivity((Intent)localObject1);
                paramResult.success(Boolean.TRUE);
              }
              catch (Exception paramMethodCall)
              {
                paramResult.success(localObject3);
              }
            }
          }
        }
        else
        {
          i = Integer.parseInt(arguments.toString());
          paramMethodCall = c;
          Objects.requireNonNull(paramResult);
          paramResult.success(Integer.valueOf(paramMethodCall.b(i)));
        }
      }
      else
      {
        i = Integer.parseInt(arguments.toString());
        paramMethodCall = c;
        Objects.requireNonNull(paramResult);
        localObject2 = c;
        if (localObject2 == null)
        {
          Log.d("permissions_handler", "Unable to detect current Activity.");
          paramResult.error("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.", null);
        }
        else
        {
          localObject2 = g.c((Context)localObject2, i);
          if (localObject2 == null)
          {
            paramMethodCall = new StringBuilder();
            paramMethodCall.append("No android specific permissions needed for: ");
            paramMethodCall.append(i);
          }
          else
          {
            if (!((ArrayList)localObject2).isEmpty()) {
              break label1254;
            }
            paramMethodCall = j.n("No permissions found in manifest for: ", i, " no need to show request rationale");
          }
          Log.d("permissions_handler", paramMethodCall.toString());
          paramResult.success(localObject3);
          return;
          label1254:
          paramResult.success(Boolean.valueOf(u.b.b(c, (String)((ArrayList)localObject2).get(0))));
        }
      }
    }
    else
    {
      i = Integer.parseInt(arguments.toString());
      localObject1 = d;
      paramMethodCall = a;
      Objects.requireNonNull(paramResult);
      localObject2 = new a(paramResult);
      paramResult = new b(paramResult);
      localObject1.getClass();
      h.a(i, paramMethodCall, (a)localObject2, paramResult);
    }
  }
}

/* Location:
 * Qualified Name:     e3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */