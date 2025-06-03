package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebStorage.Origin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyWebStorage
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "MyWebStorage";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
  public static WebStorage webStorageManager;
  public InAppWebViewFlutterPlugin plugin;
  
  public MyWebStorage(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public static void init()
  {
    if (webStorageManager == null) {
      webStorageManager = WebStorage.getInstance();
    }
  }
  
  public void dispose()
  {
    super.dispose();
    plugin = null;
  }
  
  public void getOrigins(final MethodChannel.Result paramResult)
  {
    WebStorage localWebStorage = webStorageManager;
    if (localWebStorage == null)
    {
      paramResult.success(new ArrayList());
      return;
    }
    localWebStorage.getOrigins(new ValueCallback()
    {
      public void onReceiveValue(Map paramAnonymousMap)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = paramAnonymousMap.keySet().iterator();
        while (localIterator.hasNext())
        {
          WebStorage.Origin localOrigin = (WebStorage.Origin)paramAnonymousMap.get(localIterator.next());
          HashMap localHashMap = new HashMap();
          localHashMap.put("origin", localOrigin.getOrigin());
          localHashMap.put("quota", Long.valueOf(localOrigin.getQuota()));
          localHashMap.put("usage", Long.valueOf(localOrigin.getUsage()));
          localArrayList.add(localHashMap);
        }
        paramResult.success(localArrayList);
      }
    });
  }
  
  public void getQuotaForOrigin(String paramString, final MethodChannel.Result paramResult)
  {
    WebStorage localWebStorage = webStorageManager;
    if (localWebStorage == null)
    {
      paramResult.success(Integer.valueOf(0));
      return;
    }
    localWebStorage.getQuotaForOrigin(paramString, new ValueCallback()
    {
      public void onReceiveValue(Long paramAnonymousLong)
      {
        paramResult.success(paramAnonymousLong);
      }
    });
  }
  
  public void getUsageForOrigin(String paramString, final MethodChannel.Result paramResult)
  {
    WebStorage localWebStorage = webStorageManager;
    if (localWebStorage == null)
    {
      paramResult.success(Integer.valueOf(0));
      return;
    }
    localWebStorage.getUsageForOrigin(paramString, new ValueCallback()
    {
      public void onReceiveValue(Long paramAnonymousLong)
      {
        paramResult.success(paramAnonymousLong);
      }
    });
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    init();
    String str = method;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 843309476: 
      if (str.equals("getUsageForOrigin")) {
        j = 4;
      }
      break;
    case -165580329: 
      if (str.equals("getOrigins")) {
        j = 3;
      }
      break;
    case -876677967: 
      if (str.equals("deleteOrigin")) {
        j = 2;
      }
      break;
    case -1117417280: 
      if (str.equals("deleteAllData")) {
        j = 1;
      }
      break;
    case -1308548435: 
      if (str.equals("getQuotaForOrigin")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 4: 
      getUsageForOrigin((String)paramMethodCall.argument("origin"), paramResult);
      break;
    case 3: 
      getOrigins(paramResult);
      break;
    case 2: 
      if (webStorageManager != null)
      {
        paramMethodCall = (String)paramMethodCall.argument("origin");
        webStorageManager.deleteOrigin(paramMethodCall);
      }
      break;
    case 1: 
      paramMethodCall = webStorageManager;
      if (paramMethodCall != null)
      {
        paramMethodCall.deleteAllData();
        paramMethodCall = Boolean.TRUE;
      }
      else
      {
        paramMethodCall = Boolean.FALSE;
      }
      paramResult.success(paramMethodCall);
      break;
    }
    getQuotaForOrigin((String)paramMethodCall.argument("origin"), paramResult);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */