package com.google.android.exoplayer2.source.smoothstreaming;

import b5.d;
import b5.f;
import b5.g;
import b5.m;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import g5.a;
import java.util.Collections;
import java.util.List;
import k4.e;
import k4.j;
import r5.h;
import r5.n;
import t5.c0;
import t5.e0;
import t5.k;
import t5.l0;
import t5.u;
import v3.i0;
import v3.n1;
import v5.d0;

/* loaded from: classes.dex */
public final class a implements com.google.android.exoplayer2.source.smoothstreaming.b {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2679a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2680b;

    /* renamed from: c, reason: collision with root package name */
    public final f[] f2681c;

    /* renamed from: d, reason: collision with root package name */
    public final k f2682d;

    /* renamed from: e, reason: collision with root package name */
    public h f2683e;
    public g5.a f;

    /* renamed from: g, reason: collision with root package name */
    public int f2684g;

    /* renamed from: h, reason: collision with root package name */
    public z4.b f2685h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a, reason: collision with other inner class name */
    public static final class C0039a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final k.a f2686a;

        public C0039a(k.a aVar) {
            this.f2686a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.b.a
        public final a a(e0 e0Var, g5.a aVar, int i10, h hVar, l0 l0Var) {
            k a10 = this.f2686a.a();
            if (l0Var != null) {
                a10.f(l0Var);
            }
            return new a(e0Var, aVar, i10, hVar, a10);
        }
    }

    public static final class b extends b5.b {

        /* renamed from: e, reason: collision with root package name */
        public final a.b f2687e;

        public b(a.b bVar, int i10) {
            super(i10, bVar.f5863k - 1);
            this.f2687e = bVar;
        }

        @Override // b5.n
        public final long a() {
            c();
            a.b bVar = this.f2687e;
            return bVar.f5867o[(int) this.f1844d];
        }

        @Override // b5.n
        public final long b() {
            return this.f2687e.b((int) this.f1844d) + a();
        }
    }

    public a(e0 e0Var, g5.a aVar, int i10, h hVar, k kVar) {
        k4.k[] kVarArr;
        this.f2679a = e0Var;
        this.f = aVar;
        this.f2680b = i10;
        this.f2683e = hVar;
        this.f2682d = kVar;
        a.b bVar = aVar.f[i10];
        this.f2681c = new f[hVar.length()];
        int i11 = 0;
        while (i11 < this.f2681c.length) {
            int c10 = hVar.c(i11);
            i0 i0Var = bVar.f5862j[c10];
            if (i0Var.f15459w != null) {
                a.C0094a c0094a = aVar.f5848e;
                c0094a.getClass();
                kVarArr = c0094a.f5853c;
            } else {
                kVarArr = null;
            }
            int i12 = bVar.f5854a;
            int i13 = i11;
            this.f2681c[i13] = new d(new e(3, null, new j(c10, i12, bVar.f5856c, -9223372036854775807L, aVar.f5849g, i0Var, 0, kVarArr, i12 == 2 ? 4 : 0, null, null), Collections.emptyList()), bVar.f5854a, i0Var);
            i11 = i13 + 1;
        }
    }

    @Override // b5.i
    public final void a() {
        z4.b bVar = this.f2685h;
        if (bVar != null) {
            throw bVar;
        }
        this.f2679a.a();
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public final void b(h hVar) {
        this.f2683e = hVar;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.b
    public final void c(g5.a aVar) {
        int i10;
        a.b[] bVarArr = this.f.f;
        int i11 = this.f2680b;
        a.b bVar = bVarArr[i11];
        int i12 = bVar.f5863k;
        a.b bVar2 = aVar.f[i11];
        if (i12 != 0 && bVar2.f5863k != 0) {
            int i13 = i12 - 1;
            long b10 = bVar.b(i13) + bVar.f5867o[i13];
            long j10 = bVar2.f5867o[0];
            if (b10 > j10) {
                i10 = v5.e0.f(bVar.f5867o, j10, true) + this.f2684g;
                this.f2684g = i10;
                this.f = aVar;
            }
        }
        i10 = this.f2684g + i12;
        this.f2684g = i10;
        this.f = aVar;
    }

    @Override // b5.i
    public final long e(long j10, n1 n1Var) {
        a.b bVar = this.f.f[this.f2680b];
        int f = v5.e0.f(bVar.f5867o, j10, true);
        long[] jArr = bVar.f5867o;
        long j11 = jArr[f];
        return n1Var.a(j10, j11, (j11 >= j10 || f >= bVar.f5863k + (-1)) ? j11 : jArr[f + 1]);
    }

    @Override // b5.i
    public final boolean f(long j10, b5.e eVar, List<? extends m> list) {
        if (this.f2685h != null) {
            return false;
        }
        this.f2683e.h();
        return false;
    }

    @Override // b5.i
    public final boolean g(b5.e eVar, boolean z10, c0.c cVar, c0 c0Var) {
        c0.b a10 = ((u) c0Var).a(n.a(this.f2683e), cVar);
        if (z10 && a10 != null && a10.f14459a == 2) {
            h hVar = this.f2683e;
            if (hVar.k(hVar.d(eVar.f1864d), a10.f14460b)) {
                return true;
            }
        }
        return false;
    }

    @Override // b5.i
    public final int h(long j10, List<? extends m> list) {
        return (this.f2685h != null || this.f2683e.length() < 2) ? list.size() : this.f2683e.n(j10, list);
    }

    @Override // b5.i
    public final void i(long j10, long j11, List<? extends m> list, g gVar) {
        int c10;
        long b10;
        if (this.f2685h != null) {
            return;
        }
        a.b bVar = this.f.f[this.f2680b];
        if (bVar.f5863k == 0) {
            gVar.f1869a = !r4.f5847d;
            return;
        }
        if (list.isEmpty()) {
            c10 = v5.e0.f(bVar.f5867o, j11, true);
        } else {
            c10 = (int) (list.get(list.size() - 1).c() - this.f2684g);
            if (c10 < 0) {
                this.f2685h = new z4.b();
                return;
            }
        }
        if (c10 >= bVar.f5863k) {
            gVar.f1869a = !this.f.f5847d;
            return;
        }
        long j12 = j11 - j10;
        g5.a aVar = this.f;
        if (aVar.f5847d) {
            a.b bVar2 = aVar.f[this.f2680b];
            int i10 = bVar2.f5863k - 1;
            b10 = (bVar2.b(i10) + bVar2.f5867o[i10]) - j10;
        } else {
            b10 = -9223372036854775807L;
        }
        int length = this.f2683e.length();
        b5.n[] nVarArr = new b5.n[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f2683e.c(i11);
            nVarArr[i11] = new b(bVar, c10);
        }
        this.f2683e.j(j12, b10, list, nVarArr);
        long j13 = bVar.f5867o[c10];
        long b11 = bVar.b(c10) + j13;
        long j14 = list.isEmpty() ? j11 : -9223372036854775807L;
        int i12 = this.f2684g + c10;
        int i13 = this.f2683e.i();
        f fVar = this.f2681c[i13];
        int c11 = this.f2683e.c(i13);
        x6.b.H(bVar.f5862j != null);
        x6.b.H(bVar.f5866n != null);
        x6.b.H(c10 < bVar.f5866n.size());
        String num = Integer.toString(bVar.f5862j[c11].f15453p);
        String l10 = bVar.f5866n.get(c10).toString();
        gVar.f1870b = new b5.j(this.f2682d, new t5.n(d0.d(bVar.f5864l, bVar.f5865m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10)), 0L, -1L), this.f2683e.p(), this.f2683e.q(), this.f2683e.s(), j13, b11, j14, -9223372036854775807L, i12, 1, j13, fVar);
    }

    @Override // b5.i
    public final void j(b5.e eVar) {
    }

    @Override // b5.i
    public final void release() {
        for (f fVar : this.f2681c) {
            ((d) fVar).f1848a.release();
        }
    }
}
