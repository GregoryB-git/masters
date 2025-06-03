/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a3;

import W2.m;

public abstract class i {
    public static byte a(long l8) {
        boolean bl = l8 >> 8 == 0L;
        m.g(bl, "out of range: %s", l8);
        return (byte)l8;
    }

    public static int b(byte by) {
        return by & 255;
    }
}

