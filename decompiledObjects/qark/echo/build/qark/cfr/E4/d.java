/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import q5.b;
import s4.i;

public final class d
implements U5.a {
    public final a a;

    public d(a a8) {
        this.a = a8;
    }

    public static d a(a a8) {
        return new d(a8);
    }

    public static i c(a a8) {
        return (i)b.c(a8.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public i b() {
        return d.c(this.a);
    }
}

