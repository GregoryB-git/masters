/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package z2;

import A2.m;
import y2.a;

public final class b {
    public final int a;
    public final a b;
    public final a.d c;
    public final String d;

    public b(a a8, a.d d8, String string2) {
        this.b = a8;
        this.c = d8;
        this.d = string2;
        this.a = m.b(a8, d8, string2);
    }

    public static b a(a a8, a.d d8, String string2) {
        return new b(a8, d8, string2);
    }

    public final String b() {
        return this.b.b();
    }

    public final boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (m.a(this.b, object.b) && m.a(this.c, object.c) && m.a(this.d, object.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}

