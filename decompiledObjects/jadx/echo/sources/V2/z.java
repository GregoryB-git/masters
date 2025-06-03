package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6470a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6471b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0654e f6472c;

    public z(Executor executor, InterfaceC0654e interfaceC0654e) {
        this.f6470a = executor;
        this.f6472c = interfaceC0654e;
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        synchronized (this.f6471b) {
            try {
                if (this.f6472c == null) {
                    return;
                }
                this.f6470a.execute(new y(this, abstractC0659j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
