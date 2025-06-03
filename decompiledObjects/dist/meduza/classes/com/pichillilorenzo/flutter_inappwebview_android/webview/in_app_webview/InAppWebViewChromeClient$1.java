package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.JsResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsAlertCallback;
import g;

class InAppWebViewChromeClient$1
  extends WebViewChannelDelegate.JsAlertCallback
{
  public InAppWebViewChromeClient$1(InAppWebViewChromeClient paramInAppWebViewChromeClient, JsResult paramJsResult, String paramString) {}
  
  public void defaultBehaviour(JsAlertResponse paramJsAlertResponse)
  {
    String str1 = null;
    String str2;
    if (paramJsAlertResponse != null)
    {
      str2 = paramJsAlertResponse.getMessage();
      str1 = paramJsAlertResponse.getConfirmButtonTitle();
      paramJsAlertResponse = str2;
      str2 = str1;
    }
    else
    {
      str2 = null;
      paramJsAlertResponse = str1;
    }
    this$0.createAlertDialog(val$message, val$result, paramJsAlertResponse, str2);
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
  
  public boolean nonNullSuccess(JsAlertResponse paramJsAlertResponse)
  {
    boolean bool = paramJsAlertResponse.isHandledByClient();
    int i = 1;
    if (bool)
    {
      paramJsAlertResponse = paramJsAlertResponse.getAction();
      if (paramJsAlertResponse != null) {
        i = paramJsAlertResponse.intValue();
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
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */