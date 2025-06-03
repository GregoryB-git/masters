package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback;
import g;

class InAppWebViewClientCompat$3
  extends WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback
{
  public InAppWebViewClientCompat$3(InAppWebViewClientCompat paramInAppWebViewClientCompat, SslErrorHandler paramSslErrorHandler, WebView paramWebView, SslError paramSslError) {}
  
  public void defaultBehaviour(ServerTrustAuthResponse paramServerTrustAuthResponse)
  {
    InAppWebViewClientCompat.access$401(this$0, val$view, val$handler, val$sslError);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = g.g(paramString1, ", ");
    if (paramString2 == null) {
      paramString2 = "";
    }
    j.t(paramString1, paramString2, "IAWebViewClientCompat");
    defaultBehaviour(null);
  }
  
  public boolean nonNullSuccess(ServerTrustAuthResponse paramServerTrustAuthResponse)
  {
    paramServerTrustAuthResponse = paramServerTrustAuthResponse.getAction();
    if (paramServerTrustAuthResponse != null)
    {
      if (paramServerTrustAuthResponse.intValue() != 1) {
        val$handler.cancel();
      } else {
        val$handler.proceed();
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */