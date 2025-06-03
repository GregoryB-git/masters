package d2;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public final class s implements Callable<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JsReplyProxyBoundaryInterface f3409a;

    public s(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f3409a = jsReplyProxyBoundaryInterface;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new t(this.f3409a);
    }
}
