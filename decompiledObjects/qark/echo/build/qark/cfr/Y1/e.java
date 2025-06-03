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

public final class e
extends Enum {
    public static final /* enum */ e p = new e(null);
    public static final /* enum */ e q = new e("only_me");
    public static final /* enum */ e r = new e("friends");
    public static final /* enum */ e s = new e("everyone");
    public static final /* synthetic */ e[] t;
    public final String o;

    static {
        t = e.c();
    }

    public e(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ e[] c() {
        return new e[]{p, q, r, s};
    }

    public static e valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (e)Enum.valueOf(e.class, (String)string2);
    }

    public static e[] values() {
        e[] arre = t;
        return (e[])Arrays.copyOf((Object[])arre, (int)arre.length);
    }

    public final String e() {
        return this.o;
    }
}

