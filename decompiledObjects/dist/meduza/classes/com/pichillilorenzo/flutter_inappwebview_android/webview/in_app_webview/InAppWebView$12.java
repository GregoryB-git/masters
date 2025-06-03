package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;

class InAppWebView$12
  implements View.OnClickListener
{
  public void onClick(View paramView)
  {
    this$0.hideContextMenu();
    val$callback.onActionItemClicked(val$actionMode, val$menuItem);
    paramView = this$0.channelDelegate;
    if (paramView != null) {
      paramView.onContextMenuActionItemClicked(val$itemId, val$itemTitle);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.12
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */