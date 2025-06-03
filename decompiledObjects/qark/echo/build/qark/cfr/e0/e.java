/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.System
 *  java.nio.ShortBuffer
 *  java.util.Arrays
 */
package e0;

import g0.a;
import java.nio.ShortBuffer;
import java.util.Arrays;

public final class e {
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

    public e(int n8, int n9, float f8, float f9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = f8;
        this.d = f9;
        this.e = (float)n8 / (float)n10;
        this.f = n8 / 400;
        this.g = n8 /= 65;
        this.h = n8 *= 2;
        this.i = new short[n8];
        this.j = new short[n8 * n9];
        this.l = new short[n8 * n9];
        this.n = new short[n8 * n9];
    }

    public static void p(int n8, int n9, short[] arrs, int n10, short[] arrs2, int n11, short[] arrs3, int n12) {
        for (int i8 = 0; i8 < n9; ++i8) {
            int n13 = n10 * n9 + i8;
            int n14 = n12 * n9 + i8;
            int n15 = n11 * n9 + i8;
            for (int i9 = 0; i9 < n8; ++i9) {
                arrs[n13] = (short)((arrs2[n15] * (n8 - i9) + arrs3[n14] * i9) / n8);
                n13 += n9;
                n15 += n9;
                n14 += n9;
            }
        }
    }

    public final void a(float f8, int n8) {
        if (this.m == n8) {
            return;
        }
        int n9 = this.a;
        int n10 = (int)((float)n9 / f8);
        do {
            if (n10 <= 16384 && n9 <= 16384) {
                int n11;
                this.o(n8);
                n8 = 0;
                do {
                    int n12;
                    n11 = this.o;
                    boolean bl = true;
                    if (n8 >= n11 - 1) break;
                    while (((n12 = this.p) + 1) * n10 > (n11 = this.q) * n9) {
                        this.l = this.f(this.l, this.m, 1);
                        for (n11 = 0; n11 < (n12 = this.b); ++n11) {
                            this.l[this.m * n12 + n11] = this.n(this.n, n12 * n8 + n11, n9, n10);
                        }
                        ++this.q;
                        ++this.m;
                    }
                    this.p = ++n12;
                    if (n12 == n9) {
                        this.p = 0;
                        if (n11 != n10) {
                            bl = false;
                        }
                        a.f(bl);
                        this.q = 0;
                    }
                    ++n8;
                } while (true);
                this.u(n11 - 1);
                return;
            }
            n10 /= 2;
            n9 /= 2;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b(float f8) {
        int n8;
        int n9 = this.k;
        if (n9 < this.h) {
            return;
        }
        int n10 = 0;
        do {
            if (this.r > 0) {
                n8 = this.c(n10);
            } else {
                n8 = this.g(this.j, n10);
                n8 = (double)f8 > 1.0 ? (n8 += this.w(this.j, n10, f8, n8)) : this.m(this.j, n10, f8, n8);
            }
            n8 = n10 + n8;
            n10 = n8;
        } while (this.h + n8 <= n9);
        this.v(n8);
    }

    public final int c(int n8) {
        int n9 = Math.min((int)this.h, (int)this.r);
        this.d(this.j, n8, n9);
        this.r -= n9;
        return n9;
    }

    public final void d(short[] arrs, int n8, int n9) {
        short[] arrs2 = this.f(this.l, this.m, n9);
        this.l = arrs2;
        int n10 = this.b;
        System.arraycopy((Object)arrs, (int)(n8 * n10), (Object)arrs2, (int)(this.m * n10), (int)(n10 * n9));
        this.m += n9;
    }

    public final void e(short[] arrs, int n8, int n9) {
        int n10 = this.h / n9;
        int n11 = this.b;
        int n12 = n9 * n11;
        for (n9 = 0; n9 < n10; ++n9) {
            int n13;
            int n14 = n13 = 0;
            while (n13 < n12) {
                n14 += arrs[n9 * n12 + n8 * n11 + n13];
                ++n13;
            }
            n13 = n14 / n12;
            this.i[n9] = (short)n13;
        }
    }

    public final short[] f(short[] arrs, int n8, int n9) {
        int n10 = arrs.length;
        int n11 = this.b;
        if (n8 + n9 <= (n10 /= n11)) {
            return arrs;
        }
        return Arrays.copyOf((short[])arrs, (int)((n10 * 3 / 2 + n9) * n11));
    }

    public final int g(short[] arrs, int n8) {
        int n9 = this.a;
        n9 = n9 > 4000 ? (n9 /= 4000) : 1;
        if (this.b == 1 && n9 == 1) {
            n8 = this.h(arrs, n8, this.f, this.g);
        } else {
            this.e(arrs, n8, n9);
            int n10 = this.h(this.i, 0, this.f / n9, this.g / n9);
            if (n9 != 1) {
                int n11 = n10 * n9;
                n10 = n11 - (n9 *= 4);
                n11 += n9;
                int n12 = this.f;
                n9 = n10;
                if (n10 < n12) {
                    n9 = n12;
                }
                n12 = this.g;
                n10 = n11;
                if (n11 > n12) {
                    n10 = n12;
                }
                if (this.b == 1) {
                    n8 = this.h(arrs, n8, n9, n10);
                } else {
                    this.e(arrs, n8, 1);
                    n8 = this.h(this.i, 0, n9, n10);
                }
            } else {
                n8 = n10;
            }
        }
        n9 = this.q(this.u, this.v) ? this.s : n8;
        this.t = this.u;
        this.s = n8;
        return n9;
    }

    public final int h(short[] arrs, int n8, int n9, int n10) {
        int n11;
        int n12 = n8 * this.b;
        int n13 = 255;
        int n14 = 1;
        int n15 = n11 = 0;
        while (n9 <= n10) {
            int n16;
            n8 = n16 = 0;
            while (n16 < n9) {
                n8 += Math.abs((int)(arrs[n12 + n16] - arrs[n12 + n9 + n16]));
                ++n16;
            }
            int n17 = n14;
            n16 = n11;
            if (n8 * n11 < n14 * n9) {
                n16 = n9;
                n17 = n8;
            }
            n11 = n13;
            int n18 = n15;
            if (n8 * n13 > n15 * n9) {
                n11 = n9;
                n18 = n8;
            }
            ++n9;
            n13 = n11;
            n14 = n17;
            n11 = n16;
            n15 = n18;
        }
        this.u = n14 / n11;
        this.v = n15 / n13;
        return n11;
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

    public void j(ShortBuffer arrs) {
        int n8;
        int n9 = Math.min((int)(arrs.remaining() / this.b), (int)this.m);
        arrs.put(this.l, 0, this.b * n9);
        this.m = n8 = this.m - n9;
        arrs = this.l;
        int n10 = this.b;
        System.arraycopy((Object)arrs, (int)(n9 * n10), (Object)arrs, (int)0, (int)(n8 * n10));
    }

    public int k() {
        return this.m * this.b * 2;
    }

    public int l() {
        return this.k * this.b * 2;
    }

    public final int m(short[] arrs, int n8, float f8, int n9) {
        int n10;
        if (f8 < 0.5f) {
            n10 = (int)((float)n9 * f8 / (1.0f - f8));
        } else {
            this.r = (int)((float)n9 * (2.0f * f8 - 1.0f) / (1.0f - f8));
            n10 = n9;
        }
        short[] arrs2 = this.l;
        int n11 = this.m;
        int n12 = n9 + n10;
        this.l = arrs2 = this.f(arrs2, n11, n12);
        n11 = this.b;
        System.arraycopy((Object)arrs, (int)(n8 * n11), (Object)arrs2, (int)(this.m * n11), (int)(n11 * n9));
        e.p(n10, this.b, this.l, this.m + n9, arrs, n8 + n9, arrs, n8);
        this.m += n12;
        return n10;
    }

    public final short n(short[] arrs, int n8, int n9, int n10) {
        short s8 = arrs[n8];
        n8 = arrs[n8 + this.b];
        int n11 = this.q;
        int n12 = this.p;
        int n13 = (n12 + 1) * n10;
        n9 = n13 - n11 * n9;
        n10 = n13 - n12 * n10;
        return (short)((s8 * n9 + (n10 - n9) * n8) / n10);
    }

    public final void o(int n8) {
        int n9 = this.m - n8;
        short[] arrs = this.f(this.n, this.o, n9);
        this.n = arrs;
        short[] arrs2 = this.l;
        int n10 = this.b;
        System.arraycopy((Object)arrs2, (int)(n8 * n10), (Object)arrs, (int)(this.o * n10), (int)(n10 * n9));
        this.m = n8;
        this.o += n9;
    }

    public final boolean q(int n8, int n9) {
        if (n8 != 0) {
            if (this.s == 0) {
                return false;
            }
            if (n9 > n8 * 3) {
                return false;
            }
            if (n8 * 2 <= this.t * 3) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void r() {
        int n8 = this.m;
        float f8 = this.c;
        float f9 = this.d;
        double d8 = f8 /= (f9 = this.e * f9);
        if (d8 <= 1.00001 && d8 >= 0.99999) {
            this.d(this.j, 0, this.k);
            this.k = 0;
        } else {
            this.b(f8);
        }
        if (f9 != 1.0f) {
            this.a(f9, n8);
        }
    }

    public void s() {
        int n8;
        int n9;
        int n10 = this.k;
        float f8 = this.c;
        float f9 = this.d;
        float f10 = this.e;
        int n11 = this.m + (int)(((float)n10 / (f8 /= f9) + (float)this.o) / (f10 * f9) + 0.5f);
        this.j = this.f(this.j, n10, this.h * 2 + n10);
        for (int i8 = 0; i8 < (n8 = this.h) * 2 * (n9 = this.b); ++i8) {
            this.j[n9 * n10 + i8] = 0;
        }
        this.k += n8 * 2;
        this.r();
        if (this.m > n11) {
            this.m = n11;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int n8 = shortBuffer.remaining();
        int n9 = this.b;
        short[] arrs = this.f(this.j, this.k, n8 /= n9);
        this.j = arrs;
        shortBuffer.get(arrs, this.k * this.b, n9 * n8 * 2 / 2);
        this.k += n8;
        this.r();
    }

    public final void u(int n8) {
        if (n8 == 0) {
            return;
        }
        short[] arrs = this.n;
        int n9 = this.b;
        System.arraycopy((Object)arrs, (int)(n8 * n9), (Object)arrs, (int)0, (int)((this.o - n8) * n9));
        this.o -= n8;
    }

    public final void v(int n8) {
        int n9 = this.k - n8;
        short[] arrs = this.j;
        int n10 = this.b;
        System.arraycopy((Object)arrs, (int)(n8 * n10), (Object)arrs, (int)0, (int)(n10 * n9));
        this.k = n9;
    }

    public final int w(short[] arrs, int n8, float f8, int n9) {
        int n10;
        if (f8 >= 2.0f) {
            n10 = (int)((float)n9 / (f8 - 1.0f));
        } else {
            this.r = (int)((float)n9 * (2.0f - f8) / (f8 - 1.0f));
            n10 = n9;
        }
        short[] arrs2 = this.f(this.l, this.m, n10);
        this.l = arrs2;
        e.p(n10, this.b, arrs2, this.m, arrs, n8, arrs, n8 + n9);
        this.m += n10;
        return n10;
    }
}

