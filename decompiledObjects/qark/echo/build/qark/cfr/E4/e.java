/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import r4.b;

public final class e
implements U5.a {
    public final a a;

    public e(a a8) {
        this.a = a8;
    }

    public static e a(a a8) {
        return new e(a8);
    }

    public static b c(a a8) {
        return (b)q5.b.c(a8.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public b b() {
        return e.c(this.a);
    }
}

