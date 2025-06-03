package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import java.util.Map;

public class WebViewChannelDelegate$ReceivedHttpAuthRequestCallback
  extends BaseCallbackResultImpl<HttpAuthResponse>
{
  public HttpAuthResponse decodeResult(Object paramObject)
  {
    return HttpAuthResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedHttpAuthRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */