package z4;

import java.io.IOException;
import v3.n1;
import z4.r;
import z4.t;

/* loaded from: classes.dex */
public final class o implements r, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final t.b f17703a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17704b;

    /* renamed from: c, reason: collision with root package name */
    public final t5.b f17705c;

    /* renamed from: d, reason: collision with root package name */
    public t f17706d;

    /* renamed from: e, reason: collision with root package name */
    public r f17707e;
    public r.a f;

    /* renamed from: o, reason: collision with root package name */
    public long f17708o = -9223372036854775807L;

    public o(t.b bVar, t5.b bVar2, long j10) {
        this.f17703a = bVar;
        this.f17705c = bVar2;
        this.f17704b = j10;
    }

    @Override // z4.d0.a
    public final void a(r rVar) {
        r.a aVar = this.f;
        int i10 = v5.e0.f15881a;
        aVar.a(this);
    }

    @Override // z4.r.a
    public final void b(r rVar) {
        r.a aVar = this.f;
        int i10 = v5.e0.f15881a;
        aVar.b(this);
    }

    @Override // z4.r, z4.d0
    public final long c() {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.c();
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        r rVar = this.f17707e;
        return rVar != null && rVar.d(j10);
    }

    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.e(j10, n1Var);
    }

    public final long f(long j10) {
        long j11 = this.f17708o;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // z4.r, z4.d0
    public final long g() {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.g();
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        rVar.h(j10);
    }

    @Override // z4.r
    public final long i(r5.h[] hVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
        long j11;
        long j12 = this.f17708o;
        if (j12 == -9223372036854775807L || j10 != this.f17704b) {
            j11 = j10;
        } else {
            this.f17708o = -9223372036854775807L;
            j11 = j12;
        }
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.i(hVarArr, zArr, c0VarArr, zArr2, j11);
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        r rVar = this.f17707e;
        return rVar != null && rVar.isLoading();
    }

    @Override // z4.r
    public final void j() {
        try {
            r rVar = this.f17707e;
            if (rVar != null) {
                rVar.j();
                return;
            }
            t tVar = this.f17706d;
            if (tVar != null) {
                tVar.h();
            }
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // z4.r
    public final long l(long j10) {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.l(j10);
    }

    @Override // z4.r
    public final void n(r.a aVar, long j10) {
        this.f = aVar;
        r rVar = this.f17707e;
        if (rVar != null) {
            long j11 = this.f17704b;
            long j12 = this.f17708o;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            rVar.n(this, j11);
        }
    }

    @Override // z4.r
    public final long o() {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.o();
    }

    @Override // z4.r
    public final j0 q() {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        return rVar.q();
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        r rVar = this.f17707e;
        int i10 = v5.e0.f15881a;
        rVar.s(j10, z10);
    }
}
