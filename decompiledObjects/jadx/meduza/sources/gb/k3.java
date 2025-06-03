package gb;

import gb.i2;
import gb.n3;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class k3 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public final i2.a f6573a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6574b;

    public k3(y0 y0Var) {
        this.f6573a = y0Var;
    }

    @Override // gb.i2.a
    public final void a(n3.a aVar) {
        if (!this.f6574b) {
            this.f6573a.a(aVar);
        } else if (aVar instanceof Closeable) {
            v0.b((Closeable) aVar);
        }
    }

    @Override // gb.i2.a
    public final void c(boolean z10) {
        this.f6574b = true;
        this.f6573a.c(z10);
    }

    @Override // gb.i2.a
    public final void e(Throwable th) {
        this.f6574b = true;
        this.f6573a.e(th);
    }
}
