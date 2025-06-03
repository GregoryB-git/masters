/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f2;

import c2.b;
import c2.e;
import f2.c;
import f2.p;

public abstract class o {
    public static a a() {
        return new c.b();
    }

    public abstract b b();

    public abstract c2.c c();

    public byte[] d() {
        return (byte[])this.e().apply(this.c().b());
    }

    public abstract e e();

    public abstract p f();

    public abstract String g();

    public static abstract class a {
        public abstract o a();

        public abstract a b(b var1);

        public abstract a c(c2.c var1);

        public abstract a d(e var1);

        public abstract a e(p var1);

        public abstract a f(String var1);
    }

}

