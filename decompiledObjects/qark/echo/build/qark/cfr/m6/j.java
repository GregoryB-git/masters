/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package m6;

import a6.a;
import a6.b;

public final class j
extends Enum {
    public static final /* enum */ j o = new j();
    public static final /* enum */ j p = new j();
    public static final /* enum */ j q = new j();
    public static final /* enum */ j r = new j();
    public static final /* synthetic */ j[] s;
    public static final /* synthetic */ a t;

    static {
        Enum[] arrenum = j.c();
        s = arrenum;
        t = b.a(arrenum);
    }

    public static final /* synthetic */ j[] c() {
        return new j[]{o, p, q, r};
    }

    public static j valueOf(String string2) {
        return (j)Enum.valueOf(j.class, (String)string2);
    }

    public static j[] values() {
        return (j[])s.clone();
    }
}

