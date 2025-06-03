package k3;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y implements m3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8926a;

    /* renamed from: b, reason: collision with root package name */
    public final qb.a f8927b;

    /* renamed from: c, reason: collision with root package name */
    public final qb.a f8928c;

    /* renamed from: d, reason: collision with root package name */
    public final qb.a f8929d;

    /* renamed from: e, reason: collision with root package name */
    public final qb.a f8930e;
    public final qb.a f;

    public /* synthetic */ y(qb.a aVar, qb.a aVar2, qb.a aVar3, qb.a aVar4, qb.a aVar5, int i10) {
        this.f8926a = i10;
        this.f8927b = aVar;
        this.f8928c = aVar2;
        this.f8929d = aVar3;
        this.f8930e = aVar4;
        this.f = aVar5;
    }

    @Override // qb.a
    public final Object get() {
        switch (this.f8926a) {
            case 0:
                return new w((t3.a) this.f8927b.get(), (t3.a) this.f8928c.get(), (p3.d) this.f8929d.get(), (q3.k) this.f8930e.get(), (q3.m) this.f.get());
            default:
                return new p3.c((Executor) this.f8927b.get(), (l3.e) this.f8928c.get(), (q3.n) this.f8929d.get(), (r3.d) this.f8930e.get(), (s3.b) this.f.get());
        }
    }
}
