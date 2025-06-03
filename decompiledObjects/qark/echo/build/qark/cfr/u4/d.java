/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package u4;

import u4.a;
import u4.c;

public abstract class d {
    public static d a = d.a().a();

    public static a a() {
        return new a.b().h(0L).g(c.a.o).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        if (this.g() == c.a.s) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.g() != c.a.p && this.g() != c.a.o) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (this.g() == c.a.r) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (this.g() == c.a.q) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.g() == c.a.o) {
            return true;
        }
        return false;
    }

    public abstract a n();

    public d o(String string2, long l8, long l9) {
        return this.n().b(string2).c(l8).h(l9).a();
    }

    public d p() {
        return this.n().b(null).a();
    }

    public d q(String string2) {
        return this.n().e(string2).g(c.a.s).a();
    }

    public d r() {
        return this.n().g(c.a.p).a();
    }

    public d s(String string2, String string3, long l8, String string4, long l9) {
        return this.n().d(string2).g(c.a.r).b(string4).f(string3).c(l9).h(l8).a();
    }

    public d t(String string2) {
        return this.n().d(string2).g(c.a.q).a();
    }

    public static abstract class a {
        public abstract d a();

        public abstract a b(String var1);

        public abstract a c(long var1);

        public abstract a d(String var1);

        public abstract a e(String var1);

        public abstract a f(String var1);

        public abstract a g(c.a var1);

        public abstract a h(long var1);
    }

}

