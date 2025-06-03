package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;

class InAppWebView$19
  implements ValueCallback<String>
{
  public void onReceiveValue(String paramString)
  {
    if ((paramString != null) && (!paramString.equalsIgnoreCase("null"))) {
      paramString = Integer.valueOf(Integer.parseInt(paramString));
    } else {
      paramString = null;
    }
    val$callback.onReceiveValue(paramString);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.19
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */