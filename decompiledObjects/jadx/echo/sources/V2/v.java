package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v implements InterfaceC0656g, InterfaceC0655f, InterfaceC0653d, G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6461a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0651b f6462b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6463c;

    public v(Executor executor, InterfaceC0651b interfaceC0651b, K k7) {
        this.f6461a = executor;
        this.f6462b = interfaceC0651b;
        this.f6463c = k7;
    }

    @Override // V2.InterfaceC0656g
    public final void a(Object obj) {
        this.f6463c.r(obj);
    }

    @Override // V2.InterfaceC0653d
    public final void b() {
        this.f6463c.s();
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        this.f6461a.execute(new u(this, abstractC0659j));
    }

    @Override // V2.InterfaceC0655f
    public final void d(Exception exc) {
        this.f6463c.q(exc);
    }
}
