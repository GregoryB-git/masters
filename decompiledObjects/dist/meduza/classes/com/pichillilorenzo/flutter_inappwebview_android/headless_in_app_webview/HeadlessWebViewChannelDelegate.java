package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.Map;

public class HeadlessWebViewChannelDelegate
  extends ChannelDelegateImpl
{
  private HeadlessInAppWebView headlessWebView;
  
  public HeadlessWebViewChannelDelegate(HeadlessInAppWebView paramHeadlessInAppWebView, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    headlessWebView = paramHeadlessInAppWebView;
  }
  
  public void dispose()
  {
    super.dispose();
    headlessWebView = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str = method;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1984958339: 
      if (str.equals("setSize")) {
        j = 2;
      }
      break;
    case 1671767583: 
      if (str.equals("dispose")) {
        j = 1;
      }
      break;
    case -75151241: 
      if (str.equals("getSize")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      break;
    case 2: 
      if (headlessWebView != null)
      {
        paramMethodCall = Size2D.fromMap((Map)paramMethodCall.argument("size"));
        if (paramMethodCall != null) {
          headlessWebView.setSize(paramMethodCall);
        }
      }
      break;
    case 1: 
      paramMethodCall = headlessWebView;
      if (paramMethodCall != null)
      {
        paramMethodCall.dispose();
        paramMethodCall = Boolean.TRUE;
      }
      else
      {
        paramMethodCall = Boolean.FALSE;
      }
      paramResult.success(paramMethodCall);
      break;
    }
    Object localObject = headlessWebView;
    str = null;
    paramMethodCall = str;
    if (localObject != null)
    {
      localObject = ((HeadlessInAppWebView)localObject).getSize();
      paramMethodCall = str;
      if (localObject != null) {
        paramMethodCall = ((Size2D)localObject).toMap();
      }
    }
    paramResult.success(paramMethodCall);
  }
  
  public void onWebViewCreated()
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    localMethodChannel.invokeMethod("onWebViewCreated", new HashMap());
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview.HeadlessWebViewChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */