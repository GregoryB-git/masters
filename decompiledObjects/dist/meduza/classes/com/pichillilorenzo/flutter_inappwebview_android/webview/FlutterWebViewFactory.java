package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.HashMap;
import java.util.Map;

public class FlutterWebViewFactory
  extends PlatformViewFactory
{
  public static final String VIEW_TYPE_ID = "com.pichillilorenzo/flutter_inappwebview";
  private final InAppWebViewFlutterPlugin plugin;
  
  public FlutterWebViewFactory(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    super(StandardMessageCodec.INSTANCE);
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public PlatformView create(Context paramContext, int paramInt, Object paramObject)
  {
    HashMap localHashMap = (HashMap)paramObject;
    Integer localInteger = Integer.valueOf(paramInt);
    String str = (String)localHashMap.get("keepAliveId");
    paramObject = (String)localHashMap.get("headlessWebViewId");
    Object localObject = plugin.headlessInAppWebViewManager;
    if ((paramObject != null) && (localObject != null))
    {
      paramObject = (HeadlessInAppWebView)webViews.get(paramObject);
      if (paramObject != null)
      {
        paramObject = ((HeadlessInAppWebView)paramObject).disposeAndGetFlutterWebView();
        localObject = paramObject;
        if (paramObject == null) {
          break label99;
        }
        keepAliveId = str;
        localObject = paramObject;
        break label99;
      }
    }
    localObject = null;
    label99:
    InAppWebViewManager localInAppWebViewManager = plugin.inAppWebViewManager;
    paramObject = localObject;
    if (str != null)
    {
      paramObject = localObject;
      if (localObject == null)
      {
        paramObject = localObject;
        if (localInAppWebViewManager != null)
        {
          localObject = (FlutterWebView)keepAliveWebViews.get(str);
          paramObject = localObject;
          if (localObject != null)
          {
            View localView = ((FlutterWebView)localObject).getView();
            paramObject = localObject;
            if (localView != null)
            {
              ViewGroup localViewGroup = (ViewGroup)localView.getParent();
              paramObject = localObject;
              if (localViewGroup != null)
              {
                localViewGroup.removeView(localView);
                paramObject = localObject;
              }
            }
          }
        }
      }
    }
    if (paramObject == null) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    localObject = paramObject;
    if (paramObject == null)
    {
      paramObject = localInteger;
      if (str != null) {
        paramObject = str;
      }
      localObject = new FlutterWebView(plugin, paramContext, paramObject, localHashMap);
    }
    if ((str != null) && (localInAppWebViewManager != null)) {
      keepAliveWebViews.put(str, localObject);
    }
    if (paramInt != 0) {
      ((FlutterWebView)localObject).makeInitialLoad(localHashMap);
    }
    return (PlatformView)localObject;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.FlutterWebViewFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */