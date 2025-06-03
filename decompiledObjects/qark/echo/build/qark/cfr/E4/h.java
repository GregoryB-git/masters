/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import r4.b;

public final class h
implements U5.a {
    public final a a;

    public h(a a8) {
        this.a = a8;
    }

    public static h a(a a8) {
        return new h(a8);
    }

    public static b c(a a8) {
        return (b)q5.b.c(a8.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public b b() {
        return h.c(this.a);
    }
}

