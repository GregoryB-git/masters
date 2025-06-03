/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 */
package z;

import z.b;
import z.l;

public class a {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public a(float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.a = f8;
        this.b = f9;
        this.c = f10;
        this.d = f11;
        this.e = f12;
        this.f = f13;
        this.g = f14;
        this.h = f15;
        this.i = f16;
    }

    public static a b(float f8, float f9, float f10) {
        float f11 = 100.0f;
        float f12 = 1000.0f;
        float f13 = 0.0f;
        a a8 = null;
        float f14 = 1000.0f;
        while (Math.abs((float)(f13 - f11)) > 0.01f) {
            float f15 = (f11 - f13) / 2.0f + f13;
            int n8 = a.e(f15, f9, f8).p();
            float f16 = b.b(n8);
            float f17 = Math.abs((float)(f10 - f16));
            float f18 = f12;
            float f19 = f14;
            a a9 = a8;
            if (f17 < 0.2f) {
                a a10 = a.c(n8);
                float f20 = a10.a(a.e(a10.k(), a10.i(), f8));
                f18 = f12;
                f19 = f14;
                a9 = a8;
                if (f20 <= 1.0f) {
                    a9 = a10;
                    f18 = f17;
                    f19 = f20;
                }
            }
            if (f18 == 0.0f && f19 == 0.0f) {
                return a9;
            }
            if (f16 < f10) {
                f13 = f15;
                f12 = f18;
                f14 = f19;
                a8 = a9;
                continue;
            }
            f11 = f15;
            f12 = f18;
            f14 = f19;
            a8 = a9;
        }
        return a8;
    }

    public static a c(int n8) {
        return a.d(n8, l.k);
    }

    public static a d(int n8, l l8) {
        float[] arrf = b.f(n8);
        float[][] arrf2 = b.a;
        float f8 = arrf[0];
        float[] arrf3 = arrf2[0];
        float f9 = arrf3[0];
        float f10 = arrf[1];
        float f11 = arrf3[1];
        float f12 = arrf[2];
        float f13 = arrf3[2];
        arrf = arrf2[1];
        float f14 = arrf[0];
        float f15 = arrf[1];
        float f16 = arrf[2];
        arrf2 = arrf2[2];
        Object object = arrf2[0];
        Object object2 = arrf2[1];
        Object object3 = arrf2[2];
        f9 = l8.i()[0] * (f9 * f8 + f11 * f10 + f13 * f12);
        f14 = l8.i()[1] * (f14 * f8 + f15 * f10 + f16 * f12);
        f8 = l8.i()[2] * (f8 * object + f10 * object2 + f12 * object3);
        object = (float)Math.pow((double)((double)(l8.c() * Math.abs((float)f9)) / 100.0), (double)0.42);
        f12 = (float)Math.pow((double)((double)(l8.c() * Math.abs((float)f14)) / 100.0), (double)0.42);
        f10 = (float)Math.pow((double)((double)(l8.c() * Math.abs((float)f8)) / 100.0), (double)0.42);
        f9 = Math.signum((float)f9) * 400.0f * object / (object + 27.13f);
        object = Math.signum((float)f14) * 400.0f * f12 / (f12 + 27.13f);
        f8 = Math.signum((float)f8) * 400.0f * f10 / (f10 + 27.13f);
        double d8 = f9;
        double d9 = (double)object;
        double d10 = f8;
        f10 = (float)(d8 * 11.0 + d9 * -12.0 + d10) / 11.0f;
        f12 = (float)((double)(f9 + object) - d10 * 2.0) / 9.0f;
        object2 = (f9 * 20.0f + (object *= 20.0f) + 21.0f * f8) / 20.0f;
        object3 = (f9 * 40.0f + object + f8) / 20.0f;
        f8 = (float)Math.atan2((double)f12, (double)f10) * 180.0f / 3.1415927f;
        if (f8 < 0.0f) {
            f9 = f8 + 360.0f;
        } else {
            f9 = f8;
            if (f8 >= 360.0f) {
                f9 = f8 - 360.0f;
            }
        }
        object = 3.1415927f * f9 / 180.0f;
        object3 = (float)Math.pow((double)((double)(object3 * l8.f() / l8.a())), (double)(l8.b() * l8.j())) * 100.0f;
        f14 = 4.0f / l8.b();
        f15 = (float)Math.sqrt((double)((double)(object3 / 100.0f)));
        f16 = l8.a();
        f11 = l8.d();
        f8 = (double)f9 < 20.14 ? 360.0f + f9 : f9;
        f8 = (float)(Math.cos((double)((double)f8 * 3.141592653589793 / 180.0 + 2.0)) + 3.8) * 0.25f * 3846.1538f * l8.g() * l8.h() * (float)Math.sqrt((double)(f10 * f10 + f12 * f12)) / (object2 + 0.305f);
        f12 = (float)Math.pow((double)(1.64 - Math.pow((double)0.29, (double)l8.e())), (double)0.73) * (float)Math.pow((double)f8, (double)0.9);
        f8 = f12 * (float)Math.sqrt((double)((double)object3 / 100.0));
        f10 = f8 * l8.d();
        f12 = (float)Math.sqrt((double)(f12 * l8.b() / (l8.a() + 4.0f)));
        object2 = 1.7f * object3 / (0.007f * object3 + 1.0f);
        f13 = (float)Math.log((double)(0.0228f * f10 + 1.0f)) * 43.85965f;
        d8 = (double)object;
        return new a(f9, f8, (float)object3, f11 * (f14 * f15 * (f16 + 4.0f)), f10, f12 * 50.0f, (float)object2, f13 * (float)Math.cos((double)d8), f13 * (float)Math.sin((double)d8));
    }

    public static a e(float f8, float f9, float f10) {
        return a.f(f8, f9, f10, l.k);
    }

    public static a f(float f8, float f9, float f10, l l8) {
        float f11 = 4.0f / l8.b();
        double d8 = (double)f8 / 100.0;
        float f12 = (float)Math.sqrt((double)d8);
        float f13 = l8.a();
        float f14 = l8.d();
        float f15 = f9 * l8.d();
        float f16 = (float)Math.sqrt((double)(f9 / (float)Math.sqrt((double)d8) * l8.b() / (l8.a() + 4.0f)));
        float f17 = 3.1415927f * f10 / 180.0f;
        float f18 = 1.7f * f8 / (0.007f * f8 + 1.0f);
        float f19 = (float)Math.log((double)((double)f15 * 0.0228 + 1.0)) * 43.85965f;
        d8 = f17;
        return new a(f10, f9, f8, f11 * f12 * (f13 + 4.0f) * f14, f15, f16 * 50.0f, f18, f19 * (float)Math.cos((double)d8), f19 * (float)Math.sin((double)d8));
    }

    public static int m(float f8, float f9, float f10) {
        return a.n(f8, f9, f10, l.k);
    }

    public static int n(float f8, float f9, float f10, l l8) {
        if ((double)f9 >= 1.0 && (double)Math.round((float)f10) > 0.0 && (double)Math.round((float)f10) < 100.0) {
            float f11 = f8 < 0.0f ? 0.0f : Math.min((float)360.0f, (float)f8);
            a a8 = null;
            boolean bl = true;
            float f12 = 0.0f;
            f8 = f9;
            float f13 = f9;
            f9 = f12;
            while (Math.abs((float)(f9 - f13)) >= 0.4f) {
                a a9 = a.b(f11, f8, f10);
                if (bl) {
                    if (a9 != null) {
                        return a9.o(l8);
                    }
                    f8 = (f13 - f9) / 2.0f + f9;
                    bl = false;
                    continue;
                }
                if (a9 == null) {
                    f13 = f8;
                } else {
                    a8 = a9;
                    f9 = f8;
                }
                f8 = (f13 - f9) / 2.0f + f9;
            }
            if (a8 == null) {
                return b.a(f10);
            }
            return a8.o(l8);
        }
        return b.a(f10);
    }

    public float a(a a8) {
        float f8 = this.l() - a8.l();
        float f9 = this.g() - a8.g();
        float f10 = this.h() - a8.h();
        return (float)(Math.pow((double)Math.sqrt((double)(f8 * f8 + f9 * f9 + f10 * f10)), (double)0.63) * 1.41);
    }

    public float g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public float i() {
        return this.b;
    }

    public float j() {
        return this.a;
    }

    public float k() {
        return this.c;
    }

    public float l() {
        return this.g;
    }

    public int o(l arrf) {
        float f8 = (double)this.i() != 0.0 && (double)this.k() != 0.0 ? this.i() / (float)Math.sqrt((double)((double)this.k() / 100.0)) : 0.0f;
        float f9 = (float)Math.pow((double)((double)f8 / Math.pow((double)(1.64 - Math.pow((double)0.29, (double)arrf.e())), (double)0.73)), (double)1.1111111111111112);
        double d8 = this.j() * 3.1415927f / 180.0f;
        float f10 = (float)(Math.cos((double)(2.0 + d8)) + 3.8);
        f8 = arrf.a();
        float f11 = (float)Math.pow((double)((double)this.k() / 100.0), (double)(1.0 / (double)arrf.b() / (double)arrf.j()));
        float f12 = arrf.g();
        float f13 = arrf.h();
        f8 = f8 * f11 / arrf.f();
        f11 = (float)Math.sin((double)d8);
        float f14 = (float)Math.cos((double)d8);
        f10 = (0.305f + f8) * 23.0f * f9 / (f10 * 0.25f * 3846.1538f * f12 * f13 * 23.0f + 11.0f * f9 * f14 + f9 * 108.0f * f11);
        f9 = f14 * f10;
        f13 = f8 * 460.0f;
        f8 = (451.0f * f9 + f13 + 288.0f * (f10 *= f11)) / 1403.0f;
        f12 = (f13 - 891.0f * f9 - 261.0f * f10) / 1403.0f;
        f11 = (f13 - f9 * 220.0f - f10 * 6300.0f) / 1403.0f;
        f10 = (float)Math.max((double)0.0, (double)((double)Math.abs((float)f8) * 27.13 / (400.0 - (double)Math.abs((float)f8))));
        f8 = Math.signum((float)f8);
        f9 = 100.0f / arrf.c();
        f10 = (float)Math.pow((double)f10, (double)2.380952380952381);
        f14 = (float)Math.max((double)0.0, (double)((double)Math.abs((float)f12) * 27.13 / (400.0 - (double)Math.abs((float)f12))));
        f12 = Math.signum((float)f12);
        f13 = 100.0f / arrf.c();
        f14 = (float)Math.pow((double)f14, (double)2.380952380952381);
        float f15 = (float)Math.max((double)0.0, (double)((double)Math.abs((float)f11) * 27.13 / (400.0 - (double)Math.abs((float)f11))));
        f11 = Math.signum((float)f11);
        float f16 = 100.0f / arrf.c();
        f15 = (float)Math.pow((double)f15, (double)2.380952380952381);
        f8 = f8 * f9 * f10 / arrf.i()[0];
        f9 = f12 * f13 * f14 / arrf.i()[1];
        f10 = f11 * f16 * f15 / arrf.i()[2];
        arrf = b.b;
        float[] arrf2 = arrf[0];
        f12 = arrf2[0];
        f13 = arrf2[1];
        f11 = arrf2[2];
        arrf2 = arrf[1];
        f14 = arrf2[0];
        f16 = arrf2[1];
        f15 = arrf2[2];
        arrf = arrf[2];
        float[] arrf3 = arrf[0];
        float[] arrf4 = arrf[1];
        float[] arrf5 = arrf[2];
        return A.a.a(f12 * f8 + f13 * f9 + f11 * f10, f14 * f8 + f16 * f9 + f15 * f10, f8 * arrf3 + f9 * arrf4 + f10 * arrf5);
    }

    public int p() {
        return this.o(l.k);
    }
}

