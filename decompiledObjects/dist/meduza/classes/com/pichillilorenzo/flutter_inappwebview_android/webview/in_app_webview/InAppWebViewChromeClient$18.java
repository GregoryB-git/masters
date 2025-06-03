package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.PermissionRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.PermissionRequestCallback;
import g;
import java.util.List;

class InAppWebViewChromeClient$18
  extends WebViewChannelDelegate.PermissionRequestCallback
{
  public InAppWebViewChromeClient$18(InAppWebViewChromeClient paramInAppWebViewChromeClient, PermissionRequest paramPermissionRequest) {}
  
  public void defaultBehaviour(PermissionResponse paramPermissionResponse)
  {
    val$request.deny();
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
  
  public boolean nonNullSuccess(PermissionResponse paramPermissionResponse)
  {
    Object localObject = paramPermissionResponse.getAction();
    if (localObject != null)
    {
      if (((Integer)localObject).intValue() != 1)
      {
        val$request.deny();
      }
      else
      {
        localObject = new String[paramPermissionResponse.getResources().size()];
        paramPermissionResponse = (String[])paramPermissionResponse.getResources().toArray((Object[])localObject);
        val$request.grant(paramPermissionResponse);
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */