package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;

class InAppWebView$10
  implements Runnable
{
  public void run()
  {
    String str = this$0.userContentController.generateCodeForScriptEvaluation(val$finalScriptToInject, val$contentWorld);
    this$0.evaluateJavascript(str, new ValueCallback()
    {
      public void onReceiveValue(String paramAnonymousString)
      {
        Object localObject = InAppWebView.10.this;
        if (val$resultUuid == null)
        {
          localObject = val$resultCallback;
          if (localObject != null) {
            ((ValueCallback)localObject).onReceiveValue(paramAnonymousString);
          }
        }
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.10
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */