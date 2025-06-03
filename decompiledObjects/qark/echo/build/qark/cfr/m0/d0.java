/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package m0;

import e0.b;
import e0.d;
import g0.M;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class d0
extends d {
    public final float i;
    public final short j;
    public final int k;
    public final long l;
    public final long m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public int r;
    public byte[] s;
    public int t;
    public int u;
    public byte[] v;

    public d0() {
        this(100000L, 0.2f, 2000000L, 10, 1024);
    }

    public d0(long l8, float f8, long l9, int n8, short s8) {
        boolean bl = false;
        this.r = 0;
        this.t = 0;
        this.u = 0;
        boolean bl2 = bl;
        if (f8 >= 0.0f) {
            bl2 = bl;
            if (f8 <= 1.0f) {
                bl2 = true;
            }
        }
        a.a(bl2);
        this.l = l8;
        this.i = f8;
        this.m = l9;
        this.k = n8;
        this.j = s8;
        byte[] arrby = M.f;
        this.s = arrby;
        this.v = arrby;
    }

    public static void D(byte[] arrby, int n8, int n9) {
        if (n9 >= 32767) {
            arrby[n8] = -1;
            arrby[n8 + 1] = 127;
            return;
        }
        if (n9 <= -32768) {
            arrby[n8] = 0;
            arrby[n8 + 1] = -128;
            return;
        }
        arrby[n8] = (byte)(n9 & 255);
        arrby[n8 + 1] = (byte)(n9 >> 8);
    }

    public static int G(byte by, byte by2) {
        return by << 8 | by2 & 255;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void A(boolean bl) {
        int n8 = this.u;
        StringBuilder stringBuilder = this.s;
        if (n8 == stringBuilder.length || bl) {
            int n9;
            int n10;
            int n11 = this.r;
            boolean bl2 = false;
            if (n11 == 0) {
                if (bl) {
                    this.B(n8, 3);
                    n11 = n8;
                } else {
                    bl = n8 >= stringBuilder.length / 2;
                    a.f(bl);
                    n11 = this.s.length / 2;
                    this.B(n11, 0);
                }
                n10 = n11;
            } else if (bl) {
                n11 = n8 - stringBuilder.length / 2;
                n9 = stringBuilder.length / 2;
                n10 = this.r(n11) + this.s.length / 2;
                this.B(n10, 2);
                n11 = n9 + n11;
            } else {
                n11 = n8 - stringBuilder.length / 2;
                n10 = this.r(n11);
                this.B(n10, 1);
            }
            bl = n11 % this.n == 0;
            stringBuilder = new StringBuilder();
            stringBuilder.append("bytesConsumed is not aligned to frame size: %s");
            stringBuilder.append(n11);
            a.g(bl, stringBuilder.toString());
            bl = bl2;
            if (n8 >= n10) {
                bl = true;
            }
            a.f(bl);
            this.u -= n11;
            this.t = n8 = this.t + n11;
            this.t = n8 % this.s.length;
            n8 = this.r;
            n9 = this.n;
            this.r = n8 + n10 / n9;
            this.q += (long)((n11 - n10) / n9);
        }
    }

    public final void B(int n8, int n9) {
        byte[] arrby;
        if (n8 == 0) {
            return;
        }
        int n10 = this.u;
        boolean bl = true;
        boolean bl2 = n10 >= n8;
        a.a(bl2);
        if (n9 == 2) {
            n10 = this.t;
            int n11 = this.u;
            arrby = this.s;
            if (n10 + n11 <= arrby.length) {
                System.arraycopy((Object)arrby, (int)(n10 + n11 - n8), (Object)this.v, (int)0, (int)n8);
            } else if ((n10 = n11 - (arrby.length - n10)) >= n8) {
                System.arraycopy((Object)arrby, (int)(n10 - n8), (Object)this.v, (int)0, (int)n8);
            } else {
                n11 = n8 - n10;
                System.arraycopy((Object)arrby, (int)(arrby.length - n11), (Object)this.v, (int)0, (int)n11);
                System.arraycopy((Object)this.s, (int)0, (Object)this.v, (int)n11, (int)n10);
            }
        } else {
            n10 = this.t;
            arrby = this.s;
            if (n10 + n8 <= arrby.length) {
                System.arraycopy((Object)arrby, (int)n10, (Object)this.v, (int)0, (int)n8);
            } else {
                int n12 = arrby.length - n10;
                System.arraycopy((Object)arrby, (int)n10, (Object)this.v, (int)0, (int)n12);
                System.arraycopy((Object)this.s, (int)0, (Object)this.v, (int)n12, (int)(n8 - n12));
            }
        }
        bl2 = n8 % this.n == 0;
        arrby = new byte[]();
        arrby.append("sizeToOutput is not aligned to frame size: ");
        arrby.append(n8);
        a.b(bl2, arrby.toString());
        bl2 = this.t < this.s.length ? bl : false;
        a.f(bl2);
        this.z(this.v, n8, n9);
    }

    public final void C(ByteBuffer byteBuffer) {
        int n8 = byteBuffer.limit();
        byteBuffer.limit(Math.min((int)n8, (int)(byteBuffer.position() + this.s.length)));
        int n9 = this.t(byteBuffer);
        if (n9 == byteBuffer.position()) {
            this.p = 1;
        } else {
            byteBuffer.limit(Math.min((int)n9, (int)byteBuffer.capacity()));
            this.y(byteBuffer);
        }
        byteBuffer.limit(n8);
    }

    public void E(boolean bl) {
        this.o = bl;
    }

    public final void F(ByteBuffer byteBuffer) {
        int n8 = this.t;
        int n9 = this.s.length;
        boolean bl = true;
        boolean bl2 = n8 < n9;
        a.f(bl2);
        int n10 = byteBuffer.limit();
        int n11 = this.u(byteBuffer);
        int n12 = n11 - byteBuffer.position();
        int n13 = this.t;
        n9 = this.u;
        byte[] arrby = this.s;
        if (n13 + n9 < arrby.length) {
            n8 = arrby.length - (n9 + n13);
            n9 = n13 + n9;
        } else {
            n8 = n13 - (n9 -= arrby.length - n13);
        }
        n11 = n11 < n10 ? 1 : 0;
        n13 = Math.min((int)n12, (int)n8);
        byteBuffer.limit(byteBuffer.position() + n13);
        byteBuffer.get(this.s, n9, n13);
        this.u = n9 = this.u + n13;
        bl2 = n9 <= this.s.length;
        a.f(bl2);
        bl2 = n11 != 0 && n12 < n8 ? bl : false;
        this.A(bl2);
        if (bl2) {
            this.p = 0;
            this.r = 0;
        }
        byteBuffer.limit(n10);
    }

    @Override
    public boolean a() {
        if (super.a() && this.o) {
            return true;
        }
        return false;
    }

    @Override
    public void f(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.h()) {
            int n8 = this.p;
            if (n8 != 0) {
                if (n8 == 1) {
                    this.F(byteBuffer);
                    continue;
                }
                throw new IllegalStateException();
            }
            this.C(byteBuffer);
        }
    }

    @Override
    public b.a i(b.a a8) {
        if (a8.c == 2) {
            b.a a9 = a8;
            if (a8.a == -1) {
                a9 = b.a.e;
            }
            return a9;
        }
        throw new b.b(a8);
    }

    @Override
    public void j() {
        if (this.a()) {
            this.n = this.b.b * 2;
            int n8 = this.o(this.s(this.l) / 2) * 2;
            if (this.s.length != n8) {
                this.s = new byte[n8];
                this.v = new byte[n8];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override
    public void k() {
        if (this.u > 0) {
            this.A(true);
            this.r = 0;
        }
    }

    @Override
    public void l() {
        this.o = false;
        byte[] arrby = M.f;
        this.s = arrby;
        this.v = arrby;
    }

    public final int n(float f8) {
        return this.o((int)f8);
    }

    public final int o(int n8) {
        int n9 = this.n;
        return n8 / n9 * n9;
    }

    public final int p(int n8, int n9) {
        int n10 = this.k;
        return n10 + (100 - n10) * (n8 * 1000) / n9 / 1000;
    }

    public final int q(int n8, int n9) {
        return (this.k - 100) * (n8 * 1000 / n9) / 1000 + 100;
    }

    public final int r(int n8) {
        int n9 = (this.s(this.m) - this.r) * this.n - this.s.length / 2;
        boolean bl = n9 >= 0;
        a.f(bl);
        return this.n(Math.min((float)((float)n8 * this.i + 0.5f), (float)n9));
    }

    public final int s(long l8) {
        return (int)(l8 * (long)this.b.a / 1000000L);
    }

    public final int t(ByteBuffer byteBuffer) {
        for (int i8 = byteBuffer.limit() - 1; i8 >= byteBuffer.position(); i8 -= 2) {
            if (!this.w(byteBuffer.get(i8), byteBuffer.get(i8 - 1))) continue;
            int n8 = this.n;
            return i8 / n8 * n8 + n8;
        }
        return byteBuffer.position();
    }

    public final int u(ByteBuffer byteBuffer) {
        for (int i8 = byteBuffer.position() + 1; i8 < byteBuffer.limit(); i8 += 2) {
            if (!this.w(byteBuffer.get(i8), byteBuffer.get(i8 - 1))) continue;
            int n8 = this.n;
            return n8 * (i8 / n8);
        }
        return byteBuffer.limit();
    }

    public long v() {
        return this.q;
    }

    public final boolean w(byte by, byte by2) {
        if (Math.abs((int)d0.G(by, by2)) > this.j) {
            return true;
        }
        return false;
    }

    public final void x(byte[] arrby, int n8, int n9) {
        if (n9 == 3) {
            return;
        }
        for (int i8 = 0; i8 < n8; i8 += 2) {
            int n10 = d0.G(arrby[i8 + 1], arrby[i8]);
            int n11 = n9 == 0 ? this.q(i8, n8 - 1) : (n9 == 2 ? this.p(i8, n8 - 1) : this.k);
            d0.D(arrby, i8, n10 * n11 / 100);
        }
    }

    public final void y(ByteBuffer byteBuffer) {
        this.m(byteBuffer.remaining()).put(byteBuffer).flip();
    }

    public final void z(byte[] arrby, int n8, int n9) {
        boolean bl = n8 % this.n == 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("byteOutput size is not aligned to frame size ");
        stringBuilder.append(n8);
        a.b(bl, stringBuilder.toString());
        this.x(arrby, n8, n9);
        this.m(n8).put(arrby, 0, n8).flip();
    }
}

