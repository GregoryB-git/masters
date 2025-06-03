package com.google.android.exoplayer2.source.dash;

import a4.g;
import b1.v;
import b5.h;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.d;
import com.google.android.exoplayer2.source.dash.d.c;
import d5.f;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Pattern;
import t5.c0;
import t5.e0;
import t5.l0;
import v3.n1;
import w3.a0;
import z4.d0;
import z4.i;
import z4.i0;
import z4.j0;
import z4.k;
import z4.r;
import z4.w;

/* loaded from: classes.dex */
public final class b implements r, d0.a<h<com.google.android.exoplayer2.source.dash.a>>, h.b<com.google.android.exoplayer2.source.dash.a> {
    public static final Pattern G = Pattern.compile("CC([1-4])=(.+)");
    public static final Pattern H = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public v C;
    public d5.c D;
    public int E;
    public List<f> F;

    /* renamed from: a, reason: collision with root package name */
    public final int f2590a;

    /* renamed from: b, reason: collision with root package name */
    public final a.InterfaceC0037a f2591b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f2592c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.h f2593d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f2594e;
    public final c5.a f;

    /* renamed from: o, reason: collision with root package name */
    public final long f2595o;

    /* renamed from: p, reason: collision with root package name */
    public final e0 f2596p;

    /* renamed from: q, reason: collision with root package name */
    public final t5.b f2597q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f2598r;

    /* renamed from: s, reason: collision with root package name */
    public final a[] f2599s;
    public final i t;

    /* renamed from: u, reason: collision with root package name */
    public final d f2600u;

    /* renamed from: w, reason: collision with root package name */
    public final w.a f2602w;

    /* renamed from: x, reason: collision with root package name */
    public final g.a f2603x;

    /* renamed from: y, reason: collision with root package name */
    public final a0 f2604y;

    /* renamed from: z, reason: collision with root package name */
    public r.a f2605z;
    public h<com.google.android.exoplayer2.source.dash.a>[] A = new h[0];
    public c5.f[] B = new c5.f[0];

    /* renamed from: v, reason: collision with root package name */
    public final IdentityHashMap<h<com.google.android.exoplayer2.source.dash.a>, d.c> f2601v = new IdentityHashMap<>();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2606a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2607b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2608c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2609d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2610e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2611g;

        public a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f2607b = i10;
            this.f2606a = iArr;
            this.f2608c = i11;
            this.f2610e = i12;
            this.f = i13;
            this.f2611g = i14;
            this.f2609d = i15;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(int r21, d5.c r22, c5.a r23, int r24, com.google.android.exoplayer2.source.dash.a.InterfaceC0037a r25, t5.l0 r26, a4.h r27, a4.g.a r28, t5.c0 r29, z4.w.a r30, long r31, t5.e0 r33, t5.b r34, z4.i r35, com.google.android.exoplayer2.source.dash.DashMediaSource.c r36, w3.a0 r37) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.b.<init>(int, d5.c, c5.a, int, com.google.android.exoplayer2.source.dash.a$a, t5.l0, a4.h, a4.g$a, t5.c0, z4.w$a, long, t5.e0, t5.b, z4.i, com.google.android.exoplayer2.source.dash.DashMediaSource$c, w3.a0):void");
    }

    @Override // z4.d0.a
    public final void a(h<com.google.android.exoplayer2.source.dash.a> hVar) {
        this.f2605z.a(this);
    }

    @Override // z4.r, z4.d0
    public final long c() {
        return this.C.c();
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        return this.C.d(j10);
    }

    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        for (h<com.google.android.exoplayer2.source.dash.a> hVar : this.A) {
            if (hVar.f1871a == 2) {
                return hVar.f1875e.e(j10, n1Var);
            }
        }
        return j10;
    }

    public final int f(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f2599s[i11].f2610e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f2599s[i14].f2608c == 0) {
                return i13;
            }
        }
        return -1;
    }

    @Override // z4.r, z4.d0
    public final long g() {
        return this.C.g();
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
        this.C.h(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.r
    public final long i(r5.h[] hVarArr, boolean[] zArr, z4.c0[] c0VarArr, boolean[] zArr2, long j10) {
        int i10;
        boolean z10;
        int[] iArr;
        int i11;
        int[] iArr2;
        int i12;
        i0 i0Var;
        i0 i0Var2;
        int i13;
        d.c cVar;
        r5.h[] hVarArr2 = hVarArr;
        int[] iArr3 = new int[hVarArr2.length];
        int i14 = 0;
        while (true) {
            i10 = -1;
            if (i14 >= hVarArr2.length) {
                break;
            }
            r5.h hVar = hVarArr2[i14];
            if (hVar != null) {
                iArr3[i14] = this.f2598r.b(hVar.a());
            } else {
                iArr3[i14] = -1;
            }
            i14++;
        }
        for (int i15 = 0; i15 < hVarArr2.length; i15++) {
            if (hVarArr2[i15] == null || !zArr[i15]) {
                z4.c0 c0Var = c0VarArr[i15];
                if (c0Var instanceof h) {
                    ((h) c0Var).A(this);
                } else if (c0Var instanceof h.a) {
                    h.a aVar = (h.a) c0Var;
                    x6.b.H(h.this.f1874d[aVar.f1889c]);
                    h.this.f1874d[aVar.f1889c] = false;
                }
                c0VarArr[i15] = null;
            }
        }
        int i16 = 0;
        while (true) {
            z10 = true;
            boolean z11 = true;
            if (i16 >= hVarArr2.length) {
                break;
            }
            z4.c0 c0Var2 = c0VarArr[i16];
            if ((c0Var2 instanceof k) || (c0Var2 instanceof h.a)) {
                int f = f(iArr3, i16);
                if (f == -1) {
                    z11 = c0VarArr[i16] instanceof k;
                } else {
                    z4.c0 c0Var3 = c0VarArr[i16];
                    if (!(c0Var3 instanceof h.a) || ((h.a) c0Var3).f1887a != c0VarArr[f]) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    z4.c0 c0Var4 = c0VarArr[i16];
                    if (c0Var4 instanceof h.a) {
                        h.a aVar2 = (h.a) c0Var4;
                        x6.b.H(h.this.f1874d[aVar2.f1889c]);
                        h.this.f1874d[aVar2.f1889c] = false;
                    }
                    c0VarArr[i16] = null;
                }
            }
            i16++;
        }
        z4.c0[] c0VarArr2 = c0VarArr;
        int i17 = 0;
        while (i17 < hVarArr2.length) {
            r5.h hVar2 = hVarArr2[i17];
            if (hVar2 == null) {
                i11 = i17;
                iArr2 = iArr3;
            } else {
                z4.c0 c0Var5 = c0VarArr2[i17];
                if (c0Var5 == null) {
                    zArr2[i17] = z10;
                    a aVar3 = this.f2599s[iArr3[i17]];
                    int i18 = aVar3.f2608c;
                    if (i18 == 0) {
                        int i19 = aVar3.f;
                        boolean z12 = i19 != i10 ? z10 ? 1 : 0 : false;
                        if (z12) {
                            i0Var = this.f2598r.a(i19);
                            i12 = z10 ? 1 : 0;
                        } else {
                            i12 = 0;
                            i0Var = null;
                        }
                        int i20 = aVar3.f2611g;
                        byte b10 = i20 != i10 ? z10 ? 1 : 0 : false;
                        if (b10 == true) {
                            i0Var2 = this.f2598r.a(i20);
                            i12 += i0Var2.f17684a;
                        } else {
                            i0Var2 = null;
                        }
                        v3.i0[] i0VarArr = new v3.i0[i12];
                        int[] iArr4 = new int[i12];
                        if (z12) {
                            i0VarArr[0] = i0Var.f17687d[0];
                            iArr4[0] = 5;
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = 0;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (b10 != false) {
                            for (int i21 = 0; i21 < i0Var2.f17684a; i21++) {
                                v3.i0 i0Var3 = i0Var2.f17687d[i21];
                                i0VarArr[i13] = i0Var3;
                                iArr4[i13] = 3;
                                arrayList.add(i0Var3);
                                i13 += z10 ? 1 : 0;
                            }
                        }
                        if (this.D.f3454d && z12) {
                            d dVar = this.f2600u;
                            cVar = dVar.new c(dVar.f2631a);
                        } else {
                            cVar = null;
                        }
                        iArr2 = iArr3;
                        i11 = i17;
                        d.c cVar2 = cVar;
                        h<com.google.android.exoplayer2.source.dash.a> hVar3 = new h<>(aVar3.f2607b, iArr4, i0VarArr, this.f2591b.a(this.f2596p, this.D, this.f, this.E, aVar3.f2606a, hVar2, aVar3.f2607b, this.f2595o, z12, arrayList, cVar, this.f2592c, this.f2604y), this, this.f2597q, j10, this.f2593d, this.f2603x, this.f2594e, this.f2602w);
                        synchronized (this) {
                            this.f2601v.put(hVar3, cVar2);
                        }
                        c0VarArr[i11] = hVar3;
                        c0VarArr2 = c0VarArr;
                    } else {
                        i11 = i17;
                        iArr2 = iArr3;
                        if (i18 == 2) {
                            c0VarArr2[i11] = new c5.f(this.F.get(aVar3.f2609d), hVar2.a().f17687d[0], this.D.f3454d);
                        }
                    }
                } else {
                    i11 = i17;
                    iArr2 = iArr3;
                    if (c0Var5 instanceof h) {
                        ((com.google.android.exoplayer2.source.dash.a) ((h) c0Var5).f1875e).b(hVar2);
                    }
                }
            }
            i17 = i11 + 1;
            hVarArr2 = hVarArr;
            iArr3 = iArr2;
            z10 = true;
            i10 = -1;
        }
        int[] iArr5 = iArr3;
        int i22 = 0;
        while (i22 < hVarArr.length) {
            if (c0VarArr2[i22] != null || hVarArr[i22] == null) {
                iArr = iArr5;
            } else {
                a aVar4 = this.f2599s[iArr5[i22]];
                if (aVar4.f2608c == 1) {
                    iArr = iArr5;
                    int f10 = f(iArr, i22);
                    if (f10 != -1) {
                        h hVar4 = (h) c0VarArr2[f10];
                        int i23 = aVar4.f2607b;
                        for (int i24 = 0; i24 < hVar4.f1882v.length; i24++) {
                            if (hVar4.f1872b[i24] == i23) {
                                x6.b.H(!hVar4.f1874d[i24]);
                                hVar4.f1874d[i24] = true;
                                hVar4.f1882v[i24].x(j10, true);
                                c0VarArr2[i22] = new h.a(hVar4, hVar4.f1882v[i24], i24);
                            }
                        }
                        throw new IllegalStateException();
                    }
                    c0VarArr2[i22] = new k();
                    i22++;
                    iArr5 = iArr;
                } else {
                    iArr = iArr5;
                }
            }
            i22++;
            iArr5 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (z4.c0 c0Var6 : c0VarArr2) {
            if (c0Var6 instanceof h) {
                arrayList2.add((h) c0Var6);
            } else if (c0Var6 instanceof c5.f) {
                arrayList3.add((c5.f) c0Var6);
            }
        }
        h<com.google.android.exoplayer2.source.dash.a>[] hVarArr3 = new h[arrayList2.size()];
        this.A = hVarArr3;
        arrayList2.toArray(hVarArr3);
        c5.f[] fVarArr = new c5.f[arrayList3.size()];
        this.B = fVarArr;
        arrayList3.toArray(fVarArr);
        i iVar = this.t;
        h<com.google.android.exoplayer2.source.dash.a>[] hVarArr4 = this.A;
        iVar.getClass();
        this.C = new v(hVarArr4);
        return j10;
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        return this.C.isLoading();
    }

    @Override // z4.r
    public final void j() {
        this.f2596p.a();
    }

    @Override // z4.r
    public final long l(long j10) {
        for (h<com.google.android.exoplayer2.source.dash.a> hVar : this.A) {
            hVar.B(j10);
        }
        for (c5.f fVar : this.B) {
            fVar.c(j10);
        }
        return j10;
    }

    @Override // z4.r
    public final void n(r.a aVar, long j10) {
        this.f2605z = aVar;
        aVar.b(this);
    }

    @Override // z4.r
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // z4.r
    public final j0 q() {
        return this.f2598r;
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        for (h<com.google.android.exoplayer2.source.dash.a> hVar : this.A) {
            hVar.s(j10, z10);
        }
    }
}
