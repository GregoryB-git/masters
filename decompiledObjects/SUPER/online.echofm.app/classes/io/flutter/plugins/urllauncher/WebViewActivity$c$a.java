package io.flutter.plugins.urllauncher;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity$c$a
  extends WebViewClient
{
  public WebViewActivity$c$a(WebViewActivity.c paramc) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    a.a.q.loadUrl(paramWebResourceRequest.getUrl().toString());
    return true;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    a.a.q.loadUrl(paramString);
    return true;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */