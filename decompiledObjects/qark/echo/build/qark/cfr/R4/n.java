/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package R4;

import l4.f;

public final class n
extends Enum
implements f {
    public static final /* enum */ n p = new n(0);
    public static final /* enum */ n q = new n(1);
    public static final /* enum */ n r = new n(2);
    public static final /* enum */ n s = new n(3);
    public static final /* synthetic */ n[] t;
    public final int o;

    static {
        t = n.c();
    }

    public n(int n9) {
        this.o = n9;
    }

    public static final /* synthetic */ n[] c() {
        return new n[]{p, q, r, s};
    }

    public static n valueOf(String string2) {
        return (n)Enum.valueOf(n.class, (String)string2);
    }

    public static n[] values() {
        return (n[])t.clone();
    }

    @Override
    public int g() {
        return this.o;
    }
}

