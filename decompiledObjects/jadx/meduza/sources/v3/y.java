package v3;

import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements l.a, n9.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15818c;

    public /* synthetic */ y(Object obj, int i10, int i11) {
        this.f15816a = i11;
        this.f15818c = obj;
        this.f15817b = i10;
    }

    @Override // n9.l
    public final Object get() {
        i9.n nVar = (i9.n) this.f15818c;
        int i10 = this.f15817b;
        k9.g h10 = nVar.f7745c.h(i10);
        x6.b.Z("Attempt to reject nonexistent batch!", h10 != null, new Object[0]);
        nVar.f7745c.b(h10);
        nVar.f7745c.a();
        nVar.f7746d.f(i10);
        i9.h hVar = nVar.f;
        hVar.g(hVar.f7687a.a(h10.b()));
        return nVar.f.b(h10.b());
    }

    @Override // v5.l.a
    public final void invoke(Object obj) {
        switch (this.f15816a) {
            case 0:
                d1 d1Var = (d1) this.f15818c;
                ((f1.c) obj).Y(d1Var.f15306a, this.f15817b);
                break;
            default:
                ((w3.b) obj).S();
                break;
        }
    }
}
