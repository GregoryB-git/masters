package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsSession;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.CustomTabPrefetchHelper;

public class CustomTab
{
  private Uri uri;
  
  public CustomTab(String paramString, Bundle paramBundle)
  {
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    uri = getURIForAction(paramString, localBundle);
  }
  
  public static Uri getURIForAction(String paramString, Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(CustomTab.class)) {
      return null;
    }
    try
    {
      String str = ServerProtocol.getDialogAuthority();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append(FacebookSdk.getGraphApiVersion());
      localStringBuilder.append("/");
      localStringBuilder.append("dialog/");
      localStringBuilder.append(paramString);
      paramString = Utility.buildUri(str, localStringBuilder.toString(), paramBundle);
      return paramString;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramString, CustomTab.class);
    }
    return null;
  }
  
  public boolean openCustomTab(Activity paramActivity, String paramString)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      Object localObject = CustomTabPrefetchHelper.getPreparedSessionOnce();
      CustomTabsIntent.Builder localBuilder = new androidx/browser/customtabs/CustomTabsIntent$Builder;
      localBuilder.<init>((CustomTabsSession)localObject);
      localObject = localBuilder.build();
      intent.setPackage(paramString);
      intent.addFlags(1073741824);
      try
      {
        ((CustomTabsIntent)localObject).launchUrl(paramActivity, uri);
        return true;
      }
      catch (ActivityNotFoundException paramActivity)
      {
        return false;
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.CustomTab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */