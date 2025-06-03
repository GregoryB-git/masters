package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

class InputAwareWebView$1
  implements Runnable
{
  public void run()
  {
    Object localObject = this$0;
    if (containerView == null)
    {
      Log.e("InputAwareWebView", "Can't set the input connection target because there is no containerView to use as a handler.");
      return;
    }
    localObject = (InputMethodManager)((View)localObject).getContext().getSystemService("input_method");
    val$targetView.onWindowFocusChanged(true);
    if (Build.VERSION.SDK_INT < 29) {
      ((InputMethodManager)localObject).isActive(this$0.containerView);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InputAwareWebView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */