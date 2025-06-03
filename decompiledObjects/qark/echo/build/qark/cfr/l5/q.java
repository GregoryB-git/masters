/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package l5;

public final class q
extends Enum {
    public static final /* enum */ q o = new q();
    public static final /* enum */ q p = new q();
    public static final /* enum */ q q = new q();
    public static final /* synthetic */ q[] r;

    static {
        r = q.c();
    }

    public static /* synthetic */ q[] c() {
        return new q[]{o, p, q};
    }

    public static q valueOf(String string2) {
        return (q)Enum.valueOf(q.class, (String)string2);
    }

    public static q[] values() {
        return (q[])r.clone();
    }
}

