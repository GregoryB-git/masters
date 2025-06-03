/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package A1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class o
extends Enum {
    public static final /* enum */ o p = new o("endpoint");
    public static final /* enum */ o q = new o("is_enabled");
    public static final /* enum */ o r = new o("dataset_id");
    public static final /* enum */ o s = new o("access_key");
    public static final /* synthetic */ o[] t;
    public final String o;

    static {
        t = o.c();
    }

    public o(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ o[] c() {
        return new o[]{p, q, r, s};
    }

    public static o valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (o)Enum.valueOf(o.class, (String)string2);
    }

    public static o[] values() {
        o[] arro = t;
        return (o[])Arrays.copyOf((Object[])arro, (int)arro.length);
    }

    public final String e() {
        return this.o;
    }
}

