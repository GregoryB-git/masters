package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.JsResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsConfirmCallback;
import g;

class InAppWebViewChromeClient$4
  extends WebViewChannelDelegate.JsConfirmCallback
{
  public InAppWebViewChromeClient$4(InAppWebViewChromeClient paramInAppWebViewChromeClient, JsResult paramJsResult, String paramString) {}
  
  public void defaultBehaviour(JsConfirmResponse paramJsConfirmResponse)
  {
    String str1;
    Object localObject;
    if (paramJsConfirmResponse != null)
    {
      str1 = paramJsConfirmResponse.getMessage();
      String str2 = paramJsConfirmResponse.getConfirmButtonTitle();
      localObject = paramJsConfirmResponse.getCancelButtonTitle();
      paramJsConfirmResponse = str2;
    }
    else
    {
      str1 = null;
      paramJsConfirmResponse = str1;
      localObject = paramJsConfirmResponse;
    }
    this$0.createConfirmDialog(val$message, val$result, str1, paramJsConfirmResponse, (String)localObject);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IABWebChromeClient");
    val$result.cancel();
  }
  
  public boolean nonNullSuccess(JsConfirmResponse paramJsConfirmResponse)
  {
    boolean bool = paramJsConfirmResponse.isHandledByClient();
    int i = 1;
    if (bool)
    {
      paramJsConfirmResponse = paramJsConfirmResponse.getAction();
      if (paramJsConfirmResponse != null) {
        i = paramJsConfirmResponse.intValue();
      }
      if (Integer.valueOf(i).intValue() != 0) {
        val$result.cancel();
      } else {
        val$result.confirm();
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */