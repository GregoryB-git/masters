package m9;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ma.h f10821a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10822b;

    /* renamed from: c, reason: collision with root package name */
    public final t8.e<j9.i> f10823c;

    /* renamed from: d, reason: collision with root package name */
    public final t8.e<j9.i> f10824d;

    /* renamed from: e, reason: collision with root package name */
    public final t8.e<j9.i> f10825e;

    public k0(ma.h hVar, boolean z10, t8.e<j9.i> eVar, t8.e<j9.i> eVar2, t8.e<j9.i> eVar3) {
        this.f10821a = hVar;
        this.f10822b = z10;
        this.f10823c = eVar;
        this.f10824d = eVar2;
        this.f10825e = eVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f10822b == k0Var.f10822b && this.f10821a.equals(k0Var.f10821a) && this.f10823c.equals(k0Var.f10823c) && this.f10824d.equals(k0Var.f10824d)) {
            return this.f10825e.equals(k0Var.f10825e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10825e.hashCode() + ((this.f10824d.hashCode() + ((this.f10823c.hashCode() + (((this.f10821a.hashCode() * 31) + (this.f10822b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
