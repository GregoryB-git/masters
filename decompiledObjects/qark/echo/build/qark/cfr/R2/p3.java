/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import R2.q3;

public final class p3
extends Enum {
    public static final /* enum */ p3 p;
    public static final /* enum */ p3 q;
    public static final /* synthetic */ p3[] r;
    public final q3.a[] o;

    static {
        p3 p32;
        p3 p33;
        p = p32 = new p3(q3.a.p, q3.a.q);
        q = p33 = new p3(q3.a.r);
        r = new p3[]{p32, p33};
    }

    public /* varargs */ p3(q3.a ... arra) {
        this.o = arra;
    }

    public static p3[] values() {
        return (p3[])r.clone();
    }

    public final q3.a[] c() {
        return this.o;
    }
}

