package d2;

import android.webkit.WebMessagePort;
import c2.k;
import d2.a;
import d2.j0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import zc.a;

/* loaded from: classes.dex */
public final class f0 extends c2.k {

    /* renamed from: a, reason: collision with root package name */
    public WebMessagePort f3358a;

    /* renamed from: b, reason: collision with root package name */
    public WebMessagePortBoundaryInterface f3359b;

    public f0(WebMessagePort webMessagePort) {
        this.f3358a = webMessagePort;
    }

    public f0(InvocationHandler invocationHandler) {
        this.f3359b = (WebMessagePortBoundaryInterface) zc.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    @Override // c2.k
    public final void a() {
        i0.t.getClass();
        c.a(g());
    }

    @Override // c2.k
    public final WebMessagePort b() {
        return g();
    }

    @Override // c2.k
    public final InvocationHandler c() {
        return Proxy.getInvocationHandler(f());
    }

    @Override // c2.k
    public final void d(c2.j jVar) {
        a.b bVar = i0.f3381s;
        bVar.getClass();
        if (jVar.f2224d == 0) {
            c.h(g(), c.b(jVar));
            return;
        }
        if (bVar.d()) {
            int i10 = jVar.f2224d;
            boolean z10 = true;
            if (i10 != 0 && (i10 != 1 || !i0.f3382u.d())) {
                z10 = false;
            }
            if (z10) {
                f().postMessage(new a.C0270a(new b0(jVar)));
                return;
            }
        }
        throw i0.a();
    }

    @Override // c2.k
    public final void e(k.a aVar) {
        if (i0.f3383v.d()) {
            f().setWebMessageCallback(new a.C0270a(new c0(aVar)));
        } else {
            c.l(g(), aVar);
        }
    }

    public final WebMessagePortBoundaryInterface f() {
        if (this.f3359b == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3359b = (WebMessagePortBoundaryInterface) zc.a.a(WebMessagePortBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertWebMessagePort(this.f3358a));
        }
        return this.f3359b;
    }

    public final WebMessagePort g() {
        if (this.f3358a == null) {
            h0 h0Var = j0.a.f3389a;
            this.f3358a = (WebMessagePort) ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertWebMessagePort(Proxy.getInvocationHandler(this.f3359b));
        }
        return this.f3358a;
    }
}
