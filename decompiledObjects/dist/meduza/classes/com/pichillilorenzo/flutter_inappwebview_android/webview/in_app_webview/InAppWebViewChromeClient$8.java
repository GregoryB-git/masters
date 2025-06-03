package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.JsPromptCallback;
import g;

class InAppWebViewChromeClient$8
  extends WebViewChannelDelegate.JsPromptCallback
{
  public InAppWebViewChromeClient$8(InAppWebViewChromeClient paramInAppWebViewChromeClient, JsPromptResult paramJsPromptResult, WebView paramWebView, String paramString1, String paramString2) {}
  
  public void defaultBehaviour(JsPromptResponse paramJsPromptResponse)
  {
    String str1;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (paramJsPromptResponse != null)
    {
      str1 = paramJsPromptResponse.getMessage();
      String str2 = paramJsPromptResponse.getDefaultValue();
      localObject1 = paramJsPromptResponse.getValue();
      localObject2 = paramJsPromptResponse.getConfirmButtonTitle();
      localObject3 = paramJsPromptResponse.getCancelButtonTitle();
      paramJsPromptResponse = str2;
    }
    else
    {
      str1 = null;
      paramJsPromptResponse = str1;
      localObject1 = paramJsPromptResponse;
      localObject3 = localObject1;
      localObject2 = localObject3;
    }
    this$0.createPromptDialog(val$view, val$message, val$defaultValue, val$result, str1, paramJsPromptResponse, (String)localObject1, (String)localObject3, (String)localObject2);
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
  
  public boolean nonNullSuccess(JsPromptResponse paramJsPromptResponse)
  {
    boolean bool = paramJsPromptResponse.isHandledByClient();
    int i = 1;
    if (bool)
    {
      Integer localInteger = paramJsPromptResponse.getAction();
      if (localInteger != null) {
        i = localInteger.intValue();
      }
      if (Integer.valueOf(i).intValue() != 0) {
        val$result.cancel();
      } else {
        val$result.confirm(paramJsPromptResponse.getValue());
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */