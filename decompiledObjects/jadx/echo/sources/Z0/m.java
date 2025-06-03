package Z0;

import F0.AbstractC0358c;
import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.E;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.L;
import F0.M;
import F0.Q;
import F0.T;
import F0.U;
import X2.AbstractC0703v;
import Z0.a;
import android.net.Uri;
import c1.t;
import d0.C1162A;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.z;
import h0.AbstractC1329d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class m implements F0.r, M {

    /* renamed from: B, reason: collision with root package name */
    public static final InterfaceC0378x f7738B = new InterfaceC0378x() { // from class: Z0.l
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] w7;
            w7 = m.w();
            return w7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: A, reason: collision with root package name */
    public U0.a f7739A;

    /* renamed from: a, reason: collision with root package name */
    public final t.a f7740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7741b;

    /* renamed from: c, reason: collision with root package name */
    public final z f7742c;

    /* renamed from: d, reason: collision with root package name */
    public final z f7743d;

    /* renamed from: e, reason: collision with root package name */
    public final z f7744e;

    /* renamed from: f, reason: collision with root package name */
    public final z f7745f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f7746g;

    /* renamed from: h, reason: collision with root package name */
    public final p f7747h;

    /* renamed from: i, reason: collision with root package name */
    public final List f7748i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0703v f7749j = AbstractC0703v.Y();

    /* renamed from: k, reason: collision with root package name */
    public int f7750k;

    /* renamed from: l, reason: collision with root package name */
    public int f7751l;

    /* renamed from: m, reason: collision with root package name */
    public long f7752m;

    /* renamed from: n, reason: collision with root package name */
    public int f7753n;

    /* renamed from: o, reason: collision with root package name */
    public z f7754o;

    /* renamed from: p, reason: collision with root package name */
    public int f7755p;

    /* renamed from: q, reason: collision with root package name */
    public int f7756q;

    /* renamed from: r, reason: collision with root package name */
    public int f7757r;

    /* renamed from: s, reason: collision with root package name */
    public int f7758s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7759t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0374t f7760u;

    /* renamed from: v, reason: collision with root package name */
    public a[] f7761v;

    /* renamed from: w, reason: collision with root package name */
    public long[][] f7762w;

    /* renamed from: x, reason: collision with root package name */
    public int f7763x;

    /* renamed from: y, reason: collision with root package name */
    public long f7764y;

    /* renamed from: z, reason: collision with root package name */
    public int f7765z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final s f7766a;

        /* renamed from: b, reason: collision with root package name */
        public final v f7767b;

        /* renamed from: c, reason: collision with root package name */
        public final T f7768c;

        /* renamed from: d, reason: collision with root package name */
        public final U f7769d;

        /* renamed from: e, reason: collision with root package name */
        public int f7770e;

        public a(s sVar, v vVar, T t7) {
            this.f7766a = sVar;
            this.f7767b = vVar;
            this.f7768c = t7;
            this.f7769d = "audio/true-hd".equals(sVar.f7790f.f12726n) ? new U() : null;
        }
    }

    public m(t.a aVar, int i7) {
        this.f7740a = aVar;
        this.f7741b = i7;
        this.f7750k = (i7 & 4) != 0 ? 3 : 0;
        this.f7747h = new p();
        this.f7748i = new ArrayList();
        this.f7745f = new z(16);
        this.f7746g = new ArrayDeque();
        this.f7742c = new z(AbstractC1329d.f14524a);
        this.f7743d = new z(4);
        this.f7744e = new z();
        this.f7755p = -1;
        this.f7760u = InterfaceC0374t.f1957a;
        this.f7761v = new a[0];
    }

    public static int B(z zVar) {
        zVar.T(8);
        int o7 = o(zVar.p());
        if (o7 != 0) {
            return o7;
        }
        zVar.U(4);
        while (zVar.a() > 0) {
            int o8 = o(zVar.p());
            if (o8 != 0) {
                return o8;
            }
        }
        return 0;
    }

    public static boolean I(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473;
    }

    public static boolean J(int i7) {
        return i7 == 1835296868 || i7 == 1836476516 || i7 == 1751411826 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1937011571 || i7 == 1668576371 || i7 == 1701606260 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1953196132 || i7 == 1718909296 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124;
    }

    public static int o(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] p(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            jArr[i7] = new long[aVarArr[i7].f7767b.f7820b];
            jArr2[i7] = aVarArr[i7].f7767b.f7824f[0];
        }
        long j7 = 0;
        int i8 = 0;
        while (i8 < aVarArr.length) {
            long j8 = Long.MAX_VALUE;
            int i9 = -1;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (!zArr[i10]) {
                    long j9 = jArr2[i10];
                    if (j9 <= j8) {
                        i9 = i10;
                        j8 = j9;
                    }
                }
            }
            int i11 = iArr[i9];
            long[] jArr3 = jArr[i9];
            jArr3[i11] = j7;
            v vVar = aVarArr[i9].f7767b;
            j7 += vVar.f7822d[i11];
            int i12 = i11 + 1;
            iArr[i9] = i12;
            if (i12 < jArr3.length) {
                jArr2[i9] = vVar.f7824f[i12];
            } else {
                zArr[i9] = true;
                i8++;
            }
        }
        return jArr;
    }

    public static int t(v vVar, long j7) {
        int a7 = vVar.a(j7);
        return a7 == -1 ? vVar.b(j7) : a7;
    }

    public static /* synthetic */ F0.r[] w() {
        return new F0.r[]{new m(t.a.f10046a, 16)};
    }

    public static long x(v vVar, long j7, long j8) {
        int t7 = t(vVar, j7);
        return t7 == -1 ? j8 : Math.min(vVar.f7821c[t7], j8);
    }

    public final void A() {
        if (this.f7765z != 2 || (this.f7741b & 2) == 0) {
            return;
        }
        this.f7760u.a(0, 4).d(new C1194q.b().h0(this.f7739A == null ? null : new C1201x(this.f7739A)).K());
        this.f7760u.j();
        this.f7760u.e(new M.b(-9223372036854775807L));
    }

    public final void C(a.C0134a c0134a) {
        C1201x c1201x;
        List list;
        E e7;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        int i9 = 1;
        boolean z7 = this.f7765z == 1;
        E e8 = new E();
        a.b g7 = c0134a.g(1969517665);
        if (g7 != null) {
            C1201x C7 = b.C(g7);
            e8.c(C7);
            c1201x = C7;
        } else {
            c1201x = null;
        }
        a.C0134a f7 = c0134a.f(1835365473);
        C1201x p7 = f7 != null ? b.p(f7) : null;
        C1201x c1201x2 = new C1201x(b.r(((a.b) AbstractC1297a.e(c0134a.g(1836476516))).f7637b));
        long j7 = -9223372036854775807L;
        List B7 = b.B(c0134a, e8, -9223372036854775807L, null, (this.f7741b & 1) != 0, z7, new W2.g() { // from class: Z0.k
            @Override // W2.g
            public final Object apply(Object obj) {
                s v7;
                v7 = m.v((s) obj);
                return v7;
            }
        });
        long j8 = -9223372036854775807L;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        while (i10 < B7.size()) {
            v vVar = (v) B7.get(i10);
            if (vVar.f7820b == 0) {
                list = B7;
                i7 = i9;
                e7 = e8;
            } else {
                s sVar = vVar.f7819a;
                E e9 = e8;
                long j9 = sVar.f7789e;
                if (j9 == j7) {
                    j9 = vVar.f7826h;
                }
                j8 = Math.max(j8, j9);
                int i13 = i11 + 1;
                list = B7;
                a aVar = new a(sVar, vVar, this.f7760u.a(i11, sVar.f7786b));
                int i14 = "audio/true-hd".equals(sVar.f7790f.f12726n) ? vVar.f7823e * 16 : vVar.f7823e + 30;
                C1194q.b a7 = sVar.f7790f.a();
                a7.f0(i14);
                if (sVar.f7786b == 2) {
                    if ((this.f7741b & 8) != 0) {
                        a7.m0(sVar.f7790f.f12718f | (i12 == -1 ? 1 : 2));
                    }
                    if (j9 > 0 && (i8 = vVar.f7820b) > 0) {
                        a7.X(i8 / (j9 / 1000000.0f));
                    }
                }
                e7 = e9;
                j.k(sVar.f7786b, e7, a7);
                int i15 = sVar.f7786b;
                C1201x[] c1201xArr = new C1201x[3];
                c1201xArr[0] = this.f7748i.isEmpty() ? null : new C1201x(this.f7748i);
                c1201xArr[1] = c1201x;
                c1201xArr[2] = c1201x2;
                j.l(i15, p7, a7, c1201xArr);
                aVar.f7768c.d(a7.K());
                if (sVar.f7786b == 2 && i12 == -1) {
                    i12 = arrayList.size();
                }
                arrayList.add(aVar);
                i11 = i13;
                i7 = 1;
            }
            i10 += i7;
            i9 = i7;
            e8 = e7;
            B7 = list;
            j7 = -9223372036854775807L;
        }
        this.f7763x = i12;
        this.f7764y = j8;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f7761v = aVarArr;
        this.f7762w = p(aVarArr);
        this.f7760u.j();
        this.f7760u.e(this);
    }

    public final void D(long j7) {
        if (this.f7751l == 1836086884) {
            int i7 = this.f7753n;
            this.f7739A = new U0.a(0L, j7, -9223372036854775807L, j7 + i7, this.f7752m - i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E(F0.InterfaceC0373s r9) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.m.E(F0.s):boolean");
    }

    public final boolean F(InterfaceC0373s interfaceC0373s, L l7) {
        boolean z7;
        long j7 = this.f7752m - this.f7753n;
        long p7 = interfaceC0373s.p() + j7;
        z zVar = this.f7754o;
        if (zVar != null) {
            interfaceC0373s.readFully(zVar.e(), this.f7753n, (int) j7);
            if (this.f7751l == 1718909296) {
                this.f7759t = true;
                this.f7765z = B(zVar);
            } else if (!this.f7746g.isEmpty()) {
                ((a.C0134a) this.f7746g.peek()).e(new a.b(this.f7751l, zVar));
            }
        } else {
            if (!this.f7759t && this.f7751l == 1835295092) {
                this.f7765z = 1;
            }
            if (j7 >= 262144) {
                l7.f1788a = interfaceC0373s.p() + j7;
                z7 = true;
                z(p7);
                return (z7 || this.f7750k == 2) ? false : true;
            }
            interfaceC0373s.i((int) j7);
        }
        z7 = false;
        z(p7);
        if (z7) {
        }
    }

    public final int G(InterfaceC0373s interfaceC0373s, L l7) {
        int i7;
        L l8;
        long p7 = interfaceC0373s.p();
        if (this.f7755p == -1) {
            int u7 = u(p7);
            this.f7755p = u7;
            if (u7 == -1) {
                return -1;
            }
        }
        a aVar = this.f7761v[this.f7755p];
        T t7 = aVar.f7768c;
        int i8 = aVar.f7770e;
        v vVar = aVar.f7767b;
        long j7 = vVar.f7821c[i8];
        int i9 = vVar.f7822d[i8];
        U u8 = aVar.f7769d;
        long j8 = (j7 - p7) + this.f7756q;
        if (j8 < 0) {
            i7 = 1;
            l8 = l7;
        } else {
            if (j8 < 262144) {
                if (aVar.f7766a.f7791g == 1) {
                    j8 += 8;
                    i9 -= 8;
                }
                interfaceC0373s.i((int) j8);
                s sVar = aVar.f7766a;
                if (sVar.f7794j == 0) {
                    if ("audio/ac4".equals(sVar.f7790f.f12726n)) {
                        if (this.f7757r == 0) {
                            AbstractC0358c.a(i9, this.f7744e);
                            t7.e(this.f7744e, 7);
                            this.f7757r += 7;
                        }
                        i9 += 7;
                    } else if (u8 != null) {
                        u8.d(interfaceC0373s);
                    }
                    while (true) {
                        int i10 = this.f7757r;
                        if (i10 >= i9) {
                            break;
                        }
                        int f7 = t7.f(interfaceC0373s, i9 - i10, false);
                        this.f7756q += f7;
                        this.f7757r += f7;
                        this.f7758s -= f7;
                    }
                } else {
                    byte[] e7 = this.f7743d.e();
                    e7[0] = 0;
                    e7[1] = 0;
                    e7[2] = 0;
                    int i11 = aVar.f7766a.f7794j;
                    int i12 = 4 - i11;
                    while (this.f7757r < i9) {
                        int i13 = this.f7758s;
                        if (i13 == 0) {
                            interfaceC0373s.readFully(e7, i12, i11);
                            this.f7756q += i11;
                            this.f7743d.T(0);
                            int p8 = this.f7743d.p();
                            if (p8 < 0) {
                                throw C1162A.a("Invalid NAL length", null);
                            }
                            this.f7758s = p8;
                            this.f7742c.T(0);
                            t7.e(this.f7742c, 4);
                            this.f7757r += 4;
                            i9 += i12;
                        } else {
                            int f8 = t7.f(interfaceC0373s, i13, false);
                            this.f7756q += f8;
                            this.f7757r += f8;
                            this.f7758s -= f8;
                        }
                    }
                }
                int i14 = i9;
                v vVar2 = aVar.f7767b;
                long j9 = vVar2.f7824f[i8];
                int i15 = vVar2.f7825g[i8];
                if (u8 != null) {
                    u8.c(t7, j9, i15, i14, 0, null);
                    if (i8 + 1 == aVar.f7767b.f7820b) {
                        u8.a(t7, null);
                    }
                } else {
                    t7.b(j9, i15, i14, 0, null);
                }
                aVar.f7770e++;
                this.f7755p = -1;
                this.f7756q = 0;
                this.f7757r = 0;
                this.f7758s = 0;
                return 0;
            }
            l8 = l7;
            i7 = 1;
        }
        l8.f1788a = j7;
        return i7;
    }

    public final int H(InterfaceC0373s interfaceC0373s, L l7) {
        int c7 = this.f7747h.c(interfaceC0373s, l7, this.f7748i);
        if (c7 == 1 && l7.f1788a == 0) {
            q();
        }
        return c7;
    }

    public final void K(a aVar, long j7) {
        v vVar = aVar.f7767b;
        int a7 = vVar.a(j7);
        if (a7 == -1) {
            a7 = vVar.b(j7);
        }
        aVar.f7770e = a7;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f7746g.clear();
        this.f7753n = 0;
        this.f7755p = -1;
        this.f7756q = 0;
        this.f7757r = 0;
        this.f7758s = 0;
        if (j7 == 0) {
            if (this.f7750k != 3) {
                q();
                return;
            } else {
                this.f7747h.g();
                this.f7748i.clear();
                return;
            }
        }
        for (a aVar : this.f7761v) {
            K(aVar, j8);
            U u7 = aVar.f7769d;
            if (u7 != null) {
                u7.b();
            }
        }
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        if ((this.f7741b & 16) == 0) {
            interfaceC0374t = new c1.v(interfaceC0374t, this.f7740a);
        }
        this.f7760u = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        Q d7 = r.d(interfaceC0373s, (this.f7741b & 2) != 0);
        this.f7749j = d7 != null ? AbstractC0703v.Z(d7) : AbstractC0703v.Y();
        return d7 == null;
    }

    @Override // F0.M
    public boolean h() {
        return true;
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        while (true) {
            int i7 = this.f7750k;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        return G(interfaceC0373s, l7);
                    }
                    if (i7 == 3) {
                        return H(interfaceC0373s, l7);
                    }
                    throw new IllegalStateException();
                }
                if (F(interfaceC0373s, l7)) {
                    return 1;
                }
            } else if (!E(interfaceC0373s)) {
                return -1;
            }
        }
    }

    @Override // F0.M
    public M.a j(long j7) {
        return r(j7, -1);
    }

    @Override // F0.M
    public long l() {
        return this.f7764y;
    }

    public final void q() {
        this.f7750k = 0;
        this.f7753n = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public F0.M.a r(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            Z0.m$a[] r4 = r0.f7761v
            int r5 = r4.length
            if (r5 != 0) goto L13
            F0.M$a r1 = new F0.M$a
            F0.N r2 = F0.N.f1793c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f7763x
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            Z0.v r4 = r4.f7767b
            int r6 = t(r4, r1)
            if (r6 != r5) goto L35
            F0.M$a r1 = new F0.M$a
            F0.N r2 = F0.N.f1793c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f7824f
            r12 = r11[r6]
            long[] r11 = r4.f7821c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f7820b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f7824f
            r9 = r2[r1]
            long[] r2 = r4.f7821c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L80
            r3 = 0
        L63:
            Z0.m$a[] r4 = r0.f7761v
            int r5 = r4.length
            if (r3 >= r5) goto L80
            int r5 = r0.f7763x
            if (r3 == r5) goto L7d
            r4 = r4[r3]
            Z0.v r4 = r4.f7767b
            long r5 = x(r4, r12, r14)
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L7c
            long r1 = x(r4, r9, r1)
        L7c:
            r14 = r5
        L7d:
            int r3 = r3 + 1
            goto L63
        L80:
            F0.N r3 = new F0.N
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8f
            F0.M$a r1 = new F0.M$a
            r1.<init>(r3)
            return r1
        L8f:
            F0.N r4 = new F0.N
            r4.<init>(r9, r1)
            F0.M$a r1 = new F0.M$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.m.r(long, int):F0.M$a");
    }

    @Override // F0.r
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC0703v g() {
        return this.f7749j;
    }

    public final int u(long j7) {
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        long j8 = Long.MAX_VALUE;
        boolean z7 = true;
        long j9 = Long.MAX_VALUE;
        boolean z8 = true;
        long j10 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f7761v;
            if (i9 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i9];
            int i10 = aVar.f7770e;
            v vVar = aVar.f7767b;
            if (i10 != vVar.f7820b) {
                long j11 = vVar.f7821c[i10];
                long j12 = ((long[][]) g0.M.i(this.f7762w))[i9][i10];
                long j13 = j11 - j7;
                boolean z9 = j13 < 0 || j13 >= 262144;
                if ((!z9 && z8) || (z9 == z8 && j13 < j10)) {
                    z8 = z9;
                    j10 = j13;
                    i8 = i9;
                    j9 = j12;
                }
                if (j12 < j8) {
                    z7 = z9;
                    i7 = i9;
                    j8 = j12;
                }
            }
            i9++;
        }
        return (j8 == Long.MAX_VALUE || !z7 || j9 < j8 + 10485760) ? i8 : i7;
    }

    public final void y(InterfaceC0373s interfaceC0373s) {
        this.f7744e.P(8);
        interfaceC0373s.n(this.f7744e.e(), 0, 8);
        b.f(this.f7744e);
        interfaceC0373s.i(this.f7744e.f());
        interfaceC0373s.h();
    }

    public final void z(long j7) {
        while (!this.f7746g.isEmpty() && ((a.C0134a) this.f7746g.peek()).f7634b == j7) {
            a.C0134a c0134a = (a.C0134a) this.f7746g.pop();
            if (c0134a.f7633a == 1836019574) {
                C(c0134a);
                this.f7746g.clear();
                this.f7750k = 2;
            } else if (!this.f7746g.isEmpty()) {
                ((a.C0134a) this.f7746g.peek()).d(c0134a);
            }
        }
        if (this.f7750k != 2) {
            q();
        }
    }

    @Override // F0.r
    public void release() {
    }

    public static /* synthetic */ s v(s sVar) {
        return sVar;
    }
}
