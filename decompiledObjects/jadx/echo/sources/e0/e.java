package e0;

import g0.AbstractC1297a;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f13689a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13690b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13691c;

    /* renamed from: d, reason: collision with root package name */
    public final float f13692d;

    /* renamed from: e, reason: collision with root package name */
    public final float f13693e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13694f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13695g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13696h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f13697i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f13698j;

    /* renamed from: k, reason: collision with root package name */
    public int f13699k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f13700l;

    /* renamed from: m, reason: collision with root package name */
    public int f13701m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f13702n;

    /* renamed from: o, reason: collision with root package name */
    public int f13703o;

    /* renamed from: p, reason: collision with root package name */
    public int f13704p;

    /* renamed from: q, reason: collision with root package name */
    public int f13705q;

    /* renamed from: r, reason: collision with root package name */
    public int f13706r;

    /* renamed from: s, reason: collision with root package name */
    public int f13707s;

    /* renamed from: t, reason: collision with root package name */
    public int f13708t;

    /* renamed from: u, reason: collision with root package name */
    public int f13709u;

    /* renamed from: v, reason: collision with root package name */
    public int f13710v;

    public e(int i7, int i8, float f7, float f8, int i9) {
        this.f13689a = i7;
        this.f13690b = i8;
        this.f13691c = f7;
        this.f13692d = f8;
        this.f13693e = i7 / i9;
        this.f13694f = i7 / 400;
        int i10 = i7 / 65;
        this.f13695g = i10;
        int i11 = i10 * 2;
        this.f13696h = i11;
        this.f13697i = new short[i11];
        this.f13698j = new short[i11 * i8];
        this.f13700l = new short[i11 * i8];
        this.f13702n = new short[i11 * i8];
    }

    public static void p(int i7, int i8, short[] sArr, int i9, short[] sArr2, int i10, short[] sArr3, int i11) {
        for (int i12 = 0; i12 < i8; i12++) {
            int i13 = (i9 * i8) + i12;
            int i14 = (i11 * i8) + i12;
            int i15 = (i10 * i8) + i12;
            for (int i16 = 0; i16 < i7; i16++) {
                sArr[i13] = (short) (((sArr2[i15] * (i7 - i16)) + (sArr3[i14] * i16)) / i7);
                i13 += i8;
                i15 += i8;
                i14 += i8;
            }
        }
    }

    public final void a(float f7, int i7) {
        int i8;
        int i9;
        if (this.f13701m == i7) {
            return;
        }
        int i10 = this.f13689a;
        int i11 = (int) (i10 / f7);
        while (true) {
            if (i11 <= 16384 && i10 <= 16384) {
                break;
            }
            i11 /= 2;
            i10 /= 2;
        }
        o(i7);
        int i12 = 0;
        while (true) {
            int i13 = this.f13703o;
            if (i12 >= i13 - 1) {
                u(i13 - 1);
                return;
            }
            while (true) {
                i8 = this.f13704p;
                int i14 = (i8 + 1) * i11;
                i9 = this.f13705q;
                if (i14 <= i9 * i10) {
                    break;
                }
                this.f13700l = f(this.f13700l, this.f13701m, 1);
                int i15 = 0;
                while (true) {
                    int i16 = this.f13690b;
                    if (i15 < i16) {
                        this.f13700l[(this.f13701m * i16) + i15] = n(this.f13702n, (i16 * i12) + i15, i10, i11);
                        i15++;
                    }
                }
                this.f13705q++;
                this.f13701m++;
            }
            int i17 = i8 + 1;
            this.f13704p = i17;
            if (i17 == i10) {
                this.f13704p = 0;
                AbstractC1297a.f(i9 == i11);
                this.f13705q = 0;
            }
            i12++;
        }
    }

    public final void b(float f7) {
        int w7;
        int i7 = this.f13699k;
        if (i7 < this.f13696h) {
            return;
        }
        int i8 = 0;
        do {
            if (this.f13706r > 0) {
                w7 = c(i8);
            } else {
                int g7 = g(this.f13698j, i8);
                w7 = ((double) f7) > 1.0d ? g7 + w(this.f13698j, i8, f7, g7) : m(this.f13698j, i8, f7, g7);
            }
            i8 += w7;
        } while (this.f13696h + i8 <= i7);
        v(i8);
    }

    public final int c(int i7) {
        int min = Math.min(this.f13696h, this.f13706r);
        d(this.f13698j, i7, min);
        this.f13706r -= min;
        return min;
    }

    public final void d(short[] sArr, int i7, int i8) {
        short[] f7 = f(this.f13700l, this.f13701m, i8);
        this.f13700l = f7;
        int i9 = this.f13690b;
        System.arraycopy(sArr, i7 * i9, f7, this.f13701m * i9, i9 * i8);
        this.f13701m += i8;
    }

    public final void e(short[] sArr, int i7, int i8) {
        int i9 = this.f13696h / i8;
        int i10 = this.f13690b;
        int i11 = i8 * i10;
        int i12 = i7 * i10;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 += sArr[(i13 * i11) + i12 + i15];
            }
            this.f13697i[i13] = (short) (i14 / i11);
        }
    }

    public final short[] f(short[] sArr, int i7, int i8) {
        int length = sArr.length;
        int i9 = this.f13690b;
        int i10 = length / i9;
        return i7 + i8 <= i10 ? sArr : Arrays.copyOf(sArr, (((i10 * 3) / 2) + i8) * i9);
    }

    public final int g(short[] sArr, int i7) {
        int i8;
        int i9 = this.f13689a;
        int i10 = i9 > 4000 ? i9 / 4000 : 1;
        if (this.f13690b == 1 && i10 == 1) {
            i8 = h(sArr, i7, this.f13694f, this.f13695g);
        } else {
            e(sArr, i7, i10);
            int h7 = h(this.f13697i, 0, this.f13694f / i10, this.f13695g / i10);
            if (i10 != 1) {
                int i11 = h7 * i10;
                int i12 = i10 * 4;
                int i13 = i11 - i12;
                int i14 = i11 + i12;
                int i15 = this.f13694f;
                if (i13 < i15) {
                    i13 = i15;
                }
                int i16 = this.f13695g;
                if (i14 > i16) {
                    i14 = i16;
                }
                if (this.f13690b == 1) {
                    i8 = h(sArr, i7, i13, i14);
                } else {
                    e(sArr, i7, 1);
                    i8 = h(this.f13697i, 0, i13, i14);
                }
            } else {
                i8 = h7;
            }
        }
        int i17 = q(this.f13709u, this.f13710v) ? this.f13707s : i8;
        this.f13708t = this.f13709u;
        this.f13707s = i8;
        return i17;
    }

    public final int h(short[] sArr, int i7, int i8, int i9) {
        int i10 = i7 * this.f13690b;
        int i11 = 255;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i8 <= i9) {
            int i15 = 0;
            for (int i16 = 0; i16 < i8; i16++) {
                i15 += Math.abs(sArr[i10 + i16] - sArr[(i10 + i8) + i16]);
            }
            if (i15 * i13 < i12 * i8) {
                i13 = i8;
                i12 = i15;
            }
            if (i15 * i11 > i14 * i8) {
                i11 = i8;
                i14 = i15;
            }
            i8++;
        }
        this.f13709u = i12 / i13;
        this.f13710v = i14 / i11;
        return i13;
    }

    public void i() {
        this.f13699k = 0;
        this.f13701m = 0;
        this.f13703o = 0;
        this.f13704p = 0;
        this.f13705q = 0;
        this.f13706r = 0;
        this.f13707s = 0;
        this.f13708t = 0;
        this.f13709u = 0;
        this.f13710v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f13690b, this.f13701m);
        shortBuffer.put(this.f13700l, 0, this.f13690b * min);
        int i7 = this.f13701m - min;
        this.f13701m = i7;
        short[] sArr = this.f13700l;
        int i8 = this.f13690b;
        System.arraycopy(sArr, min * i8, sArr, 0, i7 * i8);
    }

    public int k() {
        return this.f13701m * this.f13690b * 2;
    }

    public int l() {
        return this.f13699k * this.f13690b * 2;
    }

    public final int m(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 < 0.5f) {
            i9 = (int) ((i8 * f7) / (1.0f - f7));
        } else {
            this.f13706r = (int) ((i8 * ((2.0f * f7) - 1.0f)) / (1.0f - f7));
            i9 = i8;
        }
        int i10 = i8 + i9;
        short[] f8 = f(this.f13700l, this.f13701m, i10);
        this.f13700l = f8;
        int i11 = this.f13690b;
        System.arraycopy(sArr, i7 * i11, f8, this.f13701m * i11, i11 * i8);
        p(i9, this.f13690b, this.f13700l, this.f13701m + i8, sArr, i7 + i8, sArr, i7);
        this.f13701m += i10;
        return i9;
    }

    public final short n(short[] sArr, int i7, int i8, int i9) {
        short s7 = sArr[i7];
        short s8 = sArr[i7 + this.f13690b];
        int i10 = this.f13705q * i8;
        int i11 = this.f13704p;
        int i12 = i11 * i9;
        int i13 = (i11 + 1) * i9;
        int i14 = i13 - i10;
        int i15 = i13 - i12;
        return (short) (((s7 * i14) + ((i15 - i14) * s8)) / i15);
    }

    public final void o(int i7) {
        int i8 = this.f13701m - i7;
        short[] f7 = f(this.f13702n, this.f13703o, i8);
        this.f13702n = f7;
        short[] sArr = this.f13700l;
        int i9 = this.f13690b;
        System.arraycopy(sArr, i7 * i9, f7, this.f13703o * i9, i9 * i8);
        this.f13701m = i7;
        this.f13703o += i8;
    }

    public final boolean q(int i7, int i8) {
        return i7 != 0 && this.f13707s != 0 && i8 <= i7 * 3 && i7 * 2 > this.f13708t * 3;
    }

    public final void r() {
        int i7 = this.f13701m;
        float f7 = this.f13691c;
        float f8 = this.f13692d;
        float f9 = f7 / f8;
        float f10 = this.f13693e * f8;
        double d7 = f9;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            b(f9);
        } else {
            d(this.f13698j, 0, this.f13699k);
            this.f13699k = 0;
        }
        if (f10 != 1.0f) {
            a(f10, i7);
        }
    }

    public void s() {
        int i7;
        int i8 = this.f13699k;
        float f7 = this.f13691c;
        float f8 = this.f13692d;
        int i9 = this.f13701m + ((int) ((((i8 / (f7 / f8)) + this.f13703o) / (this.f13693e * f8)) + 0.5f));
        this.f13698j = f(this.f13698j, i8, (this.f13696h * 2) + i8);
        int i10 = 0;
        while (true) {
            i7 = this.f13696h;
            int i11 = this.f13690b;
            if (i10 >= i7 * 2 * i11) {
                break;
            }
            this.f13698j[(i11 * i8) + i10] = 0;
            i10++;
        }
        this.f13699k += i7 * 2;
        r();
        if (this.f13701m > i9) {
            this.f13701m = i9;
        }
        this.f13699k = 0;
        this.f13706r = 0;
        this.f13703o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i7 = this.f13690b;
        int i8 = remaining / i7;
        short[] f7 = f(this.f13698j, this.f13699k, i8);
        this.f13698j = f7;
        shortBuffer.get(f7, this.f13699k * this.f13690b, ((i7 * i8) * 2) / 2);
        this.f13699k += i8;
        r();
    }

    public final void u(int i7) {
        if (i7 == 0) {
            return;
        }
        short[] sArr = this.f13702n;
        int i8 = this.f13690b;
        System.arraycopy(sArr, i7 * i8, sArr, 0, (this.f13703o - i7) * i8);
        this.f13703o -= i7;
    }

    public final void v(int i7) {
        int i8 = this.f13699k - i7;
        short[] sArr = this.f13698j;
        int i9 = this.f13690b;
        System.arraycopy(sArr, i7 * i9, sArr, 0, i9 * i8);
        this.f13699k = i8;
    }

    public final int w(short[] sArr, int i7, float f7, int i8) {
        int i9;
        if (f7 >= 2.0f) {
            i9 = (int) (i8 / (f7 - 1.0f));
        } else {
            this.f13706r = (int) ((i8 * (2.0f - f7)) / (f7 - 1.0f));
            i9 = i8;
        }
        short[] f8 = f(this.f13700l, this.f13701m, i9);
        this.f13700l = f8;
        p(i9, this.f13690b, f8, this.f13701m, sArr, i7, sArr, i7 + i8);
        this.f13701m += i9;
        return i9;
    }
}
