package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;

class InAppWebView$18
  implements ValueCallback<String>
{
  public void onReceiveValue(String paramString)
  {
    ValueCallback localValueCallback;
    if ((paramString != null) && (!paramString.isEmpty()) && (!paramString.equalsIgnoreCase("null")) && (!paramString.equalsIgnoreCase("false"))) {
      localValueCallback = val$resultCallback;
    }
    for (paramString = Boolean.TRUE;; paramString = Boolean.FALSE)
    {
      localValueCallback.onReceiveValue(paramString);
      return;
      localValueCallback = val$resultCallback;
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */