package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;

class InAppWebView$10$1
  implements ValueCallback<String>
{
  public InAppWebView$10$1(InAppWebView.10 param10) {}
  
  public void onReceiveValue(String paramString)
  {
    Object localObject = this$1;
    if (val$resultUuid == null)
    {
      localObject = val$resultCallback;
      if (localObject != null) {
        ((ValueCallback)localObject).onReceiveValue(paramString);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */