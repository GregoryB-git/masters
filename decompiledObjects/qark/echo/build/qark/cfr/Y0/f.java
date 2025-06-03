/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.RoundingMode
 *  java.util.List
 */
package Y0;

import F0.E;
import F0.G;
import F0.I;
import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import T0.h;
import T0.l;
import T0.n;
import X2.v;
import Y0.a;
import Y0.b;
import Y0.c;
import Y0.d;
import Y0.e;
import Y0.g;
import Y0.h;
import Y0.i;
import Y0.j;
import d0.A;
import d0.q;
import d0.x;
import g0.o;
import g0.z;
import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

public final class f
implements r {
    public static final F0.x u = new d();
    public static final h.a v = new e();
    public final int a;
    public final long b;
    public final z c;
    public final I.a d;
    public final E e;
    public final G f;
    public final T g;
    public t h;
    public T i;
    public T j;
    public int k;
    public x l;
    public long m;
    public long n;
    public long o;
    public int p;
    public g q;
    public boolean r;
    public boolean s;
    public long t;

    public f() {
        this(0);
    }

    public f(int n8) {
        this(n8, -9223372036854775807L);
    }

    public f(int n8, long l8) {
        int n9 = n8;
        if ((n8 & 2) != 0) {
            n9 = n8 | 1;
        }
        this.a = n9;
        this.b = l8;
        this.c = new z(10);
        this.d = new I.a();
        this.e = new E();
        this.m = -9223372036854775807L;
        this.f = new G();
        F0.n n10 = new F0.n();
        this.g = n10;
        this.j = n10;
    }

    public static /* synthetic */ r[] c() {
        return f.r();
    }

    public static /* synthetic */ boolean f(int n8, int n9, int n10, int n11, int n12) {
        return f.s(n8, n9, n10, n11, n12);
    }

    private void h() {
        g0.a.h(this.i);
        g0.M.i(this.h);
    }

    public static long o(x x8) {
        if (x8 != null) {
            int n8 = x8.e();
            for (int i8 = 0; i8 < n8; ++i8) {
                x.b b8 = x8.d(i8);
                if (!(b8 instanceof n)) continue;
                b8 = (n)b8;
                if (!b8.o.equals((Object)"TLEN")) continue;
                return g0.M.J0(Long.parseLong((String)((String)b8.r.get(0))));
            }
        }
        return -9223372036854775807L;
    }

    public static int p(z z8, int n8) {
        if (z8.g() >= n8 + 4) {
            z8.T(n8);
            n8 = z8.p();
            if (n8 == 1483304551 || n8 == 1231971951) {
                return n8;
            }
        }
        if (z8.g() >= 40) {
            z8.T(36);
            if (z8.p() == 1447187017) {
                return 1447187017;
            }
        }
        return 0;
    }

    public static boolean q(int n8, long l8) {
        if ((long)(n8 & -128000) == (l8 & -128000L)) {
            return true;
        }
        return false;
    }

    private static /* synthetic */ r[] r() {
        return new r[]{new f()};
    }

    public static /* synthetic */ boolean s(int n8, int n9, int n10, int n11, int n12) {
        if (n9 == 67 && n10 == 79 && n11 == 77 && (n12 == 77 || n8 == 2) || n9 == 77 && n10 == 76 && n11 == 76 && (n12 == 84 || n8 == 2)) {
            return true;
        }
        return false;
    }

    public static c t(x x8, long l8) {
        if (x8 != null) {
            int n8 = x8.e();
            for (int i8 = 0; i8 < n8; ++i8) {
                x.b b8 = x8.d(i8);
                if (!(b8 instanceof l)) continue;
                return c.a(l8, (l)b8, f.o(x8));
            }
        }
        return null;
    }

    private int x(s s8) {
        int n8;
        if (this.p == 0) {
            s8.h();
            if (this.v(s8)) {
                return -1;
            }
            this.c.T(0);
            n8 = this.c.p();
            if (f.q(n8, this.k) && I.j(n8) != -1) {
                this.d.a(n8);
                if (this.m == -9223372036854775807L) {
                    this.m = this.q.c(s8.p());
                    if (this.b != -9223372036854775807L) {
                        long l8 = this.q.c(0L);
                        this.m += this.b - l8;
                    }
                }
                I.a a8 = this.d;
                this.p = a8.c;
                g g8 = this.q;
                if (g8 instanceof b) {
                    g8 = (b)g8;
                    g8.b(this.k(this.n + (long)a8.g), s8.p() + (long)this.d.c);
                    if (this.s && g8.a(this.t)) {
                        this.s = false;
                        this.j = this.i;
                    }
                }
            } else {
                s8.i(1);
                this.k = 0;
                return 0;
            }
        }
        if ((n8 = this.j.f(s8, this.p, true)) == -1) {
            return -1;
        }
        this.p = n8 = this.p - n8;
        if (n8 > 0) {
            return 0;
        }
        this.j.b(this.k(this.n), 1, this.d.c, 0, null);
        this.n += (long)this.d.g;
        this.p = 0;
        return 0;
    }

    @Override
    public void a(long l8, long l9) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = l9;
        g g8 = this.q;
        if (g8 instanceof b && !((b)g8).a(l9)) {
            this.s = true;
            this.j = this.g;
        }
    }

    @Override
    public void b(t object) {
        this.h = object;
        this.i = object = object.a(0, 1);
        this.j = object;
        this.h.j();
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        return this.y(s8, true);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        this.h();
        int n8 = this.w(s8);
        if (n8 == -1 && this.q instanceof b) {
            long l9 = this.k(this.n);
            if (this.q.l() != l9) {
                ((b)this.q).d(l9);
                this.h.e(this.q);
            }
        }
        return n8;
    }

    public final g j(s s8) {
        g g82;
        block15 : {
            g g82;
            boolean bl;
            block14 : {
                g g9 = this.u(s8);
                g82 = f.t(this.l, s8.p());
                if (this.r) {
                    return new g.a();
                }
                if ((this.a & 4) != 0) {
                    long l8;
                    long l9;
                    if (g82 != null) {
                        l9 = g82.l();
                        l8 = g82.f();
                    } else if (g9 != null) {
                        l9 = g9.l();
                        l8 = g9.f();
                    } else {
                        l9 = f.o(this.l);
                        l8 = -1L;
                    }
                    g9 = new b(l9, s8.p(), l8);
                } else if (g82 != null) {
                    g9 = g82;
                } else if (g9 == null) {
                    g9 = null;
                }
                bl = true;
                if (g9 == null) break block14;
                g82 = g9;
                if (g9.h()) break block15;
                g82 = g9;
                if ((this.a & 1) == 0) break block15;
            }
            if ((this.a & 2) == 0) {
                bl = false;
            }
            g82 = this.n(s8, bl);
        }
        return g82;
    }

    public final long k(long l8) {
        return this.m + l8 * 1000000L / (long)this.d.d;
    }

    public void l() {
        this.r = true;
    }

    public final g m(long l8, i i8, long l9) {
        Object object;
        block6 : {
            long l10;
            long l11;
            block5 : {
                block4 : {
                    l11 = i8.a();
                    object = null;
                    if (l11 == -9223372036854775807L) {
                        return null;
                    }
                    l10 = i8.c;
                    if (l10 == -1L) break block4;
                    l9 = l10 - (long)i8.a.c;
                    l10 = l8 + l10;
                    break block5;
                }
                if (l9 == -1L) break block6;
                long l12 = l9 - l8 - (long)i8.a.c;
                l10 = l9;
                l9 = l12;
            }
            object = RoundingMode.HALF_UP;
            int n8 = a3.f.d(g0.M.Y0(l9, 8000000L, l11, (RoundingMode)object));
            int n9 = a3.f.d(Z2.e.b(l9, i8.b, (RoundingMode)object));
            object = new a(l10, l8 + (long)i8.a.c, n8, n9, false);
        }
        return object;
    }

    public final g n(s s8, boolean bl) {
        s8.n(this.c.e(), 0, 4);
        this.c.T(0);
        this.d.a(this.c.p());
        return new a(s8.a(), s8.p(), this.d, bl);
    }

    @Override
    public void release() {
    }

    public final g u(s s8) {
        Object object = new z(this.d.c);
        s8.n(object.e(), 0, this.d.c);
        Object object2 = this.d;
        int n8 = object2.a;
        int n9 = 21;
        int n10 = object2.e;
        if ((n8 & 1) != 0) {
            if (n10 != 1) {
                n9 = 36;
            }
        } else if (n10 == 1) {
            n9 = 13;
        }
        if ((n9 = f.p((z)object, n9)) != 1231971951) {
            if (n9 != 1447187017) {
                if (n9 != 1483304551) {
                    s8.h();
                    return null;
                }
            } else {
                object = h.a(s8.a(), s8.p(), this.d, (z)object);
                s8.i(this.d.c);
                return object;
            }
        }
        object = i.b(this.d, (z)object);
        if (!this.e.a() && (n10 = object.d) != -1 && (n8 = object.e) != -1) {
            object2 = this.e;
            object2.a = n10;
            object2.b = n8;
        }
        long l8 = s8.p();
        if (s8.a() != -1L && object.c != -1L && s8.a() != object.c + l8) {
            object2 = new StringBuilder();
            object2.append("Data size mismatch between stream (");
            object2.append(s8.a());
            object2.append(") and Xing frame (");
            object2.append(object.c + l8);
            object2.append("), using Xing value.");
            o.f("Mp3Extractor", object2.toString());
        }
        s8.i(this.d.c);
        if (n9 == 1483304551) {
            return j.a((i)object, l8);
        }
        return this.m(l8, (i)object, s8.a());
    }

    public final boolean v(s s8) {
        boolean bl;
        long l8;
        g g8 = this.q;
        if (g8 != null && (l8 = g8.f()) != -1L && s8.m() > l8 - 4L) {
            return true;
        }
        try {
            bl = s8.l(this.c.e(), 0, 4, true);
        }
        catch (EOFException eOFException) {
            return true;
        }
        return bl ^ true;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final int w(s s8) {
        if (this.k == 0) {
            this.y(s8, false);
        }
        if (this.q != null) {
            long l8;
            if (this.o == 0L) return this.x(s8);
            long l9 = s8.p();
            if (l9 >= (l8 = this.o)) return this.x(s8);
            s8.i((int)(l8 - l9));
            return this.x(s8);
        }
        Object object = this.j(s8);
        this.q = object;
        this.h.e((M)object);
        q.b b8 = new q.b().o0(this.d.b).f0(4096).N(this.d.e).p0(this.d.d).V(this.e.a).W(this.e.b);
        object = (this.a & 8) != 0 ? null : this.l;
        object = b8.h0((x)object);
        if (this.q.k() != -2147483647) {
            object.M(this.q.k());
        }
        this.j.d(object.K());
        this.o = s8.p();
        return this.x(s8);
        catch (EOFException eOFException) {
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean y(s s8, boolean bl) {
        int n8;
        int n9;
        int n10 = bl ? 32768 : 131072;
        s8.h();
        if (s8.p() == 0L) {
            Object object = (this.a & 8) == 0 ? null : v;
            this.l = object = this.f.a(s8, (h.a)object);
            if (object != null) {
                this.e.c((x)object);
            }
            n8 = (int)s8.m();
            if (!bl) {
                s8.i(n8);
            }
        } else {
            n8 = 0;
        }
        int n11 = 0;
        int n12 = n9 = 0;
        do {
            int n13;
            int n14;
            block20 : {
                block18 : {
                    block19 : {
                        block17 : {
                            if (!this.v(s8)) break block17;
                            if (n9 <= 0) {
                                throw new EOFException();
                            }
                            break block18;
                        }
                        this.c.T(0);
                        int n15 = this.c.p();
                        if (n11 != 0 && !f.q(n15, n11) || (n13 = I.j(n15)) == -1) {
                            n11 = n12 + 1;
                            if (n12 == n10) {
                                if (bl) {
                                    return false;
                                }
                                throw A.a("Searched too many bytes.", null);
                            }
                            if (bl) {
                                s8.h();
                                s8.o(n8 + n11);
                            } else {
                                s8.i(1);
                            }
                            n9 = 0;
                            n12 = n11;
                            n11 = n9;
                            continue;
                        }
                        n14 = n9 + 1;
                        if (n14 != 1) break block19;
                        this.d.a(n15);
                        n9 = n15;
                        break block20;
                    }
                    n9 = n11;
                    if (n14 != 4) break block20;
                }
                if (bl) {
                    s8.i(n8 + n12);
                } else {
                    s8.h();
                }
                this.k = n11;
                return true;
            }
            s8.o(n13 - 4);
            n11 = n9;
            n9 = n14;
        } while (true);
    }
}

