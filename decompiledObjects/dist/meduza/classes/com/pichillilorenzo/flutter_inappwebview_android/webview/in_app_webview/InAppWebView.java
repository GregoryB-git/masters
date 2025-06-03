package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import aa.w;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintJob;
import android.print.PrintManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextMenu;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebView.FindListener;
import android.webkit.WebViewClient;
import android.widget.AbsoluteLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b1.v;
import c2.n;
import c2.p;
import c2.p.b;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R.layout;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler;
import com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptAjaxRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.InterceptFetchRequestJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnLoadResourceJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowBlurEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.OnWindowFocusEventJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PluginScriptsUtil;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PrintJS;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.PromisePolyfillJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.PreferredContentModeOptionType;
import com.pichillilorenzo.flutter_inappwebview_android.types.ResolutionExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.ContextMenuSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import d2.a;
import d2.c;
import d2.d0;
import d2.i0;
import d2.i0.a;
import d2.j0.b;
import d2.k0;
import f;
import g;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import zc.a.a;

public final class InAppWebView
  extends InputAwareWebView
  implements InAppWebViewInterface
{
  public static final String LOG_TAG = "InAppWebView";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_";
  public static Handler mHandler = new Handler();
  public Map<String, ValueCallback<String>> callAsyncJavaScriptCallbacks = new HashMap();
  public WebViewChannelDelegate channelDelegate;
  public Runnable checkContextMenuShouldBeClosedTask;
  public Runnable checkScrollStoppedTask;
  public ContentBlockerHandler contentBlockerHandler = new ContentBlockerHandler();
  public Map<String, Object> contextMenu = null;
  private Point contextMenuPoint = new Point(0, 0);
  public InAppWebViewSettings customSettings = new InAppWebViewSettings();
  public Map<String, ValueCallback<String>> evaluateJavaScriptContentWorldCallbacks = new HashMap();
  public FindInteractionController findInteractionController;
  public LinearLayout floatingContextMenu = null;
  public GestureDetector gestureDetector = null;
  public Object id;
  public InAppBrowserDelegate inAppBrowserDelegate;
  public InAppWebViewChromeClient inAppWebViewChromeClient;
  public InAppWebViewClient inAppWebViewClient;
  public InAppWebViewClientCompat inAppWebViewClientCompat;
  public InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient;
  private boolean inFullscreen = false;
  public int initialPositionScrollStoppedTask;
  private List<UserScript> initialUserOnlyScripts = new ArrayList();
  private PluginScript interceptOnlyAsyncAjaxRequestsPluginScript;
  public boolean isLoading = false;
  public JavaScriptBridgeInterface javaScriptBridgeInterface;
  private Point lastTouch = new Point(0, 0);
  public Handler mainLooperHandler = new Handler(getWebViewLooper());
  public int newCheckContextMenuShouldBeClosedTaskTask = 100;
  public int newCheckScrollStoppedTask = 100;
  public InAppWebViewFlutterPlugin plugin;
  public Pattern regexToCancelSubFramesLoadingCompiled;
  public UserContentController userContentController = new UserContentController(this);
  public Map<String, WebMessageChannel> webMessageChannels = new HashMap();
  public List<WebMessageListener> webMessageListeners = new ArrayList();
  public WebViewAssetLoaderExt webViewAssetLoaderExt;
  public Integer windowId;
  public float zoomScale = 1.0F;
  
  public InAppWebView(Context paramContext)
  {
    super(paramContext);
  }
  
  public InAppWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public InAppWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public InAppWebView(Context paramContext, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, Object paramObject, Integer paramInteger, InAppWebViewSettings paramInAppWebViewSettings, Map<String, Object> paramMap, View paramView, List<UserScript> paramList)
  {
    super(paramContext, paramView, useHybridComposition);
    plugin = paramInAppWebViewFlutterPlugin;
    id = paramObject;
    paramView = messenger;
    paramContext = new StringBuilder();
    paramContext.append("com.pichillilorenzo/flutter_inappwebview_");
    paramContext.append(paramObject);
    channelDelegate = new WebViewChannelDelegate(this, new MethodChannel(paramView, paramContext.toString()));
    windowId = paramInteger;
    customSettings = paramInAppWebViewSettings;
    contextMenu = paramMap;
    initialUserOnlyScripts = paramList;
    paramContext = activity;
    if (paramContext != null) {
      paramContext.registerForContextMenu(this);
    }
  }
  
  @Deprecated
  private void clearCookies()
  {
    CookieManager.getInstance().removeAllCookies(new ValueCallback()
    {
      public void onReceiveValue(Boolean paramAnonymousBoolean) {}
    });
  }
  
  private void sendOnCreateContextMenuEvent()
  {
    HitTestResult localHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
    WebViewChannelDelegate localWebViewChannelDelegate = channelDelegate;
    if (localWebViewChannelDelegate != null) {
      localWebViewChannelDelegate.onCreateContextMenu(localHitTestResult);
    }
  }
  
  public void addWebMessageListener(WebMessageListener paramWebMessageListener)
  {
    if (x6.b.c0("WEB_MESSAGE_LISTENER"))
    {
      String str = jsObjectName;
      Set localSet = allowedOriginRules;
      p.b localb = listener;
      Uri localUri = p.a;
      if (i0.I.d())
      {
        j0.b.a.createWebView(this).addWebMessageListener(str, (String[])localSet.toArray(new String[0]), new a.a(new d0(localb)));
        webMessageListeners.add(paramWebMessageListener);
      }
      else
      {
        throw i0.a();
      }
    }
  }
  
  public void adjustFloatingContextMenuPosition()
  {
    evaluateJavascript("(function(){  var selection = window.getSelection();  var rangeY = null;  if (selection != null && selection.rangeCount > 0) {    var range = selection.getRangeAt(0);    var clientRect = range.getClientRects();    if (clientRect.length > 0) {      rangeY = clientRect[0].y;    } else if (document.activeElement != null && document.activeElement.tagName.toLowerCase() !== 'iframe') {      var boundingClientRect = document.activeElement.getBoundingClientRect();      rangeY = boundingClientRect.y;    }  }  return rangeY;})();", new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        if (floatingContextMenu != null) {
          if ((paramAnonymousString != null) && (!paramAnonymousString.equalsIgnoreCase("null")))
          {
            int i = access$000x;
            float f = Float.parseFloat(paramAnonymousString);
            double d = Util.getPixelDensity(getContext()) * f;
            int j = (int)(floatingContextMenu.getHeight() / 3.5D + d);
            access$000y = j;
            onFloatingActionGlobalLayout(i, j);
          }
          else
          {
            floatingContextMenu.setVisibility(0);
            floatingContextMenu.animate().alpha(1.0F).setDuration(100L).setListener(null);
            paramAnonymousString = InAppWebView.this;
            paramAnonymousString.onFloatingActionGlobalLayout(access$000x, access$000y);
          }
        }
      }
    });
  }
  
  public void callAsyncJavaScript(String paramString, Map<String, Object> paramMap, ContentWorld paramContentWorld, ValueCallback<String> paramValueCallback)
  {
    String str1 = UUID.randomUUID().toString();
    if (paramValueCallback != null) {
      callAsyncJavaScriptCallbacks.put(str1, paramValueCallback);
    }
    Iterator localIterator = new JSONObject(paramMap).keys();
    ArrayList localArrayList = new ArrayList();
    paramValueCallback = new ArrayList();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      localArrayList.add(str2);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("obj.");
      ((StringBuilder)localObject).append(str2);
      paramValueCallback.add(((StringBuilder)localObject).toString());
    }
    Object localObject = TextUtils.join(", ", localArrayList);
    paramValueCallback = TextUtils.join(", ", paramValueCallback);
    paramMap = Util.JSONStringify(paramMap);
    paramString = "(function(obj) {  (async function($IN_APP_WEBVIEW_FUNCTION_ARGUMENT_NAMES) {    \n$IN_APP_WEBVIEW_FUNCTION_BODY\n  })($IN_APP_WEBVIEW_FUNCTION_ARGUMENT_VALUES).then(function(value) {    window.flutter_inappwebview.callHandler('callAsyncJavaScript', {'value': value, 'error': null, 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});  }).catch(function(error) {    window.flutter_inappwebview.callHandler('callAsyncJavaScript', {'value': null, 'error': error + '', 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});  });  return null;})($IN_APP_WEBVIEW_FUNCTION_ARGUMENTS_OBJ);".replace("$IN_APP_WEBVIEW_FUNCTION_ARGUMENT_NAMES", (CharSequence)localObject).replace("$IN_APP_WEBVIEW_FUNCTION_ARGUMENT_VALUES", paramValueCallback).replace("$IN_APP_WEBVIEW_FUNCTION_ARGUMENTS_OBJ", paramMap).replace("$IN_APP_WEBVIEW_FUNCTION_BODY", paramString).replace("$IN_APP_WEBVIEW_RESULT_UUID", str1).replace("$IN_APP_WEBVIEW_RESULT_UUID", str1);
    evaluateJavascript(userContentController.generateCodeForScriptEvaluation(paramString, paramContentWorld), null);
  }
  
  public boolean canScrollHorizontally()
  {
    boolean bool;
    if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean canScrollVertically()
  {
    boolean bool;
    if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @Deprecated
  public void clearAllCache()
  {
    clearCache(true);
    clearCookies();
    clearFormData();
    WebStorage.getInstance().deleteAllData();
  }
  
  public WebMessageChannel createCompatWebMessageChannel()
  {
    String str = UUID.randomUUID().toString();
    WebMessageChannel localWebMessageChannel = new WebMessageChannel(str, this);
    webMessageChannels.put(str, localWebMessageChannel);
    return localWebMessageChannel;
  }
  
  public WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> paramValueCallback)
  {
    WebMessageChannel localWebMessageChannel = createCompatWebMessageChannel();
    paramValueCallback.onReceiveValue(localWebMessageChannel);
    return localWebMessageChannel;
  }
  
  public WebViewClient createWebViewClient(InAppBrowserDelegate paramInAppBrowserDelegate)
  {
    Object localObject = p.b(getContext());
    if (localObject == null)
    {
      Log.d("InAppWebView", "Using InAppWebViewClient implementation");
      return new InAppWebViewClient(paramInAppBrowserDelegate);
    }
    boolean bool = "com.android.webview".equals(packageName);
    int i = 1;
    j = 0;
    int k;
    if ((!bool) && (!"com.google.android.webview".equals(packageName)) && (!"com.android.chrome".equals(packageName))) {
      k = 0;
    } else {
      k = 1;
    }
    m = j;
    if (k != 0)
    {
      localObject = versionName;
      if (localObject == null) {
        localObject = "";
      }
    }
    try
    {
      if (((String)localObject).contains(".")) {
        m = Integer.parseInt(localObject.split("\\.")[0]);
      } else {
        m = 0;
      }
      if (m >= 73) {
        m = i;
      } else {
        m = 0;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        m = j;
      }
    }
    if ((m == 0) && (k != 0))
    {
      Log.d("InAppWebView", "Using InAppWebViewClient implementation");
      return new InAppWebViewClient(paramInAppBrowserDelegate);
    }
    Log.d("InAppWebView", "Using InAppWebViewClientCompat implementation");
    return new InAppWebViewClientCompat(paramInAppBrowserDelegate);
  }
  
  public void destroy()
  {
    super.destroy();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void dispose()
  {
    Object localObject1 = channelDelegate;
    if (localObject1 != null)
    {
      ((WebViewChannelDelegate)localObject1).dispose();
      channelDelegate = null;
    }
    super.dispose();
    getSettings().setJavaScriptEnabled(false);
    removeJavascriptInterface("flutter_inappwebview");
    if ((Build.VERSION.SDK_INT >= 29) && (x6.b.c0("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"))) {
      p.f(this, null);
    }
    setWebChromeClient(new WebChromeClient());
    setWebViewClient(new WebViewClient()
    {
      public void onPageFinished(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        destroy();
      }
    });
    interceptOnlyAsyncAjaxRequestsPluginScript = null;
    userContentController.dispose();
    localObject1 = findInteractionController;
    if (localObject1 != null)
    {
      ((FindInteractionController)localObject1).dispose();
      findInteractionController = null;
    }
    localObject1 = webViewAssetLoaderExt;
    if (localObject1 != null)
    {
      ((WebViewAssetLoaderExt)localObject1).dispose();
      webViewAssetLoaderExt = null;
    }
    localObject1 = windowId;
    if (localObject1 != null)
    {
      Object localObject2 = plugin;
      if (localObject2 != null)
      {
        localObject2 = inAppWebViewManager;
        if (localObject2 != null) {
          windowWebViewMessages.remove(localObject1);
        }
      }
    }
    mainLooperHandler.removeCallbacksAndMessages(null);
    mHandler.removeCallbacksAndMessages(null);
    disposeWebMessageChannels();
    disposeWebMessageListeners();
    removeAllViews();
    localObject1 = checkContextMenuShouldBeClosedTask;
    if (localObject1 != null) {
      removeCallbacks((Runnable)localObject1);
    }
    localObject1 = checkScrollStoppedTask;
    if (localObject1 != null) {
      removeCallbacks((Runnable)localObject1);
    }
    callAsyncJavaScriptCallbacks.clear();
    evaluateJavaScriptContentWorldCallbacks.clear();
    inAppBrowserDelegate = null;
    localObject1 = inAppWebViewRenderProcessClient;
    if (localObject1 != null)
    {
      ((InAppWebViewRenderProcessClient)localObject1).dispose();
      inAppWebViewRenderProcessClient = null;
    }
    localObject1 = inAppWebViewChromeClient;
    if (localObject1 != null)
    {
      ((InAppWebViewChromeClient)localObject1).dispose();
      inAppWebViewChromeClient = null;
    }
    localObject1 = inAppWebViewClientCompat;
    if (localObject1 != null)
    {
      ((InAppWebViewClientCompat)localObject1).dispose();
      inAppWebViewClientCompat = null;
    }
    localObject1 = inAppWebViewClient;
    if (localObject1 != null)
    {
      ((InAppWebViewClient)localObject1).dispose();
      inAppWebViewClient = null;
    }
    localObject1 = javaScriptBridgeInterface;
    if (localObject1 != null)
    {
      ((JavaScriptBridgeInterface)localObject1).dispose();
      javaScriptBridgeInterface = null;
    }
    plugin = null;
    loadUrl("about:blank");
  }
  
  public void disposeWebMessageChannels()
  {
    Iterator localIterator = webMessageChannels.values().iterator();
    while (localIterator.hasNext()) {
      ((WebMessageChannel)localIterator.next()).dispose();
    }
    webMessageChannels.clear();
  }
  
  public void disposeWebMessageListeners()
  {
    Iterator localIterator = webMessageListeners.iterator();
    while (localIterator.hasNext()) {
      ((WebMessageListener)localIterator.next()).dispose();
    }
    webMessageListeners.clear();
  }
  
  public void enablePluginScriptAtRuntime(final String paramString, final boolean paramBoolean, final PluginScript paramPluginScript)
  {
    evaluateJavascript(g.d("window.", paramString), null, new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        int i;
        if ((paramAnonymousString != null) && (!paramAnonymousString.equalsIgnoreCase("null"))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramAnonymousString = f.l("window.");
          paramAnonymousString.append(paramString);
          paramAnonymousString.append(" = ");
          paramAnonymousString.append(paramBoolean);
          paramAnonymousString.append(";");
          paramAnonymousString = paramAnonymousString.toString();
          this$0.evaluateJavascript(paramAnonymousString, null, null);
          if (!paramBoolean) {
            this$0.userContentController.removePluginScript(paramPluginScript);
          }
        }
        else if (paramBoolean)
        {
          this$0.evaluateJavascript(paramPluginScript.getSource(), null, null);
          this$0.userContentController.addPluginScript(paramPluginScript);
        }
      }
    });
  }
  
  public void evaluateJavascript(String paramString, ContentWorld paramContentWorld, ValueCallback<String> paramValueCallback)
  {
    injectDeferredObject(paramString, paramContentWorld, null, paramValueCallback);
  }
  
  public WebViewChannelDelegate getChannelDelegate()
  {
    return channelDelegate;
  }
  
  public void getContentHeight(ValueCallback<Integer> paramValueCallback)
  {
    paramValueCallback.onReceiveValue(Integer.valueOf(getContentHeight()));
  }
  
  public void getContentWidth(final ValueCallback<Integer> paramValueCallback)
  {
    evaluateJavascript("document.documentElement.scrollWidth;", new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (!paramAnonymousString.equalsIgnoreCase("null"))) {
          paramAnonymousString = Integer.valueOf(Integer.parseInt(paramAnonymousString));
        } else {
          paramAnonymousString = null;
        }
        paramValueCallback.onReceiveValue(paramAnonymousString);
      }
    });
  }
  
  public Map<String, Object> getContextMenu()
  {
    return contextMenu;
  }
  
  public HashMap<String, Object> getCopyBackForwardList()
  {
    WebBackForwardList localWebBackForwardList = copyBackForwardList();
    int i = localWebBackForwardList.getSize();
    int j = localWebBackForwardList.getCurrentIndex();
    ArrayList localArrayList = new ArrayList();
    for (int k = 0; k < i; k++)
    {
      WebHistoryItem localWebHistoryItem = localWebBackForwardList.getItemAtIndex(k);
      localHashMap = new HashMap();
      localHashMap.put("originalUrl", localWebHistoryItem.getOriginalUrl());
      localHashMap.put("title", localWebHistoryItem.getTitle());
      localHashMap.put("url", localWebHistoryItem.getUrl());
      localArrayList.add(localHashMap);
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("list", localArrayList);
    localHashMap.put("currentIndex", Integer.valueOf(j));
    return localHashMap;
  }
  
  public Map<String, Object> getCustomSettings()
  {
    Object localObject = customSettings;
    if (localObject != null) {
      localObject = ((InAppWebViewSettings)localObject).getRealSettings(this);
    } else {
      localObject = null;
    }
    return (Map<String, Object>)localObject;
  }
  
  public void getHitTestResult(ValueCallback<HitTestResult> paramValueCallback)
  {
    paramValueCallback.onReceiveValue(HitTestResult.fromWebViewHitTestResult(getHitTestResult()));
  }
  
  public InAppBrowserDelegate getInAppBrowserDelegate()
  {
    return inAppBrowserDelegate;
  }
  
  public InAppWebViewFlutterPlugin getPlugin()
  {
    return plugin;
  }
  
  public void getSelectedText(final ValueCallback<String> paramValueCallback)
  {
    evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }  return txt;})();", new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        if ((paramAnonymousString != null) && (!paramAnonymousString.equalsIgnoreCase("null"))) {
          paramAnonymousString = paramAnonymousString.substring(1, paramAnonymousString.length() - 1);
        } else {
          paramAnonymousString = null;
        }
        paramValueCallback.onReceiveValue(paramAnonymousString);
      }
    });
  }
  
  public UserContentController getUserContentController()
  {
    return userContentController;
  }
  
  public Map<String, WebMessageChannel> getWebMessageChannels()
  {
    return webMessageChannels;
  }
  
  public Looper getWebViewLooper()
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return super.getWebViewLooper();
    }
    return Looper.getMainLooper();
  }
  
  public float getZoomScale()
  {
    return zoomScale;
  }
  
  public void getZoomScale(ValueCallback<Float> paramValueCallback)
  {
    paramValueCallback.onReceiveValue(Float.valueOf(zoomScale));
  }
  
  public void hideContextMenu()
  {
    removeView(floatingContextMenu);
    floatingContextMenu = null;
    WebViewChannelDelegate localWebViewChannelDelegate = channelDelegate;
    if (localWebViewChannelDelegate != null) {
      localWebViewChannelDelegate.onHideContextMenu();
    }
  }
  
  public void injectCSSCode(String paramString)
  {
    injectDeferredObject(paramString, null, "(function(d) { var style = d.createElement('style'); style.innerHTML = %s; if (d.head != null) { d.head.appendChild(style); } })(document);", null);
  }
  
  public void injectCSSFileFromUrl(String paramString, Map<String, Object> paramMap)
  {
    String str = "";
    Object localObject2;
    if (paramMap != null)
    {
      localObject1 = (String)paramMap.get("id");
      if (localObject1 != null)
      {
        localObject2 = g.g("", " link.id = '");
        ((StringBuilder)localObject2).append(((String)localObject1).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject2).append("'; ");
        localObject1 = ((StringBuilder)localObject2).toString();
      }
      else
      {
        localObject1 = "";
      }
      Object localObject3 = (String)paramMap.get("media");
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject2 = g.g((String)localObject1, " link.media = '");
        ((StringBuilder)localObject2).append(((String)localObject3).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject2).append("'; ");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject3 = (String)paramMap.get("crossOrigin");
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject2 = g.g((String)localObject2, " link.crossOrigin = '");
        ((StringBuilder)localObject2).append(((String)localObject3).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject2).append("'; ");
        localObject1 = ((StringBuilder)localObject2).toString();
      }
      localObject2 = (String)paramMap.get("integrity");
      localObject3 = localObject1;
      if (localObject2 != null)
      {
        localObject1 = g.g((String)localObject1, " link.integrity = '");
        ((StringBuilder)localObject1).append(((String)localObject2).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject3 = ((StringBuilder)localObject1).toString();
      }
      localObject1 = (String)paramMap.get("referrerPolicy");
      localObject2 = localObject3;
      if (localObject1 != null)
      {
        localObject2 = g.g((String)localObject3, " link.referrerPolicy = '");
        ((StringBuilder)localObject2).append(((String)localObject1).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject2).append("'; ");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject3 = (Boolean)paramMap.get("disabled");
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = localObject2;
        if (((Boolean)localObject3).booleanValue()) {
          localObject1 = g.d((String)localObject2, " link.disabled = true; ");
        }
      }
      localObject3 = (Boolean)paramMap.get("alternate");
      localObject2 = str;
      if (localObject3 != null)
      {
        localObject2 = str;
        if (((Boolean)localObject3).booleanValue()) {
          localObject2 = "alternate ";
        }
      }
      paramMap = (String)paramMap.get("title");
      if (paramMap != null)
      {
        localObject1 = g.g((String)localObject1, " link.title = '");
        ((StringBuilder)localObject1).append(paramMap.replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        paramMap = ((StringBuilder)localObject1).toString();
      }
      else
      {
        paramMap = (Map<String, Object>)localObject1;
      }
    }
    else
    {
      paramMap = "";
      localObject2 = str;
    }
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("(function(d) { var link = d.createElement('link'); link.rel='");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("stylesheet'; link.type='text/css'; ");
    ((StringBuilder)localObject1).append(paramMap);
    ((StringBuilder)localObject1).append(" link.href = %s; if (d.head != null) { d.head.appendChild(link); } })(document);");
    injectDeferredObject(paramString, null, ((StringBuilder)localObject1).toString(), null);
  }
  
  public void injectDeferredObject(final String paramString1, final ContentWorld paramContentWorld, String paramString2, final ValueCallback<String> paramValueCallback)
  {
    final String str;
    if ((paramContentWorld != null) && (!paramContentWorld.equals(ContentWorld.PAGE))) {
      str = UUID.randomUUID().toString();
    } else {
      str = null;
    }
    if (paramString2 != null)
    {
      Object localObject = new JSONArray();
      ((JSONArray)localObject).put(paramString1);
      localObject = ((JSONArray)localObject).toString();
      paramString2 = String.format(paramString2, new Object[] { ((String)localObject).substring(1, ((String)localObject).length() - 1) });
    }
    else
    {
      paramString2 = paramString1;
    }
    if ((str != null) && (paramValueCallback != null))
    {
      evaluateJavaScriptContentWorldCallbacks.put(str, paramValueCallback);
      paramString2 = new StringBuilder();
      paramString2.append("_flutter_inappwebview_");
      paramString2.append(Math.round(Math.random() * 1000000.0D));
      paramString1 = Util.replaceAll("var $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME = null;try {  $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME = eval($IN_APP_WEBVIEW_PLACEHOLDER_VALUE);} catch(e) {  console.error(e);}window.flutter_inappwebview.callHandler('evaluateJavaScriptWithContentWorld', {'value': $IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME, 'resultUuid': '$IN_APP_WEBVIEW_RESULT_UUID'});", "$IN_APP_WEBVIEW_VARIABLE_RANDOM_NAME", paramString2.toString()).replace("$IN_APP_WEBVIEW_PLACEHOLDER_VALUE", UserContentController.escapeCode(paramString1)).replace("$IN_APP_WEBVIEW_RESULT_UUID", str);
    }
    else
    {
      paramString1 = paramString2;
    }
    mainLooperHandler.post(new Runnable()
    {
      public void run()
      {
        String str = this$0.userContentController.generateCodeForScriptEvaluation(paramString1, paramContentWorld);
        this$0.evaluateJavascript(str, new ValueCallback()
        {
          public void onReceiveValue(String paramAnonymous2String)
          {
            Object localObject = InAppWebView.10.this;
            if (val$resultUuid == null)
            {
              localObject = val$resultCallback;
              if (localObject != null) {
                ((ValueCallback)localObject).onReceiveValue(paramAnonymous2String);
              }
            }
          }
        });
      }
    });
  }
  
  public void injectJavascriptFileFromUrl(String paramString, Map<String, Object> paramMap)
  {
    Object localObject1 = "";
    Object localObject2 = localObject1;
    if (paramMap != null)
    {
      localObject2 = (String)paramMap.get("type");
      if (localObject2 != null)
      {
        localObject1 = g.g("", " script.type = '");
        ((StringBuilder)localObject1).append(((String)localObject2).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      Object localObject3 = (String)paramMap.get("id");
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject2 = ((String)localObject3).replaceAll("'", "\\\\'");
        localObject2 = j.k(j.k(j.k((String)localObject1, " script.id = '", (String)localObject2, "'; "), " script.onload = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptLoaded', '", (String)localObject2, "');  }};"), " script.onerror = function() {  if (window.flutter_inappwebview != null) {    window.flutter_inappwebview.callHandler('onInjectedScriptError', '", (String)localObject2, "');  }};");
      }
      localObject1 = (Boolean)paramMap.get("async");
      localObject3 = localObject2;
      if (localObject1 != null)
      {
        localObject3 = localObject2;
        if (((Boolean)localObject1).booleanValue()) {
          localObject3 = g.d((String)localObject2, " script.async = true; ");
        }
      }
      localObject2 = (Boolean)paramMap.get("defer");
      localObject1 = localObject3;
      if (localObject2 != null)
      {
        localObject1 = localObject3;
        if (((Boolean)localObject2).booleanValue()) {
          localObject1 = g.d((String)localObject3, " script.defer = true; ");
        }
      }
      localObject3 = (String)paramMap.get("crossOrigin");
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject1 = g.g((String)localObject1, " script.crossOrigin = '");
        ((StringBuilder)localObject1).append(((String)localObject3).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
      localObject3 = (String)paramMap.get("integrity");
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = g.g((String)localObject2, " script.integrity = '");
        ((StringBuilder)localObject1).append(((String)localObject3).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      localObject3 = (Boolean)paramMap.get("noModule");
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject2 = localObject1;
        if (((Boolean)localObject3).booleanValue()) {
          localObject2 = g.d((String)localObject1, " script.noModule = true; ");
        }
      }
      localObject3 = (String)paramMap.get("nonce");
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        localObject1 = g.g((String)localObject2, " script.nonce = '");
        ((StringBuilder)localObject1).append(((String)localObject3).replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      paramMap = (String)paramMap.get("referrerPolicy");
      localObject2 = localObject1;
      if (paramMap != null)
      {
        localObject1 = g.g((String)localObject1, " script.referrerPolicy = '");
        ((StringBuilder)localObject1).append(paramMap.replaceAll("'", "\\\\'"));
        ((StringBuilder)localObject1).append("'; ");
        localObject2 = ((StringBuilder)localObject1).toString();
      }
    }
    injectDeferredObject(paramString, null, g.e("(function(d) { var script = d.createElement('script'); ", (String)localObject2, " script.src = %s; if (d.body != null) { d.body.appendChild(script); } })(document);"), null);
  }
  
  public boolean isInFullscreen()
  {
    return inFullscreen;
  }
  
  public boolean isLoading()
  {
    return isLoading;
  }
  
  public void isSecureContext(final ValueCallback<Boolean> paramValueCallback)
  {
    evaluateJavascript("window.isSecureContext", new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        ValueCallback localValueCallback;
        if ((paramAnonymousString != null) && (!paramAnonymousString.isEmpty()) && (!paramAnonymousString.equalsIgnoreCase("null")) && (!paramAnonymousString.equalsIgnoreCase("false"))) {
          localValueCallback = paramValueCallback;
        }
        for (paramAnonymousString = Boolean.TRUE;; paramAnonymousString = Boolean.FALSE)
        {
          localValueCallback.onReceiveValue(paramAnonymousString);
          return;
          localValueCallback = paramValueCallback;
        }
      }
    });
  }
  
  public void loadFile(String paramString)
  {
    InAppWebViewFlutterPlugin localInAppWebViewFlutterPlugin = plugin;
    if (localInAppWebViewFlutterPlugin == null) {
      return;
    }
    loadUrl(Util.getUrlAsset(localInAppWebViewFlutterPlugin, paramString));
  }
  
  public void loadUrl(URLRequest paramURLRequest)
  {
    String str1 = paramURLRequest.getUrl();
    String str2 = paramURLRequest.getMethod();
    if ((str2 != null) && (str2.equals("POST")))
    {
      postUrl(str1, paramURLRequest.getBody());
      return;
    }
    paramURLRequest = paramURLRequest.getHeaders();
    if (paramURLRequest != null)
    {
      loadUrl(str1, paramURLRequest);
      return;
    }
    loadUrl(str1);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu)
  {
    super.onCreateContextMenu(paramContextMenu);
    sendOnCreateContextMenuEvent();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    paramEditorInfo = super.onCreateInputConnection(paramEditorInfo);
    if ((paramEditorInfo == null) && (!customSettings.useHybridComposition.booleanValue()))
    {
      View localView = containerView;
      if (localView != null) {
        localView.getHandler().postDelayed(new Runnable()
        {
          public void run()
          {
            InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
            if (localInputMethodManager != null) {}
            try
            {
              bool = localInputMethodManager.isAcceptingText();
            }
            catch (Exception localException)
            {
              boolean bool;
              View localView;
              for (;;) {}
            }
            bool = false;
            localView = containerView;
            if ((localView != null) && (localInputMethodManager != null) && (!bool)) {
              localInputMethodManager.hideSoftInputFromWindow(localView.getWindowToken(), 2);
            }
          }
        }, 128L);
      }
    }
    return paramEditorInfo;
  }
  
  public void onFloatingActionGlobalLayout(int paramInt1, int paramInt2)
  {
    int i = getWidth();
    getHeight();
    int j = floatingContextMenu.getWidth();
    int k = floatingContextMenu.getHeight();
    int m = paramInt1 - j / 2;
    if (m < 0)
    {
      paramInt1 = 0;
    }
    else
    {
      paramInt1 = m;
      if (m + j > i) {
        paramInt1 = i - j;
      }
    }
    float f1 = paramInt2 - k * 1.5F;
    float f2 = f1;
    if (f1 < 0.0F) {
      f2 = paramInt2 + k;
    }
    LinearLayout localLinearLayout = floatingContextMenu;
    paramInt2 = getScrollX();
    m = (int)f2;
    updateViewLayout(localLinearLayout, new AbsoluteLayout.LayoutParams(-2, -2, paramInt2 + paramInt1, getScrollY() + m));
    mainLooperHandler.post(new Runnable()
    {
      public void run()
      {
        LinearLayout localLinearLayout = floatingContextMenu;
        if (localLinearLayout != null)
        {
          localLinearLayout.setVisibility(0);
          floatingContextMenu.animate().alpha(1.0F).setDuration(100L).setListener(null);
        }
      }
    });
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
    boolean bool1 = canScrollHorizontally();
    boolean bool2 = true;
    if ((bool1) && (paramBoolean1)) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    if ((canScrollVertically()) && (paramBoolean2)) {
      paramBoolean2 = bool2;
    } else {
      paramBoolean2 = false;
    }
    Object localObject = getParent();
    if (((localObject instanceof PullToRefreshLayout)) && (paramBoolean2) && (paramInt2 <= 10))
    {
      localObject = (PullToRefreshLayout)localObject;
      setOverScrollMode(2);
      ((y1.e)localObject).setEnabled(settings.enabled.booleanValue());
      setOverScrollMode(customSettings.overScrollMode.intValue());
    }
    if ((paramBoolean1) || (paramBoolean2))
    {
      localObject = channelDelegate;
      if (localObject != null) {
        ((WebViewChannelDelegate)localObject).onOverScrolled(paramInt1, paramInt2, paramBoolean1, paramBoolean2);
      }
    }
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = floatingContextMenu;
    if (localObject != null)
    {
      ((View)localObject).setAlpha(0.0F);
      floatingContextMenu.setVisibility(8);
    }
    localObject = channelDelegate;
    if (localObject != null) {
      ((WebViewChannelDelegate)localObject).onScrollChanged(paramInt1, paramInt2);
    }
  }
  
  public void onScrollStopped()
  {
    if (floatingContextMenu != null) {
      adjustFloatingContextMenuPosition();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    lastTouch = new Point((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    Object localObject = getParent();
    if ((localObject instanceof PullToRefreshLayout))
    {
      localObject = (PullToRefreshLayout)localObject;
      if (paramMotionEvent.getActionMasked() == 0) {
        ((y1.e)localObject).setEnabled(false);
      }
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void onWindowVisibilityChanged(int paramInt)
  {
    if (customSettings.allowBackgroundAudioPlaying.booleanValue())
    {
      if (paramInt != 8) {
        super.onWindowVisibilityChanged(0);
      }
      return;
    }
    super.onWindowVisibilityChanged(paramInt);
  }
  
  public void postWebMessage(WebMessage paramWebMessage, Uri paramUri, ValueCallback<String> paramValueCallback)
  {
    throw new UnsupportedOperationException();
  }
  
  public void prepare()
  {
    Object localObject1 = plugin;
    if (localObject1 != null) {
      webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(customSettings.webViewAssetLoader, (InAppWebViewFlutterPlugin)localObject1, getContext());
    }
    localObject1 = new JavaScriptBridgeInterface(this);
    javaScriptBridgeInterface = ((JavaScriptBridgeInterface)localObject1);
    addJavascriptInterface(localObject1, "flutter_inappwebview");
    localObject1 = new InAppWebViewChromeClient(plugin, this, inAppBrowserDelegate);
    inAppWebViewChromeClient = ((InAppWebViewChromeClient)localObject1);
    setWebChromeClient((WebChromeClient)localObject1);
    localObject1 = createWebViewClient(inAppBrowserDelegate);
    if ((localObject1 instanceof InAppWebViewClientCompat))
    {
      localObject1 = (InAppWebViewClientCompat)localObject1;
      inAppWebViewClientCompat = ((InAppWebViewClientCompat)localObject1);
    }
    else
    {
      if (!(localObject1 instanceof InAppWebViewClient)) {
        break label128;
      }
      localObject1 = (InAppWebViewClient)localObject1;
      inAppWebViewClient = ((InAppWebViewClient)localObject1);
    }
    setWebViewClient((WebViewClient)localObject1);
    label128:
    int i = Build.VERSION.SDK_INT;
    if ((i >= 29) && (x6.b.c0("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")))
    {
      localObject1 = new InAppWebViewRenderProcessClient();
      inAppWebViewRenderProcessClient = ((InAppWebViewRenderProcessClient)localObject1);
      p.f(this, (InAppWebViewRenderProcessClient)localObject1);
    }
    if ((windowId == null) || (!x6.b.c0("DOCUMENT_START_SCRIPT"))) {
      prepareAndAddUserScripts();
    }
    if (customSettings.useOnDownloadStart.booleanValue()) {
      setDownloadListener(new DownloadStartListener());
    }
    Object localObject2 = getSettings();
    ((WebSettings)localObject2).setJavaScriptEnabled(customSettings.javaScriptEnabled.booleanValue());
    ((WebSettings)localObject2).setJavaScriptCanOpenWindowsAutomatically(customSettings.javaScriptCanOpenWindowsAutomatically.booleanValue());
    ((WebSettings)localObject2).setBuiltInZoomControls(customSettings.builtInZoomControls.booleanValue());
    ((WebSettings)localObject2).setDisplayZoomControls(customSettings.displayZoomControls.booleanValue());
    ((WebSettings)localObject2).setSupportMultipleWindows(customSettings.supportMultipleWindows.booleanValue());
    if (x6.b.c0("SAFE_BROWSING_ENABLE")) {
      n.d((WebSettings)localObject2, customSettings.safeBrowsingEnabled.booleanValue());
    } else if (i >= 26) {
      c0.b.x((WebSettings)localObject2, customSettings.safeBrowsingEnabled.booleanValue());
    }
    ((WebSettings)localObject2).setMediaPlaybackRequiresUserGesture(customSettings.mediaPlaybackRequiresUserGesture.booleanValue());
    ((WebSettings)localObject2).setDatabaseEnabled(customSettings.databaseEnabled.booleanValue());
    ((WebSettings)localObject2).setDomStorageEnabled(customSettings.domStorageEnabled.booleanValue());
    localObject1 = customSettings.userAgent;
    if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
      localObject1 = customSettings.userAgent;
    } else {
      localObject1 = WebSettings.getDefaultUserAgent(getContext());
    }
    ((WebSettings)localObject2).setUserAgentString((String)localObject1);
    localObject1 = customSettings.applicationNameForUserAgent;
    if ((localObject1 != null) && (!((String)localObject1).isEmpty()))
    {
      localObject1 = customSettings.userAgent;
      if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
        localObject1 = customSettings.userAgent;
      } else {
        localObject1 = WebSettings.getDefaultUserAgent(getContext());
      }
      localObject1 = g.g((String)localObject1, " ");
      ((StringBuilder)localObject1).append(customSettings.applicationNameForUserAgent);
      ((WebSettings)localObject2).setUserAgentString(((StringBuilder)localObject1).toString());
    }
    if (customSettings.clearCache.booleanValue()) {
      clearAllCache();
    } else if (customSettings.clearSessionCache.booleanValue()) {
      CookieManager.getInstance().removeSessionCookie();
    }
    CookieManager.getInstance().setAcceptThirdPartyCookies(this, customSettings.thirdPartyCookiesEnabled.booleanValue());
    ((WebSettings)localObject2).setLoadWithOverviewMode(customSettings.loadWithOverviewMode.booleanValue());
    ((WebSettings)localObject2).setUseWideViewPort(customSettings.useWideViewPort.booleanValue());
    ((WebSettings)localObject2).setSupportZoom(customSettings.supportZoom.booleanValue());
    ((WebSettings)localObject2).setTextZoom(customSettings.textZoom.intValue());
    boolean bool;
    if ((!customSettings.disableVerticalScroll.booleanValue()) && (customSettings.verticalScrollBarEnabled.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    setVerticalScrollBarEnabled(bool);
    if ((!customSettings.disableHorizontalScroll.booleanValue()) && (customSettings.horizontalScrollBarEnabled.booleanValue())) {
      bool = true;
    } else {
      bool = false;
    }
    setHorizontalScrollBarEnabled(bool);
    if (customSettings.transparentBackground.booleanValue()) {
      setBackgroundColor(0);
    }
    localObject1 = customSettings.mixedContentMode;
    if (localObject1 != null) {
      ((WebSettings)localObject2).setMixedContentMode(((Integer)localObject1).intValue());
    }
    ((WebSettings)localObject2).setAllowContentAccess(customSettings.allowContentAccess.booleanValue());
    ((WebSettings)localObject2).setAllowFileAccess(customSettings.allowFileAccess.booleanValue());
    ((WebSettings)localObject2).setAllowFileAccessFromFileURLs(customSettings.allowFileAccessFromFileURLs.booleanValue());
    ((WebSettings)localObject2).setAllowUniversalAccessFromFileURLs(customSettings.allowUniversalAccessFromFileURLs.booleanValue());
    setCacheEnabled(customSettings.cacheEnabled.booleanValue());
    localObject1 = customSettings.appCachePath;
    if ((localObject1 != null) && (!((String)localObject1).isEmpty()) && (customSettings.cacheEnabled.booleanValue())) {
      Util.invokeMethodIfExists(localObject2, "setAppCachePath", new Object[] { customSettings.appCachePath });
    }
    ((WebSettings)localObject2).setBlockNetworkImage(customSettings.blockNetworkImage.booleanValue());
    ((WebSettings)localObject2).setBlockNetworkLoads(customSettings.blockNetworkLoads.booleanValue());
    localObject1 = customSettings.cacheMode;
    if (localObject1 != null) {
      ((WebSettings)localObject2).setCacheMode(((Integer)localObject1).intValue());
    }
    ((WebSettings)localObject2).setCursiveFontFamily(customSettings.cursiveFontFamily);
    ((WebSettings)localObject2).setDefaultFixedFontSize(customSettings.defaultFixedFontSize.intValue());
    ((WebSettings)localObject2).setDefaultFontSize(customSettings.defaultFontSize.intValue());
    ((WebSettings)localObject2).setDefaultTextEncodingName(customSettings.defaultTextEncodingName);
    if (customSettings.disabledActionModeMenuItems != null) {
      if (x6.b.c0("DISABLED_ACTION_MODE_MENU_ITEMS")) {
        n.b((WebSettings)localObject2, customSettings.disabledActionModeMenuItems.intValue());
      } else if (i >= 24) {
        a0.e.i((WebSettings)localObject2, customSettings.disabledActionModeMenuItems.intValue());
      }
    }
    ((WebSettings)localObject2).setFantasyFontFamily(customSettings.fantasyFontFamily);
    ((WebSettings)localObject2).setFixedFontFamily(customSettings.fixedFontFamily);
    if (customSettings.forceDark != null) {
      if (x6.b.c0("FORCE_DARK")) {
        n.c((WebSettings)localObject2, customSettings.forceDark.intValue());
      } else if (i >= 29) {
        w.o((WebSettings)localObject2, customSettings.forceDark.intValue());
      }
    }
    if ((customSettings.forceDarkStrategy != null) && (x6.b.c0("FORCE_DARK_STRATEGY")))
    {
      int j = customSettings.forceDarkStrategy.intValue();
      if (i0.H.d()) {
        ((WebSettingsBoundaryInterface)aa).setForceDarkBehavior(j);
      } else {
        throw i0.a();
      }
    }
    ((WebSettings)localObject2).setGeolocationEnabled(customSettings.geolocationEnabled.booleanValue());
    localObject1 = customSettings.layoutAlgorithm;
    if (localObject1 != null)
    {
      localObject1.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
      ((WebSettings)localObject2).setLayoutAlgorithm(customSettings.layoutAlgorithm);
    }
    ((WebSettings)localObject2).setLoadsImagesAutomatically(customSettings.loadsImagesAutomatically.booleanValue());
    ((WebSettings)localObject2).setMinimumFontSize(customSettings.minimumFontSize.intValue());
    ((WebSettings)localObject2).setMinimumLogicalFontSize(customSettings.minimumLogicalFontSize.intValue());
    setInitialScale(customSettings.initialScale.intValue());
    ((WebSettings)localObject2).setNeedInitialFocus(customSettings.needInitialFocus.booleanValue());
    if (x6.b.c0("OFF_SCREEN_PRERASTER"))
    {
      bool = customSettings.offscreenPreRaster.booleanValue();
      i0.a.getClass();
      c.k((WebSettings)localObject2, bool);
    }
    else
    {
      ((WebSettings)localObject2).setOffscreenPreRaster(customSettings.offscreenPreRaster.booleanValue());
    }
    ((WebSettings)localObject2).setSansSerifFontFamily(customSettings.sansSerifFontFamily);
    ((WebSettings)localObject2).setSerifFontFamily(customSettings.serifFontFamily);
    ((WebSettings)localObject2).setStandardFontFamily(customSettings.standardFontFamily);
    localObject1 = customSettings.preferredContentMode;
    if ((localObject1 != null) && (((Integer)localObject1).intValue() == PreferredContentModeOptionType.DESKTOP.toValue())) {
      setDesktopMode(true);
    }
    ((WebSettings)localObject2).setSaveFormData(customSettings.saveFormData.booleanValue());
    if (customSettings.incognito.booleanValue()) {
      setIncognito(true);
    }
    if (customSettings.useHybridComposition.booleanValue()) {
      if (customSettings.hardwareAcceleration.booleanValue()) {
        setLayerType(2, null);
      } else {
        setLayerType(0, null);
      }
    }
    localObject1 = customSettings.regexToCancelSubFramesLoading;
    if (localObject1 != null) {
      regexToCancelSubFramesLoadingCompiled = Pattern.compile((String)localObject1);
    }
    setScrollBarStyle(customSettings.scrollBarStyle.intValue());
    localObject1 = customSettings;
    Object localObject3 = scrollBarDefaultDelayBeforeFade;
    if (localObject3 != null) {
      setScrollBarDefaultDelayBeforeFade(((Integer)localObject3).intValue());
    } else {
      scrollBarDefaultDelayBeforeFade = Integer.valueOf(getScrollBarDefaultDelayBeforeFade());
    }
    setScrollbarFadingEnabled(customSettings.scrollbarFadingEnabled.booleanValue());
    localObject3 = customSettings;
    localObject1 = scrollBarFadeDuration;
    if (localObject1 != null) {
      setScrollBarFadeDuration(((Integer)localObject1).intValue());
    } else {
      scrollBarFadeDuration = Integer.valueOf(getScrollBarFadeDuration());
    }
    setVerticalScrollbarPosition(customSettings.verticalScrollbarPosition.intValue());
    if (i >= 29)
    {
      if (customSettings.verticalScrollbarThumbColor != null) {
        setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(customSettings.verticalScrollbarThumbColor)));
      }
      if (customSettings.verticalScrollbarTrackColor != null) {
        setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(customSettings.verticalScrollbarTrackColor)));
      }
      if (customSettings.horizontalScrollbarThumbColor != null) {
        setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(customSettings.horizontalScrollbarThumbColor)));
      }
      if (customSettings.horizontalScrollbarTrackColor != null) {
        setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(customSettings.horizontalScrollbarTrackColor)));
      }
    }
    setOverScrollMode(customSettings.overScrollMode.intValue());
    localObject1 = customSettings.networkAvailable;
    if (localObject1 != null) {
      setNetworkAvailable(((Boolean)localObject1).booleanValue());
    }
    localObject1 = customSettings.rendererPriorityPolicy;
    if ((localObject1 != null) && (!((Map)localObject1).isEmpty()) && (i >= 26)) {
      setRendererPriorityPolicy(((Integer)customSettings.rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean)customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
    }
    if ((x6.b.c0("ALGORITHMIC_DARKENING")) && (i >= 29))
    {
      bool = customSettings.algorithmicDarkeningAllowed.booleanValue();
      if (i0.D.d()) {
        ((WebSettingsBoundaryInterface)aa).setAlgorithmicDarkeningAllowed(bool);
      } else {
        throw i0.a();
      }
    }
    if (x6.b.c0("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY"))
    {
      bool = customSettings.enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
      if (i0.M.d()) {
        ((WebSettingsBoundaryInterface)aa).setEnterpriseAuthenticationAppLinkPolicyEnabled(bool);
      } else {
        throw i0.a();
      }
    }
    if ((customSettings.requestedWithHeaderOriginAllowList != null) && (x6.b.c0("REQUESTED_WITH_HEADER_ALLOW_LIST")))
    {
      localObject1 = customSettings.requestedWithHeaderOriginAllowList;
      if (i0.O.d()) {
        ((WebSettingsBoundaryInterface)aa).setRequestedWithHeaderOriginAllowList((Set)localObject1);
      } else {
        throw i0.a();
      }
    }
    contentBlockerHandler.getRuleList().clear();
    localObject1 = customSettings.contentBlockers.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Map)((Iterator)localObject1).next();
      localObject2 = ContentBlockerTrigger.fromMap((Map)((Map)localObject3).get("trigger"));
      localObject3 = ContentBlockerAction.fromMap((Map)((Map)localObject3).get("action"));
      contentBlockerHandler.getRuleList().add(new ContentBlocker((ContentBlockerTrigger)localObject2, (ContentBlockerAction)localObject3));
    }
    setFindListener(new WebView.FindListener()
    {
      public void onFindResultReceived(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean)
      {
        Object localObject = findInteractionController;
        if (localObject != null)
        {
          localObject = channelDelegate;
          if (localObject != null) {
            ((FindInteractionChannelDelegate)localObject).onFindResultReceived(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean);
          }
        }
        localObject = channelDelegate;
        if (localObject != null) {
          ((WebViewChannelDelegate)localObject).onFindResultReceived(paramAnonymousInt1, paramAnonymousInt2, paramAnonymousBoolean);
        }
      }
    });
    gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener()
    {
      public boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        InAppWebView localInAppWebView = InAppWebView.this;
        if (floatingContextMenu != null) {
          localInAppWebView.hideContextMenu();
        }
        return super.onSingleTapUp(paramAnonymousMotionEvent);
      }
    });
    checkScrollStoppedTask = new Runnable()
    {
      public void run()
      {
        int i = getScrollY();
        InAppWebView localInAppWebView = InAppWebView.this;
        if (initialPositionScrollStoppedTask - i == 0)
        {
          localInAppWebView.onScrollStopped();
        }
        else
        {
          initialPositionScrollStoppedTask = localInAppWebView.getScrollY();
          localInAppWebView = InAppWebView.this;
          mainLooperHandler.postDelayed(checkScrollStoppedTask, newCheckScrollStoppedTask);
        }
      }
    };
    if (!customSettings.useHybridComposition.booleanValue()) {
      checkContextMenuShouldBeClosedTask = new Runnable()
      {
        public void run()
        {
          InAppWebView localInAppWebView = InAppWebView.this;
          if (floatingContextMenu != null) {
            localInAppWebView.evaluateJavascript("(function(){  var txt;  if (window.getSelection) {    txt = window.getSelection().toString();  } else if (window.document.getSelection) {    txt = window.document.getSelection().toString();  } else if (window.document.selection) {    txt = window.document.selection.createRange().text;  }var activeEl = document.activeElement;var nodeName = (activeEl != null) ? activeEl.nodeName.toLowerCase() : '';var isActiveElementInputEditable = activeEl != null && (activeEl.nodeType == 1 && (nodeName == 'textarea' || (nodeName == 'input' && /^(?:text|email|number|search|tel|url|password)$/i.test(activeEl.type != null ? activeEl.type : 'text')))) && !activeEl.disabled && !activeEl.readOnly;var isActiveElementEditable = isActiveElementInputEditable || (activeEl != null && activeEl.isContentEditable) || document.designMode === 'on';  return txt === '' && !isActiveElementEditable;})();", new ValueCallback()
            {
              public void onReceiveValue(String paramAnonymous2String)
              {
                if ((paramAnonymous2String != null) && (!paramAnonymous2String.equals("true")))
                {
                  paramAnonymous2String = InAppWebView.this;
                  mainLooperHandler.postDelayed(checkContextMenuShouldBeClosedTask, newCheckContextMenuShouldBeClosedTaskTask);
                }
                else
                {
                  paramAnonymous2String = InAppWebView.this;
                  if (floatingContextMenu != null) {
                    paramAnonymous2String.hideContextMenu();
                  }
                }
              }
            });
          }
        }
      };
    }
    setOnTouchListener(new View.OnTouchListener()
    {
      public float m_downX;
      public float m_downY;
      
      public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        gestureDetector.onTouchEvent(paramAnonymousMotionEvent);
        int i = paramAnonymousMotionEvent.getAction();
        boolean bool = true;
        if (i == 1) {
          checkScrollStoppedTask.run();
        }
        if ((customSettings.disableHorizontalScroll.booleanValue()) && (customSettings.disableVerticalScroll.booleanValue()))
        {
          if (paramAnonymousMotionEvent.getAction() != 2) {
            bool = false;
          }
          return bool;
        }
        if ((customSettings.disableHorizontalScroll.booleanValue()) || (customSettings.disableVerticalScroll.booleanValue()))
        {
          i = paramAnonymousMotionEvent.getAction();
          if (i != 0)
          {
            if ((i == 1) || (i == 2) || (i == 3))
            {
              float f1;
              float f2;
              if (customSettings.disableHorizontalScroll.booleanValue())
              {
                f1 = m_downX;
                f2 = paramAnonymousMotionEvent.getY();
              }
              else
              {
                f1 = paramAnonymousMotionEvent.getX();
                f2 = m_downY;
              }
              paramAnonymousMotionEvent.setLocation(f1, f2);
            }
          }
          else
          {
            m_downX = paramAnonymousMotionEvent.getX();
            m_downY = paramAnonymousMotionEvent.getY();
          }
        }
        return false;
      }
    });
    setOnLongClickListener(new View.OnLongClickListener()
    {
      public boolean onLongClick(View paramAnonymousView)
      {
        HitTestResult localHitTestResult = HitTestResult.fromWebViewHitTestResult(getHitTestResult());
        paramAnonymousView = channelDelegate;
        if (paramAnonymousView != null) {
          paramAnonymousView.onLongPressHitTestResult(localHitTestResult);
        }
        return false;
      }
    });
  }
  
  public void prepareAndAddUserScripts()
  {
    userContentController.addPluginScript(PromisePolyfillJS.PROMISE_POLYFILL_JS_PLUGIN_SCRIPT);
    userContentController.addPluginScript(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_JS_PLUGIN_SCRIPT);
    userContentController.addPluginScript(PrintJS.PRINT_JS_PLUGIN_SCRIPT);
    userContentController.addPluginScript(OnWindowBlurEventJS.ON_WINDOW_BLUR_EVENT_JS_PLUGIN_SCRIPT);
    userContentController.addPluginScript(OnWindowFocusEventJS.ON_WINDOW_FOCUS_EVENT_JS_PLUGIN_SCRIPT);
    interceptOnlyAsyncAjaxRequestsPluginScript = InterceptAjaxRequestJS.createInterceptOnlyAsyncAjaxRequestsPluginScript(customSettings.interceptOnlyAsyncAjaxRequests.booleanValue());
    if (customSettings.useShouldInterceptAjaxRequest.booleanValue())
    {
      userContentController.addPluginScript(interceptOnlyAsyncAjaxRequestsPluginScript);
      userContentController.addPluginScript(InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
    }
    if (customSettings.useShouldInterceptFetchRequest.booleanValue()) {
      userContentController.addPluginScript(InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
    }
    if (customSettings.useOnLoadResource.booleanValue()) {
      userContentController.addPluginScript(OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
    }
    if (!customSettings.useHybridComposition.booleanValue()) {
      userContentController.addPluginScript(PluginScriptsUtil.CHECK_GLOBAL_KEY_DOWN_EVENT_TO_HIDE_CONTEXT_MENU_JS_PLUGIN_SCRIPT);
    }
    userContentController.addUserOnlyScripts(initialUserOnlyScripts);
  }
  
  public String printCurrentPage(PrintJobSettings paramPrintJobSettings)
  {
    Object localObject1 = plugin;
    if (localObject1 != null)
    {
      localObject1 = activity;
      if (localObject1 != null)
      {
        PrintManager localPrintManager = (PrintManager)((Activity)localObject1).getSystemService("print");
        if (localPrintManager != null)
        {
          PrintAttributes.Builder localBuilder = new PrintAttributes.Builder();
          Object localObject2 = new StringBuilder();
          if (getTitle() != null) {
            localObject1 = getTitle();
          } else {
            localObject1 = getUrl();
          }
          localObject2 = g.f((StringBuilder)localObject2, (String)localObject1, " Document");
          Object localObject3 = localObject2;
          if (paramPrintJobSettings != null)
          {
            localObject3 = jobName;
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              localObject1 = localObject2;
              if (!((String)localObject3).isEmpty()) {
                localObject1 = jobName;
              }
            }
            localObject2 = orientation;
            if (localObject2 != null)
            {
              int i = ((Integer)localObject2).intValue();
              if (i != 0)
              {
                if (i != 1) {
                  break label173;
                }
                localObject2 = PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
              }
              else
              {
                localObject2 = PrintAttributes.MediaSize.UNKNOWN_PORTRAIT;
              }
              localBuilder.setMediaSize((PrintAttributes.MediaSize)localObject2);
            }
            label173:
            localObject2 = mediaSize;
            if (localObject2 != null) {
              localBuilder.setMediaSize(((MediaSizeExt)localObject2).toMediaSize());
            }
            localObject2 = colorMode;
            if (localObject2 != null) {
              localBuilder.setColorMode(((Integer)localObject2).intValue());
            }
            localObject2 = duplexMode;
            if (localObject2 != null) {
              localBuilder.setDuplexMode(((Integer)localObject2).intValue());
            }
            localObject2 = resolution;
            localObject3 = localObject1;
            if (localObject2 != null)
            {
              localBuilder.setResolution(((ResolutionExt)localObject2).toResolution());
              localObject3 = localObject1;
            }
          }
          localObject2 = localPrintManager.print((String)localObject3, createPrintDocumentAdapter((String)localObject3), localBuilder.build());
          if ((paramPrintJobSettings != null) && (handledByClient.booleanValue()) && (plugin.printJobManager != null))
          {
            localObject1 = UUID.randomUUID().toString();
            paramPrintJobSettings = new PrintJobController((String)localObject1, (PrintJob)localObject2, paramPrintJobSettings, plugin);
            plugin.printJobManager.jobs.put(id, paramPrintJobSettings);
            return (String)localObject1;
          }
        }
        else
        {
          Log.e("InAppWebView", "No PrintManager available");
        }
      }
    }
    return null;
  }
  
  public ActionMode rebuildActionMode(final ActionMode paramActionMode, final ActionMode.Callback paramCallback)
  {
    if (!customSettings.useHybridComposition.booleanValue())
    {
      localObject1 = containerView;
      if (localObject1 != null) {
        onWindowFocusChanged(((View)localObject1).isFocused());
      }
    }
    final Object localObject1 = floatingContextMenu;
    final int i = 0;
    int j;
    if (localObject1 != null)
    {
      hideContextMenu();
      j = 1;
    }
    else
    {
      j = 0;
    }
    if (paramActionMode == null) {
      return null;
    }
    localObject1 = paramActionMode.getMenu();
    paramActionMode.hide(3000L);
    Object localObject2 = new ArrayList();
    for (final int k = 0; k < ((Menu)localObject1).size(); k++) {
      ((ArrayList)localObject2).add(((Menu)localObject1).getItem(k));
    }
    ((Menu)localObject1).clear();
    paramActionMode.finish();
    if (customSettings.disableContextMenu.booleanValue()) {
      return paramActionMode;
    }
    localObject1 = (LinearLayout)LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode, this, false);
    floatingContextMenu = ((LinearLayout)localObject1);
    LinearLayout localLinearLayout = (LinearLayout)((HorizontalScrollView)((ViewGroup)localObject1).getChildAt(0)).getChildAt(0);
    localObject1 = new ArrayList();
    Object localObject3 = new ContextMenuSettings();
    final Object localObject4 = contextMenu;
    final Object localObject5;
    if (localObject4 != null)
    {
      localObject4 = (List)((Map)localObject4).get("menuItems");
      localObject5 = (Map)contextMenu.get("settings");
      localObject1 = localObject4;
      if (localObject5 != null)
      {
        ((ContextMenuSettings)localObject3).parse((Map)localObject5);
        localObject1 = localObject4;
      }
    }
    localObject4 = localObject1;
    if (localObject1 == null) {
      localObject4 = new ArrayList();
    }
    localObject1 = hideDefaultSystemContextMenuItems;
    if ((localObject1 == null) || (!((Boolean)localObject1).booleanValue()))
    {
      localObject2 = ((ArrayList)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (MenuItem)((Iterator)localObject2).next();
        k = ((MenuItem)localObject1).getItemId();
        localObject5 = ((MenuItem)localObject1).getTitle().toString();
        localObject3 = (TextView)LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
        ((TextView)localObject3).setText((CharSequence)localObject5);
        ((View)localObject3).setOnClickListener(new View.OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            this$0.hideContextMenu();
            paramCallback.onActionItemClicked(paramActionMode, localObject1);
            paramAnonymousView = this$0.channelDelegate;
            if (paramAnonymousView != null) {
              paramAnonymousView.onContextMenuActionItemClicked(k, localObject5);
            }
          }
        });
        if (floatingContextMenu != null) {
          localLinearLayout.addView((View)localObject3);
        }
      }
    }
    paramCallback = ((List)localObject4).iterator();
    while (paramCallback.hasNext())
    {
      localObject1 = (Map)paramCallback.next();
      k = ((Integer)((Map)localObject1).get("id")).intValue();
      localObject4 = (String)((Map)localObject1).get("title");
      localObject1 = (TextView)LayoutInflater.from(getContext()).inflate(R.layout.floating_action_mode_item, this, false);
      ((TextView)localObject1).setText((CharSequence)localObject4);
      ((View)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          this$0.hideContextMenu();
          paramAnonymousView = this$0.channelDelegate;
          if (paramAnonymousView != null) {
            paramAnonymousView.onContextMenuActionItemClicked(k, localObject4);
          }
        }
      });
      if (floatingContextMenu != null) {
        localLinearLayout.addView((View)localObject1);
      }
    }
    paramCallback = lastTouch;
    if (paramCallback != null) {
      k = x;
    } else {
      k = 0;
    }
    if (paramCallback != null) {
      i = y;
    }
    contextMenuPoint = new Point(k, i);
    paramCallback = floatingContextMenu;
    if (paramCallback != null)
    {
      paramCallback.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
      {
        public void onGlobalLayout()
        {
          LinearLayout localLinearLayout = this$0.floatingContextMenu;
          if (localLinearLayout != null)
          {
            localLinearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this$0.getSettings().getJavaScriptEnabled()) {
              this$0.onScrollStopped();
            } else {
              this$0.onFloatingActionGlobalLayout(k, i);
            }
          }
        }
      });
      addView(floatingContextMenu, new AbsoluteLayout.LayoutParams(-2, -2, k, i));
      if (j != 0) {
        sendOnCreateContextMenuEvent();
      }
      paramCallback = checkContextMenuShouldBeClosedTask;
      if (paramCallback != null) {
        paramCallback.run();
      }
    }
    return paramActionMode;
  }
  
  public Map<String, Object> requestFocusNodeHref()
  {
    Object localObject = mHandler.obtainMessage();
    requestFocusNodeHref((Message)localObject);
    localObject = ((Message)localObject).peekData();
    HashMap localHashMap = new HashMap();
    localHashMap.put("src", ((BaseBundle)localObject).getString("src"));
    localHashMap.put("url", ((BaseBundle)localObject).getString("url"));
    localHashMap.put("title", ((BaseBundle)localObject).getString("title"));
    return localHashMap;
  }
  
  public Map<String, Object> requestImageRef()
  {
    Object localObject = mHandler.obtainMessage();
    requestImageRef((Message)localObject);
    Bundle localBundle = ((Message)localObject).peekData();
    localObject = new HashMap();
    ((HashMap)localObject).put("url", localBundle.getString("url"));
    return (Map<String, Object>)localObject;
  }
  
  public void scrollBy(Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean)
  {
    if (paramBoolean.booleanValue())
    {
      int i = getScrollX();
      paramInteger1 = PropertyValuesHolder.ofInt("scrollX", new int[] { paramInteger1.intValue() + i });
      i = getScrollY();
      ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { paramInteger1, PropertyValuesHolder.ofInt("scrollY", new int[] { paramInteger2.intValue() + i }) }).setDuration(300L).start();
    }
    else
    {
      scrollBy(paramInteger1.intValue(), paramInteger2.intValue());
    }
  }
  
  public void scrollTo(Integer paramInteger1, Integer paramInteger2, Boolean paramBoolean)
  {
    if (paramBoolean.booleanValue()) {
      ObjectAnimator.ofPropertyValuesHolder(this, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("scrollX", new int[] { paramInteger1.intValue() }), PropertyValuesHolder.ofInt("scrollY", new int[] { paramInteger2.intValue() }) }).setDuration(300L).start();
    } else {
      scrollTo(paramInteger1.intValue(), paramInteger2.intValue());
    }
  }
  
  public void setCacheEnabled(boolean paramBoolean)
  {
    WebSettings localWebSettings = getSettings();
    if (paramBoolean)
    {
      Context localContext = getContext();
      if (localContext != null)
      {
        Util.invokeMethodIfExists(localWebSettings, "setAppCachePath", new Object[] { localContext.getCacheDir().getAbsolutePath() });
        localWebSettings.setCacheMode(-1);
        Util.invokeMethodIfExists(localWebSettings, "setAppCacheEnabled", new Object[] { Boolean.TRUE });
      }
    }
    else
    {
      localWebSettings.setCacheMode(2);
      Util.invokeMethodIfExists(localWebSettings, "setAppCacheEnabled", new Object[] { Boolean.FALSE });
    }
  }
  
  public void setChannelDelegate(WebViewChannelDelegate paramWebViewChannelDelegate)
  {
    channelDelegate = paramWebViewChannelDelegate;
  }
  
  public void setContextMenu(Map<String, Object> paramMap)
  {
    contextMenu = paramMap;
  }
  
  public void setDesktopMode(boolean paramBoolean)
  {
    WebSettings localWebSettings = getSettings();
    String str = localWebSettings.getUserAgentString();
    if (paramBoolean) {
      str = str.replace("Mobile", "eliboM").replace("Android", "diordnA");
    } else {
      str = str.replace("eliboM", "Mobile").replace("diordnA", "Android");
    }
    localWebSettings.setUserAgentString(str);
    localWebSettings.setUseWideViewPort(paramBoolean);
    localWebSettings.setLoadWithOverviewMode(paramBoolean);
    localWebSettings.setSupportZoom(paramBoolean);
    localWebSettings.setBuiltInZoomControls(paramBoolean);
  }
  
  public void setInAppBrowserDelegate(InAppBrowserDelegate paramInAppBrowserDelegate)
  {
    inAppBrowserDelegate = paramInAppBrowserDelegate;
  }
  
  public void setInFullscreen(boolean paramBoolean)
  {
    inFullscreen = paramBoolean;
  }
  
  public void setIncognito(boolean paramBoolean)
  {
    WebSettings localWebSettings = getSettings();
    if (paramBoolean)
    {
      CookieManager.getInstance().removeAllCookies(null);
      localWebSettings.setCacheMode(2);
      Util.invokeMethodIfExists(localWebSettings, "setAppCacheEnabled", new Object[] { Boolean.FALSE });
      clearHistory();
      clearCache(true);
      clearFormData();
      localWebSettings.setSavePassword(false);
      localWebSettings.setSaveFormData(false);
    }
    else
    {
      localWebSettings.setCacheMode(-1);
      Util.invokeMethodIfExists(localWebSettings, "setAppCacheEnabled", new Object[] { Boolean.TRUE });
      localWebSettings.setSavePassword(true);
      localWebSettings.setSaveFormData(true);
    }
  }
  
  public void setPlugin(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void setSettings(InAppWebViewSettings paramInAppWebViewSettings, HashMap<String, Object> paramHashMap)
  {
    WebSettings localWebSettings = getSettings();
    Object localObject1;
    if (paramHashMap.get("javaScriptEnabled") != null)
    {
      localObject1 = customSettings.javaScriptEnabled;
      localObject2 = javaScriptEnabled;
      if (localObject1 != localObject2) {
        localWebSettings.setJavaScriptEnabled(((Boolean)localObject2).booleanValue());
      }
    }
    if (paramHashMap.get("useShouldInterceptAjaxRequest") != null)
    {
      localObject2 = customSettings.useShouldInterceptAjaxRequest;
      localObject1 = useShouldInterceptAjaxRequest;
      if (localObject2 != localObject1) {
        enablePluginScriptAtRuntime("flutter_inappwebview._useShouldInterceptAjaxRequest", ((Boolean)localObject1).booleanValue(), InterceptAjaxRequestJS.INTERCEPT_AJAX_REQUEST_JS_PLUGIN_SCRIPT);
      }
    }
    if (paramHashMap.get("interceptOnlyAsyncAjaxRequests") != null)
    {
      localObject2 = customSettings.interceptOnlyAsyncAjaxRequests;
      localObject1 = interceptOnlyAsyncAjaxRequests;
      if (localObject2 != localObject1) {
        enablePluginScriptAtRuntime("flutter_inappwebview._interceptOnlyAsyncAjaxRequests", ((Boolean)localObject1).booleanValue(), interceptOnlyAsyncAjaxRequestsPluginScript);
      }
    }
    if (paramHashMap.get("useShouldInterceptFetchRequest") != null)
    {
      localObject1 = customSettings.useShouldInterceptFetchRequest;
      localObject2 = useShouldInterceptFetchRequest;
      if (localObject1 != localObject2) {
        enablePluginScriptAtRuntime("flutter_inappwebview._useShouldInterceptFetchRequest", ((Boolean)localObject2).booleanValue(), InterceptFetchRequestJS.INTERCEPT_FETCH_REQUEST_JS_PLUGIN_SCRIPT);
      }
    }
    if (paramHashMap.get("useOnLoadResource") != null)
    {
      localObject2 = customSettings.useOnLoadResource;
      localObject1 = useOnLoadResource;
      if (localObject2 != localObject1) {
        enablePluginScriptAtRuntime("flutter_inappwebview._useOnLoadResource", ((Boolean)localObject1).booleanValue(), OnLoadResourceJS.ON_LOAD_RESOURCE_JS_PLUGIN_SCRIPT);
      }
    }
    if (paramHashMap.get("javaScriptCanOpenWindowsAutomatically") != null)
    {
      localObject2 = customSettings.javaScriptCanOpenWindowsAutomatically;
      localObject1 = javaScriptCanOpenWindowsAutomatically;
      if (localObject2 != localObject1) {
        localWebSettings.setJavaScriptCanOpenWindowsAutomatically(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("builtInZoomControls") != null)
    {
      localObject2 = customSettings.builtInZoomControls;
      localObject1 = builtInZoomControls;
      if (localObject2 != localObject1) {
        localWebSettings.setBuiltInZoomControls(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("displayZoomControls") != null)
    {
      localObject1 = customSettings.displayZoomControls;
      localObject2 = displayZoomControls;
      if (localObject1 != localObject2) {
        localWebSettings.setDisplayZoomControls(((Boolean)localObject2).booleanValue());
      }
    }
    if ((paramHashMap.get("safeBrowsingEnabled") != null) && (customSettings.safeBrowsingEnabled != safeBrowsingEnabled)) {
      if (x6.b.c0("SAFE_BROWSING_ENABLE")) {
        n.d(localWebSettings, safeBrowsingEnabled.booleanValue());
      } else if (Build.VERSION.SDK_INT >= 26) {
        c0.b.x(localWebSettings, safeBrowsingEnabled.booleanValue());
      }
    }
    if (paramHashMap.get("mediaPlaybackRequiresUserGesture") != null)
    {
      localObject2 = customSettings.mediaPlaybackRequiresUserGesture;
      localObject1 = mediaPlaybackRequiresUserGesture;
      if (localObject2 != localObject1) {
        localWebSettings.setMediaPlaybackRequiresUserGesture(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("databaseEnabled") != null)
    {
      localObject1 = customSettings.databaseEnabled;
      localObject2 = databaseEnabled;
      if (localObject1 != localObject2) {
        localWebSettings.setDatabaseEnabled(((Boolean)localObject2).booleanValue());
      }
    }
    if (paramHashMap.get("domStorageEnabled") != null)
    {
      localObject1 = customSettings.domStorageEnabled;
      localObject2 = domStorageEnabled;
      if (localObject1 != localObject2) {
        localWebSettings.setDomStorageEnabled(((Boolean)localObject2).booleanValue());
      }
    }
    if ((paramHashMap.get("userAgent") != null) && (!customSettings.userAgent.equals(userAgent)) && (!userAgent.isEmpty())) {
      localWebSettings.setUserAgentString(userAgent);
    }
    if ((paramHashMap.get("applicationNameForUserAgent") != null) && (!customSettings.applicationNameForUserAgent.equals(applicationNameForUserAgent)) && (!applicationNameForUserAgent.isEmpty()))
    {
      localObject2 = userAgent;
      if ((localObject2 != null) && (!((String)localObject2).isEmpty())) {
        localObject2 = userAgent;
      } else {
        localObject2 = WebSettings.getDefaultUserAgent(getContext());
      }
      localObject2 = g.g((String)localObject2, " ");
      ((StringBuilder)localObject2).append(customSettings.applicationNameForUserAgent);
      localWebSettings.setUserAgentString(((StringBuilder)localObject2).toString());
    }
    if ((paramHashMap.get("clearCache") != null) && (clearCache.booleanValue())) {
      clearAllCache();
    } else if ((paramHashMap.get("clearSessionCache") != null) && (clearSessionCache.booleanValue())) {
      CookieManager.getInstance().removeSessionCookie();
    }
    if ((paramHashMap.get("thirdPartyCookiesEnabled") != null) && (customSettings.thirdPartyCookiesEnabled != thirdPartyCookiesEnabled)) {
      CookieManager.getInstance().setAcceptThirdPartyCookies(this, thirdPartyCookiesEnabled.booleanValue());
    }
    if (paramHashMap.get("useWideViewPort") != null)
    {
      localObject2 = customSettings.useWideViewPort;
      localObject1 = useWideViewPort;
      if (localObject2 != localObject1) {
        localWebSettings.setUseWideViewPort(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("supportZoom") != null)
    {
      localObject1 = customSettings.supportZoom;
      localObject2 = supportZoom;
      if (localObject1 != localObject2) {
        localWebSettings.setSupportZoom(((Boolean)localObject2).booleanValue());
      }
    }
    if ((paramHashMap.get("textZoom") != null) && (!customSettings.textZoom.equals(textZoom))) {
      localWebSettings.setTextZoom(textZoom.intValue());
    }
    if (paramHashMap.get("verticalScrollBarEnabled") != null)
    {
      localObject2 = customSettings.verticalScrollBarEnabled;
      localObject1 = verticalScrollBarEnabled;
      if (localObject2 != localObject1) {
        setVerticalScrollBarEnabled(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("horizontalScrollBarEnabled") != null)
    {
      localObject1 = customSettings.horizontalScrollBarEnabled;
      localObject2 = horizontalScrollBarEnabled;
      if (localObject1 != localObject2) {
        setHorizontalScrollBarEnabled(((Boolean)localObject2).booleanValue());
      }
    }
    Object localObject2 = paramHashMap.get("transparentBackground");
    boolean bool1 = false;
    if (localObject2 != null)
    {
      localObject2 = customSettings.transparentBackground;
      localObject1 = transparentBackground;
      if (localObject2 != localObject1) {
        if (((Boolean)localObject1).booleanValue()) {
          setBackgroundColor(0);
        } else {
          setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
      }
    }
    int i = Build.VERSION.SDK_INT;
    if (paramHashMap.get("mixedContentMode") != null)
    {
      localObject2 = customSettings.mixedContentMode;
      if ((localObject2 == null) || (!((Integer)localObject2).equals(mixedContentMode))) {
        localWebSettings.setMixedContentMode(mixedContentMode.intValue());
      }
    }
    if (paramHashMap.get("supportMultipleWindows") != null)
    {
      localObject2 = customSettings.supportMultipleWindows;
      localObject1 = supportMultipleWindows;
      if (localObject2 != localObject1) {
        localWebSettings.setSupportMultipleWindows(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("useOnDownloadStart") != null)
    {
      localObject2 = customSettings.useOnDownloadStart;
      localObject1 = useOnDownloadStart;
      if (localObject2 != localObject1) {
        if (((Boolean)localObject1).booleanValue()) {
          setDownloadListener(new DownloadStartListener());
        } else {
          setDownloadListener(null);
        }
      }
    }
    if (paramHashMap.get("allowContentAccess") != null)
    {
      localObject2 = customSettings.allowContentAccess;
      localObject1 = allowContentAccess;
      if (localObject2 != localObject1) {
        localWebSettings.setAllowContentAccess(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("allowFileAccess") != null)
    {
      localObject2 = customSettings.allowFileAccess;
      localObject1 = allowFileAccess;
      if (localObject2 != localObject1) {
        localWebSettings.setAllowFileAccess(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("allowFileAccessFromFileURLs") != null)
    {
      localObject2 = customSettings.allowFileAccessFromFileURLs;
      localObject1 = allowFileAccessFromFileURLs;
      if (localObject2 != localObject1) {
        localWebSettings.setAllowFileAccessFromFileURLs(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("allowUniversalAccessFromFileURLs") != null)
    {
      localObject2 = customSettings.allowUniversalAccessFromFileURLs;
      localObject1 = allowUniversalAccessFromFileURLs;
      if (localObject2 != localObject1) {
        localWebSettings.setAllowUniversalAccessFromFileURLs(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("cacheEnabled") != null)
    {
      localObject2 = customSettings.cacheEnabled;
      localObject1 = cacheEnabled;
      if (localObject2 != localObject1) {
        setCacheEnabled(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("appCachePath") != null)
    {
      localObject2 = customSettings.appCachePath;
      if ((localObject2 == null) || (!((String)localObject2).equals(appCachePath))) {
        Util.invokeMethodIfExists(localWebSettings, "setAppCachePath", new Object[] { appCachePath });
      }
    }
    if (paramHashMap.get("blockNetworkImage") != null)
    {
      localObject2 = customSettings.blockNetworkImage;
      localObject1 = blockNetworkImage;
      if (localObject2 != localObject1) {
        localWebSettings.setBlockNetworkImage(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("blockNetworkLoads") != null)
    {
      localObject1 = customSettings.blockNetworkLoads;
      localObject2 = blockNetworkLoads;
      if (localObject1 != localObject2) {
        localWebSettings.setBlockNetworkLoads(((Boolean)localObject2).booleanValue());
      }
    }
    if ((paramHashMap.get("cacheMode") != null) && (!customSettings.cacheMode.equals(cacheMode))) {
      localWebSettings.setCacheMode(cacheMode.intValue());
    }
    if ((paramHashMap.get("cursiveFontFamily") != null) && (!customSettings.cursiveFontFamily.equals(cursiveFontFamily))) {
      localWebSettings.setCursiveFontFamily(cursiveFontFamily);
    }
    if ((paramHashMap.get("defaultFixedFontSize") != null) && (!customSettings.defaultFixedFontSize.equals(defaultFixedFontSize))) {
      localWebSettings.setDefaultFixedFontSize(defaultFixedFontSize.intValue());
    }
    if ((paramHashMap.get("defaultFontSize") != null) && (!customSettings.defaultFontSize.equals(defaultFontSize))) {
      localWebSettings.setDefaultFontSize(defaultFontSize.intValue());
    }
    if ((paramHashMap.get("defaultTextEncodingName") != null) && (!customSettings.defaultTextEncodingName.equals(defaultTextEncodingName))) {
      localWebSettings.setDefaultTextEncodingName(defaultTextEncodingName);
    }
    if (paramHashMap.get("disabledActionModeMenuItems") != null)
    {
      localObject2 = customSettings.disabledActionModeMenuItems;
      if ((localObject2 == null) || (!((Integer)localObject2).equals(disabledActionModeMenuItems))) {
        if (x6.b.c0("DISABLED_ACTION_MODE_MENU_ITEMS")) {
          n.b(localWebSettings, disabledActionModeMenuItems.intValue());
        } else if (i >= 24) {
          a0.e.i(localWebSettings, disabledActionModeMenuItems.intValue());
        }
      }
    }
    if ((paramHashMap.get("fantasyFontFamily") != null) && (!customSettings.fantasyFontFamily.equals(fantasyFontFamily))) {
      localWebSettings.setFantasyFontFamily(fantasyFontFamily);
    }
    if ((paramHashMap.get("fixedFontFamily") != null) && (!customSettings.fixedFontFamily.equals(fixedFontFamily))) {
      localWebSettings.setFixedFontFamily(fixedFontFamily);
    }
    if ((paramHashMap.get("forceDark") != null) && (!customSettings.forceDark.equals(forceDark))) {
      if (x6.b.c0("FORCE_DARK")) {
        n.c(localWebSettings, forceDark.intValue());
      } else if (i >= 29) {
        w.o(localWebSettings, forceDark.intValue());
      }
    }
    if ((paramHashMap.get("forceDarkStrategy") != null) && (!customSettings.forceDarkStrategy.equals(forceDarkStrategy)) && (x6.b.c0("FORCE_DARK_STRATEGY")))
    {
      i = forceDarkStrategy.intValue();
      if (i0.H.d()) {
        ((WebSettingsBoundaryInterface)aa).setForceDarkBehavior(i);
      } else {
        throw i0.a();
      }
    }
    if (paramHashMap.get("geolocationEnabled") != null)
    {
      localObject2 = customSettings.geolocationEnabled;
      localObject1 = geolocationEnabled;
      if (localObject2 != localObject1) {
        localWebSettings.setGeolocationEnabled(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("layoutAlgorithm") != null)
    {
      localObject1 = customSettings.layoutAlgorithm;
      localObject2 = layoutAlgorithm;
      if (localObject1 != localObject2)
      {
        localObject2.equals(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        localWebSettings.setLayoutAlgorithm(layoutAlgorithm);
      }
    }
    if (paramHashMap.get("loadWithOverviewMode") != null)
    {
      localObject1 = customSettings.loadWithOverviewMode;
      localObject2 = loadWithOverviewMode;
      if (localObject1 != localObject2) {
        localWebSettings.setLoadWithOverviewMode(((Boolean)localObject2).booleanValue());
      }
    }
    if (paramHashMap.get("loadsImagesAutomatically") != null)
    {
      localObject2 = customSettings.loadsImagesAutomatically;
      localObject1 = loadsImagesAutomatically;
      if (localObject2 != localObject1) {
        localWebSettings.setLoadsImagesAutomatically(((Boolean)localObject1).booleanValue());
      }
    }
    if ((paramHashMap.get("minimumFontSize") != null) && (!customSettings.minimumFontSize.equals(minimumFontSize))) {
      localWebSettings.setMinimumFontSize(minimumFontSize.intValue());
    }
    if ((paramHashMap.get("minimumLogicalFontSize") != null) && (!customSettings.minimumLogicalFontSize.equals(minimumLogicalFontSize))) {
      localWebSettings.setMinimumLogicalFontSize(minimumLogicalFontSize.intValue());
    }
    if ((paramHashMap.get("initialScale") != null) && (!customSettings.initialScale.equals(initialScale))) {
      setInitialScale(initialScale.intValue());
    }
    if (paramHashMap.get("needInitialFocus") != null)
    {
      localObject1 = customSettings.needInitialFocus;
      localObject2 = needInitialFocus;
      if (localObject1 != localObject2) {
        localWebSettings.setNeedInitialFocus(((Boolean)localObject2).booleanValue());
      }
    }
    boolean bool2;
    if ((paramHashMap.get("offscreenPreRaster") != null) && (customSettings.offscreenPreRaster != offscreenPreRaster)) {
      if (x6.b.c0("OFF_SCREEN_PRERASTER"))
      {
        bool2 = offscreenPreRaster.booleanValue();
        i0.a.getClass();
        c.k(localWebSettings, bool2);
      }
      else
      {
        localWebSettings.setOffscreenPreRaster(offscreenPreRaster.booleanValue());
      }
    }
    if ((paramHashMap.get("sansSerifFontFamily") != null) && (!customSettings.sansSerifFontFamily.equals(sansSerifFontFamily))) {
      localWebSettings.setSansSerifFontFamily(sansSerifFontFamily);
    }
    if ((paramHashMap.get("serifFontFamily") != null) && (!customSettings.serifFontFamily.equals(serifFontFamily))) {
      localWebSettings.setSerifFontFamily(serifFontFamily);
    }
    if ((paramHashMap.get("standardFontFamily") != null) && (!customSettings.standardFontFamily.equals(standardFontFamily))) {
      localWebSettings.setStandardFontFamily(standardFontFamily);
    }
    if ((paramHashMap.get("preferredContentMode") != null) && (!customSettings.preferredContentMode.equals(preferredContentMode)))
    {
      i = 21.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$PreferredContentModeOptionType[PreferredContentModeOptionType.fromValue(preferredContentMode.intValue()).ordinal()];
      if (i != 1)
      {
        if ((i == 2) || (i == 3)) {
          setDesktopMode(false);
        }
      }
      else {
        setDesktopMode(true);
      }
    }
    if (paramHashMap.get("saveFormData") != null)
    {
      localObject2 = customSettings.saveFormData;
      localObject1 = saveFormData;
      if (localObject2 != localObject1) {
        localWebSettings.setSaveFormData(((Boolean)localObject1).booleanValue());
      }
    }
    if (paramHashMap.get("incognito") != null)
    {
      localObject1 = customSettings.incognito;
      localObject2 = incognito;
      if (localObject1 != localObject2) {
        setIncognito(((Boolean)localObject2).booleanValue());
      }
    }
    if ((customSettings.useHybridComposition.booleanValue()) && (paramHashMap.get("hardwareAcceleration") != null))
    {
      localObject1 = customSettings.hardwareAcceleration;
      localObject2 = hardwareAcceleration;
      if (localObject1 != localObject2) {
        if (((Boolean)localObject2).booleanValue()) {
          setLayerType(2, null);
        } else {
          setLayerType(0, null);
        }
      }
    }
    if (paramHashMap.get("regexToCancelSubFramesLoading") != null)
    {
      localObject2 = customSettings.regexToCancelSubFramesLoading;
      if ((localObject2 == null) || (!((String)localObject2).equals(regexToCancelSubFramesLoading))) {
        if (regexToCancelSubFramesLoading == null) {
          regexToCancelSubFramesLoadingCompiled = null;
        } else {
          regexToCancelSubFramesLoadingCompiled = Pattern.compile(customSettings.regexToCancelSubFramesLoading);
        }
      }
    }
    if (contentBlockers != null)
    {
      contentBlockerHandler.getRuleList().clear();
      localObject1 = contentBlockers.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject3 = (Map)((Iterator)localObject1).next();
        localObject2 = ContentBlockerTrigger.fromMap((Map)((Map)localObject3).get("trigger"));
        localObject3 = ContentBlockerAction.fromMap((Map)((Map)localObject3).get("action"));
        contentBlockerHandler.getRuleList().add(new ContentBlocker((ContentBlockerTrigger)localObject2, (ContentBlockerAction)localObject3));
      }
    }
    if ((paramHashMap.get("scrollBarStyle") != null) && (!customSettings.scrollBarStyle.equals(scrollBarStyle))) {
      setScrollBarStyle(scrollBarStyle.intValue());
    }
    if (paramHashMap.get("scrollBarDefaultDelayBeforeFade") != null)
    {
      localObject2 = customSettings.scrollBarDefaultDelayBeforeFade;
      if ((localObject2 == null) || (!((Integer)localObject2).equals(scrollBarDefaultDelayBeforeFade))) {
        setScrollBarDefaultDelayBeforeFade(scrollBarDefaultDelayBeforeFade.intValue());
      }
    }
    if ((paramHashMap.get("scrollbarFadingEnabled") != null) && (!customSettings.scrollbarFadingEnabled.equals(scrollbarFadingEnabled))) {
      setScrollbarFadingEnabled(scrollbarFadingEnabled.booleanValue());
    }
    if (paramHashMap.get("scrollBarFadeDuration") != null)
    {
      localObject2 = customSettings.scrollBarFadeDuration;
      if ((localObject2 == null) || (!((Integer)localObject2).equals(scrollBarFadeDuration))) {
        setScrollBarFadeDuration(scrollBarFadeDuration.intValue());
      }
    }
    if ((paramHashMap.get("verticalScrollbarPosition") != null) && (!customSettings.verticalScrollbarPosition.equals(verticalScrollbarPosition))) {
      setVerticalScrollbarPosition(verticalScrollbarPosition.intValue());
    }
    if (paramHashMap.get("disableVerticalScroll") != null)
    {
      localObject1 = customSettings.disableVerticalScroll;
      localObject2 = disableVerticalScroll;
      if (localObject1 != localObject2)
      {
        if ((!((Boolean)localObject2).booleanValue()) && (verticalScrollBarEnabled.booleanValue())) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        setVerticalScrollBarEnabled(bool2);
      }
    }
    if (paramHashMap.get("disableHorizontalScroll") != null)
    {
      localObject2 = customSettings.disableHorizontalScroll;
      localObject1 = disableHorizontalScroll;
      if (localObject2 != localObject1)
      {
        bool2 = bool1;
        if (!((Boolean)localObject1).booleanValue())
        {
          bool2 = bool1;
          if (horizontalScrollBarEnabled.booleanValue()) {
            bool2 = true;
          }
        }
        setHorizontalScrollBarEnabled(bool2);
      }
    }
    if ((paramHashMap.get("overScrollMode") != null) && (!customSettings.overScrollMode.equals(overScrollMode))) {
      setOverScrollMode(overScrollMode.intValue());
    }
    if (paramHashMap.get("networkAvailable") != null)
    {
      localObject1 = customSettings.networkAvailable;
      localObject2 = networkAvailable;
      if (localObject1 != localObject2) {
        setNetworkAvailable(((Boolean)localObject2).booleanValue());
      }
    }
    if (paramHashMap.get("rendererPriorityPolicy") != null)
    {
      localObject2 = customSettings.rendererPriorityPolicy;
      if (((localObject2 == null) || (((Map)localObject2).get("rendererRequestedPriority") != rendererPriorityPolicy.get("rendererRequestedPriority")) || (customSettings.rendererPriorityPolicy.get("waivedWhenNotVisible") != rendererPriorityPolicy.get("waivedWhenNotVisible"))) && (Build.VERSION.SDK_INT >= 26)) {
        setRendererPriorityPolicy(((Integer)rendererPriorityPolicy.get("rendererRequestedPriority")).intValue(), ((Boolean)rendererPriorityPolicy.get("waivedWhenNotVisible")).booleanValue());
      }
    }
    i = Build.VERSION.SDK_INT;
    if (i >= 29)
    {
      if ((paramHashMap.get("verticalScrollbarThumbColor") != null) && (!Util.objEquals(customSettings.verticalScrollbarThumbColor, verticalScrollbarThumbColor))) {
        setVerticalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(verticalScrollbarThumbColor)));
      }
      if ((paramHashMap.get("verticalScrollbarTrackColor") != null) && (!Util.objEquals(customSettings.verticalScrollbarTrackColor, verticalScrollbarTrackColor))) {
        setVerticalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(verticalScrollbarTrackColor)));
      }
      if ((paramHashMap.get("horizontalScrollbarThumbColor") != null) && (!Util.objEquals(customSettings.horizontalScrollbarThumbColor, horizontalScrollbarThumbColor))) {
        setHorizontalScrollbarThumbDrawable(new ColorDrawable(Color.parseColor(horizontalScrollbarThumbColor)));
      }
      if ((paramHashMap.get("horizontalScrollbarTrackColor") != null) && (!Util.objEquals(customSettings.horizontalScrollbarTrackColor, horizontalScrollbarTrackColor))) {
        setHorizontalScrollbarTrackDrawable(new ColorDrawable(Color.parseColor(horizontalScrollbarTrackColor)));
      }
    }
    if ((paramHashMap.get("algorithmicDarkeningAllowed") != null) && (!Util.objEquals(customSettings.algorithmicDarkeningAllowed, algorithmicDarkeningAllowed)) && (x6.b.c0("ALGORITHMIC_DARKENING")) && (i >= 29))
    {
      bool2 = algorithmicDarkeningAllowed.booleanValue();
      if (i0.D.d()) {
        ((WebSettingsBoundaryInterface)aa).setAlgorithmicDarkeningAllowed(bool2);
      } else {
        throw i0.a();
      }
    }
    if ((paramHashMap.get("enterpriseAuthenticationAppLinkPolicyEnabled") != null) && (!Util.objEquals(customSettings.enterpriseAuthenticationAppLinkPolicyEnabled, enterpriseAuthenticationAppLinkPolicyEnabled)) && (x6.b.c0("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY")))
    {
      bool2 = enterpriseAuthenticationAppLinkPolicyEnabled.booleanValue();
      if (i0.M.d()) {
        ((WebSettingsBoundaryInterface)aa).setEnterpriseAuthenticationAppLinkPolicyEnabled(bool2);
      } else {
        throw i0.a();
      }
    }
    if ((paramHashMap.get("requestedWithHeaderOriginAllowList") != null) && (!Util.objEquals(customSettings.requestedWithHeaderOriginAllowList, requestedWithHeaderOriginAllowList)) && (x6.b.c0("REQUESTED_WITH_HEADER_ALLOW_LIST")))
    {
      paramHashMap = requestedWithHeaderOriginAllowList;
      if (i0.O.d()) {
        ((WebSettingsBoundaryInterface)aa).setRequestedWithHeaderOriginAllowList(paramHashMap);
      } else {
        throw i0.a();
      }
    }
    if (plugin != null)
    {
      paramHashMap = webViewAssetLoaderExt;
      if (paramHashMap != null) {
        paramHashMap.dispose();
      }
      webViewAssetLoaderExt = WebViewAssetLoaderExt.fromMap(customSettings.webViewAssetLoader, plugin, getContext());
    }
    customSettings = paramInAppWebViewSettings;
  }
  
  public void setUserContentController(UserContentController paramUserContentController)
  {
    userContentController = paramUserContentController;
  }
  
  public void setWebMessageChannels(Map<String, WebMessageChannel> paramMap)
  {
    webMessageChannels = paramMap;
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback)
  {
    if ((customSettings.useHybridComposition.booleanValue()) && (!customSettings.disableContextMenu.booleanValue()))
    {
      Map localMap = contextMenu;
      if ((localMap == null) || (localMap.keySet().size() == 0)) {
        return super.startActionMode(paramCallback);
      }
    }
    return rebuildActionMode(super.startActionMode(paramCallback), paramCallback);
  }
  
  public ActionMode startActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    if ((customSettings.useHybridComposition.booleanValue()) && (!customSettings.disableContextMenu.booleanValue()))
    {
      Map localMap = contextMenu;
      if ((localMap == null) || (localMap.keySet().size() == 0)) {
        return super.startActionMode(paramCallback, paramInt);
      }
    }
    return rebuildActionMode(super.startActionMode(paramCallback, paramInt), paramCallback);
  }
  
  public void takeScreenshot(final Map<String, Object> paramMap, final MethodChannel.Result paramResult)
  {
    final float f = Util.getPixelDensity(getContext());
    mainLooperHandler.post(new Runnable()
    {
      public void run()
      {
        try
        {
          Object localObject1 = Bitmap.createBitmap(this$0.getMeasuredWidth(), this$0.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
          Object localObject3 = new android/graphics/Canvas;
          ((Canvas)localObject3).<init>((Bitmap)localObject1);
          ((Canvas)localObject3).translate(-this$0.getScrollX(), -this$0.getScrollY());
          this$0.draw((Canvas)localObject3);
          ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
          localByteArrayOutputStream.<init>();
          Object localObject4 = Bitmap.CompressFormat.PNG;
          int i = 100;
          localObject3 = paramMap;
          Object localObject2;
          if (localObject3 != null)
          {
            localObject3 = (Map)((Map)localObject3).get("rect");
            if (localObject3 != null) {
              localObject1 = Bitmap.createBitmap((Bitmap)localObject1, (int)Math.floor(((Double)((Map)localObject3).get("x")).doubleValue() * f + 0.5D), (int)Math.floor(((Double)((Map)localObject3).get("y")).doubleValue() * f + 0.5D), Math.min(((Bitmap)localObject1).getWidth(), (int)Math.floor(((Double)((Map)localObject3).get("width")).doubleValue() * f + 0.5D)), Math.min(((Bitmap)localObject1).getHeight(), (int)Math.floor(((Double)((Map)localObject3).get("height")).doubleValue() * f + 0.5D)));
            }
            Double localDouble = (Double)paramMap.get("snapshotWidth");
            localObject3 = localObject1;
            if (localDouble != null)
            {
              i = (int)Math.floor(localDouble.doubleValue() * f + 0.5D);
              float f = ((Bitmap)localObject1).getWidth() / ((Bitmap)localObject1).getHeight();
              localObject3 = Bitmap.createScaledBitmap((Bitmap)localObject1, i, (int)(i / f), true);
            }
            try
            {
              localObject1 = Bitmap.CompressFormat.valueOf((String)paramMap.get("compressFormat"));
            }
            catch (IllegalArgumentException localIllegalArgumentException1)
            {
              Log.e("InAppWebView", "", localIllegalArgumentException1);
              localObject2 = localObject4;
            }
            i = ((Integer)paramMap.get("quality")).intValue();
            localObject4 = localObject2;
          }
          else
          {
            localObject3 = localObject2;
          }
          ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, i, localByteArrayOutputStream);
          try
          {
            localByteArrayOutputStream.close();
          }
          catch (IOException localIOException)
          {
            Log.e("InAppWebView", "", localIOException);
          }
          ((Bitmap)localObject3).recycle();
          paramResult.success(localByteArrayOutputStream.toByteArray());
        }
        catch (IllegalArgumentException localIllegalArgumentException2)
        {
          Log.e("InAppWebView", "", localIllegalArgumentException2);
          paramResult.success(null);
        }
      }
    });
  }
  
  public class DownloadStartListener
    implements DownloadListener
  {
    public DownloadStartListener() {}
    
    public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
    {
      paramString1 = new DownloadStartRequest(paramString1, paramString2, paramString3, paramString4, paramLong, URLUtil.guessFileName(paramString1, paramString3, paramString4), null);
      paramString2 = channelDelegate;
      if (paramString2 != null) {
        paramString2.onDownloadStartRequest(paramString1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */