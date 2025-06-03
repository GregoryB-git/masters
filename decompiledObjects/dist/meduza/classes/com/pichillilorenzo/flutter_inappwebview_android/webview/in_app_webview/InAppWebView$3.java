package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Handler;
import android.view.View;

class InAppWebView$3
  implements Runnable
{
  public InAppWebView$3(InAppWebView paramInAppWebView) {}
  
  public void run()
  {
    int i = this$0.getScrollY();
    InAppWebView localInAppWebView = this$0;
    if (initialPositionScrollStoppedTask - i == 0)
    {
      localInAppWebView.onScrollStopped();
    }
    else
    {
      initialPositionScrollStoppedTask = localInAppWebView.getScrollY();
      localInAppWebView = this$0;
      mainLooperHandler.postDelayed(checkScrollStoppedTask, newCheckScrollStoppedTask);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */