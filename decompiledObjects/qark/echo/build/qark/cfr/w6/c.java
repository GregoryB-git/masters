/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package w6;

import w6.f;
import w6.l;

public final class c
extends f {
    public static final c w = new c();

    public c() {
        super(l.c, l.d, l.e, l.a);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public String toString() {
        return "Dispatchers.Default";
    }
}

