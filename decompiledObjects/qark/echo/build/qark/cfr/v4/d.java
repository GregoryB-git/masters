/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package v4;

import v4.a;
import v4.f;

public abstract class d {
    public static a a() {
        return new a.b();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();

    public static abstract class a {
        public abstract d a();

        public abstract a b(f var1);

        public abstract a c(String var1);

        public abstract a d(String var1);

        public abstract a e(b var1);

        public abstract a f(String var1);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* synthetic */ b[] q;

        static {
            b b8;
            b b9;
            o = b8 = new b();
            p = b9 = new b();
            q = new b[]{b8, b9};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }
    }

}

