/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package u5;

public final class k
extends Enum {
    public static final /* enum */ k o = new k();
    public static final /* enum */ k p = new k();
    public static final /* synthetic */ k[] q;

    static {
        q = k.c();
    }

    public static /* synthetic */ k[] c() {
        return new k[]{o, p};
    }

    public static k valueOf(String string2) {
        return (k)Enum.valueOf(k.class, (String)string2);
    }

    public static k[] values() {
        return (k[])q.clone();
    }
}

