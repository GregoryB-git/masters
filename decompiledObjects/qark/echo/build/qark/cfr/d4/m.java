/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d4;

import d4.b;
import d4.c;
import d4.g;
import d4.n;

public final class m {
    public static final m c = new m(b.n(), g.W());
    public static final m d = new m(b.m(), n.l);
    public final b a;
    public final n b;

    public m(b b8, n n8) {
        this.a = b8;
        this.b = n8;
    }

    public static m a() {
        return d;
    }

    public static m b() {
        return c;
    }

    public b c() {
        return this.a;
    }

    public n d() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (m.class != object.getClass()) {
                return false;
            }
            object = (m)object;
            if (!this.a.equals(object.a)) {
                return false;
            }
            if (!this.b.equals((Object)object.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NamedNode{name=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", node=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

