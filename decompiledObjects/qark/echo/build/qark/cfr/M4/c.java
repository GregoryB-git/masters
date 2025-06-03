/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package M4;

public final class c
extends Enum {
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* synthetic */ c[] v;
    public String o;

    static {
        c c8;
        c c9;
        c c10;
        c c11;
        c c12;
        c c13;
        p = c11 = new c("_as");
        q = c12 = new c("_astui");
        r = c13 = new c("_astfd");
        s = c8 = new c("_asti");
        t = c9 = new c("_fs");
        u = c10 = new c("_bs");
        v = new c[]{c11, c12, c13, c8, c9, c10};
    }

    public c(String string3) {
        this.o = string3;
    }

    public static c valueOf(String string2) {
        return (c)Enum.valueOf(c.class, (String)string2);
    }

    public static c[] values() {
        return (c[])v.clone();
    }

    public String toString() {
        return this.o;
    }
}

