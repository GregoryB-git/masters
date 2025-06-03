package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CustomTabUtils
{
  private static final String[] CHROME_PACKAGES = { "com.android.chrome", "com.chrome.beta", "com.chrome.dev" };
  
  public static String getChromePackage()
  {
    if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
      return null;
    }
    try
    {
      Object localObject1 = FacebookSdk.getApplicationContext();
      Object localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("android.support.customtabs.action.CustomTabsService");
      localObject2 = ((Context)localObject1).getPackageManager().queryIntentServices((Intent)localObject2, 0);
      if (localObject2 != null)
      {
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>(Arrays.asList(CHROME_PACKAGES));
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          ServiceInfo localServiceInfo = nextserviceInfo;
          if ((localServiceInfo != null) && (((HashSet)localObject1).contains(packageName)))
          {
            localObject1 = packageName;
            return (String)localObject1;
          }
        }
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CustomTabUtils.class);
    }
    return null;
  }
  
  public static String getDefaultRedirectURI()
  {
    if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
      return null;
    }
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("fbconnect://cct.");
      ((StringBuilder)localObject).append(FacebookSdk.getApplicationContext().getPackageName());
      localObject = ((StringBuilder)localObject).toString();
      return (String)localObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, CustomTabUtils.class);
    }
    return null;
  }
  
  public static String getValidRedirectURI(String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(CustomTabUtils.class)) {
      return null;
    }
    try
    {
      if (Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), paramString)) {
        return paramString;
      }
      if (Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext(), getDefaultRedirectURI())) {
        return getDefaultRedirectURI();
      }
      return "";
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, CustomTabUtils.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.CustomTabUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */