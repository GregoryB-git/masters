package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;

class InAppWebView$17
  implements ValueCallback<String>
{
  public void onReceiveValue(String paramString)
  {
    if ((paramString != null) && (!paramString.equalsIgnoreCase("null"))) {
      paramString = paramString.substring(1, paramString.length() - 1);
    } else {
      paramString = null;
    }
    val$resultCallback.onReceiveValue(paramString);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.17
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */