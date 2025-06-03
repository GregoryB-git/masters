package io.flutter.plugins.urllauncher;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class WebViewActivity$FlutterWebChromeClient$1
  extends WebViewClient
{
  public WebViewActivity$FlutterWebChromeClient$1(WebViewActivity.FlutterWebChromeClient paramFlutterWebChromeClient) {}
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
  {
    this$1.this$0.webview.loadUrl(paramWebResourceRequest.getUrl().toString());
    return true;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    this$1.this$0.webview.loadUrl(paramString);
    return true;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.FlutterWebChromeClient.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */