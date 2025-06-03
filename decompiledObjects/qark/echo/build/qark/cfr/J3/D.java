/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package J3;

import E3.e;
import J3.A;
import J3.x;
import J3.y;
import J3.z;

public abstract class D {
    public static D b(a a8, c c8, b b8) {
        return new x(a8, c8, b8);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();

    public static abstract class a {
        public static a b(String string2, String string3, String string4, String string5, int n8, e e8) {
            return new y(string2, string3, string4, string5, n8, e8);
        }

        public abstract String a();

        public abstract int c();

        public abstract e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class b {
        public static b c(int n8, String string2, int n9, long l8, long l9, boolean bl, int n10, String string3, String string4) {
            return new z(n8, string2, n9, l8, l9, bl, n10, string3, string4);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static c a(String string2, String string3, boolean bl) {
            return new A(string2, string3, bl);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

}

