/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package o0;

import W2.k;

public final class b {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public b(String string2, String string3, int n8, int n9) {
        this.a = string2;
        this.b = string3;
        this.c = n8;
        this.d = n9;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (this.c == object.c && this.d == object.d && k.a(this.a, object.a) && k.a(this.b, object.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return k.b(this.a, this.b, this.c, this.d);
    }
}

