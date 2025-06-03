package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import java.util.Map;

public class WebViewChannelDelegate$JsConfirmCallback
  extends BaseCallbackResultImpl<JsConfirmResponse>
{
  public JsConfirmResponse decodeResult(Object paramObject)
  {
    return JsConfirmResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsConfirmCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */