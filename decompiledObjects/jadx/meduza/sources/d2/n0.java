package d2;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public final class n0 implements Callable<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewRendererBoundaryInterface f3401a;

    public n0(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f3401a = webViewRendererBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new o0(this.f3401a);
    }
}
