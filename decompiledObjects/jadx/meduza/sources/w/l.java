package w;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: k, reason: collision with root package name */
    public static final l f16174k;

    /* renamed from: a, reason: collision with root package name */
    public final float f16175a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16176b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16177c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16178d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16179e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f16180g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16181h;

    /* renamed from: i, reason: collision with root package name */
    public final float f16182i;

    /* renamed from: j, reason: collision with root package name */
    public final float f16183j;

    static {
        float[] fArr = yc.b.f17471d;
        float c10 = (float) ((yc.b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = yc.b.f17469b;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f10 = fArr3[0] * f;
        float f11 = fArr[1];
        float f12 = (fArr3[1] * f11) + f10;
        float f13 = fArr[2];
        float f14 = (fArr3[2] * f13) + f12;
        float[] fArr4 = fArr2[1];
        float f15 = (fArr4[2] * f13) + (fArr4[1] * f11) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f16 = (f13 * fArr5[2]) + (f11 * fArr5[1]) + (f * fArr5[0]);
        float f17 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c10) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f14) * exp) + 1.0f) - exp, (((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp};
        float f18 = 1.0f / ((5.0f * c10) + 1.0f);
        float f19 = f18 * f18 * f18 * f18;
        float f20 = 1.0f - f19;
        float cbrt = (0.1f * f20 * f20 * ((float) Math.cbrt(c10 * 5.0d))) + (f19 * c10);
        float c11 = yc.b.c() / fArr[1];
        double d11 = c11;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f16) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f14) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f15) / 100.0d, 0.42d), pow2};
        float f21 = fArr7[0];
        float f22 = fArr7[1];
        f16174k = new l(c11, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f21 * 400.0f) / (f21 + 27.13f)) * 2.0f) + ((f22 * 400.0f) / (f22 + 27.13f))) * pow, pow, pow, f17, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public l(float f, float f10, float f11, float f12, float f13, float f14, float[] fArr, float f15, float f16, float f17) {
        this.f = f;
        this.f16175a = f10;
        this.f16176b = f11;
        this.f16177c = f12;
        this.f16178d = f13;
        this.f16179e = f14;
        this.f16180g = fArr;
        this.f16181h = f15;
        this.f16182i = f16;
        this.f16183j = f17;
    }
}
