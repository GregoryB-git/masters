package d2;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public final class g0 extends c2.l {

    /* renamed from: a, reason: collision with root package name */
    public WebResourceError f3360a;

    /* renamed from: b, reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f3361b;

    public g0(WebResourceError webResourceError) {
        this.f3360a = webResourceError;
    }

    public g0(InvocationHandler invocationHandler) {
        this.f3361b = (WebResourceErrorBoundaryInterface) zc.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }
}
