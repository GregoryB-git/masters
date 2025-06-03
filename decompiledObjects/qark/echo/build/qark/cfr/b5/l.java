/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package b5;

public final class l
extends Enum {
    public static final /* enum */ l o;
    public static final /* enum */ l p;
    public static final /* enum */ l q;
    public static final /* synthetic */ l[] r;

    static {
        l l8;
        l l9;
        l l10;
        o = l9 = new l();
        p = l8 = new l();
        q = l10 = new l();
        r = new l[]{l9, l8, l10};
    }

    public static l valueOf(String string2) {
        return (l)Enum.valueOf(l.class, (String)string2);
    }

    public static l[] values() {
        return (l[])r.clone();
    }
}

