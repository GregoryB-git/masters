package z4;

import v3.o0;
import v3.r1;
import z4.t;

/* loaded from: classes.dex */
public final class p extends l0 {
    public boolean A;
    public final boolean t;

    /* renamed from: u, reason: collision with root package name */
    public final r1.c f17709u;

    /* renamed from: v, reason: collision with root package name */
    public final r1.b f17710v;

    /* renamed from: w, reason: collision with root package name */
    public a f17711w;

    /* renamed from: x, reason: collision with root package name */
    public o f17712x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f17713y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17714z;

    public static final class a extends l {

        /* renamed from: e, reason: collision with root package name */
        public static final Object f17715e = new Object();

        /* renamed from: c, reason: collision with root package name */
        public final Object f17716c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f17717d;

        public a(r1 r1Var, Object obj, Object obj2) {
            super(r1Var);
            this.f17716c = obj;
            this.f17717d = obj2;
        }

        @Override // z4.l, v3.r1
        public final int b(Object obj) {
            Object obj2;
            r1 r1Var = this.f17694b;
            if (f17715e.equals(obj) && (obj2 = this.f17717d) != null) {
                obj = obj2;
            }
            return r1Var.b(obj);
        }

        @Override // v3.r1
        public final r1.b f(int i10, r1.b bVar, boolean z10) {
            this.f17694b.f(i10, bVar, z10);
            if (v5.e0.a(bVar.f15749b, this.f17717d) && z10) {
                bVar.f15749b = f17715e;
            }
            return bVar;
        }

        @Override // z4.l, v3.r1
        public final Object l(int i10) {
            Object l10 = this.f17694b.l(i10);
            return v5.e0.a(l10, this.f17717d) ? f17715e : l10;
        }

        @Override // v3.r1
        public final r1.c n(int i10, r1.c cVar, long j10) {
            this.f17694b.n(i10, cVar, j10);
            if (v5.e0.a(cVar.f15755a, this.f17716c)) {
                cVar.f15755a = r1.c.f15754z;
            }
            return cVar;
        }
    }

    public static final class b extends r1 {

        /* renamed from: b, reason: collision with root package name */
        public final o0 f17718b;

        public b(o0 o0Var) {
            this.f17718b = o0Var;
        }

        @Override // v3.r1
        public final int b(Object obj) {
            return obj == a.f17715e ? 0 : -1;
        }

        @Override // v3.r1
        public final r1.b f(int i10, r1.b bVar, boolean z10) {
            bVar.h(z10 ? 0 : null, z10 ? a.f17715e : null, 0, -9223372036854775807L, 0L, a5.a.f208o, true);
            return bVar;
        }

        @Override // v3.r1
        public final int h() {
            return 1;
        }

        @Override // v3.r1
        public final Object l(int i10) {
            return a.f17715e;
        }

        @Override // v3.r1
        public final r1.c n(int i10, r1.c cVar, long j10) {
            cVar.b(r1.c.f15754z, this.f17718b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.t = true;
            return cVar;
        }

        @Override // v3.r1
        public final int o() {
            return 1;
        }
    }

    public p(t tVar, boolean z10) {
        super(tVar);
        this.t = z10 && tVar.i();
        this.f17709u = new r1.c();
        this.f17710v = new r1.b();
        r1 j10 = tVar.j();
        if (j10 == null) {
            this.f17711w = new a(new b(tVar.f()), r1.c.f15754z, a.f17715e);
        } else {
            this.f17711w = new a(j10, null, null);
            this.A = true;
        }
    }

    @Override // z4.l0
    public final t.b C(t.b bVar) {
        Object obj = bVar.f17725a;
        Object obj2 = this.f17711w.f17717d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f17715e;
        }
        return bVar.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ce  */
    @Override // z4.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(v3.r1 r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.p.D(v3.r1):void");
    }

    @Override // z4.l0
    public final void E() {
        if (this.t) {
            return;
        }
        this.f17713y = true;
        B(null, this.f17695s);
    }

    @Override // z4.t
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final o o(t.b bVar, t5.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        t tVar = this.f17695s;
        x6.b.H(oVar.f17706d == null);
        oVar.f17706d = tVar;
        if (this.f17714z) {
            Object obj = bVar.f17725a;
            if (this.f17711w.f17717d != null && obj.equals(a.f17715e)) {
                obj = this.f17711w.f17717d;
            }
            t.b b10 = bVar.b(obj);
            long f = oVar.f(j10);
            t tVar2 = oVar.f17706d;
            tVar2.getClass();
            r o10 = tVar2.o(b10, bVar2, f);
            oVar.f17707e = o10;
            if (oVar.f != null) {
                o10.n(oVar, f);
            }
        } else {
            this.f17712x = oVar;
            if (!this.f17713y) {
                this.f17713y = true;
                B(null, this.f17695s);
            }
        }
        return oVar;
    }

    public final void G(long j10) {
        o oVar = this.f17712x;
        int b10 = this.f17711w.b(oVar.f17703a.f17725a);
        if (b10 == -1) {
            return;
        }
        a aVar = this.f17711w;
        r1.b bVar = this.f17710v;
        aVar.f(b10, bVar, false);
        long j11 = bVar.f15751d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.f17708o = j10;
    }

    @Override // z4.t
    public final void g(r rVar) {
        o oVar = (o) rVar;
        if (oVar.f17707e != null) {
            t tVar = oVar.f17706d;
            tVar.getClass();
            tVar.g(oVar.f17707e);
        }
        if (rVar == this.f17712x) {
            this.f17712x = null;
        }
    }

    @Override // z4.f, z4.t
    public final void h() {
    }

    @Override // z4.f, z4.a
    public final void w() {
        this.f17714z = false;
        this.f17713y = false;
        super.w();
    }
}
