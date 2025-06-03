package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import io.flutter.embedding.android.FlutterActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class NoHistoryCustomTabsActivityCallbacks$1
  implements Application.ActivityLifecycleCallbacks
{
  public NoHistoryCustomTabsActivityCallbacks$1(NoHistoryCustomTabsActivityCallbacks paramNoHistoryCustomTabsActivityCallbacks) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    if ((paramActivity instanceof FlutterActivity))
    {
      paramActivity = this$0;
      Object localObject = plugin;
      if ((localObject != null) && (chromeSafariBrowserManager != null))
      {
        paramActivity = noHistoryBrowserIDs.values().iterator();
        while (paramActivity.hasNext())
        {
          localObject = (String)paramActivity.next();
          if (localObject != null)
          {
            this$0.noHistoryBrowserIDs.put(localObject, null);
            localObject = (ChromeCustomTabsActivity)this$0.plugin.chromeSafariBrowserManager.browsers.get(localObject);
            if (localObject != null)
            {
              ((ChromeCustomTabsActivity)localObject).close();
              ((ChromeCustomTabsActivity)localObject).dispose();
            }
          }
        }
      }
    }
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */