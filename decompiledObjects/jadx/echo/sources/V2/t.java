package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6456a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0651b f6457b;

    /* renamed from: c, reason: collision with root package name */
    public final K f6458c;

    public t(Executor executor, InterfaceC0651b interfaceC0651b, K k7) {
        this.f6456a = executor;
        this.f6457b = interfaceC0651b;
        this.f6458c = k7;
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        this.f6456a.execute(new s(this, abstractC0659j));
    }
}
