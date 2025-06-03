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

public final class k
extends Enum {
    public static final /* enum */ k p = new k("user_data");
    public static final /* enum */ k q = new k("app_data");
    public static final /* enum */ k r = new k("custom_data");
    public static final /* enum */ k s = new k("custom_events");
    public static final /* synthetic */ k[] t;
    public final String o;

    static {
        t = k.c();
    }

    public k(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ k[] c() {
        return new k[]{p, q, r, s};
    }

    public static k valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (k)Enum.valueOf(k.class, (String)string2);
    }

    public static k[] values() {
        k[] arrk = t;
        return (k[])Arrays.copyOf((Object[])arrk, (int)arrk.length);
    }

    public final String e() {
        return this.o;
    }
}

