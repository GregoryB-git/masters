/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package a1;

import F0.L;
import F0.M;
import F0.T;
import F0.s;
import F0.t;
import a1.a;
import a1.e;
import a1.f;
import a1.g;
import d0.q;
import g0.M;
import g0.z;

public abstract class i {
    public final e a = new e();
    public T b;
    public t c;
    public g d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public b j = new b();
    public long k;
    public boolean l;
    public boolean m;

    public final void a() {
        g0.a.h(this.b);
        M.i(this.c);
    }

    public long b(long l8) {
        return l8 * 1000000L / (long)this.i;
    }

    public long c(long l8) {
        return (long)this.i * l8 / 1000000L;
    }

    public void d(t t8, T t9) {
        this.c = t8;
        this.b = t9;
        this.l(true);
    }

    public void e(long l8) {
        this.g = l8;
    }

    public abstract long f(z var1);

    public final int g(s s8, L l8) {
        this.a();
        int n8 = this.h;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                M.i(this.d);
                return this.k(s8, l8);
            }
            s8.i((int)this.f);
            this.h = 2;
            return 0;
        }
        return this.j(s8);
    }

    public final boolean h(s s8) {
        do {
            if (!this.a.d(s8)) {
                this.h = 3;
                return false;
            }
            this.k = s8.p() - this.f;
            if (!this.i(this.a.c(), this.f, this.j)) break;
            this.f = s8.p();
        } while (true);
        return true;
    }

    public abstract boolean i(z var1, long var2, b var4);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final int j(s var1_1) {
        block4 : {
            if (!this.h((s)var1_1)) {
                return -1;
            }
            var3_2 = this.j.a;
            this.i = var3_2.C;
            if (!this.m) {
                this.b.d((q)var3_2);
                this.m = true;
            }
            if ((var3_2 = this.j.b) == null) break block4;
            var1_1 = var3_2;
            ** GOTO lbl14
        }
        if (var1_1.a() == -1L) {
            var1_1 = new c(null);
lbl14: // 2 sources:
            this.d = var1_1;
        } else {
            var3_2 = this.a.b();
            var2_3 = (var3_2.b & 4) != 0;
            this.d = new a(this, this.f, var1_1.a(), var3_2.h + var3_2.i, var3_2.c, var2_3);
        }
        this.h = 2;
        this.a.f();
        return 0;
    }

    public final int k(s object, L object2) {
        long l8;
        long l9 = this.d.c((s)object);
        if (l9 >= 0L) {
            object2.a = l9;
            return 1;
        }
        if (l9 < -1L) {
            this.e(- l9 + 2L);
        }
        if (!this.l) {
            object2 = (F0.M)g0.a.h(this.d.a());
            this.c.e((F0.M)object2);
            this.l = true;
        }
        if (this.k <= 0L && !this.a.d((s)object)) {
            this.h = 3;
            return -1;
        }
        this.k = 0L;
        object = this.a.c();
        l9 = this.f((z)object);
        if (l9 >= 0L && (l8 = this.g) + l9 >= this.e) {
            l8 = this.b(l8);
            this.b.e((z)object, object.g());
            this.b.b(l8, 1, object.g(), 0, null);
            this.e = -1L;
        }
        this.g += l9;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void l(boolean bl) {
        int n8;
        if (bl) {
            this.j = new b();
            this.f = 0L;
            n8 = 0;
        } else {
            n8 = 1;
        }
        this.h = n8;
        this.e = -1L;
        this.g = 0L;
    }

    public final void m(long l8, long l9) {
        this.a.e();
        if (l8 == 0L) {
            this.l(this.l ^ true);
            return;
        }
        if (this.h != 0) {
            this.e = this.c(l9);
            ((g)M.i(this.d)).b(this.e);
            this.h = 2;
        }
    }

    public static class b {
        public q a;
        public g b;
    }

    public static final class c
    implements g {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        @Override
        public F0.M a() {
            return new M.b(-9223372036854775807L);
        }

        @Override
        public void b(long l8) {
        }

        @Override
        public long c(s s8) {
            return -1L;
        }
    }

}

