/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.util.List
 */
package K0;

import F0.A;
import F0.B;
import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import F0.y;
import F0.z;
import K0.b;
import K0.c;
import d0.q;
import d0.x;
import g0.a;
import java.util.List;

public final class d
implements r {
    public static final F0.x o = new c();
    public final byte[] a = new byte[42];
    public final g0.z b = new g0.z(new byte[32768], 0);
    public final boolean c;
    public final y.a d;
    public t e;
    public T f;
    public int g;
    public x h;
    public B i;
    public int j;
    public int k;
    public b l;
    public int m;
    public long n;

    public d() {
        this(0);
    }

    public d(int n8) {
        boolean bl = true;
        if ((n8 & 1) == 0) {
            bl = false;
        }
        this.c = bl;
        this.d = new y.a();
        this.g = 0;
    }

    public static /* synthetic */ r[] c() {
        return d.l();
    }

    private static /* synthetic */ r[] l() {
        return new r[]{new d()};
    }

    @Override
    public void a(long l8, long l9) {
        long l10 = 0L;
        if (l8 == 0L) {
            this.g = 0;
        } else {
            b b8 = this.l;
            if (b8 != null) {
                b8.h(l9);
            }
        }
        l8 = l9 == 0L ? l10 : -1L;
        this.n = l8;
        this.m = 0;
        this.b.P(0);
    }

    @Override
    public void b(t t8) {
        this.e = t8;
        this.f = t8.a(0, 1);
        t8.j();
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        z.c(s8, false);
        return z.a(s8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long f(g0.z z8, boolean bl) {
        int n8;
        a.e(this.i);
        for (n8 = z8.f(); n8 <= z8.g() - 16; ++n8) {
            z8.T(n8);
            if (!y.d(z8, this.i, this.k, this.d)) continue;
            z8.T(n8);
            return this.d.a;
        }
        if (!bl) {
            z8.T(n8);
            return -1L;
        }
        do {
            block7 : {
                if (n8 > z8.g() - this.j) {
                    z8.T(z8.g());
                    return -1L;
                }
                z8.T(n8);
                try {
                    bl = y.d(z8, this.i, this.k, this.d);
                    break block7;
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                bl = false;
            }
            if (z8.f() > z8.g()) {
                // empty if block
            }
            ++n8;
        } while (true);
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    public final void h(s s8) {
        this.k = z.b(s8);
        ((t)g0.M.i(this.e)).e(this.j(s8.p(), s8.a()));
        this.g = 5;
    }

    @Override
    public int i(s s8, L l8) {
        int n8 = this.g;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 == 5) {
                                return this.n(s8, l8);
                            }
                            throw new IllegalStateException();
                        }
                        this.h(s8);
                        return 0;
                    }
                    this.p(s8);
                    return 0;
                }
                this.q(s8);
                return 0;
            }
            this.k(s8);
            return 0;
        }
        this.o(s8);
        return 0;
    }

    public final M j(long l8, long l9) {
        a.e(this.i);
        Object object = this.i;
        if (object.k != null) {
            return new A((B)object, l8);
        }
        if (l9 != -1L && object.j > 0L) {
            this.l = object = new b((B)object, this.k, l8, l9);
            return object.b();
        }
        return new M.b(object.f());
    }

    public final void k(s s8) {
        byte[] arrby = this.a;
        s8.n(arrby, 0, arrby.length);
        s8.h();
        this.g = 2;
    }

    public final void m() {
        long l8 = this.n * 1000000L / (long)((B)g0.M.i((Object)this.i)).e;
        ((T)g0.M.i(this.f)).b(l8, 1, this.m, 0, null);
    }

    public final int n(s object, L l8) {
        boolean bl;
        int n8;
        a.e(this.f);
        a.e(this.i);
        b b8 = this.l;
        if (b8 != null && b8.d()) {
            return this.l.c((s)object, l8);
        }
        if (this.n == -1L) {
            this.n = y.i((s)object, this.i);
            return 0;
        }
        int n9 = this.b.g();
        if (n9 < 32768) {
            n8 = object.read(this.b.e(), n9, 32768 - n9);
            bl = n8 == -1;
            if (!bl) {
                this.b.S(n9 + n8);
            } else if (this.b.a() == 0) {
                this.m();
                return -1;
            }
        } else {
            bl = false;
        }
        n9 = this.b.f();
        n8 = this.m;
        int n10 = this.j;
        if (n8 < n10) {
            object = this.b;
            object.U(Math.min((int)(n10 - n8), (int)object.a()));
        }
        long l9 = this.f(this.b, bl);
        n8 = this.b.f() - n9;
        this.b.T(n9);
        this.f.e(this.b, n8);
        this.m += n8;
        if (l9 != -1L) {
            this.m();
            this.m = 0;
            this.n = l9;
        }
        if (this.b.a() < 16) {
            n9 = this.b.a();
            System.arraycopy((Object)this.b.e(), (int)this.b.f(), (Object)this.b.e(), (int)0, (int)n9);
            this.b.T(0);
            this.b.S(n9);
        }
        return 0;
    }

    public final void o(s s8) {
        this.h = z.d(s8, this.c ^ true);
        this.g = 1;
    }

    public final void p(s s8) {
        z.a a8 = new z.a(this.i);
        boolean bl = false;
        while (!bl) {
            bl = z.e(s8, a8);
            this.i = (B)g0.M.i(a8.a);
        }
        a.e(this.i);
        this.j = Math.max((int)this.i.c, (int)6);
        ((T)g0.M.i(this.f)).d(this.i.g(this.a, this.h));
        this.g = 4;
    }

    public final void q(s s8) {
        z.i(s8);
        this.g = 3;
    }

    @Override
    public void release() {
    }
}

