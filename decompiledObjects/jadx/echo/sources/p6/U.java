package p6;

import V5.n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import u6.C2040j;

/* loaded from: classes.dex */
public abstract class U extends w6.h {

    /* renamed from: q, reason: collision with root package name */
    public int f18512q;

    public U(int i7) {
        this.f18512q = i7;
    }

    public abstract void b(Object obj, Throwable th);

    public abstract X5.d c();

    public Throwable e(Object obj) {
        C1877z c1877z = obj instanceof C1877z ? (C1877z) obj : null;
        if (c1877z != null) {
            return c1877z.f18582a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            V5.b.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.b(th);
        H.a(c().getContext(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object a7;
        Object a8;
        Object a9;
        w6.i iVar = this.f20486p;
        try {
            X5.d c7 = c();
            Intrinsics.c(c7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2040j c2040j = (C2040j) c7;
            X5.d dVar = c2040j.f19983s;
            Object obj = c2040j.f19985u;
            X5.g context = dVar.getContext();
            Object c8 = u6.J.c(context, obj);
            N0 g7 = c8 != u6.J.f19961a ? E.g(dVar, context, c8) : null;
            try {
                X5.g context2 = dVar.getContext();
                Object i7 = i();
                Throwable e7 = e(i7);
                InterfaceC1869q0 interfaceC1869q0 = (e7 == null && V.b(this.f18512q)) ? (InterfaceC1869q0) context2.b(InterfaceC1869q0.f18550n) : null;
                if (interfaceC1869q0 != null && !interfaceC1869q0.a()) {
                    CancellationException s7 = interfaceC1869q0.s();
                    b(i7, s7);
                    n.a aVar = V5.n.f6797o;
                    a8 = V5.n.a(V5.o.a(s7));
                } else if (e7 != null) {
                    n.a aVar2 = V5.n.f6797o;
                    a8 = V5.n.a(V5.o.a(e7));
                } else {
                    n.a aVar3 = V5.n.f6797o;
                    a8 = V5.n.a(f(i7));
                }
                dVar.resumeWith(a8);
                V5.t tVar = V5.t.f6803a;
                if (g7 == null || g7.K0()) {
                    u6.J.a(context, c8);
                }
                try {
                    iVar.a();
                    a9 = V5.n.a(V5.t.f6803a);
                } catch (Throwable th) {
                    n.a aVar4 = V5.n.f6797o;
                    a9 = V5.n.a(V5.o.a(th));
                }
                h(null, V5.n.b(a9));
            } catch (Throwable th2) {
                if (g7 == null || g7.K0()) {
                    u6.J.a(context, c8);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                n.a aVar5 = V5.n.f6797o;
                iVar.a();
                a7 = V5.n.a(V5.t.f6803a);
            } catch (Throwable th4) {
                n.a aVar6 = V5.n.f6797o;
                a7 = V5.n.a(V5.o.a(th4));
            }
            h(th3, V5.n.b(a7));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
