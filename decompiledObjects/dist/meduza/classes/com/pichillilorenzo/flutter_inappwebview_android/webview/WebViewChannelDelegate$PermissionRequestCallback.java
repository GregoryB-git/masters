package com.pichillilorenzo.flutter_inappwebview_android.webview;

import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import java.util.Map;

public class WebViewChannelDelegate$PermissionRequestCallback
  extends BaseCallbackResultImpl<PermissionResponse>
{
  public PermissionResponse decodeResult(Object paramObject)
  {
    return PermissionResponse.fromMap((Map)paramObject);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.PermissionRequestCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */