package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

class InAppWebView$14
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public void onGlobalLayout()
  {
    LinearLayout localLinearLayout = this$0.floatingContextMenu;
    if (localLinearLayout != null)
    {
      localLinearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
      if (this$0.getSettings().getJavaScriptEnabled()) {
        this$0.onScrollStopped();
      } else {
        this$0.onFloatingActionGlobalLayout(val$x, val$y);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */