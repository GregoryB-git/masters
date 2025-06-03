package b5;

import android.util.SparseArray;
import b5.f;
import c4.s;
import c4.t;
import c4.v;
import v3.i0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class d implements c4.j, f {

    /* renamed from: r, reason: collision with root package name */
    public static final s f1847r;

    /* renamed from: a, reason: collision with root package name */
    public final c4.h f1848a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1849b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f1850c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<a> f1851d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1852e;
    public f.a f;

    /* renamed from: o, reason: collision with root package name */
    public long f1853o;

    /* renamed from: p, reason: collision with root package name */
    public t f1854p;

    /* renamed from: q, reason: collision with root package name */
    public i0[] f1855q;

    public static final class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final int f1856a;

        /* renamed from: b, reason: collision with root package name */
        public final i0 f1857b;

        /* renamed from: c, reason: collision with root package name */
        public final c4.g f1858c = new c4.g();

        /* renamed from: d, reason: collision with root package name */
        public i0 f1859d;

        /* renamed from: e, reason: collision with root package name */
        public v f1860e;
        public long f;

        public a(int i10, int i11, i0 i0Var) {
            this.f1856a = i11;
            this.f1857b = i0Var;
        }

        @Override // c4.v
        public final void a(int i10, u uVar) {
            v vVar = this.f1860e;
            int i11 = e0.f15881a;
            vVar.b(i10, uVar);
        }

        @Override // c4.v
        public final void b(int i10, u uVar) {
            a(i10, uVar);
        }

        @Override // c4.v
        public final void c(long j10, int i10, int i11, int i12, v.a aVar) {
            long j11 = this.f;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f1860e = this.f1858c;
            }
            v vVar = this.f1860e;
            int i13 = e0.f15881a;
            vVar.c(j10, i10, i11, i12, aVar);
        }

        @Override // c4.v
        public final void d(i0 i0Var) {
            i0 i0Var2 = this.f1857b;
            if (i0Var2 != null) {
                i0Var = i0Var.d(i0Var2);
            }
            this.f1859d = i0Var;
            v vVar = this.f1860e;
            int i10 = e0.f15881a;
            vVar.d(i0Var);
        }

        @Override // c4.v
        public final int e(t5.h hVar, int i10, boolean z10) {
            return g(hVar, i10, z10);
        }

        public final void f(f.a aVar, long j10) {
            if (aVar == null) {
                this.f1860e = this.f1858c;
                return;
            }
            this.f = j10;
            v a10 = ((c) aVar).a(this.f1856a);
            this.f1860e = a10;
            i0 i0Var = this.f1859d;
            if (i0Var != null) {
                a10.d(i0Var);
            }
        }

        public final int g(t5.h hVar, int i10, boolean z10) {
            v vVar = this.f1860e;
            int i11 = e0.f15881a;
            return vVar.e(hVar, i10, z10);
        }
    }

    static {
        new e0.e(15);
        f1847r = new s();
    }

    public d(c4.h hVar, int i10, i0 i0Var) {
        this.f1848a = hVar;
        this.f1849b = i10;
        this.f1850c = i0Var;
    }

    public final void a(f.a aVar, long j10, long j11) {
        this.f = aVar;
        this.f1853o = j11;
        if (!this.f1852e) {
            this.f1848a.b(this);
            if (j10 != -9223372036854775807L) {
                this.f1848a.f(0L, j10);
            }
            this.f1852e = true;
            return;
        }
        c4.h hVar = this.f1848a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        hVar.f(0L, j10);
        for (int i10 = 0; i10 < this.f1851d.size(); i10++) {
            this.f1851d.valueAt(i10).f(aVar, j11);
        }
    }

    @Override // c4.j
    public final void m() {
        i0[] i0VarArr = new i0[this.f1851d.size()];
        for (int i10 = 0; i10 < this.f1851d.size(); i10++) {
            i0 i0Var = this.f1851d.valueAt(i10).f1859d;
            x6.b.K(i0Var);
            i0VarArr[i10] = i0Var;
        }
        this.f1855q = i0VarArr;
    }

    @Override // c4.j
    public final v r(int i10, int i11) {
        a aVar = this.f1851d.get(i10);
        if (aVar == null) {
            x6.b.H(this.f1855q == null);
            aVar = new a(i10, i11, i11 == this.f1849b ? this.f1850c : null);
            aVar.f(this.f, this.f1853o);
            this.f1851d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // c4.j
    public final void t(t tVar) {
        this.f1854p = tVar;
    }
}
