package y0;

import F0.C0365j;
import F0.T;
import d0.C1194q;

/* loaded from: classes.dex */
public final class o extends AbstractC2222a {

    /* renamed from: o, reason: collision with root package name */
    public final int f21305o;

    /* renamed from: p, reason: collision with root package name */
    public final C1194q f21306p;

    /* renamed from: q, reason: collision with root package name */
    public long f21307q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21308r;

    public o(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, long j7, long j8, long j9, int i8, C1194q c1194q2) {
        super(gVar, kVar, c1194q, i7, obj, j7, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.f21305o = i8;
        this.f21306p = c1194q2;
    }

    @Override // B0.n.e
    public void b() {
        C2224c j7 = j();
        j7.c(0L);
        T a7 = j7.a(0, this.f21305o);
        a7.d(this.f21306p);
        try {
            long e7 = this.f21260i.e(this.f21253b.e(this.f21307q));
            if (e7 != -1) {
                e7 += this.f21307q;
            }
            C0365j c0365j = new C0365j(this.f21260i, this.f21307q, e7);
            for (int i7 = 0; i7 != -1; i7 = a7.f(c0365j, Integer.MAX_VALUE, true)) {
                this.f21307q += i7;
            }
            a7.b(this.f21258g, 1, (int) this.f21307q, 0, null);
            i0.j.a(this.f21260i);
            this.f21308r = true;
        } catch (Throwable th) {
            i0.j.a(this.f21260i);
            throw th;
        }
    }

    @Override // y0.m
    public boolean h() {
        return this.f21308r;
    }

    @Override // B0.n.e
    public void c() {
    }
}
