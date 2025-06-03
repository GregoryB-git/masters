package io.flutter.plugins.urllauncher;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class WebViewActivity$2
  extends WebViewClient
{
  public WebViewActivity$2(WebViewActivity paramWebViewActivity) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    paramWebView.loadUrl(paramWebResourceRequest.getUrl().toString());
    return false;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */