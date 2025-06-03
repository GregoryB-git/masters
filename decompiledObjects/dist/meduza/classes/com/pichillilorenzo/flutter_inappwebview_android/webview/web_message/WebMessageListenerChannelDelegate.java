package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.HashMap;
import java.util.Map;

public class WebMessageListenerChannelDelegate
  extends ChannelDelegateImpl
{
  private WebMessageListener webMessageListener;
  
  public WebMessageListenerChannelDelegate(WebMessageListener paramWebMessageListener, MethodChannel paramMethodChannel)
  {
    super(paramMethodChannel);
    webMessageListener = paramWebMessageListener;
  }
  
  public void dispose()
  {
    super.dispose();
    webMessageListener = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    if (!((String)localObject).equals("postMessage"))
    {
      paramResult.notImplemented();
    }
    else
    {
      localObject = webMessageListener;
      if ((localObject != null) && ((webView instanceof InAppWebView)))
      {
        paramMethodCall = WebMessageCompatExt.fromMap((Map)paramMethodCall.argument("message"));
        webMessageListener.postMessageForInAppWebView(paramMethodCall, paramResult);
      }
      else
      {
        paramResult.success(Boolean.FALSE);
      }
    }
  }
  
  public void onPostMessage(WebMessageCompatExt paramWebMessageCompatExt, String paramString, boolean paramBoolean)
  {
    MethodChannel localMethodChannel = getChannel();
    if (localMethodChannel == null) {
      return;
    }
    HashMap localHashMap = new HashMap();
    if (paramWebMessageCompatExt != null) {
      paramWebMessageCompatExt = paramWebMessageCompatExt.toMap();
    } else {
      paramWebMessageCompatExt = null;
    }
    localHashMap.put("message", paramWebMessageCompatExt);
    localHashMap.put("sourceOrigin", paramString);
    localHashMap.put("isMainFrame", Boolean.valueOf(paramBoolean));
    localMethodChannel.invokeMethod("onPostMessage", localHashMap);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListenerChannelDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */