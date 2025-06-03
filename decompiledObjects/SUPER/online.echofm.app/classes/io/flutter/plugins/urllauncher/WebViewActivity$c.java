package io.flutter.plugins.urllauncher;

import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;

public class WebViewActivity$c
  extends WebChromeClient
{
  public WebViewActivity$c(WebViewActivity paramWebViewActivity) {}
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    paramWebView = new a();
    WebView localWebView = new WebView(a.q.getContext());
    localWebView.setWebViewClient(paramWebView);
    ((WebView.WebViewTransport)obj).setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public class a
    extends WebViewClient
  {
    public a() {}
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, WebResourceRequest paramWebResourceRequest)
    {
      a.q.loadUrl(paramWebResourceRequest.getUrl().toString());
      return true;
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      a.q.loadUrl(paramString);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.WebViewActivity.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */