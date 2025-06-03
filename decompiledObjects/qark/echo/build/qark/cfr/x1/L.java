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

public final class L
extends Enum {
    public static final /* enum */ L o = new L();
    public static final /* enum */ L p = new L();
    public static final /* enum */ L q = new L();
    public static final /* synthetic */ L[] r;

    static {
        r = L.c();
    }

    public static final /* synthetic */ L[] c() {
        return new L[]{o, p, q};
    }

    public static L valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (L)Enum.valueOf(L.class, (String)string2);
    }

    public static L[] values() {
        L[] arrl = r;
        return (L[])Arrays.copyOf((Object[])arrl, (int)arrl.length);
    }
}

