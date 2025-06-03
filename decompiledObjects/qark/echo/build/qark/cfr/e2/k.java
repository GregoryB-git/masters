/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e2;

import e2.e;

public abstract class k {
    public static a a() {
        return new e.b();
    }

    public abstract e2.a b();

    public abstract b c();

    public static abstract class a {
        public abstract k a();

        public abstract a b(e2.a var1);

        public abstract a c(b var1);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* synthetic */ b[] r;
        public final int o;

        static {
            b b8;
            b b9;
            p = b9 = new b(0);
            q = b8 = new b(23);
            r = new b[]{b9, b8};
        }

        public b(int n9) {
            this.o = n9;
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])r.clone();
        }
    }

}

