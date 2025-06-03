package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import java.util.Map;

public class WebViewChannelDelegate$LoadResourceWithCustomSchemeCallback
  extends BaseCallbackResultImpl<CustomSchemeResponse>
{
  public CustomSchemeResponse decodeResult(Object paramObject)
  {
    return CustomSchemeResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.LoadResourceWithCustomSchemeCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */