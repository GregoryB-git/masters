package d2;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;

/* loaded from: classes.dex */
public final class r extends ServiceWorkerClient {

    /* renamed from: a, reason: collision with root package name */
    public final c2.f f3408a;

    public r(c2.f fVar) {
        this.f3408a = fVar;
    }

    public final WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f3408a.shouldInterceptRequest(webResourceRequest);
    }
}
