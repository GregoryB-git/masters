/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package w5;

import java.nio.ByteBuffer;
import w5.c;

public final class b
implements Runnable {
    public final /* synthetic */ c o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;
    public final /* synthetic */ c.f r;
    public final /* synthetic */ ByteBuffer s;
    public final /* synthetic */ long t;

    public /* synthetic */ b(c c8, String string2, int n8, c.f f8, ByteBuffer byteBuffer, long l8) {
        this.o = c8;
        this.p = string2;
        this.q = n8;
        this.r = f8;
        this.s = byteBuffer;
        this.t = l8;
    }

    public final void run() {
        c.i(this.o, this.p, this.q, this.r, this.s, this.t);
    }
}

