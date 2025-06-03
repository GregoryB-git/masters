package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

class InAppWebView$11
  implements Runnable
{
  public InAppWebView$11(InAppWebView paramInAppWebView) {}
  
  public void run()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this$0.getContext().getSystemService("input_method");
    if (localInputMethodManager != null) {}
    try
    {
      bool = localInputMethodManager.isAcceptingText();
    }
    catch (Exception localException)
    {
      boolean bool;
      View localView;
      for (;;) {}
    }
    bool = false;
    localView = this$0.containerView;
    if ((localView != null) && (localInputMethodManager != null) && (!bool)) {
      localInputMethodManager.hideSoftInputFromWindow(localView.getWindowToken(), 2);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.11
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */