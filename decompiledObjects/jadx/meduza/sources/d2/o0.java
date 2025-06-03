package d2;

import android.webkit.WebViewRenderProcess;
import d2.a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public final class o0 extends c2.q {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap<WebViewRenderProcess, o0> f3403c = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f3404a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<WebViewRenderProcess> f3405b;

    public o0(WebViewRenderProcess webViewRenderProcess) {
        this.f3405b = new WeakReference<>(webViewRenderProcess);
    }

    public o0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f3404a = webViewRendererBoundaryInterface;
    }

    @Override // c2.q
    public final boolean a() {
        a.h hVar = i0.f3386y;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcess = this.f3405b.get();
            return webViewRenderProcess != null && m.g(webViewRenderProcess);
        }
        if (hVar.d()) {
            return this.f3404a.terminate();
        }
        throw i0.a();
    }
}
