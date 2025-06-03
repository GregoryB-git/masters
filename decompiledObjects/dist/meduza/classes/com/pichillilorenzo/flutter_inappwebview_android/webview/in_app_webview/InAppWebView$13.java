package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.View;
import android.view.View.OnClickListener;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;

class InAppWebView$13
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    this$0.hideContextMenu();
    paramView = this$0.channelDelegate;
    if (paramView != null) {
      paramView.onContextMenuActionItemClicked(val$itemId, val$itemTitle);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.13
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */