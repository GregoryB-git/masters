package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeadlessInAppWebViewManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "HeadlessInAppWebViewManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_headless_inappwebview";
  public InAppWebViewFlutterPlugin plugin;
  public final Map<String, HeadlessInAppWebView> webViews = new HashMap();
  
  public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_headless_inappwebview"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void dispose()
  {
    super.dispose();
    Iterator localIterator = webViews.values().iterator();
    while (localIterator.hasNext())
    {
      HeadlessInAppWebView localHeadlessInAppWebView = (HeadlessInAppWebView)localIterator.next();
      if (localHeadlessInAppWebView != null) {
        localHeadlessInAppWebView.dispose();
      }
    }
    webViews.clear();
    plugin = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str1 = (String)paramMethodCall.argument("id");
    String str2 = method;
    str2.getClass();
    if (!str2.equals("run"))
    {
      paramResult.notImplemented();
    }
    else
    {
      run(str1, (HashMap)paramMethodCall.argument("params"));
      paramResult.success(Boolean.TRUE);
    }
  }
  
  public void run(String paramString, HashMap<String, Object> paramHashMap)
  {
    InAppWebViewFlutterPlugin localInAppWebViewFlutterPlugin = plugin;
    if (localInAppWebViewFlutterPlugin != null)
    {
      Object localObject1 = activity;
      if ((localObject1 != null) || (applicationContext != null))
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = applicationContext;
        }
        localObject1 = new FlutterWebView(localInAppWebViewFlutterPlugin, (Context)localObject2, paramString, paramHashMap);
        localObject2 = new HeadlessInAppWebView(plugin, paramString, (FlutterWebView)localObject1);
        webViews.put(paramString, localObject2);
        ((HeadlessInAppWebView)localObject2).prepare(paramHashMap);
        ((HeadlessInAppWebView)localObject2).onWebViewCreated();
        ((FlutterWebView)localObject1).makeInitialLoad(paramHashMap);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */