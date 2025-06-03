/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.android.gms.internal.measurement;

public final class Q7
extends Enum {
    public static final /* enum */ Q7 p;
    public static final /* enum */ Q7 q;
    public static final /* enum */ Q7 r;
    public static final /* enum */ Q7 s;
    public static final /* enum */ Q7 t;
    public static final /* synthetic */ Q7[] u;
    public final int o;

    static {
        Q7 q72;
        Q7 q73;
        Q7 q74;
        Q7 q75;
        Q7 q76;
        p = q73 = new Q7(3);
        q = q74 = new Q7(6);
        r = q75 = new Q7(4);
        s = q76 = new Q7(2);
        t = q72 = new Q7(5);
        u = new Q7[]{q73, q74, q75, q76, q72};
    }

    public Q7(int n9) {
        this.o = n9;
    }

    public static Q7 c(int n8) {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 5) {
                    if (n8 != 6) {
                        return r;
                    }
                    return q;
                }
                return t;
            }
            return p;
        }
        return s;
    }

    public static Q7[] values() {
        return (Q7[])u.clone();
    }
}

