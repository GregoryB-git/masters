package gb;

import gb.t;

/* loaded from: classes.dex */
public final class l0 extends l2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f6585b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.e1 f6586c;

    /* renamed from: d, reason: collision with root package name */
    public final t.a f6587d;

    /* renamed from: e, reason: collision with root package name */
    public final eb.h[] f6588e;

    public l0(eb.e1 e1Var, t.a aVar, eb.h[] hVarArr) {
        x6.b.s("error must not be OK", !e1Var.e());
        this.f6586c = e1Var;
        this.f6587d = aVar;
        this.f6588e = hVarArr;
    }

    public l0(eb.e1 e1Var, eb.h[] hVarArr) {
        this(e1Var, t.a.PROCESSED, hVarArr);
    }

    @Override // gb.l2, gb.s
    public final void i(d2.q qVar) {
        qVar.f(this.f6586c, "error");
        qVar.f(this.f6587d, "progress");
    }

    @Override // gb.l2, gb.s
    public final void l(t tVar) {
        x6.b.I(!this.f6585b, "already started");
        this.f6585b = true;
        for (eb.h hVar : this.f6588e) {
            hVar.o(this.f6586c);
        }
        tVar.d(this.f6586c, this.f6587d, new eb.s0());
    }
}
