package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p.n;

public class ChromeSafariBrowserManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "ChromeBrowserManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_chromesafaribrowser";
  public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
  public final Map<String, ChromeCustomTabsActivity> browsers = new HashMap();
  public String id;
  public InAppWebViewFlutterPlugin plugin;
  
  public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_chromesafaribrowser"));
    String str = UUID.randomUUID().toString();
    id = str;
    plugin = paramInAppWebViewFlutterPlugin;
    shared.put(str, this);
  }
  
  public void dispose()
  {
    super.dispose();
    Iterator localIterator = browsers.values().iterator();
    while (localIterator.hasNext())
    {
      ChromeCustomTabsActivity localChromeCustomTabsActivity = (ChromeCustomTabsActivity)localIterator.next();
      if (localChromeCustomTabsActivity != null)
      {
        localChromeCustomTabsActivity.close();
        localChromeCustomTabsActivity.dispose();
      }
    }
    browsers.clear();
    shared.remove(id);
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject1 = (String)paramMethodCall.argument("id");
    Object localObject2 = method;
    localObject2.getClass();
    int i = ((String)localObject2).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 444517567: 
      if (((String)localObject2).equals("isAvailable")) {
        j = 3;
      }
      break;
    case 268490427: 
      if (((String)localObject2).equals("getPackageName")) {
        j = 2;
      }
      break;
    case 3417674: 
      if (((String)localObject2).equals("open")) {
        j = 1;
      }
      break;
    case -1382009261: 
      if (((String)localObject2).equals("getMaxToolbarItems")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 3: 
      paramMethodCall = plugin;
      if (paramMethodCall != null)
      {
        paramMethodCall = activity;
        if (paramMethodCall != null) {
          paramMethodCall = Boolean.valueOf(CustomTabActivityHelper.isAvailable(paramMethodCall));
        }
      }
      break;
    case 2: 
      localObject1 = plugin;
      if ((localObject1 != null) && (activity != null))
      {
        localObject1 = (ArrayList)paramMethodCall.argument("packages");
        paramMethodCall = (Boolean)paramMethodCall.argument("ignoreDefault");
        paramMethodCall = n.a(plugin.activity, (List)localObject1, paramMethodCall.booleanValue());
      }
      else
      {
        paramMethodCall = null;
      }
      break;
    case 1: 
      localObject2 = plugin;
      if ((localObject2 != null) && (activity != null))
      {
        String str1 = (String)paramMethodCall.argument("url");
        HashMap localHashMap1 = (HashMap)paramMethodCall.argument("headers");
        String str2 = (String)paramMethodCall.argument("referrer");
        ArrayList localArrayList = (ArrayList)paramMethodCall.argument("otherLikelyURLs");
        localObject2 = (HashMap)paramMethodCall.argument("settings");
        HashMap localHashMap2 = (HashMap)paramMethodCall.argument("actionButton");
        HashMap localHashMap3 = (HashMap)paramMethodCall.argument("secondaryToolbar");
        paramMethodCall = (List)paramMethodCall.argument("menuItemList");
        open(plugin.activity, (String)localObject1, str1, localHashMap1, str2, localArrayList, (HashMap)localObject2, localHashMap2, localHashMap3, paramMethodCall, paramResult);
        return;
      }
      paramMethodCall = Boolean.FALSE;
      break;
    }
    paramMethodCall = Integer.valueOf(5);
    paramResult.success(paramMethodCall);
  }
  
  public void open(Activity paramActivity, String paramString1, String paramString2, HashMap<String, Object> paramHashMap1, String paramString3, ArrayList<String> paramArrayList, HashMap<String, Object> paramHashMap2, HashMap<String, Object> paramHashMap3, HashMap<String, Object> paramHashMap4, List<HashMap<String, Object>> paramList, MethodChannel.Result paramResult)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString2);
    localBundle.putString("id", paramString1);
    localBundle.putString("managerId", id);
    localBundle.putSerializable("headers", paramHashMap1);
    localBundle.putString("referrer", paramString3);
    localBundle.putSerializable("otherLikelyURLs", paramArrayList);
    localBundle.putSerializable("settings", paramHashMap2);
    localBundle.putSerializable("actionButton", paramHashMap3);
    localBundle.putSerializable("secondaryToolbar", paramHashMap4);
    localBundle.putSerializable("menuItemList", (Serializable)paramList);
    paramString2 = Boolean.FALSE;
    paramString1 = (Boolean)Util.getOrDefault(paramHashMap2, "isSingleInstance", paramString2);
    paramHashMap1 = (Boolean)Util.getOrDefault(paramHashMap2, "isTrustedWebActivity", paramString2);
    if (CustomTabActivityHelper.isAvailable(paramActivity))
    {
      if (!paramString1.booleanValue())
      {
        if (!paramHashMap1.booleanValue()) {
          paramString1 = ChromeCustomTabsActivity.class;
        } else {
          paramString1 = TrustedWebActivity.class;
        }
      }
      else if (!paramHashMap1.booleanValue()) {
        paramString1 = ChromeCustomTabsActivitySingleInstance.class;
      } else {
        paramString1 = TrustedWebActivitySingleInstance.class;
      }
      paramString1 = new Intent(paramActivity, paramString1);
      paramString1.putExtras(localBundle);
      if (((Boolean)Util.getOrDefault(paramHashMap2, "noHistory", paramString2)).booleanValue()) {
        paramString1.addFlags(1073741824);
      }
      paramActivity.startActivity(paramString1);
      paramResult.success(Boolean.TRUE);
      return;
    }
    paramResult.error("ChromeBrowserManager", "ChromeCustomTabs is not available!", null);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeSafariBrowserManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */