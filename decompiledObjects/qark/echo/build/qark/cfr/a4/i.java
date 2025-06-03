/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Map
 */
package a4;

import V3.k;
import a4.h;
import java.util.Map;

public final class i {
    public final k a;
    public final h b;

    public i(k k8, h h8) {
        this.a = k8;
        this.b = h8;
    }

    public static i a(k k8) {
        return new i(k8, h.i);
    }

    public static i b(k k8, Map map) {
        return new i(k8, h.c(map));
    }

    public d4.h c() {
        return this.b.d();
    }

    public h d() {
        return this.b;
    }

    public k e() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (i.class != object.getClass()) {
                return false;
            }
            object = (i)object;
            if (!this.a.equals(object.a)) {
                return false;
            }
            if (!this.b.equals(object.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.b.p();
    }

    public boolean g() {
        return this.b.u();
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.a);
        stringBuilder.append(":");
        stringBuilder.append((Object)this.b);
        return stringBuilder.toString();
    }
}

