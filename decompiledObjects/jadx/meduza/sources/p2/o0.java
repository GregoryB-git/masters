package p2;

import z2.a;

/* loaded from: classes.dex */
public final class o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s7.e f12909a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0 f12910b;

    public o0(q0 q0Var, z2.c cVar) {
        this.f12910b = q0Var;
        this.f12909a = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12910b.f12934x.f17483a instanceof a.b) {
            return;
        }
        try {
            this.f12909a.get();
            o2.j.d().a(q0.f12920z, "Starting work for " + this.f12910b.f12923c.f16832c);
            q0 q0Var = this.f12910b;
            q0Var.f12934x.k(q0Var.f12924d.h());
        } catch (Throwable th) {
            this.f12910b.f12934x.j(th);
        }
    }
}
