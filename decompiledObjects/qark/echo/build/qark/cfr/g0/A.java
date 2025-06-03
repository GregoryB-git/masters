/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g0;

import g0.a;

public final class A {
    public static final A c = new A(-1, -1);
    public static final A d = new A(0, 0);
    public final int a;
    public final int b;

    public A(int n8, int n9) {
        boolean bl = !(n8 != -1 && n8 < 0 || n9 != -1 && n9 < 0);
        a.a(bl);
        this.a = n8;
        this.b = n9;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public boolean equals(Object object) {
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        boolean bl2 = bl;
        if (object instanceof A) {
            object = (A)object;
            bl2 = bl;
            if (this.a == object.a) {
                bl2 = bl;
                if (this.b == object.b) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        int n8 = this.b;
        int n9 = this.a;
        return n8 ^ (n9 >>> 16 | n9 << 16);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("x");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

