package c5;

import l3.l;
import v3.i0;
import v5.e0;
import z3.g;
import z4.c0;

/* loaded from: classes.dex */
public final class f implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f2349a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f2351c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2352d;

    /* renamed from: e, reason: collision with root package name */
    public d5.f f2353e;
    public boolean f;

    /* renamed from: o, reason: collision with root package name */
    public int f2354o;

    /* renamed from: b, reason: collision with root package name */
    public final r4.c f2350b = new r4.c();

    /* renamed from: p, reason: collision with root package name */
    public long f2355p = -9223372036854775807L;

    public f(d5.f fVar, i0 i0Var, boolean z10) {
        this.f2349a = i0Var;
        this.f2353e = fVar;
        this.f2351c = fVar.f3480b;
        d(fVar, z10);
    }

    @Override // z4.c0
    public final void a() {
    }

    @Override // z4.c0
    public final boolean b() {
        return true;
    }

    public final void c(long j10) {
        int b10 = e0.b(this.f2351c, j10, true);
        this.f2354o = b10;
        if (!(this.f2352d && b10 == this.f2351c.length)) {
            j10 = -9223372036854775807L;
        }
        this.f2355p = j10;
    }

    public final void d(d5.f fVar, boolean z10) {
        int i10 = this.f2354o;
        long j10 = i10 == 0 ? -9223372036854775807L : this.f2351c[i10 - 1];
        this.f2352d = z10;
        this.f2353e = fVar;
        long[] jArr = fVar.f3480b;
        this.f2351c = jArr;
        long j11 = this.f2355p;
        if (j11 != -9223372036854775807L) {
            c(j11);
        } else if (j10 != -9223372036854775807L) {
            this.f2354o = e0.b(jArr, j10, false);
        }
    }

    @Override // z4.c0
    public final int m(long j10) {
        int max = Math.max(this.f2354o, e0.b(this.f2351c, j10, true));
        int i10 = max - this.f2354o;
        this.f2354o = max;
        return i10;
    }

    @Override // z4.c0
    public final int r(l lVar, g gVar, int i10) {
        int i11 = this.f2354o;
        boolean z10 = i11 == this.f2351c.length;
        if (z10 && !this.f2352d) {
            gVar.f17508a = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f) {
            lVar.f9560b = this.f2349a;
            this.f = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f2354o = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] e10 = this.f2350b.e(this.f2353e.f3479a[i11]);
            gVar.q(e10.length);
            gVar.f17532c.put(e10);
        }
        gVar.f17534e = this.f2351c[i11];
        gVar.f17508a = 1;
        return -4;
    }
}
