/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package v4;

import v4.b;

public abstract class f {
    public static a a() {
        return new b.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();

    public static abstract class a {
        public abstract f a();

        public abstract a b(b var1);

        public abstract a c(String var1);

        public abstract a d(long var1);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* enum */ b q;
        public static final /* synthetic */ b[] r;

        static {
            b b8;
            b b9;
            b b10;
            o = b8 = new b();
            p = b9 = new b();
            q = b10 = new b();
            r = new b[]{b8, b9, b10};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])r.clone();
        }
    }

}

