package b5;

import b.z;
import t5.j0;
import v3.i0;
import z4.b0;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f1892o;

    /* renamed from: p, reason: collision with root package name */
    public final long f1893p;

    /* renamed from: q, reason: collision with root package name */
    public final f f1894q;

    /* renamed from: r, reason: collision with root package name */
    public long f1895r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f1896s;
    public boolean t;

    public j(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, f fVar) {
        super(kVar, nVar, i0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f1892o = i11;
        this.f1893p = j15;
        this.f1894q = fVar;
    }

    @Override // t5.d0.d
    public final void a() {
        if (this.f1895r == 0) {
            c cVar = this.f1840m;
            x6.b.K(cVar);
            long j10 = this.f1893p;
            for (b0 b0Var : cVar.f1846b) {
                if (b0Var.F != j10) {
                    b0Var.F = j10;
                    b0Var.f17594z = true;
                }
            }
            f fVar = this.f1894q;
            long j11 = this.f1838k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f1893p;
            long j13 = this.f1839l;
            ((d) fVar).a(cVar, j12, j13 != -9223372036854775807L ? j13 - this.f1893p : -9223372036854775807L);
        }
        try {
            t5.n a10 = this.f1862b.a(this.f1895r);
            j0 j0Var = this.f1868i;
            c4.e eVar = new c4.e(j0Var, a10.f, j0Var.a(a10));
            while (!this.f1896s) {
                try {
                    int d10 = ((d) this.f1894q).f1848a.d(eVar, d.f1847r);
                    x6.b.H(d10 != 1);
                    if (!(d10 == 0)) {
                        break;
                    }
                } finally {
                    this.f1895r = eVar.f2276d - this.f1862b.f;
                }
            }
            z.d(this.f1868i);
            this.t = !this.f1896s;
        } catch (Throwable th) {
            z.d(this.f1868i);
            throw th;
        }
    }

    @Override // t5.d0.d
    public final void b() {
        this.f1896s = true;
    }

    @Override // b5.m
    public final long c() {
        return this.f1903j + this.f1892o;
    }

    @Override // b5.m
    public final boolean d() {
        return this.t;
    }
}
