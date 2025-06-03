package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import java.util.Map;

public class WebViewChannelDelegate$SafeBrowsingHitCallback
  extends BaseCallbackResultImpl<SafeBrowsingResponse>
{
  public SafeBrowsingResponse decodeResult(Object paramObject)
  {
    return SafeBrowsingResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SafeBrowsingHitCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */