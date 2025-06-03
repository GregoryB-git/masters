package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import java.util.Map;

public class WebViewChannelDelegate$GeolocationPermissionsShowPromptCallback
  extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse>
{
  public GeolocationPermissionShowPromptResponse decodeResult(Object paramObject)
  {
    return GeolocationPermissionShowPromptResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */