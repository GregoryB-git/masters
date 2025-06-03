package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.FrameLayout.LayoutParams;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.PlatformWebView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.b;

public class FlutterWebView
  implements PlatformWebView
{
  public static final String LOG_TAG = "IAWFlutterWebView";
  public String keepAliveId;
  public PullToRefreshLayout pullToRefreshLayout;
  public InAppWebView webView;
  
  public FlutterWebView(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, Context paramContext, Object paramObject, HashMap<String, Object> paramHashMap)
  {
    DisplayListenerProxy localDisplayListenerProxy = new DisplayListenerProxy();
    DisplayManager localDisplayManager = (DisplayManager)paramContext.getSystemService("display");
    localDisplayListenerProxy.onPreWebViewInitialization(localDisplayManager);
    keepAliveId = ((String)paramHashMap.get("keepAliveId"));
    Object localObject = (Map)paramHashMap.get("initialSettings");
    Map localMap1 = (Map)paramHashMap.get("contextMenu");
    Integer localInteger = (Integer)paramHashMap.get("windowId");
    List localList = (List)paramHashMap.get("initialUserScripts");
    Map localMap2 = (Map)paramHashMap.get("pullToRefreshSettings");
    InAppWebViewSettings localInAppWebViewSettings = new InAppWebViewSettings();
    localInAppWebViewSettings.parse((Map)localObject);
    localObject = new ArrayList();
    if (localList != null)
    {
      paramHashMap = localList.iterator();
      while (paramHashMap.hasNext()) {
        ((ArrayList)localObject).add(UserScript.fromMap((Map)paramHashMap.next()));
      }
    }
    if (useHybridComposition.booleanValue()) {
      paramHashMap = null;
    } else {
      paramHashMap = flutterView;
    }
    webView = new InAppWebView(paramContext, paramInAppWebViewFlutterPlugin, paramObject, localInteger, localInAppWebViewSettings, localMap1, paramHashMap, (List)localObject);
    localDisplayListenerProxy.onPostWebViewInitialization(localDisplayManager);
    webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    paramHashMap = new PullToRefreshSettings();
    paramHashMap.parse(localMap2);
    paramContext = new PullToRefreshLayout(paramContext, paramInAppWebViewFlutterPlugin, paramObject, paramHashMap);
    pullToRefreshLayout = paramContext;
    paramContext.addView(webView);
    pullToRefreshLayout.prepare();
    paramInAppWebViewFlutterPlugin = new FindInteractionController(webView, paramInAppWebViewFlutterPlugin, paramObject, null);
    webView.findInteractionController = paramInAppWebViewFlutterPlugin;
    paramInAppWebViewFlutterPlugin.prepare();
    webView.prepare();
  }
  
  public void dispose()
  {
    if (keepAliveId == null)
    {
      Object localObject = webView;
      if (localObject != null)
      {
        ((InAppWebView)localObject).dispose();
        webView = null;
        localObject = pullToRefreshLayout;
        if (localObject != null)
        {
          ((PullToRefreshLayout)localObject).dispose();
          pullToRefreshLayout = null;
        }
      }
    }
  }
  
  public View getView()
  {
    Object localObject = pullToRefreshLayout;
    if (localObject == null) {
      localObject = webView;
    }
    return (View)localObject;
  }
  
  public void makeInitialLoad(HashMap<String, Object> paramHashMap)
  {
    if (webView == null) {
      return;
    }
    Object localObject1 = (Integer)paramHashMap.get("windowId");
    Object localObject2 = (Map)paramHashMap.get("initialUrlRequest");
    String str1 = (String)paramHashMap.get("initialFile");
    paramHashMap = (Map)paramHashMap.get("initialData");
    if (localObject1 != null)
    {
      paramHashMap = webView.plugin;
      if (paramHashMap != null)
      {
        paramHashMap = inAppWebViewManager;
        if (paramHashMap != null)
        {
          paramHashMap = (Message)windowWebViewMessages.get(localObject1);
          if (paramHashMap != null)
          {
            ((WebView.WebViewTransport)obj).setWebView(webView);
            paramHashMap.sendToTarget();
            if (b.c0("DOCUMENT_START_SCRIPT")) {
              webView.post(new Runnable()
              {
                public void run()
                {
                  InAppWebView localInAppWebView = webView;
                  if (localInAppWebView != null) {
                    localInAppWebView.prepareAndAddUserScripts();
                  }
                }
              });
            }
          }
        }
      }
    }
    else if (str1 != null)
    {
      try
      {
        webView.loadFile(str1);
      }
      catch (IOException paramHashMap)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append(str1);
        ((StringBuilder)localObject1).append(" asset file cannot be found!");
        Log.e("IAWFlutterWebView", ((StringBuilder)localObject1).toString(), paramHashMap);
      }
    }
    else if (paramHashMap != null)
    {
      localObject1 = (String)paramHashMap.get("data");
      localObject2 = (String)paramHashMap.get("mimeType");
      str1 = (String)paramHashMap.get("encoding");
      String str2 = (String)paramHashMap.get("baseUrl");
      paramHashMap = (String)paramHashMap.get("historyUrl");
      webView.loadDataWithBaseURL(str2, (String)localObject1, (String)localObject2, str1, paramHashMap);
    }
    else if (localObject2 != null)
    {
      paramHashMap = URLRequest.fromMap((Map)localObject2);
      if (paramHashMap != null) {
        webView.loadUrl(paramHashMap);
      }
    }
  }
  
  public void onFlutterViewAttached(View paramView)
  {
    InAppWebView localInAppWebView = webView;
    if ((localInAppWebView != null) && (!customSettings.useHybridComposition.booleanValue())) {
      webView.setContainerView(paramView);
    }
  }
  
  public void onFlutterViewDetached()
  {
    InAppWebView localInAppWebView = webView;
    if ((localInAppWebView != null) && (!customSettings.useHybridComposition.booleanValue())) {
      webView.setContainerView(null);
    }
  }
  
  public void onInputConnectionLocked()
  {
    InAppWebView localInAppWebView = webView;
    if ((localInAppWebView != null) && (inAppBrowserDelegate == null) && (!customSettings.useHybridComposition.booleanValue())) {
      webView.lockInputConnection();
    }
  }
  
  public void onInputConnectionUnlocked()
  {
    InAppWebView localInAppWebView = webView;
    if ((localInAppWebView != null) && (inAppBrowserDelegate == null) && (!customSettings.useHybridComposition.booleanValue())) {
      webView.unlockInputConnection();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */