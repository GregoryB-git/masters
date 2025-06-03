package q3;

import android.content.Context;
import java.util.concurrent.Executor;
import t3.b;
import t3.c;

/* loaded from: classes.dex */
public final class l implements m3.b<k> {

    /* renamed from: a, reason: collision with root package name */
    public final qb.a<Context> f13263a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.a<l3.e> f13264b;

    /* renamed from: c, reason: collision with root package name */
    public final qb.a<r3.d> f13265c;

    /* renamed from: d, reason: collision with root package name */
    public final qb.a<n> f13266d;

    /* renamed from: e, reason: collision with root package name */
    public final qb.a<Executor> f13267e;
    public final qb.a<s3.b> f;

    /* renamed from: o, reason: collision with root package name */
    public final qb.a<t3.a> f13268o;

    /* renamed from: p, reason: collision with root package name */
    public final qb.a<t3.a> f13269p;

    /* renamed from: q, reason: collision with root package name */
    public final qb.a<r3.c> f13270q;

    public l(qb.a aVar, qb.a aVar2, qb.a aVar3, p3.f fVar, qb.a aVar4, qb.a aVar5, qb.a aVar6) {
        t3.b bVar = b.a.f14432a;
        t3.c cVar = c.a.f14433a;
        this.f13263a = aVar;
        this.f13264b = aVar2;
        this.f13265c = aVar3;
        this.f13266d = fVar;
        this.f13267e = aVar4;
        this.f = aVar5;
        this.f13268o = bVar;
        this.f13269p = cVar;
        this.f13270q = aVar6;
    }

    @Override // qb.a
    public final Object get() {
        return new k(this.f13263a.get(), this.f13264b.get(), this.f13265c.get(), this.f13266d.get(), this.f13267e.get(), this.f.get(), this.f13268o.get(), this.f13269p.get(), this.f13270q.get());
    }
}
