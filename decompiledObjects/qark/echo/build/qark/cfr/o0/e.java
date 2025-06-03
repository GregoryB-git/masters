/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package o0;

import g0.M;

public final class e {
    public final String a;
    public final String b;
    public final String c;

    public e(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (e.class != object.getClass()) {
                return false;
            }
            object = (e)object;
            if (M.c(this.a, object.a) && M.c(this.b, object.b) && M.c(this.c, object.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int n8 = this.a.hashCode();
        String string2 = this.b;
        int n9 = 0;
        int n10 = string2 != null ? string2.hashCode() : 0;
        string2 = this.c;
        if (string2 != null) {
            n9 = string2.hashCode();
        }
        return (n8 * 31 + n10) * 31 + n9;
    }
}

