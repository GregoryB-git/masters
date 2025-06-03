/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package O3;

public final class e
extends Enum {
    public static final /* enum */ e o;
    public static final /* enum */ e p;
    public static final /* enum */ e q;
    public static final /* synthetic */ e[] r;

    static {
        e e8;
        e e9;
        e e10;
        o = e9 = new e();
        p = e8 = new e();
        q = e10 = new e();
        r = new e[]{e9, e8, e10};
    }

    public static e valueOf(String string2) {
        return (e)Enum.valueOf(e.class, (String)string2);
    }

    public static e[] values() {
        return (e[])r.clone();
    }
}

