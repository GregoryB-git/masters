/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package e2;

import e2.g;
import e2.k;
import e2.p;
import java.util.List;

public abstract class m {
    public static a a() {
        return new g.b();
    }

    public abstract k b();

    public abstract List c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();

    public static abstract class a {
        public abstract m a();

        public abstract a b(k var1);

        public abstract a c(List var1);

        public abstract a d(Integer var1);

        public abstract a e(String var1);

        public abstract a f(p var1);

        public abstract a g(long var1);

        public abstract a h(long var1);

        public a i(int n8) {
            return this.d(n8);
        }

        public a j(String string2) {
            return this.e(string2);
        }
    }

}

