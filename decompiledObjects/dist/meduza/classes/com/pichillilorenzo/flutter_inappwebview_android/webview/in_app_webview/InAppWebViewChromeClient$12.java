package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.JsResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsBeforeUnloadCallback;
import g;

class InAppWebViewChromeClient$12
  extends WebViewChannelDelegate.JsBeforeUnloadCallback
{
  public InAppWebViewChromeClient$12(InAppWebViewChromeClient paramInAppWebViewChromeClient, JsResult paramJsResult, String paramString) {}
  
  public void defaultBehaviour(JsBeforeUnloadResponse paramJsBeforeUnloadResponse)
  {
    String str;
    Object localObject1;
    Object localObject2;
    if (paramJsBeforeUnloadResponse != null)
    {
      str = paramJsBeforeUnloadResponse.getMessage();
      localObject1 = paramJsBeforeUnloadResponse.getConfirmButtonTitle();
      localObject2 = paramJsBeforeUnloadResponse.getCancelButtonTitle();
      paramJsBeforeUnloadResponse = str;
    }
    else
    {
      str = null;
      paramJsBeforeUnloadResponse = str;
      localObject2 = paramJsBeforeUnloadResponse;
      localObject1 = paramJsBeforeUnloadResponse;
      paramJsBeforeUnloadResponse = str;
    }
    this$0.createBeforeUnloadDialog(val$message, val$result, paramJsBeforeUnloadResponse, (String)localObject1, (String)localObject2);
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
  
  public boolean nonNullSuccess(JsBeforeUnloadResponse paramJsBeforeUnloadResponse)
  {
    boolean bool = paramJsBeforeUnloadResponse.isHandledByClient();
    int i = 1;
    if (bool)
    {
      paramJsBeforeUnloadResponse = paramJsBeforeUnloadResponse.getAction();
      if (paramJsBeforeUnloadResponse != null) {
        i = paramJsBeforeUnloadResponse.intValue();
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
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */