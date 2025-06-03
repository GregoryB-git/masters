package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;

class InAppWebView$6
  implements View.OnLongClickListener
{
  public InAppWebView$6(InAppWebView paramInAppWebView) {}
  
  public boolean onLongClick(View paramView)
  {
    HitTestResult localHitTestResult = HitTestResult.fromWebViewHitTestResult(this$0.getHitTestResult());
    paramView = this$0.channelDelegate;
    if (paramView != null) {
      paramView.onLongPressHitTestResult(localHitTestResult);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */