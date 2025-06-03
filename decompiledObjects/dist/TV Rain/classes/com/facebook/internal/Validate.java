package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import z2;

public final class Validate
{
  private static final String CONTENT_PROVIDER_BASE = "com.facebook.app.FacebookContentProvider";
  private static final String CONTENT_PROVIDER_NOT_FOUND_REASON = "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.";
  public static final String CUSTOM_TAB_REDIRECT_URI_PREFIX = "fbconnect://cct.";
  private static final String FACEBOOK_ACTIVITY_NOT_FOUND_REASON = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
  private static final String NO_INTERNET_PERMISSION_REASON = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
  private static final String TAG = "com.facebook.internal.Validate";
  
  public static void containsNoNullOrEmpty(Collection<String> paramCollection, String paramString)
  {
    notNull(paramCollection, paramString);
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (String)localIterator.next();
      if (paramCollection != null)
      {
        if (paramCollection.length() == 0) {
          throw new IllegalArgumentException(z2.p("Container '", paramString, "' cannot contain empty values"));
        }
      }
      else {
        throw new NullPointerException(z2.p("Container '", paramString, "' cannot contain null values"));
      }
    }
  }
  
  public static <T> void containsNoNulls(Collection<T> paramCollection, String paramString)
  {
    notNull(paramCollection, paramString);
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (paramCollection.next() == null) {
        throw new NullPointerException(z2.p("Container '", paramString, "' cannot contain null values"));
      }
    }
  }
  
  public static String hasAppID()
  {
    String str = FacebookSdk.getApplicationId();
    if (str != null) {
      return str;
    }
    throw new IllegalStateException("No App ID found, please set the App ID.");
  }
  
  public static boolean hasBluetoothPermission(Context paramContext)
  {
    boolean bool;
    if ((hasPermission(paramContext, "android.permission.BLUETOOTH")) && (hasPermission(paramContext, "android.permission.BLUETOOTH_ADMIN"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean hasChangeWifiStatePermission(Context paramContext)
  {
    return hasPermission(paramContext, "android.permission.CHANGE_WIFI_STATE");
  }
  
  public static String hasClientToken()
  {
    String str = FacebookSdk.getClientToken();
    if (str != null) {
      return str;
    }
    throw new IllegalStateException("No Client Token found, please set the Client Token.");
  }
  
  public static void hasContentProvider(Context paramContext)
  {
    notNull(paramContext, "context");
    String str = hasAppID();
    paramContext = paramContext.getPackageManager();
    if (paramContext != null)
    {
      str = z2.o("com.facebook.app.FacebookContentProvider", str);
      if (paramContext.resolveContentProvider(str, 0) == null) {
        throw new IllegalStateException(String.format("A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", new Object[] { str }));
      }
    }
  }
  
  public static boolean hasCustomTabRedirectActivity(Context paramContext, String paramString)
  {
    notNull(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject;
    if (localPackageManager != null)
    {
      localObject = new Intent();
      ((Intent)localObject).setAction("android.intent.action.VIEW");
      ((Intent)localObject).addCategory("android.intent.category.DEFAULT");
      ((Intent)localObject).addCategory("android.intent.category.BROWSABLE");
      ((Intent)localObject).setData(Uri.parse(paramString));
      paramString = localPackageManager.queryIntentActivities((Intent)localObject, 64);
    }
    else
    {
      paramString = null;
    }
    boolean bool = false;
    if (paramString != null)
    {
      paramString = paramString.iterator();
      bool = false;
      while (paramString.hasNext())
      {
        localObject = nextactivityInfo;
        if ((name.equals("com.facebook.CustomTabActivity")) && (packageName.equals(paramContext.getPackageName()))) {
          bool = true;
        } else {
          return false;
        }
      }
    }
    return bool;
  }
  
  public static void hasFacebookActivity(Context paramContext)
  {
    hasFacebookActivity(paramContext, true);
  }
  
  public static void hasFacebookActivity(Context paramContext, boolean paramBoolean)
  {
    notNull(paramContext, "context");
    PackageManager localPackageManager = paramContext.getPackageManager();
    if (localPackageManager != null) {
      paramContext = new ComponentName(paramContext, "com.facebook.FacebookActivity");
    }
    try
    {
      paramContext = localPackageManager.getActivityInfo(paramContext, 1);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;) {}
    }
    paramContext = null;
    if (paramContext == null) {
      if (!paramBoolean) {
        Log.w(TAG, "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      } else {
        throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
      }
    }
  }
  
  public static void hasInternetPermissions(Context paramContext)
  {
    hasInternetPermissions(paramContext, true);
  }
  
  public static void hasInternetPermissions(Context paramContext, boolean paramBoolean)
  {
    notNull(paramContext, "context");
    if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
      if (!paramBoolean) {
        Log.w(TAG, "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
      } else {
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
      }
    }
  }
  
  public static boolean hasLocationPermission(Context paramContext)
  {
    boolean bool;
    if ((!hasPermission(paramContext, "android.permission.ACCESS_COARSE_LOCATION")) && (!hasPermission(paramContext, "android.permission.ACCESS_FINE_LOCATION"))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static boolean hasPermission(Context paramContext, String paramString)
  {
    boolean bool;
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean hasWiFiPermission(Context paramContext)
  {
    return hasPermission(paramContext, "android.permission.ACCESS_WIFI_STATE");
  }
  
  public static <T> void notEmpty(Collection<T> paramCollection, String paramString)
  {
    if (!paramCollection.isEmpty()) {
      return;
    }
    throw new IllegalArgumentException(z2.p("Container '", paramString, "' cannot be empty"));
  }
  
  public static <T> void notEmptyAndContainsNoNulls(Collection<T> paramCollection, String paramString)
  {
    containsNoNulls(paramCollection, paramString);
    notEmpty(paramCollection, paramString);
  }
  
  public static void notNull(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException(z2.p("Argument '", paramString, "' cannot be null"));
  }
  
  public static void notNullOrEmpty(String paramString1, String paramString2)
  {
    if (!Utility.isNullOrEmpty(paramString1)) {
      return;
    }
    throw new IllegalArgumentException(z2.p("Argument '", paramString2, "' cannot be null or empty"));
  }
  
  public static void oneOf(Object paramObject, String paramString, Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramVarArgs[j];
      if (localObject != null)
      {
        if (!localObject.equals(paramObject)) {}
      }
      else if (paramObject == null) {
        return;
      }
    }
    throw new IllegalArgumentException(z2.p("Argument '", paramString, "' was not one of the allowed values"));
  }
  
  public static void runningOnUiThread()
  {
    if (Looper.getMainLooper().equals(Looper.myLooper())) {
      return;
    }
    throw new FacebookException("This method should be called from the UI thread");
  }
  
  public static void sdkInitialized()
  {
    if (FacebookSdk.isInitialized()) {
      return;
    }
    throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.Validate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */