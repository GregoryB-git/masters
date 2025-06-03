package p2;

/* loaded from: classes.dex */
public final class i0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f12870a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.b f12871b;

    public i0(r rVar, a3.b bVar) {
        ec.i.e(rVar, "processor");
        ec.i.e(bVar, "workTaskExecutor");
        this.f12870a = rVar;
        this.f12871b = bVar;
    }

    @Override // p2.h0
    public final void a(x xVar) {
        ec.i.e(xVar, "workSpecId");
        c(xVar, -512);
    }

    @Override // p2.h0
    public final void b(x xVar) {
        this.f12871b.d(new y2.s(this.f12870a, xVar, null));
    }

    @Override // p2.h0
    public final void c(x xVar, int i10) {
        ec.i.e(xVar, "workSpecId");
        this.f12871b.d(new y2.t(this.f12870a, xVar, false, i10));
    }

    @Override // p2.h0
    public final void d(x xVar, int i10) {
        c(xVar, i10);
    }
}
