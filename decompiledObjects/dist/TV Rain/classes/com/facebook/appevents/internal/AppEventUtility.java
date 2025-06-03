package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppEventUtility
{
  private static final String regex = "[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?";
  
  public static void assertIsMainThread() {}
  
  public static void assertIsNotMainThread() {}
  
  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayOfByte.length;
    for (int j = 0; j < i; j++) {
      localStringBuffer.append(String.format("%02x", new Object[] { Byte.valueOf(paramArrayOfByte[j]) }));
    }
    return localStringBuffer.toString();
  }
  
  public static String getAppVersion()
  {
    Object localObject = FacebookSdk.getApplicationContext();
    try
    {
      localObject = getPackageManagergetPackageInfogetPackageName0versionName;
      return (String)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException) {}
    return "";
  }
  
  @Nullable
  public static View getRootView(@Nullable Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class)) {
      return null;
    }
    if (paramActivity == null) {
      return null;
    }
    try
    {
      paramActivity = paramActivity.getWindow();
      if (paramActivity == null) {
        return null;
      }
      paramActivity = paramActivity.getDecorView().getRootView();
      return paramActivity;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, AppEventUtility.class);
    }
    return null;
  }
  
  public static boolean isEmulator()
  {
    String str = Build.FINGERPRINT;
    if ((!str.startsWith("generic")) && (!str.startsWith("unknown")))
    {
      str = Build.MODEL;
      if ((!str.contains("google_sdk")) && (!str.contains("Emulator")) && (!str.contains("Android SDK built for x86")) && (!Build.MANUFACTURER.contains("Genymotion")) && ((!Build.BRAND.startsWith("generic")) || (!Build.DEVICE.startsWith("generic"))) && (!"google_sdk".equals(Build.PRODUCT))) {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  private static boolean isMainThread()
  {
    boolean bool;
    if (Looper.myLooper() == Looper.getMainLooper()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static double normalizePrice(String paramString)
  {
    d1 = 0.0D;
    try
    {
      paramString = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(paramString);
      d2 = d1;
      if (paramString.find())
      {
        paramString = paramString.group(0);
        d2 = NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(paramString).doubleValue();
      }
    }
    catch (ParseException paramString)
    {
      for (;;)
      {
        double d2 = d1;
      }
    }
    return d2;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.AppEventUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */