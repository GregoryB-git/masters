// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import java.nio.ShortBuffer;
import java.util.Arrays;
import g0.a;

public final class e
{
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final short[] i;
    public short[] j;
    public int k;
    public short[] l;
    public int m;
    public short[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    
    public e(int h, final int b, final float c, final float d, final int n) {
        this.a = h;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = h / (float)n;
        this.f = h / 400;
        h /= 65;
        this.g = h;
        h *= 2;
        this.h = h;
        this.i = new short[h];
        this.j = new short[h * b];
        this.l = new short[h * b];
        this.n = new short[h * b];
    }
    
    public static void p(final int n, final int n2, final short[] array, final int n3, final short[] array2, final int n4, final short[] array3, final int n5) {
        for (int i = 0; i < n2; ++i) {
            int n6 = n3 * n2 + i;
            int n7 = n5 * n2 + i;
            int n8 = n4 * n2 + i;
            for (int j = 0; j < n; ++j) {
                array[n6] = (short)((array2[n8] * (n - j) + array3[n7] * j) / n);
                n6 += n2;
                n8 += n2;
                n7 += n2;
            }
        }
    }
    
    public final void a(final float n, int n2) {
        if (this.m == n2) {
            return;
        }
        int a;
        int n3;
        for (a = this.a, n3 = (int)(a / n); n3 > 16384 || a > 16384; n3 /= 2, a /= 2) {}
        this.o(n2);
        n2 = 0;
        int o;
        while (true) {
            o = this.o;
            boolean b = true;
            if (n2 >= o - 1) {
                break;
            }
            int p2;
            int q;
            while (true) {
                p2 = this.p;
                q = this.q;
                if ((p2 + 1) * n3 <= q * a) {
                    break;
                }
                this.l = this.f(this.l, this.m, 1);
                int n4 = 0;
                while (true) {
                    final int b2 = this.b;
                    if (n4 >= b2) {
                        break;
                    }
                    this.l[this.m * b2 + n4] = this.n(this.n, b2 * n2 + n4, a, n3);
                    ++n4;
                }
                ++this.q;
                ++this.m;
            }
            if ((this.p = p2 + 1) == a) {
                this.p = 0;
                if (q != n3) {
                    b = false;
                }
                g0.a.f(b);
                this.q = 0;
            }
            ++n2;
        }
        this.u(o - 1);
    }
    
    public final void b(final float n) {
        final int k = this.k;
        if (k < this.h) {
            return;
        }
        int n2 = 0;
        int n4;
        do {
            int n3;
            if (this.r > 0) {
                n3 = this.c(n2);
            }
            else {
                final int g = this.g(this.j, n2);
                if (n > 1.0) {
                    n3 = g + this.w(this.j, n2, n, g);
                }
                else {
                    n3 = this.m(this.j, n2, n, g);
                }
            }
            n4 = (n2 += n3);
        } while (this.h + n4 <= k);
        this.v(n4);
    }
    
    public final int c(final int n) {
        final int min = Math.min(this.h, this.r);
        this.d(this.j, n, min);
        this.r -= min;
        return min;
    }
    
    public final void d(final short[] array, final int n, final int n2) {
        final short[] f = this.f(this.l, this.m, n2);
        this.l = f;
        final int b = this.b;
        System.arraycopy(array, n * b, f, this.m * b, b * n2);
        this.m += n2;
    }
    
    public final void e(final short[] array, final int n, int i) {
        final int n2 = this.h / i;
        final int b = this.b;
        final int n3 = i * b;
        int n4;
        int j;
        for (i = 0; i < n2; ++i) {
            for (j = (n4 = 0); j < n3; ++j) {
                n4 += array[i * n3 + n * b + j];
            }
            this.i[i] = (short)(n4 / n3);
        }
    }
    
    public final short[] f(final short[] original, final int n, final int n2) {
        final int length = original.length;
        final int b = this.b;
        final int n3 = length / b;
        if (n + n2 <= n3) {
            return original;
        }
        return Arrays.copyOf(original, (n3 * 3 / 2 + n2) * b);
    }
    
    public final int g(final short[] array, int s) {
        final int a = this.a;
        int n;
        if (a > 4000) {
            n = a / 4000;
        }
        else {
            n = 1;
        }
        if (this.b == 1 && n == 1) {
            s = this.h(array, s, this.f, this.g);
        }
        else {
            this.e(array, s, n);
            final int h = this.h(this.i, 0, this.f / n, this.g / n);
            if (n != 1) {
                final int n2 = h * n;
                final int n3 = n * 4;
                final int n4 = n2 - n3;
                final int n5 = n2 + n3;
                final int f = this.f;
                int n6;
                if ((n6 = n4) < f) {
                    n6 = f;
                }
                final int g = this.g;
                int n7;
                if ((n7 = n5) > g) {
                    n7 = g;
                }
                if (this.b == 1) {
                    s = this.h(array, s, n6, n7);
                }
                else {
                    this.e(array, s, 1);
                    s = this.h(this.i, 0, n6, n7);
                }
            }
            else {
                s = h;
            }
        }
        int s2;
        if (this.q(this.u, this.v)) {
            s2 = this.s;
        }
        else {
            s2 = s;
        }
        this.t = this.u;
        this.s = s;
        return s2;
    }
    
    public final int h(final short[] array, int n, int i, final int n2) {
        final int n3 = n * this.b;
        int n4 = 255;
        int n5 = 1;
        int n7;
        int n6 = n7 = 0;
        while (i <= n2) {
            for (int j = n = 0; j < i; ++j) {
                n += Math.abs(array[n3 + j] - array[n3 + i + j]);
            }
            int n8 = n5;
            int n9 = n6;
            if (n * n6 < n5 * i) {
                n9 = i;
                n8 = n;
            }
            int n10 = n4;
            int n11 = n7;
            if (n * n4 > n7 * i) {
                n10 = i;
                n11 = n;
            }
            ++i;
            n4 = n10;
            n5 = n8;
            n6 = n9;
            n7 = n11;
        }
        this.u = n5 / n6;
        this.v = n7 / n4;
        return n6;
    }
    
    public void i() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }
    
    public void j(final ShortBuffer shortBuffer) {
        final int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        final int m = this.m - min;
        this.m = m;
        final short[] l = this.l;
        final int b = this.b;
        System.arraycopy(l, min * b, l, 0, m * b);
    }
    
    public int k() {
        return this.m * this.b * 2;
    }
    
    public int l() {
        return this.k * this.b * 2;
    }
    
    public final int m(final short[] array, final int n, final float n2, final int n3) {
        int n4;
        if (n2 < 0.5f) {
            n4 = (int)(n3 * n2 / (1.0f - n2));
        }
        else {
            this.r = (int)(n3 * (2.0f * n2 - 1.0f) / (1.0f - n2));
            n4 = n3;
        }
        final short[] l = this.l;
        final int m = this.m;
        final int n5 = n3 + n4;
        final short[] f = this.f(l, m, n5);
        this.l = f;
        final int b = this.b;
        System.arraycopy(array, n * b, f, this.m * b, b * n3);
        p(n4, this.b, this.l, this.m + n3, array, n + n3, array, n);
        this.m += n5;
        return n4;
    }
    
    public final short n(final short[] array, int n, int n2, int n3) {
        final short n4 = array[n];
        n = array[n + this.b];
        final int q = this.q;
        final int p4 = this.p;
        final int n5 = (p4 + 1) * n3;
        n2 = n5 - q * n2;
        n3 = n5 - p4 * n3;
        return (short)((n4 * n2 + (n3 - n2) * n) / n3);
    }
    
    public final void o(final int m) {
        final int n = this.m - m;
        final short[] f = this.f(this.n, this.o, n);
        this.n = f;
        final short[] l = this.l;
        final int b = this.b;
        System.arraycopy(l, m * b, f, this.o * b, b * n);
        this.m = m;
        this.o += n;
    }
    
    public final boolean q(final int n, final int n2) {
        return n != 0 && this.s != 0 && n2 <= n * 3 && n * 2 > this.t * 3;
    }
    
    public final void r() {
        final int m = this.m;
        final float c = this.c;
        final float d = this.d;
        final float n = c / d;
        final float n2 = this.e * d;
        final double n3 = n;
        if (n3 <= 1.00001 && n3 >= 0.99999) {
            this.d(this.j, 0, this.k);
            this.k = 0;
        }
        else {
            this.b(n);
        }
        if (n2 != 1.0f) {
            this.a(n2, m);
        }
    }
    
    public void s() {
        final int k = this.k;
        final float c = this.c;
        final float d = this.d;
        final int m = this.m + (int)((k / (c / d) + this.o) / (this.e * d) + 0.5f);
        this.j = this.f(this.j, k, this.h * 2 + k);
        int n = 0;
        int h;
        while (true) {
            h = this.h;
            final int b = this.b;
            if (n >= h * 2 * b) {
                break;
            }
            this.j[b * k + n] = 0;
            ++n;
        }
        this.k += h * 2;
        this.r();
        if (this.m > m) {
            this.m = m;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }
    
    public void t(final ShortBuffer shortBuffer) {
        final int remaining = shortBuffer.remaining();
        final int b = this.b;
        final int n = remaining / b;
        shortBuffer.get(this.j = this.f(this.j, this.k, n), this.k * this.b, b * n * 2 / 2);
        this.k += n;
        this.r();
    }
    
    public final void u(final int n) {
        if (n == 0) {
            return;
        }
        final short[] n2 = this.n;
        final int b = this.b;
        System.arraycopy(n2, n * b, n2, 0, (this.o - n) * b);
        this.o -= n;
    }
    
    public final void v(final int n) {
        final int k = this.k - n;
        final short[] j = this.j;
        final int b = this.b;
        System.arraycopy(j, n * b, j, 0, b * k);
        this.k = k;
    }
    
    public final int w(final short[] array, final int n, final float n2, final int n3) {
        int n4;
        if (n2 >= 2.0f) {
            n4 = (int)(n3 / (n2 - 1.0f));
        }
        else {
            this.r = (int)(n3 * (2.0f - n2) / (n2 - 1.0f));
            n4 = n3;
        }
        final short[] f = this.f(this.l, this.m, n4);
        this.l = f;
        p(n4, this.b, f, this.m, array, n, array, n + n3);
        this.m += n4;
        return n4;
    }
}
