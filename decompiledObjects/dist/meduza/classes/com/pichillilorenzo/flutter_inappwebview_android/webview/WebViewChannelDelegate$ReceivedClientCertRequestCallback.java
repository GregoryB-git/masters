package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import java.util.Map;

public class WebViewChannelDelegate$ReceivedClientCertRequestCallback
  extends BaseCallbackResultImpl<ClientCertResponse>
{
  public ClientCertResponse decodeResult(Object paramObject)
  {
    return ClientCertResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedClientCertRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */