/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package o0;

import g0.M;

public final class h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public h(String string2, String string3, String string4, String string5, String string6) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof h)) {
            return false;
        }
        object = (h)object;
        if (M.c(this.a, object.a) && M.c(this.b, object.b) && M.c(this.c, object.c) && M.c(this.d, object.d) && M.c(this.e, object.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.a;
        int n8 = 0;
        int n9 = string2 != null ? string2.hashCode() : 0;
        string2 = this.b;
        int n10 = string2 != null ? string2.hashCode() : 0;
        string2 = this.c;
        int n11 = string2 != null ? string2.hashCode() : 0;
        string2 = this.d;
        int n12 = string2 != null ? string2.hashCode() : 0;
        string2 = this.e;
        if (string2 != null) {
            n8 = string2.hashCode();
        }
        return ((((527 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }
}

