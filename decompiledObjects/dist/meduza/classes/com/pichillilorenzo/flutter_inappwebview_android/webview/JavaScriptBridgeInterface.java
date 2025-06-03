package com.pichillilorenzo.flutter_inappwebview_android.webview;

import a0.j;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
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

public class JavaScriptBridgeInterface
{
  private static final String LOG_TAG = "JSBridgeInterface";
  private InAppWebView inAppWebView;
  
  public JavaScriptBridgeInterface(InAppWebView paramInAppWebView)
  {
    inAppWebView = paramInAppWebView;
  }
  
  @JavascriptInterface
  public void _callHandler(final String paramString1, final String paramString2, final String paramString3)
  {
    if (inAppWebView == null) {
      return;
    }
    new Handler(inAppWebView.getWebViewLooper()).post(new Runnable()
    {
      public void run()
      {
        if (JavaScriptBridgeInterface.access$000(this$0) == null) {
          return;
        }
        final Object localObject1;
        if (paramString1.equals("onPrintRequest"))
        {
          localObject1 = new PrintJobSettings();
          handledByClient = Boolean.TRUE;
          localObject1 = JavaScriptBridgeInterface.access$000(this$0).printCurrentPage((PrintJobSettings)localObject1);
          if ((JavaScriptBridgeInterface.access$000(this$0) != null) && (access$000this$0).channelDelegate != null)) {
            access$000this$0).channelDelegate.onPrintRequest(JavaScriptBridgeInterface.access$000(this$0).getUrl(), (String)localObject1, new WebViewChannelDelegate.PrintRequestCallback()
            {
              public void defaultBehaviour(Boolean paramAnonymous2Boolean)
              {
                if ((JavaScriptBridgeInterface.access$000(this$0) != null) && (access$000this$0).plugin != null) && (access$000this$0).plugin.printJobManager != null))
                {
                  paramAnonymous2Boolean = (PrintJobController)access$000this$0).plugin.printJobManager.jobs.get(localObject1);
                  if (paramAnonymous2Boolean != null) {
                    paramAnonymous2Boolean.disposeNoCancel();
                  }
                }
              }
              
              public void error(String paramAnonymous2String1, String paramAnonymous2String2, Object paramAnonymous2Object)
              {
                paramAnonymous2String1 = g.g(paramAnonymous2String1, ", ");
                if (paramAnonymous2String2 == null) {
                  paramAnonymous2String2 = "";
                }
                j.t(paramAnonymous2String1, paramAnonymous2String2, "JSBridgeInterface");
                defaultBehaviour(null);
              }
              
              public boolean nonNullSuccess(Boolean paramAnonymous2Boolean)
              {
                return paramAnonymous2Boolean.booleanValue() ^ true;
              }
            });
          }
          return;
        }
        Object localObject3;
        Object localObject4;
        if (paramString1.equals("callAsyncJavaScript"))
        {
          try
          {
            localObject1 = new org/json/JSONArray;
            ((JSONArray)localObject1).<init>(paramString3);
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
        if (paramString1.equals("evaluateJavaScriptWithContentWorld"))
        {
          try
          {
            Object localObject2 = new org/json/JSONArray;
            ((JSONArray)localObject2).<init>(paramString3);
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
          access$000this$0).channelDelegate.onCallJsHandler(paramString1, paramString3, new WebViewChannelDelegate.CallJsHandlerCallback()
          {
            public void defaultBehaviour(Object paramAnonymous2Object)
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
              localStringBuilder.append(paramAnonymous2Object);
              localStringBuilder.append("); delete window.");
              localStringBuilder.append("flutter_inappwebview");
              localStringBuilder.append("[");
              paramAnonymous2Object = g.f(localStringBuilder, val$_callHandlerID, "]; }");
              JavaScriptBridgeInterface.access$000(this$0).evaluateJavascript((String)paramAnonymous2Object, null);
            }
            
            public void error(String paramAnonymous2String1, String paramAnonymous2String2, Object paramAnonymous2Object)
            {
              paramAnonymous2Object = f.l(paramAnonymous2String1);
              if (paramAnonymous2String2 != null) {
                paramAnonymous2String1 = g.d(", ", paramAnonymous2String2);
              } else {
                paramAnonymous2String1 = "";
              }
              ((StringBuilder)paramAnonymous2Object).append(paramAnonymous2String1);
              paramAnonymous2String2 = ((StringBuilder)paramAnonymous2Object).toString();
              Log.e("JSBridgeInterface", paramAnonymous2String2);
              if (JavaScriptBridgeInterface.access$000(this$0) == null) {
                return;
              }
              paramAnonymous2String1 = f.l("if (window.flutter_inappwebview[");
              paramAnonymous2String1.append(val$_callHandlerID);
              paramAnonymous2String1.append("] != null) { window.");
              paramAnonymous2String1.append("flutter_inappwebview");
              paramAnonymous2String1.append("[");
              paramAnonymous2String1.append(val$_callHandlerID);
              paramAnonymous2String1.append("].reject(new Error(");
              paramAnonymous2String1.append(JSONObject.quote(paramAnonymous2String2));
              paramAnonymous2String1.append(")); delete window.");
              paramAnonymous2String1.append("flutter_inappwebview");
              paramAnonymous2String1.append("[");
              paramAnonymous2String1 = g.f(paramAnonymous2String1, val$_callHandlerID, "]; }");
              JavaScriptBridgeInterface.access$000(this$0).evaluateJavascript(paramAnonymous2String1, null);
            }
          });
        }
      }
    });
  }
  
  @JavascriptInterface
  public void _hideContextMenu()
  {
    if (inAppWebView == null) {
      return;
    }
    new Handler(inAppWebView.getWebViewLooper()).post(new Runnable()
    {
      public void run()
      {
        if ((JavaScriptBridgeInterface.access$000(JavaScriptBridgeInterface.this) != null) && (access$000floatingContextMenu != null)) {
          JavaScriptBridgeInterface.access$000(JavaScriptBridgeInterface.this).hideContextMenu();
        }
      }
    });
  }
  
  public void dispose()
  {
    inAppWebView = null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */