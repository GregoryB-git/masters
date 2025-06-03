/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.charset.Charset
 */
package g0;

import g0.M;
import g0.a;
import g0.z;
import java.nio.charset.Charset;

public final class y {
    public byte[] a;
    public int b;
    public int c;
    public int d;

    public y() {
        this.a = M.f;
    }

    public y(byte[] arrby) {
        this(arrby, arrby.length);
    }

    public y(byte[] arrby, int n8) {
        this.a = arrby;
        this.d = n8;
    }

    public final void a() {
        int n8;
        int n9 = this.b;
        boolean bl = n9 >= 0 && (n9 < (n8 = this.d) || n9 == n8 && this.c == 0);
        a.f(bl);
    }

    public int b() {
        return (this.d - this.b) * 8 - this.c;
    }

    public void c() {
        if (this.c == 0) {
            return;
        }
        this.c = 0;
        ++this.b;
        this.a();
    }

    public int d() {
        boolean bl = this.c == 0;
        a.f(bl);
        return this.b;
    }

    public int e() {
        return this.b * 8 + this.c;
    }

    public void f(int n8, int n9) {
        byte by;
        int n10 = n8;
        if (n9 < 32) {
            n10 = n8 & (1 << n9) - 1;
        }
        int n11 = Math.min((int)(8 - this.c), (int)n9);
        int n12 = this.c;
        n8 = 8 - n12 - n11;
        byte[] arrby = this.a;
        int n13 = this.b;
        arrby[n13] = by = (byte)((65280 >> n12 | (1 << n8) - 1) & arrby[n13]);
        n11 = n9 - n11;
        arrby[n13] = (byte)(by | n10 >>> n11 << n8);
        n8 = n13 + 1;
        while (n11 > 8) {
            this.a[n8] = (byte)(n10 >>> n11 - 8);
            n11 -= 8;
            ++n8;
        }
        n13 = 8 - n11;
        arrby = this.a;
        arrby[n8] = by = (byte)(arrby[n8] & (1 << n13) - 1);
        arrby[n8] = (byte)((n10 & (1 << n11) - 1) << n13 | by);
        this.r(n9);
        this.a();
    }

    public boolean g() {
        boolean bl = (this.a[this.b] & 128 >> this.c) != 0;
        this.q();
        return bl;
    }

    public int h(int n8) {
        int n9;
        byte[] arrby;
        int n10;
        if (n8 == 0) {
            return 0;
        }
        this.c += n8;
        int n11 = 0;
        while ((n10 = this.c) > 8) {
            this.c = n10 -= 8;
            arrby = this.a;
            n9 = this.b;
            this.b = n9 + 1;
            n11 |= (arrby[n9] & 255) << n10;
        }
        arrby = this.a;
        n9 = this.b;
        byte by = arrby[n9];
        if (n10 == 8) {
            this.c = 0;
            this.b = n9 + 1;
        }
        this.a();
        return -1 >>> 32 - n8 & (n11 | (by & 255) >> 8 - n10);
    }

    public void i(byte[] arrby, int n8, int n9) {
        byte[] arrby2;
        byte by;
        int n10;
        int n11;
        int n12;
        int n13 = (n9 >> 3) + n8;
        while (n8 < n13) {
            arrby2 = this.a;
            n11 = this.b;
            this.b = n10 = n11 + 1;
            n11 = arrby2[n11];
            n12 = this.c;
            arrby[n8] = by = (byte)(n11 << n12);
            arrby[n8] = (byte)((255 & arrby2[n10]) >> 8 - n12 | by);
            ++n8;
        }
        n8 = n9 & 7;
        if (n8 == 0) {
            return;
        }
        arrby[n13] = by = (byte)(arrby[n13] & 255 >> n8);
        n9 = this.c;
        if (n9 + n8 > 8) {
            arrby2 = this.a;
            n10 = this.b;
            this.b = n10 + 1;
            arrby[n13] = (byte)(by | (arrby2[n10] & 255) << n9);
            this.c = n9 - 8;
        }
        this.c = n9 = this.c + n8;
        arrby2 = this.a;
        n10 = this.b;
        n11 = arrby2[n10];
        n12 = arrby[n13];
        arrby[n13] = (byte)((byte)((255 & n11) >> 8 - n9 << 8 - n8) | n12);
        if (n9 == 8) {
            this.c = 0;
            this.b = n10 + 1;
        }
        this.a();
    }

    public long j(int n8) {
        if (n8 <= 32) {
            return M.h1(this.h(n8));
        }
        return M.g1(this.h(n8 - 32), this.h(32));
    }

    public void k(byte[] arrby, int n8, int n9) {
        boolean bl = this.c == 0;
        a.f(bl);
        System.arraycopy((Object)this.a, (int)this.b, (Object)arrby, (int)n8, (int)n9);
        this.b += n9;
        this.a();
    }

    public String l(int n8, Charset charset) {
        byte[] arrby = new byte[n8];
        this.k(arrby, 0, n8);
        return new String(arrby, charset);
    }

    public void m(z z8) {
        this.o(z8.e(), z8.g());
        this.p(z8.f() * 8);
    }

    public void n(byte[] arrby) {
        this.o(arrby, arrby.length);
    }

    public void o(byte[] arrby, int n8) {
        this.a = arrby;
        this.b = 0;
        this.c = 0;
        this.d = n8;
    }

    public void p(int n8) {
        int n9;
        this.b = n9 = n8 / 8;
        this.c = n8 - n9 * 8;
        this.a();
    }

    public void q() {
        int n8;
        this.c = n8 = this.c + 1;
        if (n8 == 8) {
            this.c = 0;
            ++this.b;
        }
        this.a();
    }

    public void r(int n8) {
        int n9;
        int n10 = n8 / 8;
        this.b = n9 = this.b + n10;
        this.c = n8 = this.c + (n8 - n10 * 8);
        if (n8 > 7) {
            this.b = n9 + 1;
            this.c = n8 - 8;
        }
        this.a();
    }

    public void s(int n8) {
        boolean bl = this.c == 0;
        a.f(bl);
        this.b += n8;
        this.a();
    }
}

