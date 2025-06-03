package p6;

/* renamed from: p6.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1863n0 extends AbstractC1854j {

    /* renamed from: o, reason: collision with root package name */
    public final g6.l f18544o;

    public C1863n0(g6.l lVar) {
        this.f18544o = lVar;
    }

    @Override // p6.AbstractC1856k
    public void a(Throwable th) {
        this.f18544o.invoke(th);
    }

    @Override // g6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return V5.t.f6803a;
    }

    public String toString() {
        return "InvokeOnCancel[" + M.a(this.f18544o) + '@' + M.b(this) + ']';
    }
}
