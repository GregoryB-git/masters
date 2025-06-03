/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package H3;

public final class z
extends Enum {
    public static final /* enum */ z p;
    public static final /* enum */ z q;
    public static final /* enum */ z r;
    public static final /* enum */ z s;
    public static final /* synthetic */ z[] t;
    public final int o;

    static {
        z z8;
        z z9;
        z z10;
        z z11;
        p = z8 = new z(1);
        q = z9 = new z(2);
        r = z11 = new z(3);
        s = z10 = new z(4);
        t = new z[]{z8, z9, z11, z10};
    }

    public z(int n9) {
        this.o = n9;
    }

    public static z c(String string2) {
        if (string2 != null) {
            return s;
        }
        return p;
    }

    public static z valueOf(String string2) {
        return (z)Enum.valueOf(z.class, (String)string2);
    }

    public static z[] values() {
        return (z[])t.clone();
    }

    public int e() {
        return this.o;
    }

    public String toString() {
        return Integer.toString((int)this.o);
    }
}

