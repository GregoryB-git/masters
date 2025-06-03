/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package g2;

import g2.b;

public abstract class g {
    public static g a() {
        return new b(a.q, -1L);
    }

    public static g d() {
        return new b(a.r, -1L);
    }

    public static g e(long l8) {
        return new b(a.o, l8);
    }

    public static g f() {
        return new b(a.p, -1L);
    }

    public abstract long b();

    public abstract a c();

    public static final class a
    extends Enum {
        public static final /* enum */ a o;
        public static final /* enum */ a p;
        public static final /* enum */ a q;
        public static final /* enum */ a r;
        public static final /* synthetic */ a[] s;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            o = a8 = new a();
            p = a9 = new a();
            q = a11 = new a();
            r = a10 = new a();
            s = new a[]{a8, a9, a11, a10};
        }

        public static a valueOf(String string2) {
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            return (a[])s.clone();
        }
    }

}

