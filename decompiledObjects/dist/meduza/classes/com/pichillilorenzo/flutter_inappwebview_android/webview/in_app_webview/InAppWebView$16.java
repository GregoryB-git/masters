package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Point;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;

class InAppWebView$16
  implements ValueCallback<String>
{
  public InAppWebView$16(InAppWebView paramInAppWebView) {}
  
  public void onReceiveValue(String paramString)
  {
    if (this$0.floatingContextMenu != null) {
      if ((paramString != null) && (!paramString.equalsIgnoreCase("null")))
      {
        int i = access$000this$0).x;
        float f = Float.parseFloat(paramString);
        double d = Util.getPixelDensity(this$0.getContext()) * f;
        int j = (int)(this$0.floatingContextMenu.getHeight() / 3.5D + d);
        access$000this$0).y = j;
        this$0.onFloatingActionGlobalLayout(i, j);
      }
      else
      {
        this$0.floatingContextMenu.setVisibility(0);
        this$0.floatingContextMenu.animate().alpha(1.0F).setDuration(100L).setListener(null);
        paramString = this$0;
        paramString.onFloatingActionGlobalLayout(access$000x, access$000this$0).y);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.16
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */