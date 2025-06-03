package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p.n;
import p.o;
import p.o.d;
import v.a;

final class UrlLauncher
  implements Messages.UrlLauncherApi
{
  private static final String TAG = "UrlLauncher";
  private Activity activity;
  private final Context applicationContext;
  private final IntentResolver intentResolver;
  
  public UrlLauncher(Context paramContext)
  {
    this(paramContext, new c(paramContext));
  }
  
  public UrlLauncher(Context paramContext, IntentResolver paramIntentResolver)
  {
    applicationContext = paramContext;
    intentResolver = paramIntentResolver;
  }
  
  private static boolean containsRestrictedHeader(Map<String, String> paramMap)
  {
    paramMap = paramMap.keySet().iterator();
    boolean bool = paramMap.hasNext();
    int i = 0;
    if (bool)
    {
      String str = ((String)paramMap.next()).toLowerCase(Locale.US);
      str.getClass();
      switch (str.hashCode())
      {
      }
      do
      {
        do
        {
          do
          {
            do
            {
              i = -1;
              break;
            } while (!str.equals("accept-language"));
            i = 3;
            break;
          } while (!str.equals("content-type"));
          i = 2;
          break;
        } while (!str.equals("content-language"));
        i = 1;
        break;
      } while (!str.equals("accept"));
      switch (i)
      {
      }
      return true;
    }
    return false;
  }
  
  private void ensureActivity()
  {
    if (activity != null) {
      return;
    }
    throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
  }
  
  private static Bundle extractBundle(Map<String, String> paramMap)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localBundle.putString(str, (String)paramMap.get(str));
    }
    return localBundle;
  }
  
  private static boolean openCustomTab(Context paramContext, Uri paramUri, Bundle paramBundle, Messages.BrowserOptions paramBrowserOptions)
  {
    o.d locald = new o.d();
    int i = paramBrowserOptions.getShowTitle().booleanValue();
    a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", i);
    paramBrowserOptions = locald.a();
    a.putExtra("com.android.browser.headers", paramBundle);
    try
    {
      a.setData(paramUri);
      a.startActivity(paramContext, a, b);
      return true;
    }
    catch (ActivityNotFoundException paramContext) {}
    return false;
  }
  
  public Boolean canLaunchUrl(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    paramString = intentResolver.getHandlerComponentName(localIntent);
    if (paramString == null) {
      return Boolean.FALSE;
    }
    return Boolean.valueOf("{com.android.fallback/com.android.fallback.Fallback}".equals(paramString) ^ true);
  }
  
  public void closeWebView()
  {
    applicationContext.sendBroadcast(new Intent("close action"));
  }
  
  public Boolean launchUrl(String paramString, Map<String, String> paramMap)
  {
    ensureActivity();
    paramString = new Intent("android.intent.action.VIEW").setData(Uri.parse(paramString)).putExtra("com.android.browser.headers", extractBundle(paramMap));
    try
    {
      activity.startActivity(paramString);
      return Boolean.TRUE;
    }
    catch (ActivityNotFoundException paramString) {}
    return Boolean.FALSE;
  }
  
  public Boolean openUrlInApp(String paramString, Boolean paramBoolean, Messages.WebViewOptions paramWebViewOptions, Messages.BrowserOptions paramBrowserOptions)
  {
    ensureActivity();
    Bundle localBundle = extractBundle(paramWebViewOptions.getHeaders());
    if ((paramBoolean.booleanValue()) && (!containsRestrictedHeader(paramWebViewOptions.getHeaders())))
    {
      paramBoolean = Uri.parse(paramString);
      if (openCustomTab(activity, paramBoolean, localBundle, paramBrowserOptions)) {
        return Boolean.TRUE;
      }
    }
    paramString = WebViewActivity.createIntent(activity, paramString, paramWebViewOptions.getEnableJavaScript().booleanValue(), paramWebViewOptions.getEnableDomStorage().booleanValue(), localBundle);
    try
    {
      activity.startActivity(paramString);
      return Boolean.TRUE;
    }
    catch (ActivityNotFoundException paramString) {}
    return Boolean.FALSE;
  }
  
  public void setActivity(Activity paramActivity)
  {
    activity = paramActivity;
  }
  
  public Boolean supportsCustomTabs()
  {
    Context localContext = applicationContext;
    List localList = Collections.emptyList();
    boolean bool = false;
    if (n.a(localContext, localList, false) != null) {
      bool = true;
    }
    return Boolean.valueOf(bool);
  }
  
  public static abstract interface IntentResolver
  {
    public abstract String getHandlerComponentName(Intent paramIntent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.UrlLauncher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */