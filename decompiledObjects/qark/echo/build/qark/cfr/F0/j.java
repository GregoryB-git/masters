/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.InterruptedIOException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.Thread
 *  java.util.Arrays
 */
package F0;

import F0.s;
import d0.i;
import d0.v;
import g0.M;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

public final class j
implements s {
    public final byte[] a;
    public final i b;
    public final long c;
    public long d;
    public byte[] e;
    public int f;
    public int g;

    static {
        v.a("media3.extractor");
    }

    public j(i i8, long l8, long l9) {
        this.b = i8;
        this.d = l8;
        this.c = l9;
        this.e = new byte[65536];
        this.a = new byte[4096];
    }

    @Override
    public long a() {
        return this.c;
    }

    @Override
    public int b(int n8) {
        int n9;
        int n10 = n9 = this.u(n8);
        if (n9 == 0) {
            byte[] arrby = this.a;
            n10 = this.t(arrby, 0, Math.min((int)n8, (int)arrby.length), 0, true);
        }
        this.q(n10);
        return n10;
    }

    @Override
    public boolean d(byte[] arrby, int n8, int n9, boolean bl) {
        int n10 = this.s(arrby, n8, n9);
        while (n10 < n9 && n10 != -1) {
            n10 = this.t(arrby, n8, n9, n10, bl);
        }
        this.q(n10);
        if (n10 != -1) {
            return true;
        }
        return false;
    }

    @Override
    public int f(byte[] arrby, int n8, int n9) {
        this.r(n9);
        int n10 = this.g;
        int n11 = this.f;
        if ((n10 -= n11) == 0) {
            if ((n9 = this.t(this.e, n11, n9, 0, true)) == -1) {
                return -1;
            }
            this.g += n9;
        } else {
            n9 = Math.min((int)n9, (int)n10);
        }
        System.arraycopy((Object)this.e, (int)this.f, (Object)arrby, (int)n8, (int)n9);
        this.f += n9;
        return n9;
    }

    @Override
    public void h() {
        this.f = 0;
    }

    @Override
    public void i(int n8) {
        this.v(n8, false);
    }

    @Override
    public boolean j(int n8, boolean bl) {
        this.r(n8);
        int n9 = this.g - this.f;
        while (n9 < n8) {
            if ((n9 = this.t(this.e, this.f, n8, n9, bl)) == -1) {
                return false;
            }
            this.g = this.f + n9;
        }
        this.f += n8;
        return true;
    }

    @Override
    public boolean l(byte[] arrby, int n8, int n9, boolean bl) {
        if (!this.j(n9, bl)) {
            return false;
        }
        System.arraycopy((Object)this.e, (int)(this.f - n9), (Object)arrby, (int)n8, (int)n9);
        return true;
    }

    @Override
    public long m() {
        return this.d + (long)this.f;
    }

    @Override
    public void n(byte[] arrby, int n8, int n9) {
        this.l(arrby, n8, n9, false);
    }

    @Override
    public void o(int n8) {
        this.j(n8, false);
    }

    @Override
    public long p() {
        return this.d;
    }

    public final void q(int n8) {
        if (n8 != -1) {
            this.d += (long)n8;
        }
    }

    public final void r(int n8) {
        byte[] arrby = this.e;
        if ((n8 = this.f + n8) > arrby.length) {
            n8 = M.p(arrby.length * 2, 65536 + n8, n8 + 524288);
            this.e = Arrays.copyOf((byte[])this.e, (int)n8);
        }
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        int n10;
        int n11 = n10 = this.s(arrby, n8, n9);
        if (n10 == 0) {
            n11 = this.t(arrby, n8, n9, 0, true);
        }
        this.q(n11);
        return n11;
    }

    @Override
    public void readFully(byte[] arrby, int n8, int n9) {
        this.d(arrby, n8, n9, false);
    }

    public final int s(byte[] arrby, int n8, int n9) {
        int n10 = this.g;
        if (n10 == 0) {
            return 0;
        }
        n9 = Math.min((int)n10, (int)n9);
        System.arraycopy((Object)this.e, (int)0, (Object)arrby, (int)n8, (int)n9);
        this.w(n9);
        return n9;
    }

    public final int t(byte[] arrby, int n8, int n9, int n10, boolean bl) {
        if (!Thread.interrupted()) {
            if ((n8 = this.b.read(arrby, n8 + n10, n9 - n10)) == -1) {
                if (n10 == 0 && bl) {
                    return -1;
                }
                throw new EOFException();
            }
            return n10 + n8;
        }
        throw new InterruptedIOException();
    }

    public final int u(int n8) {
        n8 = Math.min((int)this.g, (int)n8);
        this.w(n8);
        return n8;
    }

    public boolean v(int n8, boolean bl) {
        int n9 = this.u(n8);
        while (n9 < n8 && n9 != -1) {
            int n10 = Math.min((int)n8, (int)(this.a.length + n9));
            n9 = this.t(this.a, - n9, n10, n9, bl);
        }
        this.q(n9);
        if (n9 != -1) {
            return true;
        }
        return false;
    }

    public final void w(int n8) {
        int n9;
        this.g = n9 = this.g - n8;
        this.f = 0;
        byte[] arrby = this.e;
        byte[] arrby2 = n9 < arrby.length - 524288 ? new byte[65536 + n9] : arrby;
        System.arraycopy((Object)arrby, (int)n8, (Object)arrby2, (int)0, (int)n9);
        this.e = arrby2;
    }
}

