/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d0;

import g0.M;

public class t {
    public static final String c = M.w0(0);
    public static final String d = M.w0(1);
    public final String a;
    public final String b;

    public t(String string2, String string3) {
        this.a = M.L0(string2);
        this.b = string3;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (this.getClass() != object.getClass()) {
                return false;
            }
            object = (t)object;
            if (M.c(this.a, object.a) && M.c(this.b, object.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.b.hashCode();
        String string2 = this.a;
        int n9 = string2 != null ? string2.hashCode() : 0;
        return n8 * 31 + n9;
    }
}

