/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package d0;

import g0.M;

public final class P {
    public static final P e = new P(0, 0);
    public static final String f = M.w0(0);
    public static final String g = M.w0(1);
    public static final String h = M.w0(2);
    public static final String i = M.w0(3);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public P(int n8, int n9) {
        this(n8, n9, 0, 1.0f);
    }

    public P(int n8, int n9, int n10, float f8) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = f8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof P) {
            object = (P)object;
            if (this.a == object.a && this.b == object.b && this.c == object.c && this.d == object.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((217 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Float.floatToRawIntBits((float)this.d);
    }
}

