package L0;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.M;
import F0.r;
import android.net.Uri;
import g0.AbstractC1297a;
import g0.z;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC0378x f3296q = new InterfaceC0378x() { // from class: L0.b
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] j7;
            j7 = c.j();
            return j7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0374t f3302f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3304h;

    /* renamed from: i, reason: collision with root package name */
    public long f3305i;

    /* renamed from: j, reason: collision with root package name */
    public int f3306j;

    /* renamed from: k, reason: collision with root package name */
    public int f3307k;

    /* renamed from: l, reason: collision with root package name */
    public int f3308l;

    /* renamed from: m, reason: collision with root package name */
    public long f3309m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3310n;

    /* renamed from: o, reason: collision with root package name */
    public a f3311o;

    /* renamed from: p, reason: collision with root package name */
    public f f3312p;

    /* renamed from: a, reason: collision with root package name */
    public final z f3297a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final z f3298b = new z(9);

    /* renamed from: c, reason: collision with root package name */
    public final z f3299c = new z(11);

    /* renamed from: d, reason: collision with root package name */
    public final z f3300d = new z();

    /* renamed from: e, reason: collision with root package name */
    public final d f3301e = new d();

    /* renamed from: g, reason: collision with root package name */
    public int f3303g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] j() {
        return new r[]{new c()};
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        if (j7 == 0) {
            this.f3303g = 1;
            this.f3304h = false;
        } else {
            this.f3303g = 3;
        }
        this.f3306j = 0;
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f3302f = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.n(this.f3297a.e(), 0, 3);
        this.f3297a.T(0);
        if (this.f3297a.J() != 4607062) {
            return false;
        }
        interfaceC0373s.n(this.f3297a.e(), 0, 2);
        this.f3297a.T(0);
        if ((this.f3297a.M() & 250) != 0) {
            return false;
        }
        interfaceC0373s.n(this.f3297a.e(), 0, 4);
        this.f3297a.T(0);
        int p7 = this.f3297a.p();
        interfaceC0373s.h();
        interfaceC0373s.o(p7);
        interfaceC0373s.n(this.f3297a.e(), 0, 4);
        this.f3297a.T(0);
        return this.f3297a.p() == 0;
    }

    public final void f() {
        if (this.f3310n) {
            return;
        }
        this.f3302f.e(new M.b(-9223372036854775807L));
        this.f3310n = true;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    public final long h() {
        if (this.f3304h) {
            return this.f3305i + this.f3309m;
        }
        if (this.f3301e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f3309m;
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        AbstractC1297a.h(this.f3302f);
        while (true) {
            int i7 = this.f3303g;
            if (i7 != 1) {
                if (i7 == 2) {
                    o(interfaceC0373s);
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m(interfaceC0373s)) {
                        return 0;
                    }
                } else if (!n(interfaceC0373s)) {
                    return -1;
                }
            } else if (!l(interfaceC0373s)) {
                return -1;
            }
        }
    }

    public final z k(InterfaceC0373s interfaceC0373s) {
        if (this.f3308l > this.f3300d.b()) {
            z zVar = this.f3300d;
            zVar.R(new byte[Math.max(zVar.b() * 2, this.f3308l)], 0);
        } else {
            this.f3300d.T(0);
        }
        this.f3300d.S(this.f3308l);
        interfaceC0373s.readFully(this.f3300d.e(), 0, this.f3308l);
        return this.f3300d;
    }

    public final boolean l(InterfaceC0373s interfaceC0373s) {
        if (!interfaceC0373s.d(this.f3298b.e(), 0, 9, true)) {
            return false;
        }
        this.f3298b.T(0);
        this.f3298b.U(4);
        int G6 = this.f3298b.G();
        boolean z7 = (G6 & 4) != 0;
        boolean z8 = (G6 & 1) != 0;
        if (z7 && this.f3311o == null) {
            this.f3311o = new a(this.f3302f.a(8, 1));
        }
        if (z8 && this.f3312p == null) {
            this.f3312p = new f(this.f3302f.a(9, 2));
        }
        this.f3302f.j();
        this.f3306j = this.f3298b.p() - 5;
        this.f3303g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(F0.InterfaceC0373s r10) {
        /*
            r9 = this;
            long r0 = r9.h()
            int r2 = r9.f3307k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            L0.a r3 = r9.f3311o
            if (r3 == 0) goto L23
            r9.f()
            L0.a r2 = r9.f3311o
        L19:
            g0.z r10 = r9.k(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L6d
        L23:
            r3 = 9
            if (r2 != r3) goto L31
            L0.f r3 = r9.f3312p
            if (r3 == 0) goto L31
            r9.f()
            L0.f r2 = r9.f3312p
            goto L19
        L31:
            r3 = 18
            if (r2 != r3) goto L66
            boolean r2 = r9.f3310n
            if (r2 != 0) goto L66
            L0.d r2 = r9.f3301e
            g0.z r10 = r9.k(r10)
            boolean r10 = r2.a(r10, r0)
            L0.d r0 = r9.f3301e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            F0.t r2 = r9.f3302f
            F0.H r3 = new F0.H
            L0.d r7 = r9.f3301e
            long[] r7 = r7.e()
            L0.d r8 = r9.f3301e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.e(r3)
            r9.f3310n = r6
            goto L21
        L66:
            int r0 = r9.f3308l
            r10.i(r0)
            r10 = 0
            r0 = r10
        L6d:
            boolean r1 = r9.f3304h
            if (r1 != 0) goto L87
            if (r10 == 0) goto L87
            r9.f3304h = r6
            L0.d r10 = r9.f3301e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L83
            long r1 = r9.f3309m
            long r1 = -r1
            goto L85
        L83:
            r1 = 0
        L85:
            r9.f3305i = r1
        L87:
            r10 = 4
            r9.f3306j = r10
            r10 = 2
            r9.f3303g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.c.m(F0.s):boolean");
    }

    public final boolean n(InterfaceC0373s interfaceC0373s) {
        if (!interfaceC0373s.d(this.f3299c.e(), 0, 11, true)) {
            return false;
        }
        this.f3299c.T(0);
        this.f3307k = this.f3299c.G();
        this.f3308l = this.f3299c.J();
        this.f3309m = this.f3299c.J();
        this.f3309m = ((this.f3299c.G() << 24) | this.f3309m) * 1000;
        this.f3299c.U(3);
        this.f3303g = 4;
        return true;
    }

    public final void o(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.i(this.f3306j);
        this.f3306j = 0;
        this.f3303g = 3;
    }

    @Override // F0.r
    public void release() {
    }
}
