package u5;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public final long f15051a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeSet<g> f15052b = new TreeSet<>(new q5.i(2));

    /* renamed from: c, reason: collision with root package name */
    public long f15053c;

    public n(long j10) {
        this.f15051a = j10;
    }

    @Override // u5.a.b
    public final void a(g gVar) {
        this.f15052b.remove(gVar);
        this.f15053c -= gVar.f15011c;
    }

    @Override // u5.d
    public final void b(a aVar, long j10) {
        if (j10 != -1) {
            f(aVar, j10);
        }
    }

    @Override // u5.d
    public final void c() {
    }

    @Override // u5.a.b
    public final void d(a aVar, g gVar) {
        this.f15052b.add(gVar);
        this.f15053c += gVar.f15011c;
        f(aVar, 0L);
    }

    @Override // u5.a.b
    public final void e(a aVar, g gVar, r rVar) {
        a(gVar);
        d(aVar, rVar);
    }

    public final void f(a aVar, long j10) {
        while (this.f15053c + j10 > this.f15051a && !this.f15052b.isEmpty()) {
            aVar.g(this.f15052b.first());
        }
    }
}
