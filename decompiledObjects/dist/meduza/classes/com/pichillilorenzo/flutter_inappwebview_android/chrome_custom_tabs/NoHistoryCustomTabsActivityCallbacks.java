package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import io.flutter.embedding.android.FlutterActivity;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NoHistoryCustomTabsActivityCallbacks
  implements Disposable
{
  public Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks()
  {
    public void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
    
    public void onActivityDestroyed(Activity paramAnonymousActivity) {}
    
    public void onActivityPaused(Activity paramAnonymousActivity) {}
    
    public void onActivityResumed(Activity paramAnonymousActivity)
    {
      if ((paramAnonymousActivity instanceof FlutterActivity))
      {
        paramAnonymousActivity = NoHistoryCustomTabsActivityCallbacks.this;
        Object localObject = plugin;
        if ((localObject != null) && (chromeSafariBrowserManager != null))
        {
          paramAnonymousActivity = noHistoryBrowserIDs.values().iterator();
          while (paramAnonymousActivity.hasNext())
          {
            localObject = (String)paramAnonymousActivity.next();
            if (localObject != null)
            {
              noHistoryBrowserIDs.put(localObject, null);
              localObject = (ChromeCustomTabsActivity)plugin.chromeSafariBrowserManager.browsers.get(localObject);
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
    
    public void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
    
    public void onActivityStarted(Activity paramAnonymousActivity) {}
    
    public void onActivityStopped(Activity paramAnonymousActivity) {}
  };
  public final Map<String, String> noHistoryBrowserIDs = new HashMap();
  public InAppWebViewFlutterPlugin plugin;
  
  public NoHistoryCustomTabsActivityCallbacks(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void dispose()
  {
    noHistoryBrowserIDs.clear();
    plugin = null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.NoHistoryCustomTabsActivityCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */