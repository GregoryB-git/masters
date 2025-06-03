package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;

class InAppWebView$15
  implements Runnable
{
  public InAppWebView$15(InAppWebView paramInAppWebView) {}
  
  public void run()
  {
    LinearLayout localLinearLayout = this$0.floatingContextMenu;
    if (localLinearLayout != null)
    {
      localLinearLayout.setVisibility(0);
      this$0.floatingContextMenu.animate().alpha(1.0F).setDuration(100L).setListener(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.15
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */