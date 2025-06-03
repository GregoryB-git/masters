/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p2;

import h2.d;
import p2.b;

public final class c
implements h2.b {
    public static c a() {
        return a;
    }

    public static p2.a b() {
        return (p2.a)d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public p2.a c() {
        return c.b();
    }

    public static final abstract class a {
        public static final c a = new c();
    }

}

