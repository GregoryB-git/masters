package e5;

import a4.g;
import android.net.Uri;
import android.util.SparseArray;
import b1.v;
import d2.h0;
import e5.n;
import f5.e;
import f5.j;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p2.m0;
import t5.c0;
import t5.l0;
import v3.a1;
import v3.i0;
import v3.n1;
import v5.e0;
import w3.a0;
import z4.d0;
import z4.i0;
import z4.j0;
import z4.r;
import z4.w;

/* loaded from: classes.dex */
public final class l implements r, j.a {
    public int A;
    public j0 B;
    public n[] C;
    public n[] D;
    public int E;
    public v F;

    /* renamed from: a, reason: collision with root package name */
    public final i f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final f5.j f3990b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3991c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f3992d;

    /* renamed from: e, reason: collision with root package name */
    public final a4.h f3993e;
    public final g.a f;

    /* renamed from: o, reason: collision with root package name */
    public final c0 f3994o;

    /* renamed from: p, reason: collision with root package name */
    public final w.a f3995p;

    /* renamed from: q, reason: collision with root package name */
    public final t5.b f3996q;

    /* renamed from: r, reason: collision with root package name */
    public final IdentityHashMap<z4.c0, Integer> f3997r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f3998s;
    public final z4.i t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f3999u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4000v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f4001w;

    /* renamed from: x, reason: collision with root package name */
    public final a0 f4002x;

    /* renamed from: y, reason: collision with root package name */
    public final a f4003y = new a();

    /* renamed from: z, reason: collision with root package name */
    public r.a f4004z;

    public class a implements n.a {
        public a() {
        }

        @Override // z4.d0.a
        public final void a(n nVar) {
            l lVar = l.this;
            lVar.f4004z.a(lVar);
        }

        public final void c() {
            l lVar = l.this;
            int i10 = lVar.A - 1;
            lVar.A = i10;
            if (i10 > 0) {
                return;
            }
            int i11 = 0;
            for (n nVar : lVar.C) {
                nVar.b();
                i11 += nVar.Q.f17691a;
            }
            i0[] i0VarArr = new i0[i11];
            int i12 = 0;
            for (n nVar2 : l.this.C) {
                nVar2.b();
                int i13 = nVar2.Q.f17691a;
                int i14 = 0;
                while (i14 < i13) {
                    nVar2.b();
                    i0VarArr[i12] = nVar2.Q.a(i14);
                    i14++;
                    i12++;
                }
            }
            l.this.B = new j0(i0VarArr);
            l lVar2 = l.this;
            lVar2.f4004z.b(lVar2);
        }
    }

    public l(i iVar, f5.j jVar, h hVar, l0 l0Var, a4.h hVar2, g.a aVar, c0 c0Var, w.a aVar2, t5.b bVar, z4.i iVar2, boolean z10, int i10, boolean z11, a0 a0Var) {
        this.f3989a = iVar;
        this.f3990b = jVar;
        this.f3991c = hVar;
        this.f3992d = l0Var;
        this.f3993e = hVar2;
        this.f = aVar;
        this.f3994o = c0Var;
        this.f3995p = aVar2;
        this.f3996q = bVar;
        this.t = iVar2;
        this.f3999u = z10;
        this.f4000v = i10;
        this.f4001w = z11;
        this.f4002x = a0Var;
        iVar2.getClass();
        this.F = new v(new d0[0]);
        this.f3997r = new IdentityHashMap<>();
        this.f3998s = new h0(3);
        this.C = new n[0];
        this.D = new n[0];
    }

    public static v3.i0 k(v3.i0 i0Var, v3.i0 i0Var2, boolean z10) {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        p4.a aVar;
        int i12;
        if (i0Var2 != null) {
            str2 = i0Var2.f15454q;
            aVar = i0Var2.f15455r;
            int i13 = i0Var2.G;
            i10 = i0Var2.f15450d;
            int i14 = i0Var2.f15451e;
            String str4 = i0Var2.f15449c;
            str3 = i0Var2.f15448b;
            i11 = i13;
            i12 = i14;
            str = str4;
        } else {
            String q10 = e0.q(1, i0Var.f15454q);
            p4.a aVar2 = i0Var.f15455r;
            if (z10) {
                int i15 = i0Var.G;
                int i16 = i0Var.f15450d;
                int i17 = i0Var.f15451e;
                str = i0Var.f15449c;
                str2 = q10;
                str3 = i0Var.f15448b;
                i11 = i15;
                i10 = i16;
                aVar = aVar2;
                i12 = i17;
            } else {
                str = null;
                i10 = 0;
                i11 = -1;
                str2 = q10;
                str3 = null;
                aVar = aVar2;
                i12 = 0;
            }
        }
        String e10 = v5.p.e(str2);
        int i18 = z10 ? i0Var.f : -1;
        int i19 = z10 ? i0Var.f15452o : -1;
        i0.a aVar3 = new i0.a();
        aVar3.f15463a = i0Var.f15447a;
        aVar3.f15464b = str3;
        aVar3.f15471j = i0Var.f15456s;
        aVar3.f15472k = e10;
        aVar3.f15469h = str2;
        aVar3.f15470i = aVar;
        aVar3.f = i18;
        aVar3.f15468g = i19;
        aVar3.f15484x = i11;
        aVar3.f15466d = i10;
        aVar3.f15467e = i12;
        aVar3.f15465c = str;
        return aVar3.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056 A[SYNTHETIC] */
    @Override // f5.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.net.Uri r17, t5.c0.c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            e5.n[] r2 = r0.C
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto L94
            r8 = r2[r6]
            e5.g r9 = r8.f4016d
            android.net.Uri[] r9 = r9.f3949e
            boolean r9 = v5.e0.k(r1, r9)
            if (r9 != 0) goto L1b
            r13 = r18
            goto L8c
        L1b:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3e
            t5.c0 r11 = r8.f4023q
            e5.g r12 = r8.f4016d
            r5.h r12 = r12.f3960q
            t5.c0$a r12 = r5.n.a(r12)
            t5.u r11 = (t5.u) r11
            r13 = r18
            t5.c0$b r11 = r11.a(r12, r13)
            if (r11 == 0) goto L40
            int r12 = r11.f14459a
            r14 = 2
            if (r12 != r14) goto L40
            long r11 = r11.f14460b
            goto L41
        L3e:
            r13 = r18
        L40:
            r11 = r9
        L41:
            e5.g r8 = r8.f4016d
            r14 = 0
        L44:
            android.net.Uri[] r15 = r8.f3949e
            int r4 = r15.length
            r5 = -1
            if (r14 >= r4) goto L56
            r4 = r15[r14]
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L53
            goto L57
        L53:
            int r14 = r14 + 1
            goto L44
        L56:
            r14 = r5
        L57:
            if (r14 != r5) goto L5a
            goto L85
        L5a:
            r5.h r4 = r8.f3960q
            int r4 = r4.f(r14)
            if (r4 != r5) goto L63
            goto L85
        L63:
            boolean r5 = r8.f3962s
            android.net.Uri r14 = r8.f3958o
            boolean r14 = r1.equals(r14)
            r5 = r5 | r14
            r8.f3962s = r5
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 == 0) goto L85
            r5.h r5 = r8.f3960q
            boolean r4 = r5.k(r4, r11)
            if (r4 == 0) goto L83
            f5.j r4 = r8.f3950g
            boolean r4 = r4.i(r1, r11)
            if (r4 == 0) goto L83
            goto L85
        L83:
            r4 = 0
            goto L86
        L85:
            r4 = 1
        L86:
            if (r4 == 0) goto L8e
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 == 0) goto L8e
        L8c:
            r4 = 1
            goto L8f
        L8e:
            r4 = 0
        L8f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        L94:
            z4.r$a r1 = r0.f4004z
            r1.a(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.l.a(android.net.Uri, t5.c0$c, boolean):boolean");
    }

    public final n b(String str, int i10, Uri[] uriArr, v3.i0[] i0VarArr, v3.i0 i0Var, List<v3.i0> list, Map<String, a4.d> map, long j10) {
        return new n(str, i10, this.f4003y, new g(this.f3989a, this.f3990b, uriArr, i0VarArr, this.f3991c, this.f3992d, this.f3998s, list, this.f4002x), map, this.f3996q, j10, i0Var, this.f3993e, this.f, this.f3994o, this.f3995p, this.f4000v);
    }

    @Override // z4.r, z4.d0
    public final long c() {
        return this.F.c();
    }

    @Override // z4.r, z4.d0
    public final boolean d(long j10) {
        if (this.B != null) {
            return this.F.d(j10);
        }
        for (n nVar : this.C) {
            if (!nVar.L) {
                nVar.d(nVar.X);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z4.r
    public final long e(long j10, n1 n1Var) {
        n[] nVarArr = this.D;
        int length = nVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            n nVar = nVarArr[i10];
            if (nVar.I == 2) {
                g gVar = nVar.f4016d;
                int i11 = gVar.f3960q.i();
                Uri[] uriArr = gVar.f3949e;
                f5.e m10 = (i11 >= uriArr.length || i11 == -1) ? null : gVar.f3950g.m(true, uriArr[gVar.f3960q.o()]);
                if (m10 != null && !m10.f5386r.isEmpty() && m10.f5430c) {
                    long e10 = m10.f5376h - gVar.f3950g.e();
                    long j11 = j10 - e10;
                    int c10 = e0.c(m10.f5386r, Long.valueOf(j11), true);
                    long j12 = ((e.c) m10.f5386r.get(c10)).f5399e;
                    return n1Var.a(j11, j12, c10 != m10.f5386r.size() - 1 ? ((e.c) m10.f5386r.get(c10 + 1)).f5399e : j12) + e10;
                }
            } else {
                i10++;
            }
        }
        return j10;
    }

    @Override // f5.j.a
    public final void f() {
        for (n nVar : this.C) {
            if (!nVar.f4027v.isEmpty()) {
                j jVar = (j) m0.K(nVar.f4027v);
                int b10 = nVar.f4016d.b(jVar);
                if (b10 == 1) {
                    jVar.K = true;
                } else if (b10 == 2 && !nVar.f4013b0 && nVar.f4024r.d()) {
                    nVar.f4024r.b();
                }
            }
        }
        this.f4004z.a(this);
    }

    @Override // z4.r, z4.d0
    public final long g() {
        return this.F.g();
    }

    @Override // z4.r, z4.d0
    public final void h(long j10) {
        this.F.h(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01e6  */
    @Override // z4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long i(r5.h[] r30, boolean[] r31, z4.c0[] r32, boolean[] r33, long r34) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.l.i(r5.h[], boolean[], z4.c0[], boolean[], long):long");
    }

    @Override // z4.r, z4.d0
    public final boolean isLoading() {
        return this.F.isLoading();
    }

    @Override // z4.r
    public final void j() {
        for (n nVar : this.C) {
            nVar.D();
            if (nVar.f4013b0 && !nVar.L) {
                throw a1.a("Loading finished before preparation is complete.", null);
            }
        }
    }

    @Override // z4.r
    public final long l(long j10) {
        n[] nVarArr = this.D;
        if (nVarArr.length > 0) {
            boolean G = nVarArr[0].G(j10, false);
            int i10 = 1;
            while (true) {
                n[] nVarArr2 = this.D;
                if (i10 >= nVarArr2.length) {
                    break;
                }
                nVarArr2[i10].G(j10, G);
                i10++;
            }
            if (G) {
                ((SparseArray) this.f3998s.f3363b).clear();
            }
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ae  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.util.HashMap] */
    @Override // z4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(z4.r.a r26, long r27) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.l.n(z4.r$a, long):void");
    }

    @Override // z4.r
    public final long o() {
        return -9223372036854775807L;
    }

    @Override // z4.r
    public final j0 q() {
        j0 j0Var = this.B;
        j0Var.getClass();
        return j0Var;
    }

    @Override // z4.r
    public final void s(long j10, boolean z10) {
        for (n nVar : this.D) {
            if (nVar.K && !nVar.B()) {
                int length = nVar.D.length;
                for (int i10 = 0; i10 < length; i10++) {
                    nVar.D[i10].g(j10, z10, nVar.V[i10]);
                }
            }
        }
    }
}
