package com.google.android.exoplayer2.source.dash;

import b5.f;
import b5.l;
import b5.m;
import c4.t;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import d5.j;
import java.util.ArrayList;
import java.util.List;
import k4.e;
import r5.h;
import t5.e0;
import t5.k;
import t5.l0;
import v3.i0;
import v5.p;
import w3.a0;

/* loaded from: classes.dex */
public final class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final c5.a f2613b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2614c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2615d;

    /* renamed from: e, reason: collision with root package name */
    public final k f2616e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final d.c f2617g;

    /* renamed from: h, reason: collision with root package name */
    public final b[] f2618h;

    /* renamed from: i, reason: collision with root package name */
    public h f2619i;

    /* renamed from: j, reason: collision with root package name */
    public d5.c f2620j;

    /* renamed from: k, reason: collision with root package name */
    public int f2621k;

    /* renamed from: l, reason: collision with root package name */
    public z4.b f2622l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2623m;

    public static final class a implements a.InterfaceC0037a {

        /* renamed from: a, reason: collision with root package name */
        public final k.a f2624a;

        public a(k.a aVar) {
            this.f2624a = aVar;
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0037a
        public final c a(e0 e0Var, d5.c cVar, c5.a aVar, int i10, int[] iArr, h hVar, int i11, long j10, boolean z10, ArrayList arrayList, d.c cVar2, l0 l0Var, a0 a0Var) {
            k a10 = this.f2624a.a();
            if (l0Var != null) {
                a10.f(l0Var);
            }
            return new c(e0Var, cVar, aVar, i10, iArr, hVar, i11, a10, j10, z10, arrayList, cVar2);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f2625a;

        /* renamed from: b, reason: collision with root package name */
        public final j f2626b;

        /* renamed from: c, reason: collision with root package name */
        public final d5.b f2627c;

        /* renamed from: d, reason: collision with root package name */
        public final c5.c f2628d;

        /* renamed from: e, reason: collision with root package name */
        public final long f2629e;
        public final long f;

        public b(long j10, j jVar, d5.b bVar, f fVar, long j11, c5.c cVar) {
            this.f2629e = j10;
            this.f2626b = jVar;
            this.f2627c = bVar;
            this.f = j11;
            this.f2625a = fVar;
            this.f2628d = cVar;
        }

        public final b a(long j10, j jVar) {
            long g10;
            long g11;
            c5.c l10 = this.f2626b.l();
            c5.c l11 = jVar.l();
            if (l10 == null) {
                return new b(j10, jVar, this.f2627c, this.f2625a, this.f, l10);
            }
            if (!l10.h()) {
                return new b(j10, jVar, this.f2627c, this.f2625a, this.f, l11);
            }
            long j11 = l10.j(j10);
            if (j11 == 0) {
                return new b(j10, jVar, this.f2627c, this.f2625a, this.f, l11);
            }
            long i10 = l10.i();
            long a10 = l10.a(i10);
            long j12 = (j11 + i10) - 1;
            long b10 = l10.b(j12, j10) + l10.a(j12);
            long i11 = l11.i();
            long a11 = l11.a(i11);
            long j13 = this.f;
            if (b10 == a11) {
                g10 = j12 + 1;
            } else {
                if (b10 < a11) {
                    throw new z4.b();
                }
                if (a11 < a10) {
                    g11 = j13 - (l11.g(a10, j10) - i10);
                    return new b(j10, jVar, this.f2627c, this.f2625a, g11, l11);
                }
                g10 = l10.g(a11, j10);
            }
            g11 = (g10 - i11) + j13;
            return new b(j10, jVar, this.f2627c, this.f2625a, g11, l11);
        }

        public final long b(long j10) {
            return (this.f2628d.k(this.f2629e, j10) + (this.f2628d.d(this.f2629e, j10) + this.f)) - 1;
        }

        public final long c(long j10) {
            return this.f2628d.b(j10 - this.f, this.f2629e) + d(j10);
        }

        public final long d(long j10) {
            return this.f2628d.a(j10 - this.f);
        }

        public final boolean e(long j10, long j11) {
            return this.f2628d.h() || j11 == -9223372036854775807L || c(j10) <= j11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c, reason: collision with other inner class name */
    public static final class C0038c extends b5.b {

        /* renamed from: e, reason: collision with root package name */
        public final b f2630e;

        public C0038c(b bVar, long j10, long j11) {
            super(j10, j11);
            this.f2630e = bVar;
        }

        @Override // b5.n
        public final long a() {
            c();
            return this.f2630e.d(this.f1844d);
        }

        @Override // b5.n
        public final long b() {
            c();
            return this.f2630e.c(this.f1844d);
        }
    }

    public c(e0 e0Var, d5.c cVar, c5.a aVar, int i10, int[] iArr, h hVar, int i11, k kVar, long j10, boolean z10, ArrayList arrayList, d.c cVar2) {
        c4.h eVar;
        i0 i0Var;
        b5.d dVar;
        this.f2612a = e0Var;
        this.f2620j = cVar;
        this.f2613b = aVar;
        this.f2614c = iArr;
        this.f2619i = hVar;
        this.f2615d = i11;
        this.f2616e = kVar;
        this.f2621k = i10;
        this.f = j10;
        this.f2617g = cVar2;
        long e10 = cVar.e(i10);
        ArrayList<j> l10 = l();
        this.f2618h = new b[hVar.length()];
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.f2618h.length) {
            j jVar = l10.get(hVar.c(i13));
            d5.b d10 = aVar.d(jVar.f3497b);
            b[] bVarArr = this.f2618h;
            d5.b bVar = d10 == null ? jVar.f3497b.get(i12) : d10;
            i0 i0Var2 = jVar.f3496a;
            String str = i0Var2.f15456s;
            if (p.l(str)) {
                dVar = null;
            } else {
                if (((str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) ? 1 : i12) != 0) {
                    eVar = new i4.d(1);
                    i0Var = i0Var2;
                } else {
                    int i14 = z10 ? 4 : i12;
                    i0Var = i0Var2;
                    eVar = new e(i14, null, null, arrayList, cVar2);
                }
                dVar = new b5.d(eVar, i11, i0Var);
            }
            int i15 = i13;
            bVarArr[i15] = new b(e10, jVar, bVar, dVar, 0L, jVar.l());
            i13 = i15 + 1;
            i12 = 0;
        }
    }

    @Override // b5.i
    public final void a() {
        z4.b bVar = this.f2622l;
        if (bVar != null) {
            throw bVar;
        }
        this.f2612a.a();
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public final void b(h hVar) {
        this.f2619i = hVar;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public final void d(d5.c cVar, int i10) {
        try {
            this.f2620j = cVar;
            this.f2621k = i10;
            long e10 = cVar.e(i10);
            ArrayList<j> l10 = l();
            for (int i11 = 0; i11 < this.f2618h.length; i11++) {
                j jVar = l10.get(this.f2619i.c(i11));
                b[] bVarArr = this.f2618h;
                bVarArr[i11] = bVarArr[i11].a(e10, jVar);
            }
        } catch (z4.b e11) {
            this.f2622l = e11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r3 < (r14 - 1)) goto L17;
     */
    @Override // b5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r17, v3.n1 r19) {
        /*
            r16 = this;
            r1 = r17
            r7 = r16
            com.google.android.exoplayer2.source.dash.c$b[] r0 = r7.f2618h
            int r3 = r0.length
            r4 = 0
        L8:
            if (r4 >= r3) goto L5f
            r5 = r0[r4]
            c5.c r6 = r5.f2628d
            if (r6 == 0) goto L5c
            long r8 = r5.f2629e
            long r8 = r6.j(r8)
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L1d
            goto L5c
        L1d:
            c5.c r0 = r5.f2628d
            long r3 = r5.f2629e
            long r3 = r0.g(r1, r3)
            long r10 = r5.f
            long r3 = r3 + r10
            long r10 = r5.d(r3)
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L51
            r12 = -1
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 == 0) goto L48
            c5.c r0 = r5.f2628d
            long r14 = r0.i()
            long r12 = r5.f
            long r14 = r14 + r12
            long r14 = r14 + r8
            r8 = 1
            long r14 = r14 - r8
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 >= 0) goto L51
            goto L4a
        L48:
            r8 = 1
        L4a:
            long r3 = r3 + r8
            long r3 = r5.d(r3)
            r5 = r3
            goto L52
        L51:
            r5 = r10
        L52:
            r0 = r19
            r1 = r17
            r3 = r10
            long r0 = r0.a(r1, r3, r5)
            return r0
        L5c:
            int r4 = r4 + 1
            goto L8
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.e(long, v3.n1):long");
    }

    @Override // b5.i
    public final boolean f(long j10, b5.e eVar, List<? extends m> list) {
        if (this.f2622l != null) {
            return false;
        }
        this.f2619i.h();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[RETURN] */
    @Override // b5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(b5.e r11, boolean r12, t5.c0.c r13, t5.c0 r14) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.g(b5.e, boolean, t5.c0$c, t5.c0):boolean");
    }

    @Override // b5.i
    public final int h(long j10, List<? extends m> list) {
        return (this.f2622l != null || this.f2619i.length() < 2) ? list.size() : this.f2619i.n(j10, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0218  */
    @Override // b5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r41, long r43, java.util.List<? extends b5.m> r45, b5.g r46) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.i(long, long, java.util.List, b5.g):void");
    }

    @Override // b5.i
    public final void j(b5.e eVar) {
        if (eVar instanceof l) {
            int d10 = this.f2619i.d(((l) eVar).f1864d);
            b[] bVarArr = this.f2618h;
            b bVar = bVarArr[d10];
            if (bVar.f2628d == null) {
                f fVar = bVar.f2625a;
                t tVar = ((b5.d) fVar).f1854p;
                c4.c cVar = tVar instanceof c4.c ? (c4.c) tVar : null;
                if (cVar != null) {
                    j jVar = bVar.f2626b;
                    bVarArr[d10] = new b(bVar.f2629e, jVar, bVar.f2627c, fVar, bVar.f, new c5.e(cVar, jVar.f3498c));
                }
            }
        }
        d.c cVar2 = this.f2617g;
        if (cVar2 != null) {
            long j10 = cVar2.f2644d;
            if (j10 == -9223372036854775807L || eVar.f1867h > j10) {
                cVar2.f2644d = eVar.f1867h;
            }
            d.this.f2636o = true;
        }
    }

    public final long k(long j10) {
        d5.c cVar = this.f2620j;
        long j11 = cVar.f3451a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - v5.e0.I(j11 + cVar.b(this.f2621k).f3484b);
    }

    public final ArrayList<j> l() {
        List<d5.a> list = this.f2620j.b(this.f2621k).f3485c;
        ArrayList<j> arrayList = new ArrayList<>();
        for (int i10 : this.f2614c) {
            arrayList.addAll(list.get(i10).f3444c);
        }
        return arrayList;
    }

    public final b m(int i10) {
        b bVar = this.f2618h[i10];
        d5.b d10 = this.f2613b.d(bVar.f2626b.f3497b);
        if (d10 == null || d10.equals(bVar.f2627c)) {
            return bVar;
        }
        b bVar2 = new b(bVar.f2629e, bVar.f2626b, d10, bVar.f2625a, bVar.f, bVar.f2628d);
        this.f2618h[i10] = bVar2;
        return bVar2;
    }

    @Override // b5.i
    public final void release() {
        for (b bVar : this.f2618h) {
            f fVar = bVar.f2625a;
            if (fVar != null) {
                ((b5.d) fVar).f1848a.release();
            }
        }
    }
}
