/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package B3;

import B3.E;
import B3.F;

public final class r {
    public final F a;
    public final int b;
    public final int c;

    public r(F f8, int n8, int n9) {
        this.a = (F)E.c(f8, "Null dependency anInterface.");
        this.b = n8;
        this.c = n9;
    }

    public r(Class class_, int n8, int n9) {
        this(F.b(class_), n8, n9);
    }

    public static r a(Class class_) {
        return new r(class_, 0, 2);
    }

    public static String b(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    return "deferred";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported injection: ");
                stringBuilder.append(n8);
                throw new AssertionError((Object)stringBuilder.toString());
            }
            return "provider";
        }
        return "direct";
    }

    public static r h(Class class_) {
        return new r(class_, 0, 0);
    }

    public static r i(Class class_) {
        return new r(class_, 0, 1);
    }

    public static r j(F f8) {
        return new r(f8, 1, 0);
    }

    public static r k(Class class_) {
        return new r(class_, 1, 0);
    }

    public static r l(F f8) {
        return new r(f8, 1, 1);
    }

    public static r m(Class class_) {
        return new r(class_, 1, 1);
    }

    public static r n(Class class_) {
        return new r(class_, 2, 0);
    }

    public F c() {
        return this.a;
    }

    public boolean d() {
        if (this.c == 2) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof r;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (r)object;
            bl3 = bl;
            if (this.a.equals(object.a)) {
                bl3 = bl;
                if (this.b == object.b) {
                    bl3 = bl;
                    if (this.c == object.c) {
                        bl3 = true;
                    }
                }
            }
        }
        return bl3;
    }

    public boolean f() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Dependency{anInterface=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", type=");
        int n8 = this.b;
        String string2 = n8 == 1 ? "required" : (n8 == 0 ? "optional" : "set");
        stringBuilder.append(string2);
        stringBuilder.append(", injection=");
        stringBuilder.append(r.b(this.c));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

