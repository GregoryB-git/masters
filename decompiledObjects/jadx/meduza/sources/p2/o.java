package p2;

import o2.m;

/* loaded from: classes.dex */
public final class o implements o2.m {

    /* renamed from: c, reason: collision with root package name */
    public final b1.w<m.a> f12907c = new b1.w<>();

    /* renamed from: d, reason: collision with root package name */
    public final z2.c<m.a.c> f12908d = new z2.c<>();

    public o() {
        a(o2.m.f11724b);
    }

    public final void a(m.a aVar) {
        this.f12907c.postValue(aVar);
        if (aVar instanceof m.a.c) {
            this.f12908d.i((m.a.c) aVar);
        } else if (aVar instanceof m.a.C0184a) {
            this.f12908d.j(((m.a.C0184a) aVar).f11725a);
        }
    }
}
