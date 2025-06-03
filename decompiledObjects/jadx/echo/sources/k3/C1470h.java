package k3;

import c3.AbstractC0829g;
import c3.C0844v;
import c3.InterfaceC0845w;
import java.util.concurrent.atomic.AtomicReference;
import k3.n;

/* renamed from: k3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1470h {

    /* renamed from: b, reason: collision with root package name */
    public static C1470h f16154b = new C1470h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f16155a = new AtomicReference(new n.b().c());

    public static C1470h c() {
        return f16154b;
    }

    public Class a(Class cls) {
        return ((n) this.f16155a.get()).c(cls);
    }

    public Object b(AbstractC0829g abstractC0829g, Class cls) {
        return ((n) this.f16155a.get()).d(abstractC0829g, cls);
    }

    public synchronized void d(l lVar) {
        this.f16155a.set(new n.b((n) this.f16155a.get()).d(lVar).c());
    }

    public synchronized void e(InterfaceC0845w interfaceC0845w) {
        this.f16155a.set(new n.b((n) this.f16155a.get()).e(interfaceC0845w).c());
    }

    public Object f(C0844v c0844v, Class cls) {
        return ((n) this.f16155a.get()).e(c0844v, cls);
    }
}
