/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.ByteBuffer
 */
package O0;

import O0.a;
import O0.b;
import d0.x;
import j0.i;
import java.nio.ByteBuffer;

public abstract class c
implements a {
    @Override
    public final x a(b b8) {
        ByteBuffer byteBuffer = (ByteBuffer)g0.a.e((Object)b8.r);
        boolean bl = byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0;
        g0.a.a(bl);
        return this.b(b8, byteBuffer);
    }

    public abstract x b(b var1, ByteBuffer var2);
}

