package e3;

import a4.r;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import c0.b;
import e0.g0;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.ActivityResultListener;
import io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import u.u;
import v.a;

public final class f
  implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener
{
  public final Context a;
  public a b;
  public Activity c;
  public int d;
  public HashMap e;
  
  public f(Context paramContext)
  {
    a = paramContext;
  }
  
  public final int a()
  {
    ArrayList localArrayList = g.c(a, 21);
    int i;
    if ((localArrayList != null) && (!localArrayList.isEmpty())) {
      i = 0;
    } else {
      i = 1;
    }
    if (i != 0)
    {
      Log.d("permissions_handler", "Bluetooth permission missing in manifest");
      return 0;
    }
    return 1;
  }
  
  public final int b(int paramInt)
  {
    int i = 1;
    if (paramInt == 17)
    {
      if (Build.VERSION.SDK_INT < 33)
      {
        if (new u(a).a()) {
          paramInt = i;
        } else {
          paramInt = 0;
        }
      }
      else if (a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
        paramInt = i;
      } else {
        paramInt = g.b(c, "android.permission.POST_NOTIFICATIONS");
      }
      return paramInt;
    }
    if (paramInt == 21) {
      return a();
    }
    if (((paramInt == 30) || (paramInt == 28) || (paramInt == 29)) && (Build.VERSION.SDK_INT < 31)) {
      return a();
    }
    if (((paramInt == 37) || (paramInt == 0)) && (!c())) {
      return 0;
    }
    Object localObject1 = g.c(a, paramInt);
    if (localObject1 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("No android specific permissions needed for: ");
      ((StringBuilder)localObject1).append(paramInt);
      Log.d("permissions_handler", ((StringBuilder)localObject1).toString());
      return 1;
    }
    Object localObject2;
    if (((ArrayList)localObject1).size() == 0)
    {
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("No permissions found in manifest for: ");
      ((StringBuilder)localObject2).append(localObject1);
      ((StringBuilder)localObject2).append(paramInt);
      Log.d("permissions_handler", ((StringBuilder)localObject2).toString());
      if ((paramInt == 22) && (Build.VERSION.SDK_INT < 30)) {
        return 2;
      }
      return 0;
    }
    if (a.getApplicationInfo().targetSdkVersion >= 23) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject2 = new HashSet();
      Iterator localIterator = ((ArrayList)localObject1).iterator();
      label544:
      label598:
      label630:
      while (localIterator.hasNext())
      {
        localObject1 = (String)localIterator.next();
        int j;
        if (paramInt == 16)
        {
          String str = a.getPackageName();
          localObject1 = (PowerManager)a.getSystemService("power");
          if ((localObject1 != null) && (((PowerManager)localObject1).isIgnoringBatteryOptimizations(str))) {
            break label598;
          }
          localObject1 = Integer.valueOf(0);
        }
        else
        {
          if (paramInt == 22)
          {
            if (Build.VERSION.SDK_INT < 30) {
              ((HashSet)localObject2).add(Integer.valueOf(2));
            }
            i = g0.i();
          }
          else if (paramInt == 23)
          {
            i = Settings.canDrawOverlays(a);
          }
          else if (paramInt == 24)
          {
            if (Build.VERSION.SDK_INT < 26) {
              break label630;
            }
            i = b.z(a.getPackageManager());
          }
          else if (paramInt == 27)
          {
            i = ((NotificationManager)a.getSystemService("notification")).isNotificationPolicyAccessGranted();
          }
          else if (paramInt == 34)
          {
            if (Build.VERSION.SDK_INT < 31) {
              break label598;
            }
            i = r.h((AlarmManager)a.getSystemService("alarm"));
          }
          else
          {
            if ((paramInt == 9) || (paramInt == 32)) {
              break label544;
            }
            if (a.checkSelfPermission(a, (String)localObject1) == 0) {
              break label630;
            }
            j = g.b(c, (String)localObject1);
          }
          localObject1 = Integer.valueOf(j);
        }
        ((HashSet)localObject2).add(localObject1);
        break label630;
        int k = a.checkSelfPermission(a, (String)localObject1);
        if (Build.VERSION.SDK_INT >= 34) {
          j = a.checkSelfPermission(a, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        } else {
          j = k;
        }
        if ((j == 0) && (k == -1))
        {
          j = 3;
        }
        else
        {
          if (k == 0)
          {
            ((HashSet)localObject2).add(Integer.valueOf(1));
            break label630;
          }
          j = g.b(c, (String)localObject1);
        }
        ((HashSet)localObject2).add(Integer.valueOf(j));
      }
      if (!((HashSet)localObject2).isEmpty()) {
        return g.e((HashSet)localObject2).intValue();
      }
    }
    return 1;
  }
  
  public final boolean c()
  {
    ArrayList localArrayList = g.c(a, 37);
    int i;
    if ((localArrayList != null) && (localArrayList.contains("android.permission.WRITE_CALENDAR"))) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((localArrayList != null) && (localArrayList.contains("android.permission.READ_CALENDAR"))) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if ((i != 0) && (j != 0)) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0)
    {
      if (i == 0) {
        Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
      }
      if (j == 0) {
        Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
      }
      return false;
    }
    return true;
  }
  
  public final boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramIntent = c;
    int i = 0;
    if (paramIntent == null) {
      return false;
    }
    if (e == null)
    {
      d = 0;
      return false;
    }
    if (paramInt1 == 209)
    {
      int j = 16;
      paramIntent = a.getPackageName();
      localObject = (PowerManager)a.getSystemService("power");
      paramInt1 = j;
      paramInt2 = i;
      if (localObject == null) {
        break label241;
      }
      paramInt1 = j;
      paramInt2 = i;
      if (!((PowerManager)localObject).isIgnoringBatteryOptimizations(paramIntent)) {
        break label241;
      }
      paramInt1 = j;
    }
    else
    {
      if (paramInt1 == 210)
      {
        if (Build.VERSION.SDK_INT >= 30)
        {
          paramInt2 = g0.i();
          paramInt1 = 22;
          break label241;
        }
        return false;
      }
      if (paramInt1 == 211)
      {
        paramInt2 = Settings.canDrawOverlays(paramIntent);
        paramInt1 = 23;
        break label241;
      }
      if (paramInt1 == 212)
      {
        if (Build.VERSION.SDK_INT >= 26)
        {
          paramInt2 = b.z(paramIntent.getPackageManager());
          paramInt1 = 24;
          break label241;
        }
        return false;
      }
      if (paramInt1 == 213)
      {
        paramInt2 = ((NotificationManager)paramIntent.getSystemService("notification")).isNotificationPolicyAccessGranted();
        paramInt1 = 27;
        break label241;
      }
      if (paramInt1 != 214) {
        break label305;
      }
      paramInt2 = 34;
      paramIntent = (AlarmManager)paramIntent.getSystemService("alarm");
      paramInt1 = paramInt2;
      if (Build.VERSION.SDK_INT >= 31)
      {
        int k = r.h(paramIntent);
        paramInt1 = paramInt2;
        paramInt2 = k;
        break label241;
      }
    }
    paramInt2 = 1;
    label241:
    e.put(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
    paramInt1 = d - 1;
    d = paramInt1;
    Object localObject = b;
    if ((localObject != null) && (paramInt1 == 0))
    {
      paramIntent = e;
      a.success(paramIntent);
    }
    return true;
    label305:
    return false;
  }
  
  public final boolean onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (paramInt != 24)
    {
      d = 0;
      return false;
    }
    if (e == null) {
      return false;
    }
    if ((paramArrayOfString.length == 0) && (paramArrayOfInt.length == 0))
    {
      Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
      return false;
    }
    Object localObject1 = Arrays.asList(paramArrayOfString);
    paramInt = ((List)localObject1).indexOf("android.permission.WRITE_CALENDAR");
    if (paramInt >= 0)
    {
      paramInt = paramArrayOfInt[paramInt];
      paramInt = g.f(c, "android.permission.WRITE_CALENDAR", paramInt);
      e.put(Integer.valueOf(36), Integer.valueOf(paramInt));
      i = ((List)localObject1).indexOf("android.permission.READ_CALENDAR");
      if (i >= 0)
      {
        i = paramArrayOfInt[i];
        i = g.f(c, "android.permission.READ_CALENDAR", i);
        localObject1 = new HashSet();
        ((HashSet)localObject1).add(Integer.valueOf(paramInt));
        ((HashSet)localObject1).add(Integer.valueOf(i));
        paramInt = g.e((HashSet)localObject1).intValue();
        e.put(Integer.valueOf(37), Integer.valueOf(paramInt));
        e.put(Integer.valueOf(0), Integer.valueOf(paramInt));
      }
    }
    for (int i = 0; i < paramArrayOfString.length; i++)
    {
      Object localObject2 = paramArrayOfString[i];
      if ((!((String)localObject2).equals("android.permission.WRITE_CALENDAR")) && (!((String)localObject2).equals("android.permission.READ_CALENDAR")))
      {
        switch (((String)localObject2).hashCode())
        {
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      do
                                                      {
                                                        do
                                                        {
                                                          do
                                                          {
                                                            do
                                                            {
                                                              do
                                                              {
                                                                do
                                                                {
                                                                  do
                                                                  {
                                                                    do
                                                                    {
                                                                      do
                                                                      {
                                                                        do
                                                                        {
                                                                          do
                                                                          {
                                                                            do
                                                                            {
                                                                              do
                                                                              {
                                                                                do
                                                                                {
                                                                                  do
                                                                                  {
                                                                                    do
                                                                                    {
                                                                                      do
                                                                                      {
                                                                                        do
                                                                                        {
                                                                                          paramInt = -1;
                                                                                          break;
                                                                                        } while (!((String)localObject2).equals("com.android.voicemail.permission.ADD_VOICEMAIL"));
                                                                                        paramInt = 40;
                                                                                        break;
                                                                                      } while (!((String)localObject2).equals("android.permission.ACCESS_MEDIA_LOCATION"));
                                                                                      paramInt = 39;
                                                                                      break;
                                                                                    } while (!((String)localObject2).equals("android.permission.BLUETOOTH_SCAN"));
                                                                                    paramInt = 38;
                                                                                    break;
                                                                                  } while (!((String)localObject2).equals("android.permission.ACCESS_BACKGROUND_LOCATION"));
                                                                                  paramInt = 37;
                                                                                  break;
                                                                                } while (!((String)localObject2).equals("android.permission.READ_CONTACTS"));
                                                                                paramInt = 36;
                                                                                break;
                                                                              } while (!((String)localObject2).equals("android.permission.RECORD_AUDIO"));
                                                                              paramInt = 35;
                                                                              break;
                                                                            } while (!((String)localObject2).equals("android.permission.ACTIVITY_RECOGNITION"));
                                                                            paramInt = 34;
                                                                            break;
                                                                          } while (!((String)localObject2).equals("android.permission.REQUEST_INSTALL_PACKAGES"));
                                                                          paramInt = 33;
                                                                          break;
                                                                        } while (!((String)localObject2).equals("android.permission.WRITE_EXTERNAL_STORAGE"));
                                                                        paramInt = 32;
                                                                        break;
                                                                      } while (!((String)localObject2).equals("android.permission.GET_ACCOUNTS"));
                                                                      paramInt = 31;
                                                                      break;
                                                                    } while (!((String)localObject2).equals("android.permission.BLUETOOTH_ADVERTISE"));
                                                                    paramInt = 30;
                                                                    break;
                                                                  } while (!((String)localObject2).equals("android.permission.SCHEDULE_EXACT_ALARM"));
                                                                  paramInt = 29;
                                                                  break;
                                                                } while (!((String)localObject2).equals("android.permission.USE_SIP"));
                                                                paramInt = 28;
                                                                break;
                                                              } while (!((String)localObject2).equals("android.permission.READ_MEDIA_VIDEO"));
                                                              paramInt = 27;
                                                              break;
                                                            } while (!((String)localObject2).equals("android.permission.READ_MEDIA_AUDIO"));
                                                            paramInt = 26;
                                                            break;
                                                          } while (!((String)localObject2).equals("android.permission.WRITE_CALL_LOG"));
                                                          paramInt = 25;
                                                          break;
                                                        } while (!((String)localObject2).equals("android.permission.WRITE_CALENDAR"));
                                                        paramInt = 24;
                                                        break;
                                                      } while (!((String)localObject2).equals("android.permission.CAMERA"));
                                                      paramInt = 23;
                                                      break;
                                                    } while (!((String)localObject2).equals("android.permission.BODY_SENSORS_BACKGROUND"));
                                                    paramInt = 22;
                                                    break;
                                                  } while (!((String)localObject2).equals("android.permission.WRITE_CONTACTS"));
                                                  paramInt = 21;
                                                  break;
                                                } while (!((String)localObject2).equals("android.permission.READ_MEDIA_IMAGES"));
                                                paramInt = 20;
                                                break;
                                              } while (!((String)localObject2).equals("android.permission.CALL_PHONE"));
                                              paramInt = 19;
                                              break;
                                            } while (!((String)localObject2).equals("android.permission.SEND_SMS"));
                                            paramInt = 18;
                                            break;
                                          } while (!((String)localObject2).equals("android.permission.READ_PHONE_STATE"));
                                          paramInt = 17;
                                          break;
                                        } while (!((String)localObject2).equals("android.permission.ACCESS_COARSE_LOCATION"));
                                        paramInt = 16;
                                        break;
                                      } while (!((String)localObject2).equals("android.permission.READ_EXTERNAL_STORAGE"));
                                      paramInt = 15;
                                      break;
                                    } while (!((String)localObject2).equals("android.permission.BLUETOOTH_CONNECT"));
                                    paramInt = 14;
                                    break;
                                  } while (!((String)localObject2).equals("android.permission.RECEIVE_SMS"));
                                  paramInt = 13;
                                  break;
                                } while (!((String)localObject2).equals("android.permission.RECEIVE_MMS"));
                                paramInt = 12;
                                break;
                              } while (!((String)localObject2).equals("android.permission.NEARBY_WIFI_DEVICES"));
                              paramInt = 11;
                              break;
                            } while (!((String)localObject2).equals("android.permission.READ_PHONE_NUMBERS"));
                            paramInt = 10;
                            break;
                          } while (!((String)localObject2).equals("android.permission.BODY_SENSORS"));
                          paramInt = 9;
                          break;
                        } while (!((String)localObject2).equals("android.permission.RECEIVE_WAP_PUSH"));
                        paramInt = 8;
                        break;
                      } while (!((String)localObject2).equals("android.permission.SYSTEM_ALERT_WINDOW"));
                      paramInt = 7;
                      break;
                    } while (!((String)localObject2).equals("android.permission.ACCESS_NOTIFICATION_POLICY"));
                    paramInt = 6;
                    break;
                  } while (!((String)localObject2).equals("android.permission.MANAGE_EXTERNAL_STORAGE"));
                  paramInt = 5;
                  break;
                } while (!((String)localObject2).equals("android.permission.ACCESS_FINE_LOCATION"));
                paramInt = 4;
                break;
              } while (!((String)localObject2).equals("android.permission.READ_CALL_LOG"));
              paramInt = 3;
              break;
            } while (!((String)localObject2).equals("android.permission.POST_NOTIFICATIONS"));
            paramInt = 2;
            break;
          } while (!((String)localObject2).equals("android.permission.READ_CALENDAR"));
          paramInt = 1;
          break;
        } while (!((String)localObject2).equals("android.permission.READ_SMS"));
        paramInt = 0;
        switch (paramInt)
        {
        default: 
          paramInt = 20;
          break;
        case 39: 
          paramInt = 18;
          break;
        case 38: 
          paramInt = 28;
          break;
        case 37: 
          paramInt = 4;
          break;
        case 35: 
          paramInt = 7;
          break;
        case 34: 
          paramInt = 19;
          break;
        case 33: 
          paramInt = 24;
          break;
        case 30: 
          paramInt = 29;
          break;
        case 29: 
          paramInt = 34;
          break;
        case 27: 
          paramInt = 32;
          break;
        case 26: 
          paramInt = 33;
          break;
        case 23: 
          paramInt = 1;
          break;
        case 22: 
          paramInt = 35;
          break;
        case 21: 
        case 31: 
        case 36: 
          paramInt = 2;
          break;
        case 20: 
          paramInt = 9;
          break;
        case 15: 
        case 32: 
          paramInt = 15;
          break;
        case 14: 
          paramInt = 30;
          break;
        case 11: 
          paramInt = 31;
          break;
        case 9: 
          paramInt = 12;
          break;
        case 7: 
          paramInt = 23;
          break;
        case 6: 
          paramInt = 27;
          break;
        case 5: 
          paramInt = 22;
          break;
        case 4: 
        case 16: 
          paramInt = 3;
          break;
        case 3: 
        case 10: 
        case 17: 
        case 19: 
        case 25: 
        case 28: 
        case 40: 
          paramInt = 8;
          break;
        case 2: 
          paramInt = 17;
          break;
        case 1: 
        case 24: 
          paramInt = 0;
          break;
        case 0: 
        case 8: 
        case 12: 
        case 13: 
        case 18: 
          paramInt = 13;
        }
        if (paramInt != 20)
        {
          int j = paramArrayOfInt[i];
          Object localObject3;
          if (paramInt == 8)
          {
            localObject1 = (Integer)e.get(Integer.valueOf(8));
            paramInt = g.f(c, (String)localObject2, j);
            localObject3 = new HashSet();
            ((HashSet)localObject3).add(localObject1);
            ((HashSet)localObject3).add(Integer.valueOf(paramInt));
            localObject1 = g.e((HashSet)localObject3);
            localObject3 = e;
            localObject2 = Integer.valueOf(8);
          }
          else
          {
            if (paramInt == 7)
            {
              if (!e.containsKey(Integer.valueOf(7))) {
                e.put(Integer.valueOf(7), Integer.valueOf(g.f(c, (String)localObject2, j)));
              }
              if (e.containsKey(Integer.valueOf(14))) {
                continue;
              }
              localObject3 = e;
              localObject1 = Integer.valueOf(14);
              break label2130;
            }
            if (paramInt == 4)
            {
              paramInt = g.f(c, (String)localObject2, j);
              if (e.containsKey(Integer.valueOf(4))) {
                continue;
              }
              localObject1 = e;
              localObject3 = Integer.valueOf(4);
            }
            else
            {
              if (paramInt != 3) {
                break label2089;
              }
              j = g.f(c, (String)localObject2, j);
              if ((Build.VERSION.SDK_INT < 29) && (!e.containsKey(Integer.valueOf(4)))) {
                e.put(Integer.valueOf(4), Integer.valueOf(j));
              }
              if (!e.containsKey(Integer.valueOf(5))) {
                e.put(Integer.valueOf(5), Integer.valueOf(j));
              }
              localObject1 = e;
              localObject3 = Integer.valueOf(paramInt);
              paramInt = j;
            }
            Integer localInteger = Integer.valueOf(paramInt);
            localObject2 = localObject3;
            localObject3 = localObject1;
            localObject1 = localInteger;
          }
          ((HashMap)localObject3).put(localObject2, localObject1);
          continue;
          label2089:
          if ((paramInt != 9) && (paramInt != 32))
          {
            if (e.containsKey(Integer.valueOf(paramInt))) {
              continue;
            }
            localObject3 = e;
            localObject1 = Integer.valueOf(paramInt);
            label2130:
            paramInt = g.f(c, (String)localObject2, j);
          }
          else
          {
            localObject3 = e;
            localObject1 = Integer.valueOf(paramInt);
            paramInt = b(paramInt);
          }
          ((HashMap)localObject3).put(localObject1, Integer.valueOf(paramInt));
        }
      }
    }
    paramInt = d - paramArrayOfInt.length;
    d = paramInt;
    paramArrayOfString = b;
    if ((paramArrayOfString != null) && (paramInt == 0))
    {
      paramArrayOfInt = e;
      a.success(paramArrayOfInt);
    }
    return true;
  }
  
  @FunctionalInterface
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     e3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */