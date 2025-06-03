package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import java.util.Map;

public class WebViewChannelDelegate$JsAlertCallback
  extends BaseCallbackResultImpl<JsAlertResponse>
{
  public JsAlertResponse decodeResult(Object paramObject)
  {
    return JsAlertResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsAlertCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */