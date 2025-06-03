package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import java.util.Map;

public class ActionBroadcastReceiver
  extends BroadcastReceiver
{
  public static final String KEY_ACTION_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID";
  public static final String KEY_ACTION_MANAGER_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID";
  public static final String KEY_ACTION_VIEW_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID";
  public static final String KEY_URL_TITLE = "android.intent.extra.SUBJECT";
  public static final String LOG_TAG = "ActionBroadcastReceiver";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_CLICKED_ID", -1);
    paramContext = paramIntent.getDataString();
    if (paramContext != null)
    {
      Object localObject1 = paramIntent.getExtras();
      paramIntent = ((BaseBundle)localObject1).getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID");
      Object localObject2 = ((BaseBundle)localObject1).getString("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_MANAGER_ID");
      if (localObject2 != null)
      {
        localObject2 = (ChromeSafariBrowserManager)ChromeSafariBrowserManager.shared.get(localObject2);
        if (localObject2 != null) {
          if (i == -1)
          {
            i = ((BaseBundle)localObject1).getInt("com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID");
            localObject1 = ((BaseBundle)localObject1).getString("android.intent.extra.SUBJECT");
            paramIntent = (ChromeCustomTabsActivity)browsers.get(paramIntent);
            if (paramIntent != null)
            {
              paramIntent = channelDelegate;
              if (paramIntent != null) {
                paramIntent.onItemActionPerform(i, paramContext, (String)localObject1);
              }
            }
          }
          else
          {
            paramIntent = (ChromeCustomTabsActivity)browsers.get(paramIntent);
            if (paramIntent != null)
            {
              localObject1 = channelDelegate;
              if (localObject1 != null) {
                ((ChromeCustomTabsChannelDelegate)localObject1).onSecondaryItemActionPerform(paramIntent.getResources().getResourceName(i), paramContext);
              }
            }
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */