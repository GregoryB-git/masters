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

public final class u
extends Enum
implements z.a {
    public static final /* enum */ u p;
    public static final /* enum */ u q;
    public static final /* enum */ u r;
    public static final /* enum */ u s;
    public static final /* enum */ u t;
    public static final /* enum */ u u;
    public static final /* enum */ u v;
    public static final z.b w;
    public static final /* synthetic */ u[] x;
    public final int o;

    static {
        u u8;
        u u9;
        u u10;
        u u11;
        u u12;
        u u13;
        u u14;
        p = u13 = new u(0);
        q = u10 = new u(1);
        r = u12 = new u(2);
        s = u9 = new u(3);
        t = u8 = new u(4);
        u = u14 = new u(5);
        v = u11 = new u(-1);
        x = new u[]{u13, u10, u12, u9, u8, u14, u11};
        w = new z.b(){};
    }

    public u(int n9) {
        this.o = n9;
    }

    public static u c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) {
                                return null;
                            }
                            return u;
                        }
                        return t;
                    }
                    return s;
                }
                return r;
            }
            return q;
        }
        return p;
    }

    public static u valueOf(String string2) {
        return (u)Enum.valueOf(u.class, (String)string2);
    }

    public static u[] values() {
        return (u[])x.clone();
    }

    public final int g() {
        if (this != v) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

}

