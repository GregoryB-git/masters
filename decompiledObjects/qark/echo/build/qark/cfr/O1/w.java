/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package O1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class w
extends Enum {
    public static final /* enum */ w p = new w("context_choose");
    public static final /* enum */ w q = new w("join_tournament");
    public static final /* synthetic */ w[] r;
    public final String o;

    static {
        r = w.c();
    }

    public w(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ w[] c() {
        return new w[]{p, q};
    }

    public static w valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (w)Enum.valueOf(w.class, (String)string2);
    }

    public static w[] values() {
        w[] arrw = r;
        return (w[])Arrays.copyOf((Object[])arrw, (int)arrw.length);
    }

    public final String e() {
        return this.o;
    }
}

