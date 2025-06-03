package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import c2.k;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import d2.a;
import d2.a.f;
import d2.i0;
import d2.j0.b;
import d2.k0;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import x6.b;

public class WebViewChannelDelegate
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "WebViewChannelDelegate";
  private InAppWebView webView;
  
  public WebViewChannelDelegate(InAppWebView paramInAppWebView, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    webView = paramInAppWebView;
  }
  
  public void dispose()
  {
    super.dispose();
    webView = null;
  }
  
  public void onCallJsHandler(String paramString1, String paramString2, CallJsHandlerCallback paramCallJsHandlerCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramCallJsHandlerCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("handlerName", paramString1);
    localHashMap.put("args", paramString2);
    localMethodChannel.invokeMethod("onCallJsHandler", localHashMap, paramCallJsHandlerCallback);
  }
  
  public void onCloseWindow()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onCloseWindow", new HashMap());
  }
  
  public void onConsoleMessage(String paramString, int paramInt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("message", paramString);
    localHashMap.put("messageLevel", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onConsoleMessage", localHashMap);
  }
  
  public void onContextMenuActionItemClicked(int paramInt, String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("id", Integer.valueOf(paramInt));
    localHashMap.put("androidId", Integer.valueOf(paramInt));
    localHashMap.put("iosId", null);
    localHashMap.put("title", paramString);
    localMethodChannel.invokeMethod("onContextMenuActionItemClicked", localHashMap);
  }
  
  public void onCreateContextMenu(HitTestResult paramHitTestResult)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onCreateContextMenu", paramHitTestResult.toMap());
  }
  
  public void onCreateWindow(CreateWindowAction paramCreateWindowAction, CreateWindowCallback paramCreateWindowCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramCreateWindowCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("onCreateWindow", paramCreateWindowAction.toMap(), paramCreateWindowCallback);
  }
  
  public void onDownloadStartRequest(DownloadStartRequest paramDownloadStartRequest)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onDownloadStartRequest", paramDownloadStartRequest.toMap());
  }
  
  public void onEnterFullscreen()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onEnterFullscreen", new HashMap());
  }
  
  public void onExitFullscreen()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onExitFullscreen", new HashMap());
  }
  
  @Deprecated
  public void onFindResultReceived(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("activeMatchOrdinal", Integer.valueOf(paramInt1));
    localHashMap.put("numberOfMatches", Integer.valueOf(paramInt2));
    localHashMap.put("isDoneCounting", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onFindResultReceived", localHashMap);
  }
  
  public void onFormResubmission(String paramString, FormResubmissionCallback paramFormResubmissionCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramFormResubmissionCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onFormResubmission", localHashMap, paramFormResubmissionCallback);
  }
  
  public void onGeolocationPermissionsHidePrompt()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onGeolocationPermissionsHidePrompt", new HashMap());
  }
  
  public void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissionsShowPromptCallback paramGeolocationPermissionsShowPromptCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramGeolocationPermissionsShowPromptCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("origin", paramString);
    localMethodChannel.invokeMethod("onGeolocationPermissionsShowPrompt", localHashMap, paramGeolocationPermissionsShowPromptCallback);
  }
  
  public void onHideContextMenu()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onHideContextMenu", new HashMap());
  }
  
  public void onJsAlert(String paramString1, String paramString2, Boolean paramBoolean, JsAlertCallback paramJsAlertCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramJsAlertCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString1);
    localHashMap.put("message", paramString2);
    localHashMap.put("isMainFrame", paramBoolean);
    localMethodChannel.invokeMethod("onJsAlert", localHashMap, paramJsAlertCallback);
  }
  
  public void onJsBeforeUnload(String paramString1, String paramString2, JsBeforeUnloadCallback paramJsBeforeUnloadCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramJsBeforeUnloadCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString1);
    localHashMap.put("message", paramString2);
    localMethodChannel.invokeMethod("onJsBeforeUnload", localHashMap, paramJsBeforeUnloadCallback);
  }
  
  public void onJsConfirm(String paramString1, String paramString2, Boolean paramBoolean, JsConfirmCallback paramJsConfirmCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramJsConfirmCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString1);
    localHashMap.put("message", paramString2);
    localHashMap.put("isMainFrame", paramBoolean);
    localMethodChannel.invokeMethod("onJsConfirm", localHashMap, paramJsConfirmCallback);
  }
  
  public void onJsPrompt(String paramString1, String paramString2, String paramString3, Boolean paramBoolean, JsPromptCallback paramJsPromptCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramJsPromptCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString1);
    localHashMap.put("message", paramString2);
    localHashMap.put("defaultValue", paramString3);
    localHashMap.put("isMainFrame", paramBoolean);
    localMethodChannel.invokeMethod("onJsPrompt", localHashMap, paramJsPromptCallback);
  }
  
  public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt paramWebResourceRequestExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("request", paramWebResourceRequestExt.toMap());
    return (CustomSchemeResponse)Util.invokeMethodAndWaitResult(localMethodChannel, "onLoadResourceWithCustomScheme", localHashMap, new SyncLoadResourceWithCustomSchemeCallback());
  }
  
  public void onLoadResourceWithCustomScheme(WebResourceRequestExt paramWebResourceRequestExt, LoadResourceWithCustomSchemeCallback paramLoadResourceWithCustomSchemeCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramLoadResourceWithCustomSchemeCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("request", paramWebResourceRequestExt.toMap());
    localMethodChannel.invokeMethod("onLoadResourceWithCustomScheme", localHashMap, paramLoadResourceWithCustomSchemeCallback);
  }
  
  public void onLoadStart(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onLoadStart", localHashMap);
  }
  
  public void onLoadStop(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onLoadStop", localHashMap);
  }
  
  public void onLongPressHitTestResult(HitTestResult paramHitTestResult)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onLongPressHitTestResult", paramHitTestResult.toMap());
  }
  
  public void onMethodCall(MethodCall paramMethodCall, final MethodChannel.Result paramResult)
  {
    try
    {
      Object localObject1 = WebViewChannelDelegateMethods.valueOf(method);
      int i = 8.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[localObject1.ordinal()];
      boolean bool = true;
      Object localObject2;
      Object localObject3;
      Object localObject4;
      switch (i)
      {
      default: 
        break;
      case 74: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearFormData();
        }
        break;
      case 73: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          bool = paramMethodCall.isInFullscreen();
        }
        break;
      case 72: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          bool = paramMethodCall.canScrollHorizontally();
        }
        break;
      case 71: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          bool = paramMethodCall.canScrollVertically();
        }
        break;
      case 70: 
        if (webView != null)
        {
          paramMethodCall = (Map)paramMethodCall.argument("webMessageListener");
          localObject1 = webView;
          paramMethodCall = WebMessageListener.fromMap((InAppWebViewInterface)localObject1, getPluginmessenger, paramMethodCall);
          if ((!(webView instanceof InAppWebView)) || (!b.c0("WEB_MESSAGE_LISTENER"))) {}
        }
      case 69: 
        for (;;)
        {
          try
          {
            webView.addWebMessageListener(paramMethodCall);
            paramMethodCall = Boolean.TRUE;
            paramResult.success(paramMethodCall);
          }
          catch (Exception paramMethodCall)
          {
            break;
          }
          if ((webView == null) || (!b.c0("POST_WEB_MESSAGE"))) {
            break label2942;
          }
          localObject1 = WebMessageCompatExt.fromMap((Map)paramMethodCall.argument("message"));
          localObject2 = (String)paramMethodCall.argument("targetOrigin");
          localObject3 = new ArrayList();
          paramMethodCall = ((WebMessageCompatExt)localObject1).getPorts();
          if (paramMethodCall != null)
          {
            Iterator localIterator = paramMethodCall.iterator();
            while (localIterator.hasNext())
            {
              paramMethodCall = (WebMessagePortCompatExt)localIterator.next();
              localObject4 = (WebMessageChannel)webView.getWebMessageChannels().get(paramMethodCall.getWebMessageChannelId());
              if ((localObject4 != null) && ((webView instanceof InAppWebView))) {
                ((ArrayList)localObject3).add((k)compatPorts.get(paramMethodCall.getIndex()));
              }
            }
          }
          localObject4 = ((WebMessageCompatExt)localObject1).getData();
          if (!(webView instanceof InAppWebView)) {
            break label3019;
          }
          if ((b.c0("WEB_MESSAGE_ARRAY_BUFFER")) && (localObject4 != null) && (((WebMessageCompatExt)localObject1).getType() == 1))
          {
            localObject1 = webView;
            paramMethodCall = new c2/j;
            paramMethodCall.<init>((byte[])localObject4, (k[])((ArrayList)localObject3).toArray(new k[0]));
          }
          for (;;)
          {
            localObject2 = Uri.parse((String)localObject2);
            break;
            localObject1 = webView;
            if (localObject4 != null) {
              paramMethodCall = localObject4.toString();
            } else {
              paramMethodCall = null;
            }
            paramMethodCall = new c2.j(paramMethodCall, (k[])((ArrayList)localObject3).toArray(new k[0]));
          }
          p.d((InAppWebView)localObject1, paramMethodCall, (Uri)localObject2);
          paramMethodCall = Boolean.TRUE;
        }
        paramResult.error("WebViewChannelDelegate", paramMethodCall.getMessage(), null);
        break;
      case 68: 
        if ((webView != null) && (b.c0("CREATE_WEB_MESSAGE_CHANNEL"))) {
          paramMethodCall = webView.createCompatWebMessageChannel().toMap();
        }
        break;
      case 67: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.isSecureContext(new ValueCallback()
          {
            public void onReceiveValue(Boolean paramAnonymousBoolean)
            {
              paramResult.success(paramAnonymousBoolean);
            }
          });
        }
        break;
      case 66: 
        if (webView != null)
        {
          localObject2 = (String)paramMethodCall.argument("functionBody");
          localObject1 = (Map)paramMethodCall.argument("arguments");
          paramMethodCall = ContentWorld.fromMap((Map)paramMethodCall.argument("contentWorld"));
          webView.callAsyncJavaScript((String)localObject2, (Map)localObject1, paramMethodCall, new ValueCallback()
          {
            public void onReceiveValue(String paramAnonymousString)
            {
              paramResult.success(paramAnonymousString);
            }
          });
        }
        break;
      case 65: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && (paramMethodCall.getUserContentController() != null)) {
          webView.getUserContentController().removeAllUserOnlyScripts();
        }
        break;
      case 64: 
        localObject1 = webView;
        if ((localObject1 != null) && (((InAppWebView)localObject1).getUserContentController() != null))
        {
          paramMethodCall = (String)paramMethodCall.argument("groupName");
          webView.getUserContentController().removeUserOnlyScriptsByGroupName(paramMethodCall);
        }
        break;
      case 63: 
        localObject1 = webView;
        if ((localObject1 != null) && (((InAppWebView)localObject1).getUserContentController() != null))
        {
          localObject1 = (Integer)paramMethodCall.argument("index");
          paramMethodCall = UserScript.fromMap((Map)paramMethodCall.argument("userScript"));
          bool = webView.getUserContentController().removeUserOnlyScriptAt(((Integer)localObject1).intValue(), paramMethodCall.getInjectionTime());
        }
        break;
      case 62: 
        localObject1 = webView;
        if ((localObject1 != null) && (((InAppWebView)localObject1).getUserContentController() != null))
        {
          paramMethodCall = UserScript.fromMap((Map)paramMethodCall.argument("userScript"));
          bool = webView.getUserContentController().addUserOnlyScript(paramMethodCall);
        }
        break;
      case 61: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearHistory();
        }
        break;
      case 60: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall = SslCertificateExt.toMap(paramMethodCall.getCertificate());
        }
        break;
      case 59: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          i = paramMethodCall.getScrollY();
        }
        break;
      case 58: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          i = paramMethodCall.getScrollX();
        }
        break;
      case 57: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall = paramMethodCall.requestImageRef();
        }
        break;
      case 56: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall = paramMethodCall.requestFocusNodeHref();
        }
        break;
      case 55: 
        if (webView != null)
        {
          paramMethodCall = (Map)paramMethodCall.argument("contextMenu");
          webView.setContextMenu(paramMethodCall);
        }
        break;
      case 54: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearFocus();
        }
        break;
      case 53: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          bool = paramMethodCall.zoomOut();
        }
        break;
      case 52: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          bool = paramMethodCall.zoomIn();
        }
        break;
      case 51: 
        if (webView != null)
        {
          localObject1 = (String)paramMethodCall.argument("filePath");
          bool = ((Boolean)paramMethodCall.argument("autoname")).booleanValue();
          webView.saveWebArchive((String)localObject1, bool, new ValueCallback()
          {
            public void onReceiveValue(String paramAnonymousString)
            {
              paramResult.success(paramAnonymousString);
            }
          });
        }
        break;
      case 50: 
        if (webView != null)
        {
          bool = ((Boolean)paramMethodCall.argument("top")).booleanValue();
          bool = webView.pageUp(bool);
        }
        break;
      case 49: 
        if (webView != null)
        {
          bool = ((Boolean)paramMethodCall.argument("bottom")).booleanValue();
          bool = webView.pageDown(bool);
        }
        break;
      case 48: 
        paramMethodCall = webView;
        if ((paramMethodCall instanceof InAppWebView)) {
          paramMethodCall = HitTestResult.fromWebViewHitTestResult(paramMethodCall.getHitTestResult()).toMap();
        }
        break;
      case 47: 
        paramMethodCall = webView;
        if ((paramMethodCall instanceof InAppWebView)) {
          paramMethodCall.getSelectedText(new ValueCallback()
          {
            public void onReceiveValue(String paramAnonymousString)
            {
              paramResult.success(paramAnonymousString);
            }
          });
        }
        break;
      case 46: 
        paramMethodCall = webView;
        if ((paramMethodCall instanceof InAppWebView)) {
          paramMethodCall = Float.valueOf(paramMethodCall.getZoomScale());
        }
        break;
      case 45: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall = paramMethodCall.getOriginalUrl();
        }
        break;
      case 44: 
        if (webView != null)
        {
          double d = ((Double)paramMethodCall.argument("zoomFactor")).doubleValue();
          webView.zoomBy((float)d);
        }
        break;
      case 43: 
        paramMethodCall = webView;
        if ((paramMethodCall instanceof InAppWebView)) {
          paramMethodCall.getContentWidth(new ValueCallback()
          {
            public void onReceiveValue(Integer paramAnonymousInteger)
            {
              paramResult.success(paramAnonymousInteger);
            }
          });
        }
        break;
      case 42: 
        paramMethodCall = webView;
        if ((paramMethodCall instanceof InAppWebView))
        {
          i = paramMethodCall.getContentHeight();
          paramMethodCall = Integer.valueOf(i);
        }
        break;
      case 41: 
        if (webView != null)
        {
          localObject1 = new PrintJobSettings();
          paramMethodCall = (Map)paramMethodCall.argument("settings");
          if (paramMethodCall != null) {
            ((PrintJobSettings)localObject1).parse(paramMethodCall);
          }
          paramMethodCall = webView.printCurrentPage((PrintJobSettings)localObject1);
        }
        break;
      case 40: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.resumeTimers();
        }
        break;
      case 39: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.pauseTimers();
        }
        break;
      case 38: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.onResume();
        }
        break;
      case 37: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.onPause();
        }
        break;
      case 36: 
        if (webView != null)
        {
          localObject2 = (Integer)paramMethodCall.argument("x");
          localObject1 = (Integer)paramMethodCall.argument("y");
          paramMethodCall = (Boolean)paramMethodCall.argument("animated");
          webView.scrollBy((Integer)localObject2, (Integer)localObject1, paramMethodCall);
        }
        break;
      case 35: 
        if (webView != null)
        {
          localObject2 = (Integer)paramMethodCall.argument("x");
          localObject1 = (Integer)paramMethodCall.argument("y");
          paramMethodCall = (Boolean)paramMethodCall.argument("animated");
          webView.scrollTo((Integer)localObject2, (Integer)localObject1, paramMethodCall);
        }
        break;
      case 34: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearMatches();
        }
        break;
      case 33: 
        if (webView != null)
        {
          paramMethodCall = (Boolean)paramMethodCall.argument("forward");
          webView.findNext(paramMethodCall.booleanValue());
        }
        break;
      case 32: 
        if (webView != null)
        {
          paramMethodCall = (String)paramMethodCall.argument("find");
          webView.findAllAsync(paramMethodCall);
        }
        break;
      case 31: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearSslPreferences();
        }
        break;
      case 30: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.clearAllCache();
        }
        break;
      case 29: 
        if ((webView != null) && (b.c0("START_SAFE_BROWSING")))
        {
          paramMethodCall = webView.getContext();
          paramResult = new ValueCallback()
          {
            public void onReceiveValue(Boolean paramAnonymousBoolean)
            {
              paramResult.success(paramAnonymousBoolean);
            }
          };
          localObject1 = p.a;
          localObject1 = i0.d;
          if (((a.f)localObject1).c())
          {
            d2.j.f(paramMethodCall, paramResult);
            break label3019;
          }
          if (((a)localObject1).d())
          {
            j0.b.a.getStatics().initSafeBrowsing(paramMethodCall, paramResult);
            break label3019;
          }
          throw i0.a();
        }
        paramMethodCall = Boolean.FALSE;
        break;
      case 28: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall = paramMethodCall.getCopyBackForwardList();
        }
        break;
      case 27: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && ((paramMethodCall.getInAppBrowserDelegate() instanceof InAppBrowserActivity)))
        {
          bool = webView.getInAppBrowserDelegate()).isHidden;
          paramMethodCall = Boolean.valueOf(bool);
        }
        break;
      case 26: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && ((paramMethodCall.getInAppBrowserDelegate() instanceof InAppBrowserActivity))) {
          ((InAppBrowserActivity)webView.getInAppBrowserDelegate()).hide();
        }
        break;
      case 25: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && ((paramMethodCall.getInAppBrowserDelegate() instanceof InAppBrowserActivity))) {
          ((InAppBrowserActivity)webView.getInAppBrowserDelegate()).show();
        }
        break;
      case 24: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && ((paramMethodCall.getInAppBrowserDelegate() instanceof InAppBrowserActivity))) {
          ((InAppBrowserActivity)webView.getInAppBrowserDelegate()).close(paramResult);
        } else {
          paramResult.notImplemented();
        }
        break;
      case 23: 
        paramMethodCall = webView;
        if ((paramMethodCall != null) && ((paramMethodCall.getInAppBrowserDelegate() instanceof InAppBrowserActivity)))
        {
          paramMethodCall = ((InAppBrowserActivity)webView.getInAppBrowserDelegate()).getCustomSettings();
        }
        else
        {
          paramMethodCall = webView;
          if (paramMethodCall != null) {
            paramMethodCall = paramMethodCall.getCustomSettings();
          }
        }
        break;
      case 22: 
        localObject1 = webView;
        if ((localObject1 != null) && ((((InAppWebView)localObject1).getInAppBrowserDelegate() instanceof InAppBrowserActivity)))
        {
          localObject2 = (InAppBrowserActivity)webView.getInAppBrowserDelegate();
          localObject1 = new InAppBrowserSettings();
          paramMethodCall = (HashMap)paramMethodCall.argument("settings");
          ((InAppBrowserSettings)localObject1).parse(paramMethodCall);
          ((InAppBrowserActivity)localObject2).setSettings((InAppBrowserSettings)localObject1, paramMethodCall);
        }
        else if (webView != null)
        {
          localObject1 = new InAppWebViewSettings();
          paramMethodCall = (HashMap)paramMethodCall.argument("settings");
          ((InAppWebViewSettings)localObject1).parse(paramMethodCall);
          webView.setSettings((InAppWebViewSettings)localObject1, paramMethodCall);
        }
        break;
      case 21: 
        if (webView != null)
        {
          paramMethodCall = (Map)paramMethodCall.argument("screenshotConfiguration");
          webView.takeScreenshot(paramMethodCall, paramResult);
        }
        break;
      case 20: 
        paramMethodCall = webView;
        if ((paramMethodCall == null) || (!paramMethodCall.isLoading())) {}
        break;
      case 19: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.stopLoading();
        }
        break;
      case 18: 
        localObject1 = webView;
        if ((localObject1 == null) || (!((WebView)localObject1).canGoBackOrForward(((Integer)paramMethodCall.argument("steps")).intValue()))) {}
        break;
      case 17: 
        localObject1 = webView;
        if (localObject1 != null) {
          ((WebView)localObject1).goBackOrForward(((Integer)paramMethodCall.argument("steps")).intValue());
        }
        break;
      case 16: 
        paramMethodCall = webView;
        if ((paramMethodCall == null) || (!paramMethodCall.canGoForward())) {}
        break;
      case 15: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.goForward();
        }
        break;
      case 14: 
        paramMethodCall = webView;
        if ((paramMethodCall == null) || (!paramMethodCall.canGoBack())) {
          bool = false;
        }
        paramMethodCall = Boolean.valueOf(bool);
        break;
      case 13: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.goBack();
        }
        break;
      case 12: 
        paramMethodCall = webView;
        if (paramMethodCall != null) {
          paramMethodCall.reload();
        }
        break;
      case 11: 
        if (webView != null)
        {
          localObject1 = (String)paramMethodCall.argument("urlFile");
          paramMethodCall = (Map)paramMethodCall.argument("cssLinkHtmlTagAttributes");
          webView.injectCSSFileFromUrl((String)localObject1, paramMethodCall);
        }
        break;
      case 10: 
        if (webView != null)
        {
          paramMethodCall = (String)paramMethodCall.argument("source");
          webView.injectCSSCode(paramMethodCall);
        }
        break;
      case 9: 
        if (webView != null)
        {
          localObject1 = (String)paramMethodCall.argument("urlFile");
          paramMethodCall = (Map)paramMethodCall.argument("scriptHtmlTagAttributes");
          webView.injectJavascriptFileFromUrl((String)localObject1, paramMethodCall);
        }
        break;
      case 8: 
        if (webView != null)
        {
          localObject1 = (String)paramMethodCall.argument("source");
          paramMethodCall = ContentWorld.fromMap((Map)paramMethodCall.argument("contentWorld"));
          webView.evaluateJavascript((String)localObject1, paramMethodCall, new ValueCallback()
          {
            public void onReceiveValue(String paramAnonymousString)
            {
              paramResult.success(paramAnonymousString);
            }
          });
          break label3019;
        }
        break;
      case 7: 
        if (webView != null)
        {
          paramMethodCall = (String)paramMethodCall.argument("assetFilePath");
          try
          {
            webView.loadFile(paramMethodCall);
          }
          catch (IOException paramMethodCall)
          {
            paramMethodCall.printStackTrace();
            paramResult.error("WebViewChannelDelegate", paramMethodCall.getMessage(), null);
            return;
          }
        }
      case 6: 
        if (webView != null)
        {
          localObject3 = (String)paramMethodCall.argument("data");
          localObject4 = (String)paramMethodCall.argument("mimeType");
          localObject2 = (String)paramMethodCall.argument("encoding");
          localObject1 = (String)paramMethodCall.argument("baseUrl");
          paramMethodCall = (String)paramMethodCall.argument("historyUrl");
          webView.loadDataWithBaseURL((String)localObject1, (String)localObject3, (String)localObject4, (String)localObject2, paramMethodCall);
        }
        break;
      case 5: 
        if (webView != null)
        {
          localObject1 = (String)paramMethodCall.argument("url");
          paramMethodCall = (byte[])paramMethodCall.argument("postData");
          webView.postUrl((String)localObject1, paramMethodCall);
        }
        break;
      case 4: 
        if (webView != null)
        {
          paramMethodCall = (Map)paramMethodCall.argument("urlRequest");
          webView.loadUrl(URLRequest.fromMap(paramMethodCall));
        }
        paramMethodCall = Boolean.TRUE;
        paramResult.success(paramMethodCall);
        break;
      case 3: 
        paramMethodCall = webView;
        if (paramMethodCall == null) {
          break label3010;
        }
        paramMethodCall = Integer.valueOf(paramMethodCall.getProgress());
        break;
      case 2: 
        label2942:
        paramMethodCall = webView;
        if (paramMethodCall == null) {
          break label3010;
        }
        paramMethodCall = paramMethodCall.getTitle();
        break;
      }
      paramMethodCall = webView;
      if (paramMethodCall != null) {
        paramMethodCall = paramMethodCall.getUrl();
      } else {
        label3010:
        paramMethodCall = null;
      }
      paramResult.success(paramMethodCall);
      label3019:
      return;
    }
    catch (IllegalArgumentException paramMethodCall)
    {
      paramResult.notImplemented();
    }
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("x", Integer.valueOf(paramInt1));
    localHashMap.put("y", Integer.valueOf(paramInt2));
    localHashMap.put("clampedX", Boolean.valueOf(paramBoolean1));
    localHashMap.put("clampedY", Boolean.valueOf(paramBoolean2));
    localMethodChannel.invokeMethod("onOverScrolled", localHashMap);
  }
  
  public void onPageCommitVisible(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onPageCommitVisible", localHashMap);
  }
  
  public void onPermissionRequest(String paramString, List<String> paramList, Object paramObject, PermissionRequestCallback paramPermissionRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramPermissionRequestCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("origin", paramString);
    localHashMap.put("resources", paramList);
    localHashMap.put("frame", paramObject);
    localMethodChannel.invokeMethod("onPermissionRequest", localHashMap, paramPermissionRequestCallback);
  }
  
  public void onPermissionRequestCanceled(String paramString, List<String> paramList)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("origin", paramString);
    localHashMap.put("resources", paramList);
    localMethodChannel.invokeMethod("onPermissionRequestCanceled", localHashMap);
  }
  
  public void onPrintRequest(String paramString1, String paramString2, PrintRequestCallback paramPrintRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramPrintRequestCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString1);
    localHashMap.put("printJobId", paramString2);
    localMethodChannel.invokeMethod("onPrintRequest", localHashMap, paramPrintRequestCallback);
  }
  
  public void onProgressChanged(int paramInt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("progress", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onProgressChanged", localHashMap);
  }
  
  public void onReceivedClientCertRequest(ClientCertChallenge paramClientCertChallenge, ReceivedClientCertRequestCallback paramReceivedClientCertRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramReceivedClientCertRequestCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("onReceivedClientCertRequest", paramClientCertChallenge.toMap(), paramReceivedClientCertRequestCallback);
  }
  
  public void onReceivedError(WebResourceRequestExt paramWebResourceRequestExt, WebResourceErrorExt paramWebResourceErrorExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("request", paramWebResourceRequestExt.toMap());
    localHashMap.put("error", paramWebResourceErrorExt.toMap());
    localMethodChannel.invokeMethod("onReceivedError", localHashMap);
  }
  
  public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge paramHttpAuthenticationChallenge, ReceivedHttpAuthRequestCallback paramReceivedHttpAuthRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramReceivedHttpAuthRequestCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("onReceivedHttpAuthRequest", paramHttpAuthenticationChallenge.toMap(), paramReceivedHttpAuthRequestCallback);
  }
  
  public void onReceivedHttpError(WebResourceRequestExt paramWebResourceRequestExt, WebResourceResponseExt paramWebResourceResponseExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("request", paramWebResourceRequestExt.toMap());
    localHashMap.put("errorResponse", paramWebResourceResponseExt.toMap());
    localMethodChannel.invokeMethod("onReceivedHttpError", localHashMap);
  }
  
  public void onReceivedIcon(byte[] paramArrayOfByte)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("icon", paramArrayOfByte);
    localMethodChannel.invokeMethod("onReceivedIcon", localHashMap);
  }
  
  public void onReceivedLoginRequest(String paramString1, String paramString2, String paramString3)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("realm", paramString1);
    localHashMap.put("account", paramString2);
    localHashMap.put("args", paramString3);
    localMethodChannel.invokeMethod("onReceivedLoginRequest", localHashMap);
  }
  
  public void onReceivedServerTrustAuthRequest(ServerTrustChallenge paramServerTrustChallenge, ReceivedServerTrustAuthRequestCallback paramReceivedServerTrustAuthRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramReceivedServerTrustAuthRequestCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("onReceivedServerTrustAuthRequest", paramServerTrustChallenge.toMap(), paramReceivedServerTrustAuthRequestCallback);
  }
  
  public void onReceivedTouchIconUrl(String paramString, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localHashMap.put("precomposed", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onReceivedTouchIconUrl", localHashMap);
  }
  
  public void onRenderProcessGone(boolean paramBoolean, int paramInt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("didCrash", Boolean.valueOf(paramBoolean));
    localHashMap.put("rendererPriorityAtExit", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onRenderProcessGone", localHashMap);
  }
  
  public void onRenderProcessResponsive(String paramString, RenderProcessResponsiveCallback paramRenderProcessResponsiveCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramRenderProcessResponsiveCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onRenderProcessResponsive", localHashMap, paramRenderProcessResponsiveCallback);
  }
  
  public void onRenderProcessUnresponsive(String paramString, RenderProcessUnresponsiveCallback paramRenderProcessUnresponsiveCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramRenderProcessUnresponsiveCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localMethodChannel.invokeMethod("onRenderProcessUnresponsive", localHashMap, paramRenderProcessUnresponsiveCallback);
  }
  
  public void onRequestFocus()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onRequestFocus", new HashMap());
  }
  
  public void onSafeBrowsingHit(String paramString, int paramInt, SafeBrowsingHitCallback paramSafeBrowsingHitCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramSafeBrowsingHitCallback.defaultBehaviour(null);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localHashMap.put("threatType", Integer.valueOf(paramInt));
    localMethodChannel.invokeMethod("onSafeBrowsingHit", localHashMap, paramSafeBrowsingHitCallback);
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("x", Integer.valueOf(paramInt1));
    localHashMap.put("y", Integer.valueOf(paramInt2));
    localMethodChannel.invokeMethod("onScrollChanged", localHashMap);
  }
  
  public void onTitleChanged(String paramString)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("title", paramString);
    localMethodChannel.invokeMethod("onTitleChanged", localHashMap);
  }
  
  public void onUpdateVisitedHistory(String paramString, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("url", paramString);
    localHashMap.put("isReload", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onUpdateVisitedHistory", localHashMap);
  }
  
  public void onZoomScaleChanged(float paramFloat1, float paramFloat2)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("oldScale", Float.valueOf(paramFloat1));
    localHashMap.put("newScale", Float.valueOf(paramFloat2));
    localMethodChannel.invokeMethod("onZoomScaleChanged", localHashMap);
  }
  
  public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt paramWebResourceRequestExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return null;
    }
    SyncShouldInterceptRequestCallback localSyncShouldInterceptRequestCallback = new SyncShouldInterceptRequestCallback();
    return (WebResourceResponseExt)Util.invokeMethodAndWaitResult(localMethodChannel, "shouldInterceptRequest", paramWebResourceRequestExt.toMap(), localSyncShouldInterceptRequestCallback);
  }
  
  public void shouldInterceptRequest(WebResourceRequestExt paramWebResourceRequestExt, ShouldInterceptRequestCallback paramShouldInterceptRequestCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramShouldInterceptRequestCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("shouldInterceptRequest", paramWebResourceRequestExt.toMap(), paramShouldInterceptRequestCallback);
  }
  
  public void shouldOverrideUrlLoading(NavigationAction paramNavigationAction, ShouldOverrideUrlLoadingCallback paramShouldOverrideUrlLoadingCallback)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null)
    {
      paramShouldOverrideUrlLoadingCallback.defaultBehaviour(null);
      return;
    }
    localMethodChannel.invokeMethod("shouldOverrideUrlLoading", paramNavigationAction.toMap(), paramShouldOverrideUrlLoadingCallback);
  }
  
  public static class CallJsHandlerCallback
    extends BaseCallbackResultImpl<Object>
  {
    public Object decodeResult(Object paramObject)
    {
      return paramObject;
    }
  }
  
  public static class CreateWindowCallback
    extends BaseCallbackResultImpl<Boolean>
  {
    public Boolean decodeResult(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof Boolean)) && (((Boolean)paramObject).booleanValue())) {
        bool = true;
      } else {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
  }
  
  public static class FormResubmissionCallback
    extends BaseCallbackResultImpl<Integer>
  {
    public Integer decodeResult(Object paramObject)
    {
      if ((paramObject instanceof Integer)) {
        paramObject = (Integer)paramObject;
      } else {
        paramObject = null;
      }
      return (Integer)paramObject;
    }
  }
  
  public static class GeolocationPermissionsShowPromptCallback
    extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse>
  {
    public GeolocationPermissionShowPromptResponse decodeResult(Object paramObject)
    {
      return GeolocationPermissionShowPromptResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class JsAlertCallback
    extends BaseCallbackResultImpl<JsAlertResponse>
  {
    public JsAlertResponse decodeResult(Object paramObject)
    {
      return JsAlertResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class JsBeforeUnloadCallback
    extends BaseCallbackResultImpl<JsBeforeUnloadResponse>
  {
    public JsBeforeUnloadResponse decodeResult(Object paramObject)
    {
      return JsBeforeUnloadResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class JsConfirmCallback
    extends BaseCallbackResultImpl<JsConfirmResponse>
  {
    public JsConfirmResponse decodeResult(Object paramObject)
    {
      return JsConfirmResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class JsPromptCallback
    extends BaseCallbackResultImpl<JsPromptResponse>
  {
    public JsPromptResponse decodeResult(Object paramObject)
    {
      return JsPromptResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class LoadResourceWithCustomSchemeCallback
    extends BaseCallbackResultImpl<CustomSchemeResponse>
  {
    public CustomSchemeResponse decodeResult(Object paramObject)
    {
      return CustomSchemeResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class PermissionRequestCallback
    extends BaseCallbackResultImpl<PermissionResponse>
  {
    public PermissionResponse decodeResult(Object paramObject)
    {
      return PermissionResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class PrintRequestCallback
    extends BaseCallbackResultImpl<Boolean>
  {
    public Boolean decodeResult(Object paramObject)
    {
      boolean bool;
      if (((paramObject instanceof Boolean)) && (((Boolean)paramObject).booleanValue())) {
        bool = true;
      } else {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
  }
  
  public static class ReceivedClientCertRequestCallback
    extends BaseCallbackResultImpl<ClientCertResponse>
  {
    public ClientCertResponse decodeResult(Object paramObject)
    {
      return ClientCertResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class ReceivedHttpAuthRequestCallback
    extends BaseCallbackResultImpl<HttpAuthResponse>
  {
    public HttpAuthResponse decodeResult(Object paramObject)
    {
      return HttpAuthResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class ReceivedServerTrustAuthRequestCallback
    extends BaseCallbackResultImpl<ServerTrustAuthResponse>
  {
    public ServerTrustAuthResponse decodeResult(Object paramObject)
    {
      return ServerTrustAuthResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class RenderProcessResponsiveCallback
    extends BaseCallbackResultImpl<Integer>
  {
    public Integer decodeResult(Object paramObject)
    {
      if ((paramObject instanceof Integer)) {
        paramObject = (Integer)paramObject;
      } else {
        paramObject = null;
      }
      return (Integer)paramObject;
    }
  }
  
  public static class RenderProcessUnresponsiveCallback
    extends BaseCallbackResultImpl<Integer>
  {
    public Integer decodeResult(Object paramObject)
    {
      if ((paramObject instanceof Integer)) {
        paramObject = (Integer)paramObject;
      } else {
        paramObject = null;
      }
      return (Integer)paramObject;
    }
  }
  
  public static class SafeBrowsingHitCallback
    extends BaseCallbackResultImpl<SafeBrowsingResponse>
  {
    public SafeBrowsingResponse decodeResult(Object paramObject)
    {
      return SafeBrowsingResponse.fromMap((Map)paramObject);
    }
  }
  
  public static class ShouldInterceptRequestCallback
    extends BaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return WebResourceResponseExt.fromMap((Map)paramObject);
    }
  }
  
  public static class ShouldOverrideUrlLoadingCallback
    extends BaseCallbackResultImpl<NavigationActionPolicy>
  {
    public NavigationActionPolicy decodeResult(Object paramObject)
    {
      int i;
      if ((paramObject instanceof Integer)) {
        i = ((Integer)paramObject).intValue();
      } else {
        i = NavigationActionPolicy.CANCEL.rawValue();
      }
      return NavigationActionPolicy.fromValue(Integer.valueOf(i).intValue());
    }
  }
  
  public static class SyncLoadResourceWithCustomSchemeCallback
    extends SyncBaseCallbackResultImpl<CustomSchemeResponse>
  {
    public CustomSchemeResponse decodeResult(Object paramObject)
    {
      return new WebViewChannelDelegate.LoadResourceWithCustomSchemeCallback().decodeResult(paramObject);
    }
  }
  
  public static class SyncShouldInterceptRequestCallback
    extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
  {
    public WebResourceResponseExt decodeResult(Object paramObject)
    {
      return new WebViewChannelDelegate.ShouldInterceptRequestCallback().decodeResult(paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */