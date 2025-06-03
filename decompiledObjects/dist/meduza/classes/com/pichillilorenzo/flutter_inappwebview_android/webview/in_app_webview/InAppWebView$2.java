package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class InAppWebView$2
  extends GestureDetector.SimpleOnGestureListener
{
  public InAppWebView$2(InAppWebView paramInAppWebView) {}
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    InAppWebView localInAppWebView = this$0;
    if (floatingContextMenu != null) {
      localInAppWebView.hideContextMenu();
    }
    return super.onSingleTapUp(paramMotionEvent);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */