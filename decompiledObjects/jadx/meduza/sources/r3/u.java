package r3;

import r3.h;
import t3.b;
import t3.c;

/* loaded from: classes.dex */
public final class u implements m3.b<t> {

    /* renamed from: a, reason: collision with root package name */
    public final qb.a<t3.a> f13591a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.a<t3.a> f13592b;

    /* renamed from: c, reason: collision with root package name */
    public final qb.a<e> f13593c;

    /* renamed from: d, reason: collision with root package name */
    public final qb.a<z> f13594d;

    /* renamed from: e, reason: collision with root package name */
    public final qb.a<String> f13595e;

    public u(qb.a aVar, qb.a aVar2) {
        t3.b bVar = b.a.f14432a;
        t3.c cVar = c.a.f14433a;
        h hVar = h.a.f13558a;
        this.f13591a = bVar;
        this.f13592b = cVar;
        this.f13593c = hVar;
        this.f13594d = aVar;
        this.f13595e = aVar2;
    }

    @Override // qb.a
    public final Object get() {
        t3.a aVar = this.f13591a.get();
        t3.a aVar2 = this.f13592b.get();
        e eVar = this.f13593c.get();
        return new t(aVar, aVar2, eVar, this.f13594d.get(), this.f13595e);
    }
}
