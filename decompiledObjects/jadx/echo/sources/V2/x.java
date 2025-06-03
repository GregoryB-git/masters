package V2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6465a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6466b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0653d f6467c;

    public x(Executor executor, InterfaceC0653d interfaceC0653d) {
        this.f6465a = executor;
        this.f6467c = interfaceC0653d;
    }

    @Override // V2.G
    public final void c(AbstractC0659j abstractC0659j) {
        if (abstractC0659j.l()) {
            synchronized (this.f6466b) {
                try {
                    if (this.f6467c == null) {
                        return;
                    }
                    this.f6465a.execute(new w(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
