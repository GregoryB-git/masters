package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;

public class WebViewChannelDelegate$SyncShouldInterceptRequestCallback
  extends SyncBaseCallbackResultImpl<WebResourceResponseExt>
{
  public WebResourceResponseExt decodeResult(Object paramObject)
  {
    return new WebViewChannelDelegate.ShouldInterceptRequestCallback().decodeResult(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SyncShouldInterceptRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */