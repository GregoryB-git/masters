package z;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2281a {

    /* renamed from: a, reason: collision with root package name */
    public final float f21549a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21550b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21551c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21552d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21553e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21554f;

    /* renamed from: g, reason: collision with root package name */
    public final float f21555g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21556h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21557i;

    public C2281a(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f21549a = f7;
        this.f21550b = f8;
        this.f21551c = f9;
        this.f21552d = f10;
        this.f21553e = f11;
        this.f21554f = f12;
        this.f21555g = f13;
        this.f21556h = f14;
        this.f21557i = f15;
    }

    public static C2281a b(float f7, float f8, float f9) {
        float f10 = 100.0f;
        float f11 = 1000.0f;
        float f12 = 0.0f;
        C2281a c2281a = null;
        float f13 = 1000.0f;
        while (Math.abs(f12 - f10) > 0.01f) {
            float f14 = ((f10 - f12) / 2.0f) + f12;
            int p7 = e(f14, f8, f7).p();
            float b7 = b.b(p7);
            float abs = Math.abs(f9 - b7);
            if (abs < 0.2f) {
                C2281a c7 = c(p7);
                float a7 = c7.a(e(c7.k(), c7.i(), f7));
                if (a7 <= 1.0f) {
                    c2281a = c7;
                    f11 = abs;
                    f13 = a7;
                }
            }
            if (f11 == 0.0f && f13 == 0.0f) {
                break;
            }
            if (b7 < f9) {
                f12 = f14;
            } else {
                f10 = f14;
            }
        }
        return c2281a;
    }

    public static C2281a c(int i7) {
        return d(i7, l.f21586k);
    }

    public static C2281a d(int i7, l lVar) {
        float[] f7 = b.f(i7);
        float[][] fArr = b.f21558a;
        float f8 = f7[0];
        float[] fArr2 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = f7[1];
        float f11 = f9 + (fArr2[1] * f10);
        float f12 = f7[2];
        float f13 = f11 + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f8) + (fArr3[1] * f10) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        float f15 = (f8 * fArr4[0]) + (f10 * fArr4[1]) + (f12 * fArr4[2]);
        float f16 = lVar.i()[0] * f13;
        float f17 = lVar.i()[1] * f14;
        float f18 = lVar.i()[2] * f15;
        float pow = (float) Math.pow((lVar.c() * Math.abs(f16)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((lVar.c() * Math.abs(f17)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((lVar.c() * Math.abs(f18)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d7 = signum3;
        float f19 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d7)) / 11.0f;
        float f20 = ((float) ((signum + signum2) - (d7 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f20, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = atan2;
        float f25 = (3.1415927f * f24) / 180.0f;
        float pow4 = ((float) Math.pow((f23 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        float d8 = lVar.d() * (4.0f / lVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (lVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f24) < 20.14d ? 360.0f + f24 : f24) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f19 * f19) + (f20 * f20)))) / (f22 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d9 = pow5 * lVar.d();
        float sqrt = ((float) Math.sqrt((r3 * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d9) + 1.0f)) * 43.85965f;
        double d10 = f25;
        return new C2281a(f24, pow5, pow4, d8, d9, sqrt, f26, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public static C2281a e(float f7, float f8, float f9) {
        return f(f7, f8, f9, l.f21586k);
    }

    public static C2281a f(float f7, float f8, float f9, l lVar) {
        float b7 = (4.0f / lVar.b()) * ((float) Math.sqrt(f7 / 100.0d)) * (lVar.a() + 4.0f) * lVar.d();
        float d7 = f8 * lVar.d();
        float sqrt = ((float) Math.sqrt(((f8 / ((float) Math.sqrt(r4))) * lVar.b()) / (lVar.a() + 4.0f))) * 50.0f;
        float f10 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((d7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f9) / 180.0f;
        return new C2281a(f9, f8, f7, b7, d7, sqrt, f10, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    public static int m(float f7, float f8, float f9) {
        return n(f7, f8, f9, l.f21586k);
    }

    public static int n(float f7, float f8, float f9, l lVar) {
        if (f8 < 1.0d || Math.round(f9) <= 0.0d || Math.round(f9) >= 100.0d) {
            return b.a(f9);
        }
        float min = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        C2281a c2281a = null;
        boolean z7 = true;
        float f10 = 0.0f;
        float f11 = f8;
        while (Math.abs(f10 - f8) >= 0.4f) {
            C2281a b7 = b(min, f11, f9);
            if (!z7) {
                if (b7 == null) {
                    f8 = f11;
                } else {
                    f10 = f11;
                    c2281a = b7;
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
            } else {
                if (b7 != null) {
                    return b7.o(lVar);
                }
                f11 = ((f8 - f10) / 2.0f) + f10;
                z7 = false;
            }
        }
        return c2281a == null ? b.a(f9) : c2281a.o(lVar);
    }

    public float a(C2281a c2281a) {
        float l7 = l() - c2281a.l();
        float g7 = g() - c2281a.g();
        float h7 = h() - c2281a.h();
        return (float) (Math.pow(Math.sqrt((l7 * l7) + (g7 * g7) + (h7 * h7)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.f21556h;
    }

    public float h() {
        return this.f21557i;
    }

    public float i() {
        return this.f21550b;
    }

    public float j() {
        return this.f21549a;
    }

    public float k() {
        return this.f21551c;
    }

    public float l() {
        return this.f21555g;
    }

    public int o(l lVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double j7 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j7) + 3.8d)) * 0.25f;
        float a7 = lVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float g7 = cos * 3846.1538f * lVar.g() * lVar.h();
        float f7 = a7 / lVar.f();
        float sin = (float) Math.sin(j7);
        float cos2 = (float) Math.cos(j7);
        float f8 = (((0.305f + f7) * 23.0f) * pow) / (((g7 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f9 = cos2 * f8;
        float f10 = f8 * sin;
        float f11 = f7 * 460.0f;
        float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
        float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
        float signum = Math.signum(f12) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float signum2 = Math.signum(f13) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float signum3 = Math.signum(((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f) * (100.0f / lVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f14 = signum / lVar.i()[0];
        float f15 = signum2 / lVar.i()[1];
        float f16 = signum3 / lVar.i()[2];
        float[][] fArr = b.f21559b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[0] * f14) + (fArr2[1] * f15) + (fArr2[2] * f16);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr[2];
        return A.a.a(f17, f18, (f14 * fArr4[0]) + (f15 * fArr4[1]) + (f16 * fArr4[2]));
    }

    public int p() {
        return o(l.f21586k);
    }
}
