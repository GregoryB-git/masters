package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;

public class WebViewChannelDelegate$SyncLoadResourceWithCustomSchemeCallback
  extends SyncBaseCallbackResultImpl<CustomSchemeResponse>
{
  public CustomSchemeResponse decodeResult(Object paramObject)
  {
    return new WebViewChannelDelegate.LoadResourceWithCustomSchemeCallback().decodeResult(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SyncLoadResourceWithCustomSchemeCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */