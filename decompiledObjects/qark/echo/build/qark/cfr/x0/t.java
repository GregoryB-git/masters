/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 */
package x0;

import android.util.Pair;
import d0.I;
import d0.u;
import g0.M;
import x0.X;
import x0.b0;
import x0.h;
import x0.p;
import x0.s;
import x0.v;
import x0.x;

public final class t
extends b0 {
    public final boolean m;
    public final I.c n;
    public final I.b o;
    public a p;
    public s q;
    public boolean r;
    public boolean s;
    public boolean t;

    public t(x x8, boolean bl) {
        super(x8);
        bl = bl && x8.i();
        this.m = bl;
        this.n = new I.c();
        this.o = new I.b();
        I i8 = x8.j();
        if (i8 != null) {
            this.p = a.v(i8, null, null);
            this.t = true;
            return;
        }
        this.p = a.u(x8.a());
    }

    @Override
    public void B() {
        this.s = false;
        this.r = false;
        h.super.B();
    }

    @Override
    public x.b N(x.b b8) {
        return b8.a(this.X(b8.a));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void S(I var1_1) {
        block6 : {
            block5 : {
                if (!this.s) break block5;
                this.p = this.p.t((I)var1_1);
                var1_1 = this.q;
                if (var1_1 != null) {
                    this.a0(var1_1.j());
                }
                ** GOTO lbl-1000
            }
            if (!var1_1.q()) break block6;
            var1_1 = this.t != false ? this.p.t((I)var1_1) : a.v((I)var1_1, I.c.q, a.h);
            this.p = var1_1;
            ** GOTO lbl-1000
        }
        var1_1.n(0, this.n);
        var2_2 = this.n.c();
        var6_3 = this.n.a;
        var7_4 = this.q;
        if (var7_4 != null) {
            var4_5 = var7_4.r();
            this.p.h(this.q.o.a, this.o);
            var4_5 = this.o.n() + var4_5;
            if (var4_5 != this.p.n(0, this.n).c()) {
                var2_2 = var4_5;
            }
        }
        var7_4 = var1_1.j(this.n, this.o, 0, var2_2);
        var8_6 = var7_4.first;
        var2_2 = (Long)var7_4.second;
        var1_1 = this.t != false ? this.p.t((I)var1_1) : a.v((I)var1_1, var6_3, var8_6);
        this.p = var1_1;
        var1_1 = this.q;
        if (var1_1 != null && this.a0(var2_2)) {
            var1_1 = var1_1.o;
            var1_1 = var1_1.a(this.Y(var1_1.a));
        } else lbl-1000: // 3 sources:
        {
            var1_1 = null;
        }
        this.t = true;
        this.s = true;
        this.A(this.p);
        if (var1_1 == null) return;
        ((s)g0.a.e(this.q)).a((x.b)var1_1);
    }

    @Override
    public void V() {
        if (!this.m) {
            this.r = true;
            this.U();
        }
    }

    public s W(x.b b8, B0.b object, long l8) {
        object = new s(b8, (B0.b)object, l8);
        object.y(this.k);
        if (this.s) {
            object.a(b8.a(this.Y(b8.a)));
            return object;
        }
        this.q = object;
        if (!this.r) {
            this.r = true;
            this.U();
        }
        return object;
    }

    public final Object X(Object object) {
        Object object2 = object;
        if (this.p.g != null) {
            object2 = object;
            if (this.p.g.equals(object)) {
                object2 = a.h;
            }
        }
        return object2;
    }

    public final Object Y(Object object) {
        Object object2 = object;
        if (this.p.g != null) {
            object2 = object;
            if (object.equals(a.h)) {
                object2 = this.p.g;
            }
        }
        return object2;
    }

    public I Z() {
        return this.p;
    }

    public final boolean a0(long l8) {
        s s8 = this.q;
        int n8 = this.p.b(s8.o.a);
        if (n8 == -1) {
            return false;
        }
        long l9 = this.p.f((int)n8, (I.b)this.o).d;
        long l10 = l8;
        if (l9 != -9223372036854775807L) {
            l10 = l8;
            if (l8 >= l9) {
                l10 = Math.max((long)0L, (long)(l9 - 1L));
            }
        }
        s8.w(l10);
        return true;
    }

    @Override
    public void e(v v8) {
        ((s)v8).x();
        if (v8 == this.q) {
            this.q = null;
        }
    }

    @Override
    public void h() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(u u8) {
        a a8 = this.t ? this.p.t(new X(this.p.e, u8)) : a.u(u8);
        this.p = a8;
        this.k.l(u8);
    }

    public static final class a
    extends p {
        public static final Object h = new Object();
        public final Object f;
        public final Object g;

        public a(I i8, Object object, Object object2) {
            super(i8);
            this.f = object;
            this.g = object2;
        }

        public static a u(u u8) {
            return new a(new b(u8), I.c.q, h);
        }

        public static a v(I i8, Object object, Object object2) {
            return new a(i8, object, object2);
        }

        @Override
        public int b(Object object) {
            I i8 = this.e;
            Object object2 = object;
            if (h.equals(object)) {
                Object object3 = this.g;
                object2 = object;
                if (object3 != null) {
                    object2 = object3;
                }
            }
            return i8.b(object2);
        }

        @Override
        public I.b g(int n8, I.b b8, boolean bl) {
            this.e.g(n8, b8, bl);
            if (M.c(b8.b, this.g) && bl) {
                b8.b = h;
            }
            return b8;
        }

        @Override
        public Object m(int n8) {
            Object object;
            Object object2 = object = this.e.m(n8);
            if (M.c(object, this.g)) {
                object2 = h;
            }
            return object2;
        }

        @Override
        public I.c o(int n8, I.c c8, long l8) {
            this.e.o(n8, c8, l8);
            if (M.c(c8.a, this.f)) {
                c8.a = I.c.q;
            }
            return c8;
        }

        public a t(I i8) {
            return new a(i8, this.f, this.g);
        }
    }

    public static final class b
    extends I {
        public final u e;

        public b(u u8) {
            this.e = u8;
        }

        @Override
        public int b(Object object) {
            if (object == a.h) {
                return 0;
            }
            return -1;
        }

        @Override
        public I.b g(int n8, I.b b8, boolean bl) {
            Object object = null;
            Integer n9 = bl ? Integer.valueOf((int)0) : null;
            if (bl) {
                object = a.h;
            }
            b8.t((Object)n9, object, 0, -9223372036854775807L, 0L, d0.a.g, true);
            return b8;
        }

        @Override
        public int i() {
            return 1;
        }

        @Override
        public Object m(int n8) {
            return a.h;
        }

        @Override
        public I.c o(int n8, I.c c8, long l8) {
            c8.g(I.c.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            c8.k = true;
            return c8;
        }

        @Override
        public int p() {
            return 1;
        }
    }

}

