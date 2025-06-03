package z4;

import android.net.Uri;
import java.util.ArrayList;
import v3.i0;
import v3.n1;
import v3.o0;
import z4.r;
import z4.t;

/* loaded from: classes.dex */
public final class f0 extends z4.a {

    /* renamed from: r, reason: collision with root package name */
    public static final v3.i0 f17633r;

    /* renamed from: s, reason: collision with root package name */
    public static final o0 f17634s;
    public static final byte[] t;

    /* renamed from: p, reason: collision with root package name */
    public final long f17635p;

    /* renamed from: q, reason: collision with root package name */
    public final o0 f17636q;

    public static final class a implements r {

        /* renamed from: c, reason: collision with root package name */
        public static final j0 f17637c = new j0(new i0("", f0.f17633r));

        /* renamed from: a, reason: collision with root package name */
        public final long f17638a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<c0> f17639b = new ArrayList<>();

        public a(long j10) {
            this.f17638a = j10;
        }

        @Override // z4.r, z4.d0
        public final long c() {
            return Long.MIN_VALUE;
        }

        @Override // z4.r, z4.d0
        public final boolean d(long j10) {
            return false;
        }

        @Override // z4.r
        public final long e(long j10, n1 n1Var) {
            return v5.e0.j(j10, 0L, this.f17638a);
        }

        @Override // z4.r, z4.d0
        public final long g() {
            return Long.MIN_VALUE;
        }

        @Override // z4.r, z4.d0
        public final void h(long j10) {
        }

        @Override // z4.r
        public final long i(r5.h[] hVarArr, boolean[] zArr, c0[] c0VarArr, boolean[] zArr2, long j10) {
            long j11 = v5.e0.j(j10, 0L, this.f17638a);
            for (int i10 = 0; i10 < hVarArr.length; i10++) {
                c0 c0Var = c0VarArr[i10];
                if (c0Var != null && (hVarArr[i10] == null || !zArr[i10])) {
                    this.f17639b.remove(c0Var);
                    c0VarArr[i10] = null;
                }
                if (c0VarArr[i10] == null && hVarArr[i10] != null) {
                    b bVar = new b(this.f17638a);
                    bVar.c(j11);
                    this.f17639b.add(bVar);
                    c0VarArr[i10] = bVar;
                    zArr2[i10] = true;
                }
            }
            return j11;
        }

        @Override // z4.r, z4.d0
        public final boolean isLoading() {
            return false;
        }

        @Override // z4.r
        public final void j() {
        }

        @Override // z4.r
        public final long l(long j10) {
            long j11 = v5.e0.j(j10, 0L, this.f17638a);
            for (int i10 = 0; i10 < this.f17639b.size(); i10++) {
                ((b) this.f17639b.get(i10)).c(j11);
            }
            return j11;
        }

        @Override // z4.r
        public final void n(r.a aVar, long j10) {
            aVar.b(this);
        }

        @Override // z4.r
        public final long o() {
            return -9223372036854775807L;
        }

        @Override // z4.r
        public final j0 q() {
            return f17637c;
        }

        @Override // z4.r
        public final void s(long j10, boolean z10) {
        }
    }

    public static final class b implements c0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f17640a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17641b;

        /* renamed from: c, reason: collision with root package name */
        public long f17642c;

        public b(long j10) {
            v3.i0 i0Var = f0.f17633r;
            this.f17640a = v5.e0.w(2, 2) * ((j10 * 44100) / 1000000);
            c(0L);
        }

        @Override // z4.c0
        public final void a() {
        }

        @Override // z4.c0
        public final boolean b() {
            return true;
        }

        public final void c(long j10) {
            v3.i0 i0Var = f0.f17633r;
            this.f17642c = v5.e0.j(v5.e0.w(2, 2) * ((j10 * 44100) / 1000000), 0L, this.f17640a);
        }

        @Override // z4.c0
        public final int m(long j10) {
            long j11 = this.f17642c;
            c(j10);
            return (int) ((this.f17642c - j11) / f0.t.length);
        }

        @Override // z4.c0
        public final int r(l3.l lVar, z3.g gVar, int i10) {
            if (!this.f17641b || (i10 & 2) != 0) {
                lVar.f9560b = f0.f17633r;
                this.f17641b = true;
                return -5;
            }
            long j10 = this.f17640a;
            long j11 = this.f17642c;
            long j12 = j10 - j11;
            if (j12 == 0) {
                gVar.l(4);
                return -4;
            }
            v3.i0 i0Var = f0.f17633r;
            gVar.f17534e = ((j11 / v5.e0.w(2, 2)) * 1000000) / 44100;
            gVar.l(1);
            byte[] bArr = f0.t;
            int min = (int) Math.min(bArr.length, j12);
            if ((i10 & 4) == 0) {
                gVar.q(min);
                gVar.f17532c.put(bArr, 0, min);
            }
            if ((i10 & 1) == 0) {
                this.f17642c += min;
            }
            return -4;
        }
    }

    static {
        i0.a aVar = new i0.a();
        aVar.f15472k = "audio/raw";
        aVar.f15484x = 2;
        aVar.f15485y = 44100;
        aVar.f15486z = 2;
        v3.i0 a10 = aVar.a();
        f17633r = a10;
        o0.a aVar2 = new o0.a();
        aVar2.f15539a = "SilenceMediaSource";
        aVar2.f15540b = Uri.EMPTY;
        aVar2.f15541c = a10.t;
        f17634s = aVar2.a();
        t = new byte[v5.e0.w(2, 2) * 1024];
    }

    public f0(long j10, o0 o0Var) {
        x6.b.q(j10 >= 0);
        this.f17635p = j10;
        this.f17636q = o0Var;
    }

    @Override // z4.t
    public final o0 f() {
        return this.f17636q;
    }

    @Override // z4.t
    public final void g(r rVar) {
    }

    @Override // z4.t
    public final void h() {
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        return new a(this.f17635p);
    }

    @Override // z4.a
    public final void t(t5.l0 l0Var) {
        v(new g0(this.f17635p, true, false, this.f17636q));
    }

    @Override // z4.a
    public final void w() {
    }
}
