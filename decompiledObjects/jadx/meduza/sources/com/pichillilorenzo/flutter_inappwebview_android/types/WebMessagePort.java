package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import defpackage.f;
import defpackage.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class WebMessagePort {
    public String name;
    public WebMessageChannel webMessageChannel;
    public boolean isClosed = false;
    public boolean isTransferred = false;
    public boolean isStarted = false;

    public WebMessagePort(String str, WebMessageChannel webMessageChannel) {
        this.name = str;
        this.webMessageChannel = webMessageChannel;
    }

    public void close(final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        if (this.isTransferred) {
            throw new Exception("Port is already transferred");
        }
        this.isClosed = true;
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface == null) {
            valueCallback.onReceiveValue(null);
            return;
        }
        StringBuilder l10 = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        l10.append(this.webMessageChannel.id);
        l10.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        inAppWebViewInterface.evaluateJavascript(g.f(l10, this.name, ".close();  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.3
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                valueCallback.onReceiveValue(null);
            }
        });
    }

    public void dispose() {
        this.isClosed = true;
        this.webMessageChannel = null;
    }

    public void postMessage(WebMessage webMessage, final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        String str;
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface != null) {
            List<WebMessagePort> list = webMessage.ports;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (WebMessagePort webMessagePort : list) {
                    if (webMessagePort == this) {
                        throw new Exception("Source port cannot be transferred");
                    }
                    if (webMessagePort.isStarted) {
                        throw new Exception("Port is already started");
                    }
                    if (webMessagePort.isClosed || webMessagePort.isTransferred) {
                        throw new Exception("Port is already closed or transferred");
                    }
                    webMessagePort.isTransferred = true;
                    StringBuilder l10 = f.l("window.flutter_inappwebview._webMessageChannels['");
                    l10.append(this.webMessageChannel.id);
                    l10.append("'].");
                    l10.append(webMessagePort.name);
                    arrayList.add(l10.toString());
                }
                StringBuilder l11 = f.l("[");
                l11.append(TextUtils.join(", ", arrayList));
                l11.append("]");
                str = l11.toString();
            } else {
                str = "null";
            }
            String str2 = webMessage.data;
            String replaceAll = str2 != null ? Util.replaceAll(str2, "'", "\\'") : "null";
            StringBuilder l12 = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
            l12.append(this.webMessageChannel.id);
            l12.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
            l12.append(this.name);
            l12.append(".postMessage('");
            l12.append(replaceAll);
            l12.append("', ");
            inAppWebViewInterface.evaluateJavascript(g.f(l12, str, ");  }})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str3) {
                    valueCallback.onReceiveValue(null);
                }
            });
        } else {
            valueCallback.onReceiveValue(null);
        }
        webMessage.dispose();
    }

    public void setWebMessageCallback(final ValueCallback<Void> valueCallback) {
        InAppWebViewInterface inAppWebViewInterface;
        if (this.isClosed || this.isTransferred) {
            throw new Exception("Port is already closed or transferred");
        }
        this.isStarted = true;
        WebMessageChannel webMessageChannel = this.webMessageChannel;
        if (webMessageChannel == null || (inAppWebViewInterface = webMessageChannel.webView) == null) {
            inAppWebViewInterface = null;
        }
        if (inAppWebViewInterface == null) {
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        int i10 = 1 ^ (this.name.equals("port1") ? 1 : 0);
        StringBuilder l10 = f.l("(function() {  var webMessageChannel = window.flutter_inappwebview._webMessageChannels['");
        l10.append(this.webMessageChannel.id);
        l10.append("'];  if (webMessageChannel != null) {      webMessageChannel.");
        l10.append(this.name);
        l10.append(".onmessage = function (event) {          window.");
        l10.append(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
        l10.append(".callHandler('onWebMessagePortMessageReceived', {              'webMessageChannelId': '");
        l10.append(this.webMessageChannel.id);
        l10.append("',              'index': ");
        l10.append(i10);
        l10.append(",              'message': event.data          });      }  }})();");
        inAppWebViewInterface.evaluateJavascript(l10.toString(), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                ValueCallback valueCallback2 = valueCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(null);
                }
            }
        });
    }
}
