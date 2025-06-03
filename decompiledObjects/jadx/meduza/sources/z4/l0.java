package z4;

import v3.o0;
import v3.r1;
import z4.t;

/* loaded from: classes.dex */
public abstract class l0 extends f<Void> {

    /* renamed from: s, reason: collision with root package name */
    public final t f17695s;

    public l0(t tVar) {
        this.f17695s = tVar;
    }

    @Override // z4.f
    public final void A(Object obj, r1 r1Var) {
        D(r1Var);
    }

    public t.b C(t.b bVar) {
        return bVar;
    }

    public abstract void D(r1 r1Var);

    public void E() {
        B(null, this.f17695s);
    }

    @Override // z4.t
    public final o0 f() {
        return this.f17695s.f();
    }

    @Override // z4.a, z4.t
    public final boolean i() {
        return this.f17695s.i();
    }

    @Override // z4.a, z4.t
    public final r1 j() {
        return this.f17695s.j();
    }

    @Override // z4.a
    public final void t(t5.l0 l0Var) {
        this.f17625r = l0Var;
        this.f17624q = v5.e0.l(null);
        E();
    }

    @Override // z4.f
    public final t.b x(Void r12, t.b bVar) {
        return C(bVar);
    }

    @Override // z4.f
    public final long y(Void r12, long j10) {
        return j10;
    }

    @Override // z4.f
    public final int z(int i10, Object obj) {
        return i10;
    }
}
