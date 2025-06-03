/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package e2;

import e2.f;
import e2.o;

public abstract class l {
    public static a a() {
        return new f.b();
    }

    public static a i(String string2) {
        return l.a().g(string2);
    }

    public static a j(byte[] arrby) {
        return l.a().f(arrby);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();

    public static abstract class a {
        public abstract l a();

        public abstract a b(Integer var1);

        public abstract a c(long var1);

        public abstract a d(long var1);

        public abstract a e(o var1);

        public abstract a f(byte[] var1);

        public abstract a g(String var1);

        public abstract a h(long var1);
    }

}

