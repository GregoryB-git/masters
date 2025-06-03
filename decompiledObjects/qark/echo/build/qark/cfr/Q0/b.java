/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.util.Arrays
 */
package Q0;

import O0.c;
import Q0.a;
import d0.x;
import g0.z;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class b
extends c {
    @Override
    public x b(O0.b b8, ByteBuffer byteBuffer) {
        return new x(this.c(new z(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(z z8) {
        return new a((String)g0.a.e(z8.A()), (String)g0.a.e(z8.A()), z8.z(), z8.z(), Arrays.copyOfRange((byte[])z8.e(), (int)z8.f(), (int)z8.g()));
    }
}

