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

public final class C
extends Enum {
    public static final /* enum */ C o = new C();
    public static final /* enum */ C p = new C();
    public static final /* enum */ C q = new C();
    public static final /* enum */ C r = new C();
    public static final /* enum */ C s = new C();
    public static final /* enum */ C t = new C();
    public static final /* synthetic */ C[] u;

    static {
        u = C.c();
    }

    public static final /* synthetic */ C[] c() {
        return new C[]{o, p, q, r, s, t};
    }

    public static C valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (C)Enum.valueOf(C.class, (String)string2);
    }

    public static C[] values() {
        C[] arrc = u;
        return (C[])Arrays.copyOf((Object[])arrc, (int)arrc.length);
    }
}

