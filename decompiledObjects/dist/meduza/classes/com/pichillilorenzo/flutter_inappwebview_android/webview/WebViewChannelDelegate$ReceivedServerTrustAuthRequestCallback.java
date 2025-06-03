package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import java.util.Map;

public class WebViewChannelDelegate$ReceivedServerTrustAuthRequestCallback
  extends BaseCallbackResultImpl<ServerTrustAuthResponse>
{
  public ServerTrustAuthResponse decodeResult(Object paramObject)
  {
    return ServerTrustAuthResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */