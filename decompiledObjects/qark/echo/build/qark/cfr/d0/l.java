/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package d0;

import g0.M;
import g0.a;

public final class l {
    public static final l e = new b(0).e();
    public static final String f = M.w0(0);
    public static final String g = M.w0(1);
    public static final String h = M.w0(2);
    public static final String i = M.w0(3);
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public l(b b8) {
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
    }

    public /* synthetic */ l(b b8,  a8) {
        this(b8);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof l)) {
            return false;
        }
        object = (l)object;
        if (this.a == object.a && this.b == object.b && this.c == object.c && M.c(this.d, object.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a;
        int n9 = this.b;
        int n10 = this.c;
        String string2 = this.d;
        int n11 = string2 == null ? 0 : string2.hashCode();
        return (((527 + n8) * 31 + n9) * 31 + n10) * 31 + n11;
    }

    public static final class b {
        public final int a;
        public int b;
        public int c;
        public String d;

        public b(int n8) {
            this.a = n8;
        }

        public l e() {
            boolean bl = this.b <= this.c;
            a.a(bl);
            return new l(this, null);
        }

        public b f(int n8) {
            this.c = n8;
            return this;
        }

        public b g(int n8) {
            this.b = n8;
            return this;
        }
    }

}

