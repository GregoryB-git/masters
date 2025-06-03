package io.flutter.plugins.urllauncher;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;

class WebViewActivity$FlutterWebChromeClient
  extends WebChromeClient
{
  public WebViewActivity$FlutterWebChromeClient(WebViewActivity paramWebViewActivity) {}
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    paramWebView = new WebViewClient()
    {
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, WebResourceRequest paramAnonymousWebResourceRequest)
      {
        this$0.webview.loadUrl(paramAnonymousWebResourceRequest.getUrl().toString());
        return true;
      }
      
      public boolean shouldOverrideUrlLoading(WebView paramAnonymousWebView, String paramAnonymousString)
      {
        this$0.webview.loadUrl(paramAnonymousString);
        return true;
      }
    };
    WebView localWebView = new WebView(this$0.webview.getContext());
    localWebView.setWebViewClient(paramWebView);
    ((WebView.WebViewTransport)obj).setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.FlutterWebChromeClient
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */