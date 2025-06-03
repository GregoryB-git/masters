package com.pichillilorenzo.flutter_inappwebview_android.webview.web_message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import c2.a;
import c2.j;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PluginScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScriptInjectionTime;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewInterface;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import d2.e0;
import d2.i0;
import d2.t;
import defpackage.f;
import defpackage.g;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.b;
import zc.a;

/* loaded from: classes.dex */
public class WebMessageListener implements Disposable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String LOG_TAG = "WebMessageListener";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_web_message_listener_";
    public Set<String> allowedOriginRules;
    public WebMessageListenerChannelDelegate channelDelegate;
    public String id;
    public String jsObjectName;
    public p.b listener;
    public a replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, String str2, Set<String> set) {
        this.id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        StringBuilder l10 = f.l(METHOD_CHANNEL_NAME_PREFIX);
        l10.append(this.id);
        l10.append("_");
        l10.append(this.jsObjectName);
        this.channelDelegate = new WebMessageListenerChannelDelegate(this, new MethodChannel(binaryMessenger, l10.toString()));
        if (this.webView instanceof InAppWebView) {
            this.listener = new p.b() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.1
                @Override // c2.p.b
                public void onPostMessage(WebView webView, j jVar, Uri uri, boolean z10, a aVar) {
                    WebMessageListener webMessageListener = WebMessageListener.this;
                    webMessageListener.replyProxy = aVar;
                    WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = webMessageListener.channelDelegate;
                    if (webMessageListenerChannelDelegate != null) {
                        webMessageListenerChannelDelegate.onPostMessage(WebMessageCompatExt.fromMapWebMessageCompat(jVar), uri.toString().equals("null") ? null : uri.toString(), z10);
                    }
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, BinaryMessenger binaryMessenger, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, binaryMessenger, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    public void assertOriginRulesValid() {
        int i10 = 0;
        for (String str : this.allowedOriginRules) {
            if (str == null) {
                throw new Exception(a0.j.h("allowedOriginRules[", i10, "] is null"));
            }
            if (str.isEmpty()) {
                throw new Exception(a0.j.h("allowedOriginRules[", i10, "] is empty"));
            }
            if (!"*".equals(str)) {
                Uri parse = Uri.parse(str);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                }
                if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                }
                if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                }
                if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                }
                if (!path.isEmpty()) {
                    throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                }
                if (host != null) {
                    int indexOf = host.indexOf("*");
                    if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                        throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                    }
                    if (host.startsWith("[")) {
                        if (!host.endsWith("]")) {
                            throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                        }
                        if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                            throw new Exception(g.e("allowedOriginRules ", str, " is invalid"));
                        }
                    }
                }
                i10++;
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        WebMessageListenerChannelDelegate webMessageListenerChannelDelegate = this.channelDelegate;
        if (webMessageListenerChannelDelegate != null) {
            webMessageListenerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        String str;
        String sb2;
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String str2 : this.allowedOriginRules) {
                if ("*".equals(str2)) {
                    sb2 = "'*'";
                } else {
                    Uri parse = Uri.parse(str2);
                    if (parse.getHost() != null) {
                        StringBuilder l10 = f.l("'");
                        l10.append(Util.replaceAll(parse.getHost(), "'", "\\'"));
                        l10.append("'");
                        str = l10.toString();
                    } else {
                        str = "null";
                    }
                    StringBuilder l11 = f.l("{scheme: '");
                    l11.append(parse.getScheme());
                    l11.append("', host: ");
                    l11.append(str);
                    l11.append(", port: ");
                    l11.append(parse.getPort() != -1 ? Integer.valueOf(parse.getPort()) : "null");
                    l11.append("}");
                    sb2 = l11.toString();
                }
                arrayList.add(sb2);
            }
            String str3 = "(function() {  var allowedOriginRules = [" + TextUtils.join(", ", arrayList) + "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['" + replaceAll + "'] = new FlutterInAppWebViewWebMessageListener('" + replaceAll + "');  }})();";
            UserContentController userContentController = this.webView.getUserContentController();
            StringBuilder l12 = f.l("WebMessageListener-");
            l12.append(this.jsObjectName);
            userContentController.addPluginScript(new PluginScript(l12.toString(), str3, UserScriptInjectionTime.AT_DOCUMENT_START, null, false, null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:17|(2:72|(1:74)(1:75))(1:21)|(2:69|(1:71))(1:24)|25|(8:29|30|31|32|33|(1:63)(1:48)|(1:50)|(2:56|57))|68|31|32|33|(1:35)|63|(0)|(1:62)(4:52|54|56|57)) */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isOriginAllowed(java.lang.String r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener.isOriginAllowed(java.lang.String, java.lang.String, int):boolean");
    }

    public void postMessageForInAppWebView(WebMessageCompatExt webMessageCompatExt, MethodChannel.Result result) {
        Object data;
        if (this.replyProxy != null && b.c0("WEB_MESSAGE_LISTENER") && (data = webMessageCompatExt.getData()) != null) {
            if (b.c0("WEB_MESSAGE_ARRAY_BUFFER") && webMessageCompatExt.getType() == 1) {
                byte[] bArr = (byte[]) data;
                t tVar = (t) this.replyProxy;
                tVar.getClass();
                if (!i0.f3382u.d()) {
                    throw i0.a();
                }
                tVar.f3410a.postMessageWithPayload(new a.C0270a(new e0(bArr)));
            } else {
                c2.a aVar = this.replyProxy;
                String obj = data.toString();
                t tVar2 = (t) aVar;
                tVar2.getClass();
                if (!i0.I.d()) {
                    throw i0.a();
                }
                tVar2.f3410a.postMessage(obj);
            }
        }
        result.success(Boolean.TRUE);
    }
}
