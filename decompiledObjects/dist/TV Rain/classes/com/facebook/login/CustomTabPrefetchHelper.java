package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;

public class CustomTabPrefetchHelper
  extends CustomTabsServiceConnection
{
  private static CustomTabsClient client;
  private static CustomTabsSession session;
  
  public static CustomTabsSession getPreparedSessionOnce()
  {
    CustomTabsSession localCustomTabsSession = session;
    session = null;
    return localCustomTabsSession;
  }
  
  public static void mayLaunchUrl(Uri paramUri)
  {
    if (session == null) {
      prepareSession();
    }
    CustomTabsSession localCustomTabsSession = session;
    if (localCustomTabsSession != null) {
      localCustomTabsSession.mayLaunchUrl(paramUri, null, null);
    }
  }
  
  private static void prepareSession()
  {
    if (session == null)
    {
      CustomTabsClient localCustomTabsClient = client;
      if (localCustomTabsClient != null) {
        session = localCustomTabsClient.newSession(null);
      }
    }
  }
  
  public void onCustomTabsServiceConnected(ComponentName paramComponentName, CustomTabsClient paramCustomTabsClient)
  {
    client = paramCustomTabsClient;
    paramCustomTabsClient.warmup(0L);
    prepareSession();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}

/* Location:
 * Qualified Name:     com.facebook.login.CustomTabPrefetchHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */