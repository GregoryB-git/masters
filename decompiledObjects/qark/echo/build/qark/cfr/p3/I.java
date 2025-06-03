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

public final class I
extends Enum
implements z.a {
    public static final /* enum */ I p;
    public static final /* enum */ I q;
    public static final /* enum */ I r;
    public static final /* enum */ I s;
    public static final /* enum */ I t;
    public static final /* enum */ I u;
    public static final z.b v;
    public static final /* synthetic */ I[] w;
    public final int o;

    static {
        I i8;
        I i9;
        I i10;
        I i11;
        I i12;
        I i13;
        p = i12 = new I(0);
        q = i10 = new I(1);
        r = i9 = new I(2);
        s = i13 = new I(3);
        t = i8 = new I(4);
        u = i11 = new I(-1);
        w = new I[]{i12, i10, i9, i13, i8, i11};
        v = new z.b(){};
    }

    public I(int n9) {
        this.o = n9;
    }

    public static I c(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            return null;
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

    public static I valueOf(String string2) {
        return (I)Enum.valueOf(I.class, (String)string2);
    }

    public static I[] values() {
        return (I[])w.clone();
    }

    public final int g() {
        if (this != u) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

}

