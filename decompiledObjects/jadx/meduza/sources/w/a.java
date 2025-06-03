package w;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f16138a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16139b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16140c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16141d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16142e;
    public final float f;

    public a(float f, float f10, float f11, float f12, float f13, float f14) {
        this.f16138a = f;
        this.f16139b = f10;
        this.f16140c = f11;
        this.f16141d = f12;
        this.f16142e = f13;
        this.f = f14;
    }

    public static a a(int i10) {
        l lVar = l.f16174k;
        float b10 = yc.b.b(Color.red(i10));
        float b11 = yc.b.b(Color.green(i10));
        float b12 = yc.b.b(Color.blue(i10));
        float[][] fArr = yc.b.f17472e;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * b12) + (fArr2[1] * b11) + (fArr2[0] * b10);
        float[] fArr3 = fArr[1];
        float f10 = (fArr3[2] * b12) + (fArr3[1] * b11) + (fArr3[0] * b10);
        float[] fArr4 = fArr[2];
        float f11 = (b12 * fArr4[2]) + (b11 * fArr4[1]) + (b10 * fArr4[0]);
        float[][] fArr5 = yc.b.f17469b;
        float[] fArr6 = fArr5[0];
        float f12 = (fArr6[2] * f11) + (fArr6[1] * f10) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f13 = (fArr7[2] * f11) + (fArr7[1] * f10) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f14 = (f11 * fArr8[2]) + (f10 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = lVar.f16180g;
        float f15 = fArr9[0] * f12;
        float f16 = fArr9[1] * f13;
        float f17 = fArr9[2] * f14;
        float pow = (float) Math.pow((Math.abs(f15) * lVar.f16181h) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f16) * lVar.f16181h) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f17) * lVar.f16181h) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f18 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d10)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float pow4 = ((float) Math.pow((f22 * lVar.f16176b) / lVar.f16175a, lVar.f16178d * lVar.f16183j)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f23) < 20.14d ? 360.0f + f23 : f23) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.f16179e) * lVar.f16177c) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d));
        float f25 = lVar.f16182i * sqrt;
        Math.sqrt((r2 * lVar.f16178d) / (lVar.f16175a + 4.0f));
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f25 * 0.0228f) + 1.0f)) * 43.85965f;
        double d11 = f24;
        return new a(f23, sqrt, pow4, f26, ((float) Math.cos(d11)) * log, log * ((float) Math.sin(d11)));
    }

    public static a b(float f, float f10, float f11) {
        l lVar = l.f16174k;
        float f12 = lVar.f16178d;
        Math.sqrt(f / 100.0d);
        float f13 = lVar.f16182i * f10;
        Math.sqrt(((f10 / ((float) Math.sqrt(r1))) * lVar.f16178d) / (lVar.f16175a + 4.0f));
        float f14 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f13 * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f11) / 180.0f;
        return new a(f11, f10, f, f14, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    public final int c(l lVar) {
        float f;
        float f10 = this.f16139b;
        if (f10 != 0.0d) {
            double d10 = this.f16140c;
            if (d10 != 0.0d) {
                f = f10 / ((float) Math.sqrt(d10 / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, lVar.f), 0.73d), 1.1111111111111112d);
                double d11 = (this.f16138a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d11) + 3.8d)) * 0.25f;
                float pow2 = lVar.f16175a * ((float) Math.pow(this.f16140c / 100.0d, (1.0d / lVar.f16178d) / lVar.f16183j));
                float f11 = cos * 3846.1538f * lVar.f16179e * lVar.f16177c;
                float f12 = pow2 / lVar.f16176b;
                float sin = (float) Math.sin(d11);
                float cos2 = (float) Math.cos(d11);
                float f13 = (((0.305f + f12) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f11 * 23.0f)));
                float f14 = cos2 * f13;
                float f15 = f13 * sin;
                float f16 = f12 * 460.0f;
                float f17 = ((288.0f * f15) + ((451.0f * f14) + f16)) / 1403.0f;
                float f18 = ((f16 - (891.0f * f14)) - (261.0f * f15)) / 1403.0f;
                float f19 = ((f16 - (f14 * 220.0f)) - (f15 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / lVar.f16181h) * Math.signum(f17) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f17) * 27.13d) / (400.0d - Math.abs(f17))), 2.380952380952381d));
                float signum2 = (100.0f / lVar.f16181h) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float signum3 = (100.0f / lVar.f16181h) * Math.signum(f19) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float[] fArr = lVar.f16180g;
                float f20 = signum / fArr[0];
                float f21 = signum2 / fArr[1];
                float f22 = signum3 / fArr[2];
                float[][] fArr2 = yc.b.f17470c;
                float[] fArr3 = fArr2[0];
                float f23 = (fArr3[2] * f22) + (fArr3[1] * f21) + (fArr3[0] * f20);
                float[] fArr4 = fArr2[1];
                float f24 = (fArr4[2] * f22) + (fArr4[1] * f21) + (fArr4[0] * f20);
                float[] fArr5 = fArr2[2];
                return x.a.a(f23, f24, (f22 * fArr5[2]) + (f21 * fArr5[1]) + (f20 * fArr5[0]));
            }
        }
        f = 0.0f;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, lVar.f), 0.73d), 1.1111111111111112d);
        double d112 = (this.f16138a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d112) + 3.8d)) * 0.25f;
        float pow22 = lVar.f16175a * ((float) Math.pow(this.f16140c / 100.0d, (1.0d / lVar.f16178d) / lVar.f16183j));
        float f112 = cos3 * 3846.1538f * lVar.f16179e * lVar.f16177c;
        float f122 = pow22 / lVar.f16176b;
        float sin2 = (float) Math.sin(d112);
        float cos22 = (float) Math.cos(d112);
        float f132 = (((0.305f + f122) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f112 * 23.0f)));
        float f142 = cos22 * f132;
        float f152 = f132 * sin2;
        float f162 = f122 * 460.0f;
        float f172 = ((288.0f * f152) + ((451.0f * f142) + f162)) / 1403.0f;
        float f182 = ((f162 - (891.0f * f142)) - (261.0f * f152)) / 1403.0f;
        float f192 = ((f162 - (f142 * 220.0f)) - (f152 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / lVar.f16181h) * Math.signum(f172) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f172) * 27.13d) / (400.0d - Math.abs(f172))), 2.380952380952381d));
        float signum22 = (100.0f / lVar.f16181h) * Math.signum(f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float signum32 = (100.0f / lVar.f16181h) * Math.signum(f192) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float[] fArr6 = lVar.f16180g;
        float f202 = signum4 / fArr6[0];
        float f212 = signum22 / fArr6[1];
        float f222 = signum32 / fArr6[2];
        float[][] fArr22 = yc.b.f17470c;
        float[] fArr32 = fArr22[0];
        float f232 = (fArr32[2] * f222) + (fArr32[1] * f212) + (fArr32[0] * f202);
        float[] fArr42 = fArr22[1];
        float f242 = (fArr42[2] * f222) + (fArr42[1] * f212) + (fArr42[0] * f202);
        float[] fArr52 = fArr22[2];
        return x.a.a(f232, f242, (f222 * fArr52[2]) + (f212 * fArr52[1]) + (f202 * fArr52[0]));
    }
}
