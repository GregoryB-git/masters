/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package m0;

import e0.b;
import e0.d;
import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class f0
extends d {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = M.f;
    public int n;
    public long o;

    @Override
    public boolean c() {
        if (super.c() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override
    public ByteBuffer d() {
        int n8;
        if (super.c() && (n8 = this.n) > 0) {
            this.m(n8).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.d();
    }

    @Override
    public void f(ByteBuffer byteBuffer) {
        int n8 = byteBuffer.position();
        int n9 = byteBuffer.limit();
        int n10 = n9 - n8;
        if (n10 == 0) {
            return;
        }
        int n11 = Math.min((int)n10, (int)this.l);
        this.o += (long)(n11 / this.b.d);
        this.l -= n11;
        byteBuffer.position(n8 + n11);
        if (this.l > 0) {
            return;
        }
        n11 = this.n + (n10 -= n11) - this.m.length;
        ByteBuffer byteBuffer2 = this.m(n11);
        n8 = M.p(n11, 0, this.n);
        byteBuffer2.put(this.m, 0, n8);
        n11 = M.p(n11 - n8, 0, n10);
        byteBuffer.limit(byteBuffer.position() + n11);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(n9);
        n9 = n10 - n11;
        this.n = n10 = this.n - n8;
        byte[] arrby = this.m;
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby, (int)0, (int)n10);
        byteBuffer.get(this.m, this.n, n9);
        this.n += n9;
        byteBuffer2.flip();
    }

    @Override
    public b.a i(b.a a8) {
        if (a8.c == 2) {
            this.k = true;
            b.a a9 = a8;
            if (this.i == 0) {
                if (this.j != 0) {
                    return a8;
                }
                a9 = b.a.e;
            }
            return a9;
        }
        throw new b.b(a8);
    }

    @Override
    public void j() {
        if (this.k) {
            this.k = false;
            int n8 = this.j;
            int n9 = this.b.d;
            this.m = new byte[n8 * n9];
            this.l = this.i * n9;
        }
        this.n = 0;
    }

    @Override
    public void k() {
        if (this.k) {
            int n8 = this.n;
            if (n8 > 0) {
                this.o += (long)(n8 / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override
    public void l() {
        this.m = M.f;
    }

    public long n() {
        return this.o;
    }

    public void o() {
        this.o = 0L;
    }

    public void p(int n8, int n9) {
        this.i = n8;
        this.j = n9;
    }
}

