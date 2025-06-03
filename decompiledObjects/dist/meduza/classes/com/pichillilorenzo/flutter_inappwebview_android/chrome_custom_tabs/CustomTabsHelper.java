package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomTabsHelper
{
  public static final String BETA_PACKAGE = "com.chrome.beta";
  public static final String DEV_PACKAGE = "com.chrome.dev";
  public static final String EXTRA_CUSTOM_TABS_KEEP_ALIVE = "android.support.customtabs.extra.KEEP_ALIVE";
  public static final String LOCAL_PACKAGE = "com.google.android.apps.chrome";
  public static final String STABLE_PACKAGE = "com.android.chrome";
  public static final String TAG = "CustomTabsHelper";
  private static String sPackageNameToUse;
  
  public static void addKeepAliveExtra(Context paramContext, Intent paramIntent)
  {
    paramIntent.putExtra("android.support.customtabs.extra.KEEP_ALIVE", new Intent().setClassName(paramContext.getPackageName(), KeepAliveService.class.getCanonicalName()));
  }
  
  public static String getPackageNameToUse(Context paramContext)
  {
    Object localObject1 = sPackageNameToUse;
    if (localObject1 != null) {
      return (String)localObject1;
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
    localIntent.addCategory("android.intent.category.BROWSABLE");
    localObject1 = localPackageManager.resolveActivity(localIntent, 0);
    if (localObject1 != null) {
      localObject1 = activityInfo.packageName;
    } else {
      localObject1 = null;
    }
    Object localObject2 = localPackageManager.queryIntentActivities(localIntent, 131072);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = ((List)localObject2).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      localObject2 = new Intent();
      ((Intent)localObject2).setAction("android.support.customtabs.action.CustomTabsService");
      ((Intent)localObject2).setPackage(activityInfo.packageName);
      if (localPackageManager.resolveService((Intent)localObject2, 0) != null) {
        localArrayList.add(activityInfo.packageName);
      }
    }
    if (localArrayList.isEmpty())
    {
      sPackageNameToUse = null;
    }
    else
    {
      if (localArrayList.size() == 1) {
        paramContext = (String)localArrayList.get(0);
      }
      do
      {
        sPackageNameToUse = paramContext;
        break;
        if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (!hasSpecializedHandlerIntents(paramContext, localIntent)) && (localArrayList.contains(localObject1)))
        {
          sPackageNameToUse = (String)localObject1;
          break;
        }
        paramContext = "com.android.chrome";
      } while (localArrayList.contains("com.android.chrome"));
      do
      {
        do
        {
          do
          {
            paramContext = "com.chrome.beta";
          } while (localArrayList.contains("com.chrome.beta"));
          paramContext = "com.chrome.dev";
        } while (localArrayList.contains("com.chrome.dev"));
        paramContext = "com.google.android.apps.chrome";
      } while (localArrayList.contains("com.google.android.apps.chrome"));
    }
    return sPackageNameToUse;
  }
  
  public static String[] getPackages()
  {
    return new String[] { "", "com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome" };
  }
  
  private static boolean hasSpecializedHandlerIntents(Context paramContext, Intent paramIntent)
  {
    try
    {
      paramContext = paramContext.getPackageManager().queryIntentActivities(paramIntent, 64);
      if ((paramContext != null) && (paramContext.size() != 0)) {
        paramContext = paramContext.iterator();
      }
      while (paramContext.hasNext())
      {
        paramIntent = (ResolveInfo)paramContext.next();
        IntentFilter localIntentFilter = filter;
        if ((localIntentFilter != null) && (localIntentFilter.countDataAuthorities() != 0) && (localIntentFilter.countDataPaths() != 0))
        {
          paramIntent = activityInfo;
          if (paramIntent != null)
          {
            return true;
            return false;
          }
        }
      }
    }
    catch (RuntimeException paramContext)
    {
      Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabsHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */