/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class D
extends Enum {
    public static final /* enum */ D o = new D();
    public static final /* enum */ D p = new D();
    public static final /* enum */ D q = new D();
    public static final /* enum */ D r = new D();
    public static final /* synthetic */ D[] s;

    static {
        s = D.c();
    }

    public static final /* synthetic */ D[] c() {
        return new D[]{o, p, q, r};
    }

    public static D valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (D)Enum.valueOf(D.class, (String)string2);
    }

    public static D[] values() {
        D[] arrd = s;
        return (D[])Arrays.copyOf((Object[])arrd, (int)arrd.length);
    }
}

