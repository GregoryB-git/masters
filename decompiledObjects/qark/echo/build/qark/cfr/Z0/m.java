/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.List
 */
package Z0;

import F0.E;
import F0.L;
import F0.M;
import F0.N;
import F0.Q;
import F0.T;
import F0.U;
import F0.c;
import F0.t;
import Z0.a;
import Z0.b;
import Z0.j;
import Z0.k;
import Z0.l;
import Z0.p;
import Z0.r;
import Z0.s;
import Z0.v;
import c1.t;
import d0.A;
import d0.i;
import d0.q;
import d0.x;
import g0.z;
import h0.d;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class m
implements F0.r,
M {
    public static final F0.x B = new l();
    public U0.a A;
    public final t.a a;
    public final int b;
    public final z c;
    public final z d;
    public final z e;
    public final z f;
    public final ArrayDeque g;
    public final p h;
    public final List i;
    public X2.v j;
    public int k;
    public int l;
    public long m;
    public int n;
    public z o;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public t u;
    public a[] v;
    public long[][] w;
    public int x;
    public long y;
    public int z;

    public m(t.a a8, int n8) {
        this.a = a8;
        this.b = n8;
        this.j = X2.v.Y();
        n8 = (n8 & 4) != 0 ? 3 : 0;
        this.k = n8;
        this.h = new p();
        this.i = new ArrayList();
        this.f = new z(16);
        this.g = new ArrayDeque();
        this.c = new z(d.a);
        this.d = new z(4);
        this.e = new z();
        this.p = -1;
        this.u = t.a;
        this.v = new a[0];
    }

    public static int B(z z8) {
        z8.T(8);
        int n8 = m.o(z8.p());
        if (n8 != 0) {
            return n8;
        }
        z8.U(4);
        while (z8.a() > 0) {
            n8 = m.o(z8.p());
            if (n8 == 0) continue;
            return n8;
        }
        return 0;
    }

    public static boolean I(int n8) {
        if (n8 != 1836019574 && n8 != 1953653099 && n8 != 1835297121 && n8 != 1835626086 && n8 != 1937007212 && n8 != 1701082227 && n8 != 1835365473) {
            return false;
        }
        return true;
    }

    public static boolean J(int n8) {
        if (n8 != 1835296868 && n8 != 1836476516 && n8 != 1751411826 && n8 != 1937011556 && n8 != 1937011827 && n8 != 1937011571 && n8 != 1668576371 && n8 != 1701606260 && n8 != 1937011555 && n8 != 1937011578 && n8 != 1937013298 && n8 != 1937007471 && n8 != 1668232756 && n8 != 1953196132 && n8 != 1718909296 && n8 != 1969517665 && n8 != 1801812339 && n8 != 1768715124) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ s m(s s8) {
        return s8;
    }

    public static /* synthetic */ F0.r[] n() {
        return m.w();
    }

    public static int o(int n8) {
        if (n8 != 1751476579) {
            if (n8 != 1903435808) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public static long[][] p(a[] arra) {
        int n8;
        long[][] arrarrl = new long[arra.length][];
        int[] arrn = new int[arra.length];
        long[] arrl = new long[arra.length];
        boolean[] arrbl = new boolean[arra.length];
        for (n8 = 0; n8 < arra.length; ++n8) {
            arrarrl[n8] = new long[arra[n8].b.b];
            arrl[n8] = arra[n8].b.f[0];
        }
        long l8 = 0L;
        int n9 = 0;
        while (n9 < arra.length) {
            long l9 = Long.MAX_VALUE;
            int n10 = -1;
            for (n8 = 0; n8 < arra.length; ++n8) {
                long l10 = l9;
                int n11 = n10;
                if (!arrbl[n8]) {
                    long l11 = arrl[n8];
                    l10 = l9;
                    n11 = n10;
                    if (l11 <= l9) {
                        n11 = n8;
                        l10 = l11;
                    }
                }
                l9 = l10;
                n10 = n11;
            }
            n8 = arrn[n10];
            long[] arrl2 = arrarrl[n10];
            arrl2[n8] = l8;
            v v8 = arra[n10].b;
            l8 += (long)v8.d[n8];
            arrn[n10] = ++n8;
            if (n8 < arrl2.length) {
                arrl[n10] = v8.f[n8];
                continue;
            }
            arrbl[n10] = true;
            ++n9;
        }
        return arrarrl;
    }

    public static int t(v v8, long l8) {
        int n8;
        int n9 = n8 = v8.a(l8);
        if (n8 == -1) {
            n9 = v8.b(l8);
        }
        return n9;
    }

    public static /* synthetic */ F0.r[] w() {
        return new F0.r[]{new m(t.a.a, 16)};
    }

    public static long x(v v8, long l8, long l9) {
        int n8 = m.t(v8, l8);
        if (n8 == -1) {
            return l9;
        }
        return Math.min((long)v8.c[n8], (long)l9);
    }

    public final void A() {
        if (this.z == 2 && (this.b & 2) != 0) {
            T t8 = this.u.a(0, 4);
            x x8 = this.A == null ? null : new x(this.A);
            t8.d(new q.b().h0(x8).K());
            this.u.j();
            this.u.e(new M.b(-9223372036854775807L));
        }
    }

    public final void C(a.a arra) {
        int n8;
        ArrayList arrayList = new ArrayList();
        int n9 = this.z;
        int n10 = 1;
        boolean bl = n9 == 1;
        E e8 = new E();
        Object object = arra.g(1969517665);
        if (object != null) {
            object = b.C((a.b)object);
            e8.c((x)object);
        } else {
            object = null;
        }
        Object object2 = arra.f(1835365473);
        object2 = object2 != null ? b.p((a.a)object2) : null;
        x x8 = new x(b.r(((a.b)g0.a.e((Object)arra.g((int)1836476516))).b));
        boolean bl2 = (this.b & 1) != 0;
        arra = b.B((a.a)arra, e8, -9223372036854775807L, null, bl2, bl, new k());
        long l8 = -9223372036854775807L;
        int n11 = n8 = 0;
        n9 = -1;
        while (n8 < arra.size()) {
            Object object3 = (v)arra.get(n8);
            if (object3.b != 0) {
                int n12;
                s s8 = object3.a;
                long l9 = s8.e;
                if (l9 == -9223372036854775807L) {
                    l9 = object3.h;
                }
                l8 = Math.max((long)l8, (long)l9);
                a a8 = new a(s8, (v)object3, this.u.a(n11, s8.b));
                n10 = "audio/true-hd".equals((Object)s8.f.n) ? object3.e * 16 : object3.e + 30;
                q.b b8 = s8.f.a();
                b8.f0(n10);
                if (s8.b == 2) {
                    if ((this.b & 8) != 0) {
                        n12 = s8.f.f;
                        n10 = n9 == -1 ? 1 : 2;
                        b8.m0(n12 | n10);
                    }
                    if (l9 > 0L && (n10 = object3.b) > 0) {
                        b8.X((float)n10 / ((float)l9 / 1000000.0f));
                    }
                }
                j.k(s8.b, e8, b8);
                n10 = s8.b;
                object3 = this.i.isEmpty() ? null : new x(this.i);
                j.l(n10, (x)object2, b8, new x[]{object3, object, x8});
                a8.c.d(b8.K());
                if (s8.b == 2) {
                    n10 = n9;
                    if (n9 == -1) {
                        n10 = arrayList.size();
                    }
                } else {
                    n10 = n9;
                }
                arrayList.add((Object)a8);
                ++n11;
                n12 = 1;
                n9 = n10;
                n10 = n12;
            }
            n8 += n10;
        }
        this.x = n9;
        this.y = l8;
        arra = (a[])arrayList.toArray((Object[])new a[0]);
        this.v = arra;
        this.w = m.p(arra);
        this.u.j();
        this.u.e(this);
    }

    public final void D(long l8) {
        if (this.l == 1836086884) {
            int n8 = this.n;
            this.A = new U0.a(0L, l8, -9223372036854775807L, l8 + (long)n8, this.m - (long)n8);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean E(F0.s object) {
        long l8;
        long l9;
        block15 : {
            block14 : {
                block13 : {
                    if (this.n == 0) {
                        if (!object.d(this.f.e(), 0, 8, true)) {
                            this.A();
                            return false;
                        }
                        this.n = 8;
                        this.f.T(0);
                        this.m = this.f.I();
                        this.l = this.f.p();
                    }
                    if ((l8 = this.m) != 1L) break block13;
                    object.readFully(this.f.e(), 8, 8);
                    this.n += 8;
                    l8 = this.f.L();
                    break block14;
                }
                if (l8 != 0L) break block15;
                l8 = l9 = object.a();
                if (l9 == -1L) {
                    a.a a8 = (a.a)this.g.peek();
                    l8 = l9;
                    if (a8 != null) {
                        l8 = a8.b;
                    }
                }
                if (l8 == -1L) break block15;
                l8 = l8 - object.p() + (long)this.n;
            }
            this.m = l8;
        }
        if (this.m < (long)this.n) {
            throw A.d("Atom size less than header length (unsupported).");
        }
        if (m.I(this.l)) {
            l9 = object.p();
            l8 = this.m;
            int n8 = this.n;
            l9 = l9 + l8 - (long)n8;
            if (l8 != (long)n8 && this.l == 1835365473) {
                this.y((F0.s)object);
            }
            this.g.push((Object)new a.a(this.l, l9));
            if (this.m == (long)this.n) {
                this.z(l9);
                return true;
            }
            this.q();
            return true;
        }
        if (m.J(this.l)) {
            boolean bl = this.n == 8;
            g0.a.f(bl);
            bl = this.m <= Integer.MAX_VALUE;
            g0.a.f(bl);
            object = new z((int)this.m);
            System.arraycopy((Object)this.f.e(), (int)0, (Object)object.e(), (int)0, (int)8);
        } else {
            this.D(object.p() - (long)this.n);
            object = null;
        }
        this.o = object;
        this.k = 1;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean F(F0.s var1_1, L var2_2) {
        block6 : {
            var4_3 = this.m - (long)this.n;
            var6_4 = var1_1.p();
            var8_5 = this.o;
            if (var8_5 == null) break block6;
            var1_1.readFully(var8_5.e(), this.n, (int)var4_3);
            if (this.l == 1718909296) {
                this.t = true;
                this.z = m.B(var8_5);
            } else if (!this.g.isEmpty()) {
                ((a.a)this.g.peek()).e(new a.b(this.l, var8_5));
            }
            ** GOTO lbl18
        }
        if (!this.t && this.l == 1835295092) {
            this.z = 1;
        }
        if (var4_3 < 262144L) {
            var1_1.i((int)var4_3);
lbl18: // 3 sources:
            var3_6 = false;
        } else {
            var2_2.a = var1_1.p() + var4_3;
            var3_6 = true;
        }
        this.z(var6_4 + var4_3);
        if (var3_6 == false) return false;
        if (this.k == 2) return false;
        return true;
    }

    public final int G(F0.s object, L arrby) {
        int n8;
        long l8 = object.p();
        if (this.p == -1) {
            this.p = n8 = this.u(l8);
            if (n8 == -1) {
                return -1;
            }
        }
        a a8 = this.v[this.p];
        T t8 = a8.c;
        int n9 = a8.e;
        Object object2 = a8.b;
        long l9 = object2.c[n9];
        int n10 = object2.d[n9];
        object2 = a8.d;
        if ((l8 = l9 - l8 + (long)this.q) >= 0L && l8 < 262144L) {
            int n11;
            l9 = l8;
            n8 = n10;
            if (a8.a.g == 1) {
                l9 = l8 + 8L;
                n8 = n10 - 8;
            }
            object.i((int)l9);
            arrby = a8.a;
            if (arrby.j != 0) {
                arrby = this.d.e();
                arrby[0] = 0;
                arrby[1] = 0;
                arrby[2] = 0;
                n10 = a8.a.j;
                int n12 = 4 - n10;
                do {
                    n11 = n8;
                    if (this.r < n8) {
                        n11 = this.s;
                        if (n11 == 0) {
                            object.readFully(arrby, n12, n10);
                            this.q += n10;
                            this.d.T(0);
                            n11 = this.d.p();
                            if (n11 >= 0) {
                                this.s = n11;
                                this.c.T(0);
                                t8.e(this.c, 4);
                                this.r += 4;
                                n8 += n12;
                                continue;
                            }
                            throw A.a("Invalid NAL length", null);
                        }
                        n11 = t8.f((i)object, n11, false);
                        this.q += n11;
                        this.r += n11;
                        this.s -= n11;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                if ("audio/ac4".equals((Object)arrby.f.n)) {
                    if (this.r == 0) {
                        c.a(n8, this.e);
                        t8.e(this.e, 7);
                        this.r += 7;
                    }
                    n10 = n8 + 7;
                } else {
                    n10 = n8;
                    if (object2 != null) {
                        object2.d((F0.s)object);
                        n10 = n8;
                    }
                }
                do {
                    n8 = this.r;
                    n11 = n10;
                    if (n8 >= n10) break;
                    n8 = t8.f((i)object, n10 - n8, false);
                    this.q += n8;
                    this.r += n8;
                    this.s -= n8;
                } while (true);
            }
            object = a8.b;
            l9 = object.f[n9];
            n8 = object.g[n9];
            if (object2 != null) {
                object2.c(t8, l9, n8, n11, 0, null);
                if (n9 + 1 == a8.b.b) {
                    object2.a(t8, null);
                }
            } else {
                t8.b(l9, n8, n11, 0, null);
            }
            ++a8.e;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            return 0;
        }
        arrby.a = l9;
        return 1;
    }

    public final int H(F0.s s8, L l8) {
        int n8 = this.h.c(s8, l8, this.i);
        if (n8 == 1 && l8.a == 0L) {
            this.q();
        }
        return n8;
    }

    public final void K(a a8, long l8) {
        int n8;
        v v8 = a8.b;
        int n9 = n8 = v8.a(l8);
        if (n8 == -1) {
            n9 = v8.b(l8);
        }
        a8.e = n9;
    }

    @Override
    public void a(long l8, long l9) {
        this.g.clear();
        this.n = 0;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        if (l8 == 0L) {
            if (this.k != 3) {
                this.q();
                return;
            }
            this.h.g();
            this.i.clear();
            return;
        }
        for (a a8 : this.v) {
            this.K(a8, l9);
            U object = a8.d;
            if (object == null) continue;
            object.b();
        }
    }

    @Override
    public void b(t t8) {
        t t9 = t8;
        if ((this.b & 16) == 0) {
            t9 = new c1.v(t8, this.a);
        }
        this.u = t9;
    }

    @Override
    public /* synthetic */ F0.r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(F0.s object) {
        int n8 = this.b;
        boolean bl = false;
        boolean bl2 = (n8 & 2) != 0;
        Q q8 = r.d((F0.s)object, bl2);
        object = q8 != null ? X2.v.Z(q8) : X2.v.Y();
        this.j = object;
        bl2 = bl;
        if (q8 == null) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean h() {
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int i(F0.s var1_1, L var2_2) {
        do lbl-1000: // 3 sources:
        {
            if ((var3_3 = this.k) == 0) continue;
            if (var3_3 != 1) {
                if (var3_3 == 2) return this.G(var1_1, var2_2);
                if (var3_3 != 3) throw new IllegalStateException();
                return this.H(var1_1, var2_2);
            }
            if (!this.F(var1_1, var2_2)) ** GOTO lbl-1000
            return 1;
        } while (this.E(var1_1));
        return -1;
    }

    @Override
    public M.a j(long l8) {
        return this.r(l8, -1);
    }

    @Override
    public long l() {
        return this.y;
    }

    public final void q() {
        this.k = 0;
        this.n = 0;
    }

    public M.a r(long l8, int n8) {
        Object object;
        long l9;
        long l10;
        long l11;
        long l12;
        block9 : {
            block8 : {
                block7 : {
                    object = this.v;
                    if (object.length == 0) {
                        return new M.a(N.c);
                    }
                    int n9 = n8 != -1 ? n8 : this.x;
                    if (n9 == -1) break block7;
                    object = object[n9].b;
                    n9 = m.t((v)object, l8);
                    if (n9 == -1) {
                        return new M.a(N.c);
                    }
                    l9 = object.f[n9];
                    l10 = object.c[n9];
                    l11 = l9;
                    l12 = l10;
                    if (l9 >= l8) break block8;
                    l11 = l9;
                    l12 = l10;
                    if (n9 >= object.b - 1) break block8;
                    int n10 = object.b(l8);
                    l11 = l9;
                    l12 = l10;
                    if (n10 == -1) break block8;
                    l11 = l9;
                    l12 = l10;
                    if (n10 == n9) break block8;
                    l11 = object.f[n10];
                    l8 = object.c[n10];
                    l12 = l10;
                    break block9;
                }
                l12 = Long.MAX_VALUE;
                l11 = l8;
            }
            l8 = -1L;
            l10 = -9223372036854775807L;
            l9 = l11;
            l11 = l10;
        }
        l10 = l8;
        long l13 = l12;
        if (n8 == -1) {
            n8 = 0;
            do {
                object = this.v;
                l10 = l8;
                l13 = l12;
                if (n8 >= object.length) break;
                l13 = l8;
                l10 = l12;
                if (n8 != this.x) {
                    object = object[n8].b;
                    l10 = m.x((v)object, l9, l12);
                    l12 = l8;
                    if (l11 != -9223372036854775807L) {
                        l12 = m.x((v)object, l11, l8);
                    }
                    l13 = l12;
                }
                ++n8;
                l8 = l13;
                l12 = l10;
            } while (true);
        }
        object = new N(l9, l13);
        if (l11 == -9223372036854775807L) {
            return new M.a((N)object);
        }
        return new M.a((N)object, new N(l11, l10));
    }

    @Override
    public void release() {
    }

    public X2.v s() {
        return this.j;
    }

    public final int u(long l8) {
        Object object;
        int n8 = -1;
        int n9 = -1;
        long l9 = Long.MAX_VALUE;
        int n10 = 1;
        long l10 = Long.MAX_VALUE;
        int n11 = 1;
        long l11 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < (object = this.v).length; ++i8) {
            long l12;
            block7 : {
                long l13;
                long l14;
                int n12;
                int n13;
                int n14;
                long l15;
                block9 : {
                    block8 : {
                        block6 : {
                            object = object[i8];
                            n13 = object.e;
                            object = object.b;
                            if (n13 != object.b) break block6;
                            l12 = l9;
                            break block7;
                        }
                        l14 = object.c[n13];
                        l15 = ((long[][])g0.M.i(this.w))[i8][n13];
                        l12 = l14 - l8;
                        n13 = l12 >= 0L && l12 < 262144L ? 0 : 1;
                        if (n13 == 0 && n11 != 0) break block8;
                        n14 = n9;
                        l13 = l10;
                        n12 = n11;
                        l14 = l11;
                        if (n13 != n11) break block9;
                        n14 = n9;
                        l13 = l10;
                        n12 = n11;
                        l14 = l11;
                        if (l12 >= l11) break block9;
                    }
                    n12 = n13;
                    l14 = l12;
                    n14 = i8;
                    l13 = l15;
                }
                n9 = n14;
                l12 = l9;
                l10 = l13;
                n11 = n12;
                l11 = l14;
                if (l15 < l9) {
                    n8 = i8;
                    l11 = l14;
                    n11 = n12;
                    l10 = l13;
                    n10 = n13;
                    l12 = l15;
                    n9 = n14;
                }
            }
            l9 = l12;
        }
        if (l9 == Long.MAX_VALUE || n10 == 0 || l10 < l9 + 0xA00000L) {
            n8 = n9;
        }
        return n8;
    }

    public final void y(F0.s s8) {
        this.e.P(8);
        s8.n(this.e.e(), 0, 8);
        b.f(this.e);
        s8.i(this.e.f());
        s8.h();
    }

    public final void z(long l8) {
        while (!this.g.isEmpty() && ((a.a)this.g.peek()).b == l8) {
            a.a a8 = (a.a)this.g.pop();
            if (a8.a == 1836019574) {
                this.C(a8);
                this.g.clear();
                this.k = 2;
                continue;
            }
            if (this.g.isEmpty()) continue;
            ((a.a)this.g.peek()).d(a8);
        }
        if (this.k != 2) {
            this.q();
        }
    }

    public static final class a {
        public final s a;
        public final v b;
        public final T c;
        public final U d;
        public int e;

        public a(s object, v v8, T t8) {
            this.a = object;
            this.b = v8;
            this.c = t8;
            object = "audio/true-hd".equals((Object)object.f.n) ? new U() : null;
            this.d = object;
        }
    }

}

