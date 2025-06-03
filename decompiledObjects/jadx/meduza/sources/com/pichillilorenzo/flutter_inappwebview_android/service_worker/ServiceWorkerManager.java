package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import c2.f;
import c2.g;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import d2.a;
import d2.d;
import d2.i0;
import d2.j0;
import d2.q;
import d2.x;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayInputStream;
import java.util.Map;
import x6.b;
import zc.a;

/* loaded from: classes.dex */
public class ServiceWorkerManager implements Disposable {
    public static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static g serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public static final class DummyServiceWorkerClientCompat extends f {
        public static final f INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        @Override // c2.f
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    private f dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && b.c0("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = g.a.f2216a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        g gVar = serviceWorkerController;
        if (gVar != null) {
            f dummyServiceWorkerClientCompat = bool.booleanValue() ? dummyServiceWorkerClientCompat() : new f() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                @Override // c2.f
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt shouldInterceptRequest;
                    WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            shouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                        } catch (InterruptedException e10) {
                            Log.e(ServiceWorkerManager.LOG_TAG, "", e10);
                            return null;
                        }
                    } else {
                        shouldInterceptRequest = null;
                    }
                    if (shouldInterceptRequest == null) {
                        return null;
                    }
                    String contentType = shouldInterceptRequest.getContentType();
                    String contentEncoding = shouldInterceptRequest.getContentEncoding();
                    byte[] data = shouldInterceptRequest.getData();
                    Map<String, String> headers = shouldInterceptRequest.getHeaders();
                    Integer statusCode = shouldInterceptRequest.getStatusCode();
                    String reasonPhrase = shouldInterceptRequest.getReasonPhrase();
                    ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
                    return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
                }
            };
            x xVar = (x) gVar;
            a.c cVar = i0.f3370h;
            if (cVar.c()) {
                if (dummyServiceWorkerClientCompat == null) {
                    if (xVar.f3415a == null) {
                        xVar.f3415a = d.g();
                    }
                    d.p(xVar.f3415a, null);
                    return;
                } else {
                    if (xVar.f3415a == null) {
                        xVar.f3415a = d.g();
                    }
                    d.q(xVar.f3415a, dummyServiceWorkerClientCompat);
                    return;
                }
            }
            if (!cVar.d()) {
                throw i0.a();
            }
            if (dummyServiceWorkerClientCompat == null) {
                if (xVar.f3416b == null) {
                    xVar.f3416b = j0.b.f3390a.getServiceWorkerController();
                }
                xVar.f3416b.setServiceWorkerClient(null);
            } else {
                if (xVar.f3416b == null) {
                    xVar.f3416b = j0.b.f3390a.getServiceWorkerController();
                }
                xVar.f3416b.setServiceWorkerClient(new a.C0270a(new q(dummyServiceWorkerClientCompat, 1)));
            }
        }
    }
}
