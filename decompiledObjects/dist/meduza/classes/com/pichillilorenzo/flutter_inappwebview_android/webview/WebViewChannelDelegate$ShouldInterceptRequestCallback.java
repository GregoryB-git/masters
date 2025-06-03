package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import java.util.Map;

public class WebViewChannelDelegate$ShouldInterceptRequestCallback
  extends BaseCallbackResultImpl<WebResourceResponseExt>
{
  public WebResourceResponseExt decodeResult(Object paramObject)
  {
    return WebResourceResponseExt.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ShouldInterceptRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */