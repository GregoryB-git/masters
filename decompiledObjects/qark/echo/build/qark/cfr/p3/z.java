/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package p3;

import com.google.crypto.tink.shaded.protobuf.z;

public final class z
extends Enum
implements z.a {
    public static final /* enum */ z p;
    public static final /* enum */ z q;
    public static final /* enum */ z r;
    public static final /* enum */ z s;
    public static final /* enum */ z t;
    public static final z.b u;
    public static final /* synthetic */ z[] v;
    public final int o;

    static {
        z z8;
        z z9;
        z z10;
        z z11;
        z z12;
        p = z12 = new z(0);
        q = z9 = new z(1);
        r = z8 = new z(2);
        s = z11 = new z(3);
        t = z10 = new z(-1);
        v = new z[]{z12, z9, z8, z11, z10};
        u = new z.b(){};
    }

    public z(int n9) {
        this.o = n9;
    }

    public static z c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        return null;
                    }
                    return s;
                }
                return r;
            }
            return q;
        }
        return p;
    }

    public static z valueOf(String string2) {
        return (z)Enum.valueOf(z.class, (String)string2);
    }

    public static z[] values() {
        return (z[])v.clone();
    }

    public final int g() {
        if (this != t) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

}

