/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.Arrays
 */
package x2;

import java.util.Arrays;
import x2.A;

public final class B
extends A {
    public final byte[] c;

    public B(byte[] arrby) {
        super(Arrays.copyOfRange((byte[])arrby, (int)0, (int)25));
        this.c = arrby;
    }

    @Override
    public final byte[] Z0() {
        return this.c;
    }
}

