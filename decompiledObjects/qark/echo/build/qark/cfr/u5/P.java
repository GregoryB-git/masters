/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package u5;

public final class P
extends Enum {
    public static final /* enum */ P o = new P();
    public static final /* enum */ P p = new P();
    public static final /* synthetic */ P[] q;

    static {
        q = P.c();
    }

    public static /* synthetic */ P[] c() {
        return new P[]{o, p};
    }

    public static P valueOf(String string2) {
        return (P)Enum.valueOf(P.class, (String)string2);
    }

    public static P[] values() {
        return (P[])q.clone();
    }
}

