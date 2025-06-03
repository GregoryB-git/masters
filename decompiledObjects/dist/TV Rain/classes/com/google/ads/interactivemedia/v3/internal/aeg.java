package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import java.util.List;

final class aeg
  extends WebChromeClient
{
  public aeg(Context paramContext, afc paramafc, List paramList) {}
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    paramWebView = (WebView.WebViewTransport)obj;
    paramWebView.setWebView(new WebView(c));
    paramWebView.getWebView().setWebViewClient(new aef(this));
    paramMessage.sendToTarget();
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aeg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */