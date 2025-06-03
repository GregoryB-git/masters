package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.GeolocationPermissions.Callback;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback;
import g;

class InAppWebViewChromeClient$17
  extends WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback
{
  public InAppWebViewChromeClient$17(InAppWebViewChromeClient paramInAppWebViewChromeClient, GeolocationPermissions.Callback paramCallback, String paramString) {}
  
  public void defaultBehaviour(GeolocationPermissionShowPromptResponse paramGeolocationPermissionShowPromptResponse)
  {
    val$callback.invoke(val$origin, false, false);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IABWebChromeClient");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse paramGeolocationPermissionShowPromptResponse)
  {
    val$callback.invoke(paramGeolocationPermissionShowPromptResponse.getOrigin(), paramGeolocationPermissionShowPromptResponse.isAllow(), paramGeolocationPermissionShowPromptResponse.isRetain());
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.17
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */