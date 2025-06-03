package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.ReceivedHttpAuthRequestCallback;
import g;
import java.util.List;

class InAppWebViewClient$2
  extends WebViewChannelDelegate.ReceivedHttpAuthRequestCallback
{
  public InAppWebViewClient$2(InAppWebViewClient paramInAppWebViewClient, WebView paramWebView, String paramString1, String paramString2, String paramString3, int paramInt, HttpAuthHandler paramHttpAuthHandler) {}
  
  public void defaultBehaviour(HttpAuthResponse paramHttpAuthResponse)
  {
    InAppWebViewClient.access$301(this$0, val$view, val$handler, val$host, val$realm);
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
  
  public boolean nonNullSuccess(HttpAuthResponse paramHttpAuthResponse)
  {
    Object localObject = paramHttpAuthResponse.getAction();
    if (localObject != null)
    {
      int i = ((Integer)localObject).intValue();
      if (i != 1)
      {
        if (i != 2)
        {
          InAppWebViewClient.access$102(null);
          InAppWebViewClient.access$202(0);
        }
        while (InAppWebViewClient.access$100().size() <= 0)
        {
          val$handler.cancel();
          break;
        }
        paramHttpAuthResponse = (URLCredential)InAppWebViewClient.access$100().remove(0);
        val$handler.proceed(paramHttpAuthResponse.getUsername(), paramHttpAuthResponse.getPassword());
      }
      else
      {
        localObject = paramHttpAuthResponse.getUsername();
        String str = paramHttpAuthResponse.getPassword();
        if (paramHttpAuthResponse.isPermanentPersistence()) {
          CredentialDatabase.getInstance(val$view.getContext()).setHttpAuthCredential(val$host, val$finalProtocol, val$realm, Integer.valueOf(val$finalPort), (String)localObject, str);
        }
        val$handler.proceed((String)localObject, str);
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */