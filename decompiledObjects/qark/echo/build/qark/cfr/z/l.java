/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package z;

import z.b;

public final class l {
    public static final l k = l.k(b.c, (float)((double)b.h(50.0f) * 63.66197723675813 / 100.0), 50.0f, 2.0f, false);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;

    public l(float f8, float f9, float f10, float f11, float f12, float f13, float[] arrf, float f14, float f15, float f16) {
        this.f = f8;
        this.a = f9;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
        this.g = arrf;
        this.h = f14;
        this.i = f15;
        this.j = f16;
    }

    public static l k(float[] arrf, float f8, float f9, float f10, boolean bl) {
        float[][] arrf2 = b.a;
        float f11 = arrf[0];
        float[] arrf3 = arrf2[0];
        float f12 = arrf3[0];
        float f13 = arrf[1];
        float f14 = arrf3[1];
        float f15 = arrf[2];
        f14 = f12 * f11 + f14 * f13 + arrf3[2] * f15;
        arrf3 = arrf2[1];
        f12 = arrf3[0] * f11 + arrf3[1] * f13 + arrf3[2] * f15;
        arrf2 = arrf2[2];
        f15 = f11 * arrf2[0] + f13 * arrf2[1] + f15 * arrf2[2];
        f13 = f10 / 10.0f + 0.8f;
        f11 = (double)f13 >= 0.9 ? b.d(0.59f, 0.69f, (f13 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f13 - 0.8f) * 10.0f);
        f10 = bl ? 1.0f : (1.0f - (float)Math.exp((double)((- f8 - 42.0f) / 92.0f)) * 0.2777778f) * f13;
        double d8 = f10;
        if (d8 > 1.0) {
            f10 = 1.0f;
        } else if (d8 < 0.0) {
            f10 = 0.0f;
        }
        float f16 = 100.0f / f14;
        float f17 = 100.0f / f12;
        float f18 = 100.0f / f15;
        arrf2 = new float[]{f16 * f10 + 1.0f - f10, f17 * f10 + 1.0f - f10, f18 * f10 + 1.0f - f10};
        f10 = 1.0f / (5.0f * f8 + 1.0f);
        f10 = f10 * f10 * f10 * f10;
        f16 = 1.0f - f10;
        f8 = f10 * f8 + 0.1f * f16 * f16 * (float)Math.cbrt((double)((double)f8 * 5.0));
        f9 = b.h(f9) / arrf[1];
        d8 = f9;
        f10 = (float)Math.sqrt((double)d8);
        f16 = 0.725f / (float)Math.pow((double)d8, (double)0.2);
        f14 = (float)Math.pow((double)((double)(arrf2[0] * f8 * f14) / 100.0), (double)0.42);
        f12 = (float)Math.pow((double)((double)(arrf2[1] * f8 * f12) / 100.0), (double)0.42);
        f15 = (float)Math.pow((double)((double)(arrf2[2] * f8 * f15) / 100.0), (double)0.42);
        arrf = new float[]{f14, f12, f15};
        f12 = arrf[0];
        f12 = f12 * 400.0f / (f12 + 27.13f);
        f14 = arrf[1];
        f14 = f14 * 400.0f / (f14 + 27.13f);
        f15 = arrf[2];
        f15 = 400.0f * f15 / (f15 + 27.13f);
        arrf = new float[]{f12, f14, f15};
        return new l(f9, (arrf[0] * 2.0f + arrf[1] + arrf[2] * 0.05f) * f16, f16, f16, f11, f13, (float[])arrf2, f8, (float)Math.pow((double)f8, (double)0.25), f10 + 1.48f);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.h;
    }

    public float d() {
        return this.i;
    }

    public float e() {
        return this.f;
    }

    public float f() {
        return this.b;
    }

    public float g() {
        return this.e;
    }

    public float h() {
        return this.c;
    }

    public float[] i() {
        return this.g;
    }

    public float j() {
        return this.j;
    }
}

