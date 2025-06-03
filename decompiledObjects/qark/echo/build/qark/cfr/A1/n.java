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

public final class n
extends Enum {
    public static final /* enum */ n p = new n("event");
    public static final /* enum */ n q = new n("action_source");
    public static final /* enum */ n r = new n("app");
    public static final /* enum */ n s = new n("MobileAppInstall");
    public static final /* enum */ n t = new n("install_timestamp");
    public static final /* synthetic */ n[] u;
    public final String o;

    static {
        u = n.c();
    }

    public n(String string3) {
        this.o = string3;
    }

    public static final /* synthetic */ n[] c() {
        return new n[]{p, q, r, s, t};
    }

    public static n valueOf(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        return (n)Enum.valueOf(n.class, (String)string2);
    }

    public static n[] values() {
        n[] arrn = u;
        return (n[])Arrays.copyOf((Object[])arrn, (int)arrn.length);
    }

    public final String e() {
        return this.o;
    }
}

