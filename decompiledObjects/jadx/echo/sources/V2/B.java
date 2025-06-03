package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class B implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6416a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6417b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0655f f6418c;

    public B(Executor executor, InterfaceC0655f interfaceC0655f) {
        this.f6416a = executor;
        this.f6418c = interfaceC0655f;
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        if (abstractC0659j.n() || abstractC0659j.l()) {
            return;
        }
        synchronized (this.f6417b) {
            try {
                if (this.f6418c == null) {
                    return;
                }
                this.f6416a.execute(new A(this, abstractC0659j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
