/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package N0;

import F0.L;
import F0.M;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import N0.d;
import N0.e;
import N0.f;
import Z0.m;
import c1.t;
import d0.q;
import d0.x;
import g0.a;
import g0.z;
import java.util.List;

public final class b
implements r {
    public final z a = new z(6);
    public t b;
    public int c;
    public int d;
    public int e;
    public long f = -1L;
    public U0.a g;
    public s h;
    public d i;
    public m j;

    public static U0.a h(String object, long l8) {
        if (l8 == -1L) {
            return null;
        }
        if ((object = f.a((String)object)) == null) {
            return null;
        }
        return object.a(l8);
    }

    private void m(s object) {
        if (this.d == 65505) {
            Object object2 = new z(this.e);
            object.readFully(object2.e(), 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals((Object)object2.A()) && (object2 = object2.A()) != null) {
                this.g = object = b.h((String)object2, object.a());
                if (object != null) {
                    this.f = object.r;
                }
            }
        } else {
            object.i(this.e);
        }
        this.c = 0;
    }

    @Override
    public void a(long l8, long l9) {
        if (l8 == 0L) {
            this.c = 0;
            this.j = null;
            return;
        }
        if (this.c == 5) {
            ((m)a.e(this.j)).a(l8, l9);
        }
    }

    @Override
    public void b(t t8) {
        this.b = t8;
    }

    public final void c(s s8) {
        this.a.P(2);
        s8.n(this.a.e(), 0, 2);
        s8.o(this.a.M() - 2);
    }

    @Override
    public /* synthetic */ r d() {
        return F0.q.b(this);
    }

    @Override
    public boolean e(s s8) {
        int n8 = this.k(s8);
        boolean bl = false;
        if (n8 != 65496) {
            return false;
        }
        this.d = n8 = this.k(s8);
        if (n8 == 65504) {
            this.c(s8);
            this.d = this.k(s8);
        }
        if (this.d != 65505) {
            return false;
        }
        s8.o(2);
        this.a.P(6);
        s8.n(this.a.e(), 0, 6);
        boolean bl2 = bl;
        if (this.a.I() == 1165519206L) {
            bl2 = bl;
            if (this.a.M() == 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final void f() {
        ((t)a.e(this.b)).j();
        this.b.e(new M.b(-9223372036854775807L));
        this.c = 6;
    }

    @Override
    public /* synthetic */ List g() {
        return F0.q.a(this);
    }

    @Override
    public int i(s s8, L l8) {
        int n8 = this.c;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    long l9;
                    if (n8 != 4) {
                        if (n8 != 5) {
                            if (n8 == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.i == null || s8 != this.h) {
                            this.h = s8;
                            this.i = new d(s8, this.f);
                        }
                        if ((n8 = ((m)a.e(this.j)).i(this.i, l8)) == 1) {
                            l8.a += this.f;
                        }
                        return n8;
                    }
                    long l10 = s8.p();
                    if (l10 != (l9 = this.f)) {
                        l8.a = l9;
                        return 1;
                    }
                    this.o(s8);
                    return 0;
                }
                this.m(s8);
                return 0;
            }
            this.n(s8);
            return 0;
        }
        this.l(s8);
        return 0;
    }

    public final void j(U0.a a8) {
        ((t)a.e(this.b)).a(1024, 4).d(new q.b().Q("image/jpeg").h0(new x(a8)).K());
    }

    public final int k(s s8) {
        this.a.P(2);
        s8.n(this.a.e(), 0, 2);
        return this.a.M();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void l(s s8) {
        block6 : {
            int n8;
            block5 : {
                block4 : {
                    this.a.P(2);
                    s8.readFully(this.a.e(), 0, 2);
                    this.d = n8 = this.a.M();
                    if (n8 != 65498) break block4;
                    if (this.f == -1L) {
                        this.f();
                        return;
                    }
                    n8 = 4;
                    break block5;
                }
                if (n8 >= 65488 && n8 <= 65497 || n8 == 65281) break block6;
                n8 = 1;
            }
            this.c = n8;
            return;
        }
    }

    public final void n(s s8) {
        this.a.P(2);
        s8.readFully(this.a.e(), 0, 2);
        this.e = this.a.M() - 2;
        this.c = 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void o(s s8) {
        block5 : {
            block4 : {
                if (!s8.l(this.a.e(), 0, 1, true)) break block4;
                s8.h();
                if (this.j == null) {
                    this.j = new m(t.a.a, 8);
                }
                s8 = new d(s8, this.f);
                this.i = s8;
                if (this.j.e(s8)) break block5;
            }
            this.f();
            return;
        }
        this.j.b(new e(this.f, (t)a.e(this.b)));
        this.p();
    }

    public final void p() {
        this.j((U0.a)a.e(this.g));
        this.c = 5;
    }

    @Override
    public void release() {
        m m8 = this.j;
        if (m8 != null) {
            m8.release();
        }
    }
}

