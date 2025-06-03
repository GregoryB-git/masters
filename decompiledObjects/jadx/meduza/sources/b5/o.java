package b5;

import b.z;
import c4.v;
import v3.i0;
import z4.b0;

/* loaded from: classes.dex */
public final class o extends a {

    /* renamed from: o, reason: collision with root package name */
    public final int f1905o;

    /* renamed from: p, reason: collision with root package name */
    public final i0 f1906p;

    /* renamed from: q, reason: collision with root package name */
    public long f1907q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1908r;

    public o(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, int i11, i0 i0Var2) {
        super(kVar, nVar, i0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f1905o = i11;
        this.f1906p = i0Var2;
    }

    @Override // t5.d0.d
    public final void a() {
        c cVar = this.f1840m;
        x6.b.K(cVar);
        for (b0 b0Var : cVar.f1846b) {
            if (b0Var.F != 0) {
                b0Var.F = 0L;
                b0Var.f17594z = true;
            }
        }
        v a10 = cVar.a(this.f1905o);
        a10.d(this.f1906p);
        try {
            long a11 = this.f1868i.a(this.f1862b.a(this.f1907q));
            if (a11 != -1) {
                a11 += this.f1907q;
            }
            c4.e eVar = new c4.e(this.f1868i, this.f1907q, a11);
            for (int i10 = 0; i10 != -1; i10 = a10.e(eVar, Integer.MAX_VALUE, true)) {
                this.f1907q += i10;
            }
            a10.c(this.f1866g, 1, (int) this.f1907q, 0, null);
            z.d(this.f1868i);
            this.f1908r = true;
        } catch (Throwable th) {
            z.d(this.f1868i);
            throw th;
        }
    }

    @Override // t5.d0.d
    public final void b() {
    }

    @Override // b5.m
    public final boolean d() {
        return this.f1908r;
    }
}
