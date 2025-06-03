/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;

public final class b
implements U5.a {
    public final a a;

    public b(a a8) {
        this.a = a8;
    }

    public static b a(a a8) {
        return new b(a8);
    }

    public static C4.a c(a a8) {
        return (C4.a)q5.b.c(a8.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public C4.a b() {
        return b.c(this.a);
    }
}

