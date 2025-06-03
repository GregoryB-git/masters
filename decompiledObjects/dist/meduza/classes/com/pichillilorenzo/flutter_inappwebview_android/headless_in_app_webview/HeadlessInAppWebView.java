package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import g;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public class HeadlessInAppWebView
  implements Disposable
{
  public static final String LOG_TAG = "HeadlessInAppWebView";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_headless_inappwebview_";
  public HeadlessWebViewChannelDelegate channelDelegate;
  public FlutterWebView flutterWebView;
  public final String id;
  public InAppWebViewFlutterPlugin plugin;
  
  public HeadlessInAppWebView(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin, String paramString, FlutterWebView paramFlutterWebView)
  {
    id = paramString;
    plugin = paramInAppWebViewFlutterPlugin;
    flutterWebView = paramFlutterWebView;
    channelDelegate = new HeadlessWebViewChannelDelegate(this, new MethodChannel(messenger, g.d("com.pichillilorenzo/flutter_headless_inappwebview_", paramString)));
  }
  
  public void dispose()
  {
    Object localObject = channelDelegate;
    if (localObject != null)
    {
      ((HeadlessWebViewChannelDelegate)localObject).dispose();
      channelDelegate = null;
    }
    localObject = plugin;
    if (localObject != null)
    {
      localObject = headlessInAppWebViewManager;
      if ((localObject != null) && (webViews.containsKey(id))) {
        webViews.put(id, null);
      }
      localObject = plugin.activity;
      if (localObject != null)
      {
        localObject = (ViewGroup)((Activity)localObject).findViewById(16908290);
        if (localObject != null)
        {
          ViewGroup localViewGroup = (ViewGroup)((ViewGroup)localObject).getChildAt(0);
          if (localViewGroup != null)
          {
            localObject = flutterWebView;
            if ((localObject != null) && (((FlutterWebView)localObject).getView() != null)) {
              localViewGroup.removeView(flutterWebView.getView());
            }
          }
        }
      }
    }
    localObject = flutterWebView;
    if (localObject != null) {
      ((FlutterWebView)localObject).dispose();
    }
    flutterWebView = null;
    plugin = null;
  }
  
  public FlutterWebView disposeAndGetFlutterWebView()
  {
    FlutterWebView localFlutterWebView = flutterWebView;
    if (localFlutterWebView != null)
    {
      View localView = localFlutterWebView.getView();
      if (localView != null)
      {
        localView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        localView.setVisibility(0);
        ViewGroup localViewGroup = (ViewGroup)localView.getParent();
        if (localViewGroup != null) {
          localViewGroup.removeView(localView);
        }
      }
      flutterWebView = null;
      dispose();
    }
    return localFlutterWebView;
  }
  
  public Size2D getSize()
  {
    Object localObject1 = flutterWebView;
    if ((localObject1 != null) && (webView != null))
    {
      Object localObject2 = ((FlutterWebView)localObject1).getView();
      if (localObject2 != null)
      {
        float f = Util.getPixelDensity(((View)localObject2).getContext());
        localObject1 = Util.getFullscreenSize(((View)localObject2).getContext());
        localObject2 = ((View)localObject2).getLayoutParams();
        double d1 = ((Size2D)localObject1).getWidth();
        int i = width;
        if (d1 == i) {
          d1 = i;
        } else {
          d1 = i / f;
        }
        double d2 = ((Size2D)localObject1).getHeight();
        i = height;
        if (d2 == i) {
          d2 = i;
        } else {
          d2 = i / f;
        }
        return new Size2D(d1, d2);
      }
    }
    return null;
  }
  
  public void onWebViewCreated()
  {
    HeadlessWebViewChannelDelegate localHeadlessWebViewChannelDelegate = channelDelegate;
    if (localHeadlessWebViewChannelDelegate != null) {
      localHeadlessWebViewChannelDelegate.onWebViewCreated();
    }
  }
  
  public void prepare(Map<String, Object> paramMap)
  {
    Object localObject = flutterWebView;
    if (localObject != null)
    {
      View localView = ((FlutterWebView)localObject).getView();
      if (localView != null)
      {
        localObject = Size2D.fromMap((Map)paramMap.get("initialSize"));
        paramMap = (Map<String, Object>)localObject;
        if (localObject == null) {
          paramMap = new Size2D(-1.0D, -1.0D);
        }
        setSize(paramMap);
        localView.setVisibility(4);
      }
    }
    paramMap = plugin;
    if (paramMap != null)
    {
      paramMap = activity;
      if (paramMap != null)
      {
        paramMap = (ViewGroup)paramMap.findViewById(16908290);
        if (paramMap != null)
        {
          paramMap = (ViewGroup)paramMap.getChildAt(0);
          if (paramMap != null)
          {
            localObject = flutterWebView;
            if (localObject != null)
            {
              localObject = ((FlutterWebView)localObject).getView();
              if (localObject != null) {
                paramMap.addView((View)localObject, 0);
              }
            }
          }
        }
      }
    }
  }
  
  public void setSize(Size2D paramSize2D)
  {
    Object localObject = flutterWebView;
    if ((localObject != null) && (webView != null))
    {
      localObject = ((FlutterWebView)localObject).getView();
      if (localObject != null)
      {
        float f = Util.getPixelDensity(((View)localObject).getContext());
        Size2D localSize2D = Util.getFullscreenSize(((View)localObject).getContext());
        double d;
        if (paramSize2D.getWidth() == -1.0D) {
          d = localSize2D.getWidth();
        } else {
          d = paramSize2D.getWidth() * f;
        }
        int i = (int)d;
        if (paramSize2D.getWidth() == -1.0D)
        {
          d = localSize2D.getHeight();
        }
        else
        {
          d = paramSize2D.getHeight();
          d = f * d;
        }
        ((View)localObject).setLayoutParams(new FrameLayout.LayoutParams(i, (int)d));
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessInAppWebView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */