package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.os.Message;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.FormResubmissionCallback;
import g;

class InAppWebViewClient$6
  extends WebViewChannelDelegate.FormResubmissionCallback
{
  public InAppWebViewClient$6(InAppWebViewClient paramInAppWebViewClient, Message paramMessage1, Message paramMessage2, WebView paramWebView) {}
  
  public void defaultBehaviour(Integer paramInteger)
  {
    InAppWebViewClient.access$701(this$0, val$view, val$dontResend, val$resend);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IAWebViewClient");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(Integer paramInteger)
  {
    if (paramInteger.intValue() != 0) {
      paramInteger = val$dontResend;
    } else {
      paramInteger = val$resend;
    }
    paramInteger.sendToTarget();
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */