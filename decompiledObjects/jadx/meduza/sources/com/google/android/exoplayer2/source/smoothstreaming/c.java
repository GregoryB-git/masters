package com.google.android.exoplayer2.source.smoothstreaming;

import a4.g;
import b1.v;
import b5.h;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import g5.a;
import java.util.ArrayList;
import t5.c0;
import t5.e0;
import t5.l0;
import v3.n1;
import z4.d0;
import z4.i;
import z4.i0;
import z4.j0;
import z4.r;
import z4.w;

/* loaded from: classes.dex */
public final class c implements r, d0.a<h<b>> {

    /* renamed from: a, reason: collision with root package name */
    public final b.a f2688a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f2689b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f2690c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.h f2691d;

    /* renamed from: e, reason: collision with root package name */
    public final g.a f2692e;
    public final c0 f;

    /* renamed from: o, reason: collision with root package name */
    public final w.a f2693o;

    /* renamed from: p, reason: collision with root package name */
    public final t5.b f2694p;

    /* renamed from: q, reason: collision with root package name */
    public final j0 f2695q;

    /* renamed from: r, reason: collision with root package name */
    public final i f2696r;

    /* renamed from: s, reason: collision with root package name */
    public r.a f2697s;
    public g5.a t;

    /* renamed from: u, reason: collision with root package name */
    public h<b>[] f2698u;

    /* renamed from: v, reason: collision with root package name */
    public v f2699v;

    public c(g5.a aVar, b.a aVar2, l0 l0Var, i iVar, a4.h hVar, g.a aVar3, c0 c0Var, w.a aVar4, e0 e0Var, t5.b bVar) {
        this.t = aVar;
        this.f2688a = aVar2;
        this.f2689b = l0Var;
        this.f2690c = e0Var;
        this.f2691d = hVar;
        this.f2692e = aVar3;
        this.f = c0Var;
        this.f2693o = aVar4;
        this.f2694p = bVar;
        this.f2696r = iVar;
        i0[] i0VarArr = new i0[aVar.f.length];
        int i10 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f;
            if (i10 >= bVarArr.length) {
                this.f2695q = new j0(i0VarArr);
                h<b>[] hVarArr = new h[0];
                this.f2698u = hVarArr;
                iVar.getClass();
                this.f2699v = new v(hVarArr);
                return;
            }
            v3.i0[] i0VarArr2 = bVarArr[i10].f5862j;
            v3.i0[] i0VarArr3 = new v3.i0[i0VarArr2.length];
            for (int i11 = 0; i11 < i0VarArr2.length; i11++) {
                v3.i0 i0Var = i0VarArr2[i11];
                i0VarArr3[i11] = i0Var.b(hVar.e(i0Var));
            }
            i0VarArr[i10] = new i0(Integer.toString(i10), i0VarArr3);
            i10++;
        }
    }

    @Override // z4.d0.a
    public final void a(h<b> hVar) {
        this.f2697s.a(this);
    }

    @Override // z4.r, z4.d0
    public final long c() {
        return this.f2699v.c();
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        return this.f2699v.d(j10);
    }

    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        for (h<b> hVar : this.f2698u) {
            if (hVar.f1871a == 2) {
                return hVar.f1875e.e(j10, n1Var);
            }
        }
        return j10;
    }

    @Override // z4.r, z4.d0
    public final long g() {
        return this.f2699v.g();
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
        this.f2699v.h(j10);
    }

    @Override // z4.r
    public final long i(r5.h[] hVarArr, boolean[] zArr, z4.c0[] c0VarArr, boolean[] zArr2, long j10) {
        int i10;
        r5.h hVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < hVarArr.length) {
            z4.c0 c0Var = c0VarArr[i11];
            if (c0Var != null) {
                h hVar2 = (h) c0Var;
                r5.h hVar3 = hVarArr[i11];
                if (hVar3 == null || !zArr[i11]) {
                    hVar2.A(null);
                    c0VarArr[i11] = null;
                } else {
                    ((b) hVar2.f1875e).b(hVar3);
                    arrayList.add(hVar2);
                }
            }
            if (c0VarArr[i11] != null || (hVar = hVarArr[i11]) == null) {
                i10 = i11;
            } else {
                int b10 = this.f2695q.b(hVar.a());
                i10 = i11;
                h hVar4 = new h(this.t.f[b10].f5854a, null, null, this.f2688a.a(this.f2690c, this.t, b10, hVar, this.f2689b), this, this.f2694p, j10, this.f2691d, this.f2692e, this.f, this.f2693o);
                arrayList.add(hVar4);
                c0VarArr[i10] = hVar4;
                zArr2[i10] = true;
            }
            i11 = i10 + 1;
        }
        h<b>[] hVarArr2 = new h[arrayList.size()];
        this.f2698u = hVarArr2;
        arrayList.toArray(hVarArr2);
        i iVar = this.f2696r;
        h<b>[] hVarArr3 = this.f2698u;
        iVar.getClass();
        this.f2699v = new v(hVarArr3);
        return j10;
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        return this.f2699v.isLoading();
    }

    @Override // z4.r
    public final void j() {
        this.f2690c.a();
    }

    @Override // z4.r
    public final long l(long j10) {
        for (h<b> hVar : this.f2698u) {
            hVar.B(j10);
        }
        return j10;
    }

    @Override // z4.r
    public final void n(r.a aVar, long j10) {
        this.f2697s = aVar;
        aVar.b(this);
    }

    @Override // z4.r
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // z4.r
    public final j0 q() {
        return this.f2695q;
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        for (h<b> hVar : this.f2698u) {
            hVar.s(j10, z10);
        }
    }
}
