package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.webkit.ValueCallback;
import c2.j;
import c2.k;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePort;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import d2.c;
import d2.f0;
import d2.i0;
import defpackage.f;
import defpackage.g;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.b;

/* loaded from: classes.dex */
public class WebMessageChannel implements Disposable {
    public static final String LOG_TAG = "WebMessageChannel";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_channel_";
    public WebMessageChannelChannelDelegate channelDelegate;
    public final List<k> compatPorts;
    public String id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        k[] kVarArr;
        this.id = str;
        this.channelDelegate = new WebMessageChannelChannelDelegate(this, new MethodChannel(inAppWebViewInterface.getPlugin().messenger, g.d(METHOD_CHANNEL_NAME_PREFIX, str)));
        if (inAppWebViewInterface instanceof InAppWebView) {
            Uri uri = p.f2234a;
            i0.f3384w.getClass();
            android.webkit.WebMessagePort[] c10 = c.c((InAppWebView) inAppWebViewInterface);
            if (c10 == null) {
                kVarArr = null;
            } else {
                k[] kVarArr2 = new k[c10.length];
                for (int i10 = 0; i10 < c10.length; i10++) {
                    kVarArr2[i10] = new f0(c10[i10]);
                }
                kVarArr = kVarArr2;
            }
            this.compatPorts = new ArrayList(Arrays.asList(kVarArr));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort("port1", this), new WebMessagePort("port2", this));
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    public void closeForInAppWebView(Integer num, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !b.c0("WEB_MESSAGE_PORT_CLOSE")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).a();
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        if (b.c0("WEB_MESSAGE_PORT_CLOSE")) {
            Iterator<k> it = this.compatPorts.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
        }
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript(g.f(f.l("(function() {window.flutter_inappwebview._webMessageChannels['"), this.id, "'] = new MessageChannel();})();"), null, new ValueCallback<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
        } else {
            valueCallback.onReceiveValue(this);
        }
    }

    public void onMessage(int i10, WebMessageCompatExt webMessageCompatExt) {
        WebMessageChannelChannelDelegate webMessageChannelChannelDelegate = this.channelDelegate;
        if (webMessageChannelChannelDelegate != null) {
            webMessageChannelChannelDelegate.onMessage(i10, webMessageCompatExt);
        }
    }

    public void postMessageForInAppWebView(Integer num, WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !b.c0("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            result.success(Boolean.TRUE);
            return;
        }
        k kVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<WebMessagePortCompatExt> ports = webMessageCompatExt.getPorts();
        if (ports != null) {
            for (WebMessagePortCompatExt webMessagePortCompatExt : ports) {
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(webMessagePortCompatExt.getWebMessageChannelId());
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(webMessagePortCompatExt.getIndex()));
                }
            }
        }
        Object data = webMessageCompatExt.getData();
        try {
            kVar.d((b.c0("WEB_MESSAGE_ARRAY_BUFFER") && data != null && webMessageCompatExt.getType() == 1) ? new j((byte[]) data, (k[]) arrayList.toArray(new k[0])) : new j(data != null ? data.toString() : null, (k[]) arrayList.toArray(new k[0])));
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public void setWebMessageCallbackForInAppWebView(final int i10, MethodChannel.Result result) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !b.c0("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            result.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(i10).e(new k.a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel.2
                @Override // c2.k.a
                public void onMessage(k kVar, j jVar) {
                    super.onMessage(kVar, jVar);
                    this.onMessage(i10, jVar != null ? WebMessageCompatExt.fromMapWebMessageCompat(jVar) : null);
                }
            });
            result.success(Boolean.TRUE);
        } catch (Exception e10) {
            result.error(LOG_TAG, e10.getMessage(), null);
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.id);
        return hashMap;
    }
}
