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

public final class j
extends Enum
implements f {
    public static final /* enum */ j p = new j(0);
    public static final /* enum */ j q = new j(1);
    public static final /* synthetic */ j[] r;
    public final int o;

    static {
        r = j.c();
    }

    public j(int n9) {
        this.o = n9;
    }

    public static final /* synthetic */ j[] c() {
        return new j[]{p, q};
    }

    public static j valueOf(String string2) {
        return (j)Enum.valueOf(j.class, (String)string2);
    }

    public static j[] values() {
        return (j[])r.clone();
    }

    @Override
    public int g() {
        return this.o;
    }
}

