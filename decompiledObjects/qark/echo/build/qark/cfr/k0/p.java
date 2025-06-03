/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package k0;

import d0.q;
import g0.a;

public final class p {
    public final String a;
    public final q b;
    public final q c;
    public final int d;
    public final int e;

    public p(String string2, q q8, q q9, int n8, int n9) {
        boolean bl = n8 == 0 || n9 == 0;
        a.a(bl);
        this.a = a.d(string2);
        this.b = (q)a.e(q8);
        this.c = (q)a.e(q9);
        this.d = n8;
        this.e = n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (p.class != object.getClass()) {
                return false;
            }
            object = (p)object;
            if (this.d == object.d && this.e == object.e && this.a.equals((Object)object.a) && this.b.equals(object.b) && this.c.equals(object.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.d) * 31 + this.e) * 31 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
}

