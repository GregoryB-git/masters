package w1;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import w.a;

public abstract class u
{
  public static String a(Context paramContext, String paramString)
  {
    int i = Build.VERSION.SDK_INT;
    if ((i >= 31) && (d(paramContext, null, paramString))) {
      return paramString;
    }
    if (i < 29)
    {
      if (d(paramContext, null, "android.permission.ACCESS_FINE_LOCATION")) {
        return "android.permission.ACCESS_FINE_LOCATION";
      }
      if (d(paramContext, null, "android.permission.ACCESS_COARSE_LOCATION")) {
        return "android.permission.ACCESS_COARSE_LOCATION";
      }
      return null;
    }
    if ((i >= 29) && (d(paramContext, null, "android.permission.ACCESS_FINE_LOCATION"))) {
      return "android.permission.ACCESS_FINE_LOCATION";
    }
    return null;
  }
  
  public static List b(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    String str;
    switch (paramInt)
    {
    case 10: 
    case 25: 
    case 26: 
    default: 
      break;
    case 35: 
      if (Build.VERSION.SDK_INT >= 33)
      {
        str = "android.permission.BODY_SENSORS_BACKGROUND";
        if (d(paramContext, localArrayList, "android.permission.BODY_SENSORS_BACKGROUND")) {
          paramContext = str;
        }
      }
      break;
    case 34: 
    case 33: 
    case 32: 
    case 31: 
      for (;;)
      {
        localArrayList.add(paramContext);
        break;
        if (Build.VERSION.SDK_INT < 31) {
          break;
        }
        str = "android.permission.SCHEDULE_EXACT_ALARM";
        if (!d(paramContext, localArrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
          break;
        }
        paramContext = str;
        continue;
        if (Build.VERSION.SDK_INT < 33) {
          break;
        }
        str = "android.permission.READ_MEDIA_AUDIO";
        if (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_AUDIO")) {
          break;
        }
        paramContext = str;
        continue;
        if (Build.VERSION.SDK_INT < 33) {
          break;
        }
        str = "android.permission.READ_MEDIA_VIDEO";
        if (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_VIDEO")) {
          break;
        }
        paramContext = str;
        continue;
        if (Build.VERSION.SDK_INT < 33) {
          break;
        }
        str = "android.permission.NEARBY_WIFI_DEVICES";
        if (!d(paramContext, localArrayList, "android.permission.NEARBY_WIFI_DEVICES")) {
          break;
        }
        paramContext = str;
      }
    case 30: 
      paramContext = a(paramContext, "android.permission.BLUETOOTH_CONNECT");
      if (paramContext == null) {
        break;
      }
    case 29: 
    case 28: 
    case 27: 
    case 24: 
    case 23: 
    case 22: 
    case 21: 
    case 19: 
    case 18: 
    case 17: 
    case 16: 
    case 15: 
    case 13: 
    case 12: 
    case 9: 
    case 8: 
    case 7: 
    case 14: 
    case 6: 
    case 11: 
    case 20: 
    case 3: 
    case 4: 
    case 5: 
    case 2: 
    case 1: 
    case 0: 
      for (;;)
      {
        localArrayList.add(paramContext);
        return localArrayList;
        paramContext = a(paramContext, "android.permission.BLUETOOTH_ADVERTISE");
        if (paramContext == null) {
          return localArrayList;
        }
        continue;
        paramContext = a(paramContext, "android.permission.BLUETOOTH_SCAN");
        if (paramContext == null) {
          return localArrayList;
        }
        continue;
        str = "android.permission.ACCESS_NOTIFICATION_POLICY";
        if (!d(paramContext, localArrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        str = "android.permission.REQUEST_INSTALL_PACKAGES";
        if (!d(paramContext, localArrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        str = "android.permission.SYSTEM_ALERT_WINDOW";
        if (!d(paramContext, localArrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (Build.VERSION.SDK_INT < 30) {
          return localArrayList;
        }
        str = "android.permission.MANAGE_EXTERNAL_STORAGE";
        if (!d(paramContext, localArrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        str = "android.permission.BLUETOOTH";
        if (!d(paramContext, localArrayList, "android.permission.BLUETOOTH")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (Build.VERSION.SDK_INT < 29) {
          return null;
        }
        str = "android.permission.ACTIVITY_RECOGNITION";
        if (!d(paramContext, localArrayList, "android.permission.ACTIVITY_RECOGNITION")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (Build.VERSION.SDK_INT < 29) {
          return null;
        }
        str = "android.permission.ACCESS_MEDIA_LOCATION";
        if (!d(paramContext, localArrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (Build.VERSION.SDK_INT < 33) {
          return localArrayList;
        }
        str = "android.permission.POST_NOTIFICATIONS";
        if (!d(paramContext, localArrayList, "android.permission.POST_NOTIFICATIONS")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        str = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
        if (!d(paramContext, localArrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (d(paramContext, localArrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
          localArrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        paramInt = Build.VERSION.SDK_INT;
        if ((paramInt >= 29) && ((paramInt != 29) || (!r.a()))) {
          return localArrayList;
        }
        str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!d(paramContext, localArrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
          return localArrayList;
        }
        paramContext = str;
        break;
        if (d(paramContext, localArrayList, "android.permission.SEND_SMS")) {
          localArrayList.add("android.permission.SEND_SMS");
        }
        if (d(paramContext, localArrayList, "android.permission.RECEIVE_SMS")) {
          localArrayList.add("android.permission.RECEIVE_SMS");
        }
        if (d(paramContext, localArrayList, "android.permission.READ_SMS")) {
          localArrayList.add("android.permission.READ_SMS");
        }
        if (d(paramContext, localArrayList, "android.permission.RECEIVE_WAP_PUSH")) {
          localArrayList.add("android.permission.RECEIVE_WAP_PUSH");
        }
        if (!d(paramContext, localArrayList, "android.permission.RECEIVE_MMS")) {
          return localArrayList;
        }
        paramContext = "android.permission.RECEIVE_MMS";
        continue;
        if (!d(paramContext, localArrayList, "android.permission.BODY_SENSORS")) {
          return localArrayList;
        }
        paramContext = "android.permission.BODY_SENSORS";
        continue;
        if ((Build.VERSION.SDK_INT < 33) || (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_IMAGES"))) {
          return localArrayList;
        }
        paramContext = "android.permission.READ_MEDIA_IMAGES";
        continue;
        if (d(paramContext, localArrayList, "android.permission.READ_PHONE_STATE")) {
          localArrayList.add("android.permission.READ_PHONE_STATE");
        }
        paramInt = Build.VERSION.SDK_INT;
        if ((paramInt > 29) && (d(paramContext, localArrayList, "android.permission.READ_PHONE_NUMBERS"))) {
          localArrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        if (d(paramContext, localArrayList, "android.permission.CALL_PHONE")) {
          localArrayList.add("android.permission.CALL_PHONE");
        }
        if (d(paramContext, localArrayList, "android.permission.READ_CALL_LOG")) {
          localArrayList.add("android.permission.READ_CALL_LOG");
        }
        if (d(paramContext, localArrayList, "android.permission.WRITE_CALL_LOG")) {
          localArrayList.add("android.permission.WRITE_CALL_LOG");
        }
        if (d(paramContext, localArrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
          localArrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
        }
        if (d(paramContext, localArrayList, "android.permission.USE_SIP")) {
          localArrayList.add("android.permission.USE_SIP");
        }
        if ((paramInt >= 29) && (d(paramContext, localArrayList, "android.permission.BIND_CALL_REDIRECTION_SERVICE"))) {
          localArrayList.add("android.permission.BIND_CALL_REDIRECTION_SERVICE");
        }
        if ((paramInt < 26) || (!d(paramContext, localArrayList, "android.permission.ANSWER_PHONE_CALLS"))) {
          return localArrayList;
        }
        paramContext = "android.permission.ANSWER_PHONE_CALLS";
        continue;
        if (!d(paramContext, localArrayList, "android.permission.RECORD_AUDIO")) {
          return localArrayList;
        }
        paramContext = "android.permission.RECORD_AUDIO";
        continue;
        return null;
        if ((paramInt == 4) && (Build.VERSION.SDK_INT >= 29))
        {
          if (!d(paramContext, localArrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return localArrayList;
          }
          paramContext = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        else
        {
          if (d(paramContext, localArrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
            localArrayList.add("android.permission.ACCESS_COARSE_LOCATION");
          }
          if (!d(paramContext, localArrayList, "android.permission.ACCESS_FINE_LOCATION")) {
            return localArrayList;
          }
          paramContext = "android.permission.ACCESS_FINE_LOCATION";
          continue;
          if (d(paramContext, localArrayList, "android.permission.READ_CONTACTS")) {
            localArrayList.add("android.permission.READ_CONTACTS");
          }
          if (d(paramContext, localArrayList, "android.permission.WRITE_CONTACTS")) {
            localArrayList.add("android.permission.WRITE_CONTACTS");
          }
          if (!d(paramContext, localArrayList, "android.permission.GET_ACCOUNTS")) {
            return localArrayList;
          }
          paramContext = "android.permission.GET_ACCOUNTS";
          continue;
          if (!d(paramContext, localArrayList, "android.permission.CAMERA")) {
            return localArrayList;
          }
          paramContext = "android.permission.CAMERA";
          continue;
          if (d(paramContext, localArrayList, "android.permission.READ_CALENDAR")) {
            localArrayList.add("android.permission.READ_CALENDAR");
          }
          if (!d(paramContext, localArrayList, "android.permission.WRITE_CALENDAR")) {
            return localArrayList;
          }
          paramContext = "android.permission.WRITE_CALENDAR";
        }
      }
    }
    return localArrayList;
  }
  
  public static PackageInfo c(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    paramContext = paramContext.getPackageName();
    if (i >= 33) {
      return t.a(localPackageManager, paramContext, s.a(4096L));
    }
    return localPackageManager.getPackageInfo(paramContext, 4096);
  }
  
  public static boolean d(Context paramContext, ArrayList paramArrayList, String paramString)
  {
    if (paramArrayList != null) {
      try
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
          if (((String)paramArrayList.next()).equals(paramString)) {
            return true;
          }
        }
      }
      catch (Exception paramContext) {}
    }
    if (paramContext == null)
    {
      Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
      return false;
    }
    paramContext = c(paramContext);
    if (paramContext == null)
    {
      Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
      return false;
    }
    paramArrayList = new java/util/ArrayList;
    paramArrayList.<init>(Arrays.asList(requestedPermissions));
    paramContext = paramArrayList.iterator();
    while (paramContext.hasNext())
    {
      boolean bool = ((String)paramContext.next()).equals(paramString);
      if (bool)
      {
        return true;
        Log.d("permissions_handler", "Unable to check manifest for permission: ", paramContext);
      }
    }
    return false;
  }
  
  public static boolean e(Activity paramActivity, String paramString)
  {
    if (paramActivity == null) {
      return false;
    }
    return a.m(paramActivity, paramString) ^ true;
  }
  
  public static int f(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2133799037: 
      if (paramString.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
        j = 41;
      }
      break;
    case 2114579147: 
      if (paramString.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
        j = 40;
      }
      break;
    case 2062356686: 
      if (paramString.equals("android.permission.BLUETOOTH_SCAN")) {
        j = 39;
      }
      break;
    case 2024715147: 
      if (paramString.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
        j = 38;
      }
      break;
    case 1977429404: 
      if (paramString.equals("android.permission.READ_CONTACTS")) {
        j = 37;
      }
      break;
    case 1831139720: 
      if (paramString.equals("android.permission.RECORD_AUDIO")) {
        j = 36;
      }
      break;
    case 1780337063: 
      if (paramString.equals("android.permission.ACTIVITY_RECOGNITION")) {
        j = 35;
      }
      break;
    case 1777263169: 
      if (paramString.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
        j = 34;
      }
      break;
    case 1365911975: 
      if (paramString.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
        j = 33;
      }
      break;
    case 1271781903: 
      if (paramString.equals("android.permission.GET_ACCOUNTS")) {
        j = 32;
      }
      break;
    case 1166454870: 
      if (paramString.equals("android.permission.BLUETOOTH_ADVERTISE")) {
        j = 31;
      }
      break;
    case 970694249: 
      if (paramString.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
        j = 30;
      }
      break;
    case 784519842: 
      if (paramString.equals("android.permission.USE_SIP")) {
        j = 29;
      }
      break;
    case 710297143: 
      if (paramString.equals("android.permission.READ_MEDIA_VIDEO")) {
        j = 28;
      }
      break;
    case 691260818: 
      if (paramString.equals("android.permission.READ_MEDIA_AUDIO")) {
        j = 27;
      }
      break;
    case 610633091: 
      if (paramString.equals("android.permission.WRITE_CALL_LOG")) {
        j = 26;
      }
      break;
    case 603653886: 
      if (paramString.equals("android.permission.WRITE_CALENDAR")) {
        j = 25;
      }
      break;
    case 463403621: 
      if (paramString.equals("android.permission.CAMERA")) {
        j = 24;
      }
      break;
    case 361658321: 
      if (paramString.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
        j = 23;
      }
      break;
    case 214526995: 
      if (paramString.equals("android.permission.WRITE_CONTACTS")) {
        j = 22;
      }
      break;
    case 175802396: 
      if (paramString.equals("android.permission.READ_MEDIA_IMAGES")) {
        j = 21;
      }
      break;
    case 112197485: 
      if (paramString.equals("android.permission.CALL_PHONE")) {
        j = 20;
      }
      break;
    case 52602690: 
      if (paramString.equals("android.permission.SEND_SMS")) {
        j = 19;
      }
      break;
    case -5573545: 
      if (paramString.equals("android.permission.READ_PHONE_STATE")) {
        j = 18;
      }
      break;
    case -63024214: 
      if (paramString.equals("android.permission.ACCESS_COARSE_LOCATION")) {
        j = 17;
      }
      break;
    case -406040016: 
      if (paramString.equals("android.permission.READ_EXTERNAL_STORAGE")) {
        j = 16;
      }
      break;
    case -798669607: 
      if (paramString.equals("android.permission.BLUETOOTH_CONNECT")) {
        j = 15;
      }
      break;
    case -895673731: 
      if (paramString.equals("android.permission.RECEIVE_SMS")) {
        j = 14;
      }
      break;
    case -895679497: 
      if (paramString.equals("android.permission.RECEIVE_MMS")) {
        j = 13;
      }
      break;
    case -901151997: 
      if (paramString.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
        j = 12;
      }
      break;
    case -909527021: 
      if (paramString.equals("android.permission.NEARBY_WIFI_DEVICES")) {
        j = 11;
      }
      break;
    case -1164582768: 
      if (paramString.equals("android.permission.READ_PHONE_NUMBERS")) {
        j = 10;
      }
      break;
    case -1238066820: 
      if (paramString.equals("android.permission.BODY_SENSORS")) {
        j = 9;
      }
      break;
    case -1479758289: 
      if (paramString.equals("android.permission.RECEIVE_WAP_PUSH")) {
        j = 8;
      }
      break;
    case -1561629405: 
      if (paramString.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
        j = 7;
      }
      break;
    case -1783097621: 
      if (paramString.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
        j = 6;
      }
      break;
    case -1813079487: 
      if (paramString.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
        j = 5;
      }
      break;
    case -1888586689: 
      if (paramString.equals("android.permission.ACCESS_FINE_LOCATION")) {
        j = 4;
      }
      break;
    case -1921431796: 
      if (paramString.equals("android.permission.READ_CALL_LOG")) {
        j = 3;
      }
      break;
    case -1925850455: 
      if (paramString.equals("android.permission.POST_NOTIFICATIONS")) {
        j = 2;
      }
      break;
    case -1928411001: 
      if (paramString.equals("android.permission.READ_CALENDAR")) {
        j = 1;
      }
      break;
    case -2062386608: 
      if (paramString.equals("android.permission.READ_SMS")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      return 20;
    case 40: 
      return 18;
    case 39: 
      return 28;
    case 38: 
      return 4;
    case 36: 
      return 7;
    case 35: 
      return 19;
    case 34: 
      return 24;
    case 31: 
      return 29;
    case 30: 
      return 34;
    case 28: 
      return 32;
    case 27: 
      return 33;
    case 24: 
      return 1;
    case 23: 
      return 35;
    case 22: 
    case 32: 
    case 37: 
      return 2;
    case 21: 
      return 9;
    case 16: 
    case 33: 
      return 15;
    case 15: 
      return 30;
    case 11: 
      return 31;
    case 9: 
      return 12;
    case 7: 
      return 23;
    case 6: 
      return 27;
    case 5: 
      return 22;
    case 4: 
    case 17: 
      return 3;
    case 3: 
    case 10: 
    case 12: 
    case 18: 
    case 20: 
    case 26: 
    case 29: 
    case 41: 
      return 8;
    case 2: 
      return 17;
    case 1: 
    case 25: 
      return 0;
    }
    return 13;
  }
  
  public static void g(Context paramContext, String paramString)
  {
    paramContext.getSharedPreferences(paramString, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
  }
  
  public static int h(Activity paramActivity, String paramString, int paramInt)
  {
    int i = 1;
    if (paramInt == -1)
    {
      boolean bool = j(paramActivity, paramString);
      paramInt = e(paramActivity, paramString) ^ true;
      if (bool) {
        if (paramInt == 0) {
          paramInt = i;
        } else {
          paramInt = 0;
        }
      }
      if ((!bool) && (paramInt != 0)) {
        g(paramActivity, paramString);
      }
      if ((bool) && (paramInt != 0)) {
        return 4;
      }
      return 0;
    }
    return 1;
  }
  
  public static void i(Activity paramActivity, int paramInt)
  {
    if (paramActivity == null) {
      return;
    }
    paramActivity = b(paramActivity, paramInt);
    if (paramActivity != null) {
      paramActivity.isEmpty();
    }
  }
  
  public static boolean j(Context paramContext, String paramString)
  {
    return paramContext.getSharedPreferences(paramString, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
  }
}

/* Location:
 * Qualified Name:     w1.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */