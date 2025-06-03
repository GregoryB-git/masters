package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class F implements InterfaceC0656g, InterfaceC0655f, InterfaceC0653d, G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6426a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0658i f6427b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6428c;

    public F(Executor executor, InterfaceC0658i interfaceC0658i, K k7) {
        this.f6426a = executor;
        this.f6427b = interfaceC0658i;
        this.f6428c = k7;
    }

    @Override // V2.InterfaceC0656g
    public final void a(Object obj) {
        this.f6428c.r(obj);
    }

    @Override // V2.InterfaceC0653d
    public final void b() {
        this.f6428c.s();
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        this.f6426a.execute(new E(this, abstractC0659j));
    }

    @Override // V2.InterfaceC0655f
    public final void d(Exception exc) {
        this.f6428c.q(exc);
    }
}
