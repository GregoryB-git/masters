package gb;

import gb.t;

/* loaded from: classes.dex */
public final class m0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final eb.e1 f6599a;

    /* renamed from: b, reason: collision with root package name */
    public final t.a f6600b;

    public m0(eb.e1 e1Var, t.a aVar) {
        x6.b.s("error must not be OK", !e1Var.e());
        this.f6599a = e1Var;
        this.f6600b = aVar;
    }

    @Override // gb.u
    public final s d(eb.t0<?, ?> t0Var, eb.s0 s0Var, eb.c cVar, eb.h[] hVarArr) {
        return new l0(this.f6599a, this.f6600b, hVarArr);
    }

    @Override // eb.e0
    public final eb.f0 f() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
