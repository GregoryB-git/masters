package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import java.util.Map;

public class WebViewChannelDelegate$JsBeforeUnloadCallback
  extends BaseCallbackResultImpl<JsBeforeUnloadResponse>
{
  public JsBeforeUnloadResponse decodeResult(Object paramObject)
  {
    return JsBeforeUnloadResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsBeforeUnloadCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */