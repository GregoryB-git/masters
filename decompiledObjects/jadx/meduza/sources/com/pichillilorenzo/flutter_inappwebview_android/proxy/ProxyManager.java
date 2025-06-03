package com.pichillilorenzo.flutter_inappwebview_android.proxy;

import c2.b;
import c2.c;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ProxyRuleExt;
import d2.a;
import d2.i0;
import d2.j0;
import d2.u;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import x6.b;

/* loaded from: classes.dex */
public class ProxyManager extends ChannelDelegateImpl {
    public static final String LOG_TAG = "ProxyManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_proxycontroller";
    public static c proxyController;
    public InAppWebViewFlutterPlugin plugin;

    public ProxyManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    private void clearProxyOverride(final MethodChannel.Result result) {
        c cVar = proxyController;
        if (cVar != null) {
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.3
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.4
                @Override // java.lang.Runnable
                public void run() {
                    result.success(Boolean.TRUE);
                }
            };
            u uVar = (u) cVar;
            if (!i0.E.d()) {
                throw i0.a();
            }
            if (uVar.f3411a == null) {
                uVar.f3411a = j0.b.f3390a.getProxyController();
            }
            uVar.f3411a.clearProxyOverride(runnable, executor);
        }
    }

    public static void init() {
        if (proxyController == null && b.c0("PROXY_OVERRIDE")) {
            if (!b.c0("PROXY_OVERRIDE")) {
                throw new UnsupportedOperationException("Proxy override not supported");
            }
            proxyController = c.a.f2215a;
        }
    }

    private void setProxyOverride(ProxySettings proxySettings, final MethodChannel.Result result) {
        if (proxyController != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = proxySettings.bypassRules.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next());
            }
            Iterator<String> it2 = proxySettings.directs.iterator();
            while (it2.hasNext()) {
                arrayList.add(new b.a(it2.next(), "direct://"));
            }
            for (ProxyRuleExt proxyRuleExt : proxySettings.proxyRules) {
                if (proxyRuleExt.getSchemeFilter() != null) {
                    arrayList.add(new b.a(proxyRuleExt.getSchemeFilter(), proxyRuleExt.getUrl()));
                } else {
                    arrayList.add(new b.a("*", proxyRuleExt.getUrl()));
                }
            }
            Boolean bool = proxySettings.bypassSimpleHostnames;
            if (bool != null && bool.booleanValue()) {
                arrayList2.add("<local>");
            }
            Boolean bool2 = proxySettings.removeImplicitRules;
            if (bool2 != null && bool2.booleanValue()) {
                arrayList2.add("<-loopback>");
            }
            boolean booleanValue = (proxySettings.reverseBypassEnabled == null || !x6.b.c0("PROXY_OVERRIDE_REVERSE_BYPASS")) ? false : proxySettings.reverseBypassEnabled.booleanValue();
            c cVar = proxyController;
            Executor executor = new Executor() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.1
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            };
            Runnable runnable = new Runnable() { // from class: com.pichillilorenzo.flutter_inappwebview_android.proxy.ProxyManager.2
                @Override // java.lang.Runnable
                public void run() {
                    result.success(Boolean.TRUE);
                }
            };
            u uVar = (u) cVar;
            uVar.getClass();
            a.d dVar = i0.E;
            a.d dVar2 = i0.K;
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, unmodifiableList.size(), 2);
            for (int i10 = 0; i10 < unmodifiableList.size(); i10++) {
                strArr[i10][0] = ((b.a) unmodifiableList.get(i10)).f2213a;
                strArr[i10][1] = ((b.a) unmodifiableList.get(i10)).f2214b;
            }
            String[] strArr2 = (String[]) Collections.unmodifiableList(arrayList2).toArray(new String[0]);
            if (dVar.d() && !booleanValue) {
                if (uVar.f3411a == null) {
                    uVar.f3411a = j0.b.f3390a.getProxyController();
                }
                uVar.f3411a.setProxyOverride(strArr, strArr2, runnable, executor);
            } else {
                if (!dVar.d() || !dVar2.d()) {
                    throw i0.a();
                }
                if (uVar.f3411a == null) {
                    uVar.f3411a = j0.b.f3390a.getProxyController();
                }
                uVar.f3411a.setProxyOverride(strArr, strArr2, runnable, executor, booleanValue);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        init();
        String str = methodCall.method;
        str.getClass();
        if (str.equals("clearProxyOverride")) {
            if (proxyController != null) {
                clearProxyOverride(result);
                return;
            }
        } else if (!str.equals("setProxyOverride")) {
            result.notImplemented();
            return;
        } else if (proxyController != null) {
            HashMap hashMap = (HashMap) methodCall.argument("settings");
            ProxySettings proxySettings = new ProxySettings();
            if (hashMap != null) {
                proxySettings.parse2((Map<String, Object>) hashMap);
            }
            setProxyOverride(proxySettings, result);
            return;
        }
        result.success(Boolean.FALSE);
    }
}
