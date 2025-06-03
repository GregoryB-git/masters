package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

class FlutterWebView$1
  implements Runnable
{
  public FlutterWebView$1(FlutterWebView paramFlutterWebView) {}
  
  public void run()
  {
    InAppWebView localInAppWebView = this$0.webView;
    if (localInAppWebView != null) {
      localInAppWebView.prepareAndAddUserScripts();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */