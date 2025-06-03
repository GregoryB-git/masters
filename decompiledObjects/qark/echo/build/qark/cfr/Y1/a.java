/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends Enum {
    public static final /* enum */ a o = new a("S256");
    public static final /* enum */ a p = new a("plain");
    public static final /* synthetic */ a[] q;

    static {
        q = a.c();
    }

    public a(String string3) {
    }

    public static final /* synthetic */ a[] c() {
        return new a[]{o, p};
    }

    public static a valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        a[] arra = q;
        return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
    }
}

