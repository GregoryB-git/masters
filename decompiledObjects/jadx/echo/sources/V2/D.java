package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class D implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6421a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6422b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0656g f6423c;

    public D(Executor executor, InterfaceC0656g interfaceC0656g) {
        this.f6421a = executor;
        this.f6423c = interfaceC0656g;
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n()) {
            synchronized (this.f6422b) {
                try {
                    if (this.f6423c == null) {
                        return;
                    }
                    this.f6421a.execute(new C(this, abstractC0659j));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
