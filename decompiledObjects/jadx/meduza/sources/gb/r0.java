package gb;

import java.util.concurrent.TimeUnit;
import n7.g;

/* loaded from: classes.dex */
public abstract class r0 extends eb.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final eb.n0 f6701b;

    public r0(r1 r1Var) {
        this.f6701b = r1Var;
    }

    @Override // eb.n0
    public final boolean C(long j10, TimeUnit timeUnit) {
        return this.f6701b.C(j10, timeUnit);
    }

    @Override // eb.n0
    public final void D() {
        this.f6701b.D();
    }

    @Override // eb.n0
    public final eb.n E() {
        return this.f6701b.E();
    }

    @Override // eb.n0
    public final void F(eb.n nVar, x0.f fVar) {
        this.f6701b.F(nVar, fVar);
    }

    @Override // e9.a
    public final String b() {
        return this.f6701b.b();
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.a(this.f6701b, "delegate");
        return b10.toString();
    }

    @Override // e9.a
    public final <RequestT, ResponseT> eb.e<RequestT, ResponseT> v(eb.t0<RequestT, ResponseT> t0Var, eb.c cVar) {
        return this.f6701b.v(t0Var, cVar);
    }
}
