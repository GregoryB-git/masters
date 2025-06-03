/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package j0;

import d0.q;
import d0.v;
import j0.c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class i
extends j0.a {
    public q p;
    public final c q = new c();
    public ByteBuffer r;
    public boolean s;
    public long t;
    public ByteBuffer u;
    public final int v;
    public final int w;

    static {
        v.a("media3.decoder");
    }

    public i(int n8) {
        this(n8, 0);
    }

    public i(int n8, int n9) {
        this.v = n8;
        this.w = n9;
    }

    public static i F() {
        return new i(0);
    }

    public final void C() {
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.u) != null) {
            byteBuffer.flip();
        }
    }

    public final boolean D() {
        return this.n(1073741824);
    }

    public void G(int n8) {
        ByteBuffer byteBuffer = this.u;
        if (byteBuffer != null && byteBuffer.capacity() >= n8) {
            this.u.clear();
            return;
        }
        this.u = ByteBuffer.allocate((int)n8);
    }

    @Override
    public void m() {
        super.m();
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.u) != null) {
            byteBuffer.clear();
        }
        this.s = false;
    }

    public final ByteBuffer x(int n8) {
        int n9 = this.v;
        if (n9 == 1) {
            return ByteBuffer.allocate((int)n8);
        }
        if (n9 == 2) {
            return ByteBuffer.allocateDirect((int)n8);
        }
        ByteBuffer byteBuffer = this.r;
        n9 = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new a(n9, n8);
    }

    public void z(int n8) {
        int n9;
        int n10 = n8 + this.w;
        ByteBuffer byteBuffer = this.r;
        if (byteBuffer == null) {
            this.r = this.x(n10);
            return;
        }
        n8 = byteBuffer.capacity();
        if (n8 >= (n10 += (n9 = byteBuffer.position()))) {
            this.r = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer2 = this.x(n10);
        byteBuffer2.order(byteBuffer.order());
        if (n9 > 0) {
            byteBuffer.flip();
            byteBuffer2.put(byteBuffer);
        }
        this.r = byteBuffer2;
    }

    public static final class a
    extends IllegalStateException {
        public final int o;
        public final int p;

        public a(int n8, int n9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Buffer too small (");
            stringBuilder.append(n8);
            stringBuilder.append(" < ");
            stringBuilder.append(n9);
            stringBuilder.append(")");
            super(stringBuilder.toString());
            this.o = n8;
            this.p = n9;
        }
    }

}

