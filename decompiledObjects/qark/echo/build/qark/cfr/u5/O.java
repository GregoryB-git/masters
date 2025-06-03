/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package u5;

public final class O
extends Enum {
    public static final /* enum */ O o = new O();
    public static final /* enum */ O p = new O();
    public static final /* enum */ O q = new O();
    public static final /* synthetic */ O[] r;

    static {
        r = O.c();
    }

    public static /* synthetic */ O[] c() {
        return new O[]{o, p, q};
    }

    public static O valueOf(String string2) {
        return (O)Enum.valueOf(O.class, (String)string2);
    }

    public static O[] values() {
        return (O[])r.clone();
    }
}

