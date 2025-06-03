package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.Map;

public class WebMessageChannelChannelDelegate
  extends ChannelDelegateImpl
{
  private WebMessageChannel webMessageChannel;
  
  public WebMessageChannelChannelDelegate(WebMessageChannel paramWebMessageChannel, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    webMessageChannel = paramWebMessageChannel;
  }
  
  public void dispose()
  {
    super.dispose();
    webMessageChannel = null;
  }
  
  public void onMessage(int paramInt, WebMessageCompatExt paramWebMessageCompatExt)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("index", Integer.valueOf(paramInt));
    if (paramWebMessageCompatExt != null) {
      paramWebMessageCompatExt = paramWebMessageCompatExt.toMap();
    } else {
      paramWebMessageCompatExt = null;
    }
    localHashMap.put("message", paramWebMessageCompatExt);
    localMethodChannel.invokeMethod("onMessage", localHashMap);
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1490029383: 
      if (((String)localObject).equals("postMessage")) {
        j = 2;
      }
      break;
    case 556190586: 
      if (((String)localObject).equals("setWebMessageCallback")) {
        j = 1;
      }
      break;
    case 94756344: 
      if (((String)localObject).equals("close")) {
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
      localObject = webMessageChannel;
      if ((localObject != null) && ((webView instanceof InAppWebView)))
      {
        localObject = (Integer)paramMethodCall.argument("index");
        paramMethodCall = WebMessageCompatExt.fromMap((Map)paramMethodCall.argument("message"));
        webMessageChannel.postMessageForInAppWebView((Integer)localObject, paramMethodCall, paramResult);
      }
      break;
    case 1: 
      localObject = webMessageChannel;
      if ((localObject != null) && ((webView instanceof InAppWebView)))
      {
        paramMethodCall = (Integer)paramMethodCall.argument("index");
        webMessageChannel.setWebMessageCallbackForInAppWebView(paramMethodCall.intValue(), paramResult);
      }
      break;
    }
    do
    {
      paramResult.success(Boolean.FALSE);
      break;
      localObject = webMessageChannel;
    } while ((localObject == null) || (!(webView instanceof InAppWebView)));
    paramMethodCall = (Integer)paramMethodCall.argument("index");
    webMessageChannel.closeForInAppWebView(paramMethodCall, paramResult);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannelChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */