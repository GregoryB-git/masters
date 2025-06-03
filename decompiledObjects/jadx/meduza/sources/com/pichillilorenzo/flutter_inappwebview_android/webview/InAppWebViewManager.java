package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c2.p;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import d2.a;
import d2.i0;
import d2.j;
import d2.j0;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.b;

/* loaded from: classes.dex */
public class InAppWebViewManager extends ChannelDelegateImpl {
    public static final String LOG_TAG = "InAppWebViewManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_manager";
    public final Map<String, FlutterWebView> keepAliveWebViews;
    public InAppWebViewFlutterPlugin plugin;
    public int windowAutoincrementId;
    public final Map<Integer, Message> windowWebViewMessages;

    public InAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.keepAliveWebViews = new HashMap();
        this.windowWebViewMessages = new HashMap();
        this.windowAutoincrementId = 0;
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void clearAllCache(Context context, boolean z10) {
        WebView webView = new WebView(context);
        webView.clearCache(z10);
        webView.destroy();
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        Iterator<FlutterWebView> it = this.keepAliveWebViews.values().iterator();
        while (it.hasNext()) {
            String str = it.next().keepAliveId;
            if (str != null) {
                disposeKeepAlive(str);
            }
        }
        this.keepAliveWebViews.clear();
        this.windowWebViewMessages.clear();
        this.plugin = null;
    }

    public void disposeKeepAlive(String str) {
        ViewGroup viewGroup;
        FlutterWebView flutterWebView = this.keepAliveWebViews.get(str);
        if (flutterWebView != null) {
            flutterWebView.keepAliveId = null;
            View view = flutterWebView.getView();
            if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
                viewGroup.removeView(view);
            }
            flutterWebView.dispose();
        }
        if (this.keepAliveWebViews.containsKey(str)) {
            this.keepAliveWebViews.put(str, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        char c10;
        Object variationsHeader;
        Uri safeBrowsingPrivacyPolicyUrl;
        Context context;
        String str = methodCall.method;
        str.getClass();
        switch (str.hashCode()) {
            case -1496477679:
                if (str.equals("disableWebView")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -633518365:
                if (str.equals("getVariationsHeader")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 426229521:
                if (str.equals("setSafeBrowsingAllowlist")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1033609166:
                if (str.equals("clearAllCache")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1667434977:
                if (str.equals("isMultiProcessEnabled")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1867011305:
                if (str.equals("disposeKeepAlive")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        Map<String, Object> map = null;
        switch (c10) {
            case 0:
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.disableWebView();
                }
                variationsHeader = Boolean.TRUE;
                result.success(variationsHeader);
                return;
            case 1:
                WebView.setWebContentsDebuggingEnabled(((Boolean) methodCall.argument("debuggingEnabled")).booleanValue());
                variationsHeader = Boolean.TRUE;
                result.success(variationsHeader);
                return;
            case 2:
                if (b.c0("GET_VARIATIONS_HEADER")) {
                    Uri uri = p.f2234a;
                    if (!i0.L.d()) {
                        throw i0.a();
                    }
                    variationsHeader = j0.b.f3390a.getStatics().getVariationsHeader();
                    result.success(variationsHeader);
                    return;
                }
                result.success(map);
                return;
            case 3:
                WebView.clearClientCertPreferences(new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.1
                    @Override // java.lang.Runnable
                    public void run() {
                        result.success(Boolean.TRUE);
                    }
                });
                return;
            case 4:
                if (b.c0("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    Uri uri2 = p.f2234a;
                    a.f fVar = i0.f3369g;
                    if (fVar.c()) {
                        safeBrowsingPrivacyPolicyUrl = j.b();
                    } else {
                        if (!fVar.d()) {
                            throw i0.a();
                        }
                        safeBrowsingPrivacyPolicyUrl = j0.b.f3390a.getStatics().getSafeBrowsingPrivacyPolicyUrl();
                    }
                    variationsHeader = safeBrowsingPrivacyPolicyUrl.toString();
                    result.success(variationsHeader);
                    return;
                }
                result.success(map);
                return;
            case 5:
                if (b.c0("SAFE_BROWSING_ALLOWLIST")) {
                    p.e(new HashSet((List) methodCall.argument("hosts")), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.2
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            result.success(bool);
                        }
                    });
                    return;
                }
                if (b.c0("SAFE_BROWSING_WHITELIST")) {
                    List list = (List) methodCall.argument("hosts");
                    ValueCallback<Boolean> valueCallback = new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager.3
                        @Override // android.webkit.ValueCallback
                        public void onReceiveValue(Boolean bool) {
                            result.success(bool);
                        }
                    };
                    Uri uri3 = p.f2234a;
                    p.e(new HashSet(list), valueCallback);
                    return;
                }
                variationsHeader = Boolean.FALSE;
                result.success(variationsHeader);
                return;
            case 6:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
                if (inAppWebViewFlutterPlugin != null) {
                    variationsHeader = WebSettings.getDefaultUserAgent(inAppWebViewFlutterPlugin.applicationContext);
                    result.success(variationsHeader);
                    return;
                }
                result.success(map);
                return;
            case 7:
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (inAppWebViewFlutterPlugin2 != null) {
                    Context context2 = inAppWebViewFlutterPlugin2.activity;
                    if (context2 == null) {
                        context2 = inAppWebViewFlutterPlugin2.applicationContext;
                    }
                    if (context2 != null) {
                        clearAllCache(context2, ((Boolean) methodCall.argument("includeDiskFiles")).booleanValue());
                    }
                }
                variationsHeader = Boolean.TRUE;
                result.success(variationsHeader);
                return;
            case '\b':
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.plugin;
                if (inAppWebViewFlutterPlugin3 != null) {
                    context = inAppWebViewFlutterPlugin3.activity;
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin3.applicationContext;
                    }
                } else {
                    context = null;
                }
                PackageInfo b10 = context != null ? p.b(context) : null;
                if (b10 != null) {
                    map = convertWebViewPackageToMap(b10);
                }
                result.success(map);
                return;
            case '\t':
                if (b.c0("MULTI_PROCESS")) {
                    Uri uri4 = p.f2234a;
                    if (!i0.F.d()) {
                        throw i0.a();
                    }
                    variationsHeader = Boolean.valueOf(j0.b.f3390a.getStatics().isMultiProcessEnabled());
                    result.success(variationsHeader);
                    return;
                }
                variationsHeader = Boolean.FALSE;
                result.success(variationsHeader);
                return;
            case '\n':
                String str2 = (String) methodCall.argument("keepAliveId");
                if (str2 != null) {
                    disposeKeepAlive(str2);
                }
                variationsHeader = Boolean.TRUE;
                result.success(variationsHeader);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
