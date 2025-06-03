package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import d2.a;
import d2.a.f;
import d2.i0;
import d2.j;
import d2.j0.b;
import d2.k0;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;

public class InAppWebViewManager
  extends ChannelDelegateImpl
{
  public static final String LOG_TAG = "InAppWebViewManager";
  public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
  public final Map<String, FlutterWebView> keepAliveWebViews = new HashMap();
  public InAppWebViewFlutterPlugin plugin;
  public int windowAutoincrementId = 0;
  public final Map<Integer, Message> windowWebViewMessages = new HashMap();
  
  public InAppWebViewManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(new MethodChannel(messenger, "com.pichillilorenzo/flutter_inappwebview_manager"));
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void clearAllCache(Context paramContext, boolean paramBoolean)
  {
    paramContext = new WebView(paramContext);
    paramContext.clearCache(paramBoolean);
    paramContext.destroy();
  }
  
  public Map<String, Object> convertWebViewPackageToMap(PackageInfo paramPackageInfo)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("versionName", versionName);
    localHashMap.put("packageName", packageName);
    return localHashMap;
  }
  
  public void dispose()
  {
    super.dispose();
    Iterator localIterator = keepAliveWebViews.values().iterator();
    while (localIterator.hasNext())
    {
      String str = nextkeepAliveId;
      if (str != null) {
        disposeKeepAlive(str);
      }
    }
    keepAliveWebViews.clear();
    windowWebViewMessages.clear();
    plugin = null;
  }
  
  public void disposeKeepAlive(String paramString)
  {
    FlutterWebView localFlutterWebView = (FlutterWebView)keepAliveWebViews.get(paramString);
    if (localFlutterWebView != null)
    {
      keepAliveId = null;
      View localView = localFlutterWebView.getView();
      if (localView != null)
      {
        ViewGroup localViewGroup = (ViewGroup)localView.getParent();
        if (localViewGroup != null) {
          localViewGroup.removeView(localView);
        }
      }
      localFlutterWebView.dispose();
    }
    if (keepAliveWebViews.containsKey(paramString)) {
      keepAliveWebViews.put(paramString, null);
    }
  }
  
  public void onMethodCall(MethodCall paramMethodCall, final MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    switch (((String)localObject).hashCode())
    {
    default: 
      break;
    case 1867011305: 
      if (((String)localObject).equals("disposeKeepAlive")) {
        i = 10;
      }
      break;
    case 1667434977: 
      if (((String)localObject).equals("isMultiProcessEnabled")) {
        i = 9;
      }
      break;
    case 1586319888: 
      if (((String)localObject).equals("getCurrentWebViewPackage")) {
        i = 8;
      }
      break;
    case 1033609166: 
      if (((String)localObject).equals("clearAllCache")) {
        i = 7;
      }
      break;
    case 643643439: 
      if (((String)localObject).equals("getDefaultUserAgent")) {
        i = 6;
      }
      break;
    case 426229521: 
      if (((String)localObject).equals("setSafeBrowsingAllowlist")) {
        i = 5;
      }
      break;
    case 258673215: 
      if (((String)localObject).equals("getSafeBrowsingPrivacyPolicyUrl")) {
        i = 4;
      }
      break;
    case -436220260: 
      if (((String)localObject).equals("clearClientCertPreferences")) {
        i = 3;
      }
      break;
    case -633518365: 
      if (((String)localObject).equals("getVariationsHeader")) {
        i = 2;
      }
      break;
    case -910403233: 
      if (((String)localObject).equals("setWebContentsDebuggingEnabled")) {
        i = 1;
      }
      break;
    case -1496477679: 
      if (((String)localObject).equals("disableWebView")) {
        i = 0;
      }
      break;
    }
    int i = -1;
    Activity localActivity = null;
    InAppWebViewFlutterPlugin localInAppWebViewFlutterPlugin;
    switch (i)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 10: 
      paramMethodCall = (String)paramMethodCall.argument("keepAliveId");
      if (paramMethodCall == null) {
        break label869;
      }
      disposeKeepAlive(paramMethodCall);
      break;
    case 9: 
      if (x6.b.c0("MULTI_PROCESS"))
      {
        paramMethodCall = p.a;
        if (i0.F.d())
        {
          paramMethodCall = Boolean.valueOf(j0.b.a.getStatics().isMultiProcessEnabled());
          break label873;
        }
        throw i0.a();
      }
    case 8: 
      localInAppWebViewFlutterPlugin = plugin;
      if (localInAppWebViewFlutterPlugin != null)
      {
        localObject = activity;
        paramMethodCall = (MethodCall)localObject;
        if (localObject == null) {
          paramMethodCall = applicationContext;
        }
      }
      else
      {
        paramMethodCall = null;
      }
      if (paramMethodCall != null) {
        localObject = p.b(paramMethodCall);
      } else {
        localObject = null;
      }
      paramMethodCall = localActivity;
      if (localObject != null) {
        paramMethodCall = convertWebViewPackageToMap((PackageInfo)localObject);
      }
      break;
    case 7: 
      localInAppWebViewFlutterPlugin = plugin;
      if (localInAppWebViewFlutterPlugin == null) {
        break label869;
      }
      localActivity = activity;
      localObject = localActivity;
      if (localActivity == null) {
        localObject = applicationContext;
      }
      if (localObject == null) {
        break label869;
      }
      clearAllCache((Context)localObject, ((Boolean)paramMethodCall.argument("includeDiskFiles")).booleanValue());
      break;
    case 6: 
      localObject = plugin;
      paramMethodCall = localActivity;
      if (localObject != null) {
        paramMethodCall = WebSettings.getDefaultUserAgent(applicationContext);
      }
      break;
    case 5: 
      if (x6.b.c0("SAFE_BROWSING_ALLOWLIST"))
      {
        p.e(new HashSet((List)paramMethodCall.argument("hosts")), new ValueCallback()
        {
          public void onReceiveValue(Boolean paramAnonymousBoolean)
          {
            paramResult.success(paramAnonymousBoolean);
          }
        });
        return;
      }
      if (x6.b.c0("SAFE_BROWSING_WHITELIST"))
      {
        paramMethodCall = (List)paramMethodCall.argument("hosts");
        localObject = new ValueCallback()
        {
          public void onReceiveValue(Boolean paramAnonymousBoolean)
          {
            paramResult.success(paramAnonymousBoolean);
          }
        };
        paramResult = p.a;
        p.e(new HashSet(paramMethodCall), (ValueCallback)localObject);
        return;
      }
      paramMethodCall = Boolean.FALSE;
      break;
    case 4: 
      paramMethodCall = localActivity;
      if (x6.b.c0("SAFE_BROWSING_PRIVACY_POLICY_URL"))
      {
        paramMethodCall = p.a;
        paramMethodCall = i0.g;
        if (paramMethodCall.c())
        {
          paramMethodCall = j.b();
        }
        else
        {
          if (!paramMethodCall.d()) {
            break label764;
          }
          paramMethodCall = j0.b.a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
        }
        paramMethodCall = paramMethodCall.toString();
        break label873;
        throw i0.a();
      }
    case 3: 
      WebView.clearClientCertPreferences(new Runnable()
      {
        public void run()
        {
          paramResult.success(Boolean.TRUE);
        }
      });
      break;
    case 2: 
      paramMethodCall = localActivity;
      if (x6.b.c0("GET_VARIATIONS_HEADER"))
      {
        paramMethodCall = p.a;
        if (i0.L.d())
        {
          paramMethodCall = j0.b.a.getStatics().getVariationsHeader();
          break label873;
        }
        throw i0.a();
      }
      paramResult.success(paramMethodCall);
      break;
    case 1: 
      label764:
      WebView.setWebContentsDebuggingEnabled(((Boolean)paramMethodCall.argument("debuggingEnabled")).booleanValue());
      break;
    }
    if (Build.VERSION.SDK_INT >= 28) {
      android.support.v4.media.session.b.h();
    }
    label869:
    paramMethodCall = Boolean.TRUE;
    label873:
    paramResult.success(paramMethodCall);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */