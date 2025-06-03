package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.util.concurrent.CountDownLatch;

class ContentBlockerHandler$1
  implements Runnable
{
  public void run()
  {
    val$webViewUrl[0] = val$webView.getUrl();
    val$latch.countDown();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */