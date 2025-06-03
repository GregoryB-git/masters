package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import a0.j;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.SafeBrowsingHitCallback;
import g;

class InAppWebViewClient$5
  extends WebViewChannelDelegate.SafeBrowsingHitCallback
{
  public InAppWebViewClient$5(InAppWebViewClient paramInAppWebViewClient, android.webkit.SafeBrowsingResponse paramSafeBrowsingResponse, WebView paramWebView, WebResourceRequest paramWebResourceRequest, int paramInt) {}
  
  public void defaultBehaviour(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    InAppWebViewClient.access$601(this$0, val$view, val$request, val$threatType, val$callback);
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
  
  public boolean nonNullSuccess(com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse paramSafeBrowsingResponse)
  {
    Integer localInteger = paramSafeBrowsingResponse.getAction();
    if (localInteger != null)
    {
      boolean bool = paramSafeBrowsingResponse.isReport();
      int i = localInteger.intValue();
      if (i != 0)
      {
        if (i != 1) {
          val$callback.showInterstitial(bool);
        } else {
          val$callback.proceed(bool);
        }
      }
      else {
        val$callback.backToSafety(bool);
      }
      return false;
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClient.5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */