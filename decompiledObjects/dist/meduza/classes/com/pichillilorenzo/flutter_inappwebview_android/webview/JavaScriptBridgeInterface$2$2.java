package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.util.Log;
import android.webkit.WebView;
import f;
import g;
import org.json.JSONObject;

class JavaScriptBridgeInterface$2$2
  extends WebViewChannelDelegate.CallJsHandlerCallback
{
  public JavaScriptBridgeInterface$2$2(JavaScriptBridgeInterface.2 param2) {}
  
  public void defaultBehaviour(Object paramObject)
  {
    if (JavaScriptBridgeInterface.access$000(this$1.this$0) == null) {
      return;
    }
    StringBuilder localStringBuilder = f.l("if (window.flutter_inappwebview[");
    localStringBuilder.append(this$1.val$_callHandlerID);
    localStringBuilder.append("] != null) { window.");
    localStringBuilder.append("flutter_inappwebview");
    localStringBuilder.append("[");
    localStringBuilder.append(this$1.val$_callHandlerID);
    localStringBuilder.append("].resolve(");
    localStringBuilder.append(paramObject);
    localStringBuilder.append("); delete window.");
    localStringBuilder.append("flutter_inappwebview");
    localStringBuilder.append("[");
    paramObject = g.f(localStringBuilder, this$1.val$_callHandlerID, "]; }");
    JavaScriptBridgeInterface.access$000(this$1.this$0).evaluateJavascript((String)paramObject, null);
  }
  
  public void error(String paramString1, String paramString2, Object paramObject)
  {
    paramObject = f.l(paramString1);
    if (paramString2 != null) {
      paramString1 = g.d(", ", paramString2);
    } else {
      paramString1 = "";
    }
    ((StringBuilder)paramObject).append(paramString1);
    paramString2 = ((StringBuilder)paramObject).toString();
    Log.e("JSBridgeInterface", paramString2);
    if (JavaScriptBridgeInterface.access$000(this$1.this$0) == null) {
      return;
    }
    paramString1 = f.l("if (window.flutter_inappwebview[");
    paramString1.append(this$1.val$_callHandlerID);
    paramString1.append("] != null) { window.");
    paramString1.append("flutter_inappwebview");
    paramString1.append("[");
    paramString1.append(this$1.val$_callHandlerID);
    paramString1.append("].reject(new Error(");
    paramString1.append(JSONObject.quote(paramString2));
    paramString1.append(")); delete window.");
    paramString1.append("flutter_inappwebview");
    paramString1.append("[");
    paramString1 = g.f(paramString1, this$1.val$_callHandlerID, "]; }");
    JavaScriptBridgeInterface.access$000(this$1.this$0).evaluateJavascript(paramString1, null);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */