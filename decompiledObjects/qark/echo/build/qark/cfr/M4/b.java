/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package M4;

public final class b
extends Enum {
    public static final /* enum */ b p;
    public static final /* enum */ b q;
    public static final /* enum */ b r;
    public static final /* enum */ b s;
    public static final /* enum */ b t;
    public static final /* enum */ b u;
    public static final /* synthetic */ b[] v;
    public String o;

    static {
        b b8;
        b b9;
        b b10;
        b b11;
        b b12;
        b b13;
        p = b12 = new b("_fstec");
        q = b9 = new b("_fsntc");
        r = b11 = new b("_tsns");
        s = b8 = new b("_fr_tot");
        t = b10 = new b("_fr_slo");
        u = b13 = new b("_fr_fzn");
        v = new b[]{b12, b9, b11, b8, b10, b13};
    }

    public b(String string3) {
        this.o = string3;
    }

    public static b valueOf(String string2) {
        return (b)Enum.valueOf(b.class, (String)string2);
    }

    public static b[] values() {
        return (b[])v.clone();
    }

    public String toString() {
        return this.o;
    }
}

