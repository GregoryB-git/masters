package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import c2.g;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import d2.a;
import d2.d;
import d2.i0;
import d2.x;
import d2.y;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;
import x6.b;

/* loaded from: classes.dex */
public class ServiceWorkerChannelDelegate extends ChannelDelegateImpl {
    private ServiceWorkerManager serviceWorkerManager;

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public ServiceWorkerChannelDelegate(ServiceWorkerManager serviceWorkerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.serviceWorkerManager = serviceWorkerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.serviceWorkerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        y yVar;
        boolean allowContentAccess;
        int cacheMode;
        Object valueOf;
        ServiceWorkerManager.init();
        g gVar = ServiceWorkerManager.serviceWorkerController;
        yVar = gVar != null ? ((x) gVar).f3417c : null;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "getAllowContentAccess":
                if (yVar != null && b.c0("SERVICE_WORKER_CONTENT_ACCESS")) {
                    a.c cVar = i0.f3372j;
                    if (cVar.c()) {
                        allowContentAccess = d.a(yVar.w());
                    } else {
                        if (!cVar.d()) {
                            throw i0.a();
                        }
                        allowContentAccess = yVar.v().getAllowContentAccess();
                    }
                    valueOf = Boolean.valueOf(allowContentAccess);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case "setServiceWorkerClient":
                if (this.serviceWorkerManager != null) {
                    this.serviceWorkerManager.setServiceWorkerClient((Boolean) methodCall.argument("isNull"));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case "getCacheMode":
                if (yVar == null || !b.c0("SERVICE_WORKER_CACHE_MODE")) {
                    result.success(null);
                    return;
                }
                a.c cVar2 = i0.f3371i;
                if (cVar2.c()) {
                    cacheMode = d.d(yVar.w());
                } else {
                    if (!cVar2.d()) {
                        throw i0.a();
                    }
                    cacheMode = yVar.v().getCacheMode();
                }
                valueOf = Integer.valueOf(cacheMode);
                result.success(valueOf);
                return;
            case "getAllowFileAccess":
                if (yVar != null && b.c0("SERVICE_WORKER_FILE_ACCESS")) {
                    a.c cVar3 = i0.f3373k;
                    if (cVar3.c()) {
                        allowContentAccess = d.b(yVar.w());
                    } else {
                        if (!cVar3.d()) {
                            throw i0.a();
                        }
                        allowContentAccess = yVar.v().getAllowFileAccess();
                    }
                    valueOf = Boolean.valueOf(allowContentAccess);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case "setCacheMode":
                if (yVar != null && b.c0("SERVICE_WORKER_CACHE_MODE")) {
                    int intValue = ((Integer) methodCall.argument("mode")).intValue();
                    a.c cVar4 = i0.f3371i;
                    if (cVar4.c()) {
                        d.n(yVar.w(), intValue);
                    } else {
                        if (!cVar4.d()) {
                            throw i0.a();
                        }
                        yVar.v().setCacheMode(intValue);
                    }
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case "setBlockNetworkLoads":
                if (yVar != null && b.c0("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    boolean booleanValue = ((Boolean) methodCall.argument("flag")).booleanValue();
                    a.c cVar5 = i0.f3374l;
                    if (cVar5.c()) {
                        d.m(yVar.w(), booleanValue);
                    } else {
                        if (!cVar5.d()) {
                            throw i0.a();
                        }
                        yVar.v().setBlockNetworkLoads(booleanValue);
                    }
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case "setAllowContentAccess":
                if (yVar != null && b.c0("SERVICE_WORKER_CONTENT_ACCESS")) {
                    boolean booleanValue2 = ((Boolean) methodCall.argument("allow")).booleanValue();
                    a.c cVar6 = i0.f3372j;
                    if (cVar6.c()) {
                        d.k(yVar.w(), booleanValue2);
                    } else {
                        if (!cVar6.d()) {
                            throw i0.a();
                        }
                        yVar.v().setAllowContentAccess(booleanValue2);
                    }
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case "setAllowFileAccess":
                if (yVar != null && b.c0("SERVICE_WORKER_FILE_ACCESS")) {
                    boolean booleanValue3 = ((Boolean) methodCall.argument("allow")).booleanValue();
                    a.c cVar7 = i0.f3373k;
                    if (cVar7.c()) {
                        d.l(yVar.w(), booleanValue3);
                    } else {
                        if (!cVar7.d()) {
                            throw i0.a();
                        }
                        yVar.v().setAllowFileAccess(booleanValue3);
                    }
                }
                valueOf = Boolean.TRUE;
                result.success(valueOf);
                return;
            case "getBlockNetworkLoads":
                if (yVar != null && b.c0("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    a.c cVar8 = i0.f3374l;
                    if (cVar8.c()) {
                        allowContentAccess = d.c(yVar.w());
                    } else {
                        if (!cVar8.d()) {
                            throw i0.a();
                        }
                        allowContentAccess = yVar.v().getBlockNetworkLoads();
                    }
                    valueOf = Boolean.valueOf(allowContentAccess);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
    }
}
