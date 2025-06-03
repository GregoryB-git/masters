package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import f;

class InAppWebView$9
  implements ValueCallback<String>
{
  public void onReceiveValue(String paramString)
  {
    int i;
    if ((paramString != null) && (!paramString.equalsIgnoreCase("null"))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      paramString = f.l("window.");
      paramString.append(val$flagVariable);
      paramString.append(" = ");
      paramString.append(val$enable);
      paramString.append(";");
      paramString = paramString.toString();
      this$0.evaluateJavascript(paramString, null, null);
      if (!val$enable) {
        this$0.userContentController.removePluginScript(val$pluginScript);
      }
    }
    else if (val$enable)
    {
      this$0.evaluateJavascript(val$pluginScript.getSource(), null, null);
      this$0.userContentController.addPluginScript(val$pluginScript);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */