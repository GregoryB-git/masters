package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.ClientCertRequest;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.Util.PrivateKeyAndCertificates;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedClientCertRequestCallback;
import g;

class InAppWebViewClientCompat$4
  extends WebViewChannelDelegate.ReceivedClientCertRequestCallback
{
  public InAppWebViewClientCompat$4(InAppWebViewClientCompat paramInAppWebViewClientCompat, InAppWebView paramInAppWebView, ClientCertRequest paramClientCertRequest, WebView paramWebView) {}
  
  public void defaultBehaviour(ClientCertResponse paramClientCertResponse)
  {
    InAppWebViewClientCompat.access$501(this$0, val$view, val$request);
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
  
  public boolean nonNullSuccess(ClientCertResponse paramClientCertResponse)
  {
    Object localObject = paramClientCertResponse.getAction();
    if ((localObject != null) && (val$webView.plugin != null))
    {
      int i = ((Integer)localObject).intValue();
      if (i != 1) {
        if (i == 2) {}
      }
      do
      {
        val$request.cancel();
        break;
        val$request.ignore();
        break;
        String str = paramClientCertResponse.getCertificatePath();
        localObject = paramClientCertResponse.getCertificatePassword();
        paramClientCertResponse = paramClientCertResponse.getKeyStoreType();
        paramClientCertResponse = Util.loadPrivateKeyAndCertificate(val$webView.plugin, str, (String)localObject, paramClientCertResponse);
      } while (paramClientCertResponse == null);
      val$request.proceed(privateKey, certificates);
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */