/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package E4;

import E4.a;
import q5.b;
import s3.e;

public final class c
implements U5.a {
    public final a a;

    public c(a a8) {
        this.a = a8;
    }

    public static c a(a a8) {
        return new c(a8);
    }

    public static e c(a a8) {
        return (e)b.c(a8.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public e b() {
        return c.c(this.a);
    }
}

