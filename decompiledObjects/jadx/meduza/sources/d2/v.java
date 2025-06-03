package d2;

import android.webkit.SafeBrowsingResponse;
import d2.a;
import d2.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public final class v extends c2.d {

    /* renamed from: a, reason: collision with root package name */
    public SafeBrowsingResponse f3412a;

    /* renamed from: b, reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f3413b;

    public v(SafeBrowsingResponse safeBrowsingResponse) {
        this.f3412a = safeBrowsingResponse;
    }

    public v(InvocationHandler invocationHandler) {
        this.f3413b = (SafeBrowsingResponseBoundaryInterface) zc.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    @Override // c2.d
    public final void a(boolean z10) {
        a.f fVar = i0.f3380r;
        if (fVar.c()) {
            j.e(c(), z10);
        } else {
            if (!fVar.d()) {
                throw i0.a();
            }
            b().showInterstitial(z10);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f3413b == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3413b = (SafeBrowsingResponseBoundaryInterface) zc.a.a(SafeBrowsingResponseBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertSafeBrowsingResponse(this.f3412a));
        }
        return this.f3413b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f3412a == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3412a = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.f3413b));
        }
        return this.f3412a;
    }
}
