package z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f21586k = k(b.f21560c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    public final float f21587a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21588b;

    /* renamed from: c, reason: collision with root package name */
    public final float f21589c;

    /* renamed from: d, reason: collision with root package name */
    public final float f21590d;

    /* renamed from: e, reason: collision with root package name */
    public final float f21591e;

    /* renamed from: f, reason: collision with root package name */
    public final float f21592f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f21593g;

    /* renamed from: h, reason: collision with root package name */
    public final float f21594h;

    /* renamed from: i, reason: collision with root package name */
    public final float f21595i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21596j;

    public l(float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr, float f13, float f14, float f15) {
        this.f21592f = f7;
        this.f21587a = f8;
        this.f21588b = f9;
        this.f21589c = f10;
        this.f21590d = f11;
        this.f21591e = f12;
        this.f21593g = fArr;
        this.f21594h = f13;
        this.f21595i = f14;
        this.f21596j = f15;
    }

    public static l k(float[] fArr, float f7, float f8, float f9, boolean z7) {
        float[][] fArr2 = b.f21558a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = f11 + (fArr3[1] * f12);
        float f14 = fArr[2];
        float f15 = f13 + (fArr3[2] * f14);
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[0] * f10) + (fArr4[1] * f12) + (fArr4[2] * f14);
        float[] fArr5 = fArr2[2];
        float f17 = (f10 * fArr5[0]) + (f12 * fArr5[1]) + (f14 * fArr5[2]);
        float f18 = (f9 / 10.0f) + 0.8f;
        float d7 = ((double) f18) >= 0.9d ? b.d(0.59f, 0.69f, (f18 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f18 - 0.8f) * 10.0f);
        float exp = z7 ? 1.0f : (1.0f - (((float) Math.exp(((-f7) - 42.0f) / 92.0f)) * 0.2777778f)) * f18;
        double d8 = exp;
        if (d8 > 1.0d) {
            exp = 1.0f;
        } else if (d8 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp};
        float f19 = 1.0f / ((5.0f * f7) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float cbrt = (f20 * f7) + (0.1f * f21 * f21 * ((float) Math.cbrt(f7 * 5.0d)));
        float h7 = b.h(f8) / fArr[1];
        double d9 = h7;
        float sqrt = ((float) Math.sqrt(d9)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d9, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr7[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr7[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[2];
        float[] fArr8 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        return new l(h7, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d7, f18, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public float a() {
        return this.f21587a;
    }

    public float b() {
        return this.f21590d;
    }

    public float c() {
        return this.f21594h;
    }

    public float d() {
        return this.f21595i;
    }

    public float e() {
        return this.f21592f;
    }

    public float f() {
        return this.f21588b;
    }

    public float g() {
        return this.f21591e;
    }

    public float h() {
        return this.f21589c;
    }

    public float[] i() {
        return this.f21593g;
    }

    public float j() {
        return this.f21596j;
    }
}
