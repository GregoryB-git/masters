/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package h2;

import h2.b;
import h2.d;

public final class c
implements b {
    public static final c b = new c(null);
    public final Object a;

    public c(Object object) {
        this.a = object;
    }

    public static b a(Object object) {
        return new c(d.c(object, "instance cannot be null"));
    }

    @Override
    public Object get() {
        return this.a;
    }
}

