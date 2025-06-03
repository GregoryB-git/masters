package v3;

/* loaded from: classes.dex */
public final class k implements v5.o {

    /* renamed from: a, reason: collision with root package name */
    public final v5.y f15502a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15503b;

    /* renamed from: c, reason: collision with root package name */
    public j1 f15504c;

    /* renamed from: d, reason: collision with root package name */
    public v5.o f15505d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15506e = true;
    public boolean f;

    public interface a {
    }

    public k(a aVar, v5.c cVar) {
        this.f15503b = aVar;
        this.f15502a = new v5.y(cVar);
    }

    @Override // v5.o
    public final void c(e1 e1Var) {
        v5.o oVar = this.f15505d;
        if (oVar != null) {
            oVar.c(e1Var);
            e1Var = this.f15505d.f();
        }
        this.f15502a.c(e1Var);
    }

    @Override // v5.o
    public final e1 f() {
        v5.o oVar = this.f15505d;
        return oVar != null ? oVar.f() : this.f15502a.f15993e;
    }

    @Override // v5.o
    public final long l() {
        if (this.f15506e) {
            return this.f15502a.l();
        }
        v5.o oVar = this.f15505d;
        oVar.getClass();
        return oVar.l();
    }
}
