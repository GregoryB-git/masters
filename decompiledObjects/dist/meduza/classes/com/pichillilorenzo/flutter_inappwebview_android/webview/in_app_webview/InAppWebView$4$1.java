package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.os.Handler;
import android.webkit.ValueCallback;

class InAppWebView$4$1
  implements ValueCallback<String>
{
  public InAppWebView$4$1(InAppWebView.4 param4) {}
  
  public void onReceiveValue(String paramString)
  {
    if ((paramString != null) && (!paramString.equals("true")))
    {
      paramString = this$1.this$0;
      mainLooperHandler.postDelayed(checkContextMenuShouldBeClosedTask, newCheckContextMenuShouldBeClosedTaskTask);
    }
    else
    {
      paramString = this$1.this$0;
      if (floatingContextMenu != null) {
        paramString.hideContextMenu();
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.4.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */