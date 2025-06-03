package com.pichillilorenzo.flutter_inappwebview_android.webview;

import a0.j;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import defpackage.f;
import defpackage.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    private InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView) {
        this.inAppWebView = inAppWebView;
    }

    @JavascriptInterface
    public void _callHandler(final String str, final String str2, final String str3) {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                    return;
                }
                if (str.equals("onPrintRequest")) {
                    PrintJobSettings printJobSettings = new PrintJobSettings();
                    printJobSettings.handledByClient = Boolean.TRUE;
                    final String printCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
                    if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.channelDelegate == null) {
                        return;
                    }
                    JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), printCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.1
                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public void defaultBehaviour(Boolean bool) {
                            PrintJobController printJobController;
                            if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.plugin == null || JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager == null || (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(printCurrentPage)) == null) {
                                return;
                            }
                            printJobController.disposeNoCancel();
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                        public void error(String str4, String str5, Object obj) {
                            StringBuilder g10 = g.g(str4, ", ");
                            if (str5 == null) {
                                str5 = "";
                            }
                            j.t(g10, str5, JavaScriptBridgeInterface.LOG_TAG);
                            defaultBehaviour((Boolean) null);
                        }

                        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                        public boolean nonNullSuccess(Boolean bool) {
                            return !bool.booleanValue();
                        }
                    });
                    return;
                }
                if (str.equals("callAsyncJavaScript")) {
                    try {
                        JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
                        String string = jSONObject.getString("resultUuid");
                        ValueCallback<String> valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
                        if (valueCallback != null) {
                            valueCallback.onReceiveValue(jSONObject.toString());
                            JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
                            return;
                        }
                        return;
                    } catch (JSONException e10) {
                        Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e10);
                        return;
                    }
                }
                if (!str.equals("evaluateJavaScriptWithContentWorld")) {
                    if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                        JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(str, str3, new WebViewChannelDelegate.CallJsHandlerCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.2.2
                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                            public void defaultBehaviour(Object obj) {
                                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                    return;
                                }
                                StringBuilder l10 = f.l("if (window.flutter_inappwebview[");
                                l10.append(str2);
                                l10.append("] != null) { window.");
                                l10.append(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
                                l10.append("[");
                                l10.append(str2);
                                l10.append("].resolve(");
                                l10.append(obj);
                                l10.append("); delete window.");
                                l10.append(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
                                l10.append("[");
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(g.f(l10, str2, "]; }"), null);
                            }

                            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                            public void error(String str4, String str5, Object obj) {
                                StringBuilder l10 = f.l(str4);
                                l10.append(str5 != null ? g.d(", ", str5) : "");
                                String sb2 = l10.toString();
                                Log.e(JavaScriptBridgeInterface.LOG_TAG, sb2);
                                if (JavaScriptBridgeInterface.this.inAppWebView == null) {
                                    return;
                                }
                                StringBuilder l11 = f.l("if (window.flutter_inappwebview[");
                                l11.append(str2);
                                l11.append("] != null) { window.");
                                l11.append(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
                                l11.append("[");
                                l11.append(str2);
                                l11.append("].reject(new Error(");
                                l11.append(JSONObject.quote(sb2));
                                l11.append(")); delete window.");
                                l11.append(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
                                l11.append("[");
                                JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(g.f(l11, str2, "]; }"), null);
                            }
                        });
                        return;
                    }
                    return;
                }
                try {
                    JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
                    String string2 = jSONObject2.getString("resultUuid");
                    ValueCallback<String> valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
                    if (valueCallback2 != null) {
                        valueCallback2.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                        JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                    }
                } catch (JSONException e11) {
                    Log.e(JavaScriptBridgeInterface.LOG_TAG, "", e11);
                }
            }
        });
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView == null) {
            return;
        }
        new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.JavaScriptBridgeInterface.1
            @Override // java.lang.Runnable
            public void run() {
                if (JavaScriptBridgeInterface.this.inAppWebView == null || JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu == null) {
                    return;
                }
                JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
            }
        });
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
