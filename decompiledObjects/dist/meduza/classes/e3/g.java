package e3;

import aa.v;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import u.b;

public final class g
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
    if (d(paramContext, null, "android.permission.ACCESS_FINE_LOCATION")) {
      return "android.permission.ACCESS_FINE_LOCATION";
    }
    return null;
  }
  
  public static int b(Activity paramActivity, String paramString)
  {
    if (paramActivity == null) {
      return 0;
    }
    boolean bool1 = paramActivity.getSharedPreferences(paramString, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    boolean bool2 = b.b(paramActivity, paramString) ^ true ^ true;
    boolean bool3 = bool2;
    if (bool1) {
      if (!bool2) {
        bool3 = true;
      } else {
        bool3 = false;
      }
    }
    if ((!bool1) && (bool3)) {
      paramActivity.getSharedPreferences(paramString, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }
    if ((bool1) && (bool3)) {
      return 4;
    }
    return 0;
  }
  
  public static ArrayList c(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    String str = "android.permission.RECEIVE_MMS";
    switch (paramInt)
    {
    case 10: 
    case 25: 
    case 26: 
    default: 
      break;
    case 36: 
      if (!d(paramContext, localArrayList, "android.permission.WRITE_CALENDAR")) {
        return localArrayList;
      }
      localArrayList.add("android.permission.WRITE_CALENDAR");
      break;
    case 35: 
      if ((Build.VERSION.SDK_INT < 33) || (!d(paramContext, localArrayList, "android.permission.BODY_SENSORS_BACKGROUND"))) {
        return localArrayList;
      }
      paramContext = "android.permission.BODY_SENSORS_BACKGROUND";
      break;
    case 34: 
      str = "android.permission.SCHEDULE_EXACT_ALARM";
      if (!d(paramContext, localArrayList, "android.permission.SCHEDULE_EXACT_ALARM")) {
        return localArrayList;
      }
      paramContext = str;
      break;
    case 33: 
      if ((Build.VERSION.SDK_INT < 33) || (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_AUDIO"))) {
        return localArrayList;
      }
      paramContext = "android.permission.READ_MEDIA_AUDIO";
      break;
    case 32: 
      if ((Build.VERSION.SDK_INT < 33) || (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_VIDEO"))) {
        return localArrayList;
      }
      paramContext = "android.permission.READ_MEDIA_VIDEO";
      break;
    case 31: 
      if ((Build.VERSION.SDK_INT < 33) || (!d(paramContext, localArrayList, "android.permission.NEARBY_WIFI_DEVICES"))) {
        return localArrayList;
      }
      paramContext = "android.permission.NEARBY_WIFI_DEVICES";
      break;
    case 30: 
      if (Build.VERSION.SDK_INT < 31) {
        return localArrayList;
      }
      paramContext = a(paramContext, "android.permission.BLUETOOTH_CONNECT");
      if (paramContext == null) {
        return localArrayList;
      }
      break;
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
      for (;;)
      {
        break;
        if (Build.VERSION.SDK_INT < 31) {
          return localArrayList;
        }
        paramContext = a(paramContext, "android.permission.BLUETOOTH_ADVERTISE");
        if (paramContext == null) {
          return localArrayList;
        }
        continue;
        if (Build.VERSION.SDK_INT < 31) {
          return localArrayList;
        }
        paramContext = a(paramContext, "android.permission.BLUETOOTH_SCAN");
        if (paramContext == null) {
          return localArrayList;
        }
        continue;
        if (!d(paramContext, localArrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
          return localArrayList;
        }
        paramContext = "android.permission.ACCESS_NOTIFICATION_POLICY";
        break;
        if (!d(paramContext, localArrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
          return localArrayList;
        }
        paramContext = "android.permission.REQUEST_INSTALL_PACKAGES";
        break;
        str = "android.permission.SYSTEM_ALERT_WINDOW";
        if (!d(paramContext, localArrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        if ((Build.VERSION.SDK_INT < 30) || (!d(paramContext, localArrayList, "android.permission.MANAGE_EXTERNAL_STORAGE"))) {
          return localArrayList;
        }
        paramContext = "android.permission.MANAGE_EXTERNAL_STORAGE";
        break;
        str = "android.permission.BLUETOOTH";
        if (!d(paramContext, localArrayList, "android.permission.BLUETOOTH")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        if (Build.VERSION.SDK_INT < 29) {
          return null;
        }
        if (!d(paramContext, localArrayList, "android.permission.ACTIVITY_RECOGNITION")) {
          return localArrayList;
        }
        paramContext = "android.permission.ACTIVITY_RECOGNITION";
        break;
        if (Build.VERSION.SDK_INT < 29) {
          return null;
        }
        if (!d(paramContext, localArrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
          return localArrayList;
        }
        paramContext = "android.permission.ACCESS_MEDIA_LOCATION";
        break;
        if (Build.VERSION.SDK_INT < 33) {
          return localArrayList;
        }
        str = "android.permission.POST_NOTIFICATIONS";
        if (!d(paramContext, localArrayList, "android.permission.POST_NOTIFICATIONS")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        str = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
        if (!d(paramContext, localArrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        if (d(paramContext, localArrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
          localArrayList.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        paramInt = Build.VERSION.SDK_INT;
        if (((paramInt >= 29) && ((paramInt != 29) || (!v.q()))) || (!d(paramContext, localArrayList, "android.permission.WRITE_EXTERNAL_STORAGE"))) {
          return localArrayList;
        }
        paramContext = "android.permission.WRITE_EXTERNAL_STORAGE";
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
        paramContext = str;
        break;
        str = "android.permission.BODY_SENSORS";
        if (!d(paramContext, localArrayList, "android.permission.BODY_SENSORS")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        if (Build.VERSION.SDK_INT < 33) {
          return localArrayList;
        }
        str = "android.permission.READ_MEDIA_IMAGES";
        if (!d(paramContext, localArrayList, "android.permission.READ_MEDIA_IMAGES")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
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
        if ((paramInt < 26) || (!d(paramContext, localArrayList, "android.permission.ANSWER_PHONE_CALLS"))) {
          return localArrayList;
        }
        paramContext = "android.permission.ANSWER_PHONE_CALLS";
        break;
        str = "android.permission.RECORD_AUDIO";
        if (!d(paramContext, localArrayList, "android.permission.RECORD_AUDIO")) {
          return localArrayList;
        }
        paramContext = str;
        break label1095;
        return null;
        if ((paramInt == 4) && (Build.VERSION.SDK_INT >= 29))
        {
          str = "android.permission.ACCESS_BACKGROUND_LOCATION";
          if (!d(paramContext, localArrayList, str)) {
            return localArrayList;
          }
          paramContext = str;
        }
        else
        {
          if (d(paramContext, localArrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
            localArrayList.add("android.permission.ACCESS_COARSE_LOCATION");
          }
          str = "android.permission.ACCESS_FINE_LOCATION";
          if (!d(paramContext, localArrayList, str)) {
            return localArrayList;
          }
          paramContext = str;
          break;
          if (d(paramContext, localArrayList, "android.permission.READ_CONTACTS")) {
            localArrayList.add("android.permission.READ_CONTACTS");
          }
          if (d(paramContext, localArrayList, "android.permission.WRITE_CONTACTS")) {
            localArrayList.add("android.permission.WRITE_CONTACTS");
          }
          str = "android.permission.GET_ACCOUNTS";
          if (!d(paramContext, localArrayList, str)) {
            return localArrayList;
          }
          paramContext = str;
        }
      }
      localArrayList.add(paramContext);
      break;
    case 1: 
      str = "android.permission.CAMERA";
      if (!d(paramContext, localArrayList, "android.permission.CAMERA")) {
        return localArrayList;
      }
      paramContext = str;
      break;
    }
    if (d(paramContext, localArrayList, "android.permission.WRITE_CALENDAR")) {
      localArrayList.add("android.permission.WRITE_CALENDAR");
    }
    str = "android.permission.READ_CALENDAR";
    if (d(paramContext, localArrayList, "android.permission.READ_CALENDAR"))
    {
      paramContext = str;
      label1095:
      localArrayList.add(paramContext);
    }
    return localArrayList;
  }
  
  public static boolean d(Context paramContext, ArrayList<String> paramArrayList, String paramString)
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
    paramArrayList = paramContext.getPackageManager();
    int i = Build.VERSION.SDK_INT;
    paramContext = paramContext.getPackageName();
    if (i >= 33) {
      paramContext = paramArrayList.getPackageInfo(paramContext, PackageManager.PackageInfoFlags.of(4096L));
    } else {
      paramContext = paramArrayList.getPackageInfo(paramContext, 4096);
    }
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
  
  public static Integer e(HashSet paramHashSet)
  {
    Integer localInteger = Integer.valueOf(4);
    if (paramHashSet.contains(localInteger)) {
      return localInteger;
    }
    if (paramHashSet.contains(Integer.valueOf(2))) {
      return Integer.valueOf(2);
    }
    if (paramHashSet.contains(Integer.valueOf(0))) {
      return Integer.valueOf(0);
    }
    if (paramHashSet.contains(Integer.valueOf(3))) {
      return Integer.valueOf(3);
    }
    return Integer.valueOf(1);
  }
  
  public static int f(Activity paramActivity, String paramString, int paramInt)
  {
    if (paramInt == -1) {
      return b(paramActivity, paramString);
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     e3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */