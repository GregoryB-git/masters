package com.pichillilorenzo.flutter_inappwebview_android.webview;

import a0.j;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import f;
import g;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JavaScriptBridgeInterface$2
  implements Runnable
{
  public void run()
  {
    if (JavaScriptBridgeInterface.access$000(this$0) == null) {
      return;
    }
    final Object localObject1;
    if (val$handlerName.equals("onPrintRequest"))
    {
      localObject1 = new PrintJobSettings();
      handledByClient = Boolean.TRUE;
      localObject1 = JavaScriptBridgeInterface.access$000(this$0).printCurrentPage((PrintJobSettings)localObject1);
      if ((JavaScriptBridgeInterface.access$000(this$0) != null) && (access$000this$0).channelDelegate != null)) {
        access$000this$0).channelDelegate.onPrintRequest(JavaScriptBridgeInterface.access$000(this$0).getUrl(), (String)localObject1, new WebViewChannelDelegate.PrintRequestCallback()
        {
          public void defaultBehaviour(Boolean paramAnonymousBoolean)
          {
            if ((JavaScriptBridgeInterface.access$000(this$0) != null) && (access$000this$0).plugin != null) && (access$000this$0).plugin.printJobManager != null))
            {
              paramAnonymousBoolean = (PrintJobController)access$000this$0).plugin.printJobManager.jobs.get(localObject1);
              if (paramAnonymousBoolean != null) {
                paramAnonymousBoolean.disposeNoCancel();
              }
            }
          }
          
          public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
          {
            paramAnonymousString1 = g.g(paramAnonymousString1, ", ");
            if (paramAnonymousString2 == null) {
              paramAnonymousString2 = "";
            }
            j.t(paramAnonymousString1, paramAnonymousString2, "JSBridgeInterface");
            defaultBehaviour(null);
          }
          
          public boolean nonNullSuccess(Boolean paramAnonymousBoolean)
          {
            return paramAnonymousBoolean.booleanValue() ^ true;
          }
        });
      }
      return;
    }
    Object localObject3;
    Object localObject4;
    if (val$handlerName.equals("callAsyncJavaScript"))
    {
      try
      {
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>(val$args);
        localObject3 = ((JSONArray)localObject1).getJSONObject(0);
        localObject1 = ((JSONObject)localObject3).getString("resultUuid");
        localObject4 = (ValueCallback)access$000this$0).callAsyncJavaScriptCallbacks.get(localObject1);
        if (localObject4 != null)
        {
          ((ValueCallback)localObject4).onReceiveValue(((JSONObject)localObject3).toString());
          access$000this$0).callAsyncJavaScriptCallbacks.remove(localObject1);
        }
      }
      catch (JSONException localJSONException1)
      {
        Log.e("JSBridgeInterface", "", localJSONException1);
      }
      return;
    }
    if (val$handlerName.equals("evaluateJavaScriptWithContentWorld"))
    {
      try
      {
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>(val$args);
        localObject2 = ((JSONArray)localObject2).getJSONObject(0);
        localObject4 = ((JSONObject)localObject2).getString("resultUuid");
        localObject3 = (ValueCallback)access$000this$0).evaluateJavaScriptContentWorldCallbacks.get(localObject4);
        if (localObject3 != null)
        {
          if (((JSONObject)localObject2).has("value")) {
            localObject2 = ((JSONObject)localObject2).get("value").toString();
          } else {
            localObject2 = "null";
          }
          ((ValueCallback)localObject3).onReceiveValue(localObject2);
          access$000this$0).evaluateJavaScriptContentWorldCallbacks.remove(localObject4);
        }
      }
      catch (JSONException localJSONException2)
      {
        Log.e("JSBridgeInterface", "", localJSONException2);
      }
      return;
    }
    if (access$000this$0).channelDelegate != null) {
      access$000this$0).channelDelegate.onCallJsHandler(val$handlerName, val$args, new WebViewChannelDelegate.CallJsHandlerCallback()
      {
        public void defaultBehaviour(Object paramAnonymousObject)
        {
          if (JavaScriptBridgeInterface.access$000(this$0) == null) {
            return;
          }
          StringBuilder localStringBuilder = f.l("if (window.flutter_inappwebview[");
          localStringBuilder.append(val$_callHandlerID);
          localStringBuilder.append("] != null) { window.");
          localStringBuilder.append("flutter_inappwebview");
          localStringBuilder.append("[");
          localStringBuilder.append(val$_callHandlerID);
          localStringBuilder.append("].resolve(");
          localStringBuilder.append(paramAnonymousObject);
          localStringBuilder.append("); delete window.");
          localStringBuilder.append("flutter_inappwebview");
          localStringBuilder.append("[");
          paramAnonymousObject = g.f(localStringBuilder, val$_callHandlerID, "]; }");
          JavaScriptBridgeInterface.access$000(this$0).evaluateJavascript((String)paramAnonymousObject, null);
        }
        
        public void error(String paramAnonymousString1, String paramAnonymousString2, Object paramAnonymousObject)
        {
          paramAnonymousObject = f.l(paramAnonymousString1);
          if (paramAnonymousString2 != null) {
            paramAnonymousString1 = g.d(", ", paramAnonymousString2);
          } else {
            paramAnonymousString1 = "";
          }
          ((StringBuilder)paramAnonymousObject).append(paramAnonymousString1);
          paramAnonymousString2 = ((StringBuilder)paramAnonymousObject).toString();
          Log.e("JSBridgeInterface", paramAnonymousString2);
          if (JavaScriptBridgeInterface.access$000(this$0) == null) {
            return;
          }
          paramAnonymousString1 = f.l("if (window.flutter_inappwebview[");
          paramAnonymousString1.append(val$_callHandlerID);
          paramAnonymousString1.append("] != null) { window.");
          paramAnonymousString1.append("flutter_inappwebview");
          paramAnonymousString1.append("[");
          paramAnonymousString1.append(val$_callHandlerID);
          paramAnonymousString1.append("].reject(new Error(");
          paramAnonymousString1.append(JSONObject.quote(paramAnonymousString2));
          paramAnonymousString1.append(")); delete window.");
          paramAnonymousString1.append("flutter_inappwebview");
          paramAnonymousString1.append("[");
          paramAnonymousString1 = g.f(paramAnonymousString1, val$_callHandlerID, "]; }");
          JavaScriptBridgeInterface.access$000(this$0).evaluateJavascript(paramAnonymousString1, null);
        }
      });
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */