package Y0;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.C0369n;
import F0.E;
import F0.G;
import F0.I;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.T;
import F0.r;
import T0.h;
import T0.l;
import T0.n;
import Y0.g;
import android.net.Uri;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.M;
import g0.o;
import g0.z;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements r {

    /* renamed from: u, reason: collision with root package name */
    public static final InterfaceC0378x f7309u = new InterfaceC0378x() { // from class: Y0.d
        @Override // F0.InterfaceC0378x
        public final r[] a() {
            r[] r7;
            r7 = f.r();
            return r7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public static final h.a f7310v = new h.a() { // from class: Y0.e
        @Override // T0.h.a
        public final boolean a(int i7, int i8, int i9, int i10, int i11) {
            boolean s7;
            s7 = f.s(i7, i8, i9, i10, i11);
            return s7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f7311a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7312b;

    /* renamed from: c, reason: collision with root package name */
    public final z f7313c;

    /* renamed from: d, reason: collision with root package name */
    public final I.a f7314d;

    /* renamed from: e, reason: collision with root package name */
    public final E f7315e;

    /* renamed from: f, reason: collision with root package name */
    public final G f7316f;

    /* renamed from: g, reason: collision with root package name */
    public final T f7317g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0374t f7318h;

    /* renamed from: i, reason: collision with root package name */
    public T f7319i;

    /* renamed from: j, reason: collision with root package name */
    public T f7320j;

    /* renamed from: k, reason: collision with root package name */
    public int f7321k;

    /* renamed from: l, reason: collision with root package name */
    public C1201x f7322l;

    /* renamed from: m, reason: collision with root package name */
    public long f7323m;

    /* renamed from: n, reason: collision with root package name */
    public long f7324n;

    /* renamed from: o, reason: collision with root package name */
    public long f7325o;

    /* renamed from: p, reason: collision with root package name */
    public int f7326p;

    /* renamed from: q, reason: collision with root package name */
    public g f7327q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7328r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7329s;

    /* renamed from: t, reason: collision with root package name */
    public long f7330t;

    public f() {
        this(0);
    }

    private void h() {
        AbstractC1297a.h(this.f7319i);
        M.i(this.f7318h);
    }

    public static long o(C1201x c1201x) {
        if (c1201x == null) {
            return -9223372036854775807L;
        }
        int e7 = c1201x.e();
        for (int i7 = 0; i7 < e7; i7++) {
            C1201x.b d7 = c1201x.d(i7);
            if (d7 instanceof n) {
                n nVar = (n) d7;
                if (nVar.f6042o.equals("TLEN")) {
                    return M.J0(Long.parseLong((String) nVar.f6056r.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int p(z zVar, int i7) {
        if (zVar.g() >= i7 + 4) {
            zVar.T(i7);
            int p7 = zVar.p();
            if (p7 == 1483304551 || p7 == 1231971951) {
                return p7;
            }
        }
        if (zVar.g() < 40) {
            return 0;
        }
        zVar.T(36);
        return zVar.p() == 1447187017 ? 1447187017 : 0;
    }

    public static boolean q(int i7, long j7) {
        return ((long) (i7 & (-128000))) == (j7 & (-128000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ r[] r() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean s(int i7, int i8, int i9, int i10, int i11) {
        return (i8 == 67 && i9 == 79 && i10 == 77 && (i11 == 77 || i7 == 2)) || (i8 == 77 && i9 == 76 && i10 == 76 && (i11 == 84 || i7 == 2));
    }

    public static c t(C1201x c1201x, long j7) {
        if (c1201x == null) {
            return null;
        }
        int e7 = c1201x.e();
        for (int i7 = 0; i7 < e7; i7++) {
            C1201x.b d7 = c1201x.d(i7);
            if (d7 instanceof l) {
                return c.a(j7, (l) d7, o(c1201x));
            }
        }
        return null;
    }

    private int x(InterfaceC0373s interfaceC0373s) {
        if (this.f7326p == 0) {
            interfaceC0373s.h();
            if (v(interfaceC0373s)) {
                return -1;
            }
            this.f7313c.T(0);
            int p7 = this.f7313c.p();
            if (!q(p7, this.f7321k) || I.j(p7) == -1) {
                interfaceC0373s.i(1);
                this.f7321k = 0;
                return 0;
            }
            this.f7314d.a(p7);
            if (this.f7323m == -9223372036854775807L) {
                this.f7323m = this.f7327q.c(interfaceC0373s.p());
                if (this.f7312b != -9223372036854775807L) {
                    this.f7323m += this.f7312b - this.f7327q.c(0L);
                }
            }
            this.f7326p = this.f7314d.f1783c;
            g gVar = this.f7327q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(k(this.f7324n + r0.f1787g), interfaceC0373s.p() + this.f7314d.f1783c);
                if (this.f7329s && bVar.a(this.f7330t)) {
                    this.f7329s = false;
                    this.f7320j = this.f7319i;
                }
            }
        }
        int f7 = this.f7320j.f(interfaceC0373s, this.f7326p, true);
        if (f7 == -1) {
            return -1;
        }
        int i7 = this.f7326p - f7;
        this.f7326p = i7;
        if (i7 > 0) {
            return 0;
        }
        this.f7320j.b(k(this.f7324n), 1, this.f7314d.f1783c, 0, null);
        this.f7324n += this.f7314d.f1787g;
        this.f7326p = 0;
        return 0;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f7321k = 0;
        this.f7323m = -9223372036854775807L;
        this.f7324n = 0L;
        this.f7326p = 0;
        this.f7330t = j8;
        g gVar = this.f7327q;
        if (!(gVar instanceof b) || ((b) gVar).a(j8)) {
            return;
        }
        this.f7329s = true;
        this.f7320j = this.f7317g;
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f7318h = interfaceC0374t;
        T a7 = interfaceC0374t.a(0, 1);
        this.f7319i = a7;
        this.f7320j = a7;
        this.f7318h.j();
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return y(interfaceC0373s, true);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        h();
        int w7 = w(interfaceC0373s);
        if (w7 == -1 && (this.f7327q instanceof b)) {
            long k7 = k(this.f7324n);
            if (this.f7327q.l() != k7) {
                ((b) this.f7327q).d(k7);
                this.f7318h.e(this.f7327q);
            }
        }
        return w7;
    }

    public final g j(InterfaceC0373s interfaceC0373s) {
        long o7;
        long j7;
        g u7 = u(interfaceC0373s);
        c t7 = t(this.f7322l, interfaceC0373s.p());
        if (this.f7328r) {
            return new g.a();
        }
        if ((this.f7311a & 4) != 0) {
            if (t7 != null) {
                o7 = t7.l();
                j7 = t7.f();
            } else if (u7 != null) {
                o7 = u7.l();
                j7 = u7.f();
            } else {
                o7 = o(this.f7322l);
                j7 = -1;
            }
            u7 = new b(o7, interfaceC0373s.p(), j7);
        } else if (t7 != null) {
            u7 = t7;
        } else if (u7 == null) {
            u7 = null;
        }
        if (u7 == null || !(u7.h() || (this.f7311a & 1) == 0)) {
            return n(interfaceC0373s, (this.f7311a & 2) != 0);
        }
        return u7;
    }

    public final long k(long j7) {
        return this.f7323m + ((j7 * 1000000) / this.f7314d.f1784d);
    }

    public void l() {
        this.f7328r = true;
    }

    public final g m(long j7, i iVar, long j8) {
        long j9;
        long j10;
        long a7 = iVar.a();
        if (a7 == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f7338c;
        if (j11 != -1) {
            long j12 = j7 + j11;
            j9 = j11 - iVar.f7336a.f1783c;
            j10 = j12;
        } else {
            if (j8 == -1) {
                return null;
            }
            j9 = (j8 - j7) - iVar.f7336a.f1783c;
            j10 = j8;
        }
        long j13 = j9;
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        return new a(j10, j7 + iVar.f7336a.f1783c, a3.f.d(M.Y0(j13, 8000000L, a7, roundingMode)), a3.f.d(Z2.e.b(j13, iVar.f7337b, roundingMode)), false);
    }

    public final g n(InterfaceC0373s interfaceC0373s, boolean z7) {
        interfaceC0373s.n(this.f7313c.e(), 0, 4);
        this.f7313c.T(0);
        this.f7314d.a(this.f7313c.p());
        return new a(interfaceC0373s.a(), interfaceC0373s.p(), this.f7314d, z7);
    }

    public final g u(InterfaceC0373s interfaceC0373s) {
        int i7;
        int i8;
        z zVar = new z(this.f7314d.f1783c);
        interfaceC0373s.n(zVar.e(), 0, this.f7314d.f1783c);
        I.a aVar = this.f7314d;
        int i9 = aVar.f1781a & 1;
        int i10 = 21;
        int i11 = aVar.f1785e;
        if (i9 != 0) {
            if (i11 != 1) {
                i10 = 36;
            }
        } else if (i11 == 1) {
            i10 = 13;
        }
        int p7 = p(zVar, i10);
        if (p7 != 1231971951) {
            if (p7 == 1447187017) {
                h a7 = h.a(interfaceC0373s.a(), interfaceC0373s.p(), this.f7314d, zVar);
                interfaceC0373s.i(this.f7314d.f1783c);
                return a7;
            }
            if (p7 != 1483304551) {
                interfaceC0373s.h();
                return null;
            }
        }
        i b7 = i.b(this.f7314d, zVar);
        if (!this.f7315e.a() && (i7 = b7.f7339d) != -1 && (i8 = b7.f7340e) != -1) {
            E e7 = this.f7315e;
            e7.f1755a = i7;
            e7.f1756b = i8;
        }
        long p8 = interfaceC0373s.p();
        if (interfaceC0373s.a() != -1 && b7.f7338c != -1 && interfaceC0373s.a() != b7.f7338c + p8) {
            o.f("Mp3Extractor", "Data size mismatch between stream (" + interfaceC0373s.a() + ") and Xing frame (" + (b7.f7338c + p8) + "), using Xing value.");
        }
        interfaceC0373s.i(this.f7314d.f1783c);
        return p7 == 1483304551 ? j.a(b7, p8) : m(p8, b7, interfaceC0373s.a());
    }

    public final boolean v(InterfaceC0373s interfaceC0373s) {
        g gVar = this.f7327q;
        if (gVar != null) {
            long f7 = gVar.f();
            if (f7 != -1 && interfaceC0373s.m() > f7 - 4) {
                return true;
            }
        }
        try {
            return !interfaceC0373s.l(this.f7313c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final int w(InterfaceC0373s interfaceC0373s) {
        if (this.f7321k == 0) {
            try {
                y(interfaceC0373s, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f7327q == null) {
            g j7 = j(interfaceC0373s);
            this.f7327q = j7;
            this.f7318h.e(j7);
            C1194q.b h02 = new C1194q.b().o0(this.f7314d.f1782b).f0(4096).N(this.f7314d.f1785e).p0(this.f7314d.f1784d).V(this.f7315e.f1755a).W(this.f7315e.f1756b).h0((this.f7311a & 8) != 0 ? null : this.f7322l);
            if (this.f7327q.k() != -2147483647) {
                h02.M(this.f7327q.k());
            }
            this.f7320j.d(h02.K());
            this.f7325o = interfaceC0373s.p();
        } else if (this.f7325o != 0) {
            long p7 = interfaceC0373s.p();
            long j8 = this.f7325o;
            if (p7 < j8) {
                interfaceC0373s.i((int) (j8 - p7));
            }
        }
        return x(interfaceC0373s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009a, code lost:
    
        if (r13 == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:
    
        r12.i(r1 + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
    
        r11.f7321k = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(F0.InterfaceC0373s r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.h()
            long r1 = r12.p()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L3e
            int r1 = r11.f7311a
            r1 = r1 & 8
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            T0.h$a r1 = Y0.f.f7310v
        L21:
            F0.G r4 = r11.f7316f
            d0.x r1 = r4.a(r12, r1)
            r11.f7322l = r1
            if (r1 == 0) goto L30
            F0.E r4 = r11.f7315e
            r4.c(r1)
        L30:
            long r4 = r12.m()
            int r1 = (int) r4
            if (r13 != 0) goto L3a
            r12.i(r1)
        L3a:
            r4 = r3
        L3b:
            r5 = r4
            r6 = r5
            goto L41
        L3e:
            r1 = r3
            r4 = r1
            goto L3b
        L41:
            boolean r7 = r11.v(r12)
            r8 = 1
            if (r7 == 0) goto L51
            if (r5 <= 0) goto L4b
            goto L9a
        L4b:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L51:
            g0.z r7 = r11.f7313c
            r7.T(r3)
            g0.z r7 = r11.f7313c
            int r7 = r7.p()
            if (r4 == 0) goto L65
            long r9 = (long) r4
            boolean r9 = q(r7, r9)
            if (r9 == 0) goto L6c
        L65:
            int r9 = F0.I.j(r7)
            r10 = -1
            if (r9 != r10) goto L8c
        L6c:
            int r4 = r6 + 1
            if (r6 != r0) goto L7a
            if (r13 == 0) goto L73
            return r3
        L73:
            java.lang.String r12 = "Searched too many bytes."
            d0.A r12 = d0.C1162A.a(r12, r2)
            throw r12
        L7a:
            if (r13 == 0) goto L85
            r12.h()
            int r5 = r1 + r4
            r12.o(r5)
            goto L88
        L85:
            r12.i(r8)
        L88:
            r5 = r3
            r6 = r4
            r4 = r5
            goto L41
        L8c:
            int r5 = r5 + 1
            if (r5 != r8) goto L97
            F0.I$a r4 = r11.f7314d
            r4.a(r7)
            r4 = r7
            goto La7
        L97:
            r7 = 4
            if (r5 != r7) goto La7
        L9a:
            if (r13 == 0) goto La1
            int r1 = r1 + r6
            r12.i(r1)
            goto La4
        La1:
            r12.h()
        La4:
            r11.f7321k = r4
            return r8
        La7:
            int r9 = r9 + (-4)
            r12.o(r9)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: Y0.f.y(F0.s, boolean):boolean");
    }

    public f(int i7) {
        this(i7, -9223372036854775807L);
    }

    public f(int i7, long j7) {
        this.f7311a = (i7 & 2) != 0 ? i7 | 1 : i7;
        this.f7312b = j7;
        this.f7313c = new z(10);
        this.f7314d = new I.a();
        this.f7315e = new E();
        this.f7323m = -9223372036854775807L;
        this.f7316f = new G();
        C0369n c0369n = new C0369n();
        this.f7317g = c0369n;
        this.f7320j = c0369n;
    }

    @Override // F0.r
    public void release() {
    }
}
