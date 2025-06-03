package v3;

import android.util.Pair;
import v3.z0;
import z4.t;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final z4.r f15699a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15700b;

    /* renamed from: c, reason: collision with root package name */
    public final z4.c0[] f15701c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15702d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15703e;
    public r0 f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15704g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f15705h;

    /* renamed from: i, reason: collision with root package name */
    public final k1[] f15706i;

    /* renamed from: j, reason: collision with root package name */
    public final r5.o f15707j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f15708k;

    /* renamed from: l, reason: collision with root package name */
    public q0 f15709l;

    /* renamed from: m, reason: collision with root package name */
    public z4.j0 f15710m;

    /* renamed from: n, reason: collision with root package name */
    public r5.p f15711n;

    /* renamed from: o, reason: collision with root package name */
    public long f15712o;

    public q0(k1[] k1VarArr, long j10, r5.o oVar, t5.b bVar, z0 z0Var, r0 r0Var, r5.p pVar) {
        this.f15706i = k1VarArr;
        this.f15712o = j10;
        this.f15707j = oVar;
        this.f15708k = z0Var;
        t.b bVar2 = r0Var.f15735a;
        this.f15700b = bVar2.f17725a;
        this.f = r0Var;
        this.f15710m = z4.j0.f17689d;
        this.f15711n = pVar;
        this.f15701c = new z4.c0[k1VarArr.length];
        this.f15705h = new boolean[k1VarArr.length];
        long j11 = r0Var.f15736b;
        long j12 = r0Var.f15738d;
        z0Var.getClass();
        Object obj = bVar2.f17725a;
        int i10 = a.f15231e;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        t.b b10 = bVar2.b(pair.second);
        z0.c cVar = (z0.c) z0Var.f15827d.get(obj2);
        cVar.getClass();
        z0Var.f15829g.add(cVar);
        z0.b bVar3 = z0Var.f.get(cVar);
        if (bVar3 != null) {
            bVar3.f15837a.b(bVar3.f15838b);
        }
        cVar.f15842c.add(b10);
        z4.r o10 = cVar.f15840a.o(b10, bVar, j11);
        z0Var.f15826c.put(o10, cVar);
        z0Var.d();
        this.f15699a = j12 != -9223372036854775807L ? new z4.c(o10, true, 0L, j12) : o10;
    }

    public final long a(r5.p pVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= pVar.f13775a) {
                break;
            }
            boolean[] zArr2 = this.f15705h;
            if (z10 || !pVar.a(this.f15711n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        z4.c0[] c0VarArr = this.f15701c;
        int i11 = 0;
        while (true) {
            k1[] k1VarArr = this.f15706i;
            if (i11 >= k1VarArr.length) {
                break;
            }
            if (((f) k1VarArr[i11]).f15330a == -2) {
                c0VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f15711n = pVar;
        c();
        long i12 = this.f15699a.i(pVar.f13777c, this.f15705h, this.f15701c, zArr, j10);
        z4.c0[] c0VarArr2 = this.f15701c;
        int i13 = 0;
        while (true) {
            k1[] k1VarArr2 = this.f15706i;
            if (i13 >= k1VarArr2.length) {
                break;
            }
            if (((f) k1VarArr2[i13]).f15330a == -2 && this.f15711n.b(i13)) {
                c0VarArr2[i13] = new z4.k();
            }
            i13++;
        }
        this.f15703e = false;
        int i14 = 0;
        while (true) {
            z4.c0[] c0VarArr3 = this.f15701c;
            if (i14 >= c0VarArr3.length) {
                return i12;
            }
            if (c0VarArr3[i14] != null) {
                x6.b.H(pVar.b(i14));
                if (((f) this.f15706i[i14]).f15330a != -2) {
                    this.f15703e = true;
                }
            } else {
                x6.b.H(pVar.f13777c[i14] == null);
            }
            i14++;
        }
    }

    public final void b() {
        int i10 = 0;
        if (!(this.f15709l == null)) {
            return;
        }
        while (true) {
            r5.p pVar = this.f15711n;
            if (i10 >= pVar.f13775a) {
                return;
            }
            boolean b10 = pVar.b(i10);
            r5.h hVar = this.f15711n.f13777c[i10];
            if (b10 && hVar != null) {
                hVar.g();
            }
            i10++;
        }
    }

    public final void c() {
        int i10 = 0;
        if (!(this.f15709l == null)) {
            return;
        }
        while (true) {
            r5.p pVar = this.f15711n;
            if (i10 >= pVar.f13775a) {
                return;
            }
            boolean b10 = pVar.b(i10);
            r5.h hVar = this.f15711n.f13777c[i10];
            if (b10 && hVar != null) {
                hVar.m();
            }
            i10++;
        }
    }

    public final long d() {
        if (!this.f15702d) {
            return this.f.f15736b;
        }
        long g10 = this.f15703e ? this.f15699a.g() : Long.MIN_VALUE;
        return g10 == Long.MIN_VALUE ? this.f.f15739e : g10;
    }

    public final long e() {
        return this.f.f15736b + this.f15712o;
    }

    public final void f() {
        b();
        z0 z0Var = this.f15708k;
        z4.r rVar = this.f15699a;
        try {
            if (rVar instanceof z4.c) {
                rVar = ((z4.c) rVar).f17600a;
            }
            z0.c remove = z0Var.f15826c.remove(rVar);
            remove.getClass();
            remove.f15840a.g(rVar);
            remove.f15842c.remove(((z4.o) rVar).f17703a);
            if (!z0Var.f15826c.isEmpty()) {
                z0Var.d();
            }
            z0Var.e(remove);
        } catch (RuntimeException e10) {
            v5.m.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public final r5.p g(float f, r1 r1Var) {
        r5.o oVar = this.f15707j;
        k1[] k1VarArr = this.f15706i;
        z4.j0 j0Var = this.f15710m;
        t.b bVar = this.f.f15735a;
        r5.p c10 = oVar.c(k1VarArr, j0Var);
        for (r5.h hVar : c10.f13777c) {
            if (hVar != null) {
                hVar.r(f);
            }
        }
        return c10;
    }

    public final void h() {
        z4.r rVar = this.f15699a;
        if (rVar instanceof z4.c) {
            long j10 = this.f.f15738d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            z4.c cVar = (z4.c) rVar;
            cVar.f17604e = 0L;
            cVar.f = j10;
        }
    }
}
