/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package x1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class N
extends Enum {
    public static final /* enum */ N o = new N();
    public static final /* enum */ N p = new N();
    public static final /* enum */ N q = new N();
    public static final /* enum */ N r = new N();
    public static final /* enum */ N s = new N();
    public static final /* enum */ N t = new N();
    public static final /* enum */ N u = new N();
    public static final /* enum */ N v = new N();
    public static final /* synthetic */ N[] w;

    static {
        w = N.c();
    }

    public static final /* synthetic */ N[] c() {
        return new N[]{o, p, q, r, s, t, u, v};
    }

    public static N valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (N)Enum.valueOf(N.class, (String)string2);
    }

    public static N[] values() {
        N[] arrn = w;
        return (N[])Arrays.copyOf((Object[])arrn, (int)arrn.length);
    }
}

