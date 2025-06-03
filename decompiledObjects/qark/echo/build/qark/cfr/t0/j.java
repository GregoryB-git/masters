/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.nio.ByteBuffer
 */
package t0;

import g0.a;
import j0.i;
import java.nio.ByteBuffer;

public final class j
extends i {
    public long x;
    public int y;
    public int z = 32;

    public j() {
        super(2);
    }

    public boolean H(i i8) {
        ByteBuffer byteBuffer;
        a.a(i8.D() ^ true);
        a.a(i8.o() ^ true);
        a.a(i8.p() ^ true);
        if (!this.K(i8)) {
            return false;
        }
        int n8 = this.y;
        this.y = n8 + 1;
        if (n8 == 0) {
            this.t = i8.t;
            if (i8.s()) {
                this.w(1);
            }
        }
        if ((byteBuffer = i8.r) != null) {
            this.z(byteBuffer.remaining());
            this.r.put(byteBuffer);
        }
        this.x = i8.t;
        return true;
    }

    public final boolean K(i i8) {
        ByteBuffer byteBuffer;
        if (!this.U()) {
            return true;
        }
        if (this.y >= this.z) {
            return false;
        }
        i8 = i8.r;
        if (i8 != null && (byteBuffer = this.r) != null && byteBuffer.position() + i8.remaining() > 3072000) {
            return false;
        }
        return true;
    }

    public long M() {
        return this.t;
    }

    public long S() {
        return this.x;
    }

    public int T() {
        return this.y;
    }

    public boolean U() {
        if (this.y > 0) {
            return true;
        }
        return false;
    }

    public void V(int n8) {
        boolean bl = n8 > 0;
        a.a(bl);
        this.z = n8;
    }

    @Override
    public void m() {
        super.m();
        this.y = 0;
    }
}

